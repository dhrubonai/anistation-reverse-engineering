package g4;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.n0;
import com.google.android.gms.common.internal.p0;
import com.google.android.gms.common.internal.q0;

/* loaded from: classes.dex */
public final class g implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4415b;

    public /* synthetic */ g(q0 q0Var) {
        this.f4414a = 1;
        this.f4415b = q0Var;
    }

    private void a(Message message) {
        if (message.what != 0) {
            return;
        }
        i.g gVar = (i.g) this.f4415b;
        a3.g.z(message.obj);
        synchronized (gVar.f5196b) {
            a3.g.z(gVar.f5198d);
            throw null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f4414a) {
            case 0:
                int i10 = message.what;
                Object obj = this.f4415b;
                if (i10 == 1) {
                    ((h) obj).b((e) message.obj);
                    return true;
                }
                if (i10 == 2) {
                    ((h) obj).f4419d.l((e) message.obj);
                }
                return false;
            case 1:
                int i11 = message.what;
                if (i11 != 0) {
                    if (i11 != 1) {
                        return false;
                    }
                    synchronized (((q0) this.f4415b).f2582d) {
                        n0 n0Var = (n0) message.obj;
                        p0 p0Var = (p0) ((q0) this.f4415b).f2582d.get(n0Var);
                        if (p0Var != null && p0Var.f2567b == 3) {
                            Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(n0Var)), new Exception());
                            ComponentName componentName = p0Var.f2571f;
                            if (componentName == null) {
                                n0Var.getClass();
                                componentName = null;
                            }
                            if (componentName == null) {
                                String str = n0Var.f2561b;
                                w7.b.s(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            p0Var.onServiceDisconnected(componentName);
                        }
                    }
                    return true;
                }
                synchronized (((q0) this.f4415b).f2582d) {
                    n0 n0Var2 = (n0) message.obj;
                    p0 p0Var2 = (p0) ((q0) this.f4415b).f2582d.get(n0Var2);
                    if (p0Var2 != null && p0Var2.f2566a.isEmpty()) {
                        if (p0Var2.f2568c) {
                            p0Var2.f2572g.f2584f.removeMessages(1, p0Var2.f2570e);
                            q0 q0Var = p0Var2.f2572g;
                            q0Var.f2585g.a(q0Var.f2583e, p0Var2);
                            p0Var2.f2568c = false;
                            p0Var2.f2567b = 2;
                        }
                        ((q0) this.f4415b).f2582d.remove(n0Var2);
                    }
                }
                return true;
            default:
                a(message);
                return false;
        }
    }

    public /* synthetic */ g(Object obj, int i10) {
        this.f4414a = i10;
        this.f4415b = obj;
    }
}
