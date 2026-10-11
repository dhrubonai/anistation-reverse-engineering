package defpackage;

import android.os.Looper;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class og5 implements k11, ch4, vj7, vm7 {
    public final /* synthetic */ byte x;
    public static final /* synthetic */ og5 y = new og5(11);
    public static final /* synthetic */ og5 z = new og5(12);
    public static final /* synthetic */ og5 A = new og5(13);
    public static final /* synthetic */ og5 B = new og5(14);
    public static final /* synthetic */ og5 C = new og5(15);
    public static final /* synthetic */ og5 D = new og5(16);
    public static final /* synthetic */ og5 E = new og5(17);
    public static final /* synthetic */ og5 F = new og5(18);
    public static final /* synthetic */ og5 G = new og5(19);
    public static final /* synthetic */ og5 H = new og5(20);
    public static final /* synthetic */ og5 I = new og5(21);
    public static final /* synthetic */ og5 J = new og5(22);
    public static final /* synthetic */ og5 K = new og5(23);
    public static final /* synthetic */ og5 L = new og5(24);
    public static final /* synthetic */ og5 M = new og5(25);
    public static final /* synthetic */ og5 N = new og5(26);
    public static final /* synthetic */ og5 O = new og5(27);
    public static final /* synthetic */ og5 P = new og5(28);
    public static final /* synthetic */ og5 Q = new og5(29);

    public /* synthetic */ og5(byte b) {
        this.x = b;
    }

    public static final boolean b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.vm7
    public Object a() {
        switch (this.x) {
            case 12:
                return new Boolean(((Boolean) ai7.a.get()).booleanValue());
            case 13:
                List list = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(3600000L, 1, "measurement.app_uninstalled_additional_ad_id_cache_time").get();
            case 14:
                List list2 = tq7.a;
                return (String) ei7.c.get();
            case 15:
                List list3 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(100000L, 20, "measurement.store.max_stored_events_per_app").get()).longValue());
            case 16:
                List list4 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(600000L, 51, "measurement.sgtm.upload.retry_interval").get();
            case 17:
                List list5 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(10L, 42, "measurement.sgtm.batch.retry_max_count").get()).longValue());
            case 18:
                List list6 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(600000L, 48, "measurement.sgtm.upload.min_delay_after_background").get();
            case 19:
                List list7 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(3600000L, 65, "measurement.upload.interval").get();
            case 20:
                List list8 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(86400000L, 53, "measurement.upload.stale_data_deletion_interval").get();
            case 21:
                List list9 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(6L, 76, "measurement.upload.retry_count").get()).longValue());
            case 22:
                List list10 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(5000L, 36, "measurement.service_client.idle_disconnect_millis").get();
            case 23:
                List list11 = tq7.a;
                wi7.y.get();
                return (Long) xi7.a.f(-1L, 4, "measurement.test.long_flag").get();
            case 24:
                List list12 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(27L, 23, "measurement.upload.max_item_scoped_custom_parameters").get()).longValue());
            case 25:
                List list13 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(100L, 67, "measurement.upload.max_bundles").get()).longValue());
            case 26:
                List list14 = tq7.a;
                ph7.y.get();
                return (String) qh7.a.h(58, "measurement.rb.attribution.uri_path", "privacy-sandbox/register-app-conversion").get();
            case 27:
                List list15 = tq7.a;
                ph7.y.get();
                return (String) qh7.a.h(59, "measurement.rb.attribution.query_parameters_to_remove", "").get();
            case 28:
                List list16 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(0L, 25, "measurement.rb.attribution.max_trigger_uris_queried_at_once").get()).longValue());
            default:
                List list17 = tq7.a;
                ph7.y.get();
                return (Boolean) qh7.a.e(10, "measurement.config.default_flag_values", true).get();
        }
    }

    @Override // defpackage.vj7
    public /* synthetic */ String e(String str, String str2) {
        return null;
    }

    public /* synthetic */ og5(Object obj, byte b) {
        this.x = b;
    }
}
