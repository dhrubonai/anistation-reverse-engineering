package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pm7 extends ig7 {
    public final /* synthetic */ sm7 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm7(sm7 sm7Var) {
        super((byte) 1);
        this.g = sm7Var;
    }

    @Override // defpackage.ig7
    public final void L(int i) {
        this.g.g().post(new fm7(this, i, (byte) 3));
    }

    @Override // defpackage.ig7
    public final void M(int i) {
        this.g.g().post(new fm7(this, i, (byte) 0));
    }

    @Override // defpackage.ig7
    public final void N(int i) {
        this.g.g().post(new fm7(this, i, (byte) 1));
    }

    @Override // defpackage.ig7
    public final void O(mr mrVar, String str, String str2, boolean z) {
        sm7 sm7Var = this.g;
        sm7Var.t = mrVar;
        sm7Var.u = str;
        y38 y38Var = new y38(new Status(0, null, null, null), mrVar, str, str2, z);
        synchronized (sm7Var.r) {
            try {
                p76 p76Var = sm7Var.o;
                if (p76Var != null) {
                    p76Var.b(y38Var);
                }
                sm7Var.o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ig7
    public final void P(int i) {
        this.g.l(i);
    }

    @Override // defpackage.ig7
    public final void Q(int i) {
        this.g.e(i);
    }

    @Override // defpackage.ig7
    public final void R(int i) {
        this.g.e(i);
    }

    @Override // defpackage.ig7
    public final void S(int i) {
        sm7 sm7Var = this.g;
        sm7Var.e(i);
        if (sm7Var.D != null) {
            sm7Var.g().post(new fm7(this, i, (byte) 2));
        }
    }

    @Override // defpackage.ig7
    public final void U(le7 le7Var) {
        this.g.g().post(new yc2((Object) this, (Object) le7Var, (byte) 15));
    }

    @Override // defpackage.ig7
    public final void V(fc7 fc7Var) {
        this.g.g().post(new yc2((Object) this, (Object) fc7Var, (byte) 16));
    }

    @Override // defpackage.ig7
    public final void W(String str, String str2) {
        sm7.G.b("Receive (type=text, ns=%s) %s", str, str2);
        this.g.g().post(new t35((Object) this, (Object) str, (Object) str2, (byte) 2));
    }

    @Override // defpackage.ig7
    public final void Y(int i, long j) {
        this.g.f(i, j);
    }

    @Override // defpackage.ig7
    public final void Z(long j) {
        this.g.f(0, j);
    }
}
