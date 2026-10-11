package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class os7 implements r28 {
    public final Object A;
    public final Executor y;
    public final /* synthetic */ byte x = 2;
    public final Object z = new Object();

    public os7(Executor executor, yd4 yd4Var) {
        this.y = executor;
        this.A = yd4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r28
    public final void a(Task task) {
        byte b = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.x) {
            case 0:
                if (((v78) task).d) {
                    synchronized (this.z) {
                    }
                    this.y.execute(new la((Object) this, (byte) 18));
                    return;
                }
                return;
            case 1:
                synchronized (this.z) {
                }
                this.y.execute(new yc2((byte) 20, this, task, objArr == true ? 1 : 0));
                return;
            case 2:
                if (!task.d() && !((v78) task).d) {
                    synchronized (this.z) {
                    }
                    this.y.execute(new yc2((byte) 23, this, task, objArr2 == true ? 1 : 0));
                    return;
                }
                return;
            default:
                if (task.d()) {
                    synchronized (this.z) {
                    }
                    this.y.execute(new ly7(this, task, b));
                    return;
                }
                return;
        }
    }

    public os7(Executor executor, zd4 zd4Var) {
        this.y = executor;
        this.A = zd4Var;
    }

    public os7(Executor executor, ce4 ce4Var) {
        this.y = executor;
        this.A = ce4Var;
    }

    public os7(Executor executor, ke4 ke4Var) {
        this.y = executor;
        this.A = ke4Var;
    }
}
