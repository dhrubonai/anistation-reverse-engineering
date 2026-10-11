package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class gz {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(gz.class, "notCompletedCount$volatile");
    public final nc1[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public gz(nc1[] nc1VarArr) {
        this.a = nc1VarArr;
        this.notCompletedCount$volatile = nc1VarArr.length;
    }

    public final Object a(xz0 xz0Var) {
        qg0 qg0Var = new qg0(1, wc7.z(xz0Var));
        qg0Var.t();
        h43[] h43VarArr = this.a;
        int length = h43VarArr.length;
        ez[] ezVarArr = new ez[length];
        for (int i = 0; i < length; i++) {
            h43 h43Var = h43VarArr[i];
            ((t43) h43Var).start();
            ez ezVar = new ez(this, qg0Var);
            ezVar.C = h98.A(h43Var, true, ezVar);
            ezVarArr[i] = ezVar;
        }
        fz fzVar = new fz(ezVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            ez ezVar2 = ezVarArr[i2];
            ezVar2.getClass();
            qs.a.putObjectVolatile(ezVar2, ez.E, fzVar);
        }
        if (!(qg0Var.s() instanceof wa4)) {
            fzVar.b();
        } else {
            qg0Var.w(fzVar);
        }
        return qg0Var.r();
    }
}
