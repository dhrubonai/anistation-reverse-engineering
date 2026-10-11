package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class op7 implements vm7, xq1, g25, zs7 {
    public final /* synthetic */ byte x;
    public static final /* synthetic */ op7 y = new op7(0);
    public static final /* synthetic */ op7 z = new op7(1);
    public static final /* synthetic */ op7 A = new op7(2);
    public static final /* synthetic */ op7 B = new op7(3);
    public static final /* synthetic */ op7 C = new op7(4);
    public static final /* synthetic */ op7 D = new op7(5);
    public static final /* synthetic */ op7 E = new op7(7);
    public static final /* synthetic */ op7 F = new op7(9);

    public /* synthetic */ op7(byte b) {
        this.x = b;
    }

    @Override // defpackage.vm7
    public Object a() {
        switch (this.x) {
            case 0:
                List list = tq7.a;
                return (Boolean) ki7.b.get();
            case 1:
                List list2 = tq7.a;
                return (Boolean) sj7.a.get();
            case 2:
                List list3 = tq7.a;
                return (Boolean) hj7.a.get();
            case 3:
                List list4 = tq7.a;
                yi7.y.get();
                return (Boolean) zi7.a.e(8, "measurement.rb.attribution.uuid_generation", true).get();
            case 4:
                List list5 = tq7.a;
                return (Boolean) dj7.b.get();
            case 5:
                return new Boolean(((Boolean) oi7.b.get()).booleanValue());
            default:
                zk3 zk3Var = lc7.v;
                zk3 zk3Var2 = xh0.k;
                a34.s();
                xh0 xh0Var = xh0.m;
                a34.x(xh0Var);
                a34.s();
                return xh0Var.e.x;
        }
    }

    @Override // defpackage.g25
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i = ww7.k;
    }

    @Override // defpackage.xq1
    public n3 b(Context context, String str, wq1 wq1Var) {
        n3 n3Var = new n3();
        int c = wq1Var.c(context, str);
        n3Var.a = c;
        if (c != 0) {
            n3Var.c = -1;
            return n3Var;
        }
        int b = wq1Var.b(context, str, true);
        n3Var.b = b;
        if (b != 0) {
            n3Var.c = 1;
        }
        return n3Var;
    }
}
