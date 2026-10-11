package defpackage;

import android.os.Bundle;
import android.os.Trace;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Pair;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class gv5 {
    public static ou0 a(ou0 ou0Var, oq5 oq5Var, dj6 dj6Var) {
        nw2 nw2Var;
        int i;
        long j;
        boolean z;
        ou0 b = ou0Var.b();
        nw2 nw2Var2 = ou0Var.b;
        ArrayList arrayList = new ArrayList();
        if (dj6Var != null) {
            nw2Var = dj6Var.b;
        } else {
            nw2Var = null;
        }
        for (int i2 = 0; i2 < nw2Var2.size(); i2++) {
            o15 o15Var = ((rr1) nw2Var2.get(i2)).a;
            ArrayList arrayList2 = new ArrayList();
            if (nw2Var != null) {
                i = ((Integer) ((Pair) nw2Var.get(i2)).first).intValue();
                j = ((Long) ((Pair) nw2Var.get(i2)).second).longValue();
            } else {
                i = 0;
                j = 0;
            }
            for (int i3 = i; i3 < o15Var.A; i3++) {
                qr1 qr1Var = (qr1) o15Var.get(i3);
                pr1 a = qr1Var.a();
                ar3 ar3Var = qr1Var.a;
                if (i3 == i) {
                    oq3 a2 = ar3Var.e.a();
                    long U = eq6.U(eq6.l0(j) + ar3Var.e.a);
                    if (U >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    io3.n(z);
                    a2.a = U;
                    pq3 pq3Var = new pq3(a2);
                    nq3 a3 = ar3Var.a();
                    a3.f = pq3Var.a();
                    a.a = a3.a();
                }
                arrayList2.add(new qr1(a));
            }
            rt3 rt3Var = new rt3(oq5Var);
            ((jw2) rt3Var.y).d(arrayList2);
            arrayList.add(new rr1(rt3Var));
        }
        b.c(arrayList);
        return b.a();
    }

    public static final String b(oa0 oa0Var, long j) {
        if (j == 0) {
            return "";
        }
        yf5 yf5Var = oa0Var.x;
        if (yf5Var != null) {
            if (yf5Var.b() >= j) {
                byte[] bArr = yf5Var.a;
                int i = yf5Var.b;
                String a = lz5.a(bArr, i, Math.min(yf5Var.c, ((int) j) + i));
                oa0Var.skip(j);
                return a;
            }
            byte[] o = nv5.o(oa0Var, (int) j);
            return lz5.a(o, 0, o.length);
        }
        ze0.m("Unreacheable");
        return null;
    }

    public static final int c(oa0 oa0Var) {
        int i;
        int i2;
        int i3;
        oa0Var.m(1L);
        byte a = oa0Var.a(0L);
        if ((a & 128) == 0) {
            i = a & Byte.MAX_VALUE;
            i3 = 0;
            i2 = 1;
        } else if ((a & 224) == 192) {
            i = a & 31;
            i2 = 2;
            i3 = 128;
        } else if ((a & 240) == 224) {
            i = a & 15;
            i2 = 3;
            i3 = 2048;
        } else if ((a & 248) == 240) {
            i = a & 7;
            i2 = 4;
            i3 = 65536;
        } else {
            oa0Var.skip(1L);
            return 65533;
        }
        long j = i2;
        if (oa0Var.z >= j) {
            for (int i4 = 1; i4 < i2; i4++) {
                long j2 = i4;
                byte a2 = oa0Var.a(j2);
                if ((a2 & 192) == 128) {
                    i = (i << 6) | (a2 & 63);
                } else {
                    oa0Var.skip(j2);
                    return 65533;
                }
            }
            oa0Var.skip(j);
            if (i > 1114111) {
                return 65533;
            }
            if ((55296 <= i && i < 57344) || i < i3) {
                return 65533;
            }
            return i;
        }
        StringBuilder s = qx1.s(i2, "size < ", ": ");
        s.append(oa0Var.z);
        s.append(" (to read code point prefixed 0x");
        char[] cArr = q23.h;
        s.append(new String(new char[]{cArr[(a >> 4) & 15], cArr[a & 15]}));
        s.append(')');
        throw new EOFException(s.toString());
    }

    public static final ko d(mc6 mc6Var) {
        ko koVar = mc6Var.a;
        long j = mc6Var.b;
        koVar.getClass();
        return koVar.subSequence(nd6.g(j), nd6.f(j));
    }

    public static final ko e(mc6 mc6Var, int i) {
        ko koVar = mc6Var.a;
        ko koVar2 = mc6Var.a;
        long j = mc6Var.b;
        int f = nd6.f(j);
        int f2 = nd6.f(j);
        int i2 = f2 + i;
        if (((i ^ i2) & (f2 ^ i2)) < 0) {
            i2 = koVar2.y.length();
        }
        return koVar.subSequence(f, Math.min(i2, koVar2.y.length()));
    }

    public static final ko f(mc6 mc6Var, int i) {
        ko koVar = mc6Var.a;
        long j = mc6Var.b;
        int g = nd6.g(j);
        int i2 = g - i;
        if (((g ^ i2) & (i ^ g)) < 0) {
            i2 = 0;
        }
        return koVar.subSequence(Math.max(0, i2), nd6.g(j));
    }

    public static int g(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i != 8) {
                if (i == 16) {
                    return 4;
                }
                if (i != 32) {
                    if (i != 64) {
                        if (i != 128) {
                            if (i == 256) {
                                return 8;
                            }
                            if (i == 512) {
                                return 9;
                            }
                            ze0.k(qx1.h(i, "type needs to be >= FIRST and <= LAST, type="));
                            return 0;
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }

    public static void h(a31 a31Var) {
        a31Var.k = -3.4028235E38f;
        a31Var.j = Integer.MIN_VALUE;
        CharSequence charSequence = a31Var.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                charSequence = SpannableString.valueOf(charSequence);
                a31Var.a = charSequence;
                a31Var.b = null;
            }
            charSequence.getClass();
            Spannable spannable = (Spannable) charSequence;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float i(int i, float f, int i2, int i3) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        } else {
            f2 = i3;
        }
        return f * f2;
    }

    public static final void j(qq5 qq5Var, int i) {
        String str;
        oa0 oa0Var = (oa0) qq5Var;
        if (i >= 0 && i <= 1114111) {
            if (i < 128) {
                oa0Var.l0((byte) i);
                return;
            }
            if (i < 2048) {
                yf5 T = oa0Var.T(2);
                byte[] bArr = T.a;
                int i2 = T.c;
                bArr[i2] = (byte) ((i >> 6) | 192);
                bArr[i2 + 1] = (byte) ((i & 63) | 128);
                T.c = i2 + 2;
                oa0Var.z += 2;
                return;
            }
            if (55296 <= i && i < 57344) {
                oa0Var.l0((byte) 63);
                return;
            }
            if (i < 65536) {
                yf5 T2 = oa0Var.T(3);
                byte[] bArr2 = T2.a;
                int i3 = T2.c;
                bArr2[i3] = -32;
                bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i3 + 2] = (byte) ((i & 63) | 128);
                T2.c = i3 + 3;
                oa0Var.z += 3;
                return;
            }
            yf5 T3 = oa0Var.T(4);
            byte[] bArr3 = T3.a;
            int i4 = T3.c;
            bArr3[i4] = -16;
            bArr3[i4 + 1] = Byte.MIN_VALUE;
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | 128);
            bArr3[i4 + 3] = (byte) ((i & 63) | 128);
            T3.c = i4 + 4;
            oa0Var.z += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Code point value is out of Unicode codespace 0..0x10ffff: 0x");
        if (i != 0) {
            char[] cArr = q23.h;
            int i5 = 0;
            char c = cArr[0];
            char[] cArr2 = {c, c, c, c, c, c, cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            str = b06.x(cArr2, i5, 8);
        } else {
            str = "0";
        }
        sb.append(str);
        sb.append(" (");
        sb.append(i);
        sb.append(')');
        throw new IllegalArgumentException(sb.toString());
    }

    public static final void k(qq5 qq5Var, String str, int i, int i2) {
        char charAt;
        long j;
        long j2;
        char c;
        str.getClass();
        q23.j(str.length(), i, i2);
        oa0 oa0Var = (oa0) qq5Var;
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                yf5 T = oa0Var.T(1);
                byte[] bArr = T.a;
                int i3 = -i;
                int min = Math.min(i2, T.a() + i);
                int i4 = i + 1;
                bArr[T.c + i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[T.c + i + i3] = (byte) charAt;
                }
                int i5 = i3 + i;
                if (i5 == 1) {
                    T.c += i5;
                    oa0Var.z += i5;
                } else if (i5 >= 0 && i5 <= T.a()) {
                    if (i5 != 0) {
                        T.c += i5;
                        oa0Var.z += i5;
                    } else if (db.Z(T)) {
                        oa0Var.t();
                    }
                } else {
                    StringBuilder s = qx1.s(i5, "Invalid number of bytes written: ", ". Should be in 0..");
                    s.append(T.a());
                    throw new IllegalStateException(s.toString().toString());
                }
            } else {
                if (charAt2 < 2048) {
                    yf5 T2 = oa0Var.T(2);
                    byte[] bArr2 = T2.a;
                    int i6 = T2.c;
                    bArr2[i6] = (byte) ((charAt2 >> 6) | 192);
                    bArr2[i6 + 1] = (byte) ((charAt2 & '?') | 128);
                    T2.c = i6 + 2;
                    j = oa0Var.z;
                    j2 = 2;
                } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                    int i7 = i + 1;
                    if (i7 < i2) {
                        c = str.charAt(i7);
                    } else {
                        c = 0;
                    }
                    if (charAt2 <= 56319 && 56320 <= c && c < 57344) {
                        int i8 = (((charAt2 & 1023) << 10) | (c & 1023)) + 65536;
                        yf5 T3 = oa0Var.T(4);
                        byte[] bArr3 = T3.a;
                        int i9 = T3.c;
                        bArr3[i9] = (byte) ((i8 >> 18) | 240);
                        bArr3[i9 + 1] = (byte) (((i8 >> 12) & 63) | 128);
                        bArr3[i9 + 2] = (byte) (((i8 >> 6) & 63) | 128);
                        bArr3[i9 + 3] = (byte) ((i8 & 63) | 128);
                        T3.c = i9 + 4;
                        oa0Var.z += 4;
                        i += 2;
                    } else {
                        oa0Var.l0((byte) 63);
                        i = i7;
                    }
                } else {
                    yf5 T4 = oa0Var.T(3);
                    byte[] bArr4 = T4.a;
                    int i10 = T4.c;
                    bArr4[i10] = (byte) ((charAt2 >> '\f') | 224);
                    bArr4[i10 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                    bArr4[i10 + 2] = (byte) ((charAt2 & '?') | 128);
                    T4.c = i10 + 3;
                    j = oa0Var.z;
                    j2 = 3;
                }
                oa0Var.z = j + j2;
                i++;
            }
        }
    }

    public static Map l(Bundle bundle, String str) {
        Map map = (Map) bundle.getSerializable(str);
        if (map == null) {
            return su7.D;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null && entry.getKey() != null && entry.getValue() != null) {
                hashMap.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public static void m(h78 h78Var) {
        if (!o(h78Var) && h78Var.x != null) {
            m(h78Var.x);
            p(h78Var);
        } else {
            Trace.beginSection(h78Var.z);
            p(h78Var);
        }
    }

    public static void n(h78 h78Var) {
        if (!o(h78Var) && h78Var.x != null) {
            Trace.endSection();
            n(h78Var.x);
        } else {
            Trace.endSection();
            Trace.endSection();
        }
    }

    public static boolean o(h78 h78Var) {
        if (h78Var.B != Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static void p(h78 h78Var) {
        String str = h78Var.A;
        AtomicReference atomicReference = q78.a;
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }
}
