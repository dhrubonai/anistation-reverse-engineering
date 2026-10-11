package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lu7 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ b48 y;
    public final /* synthetic */ nv7 z;

    public /* synthetic */ lu7(nv7 nv7Var, b48 b48Var, byte b) {
        this.x = b;
        this.y = b48Var;
        this.z = nv7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        b48 b48Var = this.y;
        nv7 nv7Var = this.z;
        switch (b) {
            case 0:
                z18 z18Var = nv7Var.e;
                z18Var.V();
                z18Var.Y(b48Var);
                return;
            case 1:
                z18 z18Var2 = nv7Var.e;
                z18Var2.V();
                z18Var2.f().L();
                z18Var2.l0();
                a34.x(b48Var);
                String str = b48Var.x;
                a34.u(str);
                int i = 0;
                if (z18Var2.e0().W(null, tq7.y0)) {
                    z18Var2.d().getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int U = z18Var2.e0().U(null, tq7.h0);
                    z18Var2.e0();
                    long longValue = currentTimeMillis - ((Long) tq7.e.a(null)).longValue();
                    while (i < U && z18Var2.I(longValue, null)) {
                        i++;
                    }
                } else {
                    z18Var2.e0();
                    long intValue = ((Integer) tq7.l.a(null)).intValue();
                    while (i < intValue && z18Var2.I(0L, str)) {
                        i++;
                    }
                }
                if (z18Var2.e0().W(null, tq7.z0)) {
                    z18Var2.f().L();
                    z18Var2.H();
                }
                n18 n18Var = z18Var2.G;
                int b2 = zo5.b(b48Var.b0);
                n18Var.L();
                if (b2 == 2 && !n18.O(str)) {
                    nt7 nt7Var = n18Var.y.x;
                    z18.T(nt7Var);
                    tr7 X = nt7Var.X(str);
                    if (X != null && X.F() && !X.G().s().isEmpty()) {
                        z18Var2.c().K.b(str, "[sgtm] Going background, trigger client side upload. appId");
                        z18Var2.d().getClass();
                        z18Var2.r(System.currentTimeMillis(), str);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                z18 z18Var3 = nv7Var.e;
                z18Var3.V();
                z18Var3.f().L();
                z18Var3.l0();
                a34.u(b48Var.x);
                z18Var3.c0(b48Var);
                return;
            case 3:
                z18 z18Var4 = nv7Var.e;
                z18Var4.V();
                if (z18Var4.V != null) {
                    ArrayList arrayList = new ArrayList();
                    z18Var4.W = arrayList;
                    arrayList.addAll(z18Var4.V);
                }
                fl7 fl7Var = z18Var4.z;
                z18.T(fl7Var);
                gu7 gu7Var = (gu7) fl7Var.x;
                String str2 = b48Var.x;
                a34.x(str2);
                a34.u(str2);
                fl7Var.L();
                fl7Var.M();
                try {
                    SQLiteDatabase C0 = fl7Var.C0();
                    String[] strArr = {str2};
                    int delete = C0.delete("apps", "app_id=?", strArr) + C0.delete("events", "app_id=?", strArr) + C0.delete("events_snapshot", "app_id=?", strArr) + C0.delete("user_attributes", "app_id=?", strArr) + C0.delete("conditional_properties", "app_id=?", strArr) + C0.delete("raw_events", "app_id=?", strArr) + C0.delete("raw_events_metadata", "app_id=?", strArr) + C0.delete("queue", "app_id=?", strArr) + C0.delete("audience_filter_values", "app_id=?", strArr) + C0.delete("main_event_params", "app_id=?", strArr) + C0.delete("default_event_params", "app_id=?", strArr) + C0.delete("trigger_uris", "app_id=?", strArr) + C0.delete("upload_queue", "app_id=?", strArr);
                    if (gu7Var.A.W(null, tq7.c1)) {
                        delete += C0.delete("no_data_mode_events", "app_id=?", strArr);
                    }
                    int delete2 = delete + C0.delete("diagnostic_signals", "app_id=?", strArr);
                    if (delete2 > 0) {
                        es7 es7Var = gu7Var.C;
                        gu7.l(es7Var);
                        es7Var.K.c("Reset analytics data. app, records", str2, Integer.valueOf(delete2));
                    }
                } catch (SQLiteException e) {
                    es7 es7Var2 = gu7Var.C;
                    gu7.l(es7Var2);
                    es7Var2.C.c("Error resetting analytics data. appId, error", es7.P(str2), e);
                }
                if (b48Var.E) {
                    z18Var4.Y(b48Var);
                    return;
                }
                return;
            case 4:
                z18 z18Var5 = nv7Var.e;
                z18Var5.V();
                z18Var5.f().L();
                z18Var5.l0();
                a34.u(b48Var.x);
                z18Var5.m0(b48Var);
                z18Var5.n0(b48Var);
                return;
            case 5:
                z18 z18Var6 = nv7Var.e;
                z18Var6.V();
                z18Var6.n0(b48Var);
                return;
            default:
                z18 z18Var7 = nv7Var.e;
                z18Var7.V();
                z18Var7.m0(b48Var);
                return;
        }
    }
}
