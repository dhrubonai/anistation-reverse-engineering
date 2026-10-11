package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t87 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ v87 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t87(v87 v87Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = v87Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        v87 v87Var = this.z;
        switch (b) {
            case 0:
                return new t87(v87Var, vz0Var, (byte) 0);
            default:
                return new t87(v87Var, vz0Var, (byte) 1);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((t87) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((t87) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [r05, java.lang.Object] */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object r87Var;
        byte b = this.x;
        w11 w11Var = w11.x;
        v87 v87Var = this.z;
        vz0 vz0Var = null;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                Object e = v87Var.e(this);
                if (e == w11Var) {
                    return w11Var;
                }
                return e;
            default:
                boolean z2 = this.y;
                byte b2 = 0;
                try {
                    if (z2) {
                        if (z2) {
                            m37.N(obj);
                        } else {
                            ze0.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        m37.N(obj);
                        j43 j43Var = v87Var.m;
                        t87 t87Var = new t87(v87Var, vz0Var, b2);
                        this.y = true;
                        obj = tl7.V(j43Var, t87Var, this);
                        if (obj == w11Var) {
                            return w11Var;
                        }
                    }
                    r87Var = (s87) obj;
                } catch (m87 e2) {
                    r87Var = new q87(e2.x);
                } catch (CancellationException unused) {
                    r87Var = new Object();
                } catch (Throwable th) {
                    xk3.d().c(w87.a, "Unexpected error in WorkerWrapper", th);
                    r87Var = new r87(false);
                }
                ?? obj2 = new Object();
                v87Var.h.runInTransaction(new ze(r87Var, (Object) obj2, (Object) v87Var, (byte) 29));
                return Boolean.valueOf(obj2.x);
        }
    }
}
