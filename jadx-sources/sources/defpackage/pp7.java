package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class pp7 implements vm7, wq1, zs7 {
    public final /* synthetic */ byte x;
    public static final /* synthetic */ pp7 y = new pp7(0);
    public static final /* synthetic */ pp7 z = new pp7(2);
    public static final /* synthetic */ pp7 A = new pp7(3);
    public static final /* synthetic */ pp7 B = new pp7(4);
    public static final /* synthetic */ pp7 C = new pp7(5);
    public static final /* synthetic */ pp7 D = new pp7(6);

    public /* synthetic */ pp7(byte b) {
        this.x = b;
    }

    @Override // defpackage.vm7
    public Object a() {
        switch (this.x) {
            case 0:
                List list = tq7.a;
                return (Boolean) ki7.a.get();
            case 1:
            default:
                throw new IllegalStateException();
            case 2:
                List list2 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(1000L, 70, "measurement.upload.max_events_per_bundle").get()).longValue());
            case 3:
                List list3 = tq7.a;
                yi7.y.get();
                return (Boolean) zi7.a.e(7, "measurement.rb.attribution.enable_trigger_redaction", true).get();
            case 4:
                List list4 = tq7.a;
                return (Boolean) dj7.a.get();
            case 5:
                return new Boolean(((Boolean) vi7.a.get()).booleanValue());
        }
    }

    @Override // defpackage.wq1
    public int b(Context context, String str, boolean z2) {
        return yq1.d(context, str, z2);
    }

    @Override // defpackage.wq1
    public int c(Context context, String str) {
        return yq1.a(context, str);
    }
}
