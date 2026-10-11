package defpackage;

import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class jy5 {
    public static void a(hm6 hm6Var, String[] strArr) {
        boolean z;
        boolean z2;
        ArrayList u0;
        hm6Var.getClass();
        List S0 = ms.S0(strArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = S0.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            } else {
                dp0.Y(uz5.h0((String) it.next(), new char[]{'/'}, 6), arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList(zo0.V(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            str.getClass();
            arrayList2.add(lo0.g(2, str));
        }
        if (hm6Var.h.size() > 1 && ((CharSequence) yo0.r0(hm6Var.h)).length() == 0 && !arrayList2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (arrayList2.size() > 1 && ((CharSequence) yo0.k0(arrayList2)).length() == 0 && !hm6Var.h.isEmpty()) {
            z = true;
        }
        if (z2 && z) {
            u0 = yo0.u0(yo0.g0(arrayList2, 1), yo0.h0(hm6Var.h));
        } else {
            List list = hm6Var.h;
            if (z2) {
                u0 = yo0.u0(arrayList2, yo0.h0(list));
            } else if (z) {
                u0 = yo0.u0(yo0.g0(arrayList2, 1), list);
            } else {
                u0 = yo0.u0(arrayList2, list);
            }
        }
        hm6Var.h = u0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0017. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.hm6 r4, java.lang.StringBuilder r5) {
        /*
            jm6 r0 = r4.d()
            java.lang.String r0 = r0.x
            r5.append(r0)
            jm6 r0 = r4.d()
            java.lang.String r0 = r0.x
            int r1 = r0.hashCode()
            java.lang.String r2 = "://"
            java.lang.String r3 = ":"
            switch(r1) {
                case -1081572750: goto L7e;
                case 114715: goto L6c;
                case 3076010: goto L5a;
                case 3143036: goto L2d;
                case 92611469: goto L1b;
                default: goto L1a;
            }
        L1a:
            goto L86
        L1b:
            java.lang.String r1 = "about"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24
            goto L86
        L24:
            java.lang.String r4 = r4.a
            r5.append(r3)
            r5.append(r4)
            return
        L2d:
            java.lang.String r1 = "file"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L86
        L36:
            java.lang.String r0 = r4.a
            java.lang.String r1 = f(r4)
            r5.append(r2)
            r5.append(r0)
            r0 = 47
            boolean r2 = defpackage.uz5.k0(r1, r0)
            if (r2 != 0) goto L4d
            r5.append(r0)
        L4d:
            r5.append(r1)
            kk2 r0 = r4.i
            boolean r1 = r4.b
            java.lang.String r2 = ""
            defpackage.fz5.d(r5, r2, r0, r1)
            goto L9b
        L5a:
            java.lang.String r1 = "data"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            goto L86
        L63:
            java.lang.String r4 = r4.a
            r5.append(r3)
            r5.append(r4)
            return
        L6c:
            java.lang.String r1 = "tel"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L75
            goto L86
        L75:
            java.lang.String r4 = r4.a
            r5.append(r3)
            r5.append(r4)
            return
        L7e:
            java.lang.String r1 = "mailto"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto Lae
        L86:
            r5.append(r2)
            java.lang.String r0 = e(r4)
            r5.append(r0)
            java.lang.String r0 = f(r4)
            kk2 r1 = r4.i
            boolean r2 = r4.b
            defpackage.fz5.d(r5, r0, r1, r2)
        L9b:
            java.lang.String r0 = r4.g
            int r0 = r0.length()
            if (r0 <= 0) goto Lad
            r0 = 35
            r5.append(r0)
            java.lang.String r4 = r4.g
            r5.append(r4)
        Lad:
            return
        Lae:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.e
            java.lang.String r2 = r4.f
            if (r1 != 0) goto Lba
            goto Lcc
        Lba:
            r0.append(r1)
            if (r2 == 0) goto Lc7
            r1 = 58
            r0.append(r1)
            r0.append(r2)
        Lc7:
            java.lang.String r1 = "@"
            r0.append(r1)
        Lcc:
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = r4.a
            r5.append(r3)
            r5.append(r0)
            r5.append(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jy5.b(hm6, java.lang.StringBuilder):void");
    }

    public static final aj5 c(uj5 uj5Var, aj5 aj5Var) {
        aj5 c;
        aj5Var.getClass();
        uj5Var.getClass();
        if (a34.i(aj5Var.getKind(), fj5.a)) {
            aj5 contextualDescriptor = oz0.getContextualDescriptor(uj5Var, aj5Var);
            if (contextualDescriptor != null && (c = c(uj5Var, contextualDescriptor)) != null) {
                return c;
            }
        } else if (aj5Var.isInline()) {
            return c(uj5Var, aj5Var.h(0));
        }
        return aj5Var;
    }

    public static final void d(ni2 ni2Var, fr6 fr6Var) {
        ArrayList arrayList = fr6Var.G;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hr6 hr6Var = (hr6) arrayList.get(i);
            if (hr6Var instanceof jr6) {
                rj4 rj4Var = new rj4();
                jr6 jr6Var = (jr6) hr6Var;
                rj4Var.d = jr6Var.y;
                rj4Var.n = true;
                rj4Var.c();
                rj4Var.s.f(jr6Var.z);
                rj4Var.c();
                rj4Var.c();
                rj4Var.b = jr6Var.A;
                rj4Var.c();
                rj4Var.c = jr6Var.B;
                rj4Var.c();
                rj4Var.g = jr6Var.C;
                rj4Var.c();
                rj4Var.e = jr6Var.D;
                rj4Var.c();
                rj4Var.f = jr6Var.E;
                rj4Var.o = true;
                rj4Var.c();
                rj4Var.h = jr6Var.F;
                rj4Var.o = true;
                rj4Var.c();
                rj4Var.i = jr6Var.G;
                rj4Var.o = true;
                rj4Var.c();
                rj4Var.j = jr6Var.H;
                rj4Var.o = true;
                rj4Var.c();
                rj4Var.k = jr6Var.I;
                rj4Var.p = true;
                rj4Var.c();
                rj4Var.l = jr6Var.J;
                rj4Var.p = true;
                rj4Var.c();
                rj4Var.m = jr6Var.K;
                rj4Var.p = true;
                rj4Var.c();
                ni2Var.e(i, rj4Var);
            } else if (hr6Var instanceof fr6) {
                ni2 ni2Var2 = new ni2();
                fr6 fr6Var2 = (fr6) hr6Var;
                ni2Var2.k = fr6Var2.x;
                ni2Var2.c();
                ni2Var2.l = fr6Var2.y;
                ni2Var2.s = true;
                ni2Var2.c();
                ni2Var2.o = fr6Var2.B;
                ni2Var2.s = true;
                ni2Var2.c();
                ni2Var2.p = fr6Var2.C;
                ni2Var2.s = true;
                ni2Var2.c();
                ni2Var2.q = fr6Var2.D;
                ni2Var2.s = true;
                ni2Var2.c();
                ni2Var2.r = fr6Var2.E;
                ni2Var2.s = true;
                ni2Var2.c();
                ni2Var2.m = fr6Var2.z;
                ni2Var2.s = true;
                ni2Var2.c();
                ni2Var2.n = fr6Var2.A;
                ni2Var2.s = true;
                ni2Var2.c();
                ni2Var2.f = fr6Var2.F;
                ni2Var2.g = true;
                ni2Var2.c();
                d(ni2Var2, fr6Var2);
                ni2Var.e(i, ni2Var2);
            }
        }
    }

    public static final String e(hm6 hm6Var) {
        StringBuilder sb = new StringBuilder();
        String str = hm6Var.e;
        String str2 = hm6Var.f;
        if (str != null) {
            sb.append(str);
            if (str2 != null) {
                sb.append(':');
                sb.append(str2);
            }
            sb.append("@");
        }
        StringBuilder sb2 = new StringBuilder(sb.toString());
        sb2.append(hm6Var.a);
        int i = hm6Var.c;
        if (i != 0 && i != hm6Var.d().y) {
            sb2.append(":");
            sb2.append(String.valueOf(hm6Var.c));
        }
        return sb2.toString();
    }

    public static final String f(hm6 hm6Var) {
        List list = hm6Var.h;
        if (list.isEmpty()) {
            return "";
        }
        if (list.size() == 1) {
            if (((CharSequence) yo0.k0(list)).length() == 0) {
                return "/";
            }
            return (String) yo0.k0(list);
        }
        return yo0.q0(list, "/", null, null, null, 62);
    }

    public static eb2 g(String str) {
        int i;
        String str2;
        boolean I = b06.I(str, "HTTP/1.", false);
        iw4 iw4Var = iw4.HTTP_1_0;
        if (I) {
            i = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        iw4Var = iw4.HTTP_1_1;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (b06.I(str, "ICY ", false)) {
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() > i2) {
                    if (str.charAt(i2) == ' ') {
                        str2 = str.substring(i + 4);
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = "";
                }
                return new eb2(iw4Var, parseInt, str2, (byte) 12);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    public static final void h(hm6 hm6Var, String str) {
        List arrayList;
        hm6Var.getClass();
        str.getClass();
        if (uz5.V(str)) {
            arrayList = nt1.x;
        } else if (str.equals("/")) {
            arrayList = im6.a;
        } else {
            arrayList = new ArrayList(uz5.h0(str, new char[]{'/'}, 6));
        }
        arrayList.getClass();
        hm6Var.h = arrayList;
    }

    public static final i97 i(y43 y43Var, aj5 aj5Var) {
        aj5Var.getClass();
        hj5 kind = aj5Var.getKind();
        if (kind instanceof er4) {
            return i97.C;
        }
        boolean i = a34.i(kind, f06.b);
        i97 i97Var = i97.A;
        if (i) {
            return i97Var;
        }
        if (a34.i(kind, f06.c)) {
            aj5 c = c(y43Var.b, aj5Var.h(0));
            hj5 kind2 = c.getKind();
            if (!(kind2 instanceof xt4) && !a34.i(kind2, gj5.a)) {
                if (y43Var.a.d) {
                    return i97Var;
                }
                throw iv.g(c);
            }
            return i97.B;
        }
        return i97.z;
    }

    public static void j(int i, int i2) {
        String k;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                ze0.k(h11.g(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
                return;
            }
            k = ez5.k("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            k = ez5.k("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(k);
    }

    public static void k(int i, int i2) {
        if (i >= 0 && i <= i2) {
            return;
        }
        ze0.g(m("index", i, i2));
    }

    public static void l(int i, int i2, int i3) {
        String m;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                m = ez5.k("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                m = m("end index", i2, i3);
            }
        } else {
            m = m("start index", i, i3);
        }
        throw new IndexOutOfBoundsException(m);
    }

    public static String m(String str, int i, int i2) {
        if (i < 0) {
            return ez5.k("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return ez5.k("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        ze0.k(h11.g(i2, "negative size: ", new StringBuilder(String.valueOf(i2).length() + 15)));
        return null;
    }
}
