package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z81 implements kj3 {
    public final q41 A;
    public bm2 B;
    public long C;
    public long D;
    public long E;
    public long F;
    public boolean G;
    public IOException H;
    public boolean I;
    public final /* synthetic */ b91 J;
    public final Uri x;
    public final HashSet y;
    public final dn0 z;

    public z81(b91 b91Var, Uri uri, String str) {
        this.J = b91Var;
        this.x = uri;
        HashSet hashSet = new HashSet();
        this.y = hashSet;
        hashSet.add(str);
        this.z = new dn0("DefaultHlsPlaylistTracker:MediaPlaylist", (byte) 2);
        this.A = ((o41) b91Var.x.y).H();
    }

    @Override // defpackage.kj3
    public final q03 B(mj3 mj3Var, long j, long j2, IOException iOException, int i) {
        boolean z;
        int i2;
        q03 q03Var;
        gj4 gj4Var = (gj4) mj3Var;
        q03 q03Var2 = dn0.E;
        long j3 = gj4Var.a;
        byte b = gj4Var.c;
        hj3 hj3Var = new hj3(j3, gj4Var.b, j);
        iy5 iy5Var = gj4Var.d;
        hj3Var.f = iy5Var.z;
        hj3Var.g = iy5Var.A;
        hj3Var.c = j2;
        hj3Var.d = iy5Var.y;
        ij3 ij3Var = new ij3(hj3Var);
        boolean z2 = true;
        if (iy5Var.z.getQueryParameter("_HLS_msn") != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = iOException instanceof hm2;
        Uri uri = this.x;
        b91 b91Var = this.J;
        if (z || z3) {
            if (iOException instanceof oq2) {
                i2 = ((oq2) iOException).z;
            } else {
                i2 = Integer.MAX_VALUE;
            }
            if (z3 || i2 == 400 || i2 == 503) {
                this.E = SystemClock.elapsedRealtime();
                c(uri);
                eb2 eb2Var = b91Var.C;
                String str = eq6.a;
                eb2Var.s(ij3Var, b, iOException, true);
                return q03Var2;
            }
        }
        fr0 fr0Var = new fr0(iOException, i, (byte) 4);
        Iterator it = b91Var.B.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= !((lm2) it.next()).g(uri, fr0Var, false);
        }
        q18 q18Var = b91Var.z;
        if (z4) {
            q18Var.getClass();
            long j4 = q18.j(fr0Var);
            if (j4 != -9223372036854775807L) {
                q03Var = new q03(0, j4);
            } else {
                q03Var = dn0.F;
            }
            q03Var2 = q03Var;
        }
        int i3 = q03Var2.x;
        if (i3 != 0 && i3 != 1) {
            z2 = false;
        }
        b91Var.C.s(ij3Var, b, iOException, !z2);
        if (!z2) {
            q18Var.getClass();
        }
        return q03Var2;
    }

    public final Uri a() {
        String str;
        bm2 bm2Var = this.B;
        Uri uri = this.x;
        if (bm2Var != null) {
            am2 am2Var = bm2Var.v;
            if (am2Var.a != -9223372036854775807L || am2Var.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                bm2 bm2Var2 = this.B;
                if (bm2Var2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(bm2Var2.k + bm2Var2.r.size()));
                    bm2 bm2Var3 = this.B;
                    if (bm2Var3.n != -9223372036854775807L) {
                        nw2 nw2Var = bm2Var3.s;
                        int size = nw2Var.size();
                        if (!nw2Var.isEmpty() && ((wl2) bx7.z(nw2Var)).J) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                am2 am2Var2 = this.B.v;
                if (am2Var2.a != -9223372036854775807L) {
                    if (am2Var2.b) {
                        str = "v2";
                    } else {
                        str = "YES";
                    }
                    buildUpon.appendQueryParameter("_HLS_skip", str);
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, zp2] */
    public final void b(Uri uri) {
        b91 b91Var = this.J;
        fj4 f = b91Var.y.f(b91Var.H, this.B);
        Map map = Collections.EMPTY_MAP;
        io3.w(uri, "The uri must be set.");
        v41 v41Var = new v41(uri, 0L, 1, null, map, 0L, -1L, null, 1);
        ?? obj = new Object();
        obj.x = this.A;
        obj.y = v41Var;
        obj.z = f;
        ol2 ol2Var = b91Var.J;
        String str = null;
        if (ol2Var != null && ol2Var.k) {
            a91 a91Var = (a91) b91Var.A.get(this.x);
            HashSet hashSet = this.y;
            if (a91Var != null) {
                String str2 = a91Var.a.d;
                if (hashSet.contains(str2)) {
                    str = str2;
                }
            }
            str = (String) bx7.y(hashSet, null);
        }
        obj.A = str;
        gj4 gj4Var = new gj4(obj);
        this.z.T(gj4Var, this, b91Var.z.i(gj4Var.c));
    }

    public final void c(Uri uri) {
        this.F = 0L;
        if (!this.G) {
            dn0 dn0Var = this.z;
            if (dn0Var.F() || ((IOException) dn0Var.A) != null) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.E;
            if (elapsedRealtime < j) {
                this.G = true;
                this.J.E.postDelayed(new gb(this, uri, (byte) 18), j - elapsedRealtime);
            } else {
                b(uri);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0051  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.net.Uri, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v39 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.bm2 r74, defpackage.ij3 r75) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z81.d(bm2, ij3):void");
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
        b91 b91Var = this.J;
        b91Var.z.getClass();
        b91Var.C.p(ij3Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // defpackage.kj3
    public final void k(mj3 mj3Var, long j, long j2) {
        gj4 gj4Var = (gj4) mj3Var;
        gm2 gm2Var = (gm2) gj4Var.f;
        hj3 hj3Var = new hj3(gj4Var.a, gj4Var.b, j);
        iy5 iy5Var = gj4Var.d;
        hj3Var.f = iy5Var.z;
        hj3Var.g = iy5Var.A;
        hj3Var.c = j2;
        hj3Var.d = iy5Var.y;
        ij3 ij3Var = new ij3(hj3Var);
        if (gm2Var instanceof bm2) {
            d((bm2) gm2Var, ij3Var);
            this.J.C.q(ij3Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            bj4 b = bj4.b("Loaded playlist has unexpected type.");
            this.H = b;
            this.J.C.s(ij3Var, 4, b, true);
        }
        this.J.z.getClass();
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
        this.J.C.x(new ij3(hj3Var), gj4Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }
}
