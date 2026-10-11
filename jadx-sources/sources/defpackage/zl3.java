package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zl3 extends dm4 {
    public final /* synthetic */ byte y;
    public final Object z;

    public /* synthetic */ zl3(Object obj, byte b) {
        this.y = b;
        this.z = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, w05] */
    @Override // defpackage.dm4
    public float a(yn2 yn2Var) {
        float f;
        ub2 ub2Var;
        float f2;
        int N0;
        mh4 snapshotObserver;
        int N02;
        switch (this.y) {
            case 0:
                ic2 ic2Var = yn2Var.a;
                if (ic2Var != null) {
                    return ((Number) ic2Var.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                yl3 yl3Var = (yl3) this.z;
                if (yl3Var.L) {
                    return Float.NaN;
                }
                ?? obj = new Object();
                obj.x = yl3Var;
                while (true) {
                    sp spVar = ((yl3) obj.x).N;
                    if (spVar != null && (N02 = ms.N0((yn2[]) spVar.b, yn2Var)) >= 0) {
                        f = ((float[]) spVar.c)[N02];
                    } else {
                        f = Float.NaN;
                    }
                    boolean isNaN = Float.isNaN(f);
                    Object obj2 = obj.x;
                    if (!isNaN) {
                        ((yl3) obj2).f0(yl3Var.t0(), yn2Var);
                        return yn2Var.a(f, ((yl3) obj.x).q0(), yl3Var.q0());
                    }
                    yl3 yl3Var2 = (yl3) obj2;
                    ic2 ic2Var2 = yl3Var2.E;
                    if (ic2Var2 != null && (ub2Var = yl3Var2.F) != null && ((Boolean) ub2Var.invoke(yn2Var)).booleanValue()) {
                        yl3 yl3Var3 = (yl3) obj.x;
                        p44 p44Var = yl3Var3.H;
                        if (p44Var == null) {
                            long[] jArr = cb5.a;
                            p44Var = new p44();
                            yl3Var3.H = p44Var;
                        }
                        Object g = p44Var.g(yn2Var);
                        if (g == null) {
                            g = new gm4(yl3Var3.u0(), yl3Var3, yn2Var);
                            p44Var.n(yn2Var, g);
                        }
                        gm4 gm4Var = (gm4) g;
                        gm4Var.x = yl3Var3.u0();
                        kh4 kh4Var = yl3Var.t0().K;
                        if (kh4Var != null && (snapshotObserver = ((oa) kh4Var).getSnapshotObserver()) != null) {
                            snapshotObserver.a.d(gm4Var, yl3.Q, new mi((Object) ic2Var2, (Object) obj, (Object) yn2Var, (byte) 10));
                        }
                        ((yl3) obj.x).f0(yl3Var.t0(), yn2Var);
                        sp spVar2 = ((yl3) obj.x).N;
                        if (spVar2 != null && (N0 = ms.N0((yn2[]) spVar2.b, yn2Var)) >= 0) {
                            f2 = ((float[]) spVar2.c)[N0];
                        } else {
                            f2 = Float.NaN;
                        }
                        if (!Float.isNaN(f2)) {
                            return yn2Var.a(f2, ((yl3) obj.x).q0(), yl3Var.q0());
                        }
                    }
                    yl3 y0 = ((yl3) obj.x).y0();
                    if (y0 == null) {
                        ((yl3) obj.x).f0(yl3Var.t0(), yn2Var);
                        return Float.NaN;
                    }
                    obj.x = y0;
                }
                break;
            default:
                return super.a(yn2Var);
        }
    }

    @Override // defpackage.ud1
    public final float b() {
        byte b = this.y;
        Object obj = this.z;
        switch (b) {
            case 0:
                return ((yl3) obj).b();
            default:
                return ((oa) obj).getDensity().b();
        }
    }

    @Override // defpackage.dm4
    public final ia3 c() {
        byte b = this.y;
        Object obj = this.z;
        switch (b) {
            case 0:
                return ((yl3) obj).getLayoutDirection();
            default:
                return ((oa) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.dm4
    public final int d() {
        byte b = this.y;
        Object obj = this.z;
        switch (b) {
            case 0:
                return ((yl3) obj).S();
            default:
                return ((oa) obj).getRoot().d0.p.x;
        }
    }

    @Override // defpackage.ud1
    public final float getFontScale() {
        byte b = this.y;
        Object obj = this.z;
        switch (b) {
            case 0:
                return ((yl3) obj).getFontScale();
            default:
                return ((oa) obj).getDensity().getFontScale();
        }
    }
}
