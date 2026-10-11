package defpackage;

import android.net.Uri;
import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ol2 {
    public final wz2 a;
    public final af2 b;
    public final z20 c;
    public final nw2 d;
    public final nw2 e;
    public final nw2 f;
    public final nw2 g;
    public final HashSet h;
    public final HashSet i;
    public final k46 j;
    public boolean k;
    public String l;
    public nw2 m;

    public ol2(i75 i75Var, b91 b91Var, af2 af2Var, z20 z20Var) {
        this.a = new wz2(new h5((Object) i75Var, (byte) 25));
        this.b = af2Var;
        this.c = z20Var;
        nw2 c = b91Var.c(0);
        c.getClass();
        this.d = c;
        nw2 c2 = b91Var.c(1);
        c2.getClass();
        this.e = c2;
        nw2 c3 = b91Var.c(2);
        c3.getClass();
        this.f = c3;
        nw2 c4 = b91Var.c(3);
        c4.getClass();
        this.g = c4;
        io3.B(!c.isEmpty());
        om2 om2Var = (om2) c.get(0);
        om2Var.getClass();
        this.h = new HashSet(om2Var.a());
        this.i = new HashSet();
        this.j = new k46(new Handler(eq6.z(), null));
        this.l = ((om2) c.get(0)).d;
    }

    public static Uri.Builder b(Uri uri, ly5 ly5Var) {
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        String str = ly5Var.a;
        if (str != null) {
            clearQuery.authority(str);
        }
        TreeMap treeMap = new TreeMap();
        for (String str2 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str2);
            queryParameter.getClass();
            treeMap.put(str2, queryParameter);
        }
        treeMap.putAll(ly5Var.b);
        for (Map.Entry entry : treeMap.entrySet()) {
            clearQuery.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return clearQuery;
    }

    public static void d(ky5 ky5Var, List list, jw2 jw2Var, jw2 jw2Var2) {
        Uri build;
        ly5 ly5Var = ky5Var.c;
        rw2 rw2Var = ly5Var.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            om2 om2Var = (om2) it.next();
            Uri uri = (Uri) om2Var.b.get(ky5Var.a);
            String str = om2Var.a.b;
            uri.getClass();
            if (rw2Var.containsKey(str)) {
                build = (Uri) rw2Var.get(str);
                build.getClass();
            } else {
                build = b(uri, ly5Var).build();
            }
            if (build != null) {
                jw2Var.c(build);
                jw2Var2.c(uri);
            }
        }
    }

    public final boolean a(long j) {
        if (this.k && this.m != null) {
            String str = this.l;
            e(j);
            if (!this.l.equals(str)) {
                this.i.add(str);
                this.j.g(new f32((Object) this, (Object) str, (byte) 5), j);
                return true;
            }
            return false;
        }
        return false;
    }

    public final void c(long j) {
        boolean z;
        Uri uri;
        String str = this.l;
        b91 b91Var = (b91) this.b.y;
        if (j == -9223372036854775807L && b91Var.P == null) {
            z = true;
        } else {
            z = false;
        }
        for (a91 a91Var : b91Var.A.values()) {
            if (j != -9223372036854775807L) {
                uri = a91Var.a.b();
            } else {
                uri = null;
            }
            if (uri == null) {
                a91Var.f(str, z);
            } else {
                a91Var.a(uri, j, str);
            }
        }
    }

    public final void e(long j) {
        String str = this.l;
        z62 listIterator = this.m.listIterator(0);
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            String str2 = (String) listIterator.next();
            if (j == -9223372036854775807L || !str2.equals(str)) {
                if (this.h.contains(str2) && !this.i.contains(str2)) {
                    this.l = str2;
                    break;
                }
            }
        }
        if (!this.l.equals(str)) {
            c(j);
        }
    }

    public final void f() {
        wz2 wz2Var = this.a;
        dn0 dn0Var = (dn0) wz2Var.j;
        if (dn0Var != null) {
            dn0Var.L(null);
            wz2Var.j = null;
        }
        k46 k46Var = (k46) wz2Var.i;
        if (k46Var != null) {
            k46Var.h();
            wz2Var.i = null;
        }
        wz2Var.f = null;
        wz2Var.h = null;
        wz2Var.g = null;
        wz2Var.a = false;
        this.j.h();
        this.k = false;
    }
}
