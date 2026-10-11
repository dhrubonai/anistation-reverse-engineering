package defpackage;

import com.discord.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xd6 {
    public static final xd6 d = new xd6(0, 0, null, null, 0, 0, 0, 0, 16777215);
    public final pv5 a;
    public final hi4 b;
    public final kn4 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xd6(long r26, long r28, defpackage.s92 r30, defpackage.v82 r31, long r32, int r34, int r35, long r36, int r38) {
        /*
            r25 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto La
            long r1 = defpackage.ep0.i
            r4 = r1
            goto Lc
        La:
            r4 = r26
        Lc:
            r1 = r0 & 2
            if (r1 == 0) goto L14
            long r1 = defpackage.ee6.c
            r6 = r1
            goto L16
        L14:
            r6 = r28
        L16:
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L1d
            r8 = r2
            goto L1f
        L1d:
            r8 = r30
        L1f:
            r1 = r0 & 32
            if (r1 == 0) goto L25
            r11 = r2
            goto L27
        L25:
            r11 = r31
        L27:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L2f
            long r9 = defpackage.ee6.c
            r13 = r9
            goto L31
        L2f:
            r13 = r32
        L31:
            long r18 = defpackage.ep0.i
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            r3 = 0
            if (r1 == 0) goto L3c
            r1 = r3
            goto L3e
        L3c:
            r1 = r34
        L3e:
            r9 = 65536(0x10000, float:9.1835E-41)
            r9 = r9 & r0
            if (r9 == 0) goto L46
            r22 = r3
            goto L48
        L46:
            r22 = r35
        L48:
            r3 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L52
            long r9 = defpackage.ee6.c
            r23 = r9
            goto L54
        L52:
            r23 = r36
        L54:
            pv5 r3 = new pv5
            r9 = 0
            r10 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r3.<init>(r4, r6, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18, r20, r21)
            hi4 r0 = new hi4
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r26 = r0
            r27 = r1
            r32 = r2
            r31 = r4
            r33 = r5
            r34 = r6
            r35 = r7
            r36 = r8
            r28 = r22
            r29 = r23
            r26.<init>(r27, r28, r29, r31, r32, r33, r34, r35, r36)
            r1 = 0
            r2 = r25
            r2.<init>(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd6.<init>(long, long, s92, v82, long, int, int, long, int):void");
    }

    public static xd6 a(xd6 xd6Var, long j, s92 s92Var, q82 q82Var, long j2, km5 km5Var, long j3, lh3 lh3Var, int i) {
        long j4;
        s92 s92Var2;
        q82 q82Var2;
        String str;
        long j5;
        km5 km5Var2;
        int i2;
        int i3;
        bb4 bb4Var;
        long j6;
        kn4 kn4Var;
        lh3 lh3Var2;
        nc6 nc6Var;
        um4 um4Var;
        kn4 kn4Var2 = x97.D;
        long a = xd6Var.a.a.a();
        if ((i & 2) != 0) {
            j4 = xd6Var.a.b;
        } else {
            j4 = j;
        }
        if ((i & 4) != 0) {
            s92Var2 = xd6Var.a.c;
        } else {
            s92Var2 = s92Var;
        }
        pv5 pv5Var = xd6Var.a;
        o92 o92Var = pv5Var.d;
        p92 p92Var = pv5Var.e;
        if ((i & 32) != 0) {
            q82Var2 = pv5Var.f;
        } else {
            q82Var2 = q82Var;
        }
        if ((i & 64) != 0) {
            str = pv5Var.g;
        } else {
            str = "tnum";
        }
        String str2 = str;
        if ((i & 128) != 0) {
            j5 = pv5Var.h;
        } else {
            j5 = j2;
        }
        z30 z30Var = pv5Var.i;
        oc6 oc6Var = pv5Var.j;
        fk3 fk3Var = pv5Var.k;
        long j7 = pv5Var.l;
        g96 g96Var = pv5Var.m;
        if ((i & 8192) != 0) {
            km5Var2 = pv5Var.n;
        } else {
            km5Var2 = km5Var;
        }
        bb4 bb4Var2 = pv5Var.o;
        if ((i & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            i2 = xd6Var.b.a;
        } else {
            i2 = 3;
        }
        int i4 = i2;
        if ((i & 65536) != 0) {
            i3 = xd6Var.b.b;
        } else {
            i3 = 1;
        }
        int i5 = i3;
        if ((i & 131072) != 0) {
            bb4Var = bb4Var2;
            j6 = xd6Var.b.c;
        } else {
            bb4Var = bb4Var2;
            j6 = j3;
        }
        hi4 hi4Var = xd6Var.b;
        qc6 qc6Var = hi4Var.d;
        if ((i & 524288) != 0) {
            kn4Var = xd6Var.c;
        } else {
            kn4Var = kn4Var2;
        }
        if ((i & 1048576) != 0) {
            lh3Var2 = hi4Var.f;
        } else {
            lh3Var2 = lh3Var;
        }
        int i6 = hi4Var.g;
        int i7 = hi4Var.h;
        kd6 kd6Var = hi4Var.i;
        long a2 = pv5Var.a.a();
        int i8 = ep0.j;
        if (cm6.a(a, a2)) {
            nc6Var = pv5Var.a;
        } else if (a != 16) {
            nc6Var = new tp0(a);
        } else {
            nc6Var = nr1.Q;
        }
        pv5 pv5Var2 = new pv5(nc6Var, j4, s92Var2, o92Var, p92Var, q82Var2, str2, j5, z30Var, oc6Var, fk3Var, j7, g96Var, km5Var2, bb4Var);
        if (kn4Var != null) {
            um4Var = kn4Var.a;
        } else {
            um4Var = null;
        }
        return new xd6(pv5Var2, new hi4(i4, i5, j6, qc6Var, um4Var, lh3Var2, i6, i7, kd6Var), kn4Var);
    }

    public static xd6 e(xd6 xd6Var, long j, long j2, s92 s92Var, q82 q82Var, long j3, int i, long j4, int i2) {
        long j5;
        s92 s92Var2;
        q82 q82Var2;
        long j6;
        int i3;
        long j7;
        if ((i2 & 2) != 0) {
            j5 = ee6.c;
        } else {
            j5 = j2;
        }
        if ((i2 & 4) != 0) {
            s92Var2 = null;
        } else {
            s92Var2 = s92Var;
        }
        if ((i2 & 32) != 0) {
            q82Var2 = null;
        } else {
            q82Var2 = q82Var;
        }
        if ((i2 & 128) != 0) {
            j6 = ee6.c;
        } else {
            j6 = j3;
        }
        long j8 = ep0.i;
        if ((32768 & i2) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 131072) != 0) {
            j7 = ee6.c;
        } else {
            j7 = j4;
        }
        pv5 a = qv5.a(xd6Var.a, j, null, Float.NaN, j5, s92Var2, null, null, q82Var2, null, j6, null, null, null, j8, null, null, null);
        hi4 a2 = ii4.a(xd6Var.b, i3, 0, j7, null, null, null, 0, 0, null);
        if (xd6Var.a == a && xd6Var.b == a2) {
            return xd6Var;
        }
        return new xd6(a, a2);
    }

    public final long b() {
        return this.a.a.a();
    }

    public final boolean c(xd6 xd6Var) {
        if (this != xd6Var) {
            if (!a34.i(this.b, xd6Var.b) || !this.a.a(xd6Var.a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final xd6 d(xd6 xd6Var) {
        if (xd6Var != null && !xd6Var.equals(d)) {
            return new xd6(this.a.c(xd6Var.a), this.b.a(xd6Var.b));
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd6)) {
            return false;
        }
        xd6 xd6Var = (xd6) obj;
        if (a34.i(this.a, xd6Var.a) && a34.i(this.b, xd6Var.b) && a34.i(this.c, xd6Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        kn4 kn4Var = this.c;
        if (kn4Var != null) {
            i = kn4Var.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        String h = ep0.h(b());
        pv5 pv5Var = this.a;
        ka0 d2 = pv5Var.a.d();
        float e = pv5Var.a.e();
        String d3 = ee6.d(pv5Var.b);
        s92 s92Var = pv5Var.c;
        o92 o92Var = pv5Var.d;
        p92 p92Var = pv5Var.e;
        q82 q82Var = pv5Var.f;
        String str = pv5Var.g;
        String d4 = ee6.d(pv5Var.h);
        z30 z30Var = pv5Var.i;
        oc6 oc6Var = pv5Var.j;
        fk3 fk3Var = pv5Var.k;
        String h2 = ep0.h(pv5Var.l);
        g96 g96Var = pv5Var.m;
        km5 km5Var = pv5Var.n;
        bb4 bb4Var = pv5Var.o;
        hi4 hi4Var = this.b;
        String a = c86.a(hi4Var.a);
        String a2 = j96.a(hi4Var.b);
        String d5 = ee6.d(hi4Var.c);
        qc6 qc6Var = hi4Var.d;
        lh3 lh3Var = hi4Var.f;
        String a3 = fh3.a(hi4Var.g);
        String a4 = zs2.a(hi4Var.h);
        kd6 kd6Var = hi4Var.i;
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append(h);
        sb.append(", brush=");
        sb.append(d2);
        sb.append(", alpha=");
        sb.append(e);
        sb.append(", fontSize=");
        sb.append(d3);
        sb.append(", fontWeight=");
        sb.append(s92Var);
        sb.append(", fontStyle=");
        sb.append(o92Var);
        sb.append(", fontSynthesis=");
        sb.append(p92Var);
        sb.append(", fontFamily=");
        sb.append(q82Var);
        sb.append(", fontFeatureSettings=");
        qx1.x(sb, str, ", letterSpacing=", d4, ", baselineShift=");
        sb.append(z30Var);
        sb.append(", textGeometricTransform=");
        sb.append(oc6Var);
        sb.append(", localeList=");
        sb.append(fk3Var);
        sb.append(", background=");
        sb.append(h2);
        sb.append(", textDecoration=");
        sb.append(g96Var);
        sb.append(", shadow=");
        sb.append(km5Var);
        sb.append(", drawStyle=");
        sb.append(bb4Var);
        sb.append(", textAlign=");
        sb.append(a);
        sb.append(", textDirection=");
        qx1.x(sb, a2, ", lineHeight=", d5, ", textIndent=");
        sb.append(qc6Var);
        sb.append(", platformStyle=");
        sb.append(this.c);
        sb.append(", lineHeightStyle=");
        sb.append(lh3Var);
        sb.append(", lineBreak=");
        sb.append(a3);
        sb.append(", hyphens=");
        sb.append(a4);
        sb.append(", textMotion=");
        sb.append(kd6Var);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xd6(defpackage.pv5 r3, defpackage.hi4 r4) {
        /*
            r2 = this;
            r3.getClass()
            um4 r0 = r4.e
            if (r0 != 0) goto L9
            r0 = 0
            goto Lf
        L9:
            kn4 r1 = new kn4
            r1.<init>(r0)
            r0 = r1
        Lf:
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd6.<init>(pv5, hi4):void");
    }

    public xd6(pv5 pv5Var, hi4 hi4Var, kn4 kn4Var) {
        this.a = pv5Var;
        this.b = hi4Var;
        this.c = kn4Var;
    }
}
