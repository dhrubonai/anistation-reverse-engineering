package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oy0 extends t36 implements ic2 {
    public final /* synthetic */ yo6 A;
    public final /* synthetic */ fa0 B;
    public final /* synthetic */ long C;
    public boolean x;
    public /* synthetic */ Object y;
    public final /* synthetic */ py0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy0(py0 py0Var, yo6 yo6Var, fa0 fa0Var, long j, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = py0Var;
        this.A = yo6Var;
        this.B = fa0Var;
        this.C = j;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        oy0 oy0Var = new oy0(this.z, this.A, this.B, this.C, vz0Var);
        oy0Var.y = obj;
        return oy0Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((oy0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        py0 py0Var = this.z;
        v90 v90Var = py0Var.Q;
        boolean z = this.x;
        try {
            try {
                if (z) {
                    if (z) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    h43 w = h98.w(((v11) this.y).getCoroutineContext());
                    py0Var.T = true;
                    rd5 rd5Var = py0Var.M;
                    c54 c54Var = c54.x;
                    ny0 ny0Var = new ny0(this.A, py0Var, this.B, this.C, w, (vz0) null);
                    this.x = true;
                    Object g = rd5Var.g(c54Var, ny0Var, this);
                    w11 w11Var = w11.x;
                    if (g == w11Var) {
                        return w11Var;
                    }
                }
                v90Var.b();
                py0Var.T = false;
                v90Var.a(null);
                py0Var.R = false;
                return pn6.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            py0Var.T = false;
            v90Var.a(null);
            py0Var.R = false;
            throw th;
        }
    }
}
