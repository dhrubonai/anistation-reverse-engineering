package defpackage;

import android.R;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ListIterator;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class n03 {
    public static Context a;
    public static Boolean b;
    public static final py3 k;
    public static final py3 l;
    public static final py3 m;
    public static final int[] c = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] d = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] e = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] f = {R.attr.name, R.attr.pathData};
    public static final os0 g = new os0(-707958804, false, new qs0(28));
    public static final os0 h = new os0(-2129179893, false, new qs0(29));
    public static final os0 i = new os0(947375323, false, new ps0(16));
    public static final os0 j = new os0(597817764, false, new ps0(17));
    public static final byte[] n = {48, 49, 53, 0};
    public static final byte[] o = {48, 49, 48, 0};
    public static final byte[] p = {48, 48, 57, 0};
    public static final byte[] q = {48, 48, 53, 0};
    public static final byte[] r = {48, 48, 49, 0};
    public static final byte[] s = {48, 48, 49, 0};
    public static final byte[] t = {48, 48, 50, 0};
    public static final Object u = new Object();
    public static final String[] v = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    public static final String[] w = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    public static final String[] x = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    static {
        int i2 = 2;
        k = new py3(1, i2, (byte) 10);
        int i3 = 3;
        l = new py3(i2, i3, (byte) 11);
        m = new py3(i3, 4, (byte) 12);
    }

    public static final boolean A(zt5 zt5Var, ub2 ub2Var) {
        int i2;
        n2 n2Var;
        Object invoke;
        ft5 h2;
        boolean j2;
        do {
            synchronized (u) {
                vx5 vx5Var = zt5Var.x;
                vx5Var.getClass();
                vx5 vx5Var2 = (vx5) mt5.f(vx5Var);
                i2 = vx5Var2.d;
                n2Var = vx5Var2.c;
            }
            n2Var.getClass();
            ml4 g2 = n2Var.g();
            invoke = ub2Var.invoke(g2);
            n2 d2 = g2.d();
            if (a34.i(d2, n2Var)) {
                break;
            }
            vx5 vx5Var3 = zt5Var.x;
            vx5Var3.getClass();
            synchronized (mt5.c) {
                h2 = mt5.h();
                j2 = j((vx5) mt5.w(vx5Var3, zt5Var, h2), i2, d2, true);
            }
            mt5.l(h2, zt5Var);
        } while (!j2);
        return ((Boolean) invoke).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qe0 B(defpackage.ik2 r26) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n03.B(ik2):qe0");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
    
        if (r6 == (-1)) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c6, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ok2 C(java.lang.String r19) {
        /*
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()
            java.io.StringReader r1 = new java.io.StringReader
            r2 = r19
            r1.<init>(r2)
            r0.setInput(r1)
            r0.next()
            java.lang.String r1 = "x:xmpmeta"
            boolean r2 = defpackage.ez5.h(r0, r1)
            r3 = 0
            if (r2 == 0) goto Lcd
            z62 r2 = defpackage.nw2.y
            o15 r2 = defpackage.o15.B
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r4
        L28:
            r0.next()
            java.lang.String r8 = "rdf:Description"
            boolean r8 = defpackage.ez5.h(r0, r8)
            r9 = 1
            if (r8 == 0) goto L99
            r2 = 0
            r6 = r2
        L36:
            r7 = 4
            if (r6 >= r7) goto Lc6
            java.lang.String[] r8 = defpackage.n03.v
            r8 = r8[r6]
            java.lang.String r8 = defpackage.ez5.e(r0, r8)
            if (r8 == 0) goto L96
            int r6 = java.lang.Integer.parseInt(r8)
            if (r6 != r9) goto Lc6
            r6 = r2
        L4a:
            if (r6 >= r7) goto L60
            java.lang.String[] r8 = defpackage.n03.w
            r8 = r8[r6]
            java.lang.String r8 = defpackage.ez5.e(r0, r8)
            if (r8 == 0) goto L62
            long r6 = java.lang.Long.parseLong(r8)
            r10 = -1
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 != 0) goto L65
        L60:
            r6 = r4
            goto L65
        L62:
            int r6 = r6 + 1
            goto L4a
        L65:
            r8 = 2
            if (r2 >= r8) goto L91
            java.lang.String[] r8 = defpackage.n03.x
            r8 = r8[r2]
            java.lang.String r8 = defpackage.ez5.e(r0, r8)
            if (r8 == 0) goto L8e
            long r11 = java.lang.Long.parseLong(r8)
            v04 r13 = new v04
            r14 = 0
            r17 = 0
            java.lang.String r16 = "image/jpeg"
            r13.<init>(r14, r16, r17)
            r2 = r13
            v04 r10 = new v04
            java.lang.String r13 = "video/mp4"
            r10.<init>(r11, r13, r14)
            o15 r2 = defpackage.nw2.t(r2, r10)
            goto Lba
        L8e:
            int r2 = r2 + 1
            goto L65
        L91:
            z62 r2 = defpackage.nw2.y
            o15 r2 = defpackage.o15.B
            goto Lba
        L96:
            int r6 = r6 + 1
            goto L36
        L99:
            java.lang.String r8 = "Container:Directory"
            boolean r8 = defpackage.ez5.h(r0, r8)
            if (r8 == 0) goto Laa
            java.lang.String r2 = "Container"
            java.lang.String r8 = "Item"
            o15 r2 = D(r0, r2, r8)
            goto Lba
        Laa:
            java.lang.String r8 = "GContainer:Directory"
            boolean r8 = defpackage.ez5.h(r0, r8)
            if (r8 == 0) goto Lba
            java.lang.String r2 = "GContainer"
            java.lang.String r8 = "GContainerItem"
            o15 r2 = D(r0, r2, r8)
        Lba:
            boolean r8 = defpackage.ez5.f(r0, r1)
            if (r8 == 0) goto L28
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Lc7
        Lc6:
            return r3
        Lc7:
            ok2 r0 = new ok2
            r0.<init>(r6, r2, r9)
            return r0
        Lcd:
            java.lang.String r0 = "Couldn't find xmp metadata"
            bj4 r0 = defpackage.bj4.a(r0, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n03.C(java.lang.String):ok2");
    }

    public static o15 D(XmlPullParser xmlPullParser, String str, String str2) {
        long j2;
        jw2 k2 = nw2.k();
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (ez5.h(xmlPullParser, concat)) {
                String concat3 = str2.concat(":Mime");
                String concat4 = str2.concat(":Semantic");
                String concat5 = str2.concat(":Length");
                String concat6 = str2.concat(":Padding");
                String e2 = ez5.e(xmlPullParser, concat3);
                String e3 = ez5.e(xmlPullParser, concat4);
                String e4 = ez5.e(xmlPullParser, concat5);
                String e5 = ez5.e(xmlPullParser, concat6);
                if (e2 != null && e3 != null) {
                    long j3 = 0;
                    if (e4 != null) {
                        j2 = Long.parseLong(e4);
                    } else {
                        j2 = 0;
                    }
                    if (e5 != null) {
                        j3 = Long.parseLong(e5);
                    }
                    k2.c(new v04(j2, e2, j3));
                } else {
                    return o15.B;
                }
            }
        } while (!ez5.f(xmlPullParser, concat2));
        return k2.g();
    }

    public static int E(yi0 yi0Var, int i2, int i3, int i4) {
        boolean z;
        if (Math.max(Math.max(i2, i3), i4) <= 31) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        int i5 = (1 << i2) - 1;
        int i6 = (1 << i3) - 1;
        oi4.j(oi4.j(i5, i6), 1 << i4);
        if (yi0Var.b() >= i2) {
            int g2 = yi0Var.g(i2);
            if (g2 == i5) {
                if (yi0Var.b() >= i3) {
                    int g3 = yi0Var.g(i3);
                    g2 += g3;
                    if (g3 == i6) {
                        if (yi0Var.b() < i4) {
                            return -1;
                        }
                        return yi0Var.g(i4) + g2;
                    }
                } else {
                    return -1;
                }
            }
            return g2;
        }
        return -1;
    }

    public static final k95 F(kd2 kd2Var) {
        kd2Var.e0(1967007413);
        Object[] objArr = new Object[0];
        Object Q = kd2Var.Q();
        if (Q == au0.a) {
            Q = new r75((byte) 14);
            kd2Var.n0(Q);
        }
        k95 k95Var = (k95) oi4.D(objArr, k95.B, (sb2) Q, kd2Var, 384);
        k95Var.z = (n95) kd2Var.j(p95.a);
        kd2Var.q(false);
        return k95Var;
    }

    public static void G(yi0 yi0Var) {
        yi0Var.o(3);
        yi0Var.o(8);
        boolean f2 = yi0Var.f();
        boolean f3 = yi0Var.f();
        if (f2) {
            yi0Var.o(5);
        }
        if (f3) {
            yi0Var.o(6);
        }
    }

    public static void H(yi0 yi0Var) {
        int i2;
        int g2;
        int g3 = yi0Var.g(2);
        int i3 = 6;
        if (g3 == 0) {
            yi0Var.o(6);
            return;
        }
        int i4 = 5;
        int E = E(yi0Var, 5, 8, 16) + 1;
        if (g3 == 1) {
            yi0Var.o(E * 7);
            return;
        }
        if (g3 == 2) {
            boolean f2 = yi0Var.f();
            if (f2) {
                i2 = 1;
            } else {
                i2 = 5;
            }
            if (f2) {
                i4 = 7;
            }
            if (f2) {
                i3 = 8;
            }
            int i5 = 0;
            while (i5 < E) {
                if (yi0Var.f()) {
                    yi0Var.o(7);
                    g2 = 0;
                } else {
                    if (yi0Var.g(2) == 3 && yi0Var.g(i4) * i2 != 0) {
                        yi0Var.n();
                    }
                    g2 = yi0Var.g(i3) * i2;
                    if (g2 != 0 && g2 != 180) {
                        yi0Var.n();
                    }
                    yi0Var.n();
                }
                if (g2 != 0 && g2 != 180 && yi0Var.f()) {
                    i5++;
                }
                i5++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean I(defpackage.c12 r12, boolean r13) {
        /*
            zi4 r0 = new zi4
            r1 = 16
            r0.<init>(r1)
            r2 = 1
            r3 = r2
        L9:
            r4 = 8
            r0.K(r4)
            byte[] r5 = r0.a
            r6 = 0
            boolean r5 = r12.j(r5, r6, r4, r2)
            if (r5 != 0) goto L18
            goto L68
        L18:
            long r7 = r0.C()
            int r5 = r0.m()
            r9 = 1
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L38
            byte[] r7 = r0.a
            boolean r7 = r12.j(r7, r4, r4, r2)
            if (r7 != 0) goto L2f
            goto L68
        L2f:
            r0.M(r1)
            long r7 = r0.G()
            r9 = r1
            goto L39
        L38:
            r9 = r4
        L39:
            long r9 = (long) r9
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L3f
            goto L68
        L3f:
            long r7 = r7 - r9
            int r7 = (int) r7
            if (r3 == 0) goto L69
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r5 != r3) goto L68
            if (r7 >= r4) goto L4b
            goto L68
        L4b:
            r3 = 4
            r0.K(r3)
            byte[] r4 = r0.a
            r12.A(r4, r6, r3)
            int r3 = r0.m()
            r4 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 == r4) goto L5e
            goto L68
        L5e:
            if (r13 != 0) goto L61
            goto L6e
        L61:
            int r7 = r7 + (-4)
            r12.l(r7)
            r3 = r6
            goto L9
        L68:
            return r6
        L69:
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r5 != r4) goto L6f
        L6e:
            return r2
        L6f:
            if (r7 == 0) goto L9
            r12.l(r7)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n03.I(c12, boolean):boolean");
    }

    public static String J(Throwable th) {
        th.getClass();
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        stringWriter2.getClass();
        return stringWriter2;
    }

    public static final void K(int i2, int i3) {
        if (i2 >= 0 && i2 < i3) {
            return;
        }
        ze0.g(qx1.l("index (", i2, ") is out of bound of [0, ", i3, ")"));
    }

    public static ml a(float f2, float f3, int i2) {
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new ml(db.l, Float.valueOf(f2), new nl(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.yz3 r16, defpackage.th4 r17, long r18, long r20, defpackage.om5 r22, defpackage.os0 r23, defpackage.kd2 r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n03.b(yz3, th4, long, long, om5, os0, kd2, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r19, defpackage.yz3 r20, defpackage.th4 r21, long r22, defpackage.s70 r24, long r25, defpackage.xd6 r27, defpackage.om5 r28, defpackage.kd2 r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n03.c(java.lang.String, yz3, th4, long, s70, long, xd6, om5, kd2, int, int):void");
    }

    public static final void d(String str, String str2, yz3 yz3Var, kd2 kd2Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        kd2Var.f0(1224084748);
        if ((i2 & 6) == 0) {
            if (kd2Var.f(str)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.f(str2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.f(yz3Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
        }
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            yz3 h2 = bx7.h(yz3Var, ep0.b, io3.h);
            vo3 c2 = b90.c(pk2.C, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l2 = kd2Var.l();
            yz3 E = o80.E(kd2Var, h2);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c2);
            ss5.i(p7.E, kd2Var, l2);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            tl7.a(str, str2, ar5.c, pk2.O, kd2Var, (i3 & 14) | 1573248 | (i3 & 112));
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            u2.d = new je((byte) 3, i2, (Object) str, (Object) str2, (Object) yz3Var);
        }
    }

    public static final long e(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final void f(os0 os0Var, kd2 kd2Var, int i2) {
        boolean z;
        kd2Var.f0(-709502251);
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            tq1 tq1Var = p95.a;
            n95 n95Var = (n95) kd2Var.j(tq1Var);
            k95 F = F(kd2Var);
            Object[] objArr = {n95Var};
            y23 y23Var = new y23(new st0((byte) 27), new r82(n95Var, F, (byte) 7), (byte) 14);
            boolean h2 = kd2Var.h(n95Var) | kd2Var.h(F);
            Object Q = kd2Var.Q();
            if (h2 || Q == au0.a) {
                Q = new va1(n95Var, F, (byte) 16);
                kd2Var.n0(Q);
            }
            df3 df3Var = (df3) oi4.D(objArr, y23Var, (sb2) Q, kd2Var, 0);
            kb0.b(tq1Var.a(df3Var), nx7.R(-412824043, new q(os0Var, df3Var, (byte) 26), kd2Var), kd2Var, 56);
        } else {
            kd2Var.Y();
        }
        zz4 u2 = kd2Var.u();
        if (u2 != null) {
            u2.d = new k(os0Var, i2, (byte) 4);
        }
    }

    public static final n05 g(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new n05(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3));
    }

    public static final uh5 h(za3 za3Var, boolean z) {
        xz3 xz3Var = (xz3) za3Var.c0.D;
        yc1 yc1Var = null;
        if ((xz3Var.A & 8) != 0) {
            loop0: while (true) {
                if (xz3Var == null) {
                    break;
                }
                if ((xz3Var.z & 8) != 0) {
                    xz3 xz3Var2 = xz3Var;
                    z44 z44Var = null;
                    while (xz3Var2 != null) {
                        if (xz3Var2 instanceof sh5) {
                            yc1Var = xz3Var2;
                            break loop0;
                        }
                        if ((xz3Var2.z & 8) != 0 && (xz3Var2 instanceof zc1)) {
                            int i2 = 0;
                            for (xz3 xz3Var3 = ((zc1) xz3Var2).M; xz3Var3 != null; xz3Var3 = xz3Var3.C) {
                                if ((xz3Var3.z & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        xz3Var2 = xz3Var3;
                                    } else {
                                        if (z44Var == null) {
                                            z44Var = new z44(new xz3[16], 0);
                                        }
                                        if (xz3Var2 != null) {
                                            z44Var.b(xz3Var2);
                                            xz3Var2 = null;
                                        }
                                        z44Var.b(xz3Var3);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        xz3Var2 = wc7.J(z44Var);
                    }
                }
                if ((xz3Var.A & 8) == 0) {
                    break;
                }
                xz3Var = xz3Var.C;
            }
        }
        yc1Var.getClass();
        xz3 xz3Var4 = ((xz3) ((sh5) yc1Var)).x;
        ph5 x2 = za3Var.x();
        if (x2 == null) {
            x2 = new ph5();
        }
        return new uh5(xz3Var4, z, za3Var, x2);
    }

    public static void i(Throwable th, Throwable th2) {
        boolean z;
        th.getClass();
        th2.getClass();
        if (th != th2) {
            Integer num = x33.a;
            if (num != null && num.intValue() < 19) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                th.addSuppressed(th2);
                return;
            }
            Method method = nm4.a;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final boolean j(vx5 vx5Var, int i2, n2 n2Var, boolean z) {
        boolean z2;
        synchronized (u) {
            try {
                int i3 = vx5Var.d;
                if (i3 == i2) {
                    vx5Var.c = n2Var;
                    z2 = true;
                    if (z) {
                        vx5Var.e++;
                    }
                    vx5Var.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static final yz3 k(yz3 yz3Var, om5 om5Var) {
        return io3.P(yz3Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, om5Var, true, 0L, 0L, 1042431);
    }

    public static final yz3 l(yz3 yz3Var) {
        return io3.P(yz3Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, 0L, 0L, 1044479);
    }

    public static ml m(ml mlVar, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = ((Number) mlVar.y.getValue()).floatValue();
        }
        if ((i2 & 2) != 0) {
            f3 = ((nl) mlVar.z).a;
        }
        return new ml(mlVar.x, Float.valueOf(f2), new nl(f3), mlVar.A, mlVar.B, mlVar.C);
    }

    public static final void n(g85 g85Var) {
        g85Var.getClass();
        ai3 y = te4.y();
        m85 s0 = g85Var.s0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (s0.p0()) {
            try {
                y.add(s0.c0(0));
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    o80.r(s0, th);
                    throw th2;
                }
            }
        }
        o80.r(s0, null);
        ListIterator listIterator = te4.r(y).listIterator(0);
        while (true) {
            gl2 gl2Var = (gl2) listIterator;
            if (gl2Var.hasNext()) {
                String str = (String) gl2Var.next();
                if (b06.I(str, "room_fts_content_sync_", false)) {
                    zz.y("DROP TRIGGER IF EXISTS ".concat(str), g85Var);
                }
            } else {
                return;
            }
        }
    }

    public static long o(int i2, int i3, int i4, int i5) {
        int min;
        int i6;
        int i7 = 262142;
        int min2 = Math.min(i4, 262142);
        int i8 = Integer.MAX_VALUE;
        if (i5 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i5, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i6 = min2;
        } else {
            i6 = min;
        }
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i7 = 65534;
            } else if (i6 < 65535) {
                i7 = 32766;
            } else if (i6 < 262143) {
                i7 = 8190;
            } else {
                sx0.k(i6);
                v71.e();
                return 0L;
            }
        }
        if (i3 != Integer.MAX_VALUE) {
            i8 = Math.min(i7, i3);
        }
        return sx0.a(Math.min(i7, i2), i8, min2, min);
    }

    public static long p(int i2, int i3, int i4, int i5) {
        int min;
        int i6;
        int i7 = 262142;
        int min2 = Math.min(i2, 262142);
        int i8 = Integer.MAX_VALUE;
        if (i3 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i3, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i6 = min2;
        } else {
            i6 = min;
        }
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i7 = 65534;
            } else if (i6 < 65535) {
                i7 = 32766;
            } else if (i6 < 262143) {
                i7 = 8190;
            } else {
                sx0.k(i6);
                v71.e();
                return 0L;
            }
        }
        if (i5 != Integer.MAX_VALUE) {
            i8 = Math.min(i7, i5);
        }
        return sx0.a(min2, min, Math.min(i7, i4), i8);
    }

    public static final yz3 q(yz3 yz3Var, boolean z, u34 u34Var) {
        yz3 yz3Var2;
        if (z) {
            yz3Var2 = new l82(u34Var);
        } else {
            yz3Var2 = vz3.x;
        }
        return yz3Var.w(yz3Var2);
    }

    public static mp0 r(kd2 kd2Var) {
        return (mp0) kd2Var.j(op0.a);
    }

    public static final int s(KeyEvent keyEvent) {
        int i2;
        int i3;
        boolean isAltPressed = keyEvent.isAltPressed();
        boolean isCtrlPressed = keyEvent.isCtrlPressed();
        boolean isMetaPressed = keyEvent.isMetaPressed();
        boolean isShiftPressed = keyEvent.isShiftPressed();
        int i4 = 0;
        if (isCtrlPressed) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        int i5 = (isAltPressed ? 1 : 0) | i2;
        if (isMetaPressed) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        int i6 = i5 | i3;
        if (isShiftPressed) {
            i4 = 8;
        }
        return i6 | i4;
    }

    public static final ClipboardManager t(kn0 kn0Var) {
        if (kn0Var instanceof x9) {
            return ((x9) kn0Var).a.s();
        }
        ze0.e(zo5.l("Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received ", z05.a(kn0Var.getClass()).e()));
        return null;
    }

    public static final sr4 u(View view) {
        sr4 sr4Var = (sr4) view.getTag(com.anistation.android.R.id.pooling_container_listener_holder_tag);
        if (sr4Var == null) {
            sr4 sr4Var2 = new sr4();
            view.setTag(com.anistation.android.R.id.pooling_container_listener_holder_tag, sr4Var2);
            return sr4Var2;
        }
        return sr4Var;
    }

    public static final vx5 v(zt5 zt5Var) {
        vx5 vx5Var = zt5Var.x;
        vx5Var.getClass();
        return (vx5) mt5.s(vx5Var, zt5Var);
    }

    public static cn5 w(kd2 kd2Var) {
        return (cn5) kd2Var.j(dn5.a);
    }

    public static final int x(zt5 zt5Var) {
        vx5 vx5Var = zt5Var.x;
        vx5Var.getClass();
        return ((vx5) mt5.f(vx5Var)).e;
    }

    public static nl6 y(kd2 kd2Var) {
        return (nl6) kd2Var.j(pl6.a);
    }

    public static synchronized boolean z(Context context) {
        Boolean bool;
        synchronized (n03.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool = b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            b = null;
            Boolean valueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            b = valueOf;
            a = applicationContext;
            return valueOf.booleanValue();
        }
    }
}
