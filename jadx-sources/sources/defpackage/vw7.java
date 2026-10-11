package defpackage;

import android.os.Bundle;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.TreeSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vw7 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Bundle y;
    public final /* synthetic */ qx7 z;

    public /* synthetic */ vw7(qx7 qx7Var, Bundle bundle, byte b) {
        this.x = b;
        this.y = bundle;
        this.z = qx7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.x;
        Bundle bundle = this.y;
        qx7 qx7Var = this.z;
        switch (b) {
            case 0:
                qx7Var.L();
                qx7Var.M();
                String string = bundle.getString(MediationMetaData.KEY_NAME);
                String string2 = bundle.getString("origin");
                a34.u(string);
                a34.u(string2);
                a34.x(bundle.get("value"));
                gu7 gu7Var = (gu7) qx7Var.x;
                if (!gu7Var.a()) {
                    es7 es7Var = gu7Var.C;
                    gu7.l(es7Var);
                    es7Var.K.a("Conditional property not set since app measurement is disabled");
                    return;
                }
                e28 e28Var = new e28(bundle.getLong("triggered_timestamp"), bundle.get("value"), string, string2);
                try {
                    i28 i28Var = gu7Var.F;
                    gu7.j(i28Var);
                    bundle.getString("app_id");
                    mm7 s0 = i28Var.s0(bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, 0L, true);
                    gu7.j(i28Var);
                    bundle.getString("app_id");
                    mm7 s02 = i28Var.s0(bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, 0L, true);
                    bundle.getString("app_id");
                    gu7Var.n().e0(new yh7(bundle.getString("app_id"), string2, e28Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), s02, bundle.getLong("trigger_timeout"), s0, bundle.getLong("time_to_live"), i28Var.s0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            case 1:
                qx7Var.L();
                qx7Var.M();
                String string3 = bundle.getString(MediationMetaData.KEY_NAME);
                a34.u(string3);
                gu7 gu7Var2 = (gu7) qx7Var.x;
                if (!gu7Var2.a()) {
                    es7 es7Var2 = gu7Var2.C;
                    gu7.l(es7Var2);
                    es7Var2.K.a("Conditional property not cleared since app measurement is disabled");
                    return;
                }
                e28 e28Var2 = new e28(0L, null, string3, "");
                try {
                    i28 i28Var2 = gu7Var2.F;
                    gu7.j(i28Var2);
                    bundle.getString("app_id");
                    gu7Var2.n().e0(new yh7(bundle.getString("app_id"), "", e28Var2, bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), i28Var2.s0(bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), 0L, true)));
                    return;
                } catch (IllegalArgumentException unused2) {
                    return;
                }
            default:
                ub7 ub7Var = qx7Var.S;
                gu7 gu7Var3 = (gu7) qx7Var.x;
                if (!bundle.isEmpty()) {
                    bt7 bt7Var = gu7Var3.B;
                    i28 i28Var3 = gu7Var3.F;
                    ak7 ak7Var = gu7Var3.A;
                    es7 es7Var3 = gu7Var3.C;
                    gu7.j(bt7Var);
                    Bundle bundle2 = new Bundle(bt7Var.V.a());
                    for (String str : bundle.keySet()) {
                        Object obj = bundle.get(str);
                        if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                            gu7.j(i28Var3);
                            if (i28.X0(obj)) {
                                i28.d0(ub7Var, null, 27, null, null, 0);
                            }
                            gu7.l(es7Var3);
                            es7Var3.H.c("Invalid default event parameter type. Name, value", str, obj);
                        } else if (i28.p0(str)) {
                            gu7.l(es7Var3);
                            es7Var3.H.b(str, "Invalid default event parameter name. Name");
                        } else if (obj == null) {
                            bundle2.remove(str);
                        } else {
                            gu7.j(i28Var3);
                            ak7Var.getClass();
                            if (i28Var3.P("param", str, UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE, obj)) {
                                i28Var3.c0(bundle2, str, obj);
                            }
                        }
                    }
                    gu7.j(i28Var3);
                    i28 i28Var4 = ((gu7) ak7Var.x).F;
                    gu7.j(i28Var4);
                    if (i28Var4.v0(201500000)) {
                        i = 100;
                    } else {
                        i = 25;
                    }
                    if (bundle2.size() > i) {
                        Iterator it = new TreeSet(bundle2.keySet()).iterator();
                        int i2 = 0;
                        while (it.hasNext()) {
                            String str2 = (String) it.next();
                            i2++;
                            if (i2 > i) {
                                bundle2.remove(str2);
                            }
                        }
                        gu7.j(i28Var3);
                        i28.d0(ub7Var, null, 26, null, null, 0);
                        gu7.l(es7Var3);
                        es7Var3.H.a("Too many default event parameters set. Discarding beyond event parameter limit");
                    }
                    bundle = bundle2;
                }
                bt7 bt7Var2 = gu7Var3.B;
                gu7.j(bt7Var2);
                bt7Var2.V.d(bundle);
                gu7Var3.n().Q(bundle);
                return;
        }
    }
}
