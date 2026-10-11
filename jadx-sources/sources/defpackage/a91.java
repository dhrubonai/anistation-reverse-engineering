package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a91 {
    public final om2 a;
    public final HashMap b;
    public final boolean c;
    public final /* synthetic */ b91 d;

    public a91(b91 b91Var, om2 om2Var, boolean z) {
        this.d = b91Var;
        this.a = om2Var;
        HashMap hashMap = new HashMap();
        ho6 it = om2Var.a().iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Uri uri = (Uri) om2Var.b.get(str);
            uri.getClass();
            hashMap.put(uri, new z81(this.d, uri, str));
        }
        this.b = hashMap;
        this.c = z;
    }

    public final boolean a(Uri uri, long j, String str) {
        Uri uri2;
        HashMap hashMap = this.b;
        io3.B(hashMap.containsKey(uri));
        z81 z81Var = (z81) hashMap.get(uri);
        z81Var.getClass();
        z81Var.F = SystemClock.elapsedRealtime() + j;
        b91 b91Var = this.d;
        ol2 ol2Var = b91Var.J;
        if (((ol2Var == null || !ol2Var.k || str != null) && f(str, false)) || ((uri2 = b91Var.O) != null && !uri.equals(uri2))) {
            return true;
        }
        nw2 nw2Var = b91Var.K;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < nw2Var.size(); i++) {
            Uri b = ((om2) nw2Var.get(i)).b();
            a91 a91Var = (a91) b91Var.A.get(b);
            a91Var.getClass();
            if (!a91Var.c(b, elapsedRealtime)) {
                b91Var.O = b;
                a91Var.d(b, b91Var.d(b));
                return true;
            }
        }
        return false;
    }

    public final bm2 b(Uri uri) {
        HashMap hashMap = this.b;
        io3.B(hashMap.containsKey(uri));
        z81 z81Var = (z81) hashMap.get(uri);
        z81Var.getClass();
        return z81Var.B;
    }

    public final boolean c(Uri uri, long j) {
        HashMap hashMap = this.b;
        io3.B(hashMap.containsKey(uri));
        z81 z81Var = (z81) hashMap.get(uri);
        z81Var.getClass();
        if (j <= z81Var.F) {
            return true;
        }
        return false;
    }

    public final void d(Uri uri, Uri uri2) {
        HashMap hashMap = this.b;
        io3.B(hashMap.containsKey(uri));
        z81 z81Var = (z81) hashMap.get(uri);
        z81Var.getClass();
        z81Var.c(uri2);
    }

    public final void e(boolean z, Uri uri) {
        Uri uri2;
        HashMap hashMap = this.b;
        io3.B(hashMap.containsKey(uri));
        z81 z81Var = (z81) hashMap.get(uri);
        z81Var.getClass();
        if (z) {
            uri2 = z81Var.a();
        } else {
            uri2 = z81Var.x;
        }
        z81Var.c(uri2);
    }

    public final boolean f(String str, boolean z) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        om2 om2Var = this.a;
        HashMap hashMap = this.b;
        if (str != null) {
            for (z81 z81Var : hashMap.values()) {
                if (z81Var.y.contains(str)) {
                    z81Var.F = 0L;
                }
            }
        } else {
            Iterator it = hashMap.values().iterator();
            while (true) {
                if (it.hasNext()) {
                    z81 z81Var2 = (z81) it.next();
                    if (!z81Var2.y.contains(om2Var.d) && elapsedRealtime > z81Var2.F) {
                        str = (String) z81Var2.y.iterator().next();
                        break;
                    }
                } else {
                    str = null;
                    break;
                }
            }
        }
        if (str == null) {
            return false;
        }
        Uri b = om2Var.b();
        io3.B(om2Var.b.containsKey(str));
        om2Var.d = str;
        Uri b2 = om2Var.b();
        b91 b91Var = this.d;
        if (b.equals(b91Var.O)) {
            b91Var.i(z, b2);
        }
        z81 z81Var3 = (z81) hashMap.get(b);
        z81Var3.getClass();
        z81 z81Var4 = (z81) hashMap.get(b2);
        z81Var4.getClass();
        z81Var4.I = z81Var3.I;
        z81Var3.I = false;
        return true;
    }
}
