package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class nh7 implements qc2 {
    public static final /* synthetic */ nh7 b = new nh7(0);
    public static final /* synthetic */ nh7 c = new nh7(1);
    public static final /* synthetic */ nh7 d = new nh7(2);
    public static final /* synthetic */ nh7 e = new nh7(3);
    public final /* synthetic */ byte a;

    public /* synthetic */ nh7(byte b2) {
        this.a = b2;
    }

    @Override // defpackage.qc2
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                String str = oh7.b;
                if (str == null) {
                    synchronized (oh7.class) {
                        try {
                            str = oh7.b;
                            if (str == null) {
                                str = ox7.b(context, "com.google.android.gms.measurement");
                                oh7.b = str;
                            }
                        } finally {
                        }
                    }
                }
                return str;
            case 1:
                qb7 qb7Var = a28.h;
                return "";
            case 2:
                yy7 yy7Var = (yy7) obj;
                o38 x = q38.x();
                if (yy7Var == null) {
                    return (q38) x.e();
                }
                for (bz7 bz7Var : yy7Var.v()) {
                    s38 x2 = u38.x();
                    String r = bz7Var.r();
                    x2.c();
                    ((u38) x2.y).y(r);
                    int F = bz7Var.F();
                    int i = F - 1;
                    if (F != 0) {
                        if (i != 0) {
                            if (i != 1) {
                                if (i != 2) {
                                    if (i != 3) {
                                        if (i == 4) {
                                            we7 w = bz7Var.w();
                                            x2.c();
                                            ((u38) x2.y).D(w);
                                        } else {
                                            ze0.m("No known flag type");
                                            return null;
                                        }
                                    } else {
                                        String v = bz7Var.v();
                                        x2.c();
                                        ((u38) x2.y).C(v);
                                    }
                                } else {
                                    double u = bz7Var.u();
                                    x2.c();
                                    ((u38) x2.y).B(u);
                                }
                            } else {
                                boolean t = bz7Var.t();
                                x2.c();
                                ((u38) x2.y).A(t);
                            }
                        } else {
                            long s = bz7Var.s();
                            x2.c();
                            ((u38) x2.y).z(s);
                        }
                        u38 u38Var = (u38) x2.e();
                        x.c();
                        ((q38) x.y).D(u38Var);
                    } else {
                        throw null;
                    }
                }
                String u2 = yy7Var.u();
                x.c();
                ((q38) x.y).B(u2);
                String r2 = yy7Var.r();
                x.c();
                ((q38) x.y).z(r2);
                long w2 = yy7Var.w();
                x.c();
                ((q38) x.y).C(w2);
                if (yy7Var.s()) {
                    we7 t2 = yy7Var.t();
                    x.c();
                    ((q38) x.y).A(t2);
                }
                return (q38) x.e();
            default:
                cz7 cz7Var = (cz7) obj;
                if (cz7Var.x == 29514) {
                    c08 u3 = e08.u();
                    wz7 E = xz7.E();
                    long currentTimeMillis = System.currentTimeMillis();
                    E.c();
                    ((xz7) E.y).G(currentTimeMillis);
                    u3.c();
                    ((e08) u3.y).v((xz7) E.e());
                    return (e08) u3.e();
                }
                throw cz7Var;
        }
    }
}
