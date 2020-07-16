package com.p022ta.utdid2.p024b.p025a;

import java.io.UnsupportedEncodingException;
import kotlin.UByte;

/* renamed from: com.ta.utdid2.b.a.b */
/* compiled from: Base64 */
public class C1049b {

    /* renamed from: a */
    static final /* synthetic */ boolean f806a = (!C1049b.class.desiredAssertionStatus());

    /* renamed from: com.ta.utdid2.b.a.b$a */
    /* compiled from: Base64 */
    static abstract class C1050a {

        /* renamed from: a */
        public int f807a;

        /* renamed from: b */
        public byte[] f808b;

        C1050a() {
        }
    }

    public static byte[] decode(String str, int i) {
        return decode(str.getBytes(), i);
    }

    public static byte[] decode(byte[] bArr, int i) {
        return decode(bArr, 0, bArr.length, i);
    }

    public static byte[] decode(byte[] bArr, int i, int i2, int i3) {
        C1051b bVar = new C1051b(i3, new byte[((i2 * 3) / 4)]);
        if (!bVar.mo12925a(bArr, i, i2, true)) {
            throw new IllegalArgumentException("bad base-64");
        } else if (bVar.f807a == bVar.f808b.length) {
            return bVar.f808b;
        } else {
            byte[] bArr2 = new byte[bVar.f807a];
            System.arraycopy(bVar.f808b, 0, bArr2, 0, bVar.f807a);
            return bArr2;
        }
    }

    /* renamed from: com.ta.utdid2.b.a.b$b */
    /* compiled from: Base64 */
    static class C1051b extends C1050a {

        /* renamed from: a */
        private static final int[] f809a;

        /* renamed from: b */
        private static final int[] f810b;

