package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.HashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s20 extends xz3 implements ra3, zo1, sh5, xq4, a04, vi4, fa3, hf2, g72, v72, y72, lh4, ib0 {
    public wz3 L;
    public r20 M;
    public HashSet N;

    @Override // defpackage.xq4
    public final boolean B0() {
        wz3 wz3Var = this.L;
        wz3Var.getClass();
        ((ar4) wz3Var).A.getClass();
        return true;
    }

    @Override // defpackage.v72
    public final void D(s72 s72Var) {
        wz3 wz3Var = this.L;
        ez2.b("applyFocusProperties called on wrong node");
        wz3Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.g72
    public final void G(d82 d82Var) {
        wz3 wz3Var = this.L;
        ez2.b("onFocusEvent called on wrong node");
        wz3Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
        wz3 wz3Var = this.L;
        wz3Var.getClass();
        ph5 L0 = ((qh5) wz3Var).L0();
        bi5Var.getClass();
        ph5 ph5Var = (ph5) bi5Var;
        p44 p44Var = ph5Var.x;
        if (L0.z) {
            ph5Var.z = true;
        }
        if (L0.A) {
            ph5Var.A = true;
        }
        p44 p44Var2 = L0.x;
        Object[] objArr = p44Var2.b;
        Object[] objArr2 = p44Var2.c;
        long[] jArr = p44Var2.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            ai5 ai5Var = (ai5) obj;
                            if (!p44Var.b(ai5Var)) {
                                p44Var.n(ai5Var, obj2);
                            } else if (obj2 instanceof o3) {
                                Object g = p44Var.g(ai5Var);
                                g.getClass();
                                o3 o3Var = (o3) g;
                                String str = o3Var.a;
                                if (str == null) {
                                    str = ((o3) obj2).a;
                                }
                                ec2 ec2Var = o3Var.b;
                                if (ec2Var == null) {
                                    ec2Var = ((o3) obj2).b;
                                }
                                p44Var.n(ai5Var, new o3(str, ec2Var));
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i != length) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.xq4
    public final void J() {
        wz3 wz3Var = this.L;
        wz3Var.getClass();
        zp2 zp2Var = ((ar4) wz3Var).A;
        zq4 zq4Var = (zq4) zp2Var.y;
        ar4 ar4Var = (ar4) zp2Var.A;
        if (zq4Var == zq4.y) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            ((dg) ar4Var.a()).invoke(obtain);
            obtain.recycle();
            zp2Var.y = zq4.x;
            ar4Var.z = false;
            zp2Var.z = null;
        }
    }

    @Override // defpackage.zo1
    public final void P() {
        v94.y(this);
    }

    @Override // defpackage.xq4
    public final void R() {
        wz3 wz3Var = this.L;
        wz3Var.getClass();
        ((ar4) wz3Var).A.getClass();
    }

    @Override // defpackage.xz3
    public final void S0() {
        a1(true);
    }

    @Override // defpackage.xz3
    public final void T0() {
        b1();
    }

    @Override // defpackage.a04
    public final iv Y() {
        r20 r20Var = this.M;
        if (r20Var != null) {
            return r20Var;
        }
        return pt1.m;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [r20, java.lang.Object] */
    public final void a1(boolean z) {
        if (!this.K) {
            ez2.b("initializeModifier called on unattached node");
        }
        wz3 wz3Var = this.L;
        if ((this.z & 32) != 0 && (wz3Var instanceof b04)) {
            b04 b04Var = (b04) wz3Var;
            kw4 kw4Var = sc1.a;
            r20 r20Var = this.M;
            if (r20Var != null && r20Var.r(kw4Var)) {
                r20Var.m = b04Var;
                zz3 modifierLocalManager = ((oa) wc7.P(this)).getModifierLocalManager();
                f44 f44Var = modifierLocalManager.b;
                if (f44Var == null) {
                    f44Var = new f44();
                    modifierLocalManager.b = f44Var;
                }
                f44Var.a(this);
                f44 f44Var2 = modifierLocalManager.c;
                if (f44Var2 == null) {
                    f44Var2 = new f44();
                    modifierLocalManager.c = f44Var2;
                }
                f44Var2.a(kw4Var);
                modifierLocalManager.a();
            } else {
                ?? obj = new Object();
                obj.m = b04Var;
                this.M = obj;
                z66 z66Var = (z66) wc7.O(this).c0.C;
                z66Var.getClass();
                if (z66Var.L) {
                    zz3 modifierLocalManager2 = ((oa) wc7.P(this)).getModifierLocalManager();
                    f44 f44Var3 = modifierLocalManager2.b;
                    if (f44Var3 == null) {
                        f44Var3 = new f44();
                        modifierLocalManager2.b = f44Var3;
                    }
                    f44Var3.a(this);
                    f44 f44Var4 = modifierLocalManager2.c;
                    if (f44Var4 == null) {
                        f44Var4 = new f44();
                        modifierLocalManager2.c = f44Var4;
                    }
                    f44Var4.a(kw4Var);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.z & 4) != 0 && !z) {
            wc7.M(this, 2).g1();
        }
        if ((this.z & 2) != 0) {
            z66 z66Var2 = (z66) wc7.O(this).c0.C;
            z66Var2.getClass();
            if (z66Var2.L) {
                fa4 fa4Var = this.E;
                fa4Var.getClass();
                ((ta3) fa4Var).C1(this);
                ih4 ih4Var = fa4Var.q0;
                if (ih4Var != null) {
                    ((fi2) ih4Var).c();
                }
            }
            if (!z) {
                wc7.M(this, 2).g1();
                wc7.O(this).F();
            }
        }
        if (wz3Var instanceof uc3) {
            uc3 uc3Var = (uc3) wz3Var;
            za3 O = wc7.O(this);
            switch (uc3Var.x) {
                case 0:
                    ((wc3) uc3Var.y).j = O;
                    break;
                default:
                    ((af3) uc3Var.y).l = O;
                    break;
            }
        }
        if ((this.z & 256) != 0 && (wz3Var instanceof va6)) {
            z66 z66Var3 = (z66) wc7.O(this).c0.C;
            z66Var3.getClass();
            if (z66Var3.L) {
                wc7.O(this).F();
            }
        }
        int i = this.z;
        if ((i & 16) != 0 && (wz3Var instanceof ar4)) {
            ((ar4) wz3Var).A.x = this.E;
        }
        if ((i & 8) != 0) {
            ((oa) wc7.P(this)).x();
        }
    }

    @Override // defpackage.ib0
    public final ud1 b() {
        return wc7.O(this).V;
    }

    @Override // defpackage.ra3
    public final int b0(yl3 yl3Var, ro3 ro3Var, int i) {
        wz3 wz3Var = this.L;
        wz3Var.getClass();
        return ((pa3) wz3Var).e(new x23(yl3Var, yl3Var.getLayoutDirection()), new i91(ro3Var, cp3.y, dp3.y, (byte) 1), sx0.b(0, i, 0, 0, 13)).getHeight();
    }

    public final void b1() {
        if (!this.K) {
            ez2.b("unInitializeModifier called on unattached node");
        }
        wz3 wz3Var = this.L;
        if ((this.z & 32) != 0 && (wz3Var instanceof b04)) {
            zz3 modifierLocalManager = ((oa) wc7.P(this)).getModifierLocalManager();
            kw4 kw4Var = sc1.a;
            f44 f44Var = modifierLocalManager.d;
            if (f44Var == null) {
                f44Var = new f44();
                modifierLocalManager.d = f44Var;
            }
            f44Var.a(wc7.O(this));
            f44 f44Var2 = modifierLocalManager.e;
            if (f44Var2 == null) {
                f44Var2 = new f44();
                modifierLocalManager.e = f44Var2;
            }
            f44Var2.a(kw4Var);
            modifierLocalManager.a();
        }
        if ((this.z & 8) != 0) {
            ((oa) wc7.P(this)).x();
        }
    }

    @Override // defpackage.vi4
    public final Object c(ud1 ud1Var, Object obj) {
        wz3 wz3Var = this.L;
        wz3Var.getClass();
        return ((ui4) wz3Var).c(ud1Var, obj);
    }

    public final void c1() {
        if (this.K) {
            this.N.clear();
            mh4 snapshotObserver = ((oa) wc7.P(this)).getSnapshotObserver();
            snapshotObserver.a.d(this, nx7.y, new y7(this, (byte) 20));
        }
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        wz3 wz3Var = this.L;
        wz3Var.getClass();
        return ((pa3) wz3Var).e(xo3Var, ro3Var, j);
    }

    @Override // defpackage.yc1, defpackage.xq4
    public final void f() {
        if (this.L instanceof ar4) {
            J();
        }
    }

    @Override // defpackage.hf2
    public final void f0(fa4 fa4Var) {
        wz3 wz3Var = this.L;
        wz3Var.getClass();
        ((va6) wz3Var).f0(fa4Var);
    }

    @Override // defpackage.ib0
    public final long g() {
        return m37.O(wc7.M(this, 128).z);
    }

    @Override // defpackage.ib0
    public final ia3 getLayoutDirection() {
        return wc7.O(this).W;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [xz3] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [xz3] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // defpackage.a04
    public final Object h() {
        kf kfVar;
        kw4 kw4Var = a34.t;
        this.N.add(kw4Var);
        if (!this.x.K) {
            ez2.b("visitAncestors called on an unattached node");
        }
        xz3 xz3Var = this.x.B;
        za3 O = wc7.O(this);
        while (O != null) {
            if ((((xz3) O.c0.D).A & 32) != 0) {
                while (xz3Var != null) {
                    if ((xz3Var.z & 32) != 0) {
                        zc1 zc1Var = xz3Var;
                        ?? r4 = 0;
                        while (zc1Var != 0) {
                            if (zc1Var instanceof a04) {
                                a04 a04Var = (a04) zc1Var;
                                if (a04Var.Y().r(kw4Var)) {
                                    return a04Var.Y().w(kw4Var);
                                }
                            } else if ((zc1Var.z & 32) != 0 && (zc1Var instanceof zc1)) {
                                xz3 xz3Var2 = zc1Var.M;
                                int i = 0;
                                zc1Var = zc1Var;
                                r4 = r4;
                                while (xz3Var2 != null) {
                                    if ((xz3Var2.z & 32) != 0) {
                                        i++;
                                        r4 = r4;
                                        if (i == 1) {
                                            zc1Var = xz3Var2;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new z44(new xz3[16], 0);
                                            }
                                            if (zc1Var != 0) {
                                                r4.b(zc1Var);
                                                zc1Var = 0;
                                            }
                                            r4.b(xz3Var2);
                                        }
                                    }
                                    xz3Var2 = xz3Var2.C;
                                    zc1Var = zc1Var;
                                    r4 = r4;
                                }
                                if (i == 1) {
                                }
                            }
                            zc1Var = wc7.J(r4);
                        }
                    }
                    xz3Var = xz3Var.B;
                }
            }
            O = O.v();
            if (O != null && (kfVar = O.c0) != null) {
                xz3Var = (z66) kfVar.C;
            } else {
                xz3Var = null;
            }
        }
        return kw4Var.a.invoke();
    }

    @Override // defpackage.ra3
    public final int j(yl3 yl3Var, ro3 ro3Var, int i) {
        wz3 wz3Var = this.L;
        wz3Var.getClass();
        return ((pa3) wz3Var).e(new x23(yl3Var, yl3Var.getLayoutDirection()), new i91(ro3Var, cp3.y, dp3.x, (byte) 1), sx0.b(0, 0, 0, i, 7)).getWidth();
    }

    @Override // defpackage.ra3
    public final int m0(yl3 yl3Var, ro3 ro3Var, int i) {
        wz3 wz3Var = this.L;
        wz3Var.getClass();
        return ((pa3) wz3Var).e(new x23(yl3Var, yl3Var.getLayoutDirection()), new i91(ro3Var, cp3.x, dp3.y, (byte) 1), sx0.b(0, i, 0, 0, 13)).getHeight();
    }

    public final String toString() {
        return this.L.toString();
    }

    @Override // defpackage.lh4
    public final boolean u() {
        return this.K;
    }

    @Override // defpackage.zo1
    public final void u0(bb3 bb3Var) {
        wz3 wz3Var = this.L;
        wz3Var.getClass();
        bb3Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0122 A[ORIG_RETURN, RETURN] */
    @Override // defpackage.xq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(defpackage.nq4 r9, defpackage.oq4 r10, long r11) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s20.x(nq4, oq4, long):void");
    }

    @Override // defpackage.ra3
    public final int y0(yl3 yl3Var, ro3 ro3Var, int i) {
        wz3 wz3Var = this.L;
        wz3Var.getClass();
        return ((pa3) wz3Var).e(new x23(yl3Var, yl3Var.getLayoutDirection()), new i91(ro3Var, cp3.x, dp3.x, (byte) 1), sx0.b(0, 0, 0, i, 7)).getWidth();
    }

    @Override // defpackage.fa3, defpackage.yo3
    public final void a(long j) {
    }

    @Override // defpackage.fa3
    public final void o(ha3 ha3Var) {
    }
}
