package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a28 {
    public static final qb7 h = new qb7((byte) 11);
    public static final d18 i;
    public volatile qb0 a;
    public final sx7 b;
    public final String c;
    public final boolean d;
    public final zw2 e;
    public final qb7 f;
    public final xf6 g;

    static {
        nh7 nh7Var = nh7.c;
        int i2 = zw2.z;
        i = new d18(nh7Var, false, v15.G);
    }

    public a28(sx7 sx7Var, d18 d18Var) {
        this.b = sx7Var;
        Context context = sx7Var.b;
        String str = d18Var.d;
        if (str == null) {
            str = (String) d18Var.a.apply(context);
            d18Var.d = str;
        }
        this.c = str;
        this.d = d18Var.b;
        this.e = d18Var.c;
        this.a = null;
        this.f = new qb7((byte) 12);
        this.g = new xf6(sx7Var, str);
    }

    public final qb0 a() {
        qb0 qb0Var;
        qb0 qb0Var2 = this.a;
        if (qb0Var2 == null) {
            synchronized (this) {
                try {
                    qb0Var = this.a;
                    if (qb0Var == null) {
                        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                        try {
                            qb0 f = this.g.f();
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            int i2 = ((gj3) f.B).b - 2;
                            if (i2 != 15 && i2 != 16) {
                                sx7 sx7Var = this.b;
                                sx7Var.g.a();
                                if (!this.d && !this.g.k() && ((String) f.y).isEmpty()) {
                                    final byte b = 0;
                                    sx7Var.a().execute(new Runnable(this) { // from class: g18
                                        public final /* synthetic */ a28 y;

                                        {
                                            this.y = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            x62 a;
                                            x b2;
                                            byte b3 = b;
                                            a28 a28Var = this.y;
                                            switch (b3) {
                                                case 0:
                                                    a28Var.b();
                                                    return;
                                                case 1:
                                                    final y28 y28Var = a28Var.b.i;
                                                    boolean z = a28Var.d;
                                                    o18 o18Var = o18.a;
                                                    final g38 g38Var = (g38) y28Var.c.get();
                                                    if (g38Var == null && !z) {
                                                        aw2 aw2Var = aw2.y;
                                                        return;
                                                    }
                                                    if ((y28Var.e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = y28Var.f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i3 = y28Var.e;
                                                                if ((i3 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(o18Var);
                                                                    y28Var.e = i3 | 64;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    if (y28Var.h == null) {
                                                        synchronized (y28Var.g) {
                                                            try {
                                                                if (y28Var.h == null) {
                                                                    if (g38Var == null) {
                                                                        g38Var = u28.a;
                                                                    }
                                                                    Context context = y28Var.a;
                                                                    if (!bx7.S(context)) {
                                                                        ns1 ns1Var = ns1.z;
                                                                        r26 r26Var = y28Var.b;
                                                                        a = h3.r(bx7.R(context, Executors.callable(ns1Var, null), (Executor) r26Var.get()), new gt() { // from class: s28
                                                                            @Override // defpackage.gt
                                                                            public final ii3 apply(Object obj) {
                                                                                y28 y28Var2 = y28.this;
                                                                                return ((fz7) y28Var2.d.get()).a(new x28(y28Var2, g38Var));
                                                                            }
                                                                        }, (Executor) r26Var.get());
                                                                        y28Var.h = a;
                                                                    } else {
                                                                        a = ((fz7) y28Var.d.get()).a(new x28(y28Var, g38Var));
                                                                        y28Var.h = a;
                                                                    }
                                                                    a.a(new la((Object) a, (byte) 27), (Executor) y28Var.b.get());
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    qb0 a2 = a28Var.a();
                                                    String str = (String) a2.y;
                                                    sx7 sx7Var2 = a28Var.b;
                                                    r26 r26Var2 = sx7Var2.d;
                                                    h38 b4 = sx7Var2.g.b();
                                                    boolean z2 = b4.i;
                                                    byte b5 = 0;
                                                    if (b4.j) {
                                                        if ((str == null || str.isEmpty()) && !z2) {
                                                            aw2 aw2Var2 = aw2.y;
                                                            return;
                                                        }
                                                        oy7 s = uy7.s();
                                                        gj3 gj3Var = (gj3) a2.B;
                                                        byte b6 = gj3Var.a;
                                                        ry7 r = sy7.r();
                                                        r.c();
                                                        ((sy7) r.y).s(b6);
                                                        int i4 = gj3Var.b;
                                                        r.c();
                                                        ((sy7) r.y).t(i4);
                                                        sy7 sy7Var = (sy7) r.e();
                                                        s.c();
                                                        ((uy7) s.y).u(sy7Var);
                                                        if (str != null && !str.isEmpty()) {
                                                            s.c();
                                                            ((uy7) s.y).t(str);
                                                        }
                                                        if (z2) {
                                                            String str2 = a28Var.c;
                                                            s.c();
                                                            ((uy7) s.y).v(str2);
                                                        }
                                                        fz7 fz7Var = (fz7) r26Var2.get();
                                                        uy7 uy7Var = (uy7) s.e();
                                                        ww7 ww7Var = fz7Var.a;
                                                        o76 b7 = o76.b();
                                                        b7.d = new qb7((Object) uy7Var, (byte) 7);
                                                        b7.a = new q12[]{w65.o};
                                                        b7.b = false;
                                                        v78 d = ww7Var.d(0, b7.a());
                                                        fk7 fk7Var = new fk7(ww7Var, uy7Var);
                                                        v78 v78Var = new v78();
                                                        d.b.m(new jo7(fk7Var, v78Var, (byte) 1));
                                                        d.j();
                                                        b2 = fz7.b(v78Var);
                                                    } else if (str != null && !str.isEmpty()) {
                                                        fz7 fz7Var2 = (fz7) r26Var2.get();
                                                        fz7Var2.getClass();
                                                        str.getClass();
                                                        b2 = fz7.b(fz7Var2.a.e(str));
                                                    } else {
                                                        aw2 aw2Var3 = aw2.y;
                                                        return;
                                                    }
                                                    k18 k18Var = new k18(a28Var, b5);
                                                    p04 a3 = sx7Var2.a();
                                                    int i5 = z.I;
                                                    z zVar = new z(b2, cz7.class, k18Var);
                                                    b2.a(zVar, kb0.I(a3, zVar));
                                                    return;
                                            }
                                        }
                                    });
                                    qb0Var = new qb0(q38.y(), (gj3) f.B);
                                    if (this.d || ((gj3) qb0Var.B).b != 17) {
                                        this.a = qb0Var;
                                    }
                                } else {
                                    final byte b2 = 2;
                                    sx7Var.a().execute(new Runnable(this) { // from class: g18
                                        public final /* synthetic */ a28 y;

                                        {
                                            this.y = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            x62 a;
                                            x b22;
                                            byte b3 = b2;
                                            a28 a28Var = this.y;
                                            switch (b3) {
                                                case 0:
                                                    a28Var.b();
                                                    return;
                                                case 1:
                                                    final y28 y28Var = a28Var.b.i;
                                                    boolean z = a28Var.d;
                                                    o18 o18Var = o18.a;
                                                    final g38 g38Var = (g38) y28Var.c.get();
                                                    if (g38Var == null && !z) {
                                                        aw2 aw2Var = aw2.y;
                                                        return;
                                                    }
                                                    if ((y28Var.e & 64) == 0) {
                                                        CopyOnWriteArrayList copyOnWriteArrayList = y28Var.f;
                                                        synchronized (copyOnWriteArrayList) {
                                                            try {
                                                                int i3 = y28Var.e;
                                                                if ((i3 & 64) == 0) {
                                                                    copyOnWriteArrayList.add(o18Var);
                                                                    y28Var.e = i3 | 64;
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    if (y28Var.h == null) {
                                                        synchronized (y28Var.g) {
                                                            try {
                                                                if (y28Var.h == null) {
                                                                    if (g38Var == null) {
                                                                        g38Var = u28.a;
                                                                    }
                                                                    Context context = y28Var.a;
                                                                    if (!bx7.S(context)) {
                                                                        ns1 ns1Var = ns1.z;
                                                                        r26 r26Var = y28Var.b;
                                                                        a = h3.r(bx7.R(context, Executors.callable(ns1Var, null), (Executor) r26Var.get()), new gt() { // from class: s28
                                                                            @Override // defpackage.gt
                                                                            public final ii3 apply(Object obj) {
                                                                                y28 y28Var2 = y28.this;
                                                                                return ((fz7) y28Var2.d.get()).a(new x28(y28Var2, g38Var));
                                                                            }
                                                                        }, (Executor) r26Var.get());
                                                                        y28Var.h = a;
                                                                    } else {
                                                                        a = ((fz7) y28Var.d.get()).a(new x28(y28Var, g38Var));
                                                                        y28Var.h = a;
                                                                    }
                                                                    a.a(new la((Object) a, (byte) 27), (Executor) y28Var.b.get());
                                                                }
                                                            } finally {
                                                            }
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                default:
                                                    qb0 a2 = a28Var.a();
                                                    String str = (String) a2.y;
                                                    sx7 sx7Var2 = a28Var.b;
                                                    r26 r26Var2 = sx7Var2.d;
                                                    h38 b4 = sx7Var2.g.b();
                                                    boolean z2 = b4.i;
                                                    byte b5 = 0;
                                                    if (b4.j) {
                                                        if ((str == null || str.isEmpty()) && !z2) {
                                                            aw2 aw2Var2 = aw2.y;
                                                            return;
                                                        }
                                                        oy7 s = uy7.s();
                                                        gj3 gj3Var = (gj3) a2.B;
                                                        byte b6 = gj3Var.a;
                                                        ry7 r = sy7.r();
                                                        r.c();
                                                        ((sy7) r.y).s(b6);
                                                        int i4 = gj3Var.b;
                                                        r.c();
                                                        ((sy7) r.y).t(i4);
                                                        sy7 sy7Var = (sy7) r.e();
                                                        s.c();
                                                        ((uy7) s.y).u(sy7Var);
                                                        if (str != null && !str.isEmpty()) {
                                                            s.c();
                                                            ((uy7) s.y).t(str);
                                                        }
                                                        if (z2) {
                                                            String str2 = a28Var.c;
                                                            s.c();
                                                            ((uy7) s.y).v(str2);
                                                        }
                                                        fz7 fz7Var = (fz7) r26Var2.get();
                                                        uy7 uy7Var = (uy7) s.e();
                                                        ww7 ww7Var = fz7Var.a;
                                                        o76 b7 = o76.b();
                                                        b7.d = new qb7((Object) uy7Var, (byte) 7);
                                                        b7.a = new q12[]{w65.o};
                                                        b7.b = false;
                                                        v78 d = ww7Var.d(0, b7.a());
                                                        fk7 fk7Var = new fk7(ww7Var, uy7Var);
                                                        v78 v78Var = new v78();
                                                        d.b.m(new jo7(fk7Var, v78Var, (byte) 1));
                                                        d.j();
                                                        b22 = fz7.b(v78Var);
                                                    } else if (str != null && !str.isEmpty()) {
                                                        fz7 fz7Var2 = (fz7) r26Var2.get();
                                                        fz7Var2.getClass();
                                                        str.getClass();
                                                        b22 = fz7.b(fz7Var2.a.e(str));
                                                    } else {
                                                        aw2 aw2Var3 = aw2.y;
                                                        return;
                                                    }
                                                    k18 k18Var = new k18(a28Var, b5);
                                                    p04 a3 = sx7Var2.a();
                                                    int i5 = z.I;
                                                    z zVar = new z(b22, cz7.class, k18Var);
                                                    b22.a(zVar, kb0.I(a3, zVar));
                                                    return;
                                            }
                                        }
                                    });
                                    sx7Var.a.c((we7) f.z, this.e, this.c);
                                    if (this.g.k()) {
                                        final byte b3 = 1;
                                        sx7Var.a().execute(new Runnable(this) { // from class: g18
                                            public final /* synthetic */ a28 y;

                                            {
                                                this.y = this;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                x62 a;
                                                x b22;
                                                byte b32 = b3;
                                                a28 a28Var = this.y;
                                                switch (b32) {
                                                    case 0:
                                                        a28Var.b();
                                                        return;
                                                    case 1:
                                                        final y28 y28Var = a28Var.b.i;
                                                        boolean z = a28Var.d;
                                                        o18 o18Var = o18.a;
                                                        final g38 g38Var = (g38) y28Var.c.get();
                                                        if (g38Var == null && !z) {
                                                            aw2 aw2Var = aw2.y;
                                                            return;
                                                        }
                                                        if ((y28Var.e & 64) == 0) {
                                                            CopyOnWriteArrayList copyOnWriteArrayList = y28Var.f;
                                                            synchronized (copyOnWriteArrayList) {
                                                                try {
                                                                    int i3 = y28Var.e;
                                                                    if ((i3 & 64) == 0) {
                                                                        copyOnWriteArrayList.add(o18Var);
                                                                        y28Var.e = i3 | 64;
                                                                    }
                                                                } finally {
                                                                }
                                                            }
                                                        }
                                                        if (y28Var.h == null) {
                                                            synchronized (y28Var.g) {
                                                                try {
                                                                    if (y28Var.h == null) {
                                                                        if (g38Var == null) {
                                                                            g38Var = u28.a;
                                                                        }
                                                                        Context context = y28Var.a;
                                                                        if (!bx7.S(context)) {
                                                                            ns1 ns1Var = ns1.z;
                                                                            r26 r26Var = y28Var.b;
                                                                            a = h3.r(bx7.R(context, Executors.callable(ns1Var, null), (Executor) r26Var.get()), new gt() { // from class: s28
                                                                                @Override // defpackage.gt
                                                                                public final ii3 apply(Object obj) {
                                                                                    y28 y28Var2 = y28.this;
                                                                                    return ((fz7) y28Var2.d.get()).a(new x28(y28Var2, g38Var));
                                                                                }
                                                                            }, (Executor) r26Var.get());
                                                                            y28Var.h = a;
                                                                        } else {
                                                                            a = ((fz7) y28Var.d.get()).a(new x28(y28Var, g38Var));
                                                                            y28Var.h = a;
                                                                        }
                                                                        a.a(new la((Object) a, (byte) 27), (Executor) y28Var.b.get());
                                                                    }
                                                                } finally {
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        qb0 a2 = a28Var.a();
                                                        String str = (String) a2.y;
                                                        sx7 sx7Var2 = a28Var.b;
                                                        r26 r26Var2 = sx7Var2.d;
                                                        h38 b4 = sx7Var2.g.b();
                                                        boolean z2 = b4.i;
                                                        byte b5 = 0;
                                                        if (b4.j) {
                                                            if ((str == null || str.isEmpty()) && !z2) {
                                                                aw2 aw2Var2 = aw2.y;
                                                                return;
                                                            }
                                                            oy7 s = uy7.s();
                                                            gj3 gj3Var = (gj3) a2.B;
                                                            byte b6 = gj3Var.a;
                                                            ry7 r = sy7.r();
                                                            r.c();
                                                            ((sy7) r.y).s(b6);
                                                            int i4 = gj3Var.b;
                                                            r.c();
                                                            ((sy7) r.y).t(i4);
                                                            sy7 sy7Var = (sy7) r.e();
                                                            s.c();
                                                            ((uy7) s.y).u(sy7Var);
                                                            if (str != null && !str.isEmpty()) {
                                                                s.c();
                                                                ((uy7) s.y).t(str);
                                                            }
                                                            if (z2) {
                                                                String str2 = a28Var.c;
                                                                s.c();
                                                                ((uy7) s.y).v(str2);
                                                            }
                                                            fz7 fz7Var = (fz7) r26Var2.get();
                                                            uy7 uy7Var = (uy7) s.e();
                                                            ww7 ww7Var = fz7Var.a;
                                                            o76 b7 = o76.b();
                                                            b7.d = new qb7((Object) uy7Var, (byte) 7);
                                                            b7.a = new q12[]{w65.o};
                                                            b7.b = false;
                                                            v78 d = ww7Var.d(0, b7.a());
                                                            fk7 fk7Var = new fk7(ww7Var, uy7Var);
                                                            v78 v78Var = new v78();
                                                            d.b.m(new jo7(fk7Var, v78Var, (byte) 1));
                                                            d.j();
                                                            b22 = fz7.b(v78Var);
                                                        } else if (str != null && !str.isEmpty()) {
                                                            fz7 fz7Var2 = (fz7) r26Var2.get();
                                                            fz7Var2.getClass();
                                                            str.getClass();
                                                            b22 = fz7.b(fz7Var2.a.e(str));
                                                        } else {
                                                            aw2 aw2Var3 = aw2.y;
                                                            return;
                                                        }
                                                        k18 k18Var = new k18(a28Var, b5);
                                                        p04 a3 = sx7Var2.a();
                                                        int i5 = z.I;
                                                        z zVar = new z(b22, cz7.class, k18Var);
                                                        b22.a(zVar, kb0.I(a3, zVar));
                                                        return;
                                                }
                                            }
                                        });
                                    }
                                }
                            }
                            qb0Var = f;
                            if (this.d) {
                            }
                            this.a = qb0Var;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            throw th;
                        }
                    }
                } finally {
                }
            }
            return qb0Var;
        }
        return qb0Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        xf6 xf6Var = this.g;
        sx7 sx7Var = (sx7) xf6Var.y;
        fz7 fz7Var = (fz7) sx7Var.d.get();
        String str = (String) xf6Var.A;
        fz7Var.getClass();
        str.getClass();
        ww7 ww7Var = fz7Var.a;
        o76 b = o76.b();
        b.d = new tv(str, (char) 0);
        v78 d = ww7Var.d(0, b.a());
        qp7 qp7Var = new qp7((byte) 7);
        v78 v78Var = new v78();
        d.b.m(new jo7(qp7Var, v78Var, (byte) 0));
        d.j();
        g3 q = h3.q(fz7.b(v78Var), nh7.d, sx7Var.a());
        k18 k18Var = new k18(xf6Var, (byte) 1);
        sx7 sx7Var2 = this.b;
        h3.r(q, k18Var, sx7Var2.a()).a(new ly7((byte) 6, (Object) this, (Object) q, (boolean) (0 == true ? 1 : 0)), sx7Var2.a());
    }
}