        /* renamed from: c */
        private final int[] f811c;
        private int state;
        private int value;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: int[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: int[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        static {
            /*
                r0 = 256(0x100, float:3.59E-43)
                int[] r0 = new int[r0]
                r1 = -1
                r2 = 0
                r0[r2] = r1
                r2 = 1
                r0[r2] = r1
                r3 = 2
                r0[r3] = r1
                r4 = 3
                r0[r4] = r1
                r5 = 4
                r0[r5] = r1
                r6 = 5
                r0[r6] = r1
                r7 = 6
                r0[r7] = r1
                r8 = 7
                r0[r8] = r1
                r9 = 8
                r0[r9] = r1
                r10 = 9
                r0[r10] = r1
                r11 = 10
                r0[r11] = r1
                r12 = 11
                r0[r12] = r1
                r13 = 12
                r0[r13] = r1
                r14 = 13
                r0[r14] = r1
                r15 = 14
                r0[r15] = r1
                r16 = 15
                r0[r16] = r1
                r17 = 16
                r0[r17] = r1
                r18 = 17
                r0[r18] = r1
                r19 = 18
                r0[r19] = r1
                r20 = 19
                r0[r20] = r1
                r21 = 20
                r0[r21] = r1
                r22 = 21
                r0[r22] = r1
                r23 = 22
                r0[r23] = r1
                r23 = 23
                r0[r23] = r1
                r23 = 24
                r0[r23] = r1
                r23 = 25
                r0[r23] = r1
                r23 = 26
                r0[r23] = r1
                r23 = 27
                r0[r23] = r1
                r23 = 28
                r0[r23] = r1
                r23 = 29
                r0[r23] = r1
                r23 = 30
                r0[r23] = r1
                r23 = 31
                r0[r23] = r1
                r23 = 32
                r0[r23] = r1
                r23 = 33
                r0[r23] = r1
                r23 = 34
                r0[r23] = r1
                r23 = 35
                r0[r23] = r1
                r23 = 36
                r0[r23] = r1
                r23 = 37
                r0[r23] = r1
                r23 = 38
                r0[r23] = r1
                r23 = 39
                r0[r23] = r1
                r23 = 40
                r0[r23] = r1
                r23 = 41
                r0[r23] = r1
                r23 = 42
                r0[r23] = r1
                r23 = 43
                r24 = 62
                r0[r23] = r24
                r23 = 44
                r0[r23] = r1
                r23 = 45
                r0[r23] = r1
                r23 = 46
                r0[r23] = r1
                r23 = 47
                r24 = 63
                r0[r23] = r24
                r23 = 48
                r24 = 52
                r0[r23] = r24
                r23 = 49
                r24 = 53
                r0[r23] = r24
                r23 = 50
                r24 = 54
                r0[r23] = r24
                r23 = 51
                r24 = 55
                r0[r23] = r24
                r23 = 52
                r24 = 56
                r0[r23] = r24
                r23 = 53
                r24 = 57
                r0[r23] = r24
                r23 = 54
                r24 = 58
                r0[r23] = r24
                r23 = 55
                r24 = 59
                r0[r23] = r24
                r23 = 56
                r24 = 60
                r0[r23] = r24
                r23 = 57
                r24 = 61
                r0[r23] = r24
                r23 = 58
                r0[r23] = r1
                r23 = 59
                r0[r23] = r1
                r23 = 60
                r0[r23] = r1
                r23 = 61
                r24 = -2
                r0[r23] = r24
                r23 = 62
                r0[r23] = r1
                r23 = 63
                r0[r23] = r1
                r23 = 64
                r0[r23] = r1
                r23 = 66
                r0[r23] = r2
                r23 = 67
                r0[r23] = r3
                r23 = 68
                r0[r23] = r4
                r23 = 69
                r0[r23] = r5
                r23 = 70
                r0[r23] = r6
                r23 = 71
                r0[r23] = r7
                r23 = 72
                r0[r23] = r8
                r23 = 73
                r0[r23] = r9
                r23 = 74
                r0[r23] = r10
                r23 = 75
                r0[r23] = r11
                r23 = 76
                r0[r23] = r12
                r23 = 77
                r0[r23] = r13
                r23 = 78
                r0[r23] = r14
                r23 = 79
                r0[r23] = r15
                r23 = 80
                r0[r23] = r16
                r23 = 81
                r0[r23] = r17
                r23 = 82
                r0[r23] = r18
                r23 = 83
                r0[r23] = r19
                r23 = 84
                r0[r23] = r20
                r23 = 85
                r0[r23] = r21
                r23 = 86
                r0[r23] = r22
                r23 = 87
                r24 = 22
                r0[r23] = r24
                r23 = 88
                r24 = 23
                r0[r23] = r24
                r23 = 89
                r24 = 24
                r0[r23] = r24
                r23 = 90
                r24 = 25
                r0[r23] = r24
                r23 = 91
                r0[r23] = r1
                r23 = 92
                r0[r23] = r1
                r23 = 93
                r0[r23] = r1
                r23 = 94
                r0[r23] = r1
                r23 = 95
                r0[r23] = r1
                r23 = 96
                r0[r23] = r1
                r23 = 97
                r24 = 26
                r0[r23] = r24
                r23 = 98
                r24 = 27
                r0[r23] = r24
                r23 = 99
                r24 = 28
                r0[r23] = r24
                r23 = 100
                r24 = 29
                r0[r23] = r24
                r23 = 101(0x65, float:1.42E-43)
                r24 = 30
                r0[r23] = r24
                r23 = 102(0x66, float:1.43E-43)
                r24 = 31
                r0[r23] = r24
                r23 = 103(0x67, float:1.44E-43)
                r24 = 32
                r0[r23] = r24
                r23 = 104(0x68, float:1.46E-43)
                r24 = 33
                r0[r23] = r24
                r23 = 105(0x69, float:1.47E-43)
                r24 = 34
                r0[r23] = r24
                r23 = 106(0x6a, float:1.49E-43)
                r24 = 35
                r0[r23] = r24
                r23 = 107(0x6b, float:1.5E-43)
                r24 = 36
                r0[r23] = r24
                r23 = 108(0x6c, float:1.51E-43)
                r24 = 37
                r0[r23] = r24
                r23 = 109(0x6d, float:1.53E-43)
                r24 = 38
                r0[r23] = r24
                r23 = 110(0x6e, float:1.54E-43)
                r24 = 39
                r0[r23] = r24
                r23 = 111(0x6f, float:1.56E-43)
                r24 = 40
                r0[r23] = r24
                r23 = 112(0x70, float:1.57E-43)
                r24 = 41
                r0[r23] = r24
                r23 = 113(0x71, float:1.58E-43)
                r24 = 42
                r0[r23] = r24
                r23 = 114(0x72, float:1.6E-43)
                r24 = 43
                r0[r23] = r24
                r23 = 115(0x73, float:1.61E-43)
                r24 = 44
                r0[r23] = r24
                r23 = 116(0x74, float:1.63E-43)
                r24 = 45
                r0[r23] = r24
                r23 = 117(0x75, float:1.64E-43)
                r24 = 46
                r0[r23] = r24
                r23 = 118(0x76, float:1.65E-43)
                r24 = 47
                r0[r23] = r24
                r23 = 119(0x77, float:1.67E-43)
                r24 = 48
                r0[r23] = r24
                r23 = 120(0x78, float:1.68E-43)
                r24 = 49
                r0[r23] = r24
                r23 = 121(0x79, float:1.7E-43)
                r24 = 50
                r0[r23] = r24
                r23 = 122(0x7a, float:1.71E-43)
                r24 = 51
                r0[r23] = r24
                r23 = 123(0x7b, float:1.72E-43)
                r0[r23] = r1
                r23 = 124(0x7c, float:1.74E-43)
                r0[r23] = r1
                r23 = 125(0x7d, float:1.75E-43)
                r0[r23] = r1
                r23 = 126(0x7e, float:1.77E-43)
                r0[r23] = r1
                r23 = 127(0x7f, float:1.78E-43)
                r0[r23] = r1
                r23 = 128(0x80, float:1.794E-43)
                r0[r23] = r1
                r23 = 129(0x81, float:1.81E-43)
                r0[r23] = r1
                r23 = 130(0x82, float:1.82E-43)
                r0[r23] = r1
                r23 = 131(0x83, float:1.84E-43)
                r0[r23] = r1
                r23 = 132(0x84, float:1.85E-43)
                r0[r23] = r1
                r23 = 133(0x85, float:1.86E-43)
                r0[r23] = r1
                r23 = 134(0x86, float:1.88E-43)
                r0[r23] = r1
                r23 = 135(0x87, float:1.89E-43)
                r0[r23] = r1
                r23 = 136(0x88, float:1.9E-43)
                r0[r23] = r1
                r23 = 137(0x89, float:1.92E-43)
                r0[r23] = r1
                r23 = 138(0x8a, float:1.93E-43)
                r0[r23] = r1
                r23 = 139(0x8b, float:1.95E-43)
                r0[r23] = r1
                r23 = 140(0x8c, float:1.96E-43)
                r0[r23] = r1
                r23 = 141(0x8d, float:1.98E-43)
                r0[r23] = r1
                r23 = 142(0x8e, float:1.99E-43)
                r0[r23] = r1
                r23 = 143(0x8f, float:2.0E-43)
                r0[r23] = r1
                r23 = 144(0x90, float:2.02E-43)
                r0[r23] = r1
                r23 = 145(0x91, float:2.03E-43)
                r0[r23] = r1
                r23 = 146(0x92, float:2.05E-43)
                r0[r23] = r1
                r23 = 147(0x93, float:2.06E-43)
                r0[r23] = r1
                r23 = 148(0x94, float:2.07E-43)
                r0[r23] = r1
                r23 = 149(0x95, float:2.09E-43)
                r0[r23] = r1
                r23 = 150(0x96, float:2.1E-43)
                r0[r23] = r1
                r23 = 151(0x97, float:2.12E-43)
                r0[r23] = r1
                r23 = 152(0x98, float:2.13E-43)
                r0[r23] = r1
                r23 = 153(0x99, float:2.14E-43)
                r0[r23] = r1
                r23 = 154(0x9a, float:2.16E-43)
                r0[r23] = r1
                r23 = 155(0x9b, float:2.17E-43)
                r0[r23] = r1
                r23 = 156(0x9c, float:2.19E-43)
                r0[r23] = r1
                r23 = 157(0x9d, float:2.2E-43)
                r0[r23] = r1
                r23 = 158(0x9e, float:2.21E-43)
                r0[r23] = r1
                r23 = 159(0x9f, float:2.23E-43)
                r0[r23] = r1
                r23 = 160(0xa0, float:2.24E-43)
                r0[r23] = r1
                r23 = 161(0xa1, float:2.26E-43)
                r0[r23] = r1
                r23 = 162(0xa2, float:2.27E-43)
                r0[r23] = r1
                r23 = 163(0xa3, float:2.28E-43)
                r0[r23] = r1
                r23 = 164(0xa4, float:2.3E-43)
                r0[r23] = r1
                r23 = 165(0xa5, float:2.31E-43)
                r0[r23] = r1
                r23 = 166(0xa6, float:2.33E-43)
                r0[r23] = r1
                r23 = 167(0xa7, float:2.34E-43)
                r0[r23] = r1
                r23 = 168(0xa8, float:2.35E-43)
                r0[r23] = r1
                r23 = 169(0xa9, float:2.37E-43)
                r0[r23] = r1
                r23 = 170(0xaa, float:2.38E-43)
                r0[r23] = r1
                r23 = 171(0xab, float:2.4E-43)
                r0[r23] = r1
                r23 = 172(0xac, float:2.41E-43)
                r0[r23] = r1
                r23 = 173(0xad, float:2.42E-43)
                r0[r23] = r1
                r23 = 174(0xae, float:2.44E-43)
                r0[r23] = r1
                r23 = 175(0xaf, float:2.45E-43)
                r0[r23] = r1
                r23 = 176(0xb0, float:2.47E-43)
                r0[r23] = r1
                r23 = 177(0xb1, float:2.48E-43)
                r0[r23] = r1
                r23 = 178(0xb2, float:2.5E-43)
                r0[r23] = r1
                r23 = 179(0xb3, float:2.51E-43)
                r0[r23] = r1
                r23 = 180(0xb4, float:2.52E-43)
                r0[r23] = r1
                r23 = 181(0xb5, float:2.54E-43)
                r0[r23] = r1
                r23 = 182(0xb6, float:2.55E-43)
                r0[r23] = r1
                r23 = 183(0xb7, float:2.56E-43)
                r0[r23] = r1
                r23 = 184(0xb8, float:2.58E-43)
                r0[r23] = r1
                r23 = 185(0xb9, float:2.59E-43)
                r0[r23] = r1
                r23 = 186(0xba, float:2.6E-43)
                r0[r23] = r1
                r23 = 187(0xbb, float:2.62E-43)
                r0[r23] = r1
                r23 = 188(0xbc, float:2.63E-43)
                r0[r23] = r1
                r23 = 189(0xbd, float:2.65E-43)
                r0[r23] = r1
                r23 = 190(0xbe, float:2.66E-43)
                r0[r23] = r1
                r23 = 191(0xbf, float:2.68E-43)
                r0[r23] = r1
                r23 = 192(0xc0, float:2.69E-43)
                r0[r23] = r1
                r23 = 193(0xc1, float:2.7E-43)
                r0[r23] = r1
                r23 = 194(0xc2, float:2.72E-43)
                r0[r23] = r1
                r23 = 195(0xc3, float:2.73E-43)
                r0[r23] = r1
                r23 = 196(0xc4, float:2.75E-43)
                r0[r23] = r1
                r23 = 197(0xc5, float:2.76E-43)
                r0[r23] = r1
                r23 = 198(0xc6, float:2.77E-43)
                r0[r23] = r1
                r23 = 199(0xc7, float:2.79E-43)
                r0[r23] = r1
                r23 = 200(0xc8, float:2.8E-43)
                r0[r23] = r1
                r23 = 201(0xc9, float:2.82E-43)
                r0[r23] = r1
                r23 = 202(0xca, float:2.83E-43)
                r0[r23] = r1
                r23 = 203(0xcb, float:2.84E-43)
                r0[r23] = r1
                r23 = 204(0xcc, float:2.86E-43)
                r0[r23] = r1
                r23 = 205(0xcd, float:2.87E-43)
                r0[r23] = r1
                r23 = 206(0xce, float:2.89E-43)
                r0[r23] = r1
                r23 = 207(0xcf, float:2.9E-43)
                r0[r23] = r1
                r23 = 208(0xd0, float:2.91E-43)
                r0[r23] = r1
                r23 = 209(0xd1, float:2.93E-43)
                r0[r23] = r1
                r23 = 210(0xd2, float:2.94E-43)
                r0[r23] = r1
                r23 = 211(0xd3, float:2.96E-43)
                r0[r23] = r1
                r23 = 212(0xd4, float:2.97E-43)
                r0[r23] = r1
                r23 = 213(0xd5, float:2.98E-43)
                r0[r23] = r1
                r23 = 214(0xd6, float:3.0E-43)
                r0[r23] = r1
                r23 = 215(0xd7, float:3.01E-43)
                r0[r23] = r1
                r23 = 216(0xd8, float:3.03E-43)
                r0[r23] = r1
                r23 = 217(0xd9, float:3.04E-43)
                r0[r23] = r1
                r23 = 218(0xda, float:3.05E-43)
                r0[r23] = r1
                r23 = 219(0xdb, float:3.07E-43)
                r0[r23] = r1
                r23 = 220(0xdc, float:3.08E-43)
                r0[r23] = r1
                r23 = 221(0xdd, float:3.1E-43)
                r0[r23] = r1
                r23 = 222(0xde, float:3.11E-43)
                r0[r23] = r1
                r23 = 223(0xdf, float:3.12E-43)
                r0[r23] = r1
                r23 = 224(0xe0, float:3.14E-43)
                r0[r23] = r1
                r23 = 225(0xe1, float:3.15E-43)
                r0[r23] = r1
                r23 = 226(0xe2, float:3.17E-43)
                r0[r23] = r1
                r23 = 227(0xe3, float:3.18E-43)
                r0[r23] = r1
                r23 = 228(0xe4, float:3.2E-43)
                r0[r23] = r1
                r23 = 229(0xe5, float:3.21E-43)
                r0[r23] = r1
                r23 = 230(0xe6, float:3.22E-43)
                r0[r23] = r1
                r23 = 231(0xe7, float:3.24E-43)
                r0[r23] = r1
                r23 = 232(0xe8, float:3.25E-43)
                r0[r23] = r1
                r23 = 233(0xe9, float:3.27E-43)
                r0[r23] = r1
                r23 = 234(0xea, float:3.28E-43)
                r0[r23] = r1
                r23 = 235(0xeb, float:3.3E-43)
                r0[r23] = r1
                r23 = 236(0xec, float:3.31E-43)
                r0[r23] = r1
                r23 = 237(0xed, float:3.32E-43)
                r0[r23] = r1
                r23 = 238(0xee, float:3.34E-43)
                r0[r23] = r1
                r23 = 239(0xef, float:3.35E-43)
                r0[r23] = r1
                r23 = 240(0xf0, float:3.36E-43)
                r0[r23] = r1
                r23 = 241(0xf1, float:3.38E-43)
                r0[r23] = r1
                r23 = 242(0xf2, float:3.39E-43)
                r0[r23] = r1
                r23 = 243(0xf3, float:3.4E-43)
                r0[r23] = r1
                r23 = 244(0xf4, float:3.42E-43)
                r0[r23] = r1
                r23 = 245(0xf5, float:3.43E-43)
                r0[r23] = r1
                r23 = 246(0xf6, float:3.45E-43)
                r0[r23] = r1
                r23 = 247(0xf7, float:3.46E-43)
                r0[r23] = r1
                r23 = 248(0xf8, float:3.48E-43)
                r0[r23] = r1
                r23 = 249(0xf9, float:3.49E-43)
                r0[r23] = r1
                r23 = 250(0xfa, float:3.5E-43)
                r0[r23] = r1
                r23 = 251(0xfb, float:3.52E-43)
                r0[r23] = r1
                r23 = 252(0xfc, float:3.53E-43)
                r0[r23] = r1
                r23 = 253(0xfd, float:3.55E-43)
                r0[r23] = r1
                r23 = 254(0xfe, float:3.56E-43)
                r0[r23] = r1
                r23 = 255(0xff, float:3.57E-43)
                r0[r23] = r1
                f809a = r0
                r0 = 256(0x100, float:3.59E-43)
                int[] r0 = new int[r0]
                r23 = 0
                r0[r23] = r1
                r0[r2] = r1
                r0[r3] = r1
                r0[r4] = r1
                r0[r5] = r1
                r0[r6] = r1
                r0[r7] = r1
                r0[r8] = r1
                r0[r9] = r1
                r0[r10] = r1
                r0[r11] = r1
                r0[r12] = r1
                r0[r13] = r1
                r0[r14] = r1
                r0[r15] = r1
                r0[r16] = r1
                r0[r17] = r1
                r0[r18] = r1
                r0[r19] = r1
                r0[r20] = r1
                r0[r21] = r1
                r0[r22] = r1
                r23 = 22
                r0[r23] = r1
                r23 = 23
                r0[r23] = r1
                r23 = 24
                r0[r23] = r1
                r23 = 25
                r0[r23] = r1
                r23 = 26
                r0[r23] = r1
                r23 = 27
                r0[r23] = r1
                r23 = 28
                r0[r23] = r1
                r23 = 29
                r0[r23] = r1
                r23 = 30
                r0[r23] = r1
                r23 = 31
                r0[r23] = r1
                r23 = 32
                r0[r23] = r1
                r23 = 33
                r0[r23] = r1
                r23 = 34
                r0[r23] = r1
                r23 = 35
                r0[r23] = r1
                r23 = 36
                r0[r23] = r1
                r23 = 37
                r0[r23] = r1
                r23 = 38
                r0[r23] = r1
                r23 = 39
                r0[r23] = r1
                r23 = 40
                r0[r23] = r1
                r23 = 41
                r0[r23] = r1
                r23 = 42
                r0[r23] = r1
                r23 = 43
                r0[r23] = r1
                r23 = 44
                r0[r23] = r1
                r23 = 45
                r24 = 62
                r0[r23] = r24
                r23 = 46
                r0[r23] = r1
                r23 = 47
                r0[r23] = r1
                r23 = 48
                r24 = 52
                r0[r23] = r24
                r23 = 49
                r24 = 53
                r0[r23] = r24
                r23 = 50
                r24 = 54
                r0[r23] = r24
                r23 = 51
                r24 = 55
                r0[r23] = r24
                r23 = 52
                r24 = 56
                r0[r23] = r24
                r23 = 53
                r24 = 57
                r0[r23] = r24
                r23 = 54
                r24 = 58
                r0[r23] = r24
                r23 = 55
                r24 = 59
                r0[r23] = r24
                r23 = 56
                r24 = 60
                r0[r23] = r24
                r23 = 57
                r24 = 61
                r0[r23] = r24
                r23 = 58
                r0[r23] = r1
                r23 = 59
                r0[r23] = r1
                r23 = 60
                r0[r23] = r1
                r23 = 61
                r24 = -2
                r0[r23] = r24
                r23 = 62
                r0[r23] = r1
                r23 = 63
                r0[r23] = r1
                r23 = 64
                r0[r23] = r1
                r23 = 66
                r0[r23] = r2
                r2 = 67
                r0[r2] = r3
                r2 = 68
                r0[r2] = r4
                r2 = 69
                r0[r2] = r5
                r2 = 70
                r0[r2] = r6
                r2 = 71
                r0[r2] = r7
                r2 = 72
                r0[r2] = r8
                r2 = 73
                r0[r2] = r9
                r2 = 74
                r0[r2] = r10
                r2 = 75
                r0[r2] = r11
                r2 = 76
                r0[r2] = r12
                r2 = 77
                r0[r2] = r13
                r2 = 78
                r0[r2] = r14
                r2 = 79
                r0[r2] = r15
                r2 = 80
                r0[r2] = r16
                r2 = 81
                r0[r2] = r17
                r2 = 82
                r0[r2] = r18
                r2 = 83
                r0[r2] = r19
                r2 = 84
                r0[r2] = r20
                r2 = 85
                r0[r2] = r21
                r2 = 86
                r0[r2] = r22
                r2 = 87
                r3 = 22
                r0[r2] = r3
                r2 = 88
                r3 = 23
                r0[r2] = r3
                r2 = 89
                r3 = 24
                r0[r2] = r3
                r2 = 90
                r3 = 25
                r0[r2] = r3
                r2 = 91
                r0[r2] = r1
                r2 = 92
                r0[r2] = r1
                r2 = 93
                r0[r2] = r1
                r2 = 94
                r0[r2] = r1
                r2 = 95
                r3 = 63
                r0[r2] = r3
                r2 = 96
                r0[r2] = r1
                r2 = 97
                r3 = 26
                r0[r2] = r3
                r2 = 98
                r3 = 27
                r0[r2] = r3
                r2 = 99
                r3 = 28
                r0[r2] = r3
                r2 = 100
                r3 = 29
                r0[r2] = r3
                r2 = 101(0x65, float:1.42E-43)
                r3 = 30
                r0[r2] = r3
                r2 = 102(0x66, float:1.43E-43)
                r3 = 31
                r0[r2] = r3
                r2 = 103(0x67, float:1.44E-43)
                r3 = 32
                r0[r2] = r3
                r2 = 104(0x68, float:1.46E-43)
                r3 = 33
                r0[r2] = r3
                r2 = 105(0x69, float:1.47E-43)
                r3 = 34
                r0[r2] = r3
                r2 = 106(0x6a, float:1.49E-43)
                r3 = 35
                r0[r2] = r3
                r2 = 107(0x6b, float:1.5E-43)
                r3 = 36
                r0[r2] = r3
                r2 = 108(0x6c, float:1.51E-43)
                r3 = 37
                r0[r2] = r3
                r2 = 109(0x6d, float:1.53E-43)
                r3 = 38
                r0[r2] = r3
                r2 = 110(0x6e, float:1.54E-43)
                r3 = 39
                r0[r2] = r3
                r2 = 111(0x6f, float:1.56E-43)
                r3 = 40
                r0[r2] = r3
                r2 = 112(0x70, float:1.57E-43)
                r3 = 41
                r0[r2] = r3
                r2 = 113(0x71, float:1.58E-43)
                r3 = 42
                r0[r2] = r3
                r2 = 114(0x72, float:1.6E-43)
                r3 = 43
                r0[r2] = r3
                r2 = 115(0x73, float:1.61E-43)
                r3 = 44
                r0[r2] = r3
                r2 = 116(0x74, float:1.63E-43)
                r3 = 45
                r0[r2] = r3
                r2 = 117(0x75, float:1.64E-43)
                r3 = 46
                r0[r2] = r3
                r2 = 118(0x76, float:1.65E-43)
                r3 = 47
                r0[r2] = r3
                r2 = 119(0x77, float:1.67E-43)
                r3 = 48
                r0[r2] = r3
                r2 = 120(0x78, float:1.68E-43)
                r3 = 49
                r0[r2] = r3
                r2 = 121(0x79, float:1.7E-43)
                r3 = 50
                r0[r2] = r3
                r2 = 122(0x7a, float:1.71E-43)
                r3 = 51
                r0[r2] = r3
                r2 = 123(0x7b, float:1.72E-43)
                r0[r2] = r1
                r2 = 124(0x7c, float:1.74E-43)
                r0[r2] = r1
                r2 = 125(0x7d, float:1.75E-43)
                r0[r2] = r1
                r2 = 126(0x7e, float:1.77E-43)
                r0[r2] = r1
                r2 = 127(0x7f, float:1.78E-43)
                r0[r2] = r1
                r2 = 128(0x80, float:1.794E-43)
                r0[r2] = r1
                r2 = 129(0x81, float:1.81E-43)
                r0[r2] = r1
                r2 = 130(0x82, float:1.82E-43)
                r0[r2] = r1
                r2 = 131(0x83, float:1.84E-43)
                r0[r2] = r1
                r2 = 132(0x84, float:1.85E-43)
                r0[r2] = r1
                r2 = 133(0x85, float:1.86E-43)
                r0[r2] = r1
                r2 = 134(0x86, float:1.88E-43)
                r0[r2] = r1
                r2 = 135(0x87, float:1.89E-43)
                r0[r2] = r1
                r2 = 136(0x88, float:1.9E-43)
                r0[r2] = r1
                r2 = 137(0x89, float:1.92E-43)
                r0[r2] = r1
                r2 = 138(0x8a, float:1.93E-43)
                r0[r2] = r1
                r2 = 139(0x8b, float:1.95E-43)
                r0[r2] = r1
                r2 = 140(0x8c, float:1.96E-43)
                r0[r2] = r1
                r2 = 141(0x8d, float:1.98E-43)
                r0[r2] = r1
                r2 = 142(0x8e, float:1.99E-43)
                r0[r2] = r1
                r2 = 143(0x8f, float:2.0E-43)
                r0[r2] = r1
                r2 = 144(0x90, float:2.02E-43)
                r0[r2] = r1
                r2 = 145(0x91, float:2.03E-43)
                r0[r2] = r1
                r2 = 146(0x92, float:2.05E-43)
                r0[r2] = r1
                r2 = 147(0x93, float:2.06E-43)
                r0[r2] = r1
                r2 = 148(0x94, float:2.07E-43)
                r0[r2] = r1
                r2 = 149(0x95, float:2.09E-43)
                r0[r2] = r1
                r2 = 150(0x96, float:2.1E-43)
                r0[r2] = r1
                r2 = 151(0x97, float:2.12E-43)
                r0[r2] = r1
                r2 = 152(0x98, float:2.13E-43)
                r0[r2] = r1
                r2 = 153(0x99, float:2.14E-43)
                r0[r2] = r1
                r2 = 154(0x9a, float:2.16E-43)
                r0[r2] = r1
                r2 = 155(0x9b, float:2.17E-43)
                r0[r2] = r1
                r2 = 156(0x9c, float:2.19E-43)
                r0[r2] = r1
                r2 = 157(0x9d, float:2.2E-43)
                r0[r2] = r1
                r2 = 158(0x9e, float:2.21E-43)
                r0[r2] = r1
                r2 = 159(0x9f, float:2.23E-43)
                r0[r2] = r1
                r2 = 160(0xa0, float:2.24E-43)
                r0[r2] = r1
                r2 = 161(0xa1, float:2.26E-43)
                r0[r2] = r1
                r2 = 162(0xa2, float:2.27E-43)
                r0[r2] = r1
                r2 = 163(0xa3, float:2.28E-43)
                r0[r2] = r1
                r2 = 164(0xa4, float:2.3E-43)
                r0[r2] = r1
                r2 = 165(0xa5, float:2.31E-43)
                r0[r2] = r1
                r2 = 166(0xa6, float:2.33E-43)
                r0[r2] = r1
                r2 = 167(0xa7, float:2.34E-43)
                r0[r2] = r1
                r2 = 168(0xa8, float:2.35E-43)
                r0[r2] = r1
                r2 = 169(0xa9, float:2.37E-43)
                r0[r2] = r1
                r2 = 170(0xaa, float:2.38E-43)
                r0[r2] = r1
                r2 = 171(0xab, float:2.4E-43)
                r0[r2] = r1
                r2 = 172(0xac, float:2.41E-43)
                r0[r2] = r1
                r2 = 173(0xad, float:2.42E-43)
                r0[r2] = r1
                r2 = 174(0xae, float:2.44E-43)
                r0[r2] = r1
                r2 = 175(0xaf, float:2.45E-43)
                r0[r2] = r1
                r2 = 176(0xb0, float:2.47E-43)
                r0[r2] = r1
                r2 = 177(0xb1, float:2.48E-43)
                r0[r2] = r1
                r2 = 178(0xb2, float:2.5E-43)
                r0[r2] = r1
                r2 = 179(0xb3, float:2.51E-43)
                r0[r2] = r1
                r2 = 180(0xb4, float:2.52E-43)
                r0[r2] = r1
                r2 = 181(0xb5, float:2.54E-43)
                r0[r2] = r1
                r2 = 182(0xb6, float:2.55E-43)
                r0[r2] = r1
                r2 = 183(0xb7, float:2.56E-43)
                r0[r2] = r1
                r2 = 184(0xb8, float:2.58E-43)
                r0[r2] = r1
                r2 = 185(0xb9, float:2.59E-43)
                r0[r2] = r1
                r2 = 186(0xba, float:2.6E-43)
                r0[r2] = r1
                r2 = 187(0xbb, float:2.62E-43)
                r0[r2] = r1
                r2 = 188(0xbc, float:2.63E-43)
                r0[r2] = r1
                r2 = 189(0xbd, float:2.65E-43)
                r0[r2] = r1
                r2 = 190(0xbe, float:2.66E-43)
                r0[r2] = r1
                r2 = 191(0xbf, float:2.68E-43)
                r0[r2] = r1
                r2 = 192(0xc0, float:2.69E-43)
                r0[r2] = r1
                r2 = 193(0xc1, float:2.7E-43)
                r0[r2] = r1
                r2 = 194(0xc2, float:2.72E-43)
                r0[r2] = r1
                r2 = 195(0xc3, float:2.73E-43)
                r0[r2] = r1
                r2 = 196(0xc4, float:2.75E-43)
                r0[r2] = r1
                r2 = 197(0xc5, float:2.76E-43)
                r0[r2] = r1
                r2 = 198(0xc6, float:2.77E-43)
                r0[r2] = r1
                r2 = 199(0xc7, float:2.79E-43)
                r0[r2] = r1
                r2 = 200(0xc8, float:2.8E-43)
                r0[r2] = r1
                r2 = 201(0xc9, float:2.82E-43)
                r0[r2] = r1
                r2 = 202(0xca, float:2.83E-43)
                r0[r2] = r1
                r2 = 203(0xcb, float:2.84E-43)
                r0[r2] = r1
                r2 = 204(0xcc, float:2.86E-43)
                r0[r2] = r1
                r2 = 205(0xcd, float:2.87E-43)
                r0[r2] = r1
                r2 = 206(0xce, float:2.89E-43)
                r0[r2] = r1
                r2 = 207(0xcf, float:2.9E-43)
                r0[r2] = r1
                r2 = 208(0xd0, float:2.91E-43)
                r0[r2] = r1
                r2 = 209(0xd1, float:2.93E-43)
                r0[r2] = r1
                r2 = 210(0xd2, float:2.94E-43)
                r0[r2] = r1
                r2 = 211(0xd3, float:2.96E-43)
                r0[r2] = r1
                r2 = 212(0xd4, float:2.97E-43)
                r0[r2] = r1
                r2 = 213(0xd5, float:2.98E-43)
                r0[r2] = r1
                r2 = 214(0xd6, float:3.0E-43)
                r0[r2] = r1
                r2 = 215(0xd7, float:3.01E-43)
                r0[r2] = r1
                r2 = 216(0xd8, float:3.03E-43)
                r0[r2] = r1
                r2 = 217(0xd9, float:3.04E-43)
                r0[r2] = r1
                r2 = 218(0xda, float:3.05E-43)
                r0[r2] = r1
                r2 = 219(0xdb, float:3.07E-43)
                r0[r2] = r1
                r2 = 220(0xdc, float:3.08E-43)
                r0[r2] = r1
                r2 = 221(0xdd, float:3.1E-43)
                r0[r2] = r1
                r2 = 222(0xde, float:3.11E-43)
                r0[r2] = r1
                r2 = 223(0xdf, float:3.12E-43)
                r0[r2] = r1
                r2 = 224(0xe0, float:3.14E-43)
                r0[r2] = r1
                r2 = 225(0xe1, float:3.15E-43)
                r0[r2] = r1
                r2 = 226(0xe2, float:3.17E-43)
                r0[r2] = r1
                r2 = 227(0xe3, float:3.18E-43)
                r0[r2] = r1
                r2 = 228(0xe4, float:3.2E-43)
                r0[r2] = r1
                r2 = 229(0xe5, float:3.21E-43)
                r0[r2] = r1
                r2 = 230(0xe6, float:3.22E-43)
                r0[r2] = r1
                r2 = 231(0xe7, float:3.24E-43)
                r0[r2] = r1
                r2 = 232(0xe8, float:3.25E-43)
                r0[r2] = r1
                r2 = 233(0xe9, float:3.27E-43)
                r0[r2] = r1
                r2 = 234(0xea, float:3.28E-43)
                r0[r2] = r1
                r2 = 235(0xeb, float:3.3E-43)
                r0[r2] = r1
                r2 = 236(0xec, float:3.31E-43)
                r0[r2] = r1
                r2 = 237(0xed, float:3.32E-43)
                r0[r2] = r1
                r2 = 238(0xee, float:3.34E-43)
                r0[r2] = r1
                r2 = 239(0xef, float:3.35E-43)
                r0[r2] = r1
                r2 = 240(0xf0, float:3.36E-43)
                r0[r2] = r1
                r2 = 241(0xf1, float:3.38E-43)
                r0[r2] = r1
                r2 = 242(0xf2, float:3.39E-43)
                r0[r2] = r1
                r2 = 243(0xf3, float:3.4E-43)
                r0[r2] = r1
                r2 = 244(0xf4, float:3.42E-43)
                r0[r2] = r1
                r2 = 245(0xf5, float:3.43E-43)
                r0[r2] = r1
                r2 = 246(0xf6, float:3.45E-43)
                r0[r2] = r1
                r2 = 247(0xf7, float:3.46E-43)
                r0[r2] = r1
                r2 = 248(0xf8, float:3.48E-43)
                r0[r2] = r1
                r2 = 249(0xf9, float:3.49E-43)
                r0[r2] = r1
                r2 = 250(0xfa, float:3.5E-43)
                r0[r2] = r1
                r2 = 251(0xfb, float:3.52E-43)
                r0[r2] = r1
                r2 = 252(0xfc, float:3.53E-43)
                r0[r2] = r1
                r2 = 253(0xfd, float:3.55E-43)
                r0[r2] = r1
                r2 = 254(0xfe, float:3.56E-43)
                r0[r2] = r1
                r2 = 255(0xff, float:3.57E-43)
                r0[r2] = r1
                f810b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p022ta.utdid2.p024b.p025a.C1049b.C1051b.<clinit>():void");
        }

        public C1051b(int i, byte[] bArr) {
            this.f808b = bArr;
            this.f811c = (i & 8) == 0 ? f809a : f810b;
            this.state = 0;
            this.value = 0;
        }

        /* renamed from: a */
        public boolean mo12925a(byte[] bArr, int i, int i2, boolean z) {
            int i3 = this.state;
            if (i3 == 6) {
                return false;
            }
            int i4 = i2 + i;
            int i5 = this.value;
            byte[] bArr2 = this.f808b;
            int[] iArr = this.f811c;
            int i6 = 0;
            int i7 = i5;
            int i8 = i3;
            int i9 = i;
            while (i9 < i4) {
                if (i8 == 0) {
                    while (true) {
                        int i10 = i9 + 4;
                        if (i10 > i4) {
                            break;
                        }
                        i7 = iArr[bArr[i9 + 3] & UByte.MAX_VALUE] | (iArr[bArr[i9 + 1] & UByte.MAX_VALUE] << 12) | (iArr[bArr[i9] & UByte.MAX_VALUE] << 18) | (iArr[bArr[i9 + 2] & UByte.MAX_VALUE] << 6);
                        if (i7 < 0) {
                            break;
                        }
                        bArr2[i6 + 2] = (byte) i7;
                        bArr2[i6 + 1] = (byte) (i7 >> 8);
                        bArr2[i6] = (byte) (i7 >> 16);
                        i6 += 3;
                        i9 = i10;
                    }
                    if (i9 >= i4) {
                        break;
                    }
                }
                int i11 = i9 + 1;
                int i12 = iArr[bArr[i9] & UByte.MAX_VALUE];
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 == 4) {
                                    if (i12 != -2) {
                                        if (i12 != -1) {
                                            this.state = 6;
                                            return false;
                                        }
                                    }
                                    i8++;
                                } else if (i8 == 5 && i12 != -1) {
                                    this.state = 6;
                                    return false;
                                }
                            } else if (i12 >= 0) {
                                i7 = (i7 << 6) | i12;
                                bArr2[i6 + 2] = (byte) i7;
                                bArr2[i6 + 1] = (byte) (i7 >> 8);
                                bArr2[i6] = (byte) (i7 >> 16);
                                i6 += 3;
                                i8 = 0;
                            } else if (i12 == -2) {
                                bArr2[i6 + 1] = (byte) (i7 >> 2);
                                bArr2[i6] = (byte) (i7 >> 10);
                                i6 += 2;
                                i9 = i11;
                                i8 = 5;
                            } else if (i12 != -1) {
                                this.state = 6;
                                return false;
                            }
                        } else if (i12 < 0) {
                            if (i12 == -2) {
                                bArr2[i6] = (byte) (i7 >> 4);
                                i6++;
                                i9 = i11;
                                i8 = 4;
                            } else if (i12 != -1) {
                                this.state = 6;
                                return false;
                            }
                        }
                    } else if (i12 < 0) {
                        if (i12 != -1) {
                            this.state = 6;
                            return false;
                        }
                    }
                    i7 = (i7 << 6) | i12;
                    i8++;
                } else if (i12 >= 0) {
                    i8++;
                    i7 = i12;
                } else if (i12 != -1) {
                    this.state = 6;
                    return false;
                }
                i9 = i11;
            }
            if (!z) {
                this.state = i8;
                this.value = i7;
                this.f807a = i6;
                return true;
            } else if (i8 != 1) {
                if (i8 == 2) {
                    bArr2[i6] = (byte) (i7 >> 4);
                    i6++;
                } else if (i8 == 3) {
                    int i13 = i6 + 1;
                    bArr2[i6] = (byte) (i7 >> 10);
                    i6 = i13 + 1;
                    bArr2[i13] = (byte) (i7 >> 2);
                } else if (i8 == 4) {
                    this.state = 6;
                    return false;
                }
                this.state = i8;
                this.f807a = i6;
                return true;
            } else {
                this.state = 6;
                return false;
            }
        }
    }

    public static String encodeToString(byte[] bArr, int i) {
        try {
            return new String(encode(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] encode(byte[] bArr, int i) {
        return encode(bArr, 0, bArr.length, i);
    }

    public static byte[] encode(byte[] bArr, int i, int i2, int i3) {
        C1052c cVar = new C1052c(i3, (byte[]) null);
        int i4 = (i2 / 3) * 4;
        int i5 = 2;
        if (!cVar.f816b) {
            int i6 = i2 % 3;
            if (i6 == 1) {
                i4 += 2;
            } else if (i6 == 2) {
                i4 += 3;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (cVar.f817c && i2 > 0) {
            int i7 = ((i2 - 1) / 57) + 1;
            if (!cVar.f818d) {
                i5 = 1;
            }
            i4 += i7 * i5;
        }
        cVar.f808b = new byte[i4];
        cVar.mo12926a(bArr, i, i2, true);
        if (f806a || cVar.f807a == i4) {
            return cVar.f808b;
        }
        throw new AssertionError();
    }

    /* renamed from: com.ta.utdid2.b.a.b$c */
    /* compiled from: Base64 */
    static class C1052c extends C1050a {

        /* renamed from: a */
        static final /* synthetic */ boolean f812a = (!C1049b.class.desiredAssertionStatus());

        /* renamed from: c */
        private static final byte[] f813c = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: d */
        private static final byte[] f814d = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: b */
        int f815b;

        /* renamed from: b */
        public final boolean f816b;

        /* renamed from: c */
        public final boolean f817c;
        private int count;

        /* renamed from: d */
        public final boolean f818d;

        /* renamed from: e */
        private final byte[] f819e;

        /* renamed from: f */
        private final byte[] f820f;

        public C1052c(int i, byte[] bArr) {
            this.f808b = bArr;
            boolean z = true;
            this.f816b = (i & 1) == 0;
            this.f817c = (i & 2) == 0;
            this.f818d = (i & 4) == 0 ? false : z;
            this.f820f = (i & 8) == 0 ? f813c : f814d;
            this.f819e = new byte[2];
            this.f815b = 0;
            this.count = this.f817c ? 19 : -1;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0096  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0173  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0186  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x01b4  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0094 A[SYNTHETIC] */
        /* renamed from: a */
        public boolean mo12926a(byte[] r18, int r19, int r20, boolean r21) {
            /*
                r17 = this;
                r0 = r17
                byte[] r1 = r0.f820f
                byte[] r2 = r0.f808b
                int r3 = r0.count
                int r4 = r20 + r19
                int r5 = r0.f815b
                r6 = -1
                r7 = 0
                r8 = 2
                r9 = 1
                if (r5 == r9) goto L_0x0031
                if (r5 == r8) goto L_0x0015
                goto L_0x0050
            L_0x0015:
                int r5 = r19 + 1
                if (r5 > r4) goto L_0x0050
                byte[] r10 = r0.f819e
                byte r11 = r10[r7]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 16
                byte r10 = r10[r9]
                r10 = r10 & 255(0xff, float:3.57E-43)
                int r10 = r10 << 8
                r10 = r10 | r11
                byte r11 = r18[r19]
                r11 = r11 & 255(0xff, float:3.57E-43)
                r10 = r10 | r11
                r0.f815b = r7
                r11 = r5
                goto L_0x0053
            L_0x0031:
                int r5 = r19 + 2
                if (r5 > r4) goto L_0x0050
                byte[] r5 = r0.f819e
                byte r5 = r5[r7]
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << 16
                int r10 = r19 + 1
                byte r11 = r18[r19]
                r11 = r11 & 255(0xff, float:3.57E-43)
                int r11 = r11 << 8
                r5 = r5 | r11
                int r11 = r10 + 1
                byte r10 = r18[r10]
                r10 = r10 & 255(0xff, float:3.57E-43)
                r10 = r10 | r5
                r0.f815b = r7
                goto L_0x0053
            L_0x0050:
                r11 = r19
                r10 = r6
            L_0x0053:
                r12 = 4
                r13 = 13
                r14 = 10
                if (r10 == r6) goto L_0x008f
                int r6 = r10 >> 18
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r7] = r6
                int r6 = r10 >> 12
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r9] = r6
                int r6 = r10 >> 6
                r6 = r6 & 63
                byte r6 = r1[r6]
                r2[r8] = r6
                r6 = r10 & 63
                byte r6 = r1[r6]
                r10 = 3
                r2[r10] = r6
                int r3 = r3 + -1
                if (r3 != 0) goto L_0x008d
                boolean r3 = r0.f818d
                if (r3 == 0) goto L_0x0085
                r3 = 5
                r2[r12] = r13
                goto L_0x0086
            L_0x0085:
                r3 = r12
            L_0x0086:
                int r6 = r3 + 1
                r2[r3] = r14
            L_0x008a:
                r3 = 19
                goto L_0x0090
            L_0x008d:
                r6 = r12
                goto L_0x0090
            L_0x008f:
                r6 = r7
            L_0x0090:
                int r10 = r11 + 3
                if (r10 <= r4) goto L_0x01b4
                if (r21 == 0) goto L_0x0186
                int r10 = r0.f815b
                int r15 = r11 - r10
                int r5 = r4 + -1
                r16 = 61
                if (r15 != r5) goto L_0x00e7
                if (r10 <= 0) goto L_0x00a8
                byte[] r5 = r0.f819e
                byte r5 = r5[r7]
                r7 = r9
                goto L_0x00ae
            L_0x00a8:
                int r5 = r11 + 1
                byte r8 = r18[r11]
                r11 = r5
                r5 = r8
            L_0x00ae:
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << r12
                int r8 = r0.f815b
                int r8 = r8 - r7
                r0.f815b = r8
                int r7 = r6 + 1
                int r8 = r5 >> 6
                r8 = r8 & 63
                byte r8 = r1[r8]
                r2[r6] = r8
                int r6 = r7 + 1
                r5 = r5 & 63
                byte r1 = r1[r5]
                r2[r7] = r1
                boolean r1 = r0.f816b
                if (r1 == 0) goto L_0x00d4
                int r1 = r6 + 1
                r2[r6] = r16
                int r6 = r1 + 1
                r2[r1] = r16
            L_0x00d4:
                boolean r1 = r0.f817c
                if (r1 == 0) goto L_0x016a
                boolean r1 = r0.f818d
                if (r1 == 0) goto L_0x00e1
                int r1 = r6 + 1
                r2[r6] = r13
                r6 = r1
            L_0x00e1:
                int r1 = r6 + 1
                r2[r6] = r14
                goto L_0x0169
            L_0x00e7:
                int r5 = r11 - r10
                int r12 = r4 + -2
                if (r5 != r12) goto L_0x0152
                if (r10 <= r9) goto L_0x00f5
                byte[] r5 = r0.f819e
                byte r5 = r5[r7]
                r7 = r9
                goto L_0x00fb
            L_0x00f5:
                int r5 = r11 + 1
                byte r10 = r18[r11]
                r11 = r5
                r5 = r10
            L_0x00fb:
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << r14
                int r10 = r0.f815b
                if (r10 <= 0) goto L_0x0109
                byte[] r10 = r0.f819e
                int r12 = r7 + 1
                byte r7 = r10[r7]
                goto L_0x0110
            L_0x0109:
                int r10 = r11 + 1
                byte r11 = r18[r11]
                r12 = r7
                r7 = r11
                r11 = r10
            L_0x0110:
                r7 = r7 & 255(0xff, float:3.57E-43)
                int r7 = r7 << r8
                r5 = r5 | r7
                int r7 = r0.f815b
                int r7 = r7 - r12
                r0.f815b = r7
                int r7 = r6 + 1
                int r8 = r5 >> 12
                r8 = r8 & 63
                byte r8 = r1[r8]
                r2[r6] = r8
                int r6 = r7 + 1
                int r8 = r5 >> 6
                r8 = r8 & 63
                byte r8 = r1[r8]
                r2[r7] = r8
                int r7 = r6 + 1
                r5 = r5 & 63
                byte r1 = r1[r5]
                r2[r6] = r1
                boolean r1 = r0.f816b
                if (r1 == 0) goto L_0x013e
                int r1 = r7 + 1
                r2[r7] = r16
                r7 = r1
            L_0x013e:
                boolean r1 = r0.f817c
                if (r1 == 0) goto L_0x0150
                boolean r1 = r0.f818d
                if (r1 == 0) goto L_0x014b
                int r1 = r7 + 1
                r2[r7] = r13
                r7 = r1
            L_0x014b:
                int r1 = r7 + 1
                r2[r7] = r14
                goto L_0x0169
            L_0x0150:
                r6 = r7
                goto L_0x016a
            L_0x0152:
                boolean r1 = r0.f817c
                if (r1 == 0) goto L_0x016a
                if (r6 <= 0) goto L_0x016a
                r5 = 19
                if (r3 == r5) goto L_0x016a
                boolean r1 = r0.f818d
                if (r1 == 0) goto L_0x0165
                int r1 = r6 + 1
                r2[r6] = r13
                r6 = r1
            L_0x0165:
                int r1 = r6 + 1
                r2[r6] = r14
            L_0x0169:
                r6 = r1
            L_0x016a:
                boolean r1 = f812a
                if (r1 != 0) goto L_0x0179
                int r1 = r0.f815b
                if (r1 != 0) goto L_0x0173
                goto L_0x0179
            L_0x0173:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            L_0x0179:
                boolean r1 = f812a
                if (r1 != 0) goto L_0x01af
                if (r11 != r4) goto L_0x0180
                goto L_0x01af
            L_0x0180:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
            L_0x0186:
                int r1 = r4 + -1
                if (r11 != r1) goto L_0x0197
                byte[] r1 = r0.f819e
                int r2 = r0.f815b
                int r4 = r2 + 1
                r0.f815b = r4
                byte r4 = r18[r11]
                r1[r2] = r4
                goto L_0x01af
            L_0x0197:
                int r4 = r4 - r8
                if (r11 != r4) goto L_0x01af
                byte[] r1 = r0.f819e
                int r2 = r0.f815b
                int r4 = r2 + 1
                r0.f815b = r4
                byte r5 = r18[r11]
                r1[r2] = r5
                int r2 = r4 + 1
                r0.f815b = r2
                int r11 = r11 + r9
                byte r2 = r18[r11]
                r1[r4] = r2
            L_0x01af:
                r0.f807a = r6
                r0.count = r3
                return r9
            L_0x01b4:
                r5 = 19
                byte r15 = r18[r11]
                r15 = r15 & 255(0xff, float:3.57E-43)
                int r15 = r15 << 16
                int r16 = r11 + 1
                byte r5 = r18[r16]
                r5 = r5 & 255(0xff, float:3.57E-43)
                int r5 = r5 << 8
                r5 = r5 | r15
                int r11 = r11 + 2
                byte r11 = r18[r11]
                r11 = r11 & 255(0xff, float:3.57E-43)
                r5 = r5 | r11
                int r11 = r5 >> 18
                r11 = r11 & 63
                byte r11 = r1[r11]
                r2[r6] = r11
                int r11 = r6 + 1
                int r15 = r5 >> 12
                r15 = r15 & 63
                byte r15 = r1[r15]
                r2[r11] = r15
                int r11 = r6 + 2
                int r15 = r5 >> 6
                r15 = r15 & 63
                byte r15 = r1[r15]
                r2[r11] = r15
                int r11 = r6 + 3
                r5 = r5 & 63
                byte r5 = r1[r5]
                r2[r11] = r5
                int r6 = r6 + 4
                int r3 = r3 + -1
                if (r3 != 0) goto L_0x0207
                boolean r3 = r0.f818d
                if (r3 == 0) goto L_0x01ff
                int r3 = r6 + 1
                r2[r6] = r13
                r6 = r3
            L_0x01ff:
                int r3 = r6 + 1
                r2[r6] = r14
                r6 = r3
                r11 = r10
                goto L_0x008a
            L_0x0207:
                r11 = r10
                goto L_0x0090
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p022ta.utdid2.p024b.p025a.C1049b.C1052c.mo12926a(byte[], int, int, boolean):boolean");
        }
    }

    private C1049b() {
    }
}
