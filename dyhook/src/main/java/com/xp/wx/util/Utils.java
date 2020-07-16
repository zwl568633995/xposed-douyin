package com.xp.wx.util;

import android.util.Log;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Utils {
    private static final String TAG = "Utils";

    public static String getAppMsgTextContent(String str, String str2) {
        if (str2 != null && str2.length() > 0) {
            try {
                Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new ByteArrayInputStream(str.getBytes()));
                if (parse.getNodeName().equals(str2)) {
                    return parse.getTextContent();
                }
                return getNodeTextContent(parse.getChildNodes(), str2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static String getNodeTextContent(NodeList nodeList, String str) {
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeName().equals(str)) {
                return nodeList.item(i).getTextContent();
            }
            String nodeTextContent = getNodeTextContent(nodeList.item(i).getChildNodes(), str);
            if (nodeTextContent != null) {
                return nodeTextContent;
            }
        }
        return null;
    }

    public static String getElementValue(Element element, String str) {
        NodeList elementsByTagName = element.getElementsByTagName(str);
        return StringUtils.emptyIfNull(elementsByTagName.getLength() > 0 ? elementsByTagName.item(0).getTextContent() : "");
    }

    public static void waitWithoutInterrupt(Object obj) {
        try {
            obj.wait();
        } catch (InterruptedException unused) {
            Log.w(TAG, "unexpected interrupt: " + obj);
        }
    }

    public static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }
}
