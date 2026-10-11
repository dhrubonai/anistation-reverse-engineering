package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o65 {
    public boolean a;
    public boolean b;
    public final r51 c;
    public final z65 d;
    public final List e;
    public final cw0 f;
    public final a36 g;
    public x26 h;

    public o65(r51 r51Var, z65 z65Var, hj1 hj1Var) {
        int i;
        cw0 fw0Var;
        s65 s65Var = r51Var.g;
        z26 z26Var = r51Var.c;
        h85 h85Var = r51Var.t;
        String str = r51Var.b;
        this.c = r51Var;
        this.d = z65Var;
        List list = r51Var.e;
        this.e = list == null ? nt1.x : list;
        a36 a36Var = null;
        if (h85Var == null) {
            if (z26Var != null) {
                Context context = r51Var.a;
                context.getClass();
                a36Var = z26Var.r(new y26(context, str, new fr0(this, z65Var.getVersion()), false, false));
                this.g = a36Var;
                this.f = new pj4(new fq3(a36Var), str == null ? ":memory:" : str, hj1Var);
            } else {
                ze0.k("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
        } else {
            this.g = null;
            if (h85Var.g()) {
                fw0Var = new pj4(new pz2(this, h85Var), str == null ? ":memory:" : str, hj1Var);
            } else if (str == null) {
                fw0Var = new fw0(new pz2(this, h85Var));
            } else {
                pz2 pz2Var = new pz2(this, h85Var);
                int ordinal = s65Var.ordinal();
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        i = 4;
                    } else {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + s65Var + '\'').toString());
                    }
                } else {
                    i = 1;
                }
                int ordinal2 = s65Var.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + s65Var + '\'').toString());
                }
                fw0Var = new fw0(pz2Var, str, i);
            }
            this.f = fw0Var;
        }
        boolean z = s65Var == s65.y;
        if (a36Var != null) {
            a36Var.setWriteAheadLoggingEnabled(z);
        }
    }

    public static void a(g85 g85Var) {
        m85 s0 = g85Var.s0("PRAGMA busy_timeout");
        try {
            s0.p0();
            long j = s0.getLong(0);
            o80.r(s0, null);
            if (j < 3000) {
                zz.y("PRAGMA busy_timeout = 3000", g85Var);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o80.r(s0, th);
                throw th2;
            }
        }
    }

    public final void b(g85 g85Var) {
        Object y45Var;
        a(g85Var);
        r51 r51Var = this.c;
        s65 s65Var = r51Var.g;
        s65 s65Var2 = s65.y;
        if (s65Var == s65Var2) {
            zz.y("PRAGMA journal_mode = WAL", g85Var);
        } else {
            zz.y("PRAGMA journal_mode = TRUNCATE", g85Var);
        }
        if (r51Var.g == s65Var2) {
            zz.y("PRAGMA synchronous = NORMAL", g85Var);
        } else {
            zz.y("PRAGMA synchronous = FULL", g85Var);
        }
        m85 s0 = g85Var.s0("PRAGMA user_version");
        try {
            s0.p0();
            int i = (int) s0.getLong(0);
            o80.r(s0, null);
            z65 z65Var = this.d;
            if (i != z65Var.getVersion()) {
                zz.y("BEGIN EXCLUSIVE TRANSACTION", g85Var);
                try {
                    if (i == 0) {
                        c(g85Var);
                    } else {
                        d(g85Var, i, z65Var.getVersion());
                    }
                    zz.y("PRAGMA user_version = " + z65Var.getVersion(), g85Var);
                    y45Var = pn6.a;
                } catch (Throwable th) {
                    y45Var = new y45(th);
                }
                if (!(y45Var instanceof y45)) {
                    zz.y("END TRANSACTION", g85Var);
                }
                Throwable b = z45.b(y45Var);
                if (b != null) {
                    zz.y("ROLLBACK TRANSACTION", g85Var);
                    throw b;
                }
            }
            e(g85Var);
        } finally {
        }
    }

    public final void c(g85 g85Var) {
        g85Var.getClass();
        m85 s0 = g85Var.s0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (s0.p0()) {
                if (s0.getLong(0) == 0) {
                    z = true;
                }
            }
            o80.r(s0, null);
            z65 z65Var = this.d;
            z65Var.createAllTables(g85Var);
            if (!z) {
                y65 onValidateSchema = z65Var.onValidateSchema(g85Var);
                if (!onValidateSchema.a) {
                    ov3.q(onValidateSchema.b, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            f(g85Var);
            z65Var.onCreate(g85Var);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((pm0) it.next()).getClass();
                if (g85Var instanceof w26) {
                    ((w26) g85Var).x.getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o80.r(s0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.g85 r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o65.d(g85, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.g85 r10) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o65.e(g85):void");
    }

    public final void f(g85 g85Var) {
        zz.y("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)", g85Var);
        String identityHash = this.d.getIdentityHash();
        identityHash.getClass();
        zz.y("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + identityHash + "')", g85Var);
    }

    public o65(r51 r51Var, pz3 pz3Var, hj1 hj1Var) {
        s65 s65Var = r51Var.g;
        this.c = r51Var;
        this.d = new z65(-1, "", "");
        List list = r51Var.e;
        nt1 nt1Var = nt1.x;
        this.e = list == null ? nt1Var : list;
        ArrayList v0 = yo0.v0(list == null ? nt1Var : list, new pm0(new pz3((Object) this, (byte) 15)));
        Context context = r51Var.a;
        String str = r51Var.b;
        z26 z26Var = r51Var.c;
        a94 a94Var = r51Var.d;
        boolean z = r51Var.f;
        Executor executor = r51Var.h;
        Executor executor2 = r51Var.i;
        Intent intent = r51Var.j;
        boolean z2 = r51Var.k;
        boolean z3 = r51Var.l;
        Set set = r51Var.m;
        String str2 = r51Var.n;
        File file = r51Var.o;
        Callable callable = r51Var.p;
        List list2 = r51Var.q;
        List list3 = r51Var.r;
        boolean z4 = r51Var.s;
        h85 h85Var = r51Var.t;
        l11 l11Var = r51Var.u;
        context.getClass();
        executor.getClass();
        executor2.getClass();
        a36 a36Var = (a36) pz3Var.invoke(new r51(context, str, z26Var, a94Var, v0, z, s65Var, executor, executor2, intent, z2, z3, set, str2, file, callable, list2, list3, z4, h85Var, l11Var));
        this.g = a36Var;
        fq3 fq3Var = new fq3(a36Var);
        String str3 = r51Var.b;
        this.f = new pj4(fq3Var, str3 == null ? ":memory:" : str3, hj1Var);
        boolean z5 = s65Var == s65.y;
        if (a36Var != null) {
            a36Var.setWriteAheadLoggingEnabled(z5);
        }
    }
}
