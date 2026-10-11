package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class he3 implements fe3 {
    public final he1 a;
    public final /* synthetic */ af3 b;
    public final /* synthetic */ boolean c;

    public he3(af3 af3Var, boolean z) {
        this.b = af3Var;
        this.c = z;
        this.a = ut5.b(new ge3(af3Var, (byte) 0));
    }

    @Override // defpackage.fe3
    public final int a() {
        long g;
        af3 af3Var = this.b;
        if (af3Var.j().p == rg4.x) {
            g = af3Var.j().g() & 4294967295L;
        } else {
            g = af3Var.j().g() >> 32;
        }
        return (int) g;
    }

    @Override // defpackage.fe3
    public final float b() {
        int h = this.b.h();
        return (h * UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE) + r1.i();
    }

    @Override // defpackage.fe3
    public final Object c(int i, jr jrVar) {
        y23 y23Var = af3.y;
        Object l = this.b.l(i, 0, jrVar);
        if (l == w11.x) {
            return l;
        }
        return pn6.a;
    }

    @Override // defpackage.fe3
    public final int d() {
        af3 af3Var = this.b;
        return (-af3Var.j().m) + af3Var.j().q;
    }

    @Override // defpackage.fe3
    public final float e() {
        af3 af3Var = this.b;
        int h = af3Var.h();
        int i = af3Var.i();
        if (af3Var.c()) {
            return (h * UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE) + i + 100.0f;
        }
        return (h * UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE) + i;
    }

    @Override // defpackage.fe3
    public final wo0 f() {
        boolean z = this.c;
        he1 he1Var = this.a;
        if (z) {
            return new wo0(((Number) he1Var.getValue()).intValue(), 1);
        }
        return new wo0(1, ((Number) he1Var.getValue()).intValue());
    }
}
