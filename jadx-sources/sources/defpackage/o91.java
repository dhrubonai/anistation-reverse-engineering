package defpackage;

import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o91 implements lg3 {
    public final /* synthetic */ byte x;
    public final Object y;
    public final Object z;

    public o91(ng3 ng3Var) {
        this.x = (byte) 3;
        this.y = ng3Var;
        nm0 nm0Var = nm0.c;
        Class<?> cls = ng3Var.getClass();
        lm0 lm0Var = (lm0) nm0Var.a.get(cls);
        this.z = lm0Var == null ? nm0Var.a(cls, null) : lm0Var;
    }

    @Override // defpackage.lg3
    public final void onStateChanged(og3 og3Var, dg3 dg3Var) {
        byte b = this.x;
        Object obj = this.y;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                m91 m91Var = (m91) obj;
                switch (n91.a[dg3Var.ordinal()]) {
                    case 1:
                        m91Var.onCreate(og3Var);
                        break;
                    case 2:
                        m91Var.onStart(og3Var);
                        break;
                    case 3:
                        m91Var.onResume(og3Var);
                        break;
                    case 4:
                        m91Var.onPause(og3Var);
                        break;
                    case 5:
                        m91Var.onStop(og3Var);
                        break;
                    case 6:
                        m91Var.onDestroy(og3Var);
                        break;
                    case 7:
                        ze0.k("ON_ANY must not been send by anybody");
                        return;
                    default:
                        ze0.l();
                        return;
                }
                lg3 lg3Var = (lg3) obj2;
                if (lg3Var != null) {
                    lg3Var.onStateChanged(og3Var, dg3Var);
                    return;
                }
                return;
            case 1:
                if (dg3Var == dg3.ON_START) {
                    ((fg3) obj).b(this);
                    ((ea5) obj2).d();
                    return;
                }
                return;
            case 2:
                qd4 qd4Var = (qd4) obj;
                int i = vd4.a[dg3Var.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            qd4Var.f();
                            ((fg3) obj2).b(this);
                            return;
                        }
                        return;
                    }
                    qd4Var.h(false);
                    return;
                }
                qd4Var.h(true);
                return;
            default:
                ng3 ng3Var = (ng3) obj;
                HashMap hashMap = ((lm0) obj2).a;
                lm0.a((List) hashMap.get(dg3Var), og3Var, dg3Var, ng3Var);
                lm0.a((List) hashMap.get(dg3.ON_ANY), og3Var, dg3Var, ng3Var);
                return;
        }
    }

    public /* synthetic */ o91(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }

    public o91(qd4 qd4Var, wd4 wd4Var, fg3 fg3Var) {
        this.x = (byte) 2;
        this.y = qd4Var;
        this.z = fg3Var;
    }
}
