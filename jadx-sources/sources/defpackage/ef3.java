package defpackage;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ef3 implements fe3 {
    public final /* synthetic */ wc3 a;

    public ef3(wc3 wc3Var) {
        this.a = wc3Var;
    }

    @Override // defpackage.fe3
    public final int a() {
        long g;
        wc3 wc3Var = this.a;
        if (wc3Var.g().r == rg4.x) {
            g = wc3Var.g().g() & 4294967295L;
        } else {
            g = wc3Var.g().g() >> 32;
        }
        return (int) g;
    }

    @Override // defpackage.fe3
    public final float b() {
        int h = this.a.d.b.h();
        return (h * UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE) + r1.d.c.h();
    }

    @Override // defpackage.fe3
    public final Object c(int i, jr jrVar) {
        Object i2 = wc3.i(this.a, i, jrVar);
        if (i2 == w11.x) {
            return i2;
        }
        return pn6.a;
    }

    @Override // defpackage.fe3
    public final int d() {
        wc3 wc3Var = this.a;
        return (-wc3Var.g().o) + wc3Var.g().s;
    }

    @Override // defpackage.fe3
    public final float e() {
        wc3 wc3Var = this.a;
        int h = wc3Var.d.b.h();
        int h2 = wc3Var.d.c.h();
        if (wc3Var.c()) {
            return (h * UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE) + h2 + 100.0f;
        }
        return (h * UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE) + h2;
    }

    @Override // defpackage.fe3
    public final wo0 f() {
        return new wo0(-1, -1);
    }
}
