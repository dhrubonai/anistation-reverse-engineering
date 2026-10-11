package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioDeviceInfo;
import android.view.KeyEvent;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o9 extends BroadcastReceiver {
    public final /* synthetic */ byte a;
    public final Object b;

    public o9(gu7 gu7Var) {
        this.a = (byte) 8;
        this.b = gu7Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent r;
        byte b = this.a;
        byte b2 = 2;
        Object obj = this.b;
        switch (b) {
            case 0:
                p9 p9Var = (p9) obj;
                p9Var.c.execute(new n9(p9Var, b2));
                return;
            case 1:
                ak6 ak6Var = (ak6) obj;
                if (!isInitialStickyBroadcast()) {
                    ak6Var.d(vu.b(context, intent, (ru) ak6Var.k, (AudioDeviceInfo) ak6Var.j, ak6Var.b()));
                    return;
                }
                return;
            case 2:
                context.getClass();
                intent.getClass();
                o50 o50Var = (o50) obj;
                switch (o50Var.g) {
                    case 0:
                        String action = intent.getAction();
                        if (action != null) {
                            xk3.d().a(p50.a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        o50Var.c(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        o50Var.c(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        o50Var.c(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        o50Var.c(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        }
                        return;
                    case 1:
                        if (intent.getAction() != null) {
                            xk3.d().a(q50.a, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int hashCode = action2.hashCode();
                                if (hashCode != -1980154005) {
                                    if (hashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                        o50Var.c(Boolean.FALSE);
                                        return;
                                    }
                                    return;
                                }
                                if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                    o50Var.c(Boolean.TRUE);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        if (intent.getAction() != null) {
                            xk3.d().a(ty5.a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int hashCode2 = action3.hashCode();
                                if (hashCode2 != -1181163412) {
                                    if (hashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                        o50Var.c(Boolean.TRUE);
                                        return;
                                    }
                                    return;
                                }
                                if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                    o50Var.c(Boolean.FALSE);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            case 3:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (r = wk6.r(intent)) != null) {
                    ((eq3) ((sn3) ((wu3) obj).o.z).y).a.dispatchMediaButtonEvent(r);
                    return;
                }
                return;
            case 4:
                ((n94) obj).a.execute(new f32((Object) this, (Object) context, (byte) 20));
                return;
            case 5:
                ((ui3) obj).f();
                return;
            case 6:
                if (!isInitialStickyBroadcast()) {
                    ((x35) obj).a();
                    return;
                }
                return;
            case 7:
                ((jp7) obj).b();
                return;
            default:
                gu7 gu7Var = (gu7) obj;
                if (intent == null) {
                    es7 es7Var = gu7Var.C;
                    gu7.l(es7Var);
                    es7Var.F.a("App receiver called with null intent");
                    return;
                }
                String action4 = intent.getAction();
                if (action4 == null) {
                    es7 es7Var2 = gu7Var.C;
                    gu7.l(es7Var2);
                    es7Var2.F.a("App receiver called with null action");
                    return;
                }
                int hashCode3 = action4.hashCode();
                if (hashCode3 != -1928239649) {
                    if (hashCode3 == 1279883384 && action4.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                        es7 es7Var3 = gu7Var.C;
                        gu7.l(es7Var3);
                        es7Var3.K.a("[sgtm] App Receiver notified batches are available");
                        au7 au7Var = gu7Var.D;
                        gu7.l(au7Var);
                        au7Var.U(new d48(this, (byte) 1));
                        return;
                    }
                } else if (action4.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                    yi7.a();
                    if (gu7Var.A.W(null, tq7.P0)) {
                        es7 es7Var4 = gu7Var.C;
                        gu7.l(es7Var4);
                        es7Var4.K.a("App receiver notified triggers are available");
                        au7 au7Var2 = gu7Var.D;
                        gu7.l(au7Var2);
                        au7Var2.U(new d48(gu7Var, b2));
                        return;
                    }
                    return;
                }
                es7 es7Var5 = gu7Var.C;
                gu7.l(es7Var5);
                es7Var5.F.a("App receiver called with unknown action");
                return;
        }
    }

    public /* synthetic */ o9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
