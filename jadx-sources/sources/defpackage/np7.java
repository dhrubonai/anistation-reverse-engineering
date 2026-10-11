package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class np7 implements vm7, xq1, cb8 {
    public final /* synthetic */ byte x;
    public static final /* synthetic */ np7 y = new np7(0);
    public static final /* synthetic */ np7 z = new np7(1);
    public static final /* synthetic */ np7 A = new np7(2);
    public static final /* synthetic */ np7 B = new np7(3);
    public static final /* synthetic */ np7 C = new np7(4);
    public static final /* synthetic */ np7 D = new np7(5);

    public /* synthetic */ np7(byte b) {
        this.x = b;
    }

    @Override // defpackage.vm7
    public Object a() {
        switch (this.x) {
            case 0:
                List list = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(65536L, 66, "measurement.upload.max_bundle_size").get()).longValue());
            case 1:
                List list2 = tq7.a;
                return (Boolean) qj7.a.get();
            case 2:
                List list3 = tq7.a;
                return (Boolean) ii7.b.get();
            case 3:
                List list4 = tq7.a;
                yi7.y.get();
                return (Boolean) zi7.a.e(1, "measurement.rb.attribution.client2", true).get();
            case 4:
                List list5 = tq7.a;
                yi7.y.get();
                return (Boolean) zi7.a.e(2, "measurement.rb.attribution.service.trigger_uris_high_priority", true).get();
            default:
                return new Boolean(((Boolean) oi7.a.get()).booleanValue());
        }
    }

    @Override // defpackage.xq1
    public n3 b(Context context, String str, wq1 wq1Var) {
        int b;
        int i = -1;
        switch (this.x) {
            case 6:
                n3 n3Var = new n3();
                int b2 = wq1Var.b(context, str, true);
                n3Var.b = b2;
                if (b2 != 0) {
                    n3Var.c = 1;
                } else {
                    int c = wq1Var.c(context, str);
                    n3Var.a = c;
                    if (c != 0) {
                        n3Var.c = -1;
                    }
                }
                return n3Var;
            default:
                n3 n3Var2 = new n3();
                int c2 = wq1Var.c(context, str);
                n3Var2.a = c2;
                int i2 = 0;
                if (c2 != 0) {
                    b = wq1Var.b(context, str, false);
                    n3Var2.b = b;
                } else {
                    b = wq1Var.b(context, str, true);
                    n3Var2.b = b;
                }
                int i3 = n3Var2.a;
                if (i3 == 0) {
                    if (b == 0) {
                        i = 0;
                        n3Var2.c = i;
                        return n3Var2;
                    }
                } else {
                    i2 = i3;
                }
                if (i2 < b) {
                    i = 1;
                }
                n3Var2.c = i;
                return n3Var2;
        }
    }

    @Override // defpackage.cb8
    public boolean c(Class cls) {
        return false;
    }

    @Override // defpackage.cb8
    public ob8 d(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }
}
