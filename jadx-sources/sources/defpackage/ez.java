package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ez extends k43 {
    public static final /* synthetic */ long E = qs.a.objectFieldOffset(ez.class.getDeclaredField("_disposer$volatile"));
    public final qg0 B;
    public ei1 C;
    public final /* synthetic */ gz D;
    private volatile /* synthetic */ Object _disposer$volatile;

    public ez(gz gzVar, qg0 qg0Var) {
        this.D = gzVar;
        this.B = qg0Var;
    }

    @Override // defpackage.k43
    public final boolean j() {
        return false;
    }

    @Override // defpackage.k43
    public final void k(Throwable th) {
        qg0 qg0Var = this.B;
        if (th != null) {
            ni1 E2 = qg0Var.E(new dr0(th, false), null);
            if (E2 != null) {
                qg0Var.k(E2);
                fz fzVar = (fz) qs.a.getObjectVolatile(this, E);
                if (fzVar != null) {
                    fzVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = gz.b;
        gz gzVar = this.D;
        if (atomicIntegerFieldUpdater.decrementAndGet(gzVar) == 0) {
            nc1[] nc1VarArr = gzVar.a;
            ArrayList arrayList = new ArrayList(nc1VarArr.length);
            for (nc1 nc1Var : nc1VarArr) {
                arrayList.add(nc1Var.q());
            }
            qg0Var.resumeWith(arrayList);
        }
    }
}
