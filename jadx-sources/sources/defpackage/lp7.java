package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class lp7 implements vm7, xq1, uf7 {
    public final /* synthetic */ byte x;
    public static final /* synthetic */ lp7 y = new lp7(0);
    public static final /* synthetic */ lp7 z = new lp7(1);
    public static final /* synthetic */ lp7 A = new lp7(2);
    public static final /* synthetic */ lp7 B = new lp7(3);
    public static final /* synthetic */ lp7 C = new lp7(4);
    public static final /* synthetic */ lp7 D = new lp7(5);
    public static final /* synthetic */ lp7 E = new lp7(6);

    public /* synthetic */ lp7(byte b) {
        this.x = b;
    }

    @Override // defpackage.vm7
    public Object a() {
        switch (this.x) {
            case 0:
                List list = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(3600000L, 11, "45769094").get();
            case 1:
                List list2 = tq7.a;
                return (Boolean) qi7.a.get();
            case 2:
                List list3 = tq7.a;
                return (Boolean) ii7.a.get();
            case 3:
                List list4 = tq7.a;
                yi7.y.get();
                return (Boolean) zi7.a.e(6, "measurement.rb.attribution.service", true).get();
            case 4:
                List list5 = tq7.a;
                return (Boolean) bj7.a.get();
            case 5:
                List list6 = tq7.a;
                ph7.y.get();
                return (Long) qh7.a.f(10000L, 0, "measurement.ad_id_cache_time").get();
            default:
                return new Boolean(((Boolean) jj7.a.get()).booleanValue());
        }
    }

    @Override // defpackage.xq1
    public n3 b(Context context, String str, wq1 wq1Var) {
        n3 n3Var = new n3();
        n3Var.a = wq1Var.c(context, str);
        int i = 1;
        int b = wq1Var.b(context, str, true);
        n3Var.b = b;
        int i2 = n3Var.a;
        if (i2 == 0) {
            i2 = 0;
            if (b == 0) {
                i = 0;
                n3Var.c = i;
                return n3Var;
            }
        }
        if (i2 >= b) {
            i = -1;
        }
        n3Var.c = i;
        return n3Var;
    }
}
