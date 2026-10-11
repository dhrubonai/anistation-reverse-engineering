package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g48 {
    public static final Object j = new Object();
    public static final Object k = new Object();
    public final Context a;
    public final r26 b;
    public final r26 c;
    public final r26 d;
    public final r26 e;
    public final r26 f;
    public final Uri g;
    public volatile xz7 h;
    public final Uri i;

    public g48(Context context, r26 r26Var, r26 r26Var2, r26 r26Var3) {
        this.a = context;
        this.c = r26Var;
        this.b = r26Var3;
        this.d = r26Var2;
        Pattern pattern = c58.a;
        tp tpVar = new tp(context, (byte) 13);
        tpVar.v("phenotype_storage_info");
        tpVar.w("storage-info.pb");
        this.g = tpVar.x();
        tp tpVar2 = new tp(context, (byte) 13);
        tpVar2.v("phenotype_storage_info");
        tpVar2.w("device-encrypted-storage-info.pb");
        Set set = c58.d;
        xt5.j(set.contains("directboot-files"), "The only supported locations are %s: %s", set, "directboot-files");
        tpVar2.z = "directboot-files";
        this.i = tpVar2.x();
        byte b = 1;
        this.e = mv5.e(new wx7(this, b));
        this.f = mv5.e(new ay7(r26Var, b));
    }

    public final void a() {
        y62 fa2Var;
        if (bx7.S(this.a) && c().v() + 86400000 < System.currentTimeMillis()) {
            p04 p04Var = (p04) this.c.get();
            p04Var.getClass();
            ii3 G = wc7.G((ii3) this.f.get());
            int i = y62.E;
            if (G instanceof y62) {
                fa2Var = (y62) G;
            } else {
                fa2Var = new fa2(G);
            }
            h3.r(fa2Var, new k18(this, (byte) 2), p04Var);
            return;
        }
        aw2 aw2Var = aw2.y;
    }

    public final h38 b() {
        String str;
        xz7 c = c();
        boolean t = c.t();
        nw2 o = nw2.o(c.y());
        we7 s = c.s();
        String u = c.u();
        nw2 o2 = nw2.o(c.w());
        nw2 o3 = nw2.o(c.x());
        if (c.z() && c.A().s() == Build.VERSION.SDK_INT) {
            str = c.A().r();
        } else {
            str = "";
        }
        return new h38(t, o, s, u, str, o2, o3, c.r(), c.C(), c.B(), c.D());
    }

    public final xz7 c() {
        xz7 xz7Var;
        xz7 xz7Var2 = this.h;
        if (xz7Var2 == null) {
            synchronized (j) {
                xz7Var = this.h;
                if (xz7Var == null) {
                    xz7Var = xz7.F();
                    if (bx7.S(this.a)) {
                        sg7 sg7Var = (sg7) xz7Var.q(7);
                        ff7 ff7Var = ff7.a;
                        int i = se7.a;
                        ff7 ff7Var2 = ff7.b;
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                        try {
                            InputStream s = nu5.s(((u48) this.d.get()).b(this.g));
                            try {
                                mf7 a = ((lf7) sg7Var).a(s, ff7Var2);
                                if (s != null) {
                                    s.close();
                                }
                                xz7Var = (xz7) a;
                            } catch (Throwable th) {
                                if (s != null) {
                                    try {
                                        s.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException unused) {
                        } finally {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        this.h = xz7Var;
                    }
                }
            }
            return xz7Var;
        }
        return xz7Var2;
    }
}
