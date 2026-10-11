package q1;

import android.net.Uri;
import android.os.SystemClock;
import androidx.lifecycle.q0;
import c1.r0;
import f.m0;
import h1.y;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import v1.b0;

/* loaded from: classes.dex */
public final class b implements z1.j {
    public IOException A;
    public final /* synthetic */ c B;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f8973a;

    /* renamed from: b, reason: collision with root package name */
    public final z1.o f8974b = new z1.o("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: c, reason: collision with root package name */
    public final h1.h f8975c;

    /* renamed from: d, reason: collision with root package name */
    public i f8976d;

    /* renamed from: e, reason: collision with root package name */
    public long f8977e;

    /* renamed from: f, reason: collision with root package name */
    public long f8978f;

    /* renamed from: x, reason: collision with root package name */
    public long f8979x;

    /* renamed from: y, reason: collision with root package name */
    public long f8980y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8981z;

    public b(c cVar, Uri uri) {
        this.B = cVar;
        this.f8973a = uri;
        this.f8975c = cVar.f8982a.f8429a.a();
    }

    public static boolean a(b bVar, long j4) {
        boolean z9;
        bVar.f8980y = SystemClock.elapsedRealtime() + j4;
        c cVar = bVar.B;
        if (!bVar.f8973a.equals(cVar.B)) {
            return false;
        }
        List list = cVar.A.f9037e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                b bVar2 = (b) cVar.f8985d.get(((k) list.get(i10)).f9029a);
                bVar2.getClass();
                if (elapsedRealtime > bVar2.f8980y) {
                    Uri uri = bVar2.f8973a;
                    cVar.B = uri;
                    bVar2.c(cVar.b(uri));
                    z9 = true;
                    break;
                }
                i10++;
            } else {
                z9 = false;
                break;
            }
        }
        if (z9) {
            return false;
        }
        return true;
    }

    public final void b(Uri uri) {
        c cVar = this.B;
        z1.r rVar = new z1.r(this.f8975c, uri, 4, cVar.f8983b.j(cVar.A, this.f8976d));
        q0 q0Var = cVar.f8984c;
        int i10 = rVar.f11947c;
        cVar.f8987f.l(new v1.n(rVar.f11945a, rVar.f11946b, this.f8974b.g(rVar, this, q0Var.z(i10))), i10);
    }

    public final void c(Uri uri) {
        this.f8980y = 0L;
        if (!this.f8981z) {
            z1.o oVar = this.f8974b;
            if (!oVar.e() && !oVar.d()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j4 = this.f8979x;
                if (elapsedRealtime < j4) {
                    this.f8981z = true;
                    this.B.f8989y.postDelayed(new m0(9, this, uri), j4 - elapsedRealtime);
                } else {
                    b(uri);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(q1.i r68, v1.n r69) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.b.d(q1.i, v1.n):void");
    }

    @Override // z1.j
    public final void f(z1.l lVar, long j4, long j10) {
        z1.r rVar = (z1.r) lVar;
        m mVar = (m) rVar.f11950f;
        Uri uri = rVar.f11948d.f4562c;
        v1.n nVar = new v1.n(j10);
        if (mVar instanceof i) {
            d((i) mVar, nVar);
            this.B.f8987f.f(nVar, 4);
        } else {
            r0 b10 = r0.b("Loaded playlist has unexpected type.", null);
            this.A = b10;
            this.B.f8987f.j(nVar, 4, b10, true);
        }
        this.B.f8984c.getClass();
    }

    @Override // z1.j
    public final z1.i q(z1.l lVar, long j4, long j10, IOException iOException, int i10) {
        boolean z9;
        int i11;
        z1.i iVar;
        z1.r rVar = (z1.r) lVar;
        long j11 = rVar.f11945a;
        Uri uri = rVar.f11948d.f4562c;
        v1.n nVar = new v1.n(j10);
        if (uri.getQueryParameter("_HLS_msn") != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean z10 = iOException instanceof n;
        Uri uri2 = this.f8973a;
        c cVar = this.B;
        int i12 = rVar.f11947c;
        if (z9 || z10) {
            if (iOException instanceof y) {
                i11 = ((y) iOException).f4644d;
            } else {
                i11 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            }
            if (z10 || i11 == 400 || i11 == 503) {
                this.f8979x = SystemClock.elapsedRealtime();
                c(uri2);
                b0 b0Var = cVar.f8987f;
                int i13 = f1.b0.f3799a;
                b0Var.j(nVar, i12, iOException, true);
                return z1.o.f11940e;
            }
        }
        f1.r rVar2 = new f1.r(nVar, new v1.s(i12), iOException, i10);
        Iterator it = cVar.f8986e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((q) it.next()).a(uri2, rVar2, false);
        }
        q0 q0Var = cVar.f8984c;
        if (z11) {
            q0Var.getClass();
            long A = q0.A(rVar2);
            if (A != -9223372036854775807L) {
                iVar = z1.o.c(A, false);
            } else {
                iVar = z1.o.f11941f;
            }
        } else {
            iVar = z1.o.f11940e;
        }
        boolean a10 = true ^ iVar.a();
        cVar.f8987f.j(nVar, i12, iOException, a10);
        if (a10) {
            q0Var.getClass();
            return iVar;
        }
        return iVar;
    }

    @Override // z1.j
    public final void r(z1.l lVar, long j4, long j10, boolean z9) {
        z1.r rVar = (z1.r) lVar;
        long j11 = rVar.f11945a;
        Uri uri = rVar.f11948d.f4562c;
        v1.n nVar = new v1.n(j10);
        c cVar = this.B;
        cVar.f8984c.getClass();
        cVar.f8987f.c(nVar, 4);
    }
}
