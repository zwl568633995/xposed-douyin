package com.xp.wx.spellbook.parser;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0002\u0010\u0010J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00132\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/xp/wx/spellbook/parser/ClassTrie;", "", "()V", "mutable", "", "getMutable", "()Z", "setMutable", "(Z)V", "root", "Lcom/xp/wx/spellbook/parser/ClassTrie$TrieNode;", "plusAssign", "", "types", "", "", "([Ljava/lang/String;)V", "type", "search", "", "packageName", "depth", "", "Companion", "TrieNode", "app_release"}, k = 1, mv = {1, 1, 13})
/* compiled from: ClassTrie.kt */
public final class ClassTrie {
    @Deprecated
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private volatile boolean mutable = true;
    private final TrieNode root = new TrieNode();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\u0006"}, d2 = {"Lcom/xp/wx/spellbook/parser/ClassTrie$Companion;", "", "()V", "convertJVMTypeToClassName", "", "type", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: ClassTrie.kt */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final String convertJVMTypeToClassName(String str) {
            int length = str.length() - 1;
            if (str != null) {
                String substring = str.substring(1, length);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return StringsKt.replace$default(substring, '/', '.', false, 4, (Object) null);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    public final boolean getMutable() {
        return this.mutable;
    }

    public final void setMutable(boolean z) {
        this.mutable = z;
    }

    public final void plusAssign(String str) {
        Intrinsics.checkParameterIsNotNull(str, "type");
        if (this.mutable) {
            this.root.add(Companion.convertJVMTypeToClassName(str));
        }
    }

    public final List<String> search(String str, int i) {
        Intrinsics.checkParameterIsNotNull(str, "packageName");
        if (this.mutable) {
            return CollectionsKt.emptyList();
        }
        return this.root.search(str, i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0010J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0010J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00122\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xp/wx/spellbook/parser/ClassTrie$TrieNode;", "", "()V", "children", "", "", "getChildren", "()Ljava/util/Map;", "classes", "", "getClasses", "()Ljava/util/List;", "add", "", "className", "pos", "", "get", "", "depth", "search", "packageName", "app_release"}, k = 1, mv = {1, 1, 13})
    /* compiled from: ClassTrie.kt */
    private static final class TrieNode {
        private final Map<String, TrieNode> children = new ConcurrentHashMap();
        private final List<String> classes = new ArrayList(50);

        public final List<String> getClasses() {
            return this.classes;
        }

        public final Map<String, TrieNode> getChildren() {
            return this.children;
        }

        public final void add(String str) {
            Intrinsics.checkParameterIsNotNull(str, "className");
            add(str, 0);
        }

        private final void add(String str, int i) {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '.', i, false, 4, (Object) null);
            if (indexOf$default == -1) {
                synchronized (this) {
                    this.classes.add(str);
                }
            } else if (str != null) {
                String substring = str.substring(i, indexOf$default);
                Intrinsics.checkExpressionValueIsNotNull(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                if (!this.children.containsKey(substring)) {
                    this.children.put(substring, new TrieNode());
                }
                TrieNode trieNode = this.children.get(substring);
                if (trieNode == null) {
                    Intrinsics.throwNpe();
                }
                trieNode.add(str, indexOf$default + 1);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }

        public static /* synthetic */ List get$default(TrieNode trieNode, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return trieNode.get(i);
        }

        public final List<String> get(int i) {
            if (i == 0) {
                return this.classes;
            }
            Map<String, TrieNode> map = this.children;
            Collection arrayList = new ArrayList();
            for (Map.Entry<String, TrieNode> value : map.entrySet()) {
                CollectionsKt.addAll(arrayList, ((TrieNode) value.getValue()).get(i - 1));
            }
            return (List) arrayList;
        }

        public final List<String> search(String str, int i) {
            Intrinsics.checkParameterIsNotNull(str, "packageName");
            return search(str, i, 0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
            r7 = r7.get(r8);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.util.List<java.lang.String> search(java.lang.String r7, int r8, int r9) {
            /*
                r6 = this;
                r0 = r7
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1 = 46
                r3 = 0
                r4 = 4
                r5 = 0
                r2 = r9
                int r0 = kotlin.text.StringsKt.indexOf$default((java.lang.CharSequence) r0, (char) r1, (int) r2, (boolean) r3, (int) r4, (java.lang.Object) r5)
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r2 = -1
                if (r0 != r2) goto L_0x0039
                if (r7 == 0) goto L_0x0033
                java.lang.String r7 = r7.substring(r9)
                java.lang.String r9 = "(this as java.lang.String).substring(startIndex)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r7, r9)
                java.util.Map<java.lang.String, com.xp.wx.spellbook.parser.ClassTrie$TrieNode> r9 = r6.children
                java.lang.Object r7 = r9.get(r7)
                com.xp.wx.spellbook.parser.ClassTrie$TrieNode r7 = (com.xp.wx.spellbook.parser.ClassTrie.TrieNode) r7
                if (r7 == 0) goto L_0x002e
                java.util.List r7 = r7.get(r8)
                if (r7 == 0) goto L_0x002e
                goto L_0x0032
            L_0x002e:
                java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
            L_0x0032:
                return r7
            L_0x0033:
                kotlin.TypeCastException r7 = new kotlin.TypeCastException
                r7.<init>(r1)
                throw r7
            L_0x0039:
                if (r7 == 0) goto L_0x005a
                java.lang.String r9 = r7.substring(r9, r0)
                java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r9, r1)
                java.util.Map<java.lang.String, com.xp.wx.spellbook.parser.ClassTrie$TrieNode> r1 = r6.children
                java.lang.Object r9 = r1.get(r9)
                com.xp.wx.spellbook.parser.ClassTrie$TrieNode r9 = (com.xp.wx.spellbook.parser.ClassTrie.TrieNode) r9
                if (r9 == 0) goto L_0x0055
                int r0 = r0 + 1
                java.util.List r7 = r9.search(r7, r8, r0)
                return r7
            L_0x0055:
                java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
                return r7
            L_0x005a:
                kotlin.TypeCastException r7 = new kotlin.TypeCastException
                r7.<init>(r1)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xp.wx.spellbook.parser.ClassTrie.TrieNode.search(java.lang.String, int, int):java.util.List");
        }
    }

    public final void plusAssign(String[] strArr) {
        Intrinsics.checkParameterIsNotNull(strArr, "types");
        for (String plusAssign : strArr) {
            plusAssign(plusAssign);
        }
    }
}
