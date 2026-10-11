package defpackage;

import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jo7 implements r28, ke4, ce4, yd4 {
    public final /* synthetic */ byte x;
    public final v78 y;
    public final wz0 z;

    public /* synthetic */ jo7(wz0 wz0Var, v78 v78Var, byte b) {
        this.x = b;
        this.z = wz0Var;
        this.y = v78Var;
    }

    @Override // defpackage.r28
    public final void a(Task task) {
        switch (this.x) {
            case 0:
                if (((v78) task).d) {
                    this.y.h();
                    return;
                }
                try {
                    this.y.f(((qp7) this.z).b(task));
                    return;
                } catch (f85 e) {
                    if (e.getCause() instanceof Exception) {
                        this.y.g((Exception) e.getCause());
                        return;
                    } else {
                        this.y.g(e);
                        return;
                    }
                } catch (Exception e2) {
                    this.y.g(e2);
                    return;
                }
            default:
                new yc2((byte) 18, this, task, false).run();
                return;
        }
    }

    @Override // defpackage.yd4
    public void f() {
        this.y.h();
    }

    @Override // defpackage.ce4
    public void onFailure(Exception exc) {
        this.y.g(exc);
    }

    @Override // defpackage.ke4
    public void onSuccess(Object obj) {
        this.y.f(obj);
    }
}
