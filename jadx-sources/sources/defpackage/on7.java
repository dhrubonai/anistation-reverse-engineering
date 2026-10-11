package defpackage;

import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class on7 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ qn7 y;

    public /* synthetic */ on7(qn7 qn7Var, byte b) {
        this.x = b;
        this.y = qn7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        qn7 qn7Var = this.y;
        switch (b) {
            case 0:
                qn7Var.getClass();
                en7 en7Var = new en7(qn7Var);
                pk5 pk5Var = qn7Var.f;
                a34.x(pk5Var);
                pk5Var.a(en7Var);
                return;
            default:
                zk3 zk3Var = qn7.g;
                Log.i(zk3Var.a, zk3Var.c("transfer with type = %d has timed out", 0));
                zk3Var.b("notify failed transfer with type = %d, reason = %d", 0, 101);
                Iterator it = new HashSet(qn7Var.b).iterator();
                while (it.hasNext()) {
                    ky7 ky7Var = (ky7) it.next();
                    switch (ky7Var.a) {
                        case 0:
                            zk3 zk3Var2 = qz7.i;
                            qz7.i.b("onTransferFailed with type = %d and reason = %d", 0, 101);
                            qz7 qz7Var = (qz7) ky7Var.b;
                            qz7Var.e();
                            u18 u18Var = qz7Var.c;
                            p08 p08Var = qz7Var.g;
                            kv7 kv7Var = qz7Var.a;
                            k38 b2 = u18Var.b(p08Var);
                            a38 m = b38.m(b2.c());
                            m.a();
                            ((b38) m.y).v();
                            m.a();
                            ((b38) m.y).w();
                            b2.d((b38) m.b());
                            kv7Var.a((l38) b2.b(), 232);
                            break;
                        default:
                            ao7 ao7Var = new ao7(11);
                            ao7Var.a = 101;
                            kz kzVar = (kz) ky7Var.b;
                            ao7Var.b = Boolean.valueOf(((gl7) kzVar.y).L());
                            kzVar.F(new co7(ao7Var));
                            break;
                    }
                }
                qn7Var.a();
                return;
        }
    }
}
