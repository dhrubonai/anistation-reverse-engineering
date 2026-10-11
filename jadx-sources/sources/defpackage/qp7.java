package defpackage;

import com.google.android.gms.measurement.AppMeasurementReceiver;
import com.google.android.gms.tasks.Task;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class qp7 implements vm7, wz0 {
    public final /* synthetic */ byte x;
    public static final /* synthetic */ qp7 y = new qp7((byte) 0);
    public static final /* synthetic */ qp7 z = new qp7((byte) 1);
    public static final /* synthetic */ qp7 A = new qp7((byte) 2);
    public static final /* synthetic */ qp7 B = new qp7((byte) 3);
    public static final /* synthetic */ qp7 C = new qp7((byte) 4);
    public static final /* synthetic */ qp7 D = new qp7((byte) 5);

    public qp7(AppMeasurementReceiver appMeasurementReceiver) {
        this.x = (byte) 6;
    }

    @Override // defpackage.vm7
    public Object a() {
        switch (this.x) {
            case 0:
                List list = tq7.a;
                return (Boolean) ki7.c.get();
            case 1:
                List list2 = tq7.a;
                return Integer.valueOf((int) ((Long) sh7.a.get()).longValue());
            case 2:
                List list3 = tq7.a;
                return (Boolean) lj7.a.get();
            case 3:
                List list4 = tq7.a;
                yi7.y.get();
                return (Boolean) zi7.a.e(4, "measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true).get();
            case 4:
                List list5 = tq7.a;
                ph7.y.get();
                return Integer.valueOf((int) ((Long) qh7.a.f(100000L, 71, "measurement.upload.max_events_per_day").get()).longValue());
            default:
                return new Boolean(((Boolean) fj7.a.get()).booleanValue());
        }
    }

    @Override // defpackage.wz0
    public Object b(Task task) {
        mf7 e;
        sv7 sv7Var = (sv7) task.c();
        vy7 x = yy7.x();
        String str = sv7Var.x;
        x.c();
        ((yy7) x.y).y(str);
        String str2 = sv7Var.z;
        x.c();
        ((yy7) x.y).A(str2);
        boolean z2 = sv7Var.C;
        x.c();
        ((yy7) x.y).D(z2);
        long j = sv7Var.D;
        x.c();
        ((yy7) x.y).E(j);
        byte[] bArr = sv7Var.y;
        if (bArr != null) {
            ve7 j2 = we7.j(bArr, 0, bArr.length);
            x.c();
            ((yy7) x.y).z(j2);
        }
        for (qv7 qv7Var : sv7Var.A) {
            for (zv7 zv7Var : qv7Var.y) {
                int i = zv7Var.D;
                String str3 = zv7Var.x;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i == 5) {
                                    zy7 x2 = bz7.x();
                                    x2.h(str3);
                                    if (i == 5) {
                                        byte[] bArr2 = zv7Var.C;
                                        a34.x(bArr2);
                                        ve7 j3 = we7.j(bArr2, 0, bArr2.length);
                                        x2.c();
                                        ((bz7) x2.y).E(j3);
                                        e = x2.e();
                                    } else {
                                        ze0.k("Not a bytes type");
                                        return null;
                                    }
                                } else {
                                    ze0.k(h11.g(i, "Unrecognized flag type: ", new StringBuilder(String.valueOf(i).length() + 24)));
                                    return null;
                                }
                            } else {
                                zy7 x3 = bz7.x();
                                x3.h(str3);
                                if (i == 4) {
                                    String str4 = zv7Var.B;
                                    a34.x(str4);
                                    x3.c();
                                    ((bz7) x3.y).D(str4);
                                    e = x3.e();
                                } else {
                                    ze0.k("Not a String type");
                                    return null;
                                }
                            }
                        } else {
                            zy7 x4 = bz7.x();
                            x4.h(str3);
                            if (i == 3) {
                                double d = zv7Var.A;
                                x4.c();
                                ((bz7) x4.y).C(d);
                                e = x4.e();
                            } else {
                                ze0.k("Not a double type");
                                return null;
                            }
                        }
                    } else {
                        zy7 x5 = bz7.x();
                        x5.h(str3);
                        if (i == 2) {
                            boolean z3 = zv7Var.z;
                            x5.c();
                            ((bz7) x5.y).B(z3);
                            e = x5.e();
                        } else {
                            ze0.k("Not a boolean type");
                            return null;
                        }
                    }
                } else {
                    zy7 x6 = bz7.x();
                    x6.h(str3);
                    if (i == 1) {
                        long j4 = zv7Var.y;
                        x6.c();
                        ((bz7) x6.y).A(j4);
                        e = x6.e();
                    } else {
                        ze0.k("Not a long type");
                        return null;
                    }
                }
                x.c();
                ((yy7) x.y).B((bz7) e);
            }
            String[] strArr = qv7Var.z;
            if (strArr != null) {
                for (String str5 : strArr) {
                    x.c();
                    ((yy7) x.y).C(str5);
                }
            }
        }
        return (yy7) x.e();
    }

    public /* synthetic */ qp7(byte b) {
        this.x = b;
    }
}
