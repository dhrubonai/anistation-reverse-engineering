package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class en7 implements qk5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ en7(qn7 qn7Var) {
        this.a = (byte) 0;
        Objects.requireNonNull(qn7Var);
        this.b = qn7Var;
    }

    @Override // defpackage.qk5
    public final void a(kk5 kk5Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return;
            case 1:
                qz7 qz7Var = (qz7) obj;
                qz7Var.h = (gi0) kk5Var;
                qz7Var.b(i);
                return;
            default:
                ao7 ao7Var = new ao7(5);
                ao7Var.a = Integer.valueOf(i);
                kz kzVar = (kz) obj;
                kzVar.F(new co7(ao7Var));
                kzVar.J();
                return;
        }
    }

    @Override // defpackage.qk5
    public final void b(kk5 kk5Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                zk3 zk3Var = qn7.g;
                Object[] objArr = {Integer.valueOf(i)};
                zk3 zk3Var2 = qn7.g;
                zk3Var2.b("onSessionEnded with error = %d", objArr);
                qn7 qn7Var = (qn7) obj;
                qn7Var.getClass();
                zk3Var2.b("No need to notify transferred if the transfer type is unknown", new Object[0]);
                qn7Var.a();
                return;
            case 1:
                qz7 qz7Var = (qz7) obj;
                qz7Var.h = (gi0) kk5Var;
                qz7Var.b(i);
                return;
            default:
                ao7 ao7Var = new ao7(9);
                ao7Var.a = Integer.valueOf(i);
                kz kzVar = (kz) obj;
                ao7Var.b = Boolean.valueOf(((gl7) kzVar.y).L());
                kzVar.F(new co7(ao7Var));
                kzVar.J();
                return;
        }
    }

    @Override // defpackage.qk5
    public final /* synthetic */ void c(kk5 kk5Var) {
        switch (this.a) {
            case 0:
                return;
            case 1:
                ((qz7) this.b).h = (gi0) kk5Var;
                return;
            default:
                return;
        }
    }

    @Override // defpackage.qk5
    public final void d(kk5 kk5Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return;
            case 1:
                qz7 qz7Var = (qz7) obj;
                qz7Var.h = (gi0) kk5Var;
                qz7Var.b(i);
                return;
            default:
                ao7 ao7Var = new ao7(8);
                ao7Var.a = Integer.valueOf(i);
                kz kzVar = (kz) obj;
                kzVar.F(new co7(ao7Var));
                kzVar.J();
                return;
        }
    }

    @Override // defpackage.qk5
    public final void e(kk5 kk5Var, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return;
            case 1:
                zk3 zk3Var = qz7.i;
                qz7.i.b("onSessionResumed with wasSuspended = %b", Boolean.valueOf(z));
                qz7 qz7Var = (qz7) obj;
                qz7Var.h = (gi0) kk5Var;
                qz7Var.e();
                a34.x(qz7Var.g);
                u18 u18Var = qz7Var.c;
                p08 p08Var = qz7Var.g;
                kv7 kv7Var = qz7Var.a;
                k38 b2 = u18Var.b(p08Var);
                a38 m = b38.m(b2.c());
                m.a();
                ((b38) m.y).p(z);
                b2.a();
                ((l38) b2.y).v((b38) m.b());
                kv7Var.a((l38) b2.b(), 227);
                qz7Var.a();
                qz7Var.c();
                return;
            default:
                kz kzVar = (kz) obj;
                kzVar.F(new co7(new ao7(4)));
                lc7 lc7Var = (lc7) kzVar.A;
                a34.x(lc7Var);
                lc7Var.a((gi0) kk5Var);
                return;
        }
    }

    @Override // defpackage.qk5
    public final void f(kk5 kk5Var, String str) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                qn7 qn7Var = (qn7) obj;
                qn7Var.getClass();
                qn7.g.b("onSessionStarted with transferType = %d", 0);
                if (qn7Var.e) {
                    boolean z = qn7Var.a.N;
                }
                qn7Var.a();
                return;
            case 1:
                qz7.i.b("onSessionStarted with sessionId = %s", str);
                qz7 qz7Var = (qz7) obj;
                qz7Var.h = (gi0) kk5Var;
                qz7Var.e();
                p08 p08Var = qz7Var.g;
                p08Var.f = str;
                qz7Var.a.a((l38) qz7Var.c.b(p08Var).b(), 222);
                qz7Var.a();
                qz7Var.c();
                return;
            default:
                kz kzVar = (kz) obj;
                kzVar.F(new co7(new ao7(4)));
                lc7 lc7Var = (lc7) kzVar.A;
                a34.x(lc7Var);
                lc7Var.a((gi0) kk5Var);
                lc7 lc7Var2 = (lc7) kzVar.A;
                a34.x(lc7Var2);
                String str2 = lc7Var2.k;
                if (str2 == null) {
                    lc7Var2.k = str;
                    return;
                } else {
                    if (!TextUtils.equals(str, str2)) {
                        lc7Var2.b(4);
                        return;
                    }
                    return;
                }
        }
    }

    @Override // defpackage.qk5
    public final void g(kk5 kk5Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return;
            case 1:
                zk3 zk3Var = qz7.i;
                zk3Var.b("onSessionStarting", new Object[0]);
                qz7 qz7Var = (qz7) obj;
                qz7Var.h = (gi0) kk5Var;
                if (qz7Var.g != null) {
                    Log.w(zk3Var.a, zk3Var.c("Start a session while there's already an active session. Create a new one.", new Object[0]));
                }
                qz7Var.d();
                p08 p08Var = qz7Var.g;
                u18 u18Var = qz7Var.c;
                kv7 kv7Var = qz7Var.a;
                k38 b2 = u18Var.b(p08Var);
                if (p08Var.p == 1) {
                    a38 m = b38.m(b2.c());
                    m.a();
                    ((b38) m.y).r(17);
                    b2.d((b38) m.b());
                }
                kv7Var.a((l38) b2.b(), 221);
                return;
            default:
                gi0 gi0Var = (gi0) kk5Var;
                ao7 ao7Var = new ao7(2);
                kz kzVar = (kz) obj;
                ao7Var.b = Boolean.valueOf(((gl7) kzVar.y).L());
                kzVar.F(new co7(ao7Var));
                lc7 lc7Var = (lc7) kzVar.A;
                a34.x(lc7Var);
                lc7Var.a(gi0Var);
                gi0Var.l = (uw7) kzVar.B;
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012e  */
    @Override // defpackage.qk5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.kk5 r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en7.h(kk5, java.lang.String):void");
    }

    @Override // defpackage.qk5
    public final void i(kk5 kk5Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return;
            case 1:
                zk3 zk3Var = qz7.i;
                qz7.i.b("onSessionSuspended with reason = %d", Integer.valueOf(i));
                qz7 qz7Var = (qz7) obj;
                qz7Var.h = (gi0) kk5Var;
                qz7Var.e();
                a34.x(qz7Var.g);
                qz7Var.a.a(qz7Var.c.a(qz7Var.g, i), 225);
                qz7Var.a();
                qz7Var.e.removeCallbacks(qz7Var.d);
                return;
            default:
                ao7 ao7Var = new ao7(6);
                ao7Var.a = Integer.valueOf(i);
                kz kzVar = (kz) obj;
                kzVar.F(new co7(ao7Var));
                lc7 lc7Var = (lc7) kzVar.A;
                a34.x(lc7Var);
                lc7Var.a((gi0) kk5Var);
                return;
        }
    }

    public /* synthetic */ en7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
