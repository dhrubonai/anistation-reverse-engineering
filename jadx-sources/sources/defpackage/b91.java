package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.unity3d.ads.adplayer.DisplayRecoverer;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b91 implements kj3 {
    public static final v71 T = new v71((byte) 3);
    public eb2 C;
    public dn0 D;
    public Handler E;
    public cm2 F;
    public z20 G;
    public fm2 H;
    public bj4 I;
    public ol2 J;
    public nw2 K;
    public nw2 L;
    public nw2 M;
    public nw2 N;
    public Uri O;
    public bm2 P;
    public Uri Q;
    public boolean R;
    public final i75 x;
    public final jm2 y;
    public final q18 z;
    public final CopyOnWriteArrayList B = new CopyOnWriteArrayList();
    public final HashMap A = new HashMap();
    public long S = -9223372036854775807L;

    public b91(i75 i75Var, q18 q18Var, jm2 jm2Var) {
        this.x = i75Var;
        this.y = jm2Var;
        this.z = q18Var;
    }

    @Override // defpackage.kj3
    public final q03 B(mj3 mj3Var, long j, long j2, IOException iOException, int i) {
        boolean z;
        long min;
        gj4 gj4Var = (gj4) mj3Var;
        hj3 hj3Var = new hj3(gj4Var.a, gj4Var.b, j);
        iy5 iy5Var = gj4Var.d;
        hj3Var.f = iy5Var.z;
        hj3Var.g = iy5Var.A;
        hj3Var.c = j2;
        hj3Var.d = iy5Var.y;
        ij3 ij3Var = new ij3(hj3Var);
        byte b = gj4Var.c;
        this.z.getClass();
        Throwable th = iOException;
        while (true) {
            z = true;
            if (th != null) {
                if ((th instanceof bj4) || (th instanceof FileNotFoundException) || (th instanceof lq2) || (th instanceof oj3) || ((th instanceof s41) && ((s41) th).x == 2008)) {
                    break;
                }
                th = th.getCause();
            } else {
                min = Math.min((i - 1) * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION);
                break;
            }
        }
        min = -9223372036854775807L;
        if (min != -9223372036854775807L) {
            z = false;
        }
        this.C.s(ij3Var, b, iOException, z);
        if (z) {
            return dn0.F;
        }
        return new q03(0, min);
    }

    public final void a(List list, boolean z) {
        for (int i = 0; i < list.size(); i++) {
            om2 om2Var = (om2) list.get(i);
            a91 a91Var = new a91(this, om2Var, z);
            ho6 it = zw2.m(om2Var.b.values()).iterator();
            while (it.hasNext()) {
                this.A.put((Uri) it.next(), a91Var);
            }
        }
    }

    public final bm2 b(boolean z, Uri uri) {
        HashMap hashMap = this.A;
        a91 a91Var = (a91) hashMap.get(uri);
        if (a91Var == null) {
            return null;
        }
        bm2 b = a91Var.b(uri);
        if (b != null && z) {
            i(false, uri);
            a91 a91Var2 = (a91) hashMap.get(uri);
            a91Var2.getClass();
            HashMap hashMap2 = a91Var2.b;
            io3.B(hashMap2.containsKey(uri));
            z81 z81Var = (z81) hashMap2.get(uri);
            z81Var.getClass();
            if (!z81Var.I) {
                io3.B(hashMap2.containsKey(uri));
                z81 z81Var2 = (z81) hashMap2.get(uri);
                z81Var2.getClass();
                z81Var2.I = true;
                bm2 b2 = a91Var2.b(uri);
                if (b2 != null && !b2.o) {
                    a91Var2.e(true, uri);
                }
            }
        }
        return b;
    }

    public final nw2 c(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return this.N;
                }
                return this.M;
            }
            return this.L;
        }
        return this.K;
    }

    public final Uri d(Uri uri) {
        xl2 xl2Var;
        bm2 bm2Var = this.P;
        if (bm2Var != null && bm2Var.v.e && (xl2Var = (xl2) bm2Var.t.get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(xl2Var.b));
            int i = xl2Var.c;
            if (i != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean e(om2 om2Var, long j) {
        boolean z;
        a91 a91Var = (a91) this.A.get(om2Var.b());
        if (a91Var == null) {
            return false;
        }
        Iterator it = a91Var.b.values().iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            if (j <= ((z81) it.next()).F) {
                z = true;
            } else {
                z = false;
            }
            z2 &= z;
        }
        return z2;
    }

    public final boolean f(Uri uri, long j) {
        a91 a91Var = (a91) this.A.get(uri);
        if (a91Var != null) {
            return a91Var.c(uri, j);
        }
        return false;
    }

    @Override // defpackage.kj3
    public final void g(mj3 mj3Var, long j, long j2, boolean z) {
        gj4 gj4Var = (gj4) mj3Var;
        hj3 hj3Var = new hj3(gj4Var.a, gj4Var.b, j);
        iy5 iy5Var = gj4Var.d;
        hj3Var.f = iy5Var.z;
        hj3Var.g = iy5Var.A;
        hj3Var.c = j2;
        hj3Var.d = iy5Var.y;
        ij3 ij3Var = new ij3(hj3Var);
        this.z.getClass();
        this.C.p(ij3Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final boolean h(Uri uri) {
        int i;
        a91 a91Var = (a91) this.A.get(uri);
        if (a91Var != null) {
            HashMap hashMap = a91Var.b;
            io3.B(hashMap.containsKey(uri));
            z81 z81Var = (z81) hashMap.get(uri);
            z81Var.getClass();
            if (z81Var.B != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long max = Math.max(DisplayRecoverer.DEFAULT_MAX_BACKGROUND_AGE_MS, eq6.l0(z81Var.B.u));
                bm2 bm2Var = z81Var.B;
                if (bm2Var.o || (i = bm2Var.d) == 2 || i == 1 || z81Var.C + max > elapsedRealtime) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void i(boolean z, Uri uri) {
        boolean z2;
        if (!uri.equals(this.O)) {
            HashMap hashMap = this.A;
            a91 a91Var = (a91) hashMap.get(uri);
            boolean z3 = false;
            if (a91Var != null) {
                z2 = a91Var.c;
            } else {
                z2 = false;
            }
            if (z2) {
                bm2 bm2Var = this.P;
                if (bm2Var == null || !bm2Var.o) {
                    a91 a91Var2 = (a91) hashMap.get(uri);
                    a91Var2.getClass();
                    bm2 b = a91Var2.b(uri);
                    if (b != null && b.o) {
                        z3 = true;
                    }
                    if (!z3 && z) {
                        a91Var2.d(uri, d(uri));
                        this.Q = uri;
                        return;
                    }
                    this.O = uri;
                    if (z3) {
                        this.P = b;
                        this.F.u(b);
                    } else {
                        a91Var2.d(uri, d(uri));
                    }
                }
            }
        }
    }

    public final void j(Uri uri) {
        a91 a91Var = (a91) this.A.get(uri);
        if (a91Var != null) {
            HashMap hashMap = a91Var.b;
            io3.B(hashMap.containsKey(uri));
            z81 z81Var = (z81) hashMap.get(uri);
            z81Var.getClass();
            dn0 dn0Var = z81Var.z;
            IOException iOException = (IOException) dn0Var.A;
            if (iOException == null) {
                lj3 lj3Var = (lj3) dn0Var.z;
                if (lj3Var != null) {
                    int i = lj3Var.x;
                    IOException iOException2 = lj3Var.B;
                    if (iOException2 != null && lj3Var.C > i) {
                        throw iOException2;
                    }
                }
                IOException iOException3 = z81Var.H;
                if (iOException3 != null) {
                    throw iOException3;
                }
                return;
            }
            throw iOException;
        }
    }

    @Override // defpackage.kj3
    public final void k(mj3 mj3Var, long j, long j2) {
        fm2 fm2Var;
        gj4 gj4Var = (gj4) mj3Var;
        gm2 gm2Var = (gm2) gj4Var.f;
        boolean z = gm2Var instanceof bm2;
        if (z) {
            String str = gm2Var.a;
            fm2 fm2Var2 = fm2.o;
            Uri parse = Uri.parse(str);
            da2 da2Var = new da2();
            da2Var.a = "0";
            da2Var.n = qy3.n("application/x-mpegURL");
            List singletonList = Collections.singletonList(new em2(parse, new ea2(da2Var), null, null, null, null, null, null));
            List list = Collections.EMPTY_LIST;
            fm2Var = new fm2("", list, singletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list, null);
        } else {
            fm2Var = (fm2) gm2Var;
        }
        this.H = fm2Var;
        mm2 mm2Var = new mm2(fm2Var);
        try {
            mm2Var.c();
            this.K = (nw2) mm2Var.f;
            this.L = mm2Var.b(1);
            this.M = mm2Var.b(2);
            this.N = mm2Var.b(3);
            pz2 pz2Var = this.H.n;
            if (pz2Var != null) {
                i75 i75Var = this.x;
                af2 af2Var = new af2((Object) this, (byte) 16);
                z20 z20Var = this.G;
                z20Var.getClass();
                ol2 ol2Var = new ol2(i75Var, this, af2Var, z20Var);
                this.J = ol2Var;
                Uri uri = (Uri) pz2Var.y;
                String str2 = (String) pz2Var.z;
                eb2 eb2Var = this.C;
                if (str2 != null) {
                    io3.B(ol2Var.h.contains(str2));
                    ol2Var.l = str2;
                }
                ol2Var.k = true;
                ol2Var.c(-9223372036854775807L);
                wz2 wz2Var = ol2Var.a;
                cn7 cn7Var = new cn7(ol2Var);
                wz2Var.e = uri;
                wz2Var.f = cn7Var;
                wz2Var.g = eb2Var;
                wz2Var.i = new k46(new Handler(eq6.z(), null));
                wz2Var.j = new dn0("SteeringManifestTracker", (byte) 2);
                wz2Var.a = true;
                wz2Var.b();
            }
            this.O = ((om2) this.K.get(0)).b();
            this.B.add(new y81(this));
            a(this.K, true);
            a(this.L, false);
            a(this.M, false);
            a(this.N, false);
            hj3 hj3Var = new hj3(gj4Var.a, gj4Var.b, j);
            iy5 iy5Var = gj4Var.d;
            hj3Var.f = iy5Var.z;
            hj3Var.g = iy5Var.A;
            hj3Var.c = j2;
            hj3Var.d = iy5Var.y;
            ij3 ij3Var = new ij3(hj3Var);
            a91 a91Var = (a91) this.A.get(this.O);
            a91Var.getClass();
            if (z) {
                Uri uri2 = gj4Var.d.z;
                HashMap hashMap = a91Var.b;
                io3.B(hashMap.containsKey(uri2));
                z81 z81Var = (z81) hashMap.get(uri2);
                z81Var.getClass();
                z81Var.d((bm2) gm2Var, ij3Var);
            } else {
                a91Var.e(false, this.O);
            }
            this.z.getClass();
            this.C.q(ij3Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } catch (bj4 e) {
            this.I = e;
        }
    }

    @Override // defpackage.kj3
    public final void r(mj3 mj3Var, long j, long j2, int i) {
        gj4 gj4Var = (gj4) mj3Var;
        hj3 hj3Var = new hj3(gj4Var.a, gj4Var.b, j);
        if (i != 0) {
            iy5 iy5Var = gj4Var.d;
            hj3Var.f = iy5Var.z;
            hj3Var.g = iy5Var.A;
            hj3Var.c = j2;
            hj3Var.d = iy5Var.y;
        }
        this.C.x(new ij3(hj3Var), gj4Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }
}
