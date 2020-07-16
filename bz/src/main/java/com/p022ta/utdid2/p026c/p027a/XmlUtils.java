package com.p022ta.utdid2.p026c.p027a;

import android.util.Xml;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.UByte;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* renamed from: com.ta.utdid2.c.a.e */
class XmlUtils {
    /* renamed from: a */
    public static final void m729a(Map map, OutputStream outputStream) throws XmlPullParserException, IOException {
        FastXmlSerializer aVar = new FastXmlSerializer();
        aVar.setOutput(outputStream, "utf-8");
        aVar.startDocument((String) null, true);
        aVar.setFeature("http://xmlpull.org/v1/doc/features.html#indent-output", true);
        m730a(map, (String) null, (XmlSerializer) aVar);
        aVar.endDocument();
    }

    /* renamed from: a */
    public static final void m730a(Map map, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (map == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "map");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        for (Map.Entry entry : map.entrySet()) {
            m727a(entry.getValue(), (String) entry.getKey(), xmlSerializer);
        }
        xmlSerializer.endTag((String) null, "map");
    }

    /* renamed from: a */
    public static final void m728a(List list, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (list == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "list");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m727a(list.get(i), (String) null, xmlSerializer);
        }
        xmlSerializer.endTag((String) null, "list");
    }

    /* renamed from: a */
    public static final void m731a(byte[] bArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (bArr == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "byte-array");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        xmlSerializer.attribute((String) null, "num", Integer.toString(r8));
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b >> 4;
            sb.append(i >= 10 ? (i + 97) - 10 : i + 48);
            byte b2 = b & UByte.MAX_VALUE;
            sb.append(b2 >= 10 ? (b2 + 97) - 10 : b2 + 48);
        }
        xmlSerializer.text(sb.toString());
        xmlSerializer.endTag((String) null, "byte-array");
    }

    /* renamed from: a */
    public static final void m732a(int[] iArr, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        if (iArr == null) {
            xmlSerializer.startTag((String) null, "null");
            xmlSerializer.endTag((String) null, "null");
            return;
        }
        xmlSerializer.startTag((String) null, "int-array");
        if (str != null) {
            xmlSerializer.attribute((String) null, "name", str);
        }
        xmlSerializer.attribute((String) null, "num", Integer.toString(r7));
        for (int num : iArr) {
            xmlSerializer.startTag((String) null, "item");
            xmlSerializer.attribute((String) null, "value", Integer.toString(num));
            xmlSerializer.endTag((String) null, "item");
        }
        xmlSerializer.endTag((String) null, "int-array");
    }

    /* renamed from: a */
    public static final void m727a(Object obj, String str, XmlSerializer xmlSerializer) throws XmlPullParserException, IOException {
        String str2;
        if (obj == null) {
            xmlSerializer.startTag((String) null, "null");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.endTag((String) null, "null");
        } else if (obj instanceof String) {
            xmlSerializer.startTag((String) null, "string");
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.text(obj.toString());
            xmlSerializer.endTag((String) null, "string");
        } else {
            if (obj instanceof Integer) {
                str2 = "int";
            } else if (obj instanceof Long) {
                str2 = "long";
            } else if (obj instanceof Float) {
                str2 = "float";
            } else if (obj instanceof Double) {
                str2 = "double";
            } else if (obj instanceof Boolean) {
                str2 = "boolean";
            } else if (obj instanceof byte[]) {
                m731a((byte[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof int[]) {
                m732a((int[]) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof Map) {
                m730a((Map) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof List) {
                m728a((List) obj, str, xmlSerializer);
                return;
            } else if (obj instanceof CharSequence) {
                xmlSerializer.startTag((String) null, "string");
                if (str != null) {
                    xmlSerializer.attribute((String) null, "name", str);
                }
                xmlSerializer.text(obj.toString());
                xmlSerializer.endTag((String) null, "string");
                return;
            } else {
                throw new RuntimeException("writeValueXml: unable to write value " + obj);
            }
            xmlSerializer.startTag((String) null, str2);
            if (str != null) {
                xmlSerializer.attribute((String) null, "name", str);
            }
            xmlSerializer.attribute((String) null, "value", obj.toString());
            xmlSerializer.endTag((String) null, str2);
        }
    }

    /* renamed from: a */
    public static final HashMap m725a(InputStream inputStream) throws XmlPullParserException, IOException {
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setInput(inputStream, (String) null);
        return (HashMap) m723a(newPullParser, new String[1]);
    }

    /* renamed from: a */
    public static final HashMap m726a(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        HashMap hashMap = new HashMap();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                Object b = m734b(xmlPullParser, strArr);
                if (strArr[0] != null) {
                    hashMap.put(strArr[0], b);
                } else {
                    throw new XmlPullParserException("Map value without name attribute: " + xmlPullParser.getName());
                }
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return hashMap;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    /* renamed from: a */
    public static final ArrayList m724a(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                arrayList.add(m734b(xmlPullParser, strArr));
            } else if (eventType == 3) {
                if (xmlPullParser.getName().equals(str)) {
                    return arrayList;
                }
                throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        throw new XmlPullParserException("Document ended before " + str + " end tag");
    }

    /* renamed from: a */
    public static final int[] m733a(XmlPullParser xmlPullParser, String str, String[] strArr) throws XmlPullParserException, IOException {
        try {
            int[] iArr = new int[Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "num"))];
            int i = 0;
            int eventType = xmlPullParser.getEventType();
            do {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals("item")) {
                        try {
                            iArr[i] = Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "value"));
                        } catch (NullPointerException unused) {
                            throw new XmlPullParserException("Need value attribute in item");
                        } catch (NumberFormatException unused2) {
                            throw new XmlPullParserException("Not a number in value attribute in item");
                        }
                    } else {
                        throw new XmlPullParserException("Expected item tag at: " + xmlPullParser.getName());
                    }
                } else if (eventType == 3) {
                    if (xmlPullParser.getName().equals(str)) {
                        return iArr;
                    }
                    if (xmlPullParser.getName().equals("item")) {
                        i++;
                    } else {
                        throw new XmlPullParserException("Expected " + str + " end tag at: " + xmlPullParser.getName());
                    }
                }
                eventType = xmlPullParser.next();
            } while (eventType != 1);
            throw new XmlPullParserException("Document ended before " + str + " end tag");
        } catch (NullPointerException unused3) {
            throw new XmlPullParserException("Need num attribute in byte-array");
        } catch (NumberFormatException unused4) {
            throw new XmlPullParserException("Not a number in num attribute in byte-array");
        }
    }

    /* renamed from: a */
    public static final Object m723a(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (eventType != 2) {
            if (eventType == 3) {
                throw new XmlPullParserException("Unexpected end tag at: " + xmlPullParser.getName());
            } else if (eventType != 4) {
                try {
                    eventType = xmlPullParser.next();
                    if (eventType == 1) {
                        throw new XmlPullParserException("Unexpected end of document");
                    }
                } catch (Exception unused) {
                    throw new XmlPullParserException("Unexpected call next(): " + xmlPullParser.getName());
                }
            } else {
                throw new XmlPullParserException("Unexpected text: " + xmlPullParser.getText());
            }
        }
        return m734b(xmlPullParser, strArr);
    }

    /* renamed from: b */
    private static final Object m734b(XmlPullParser xmlPullParser, String[] strArr) throws XmlPullParserException, IOException {
        int next;
        Object d;
        Object obj = null;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "name");
        String name = xmlPullParser.getName();
        if (!name.equals("null")) {
            if (name.equals("string")) {
                String str = "";
                while (true) {
                    int next2 = xmlPullParser.next();
                    if (next2 == 1) {
                        throw new XmlPullParserException("Unexpected end of document in <string>");
                    } else if (next2 == 3) {
                        if (xmlPullParser.getName().equals("string")) {
                            strArr[0] = attributeValue;
                            return str;
                        }
                        throw new XmlPullParserException("Unexpected end tag in <string>: " + xmlPullParser.getName());
                    } else if (next2 == 4) {
                        str = String.valueOf(str) + xmlPullParser.getText();
                    } else if (next2 == 2) {
                        throw new XmlPullParserException("Unexpected start tag in <string>: " + xmlPullParser.getName());
                    }
                }
            } else if (name.equals("int")) {
                obj = Integer.valueOf(Integer.parseInt(xmlPullParser.getAttributeValue((String) null, "value")));
            } else if (name.equals("long")) {
                obj = Long.valueOf(xmlPullParser.getAttributeValue((String) null, "value"));
            } else {
                if (name.equals("float")) {
                    d = new Float(xmlPullParser.getAttributeValue((String) null, "value"));
                } else if (name.equals("double")) {
                    d = new Double(xmlPullParser.getAttributeValue((String) null, "value"));
                } else if (name.equals("boolean")) {
                    obj = Boolean.valueOf(xmlPullParser.getAttributeValue((String) null, "value"));
                } else if (name.equals("int-array")) {
                    xmlPullParser.next();
                    int[] a = m724a(xmlPullParser, "int-array", strArr);
                    strArr[0] = attributeValue;
                    return a;
                } else if (name.equals("map")) {
                    xmlPullParser.next();
                    HashMap a2 = m724a(xmlPullParser, "map", strArr);
                    strArr[0] = attributeValue;
                    return a2;
                } else if (name.equals("list")) {
                    xmlPullParser.next();
                    ArrayList a3 = m724a(xmlPullParser, "list", strArr);
                    strArr[0] = attributeValue;
                    return a3;
                } else {
                    throw new XmlPullParserException("Unknown tag: " + name);
                }
                obj = d;
            }
        }
        do {
            next = xmlPullParser.next();
            if (next == 1) {
                throw new XmlPullParserException("Unexpected end of document in <" + name + ">");
            } else if (next == 3) {
                if (xmlPullParser.getName().equals(name)) {
                    strArr[0] = attributeValue;
                    return obj;
                }
                throw new XmlPullParserException("Unexpected end tag in <" + name + ">: " + xmlPullParser.getName());
            } else if (next == 4) {
                throw new XmlPullParserException("Unexpected text in <" + name + ">: " + xmlPullParser.getName());
            }
        } while (next != 2);
        throw new XmlPullParserException("Unexpected start tag in <" + name + ">: " + xmlPullParser.getName());
    }
}
