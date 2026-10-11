package q1;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import androidx.lifecycle.q0;
import c1.u;
import c1.v;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import r6.s1;
import v1.b0;

/* loaded from: classes.dex */
public final class c implements s, z1.j {
    public static final j1.l F = new j1.l(8);
    public l A;
    public Uri B;
    public i C;
    public boolean D;

    /* renamed from: a, reason: collision with root package name */
    public final p1.c f8982a;

    /* renamed from: b, reason: collision with root package name */
    public final p f8983b;

    /* renamed from: c, reason: collision with root package name */
    public final q0 f8984c;

    /* renamed from: f, reason: collision with root package name */
    public b0 f8987f;

    /* renamed from: x, reason: collision with root package name */
    public z1.o f8988x;

    /* renamed from: y, reason: collision with root package name */
    public Handler f8989y;

    /* renamed from: z, reason: collision with root package name */
    public r f8990z;

    /* renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f8986e = new CopyOnWriteArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f8985d = new HashMap();
    public long E = -9223372036854775807L;

    public c(p1.c cVar, q0 q0Var, p pVar) {
        this.f8982a = cVar;
        this.f8983b = pVar;
        this.f8984c = q0Var;
    }

    public final i a(boolean z9, Uri uri) {
        i iVar;
        HashMap hashMap = this.f8985d;
        i iVar2 = ((b) hashMap.get(uri)).f8976d;
        if (iVar2 != null && z9 && !uri.equals(this.B)) {
            List list = this.A.f9037e;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (uri.equals(((k) list.get(i10)).f9029a)) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (z10 && ((iVar = this.C) == null || !iVar.o)) {
                this.B = uri;
                b bVar = (b) hashMap.get(uri);
                i iVar3 = bVar.f8976d;
                if (iVar3 != null && iVar3.o) {
                    this.C = iVar3;
                    ((p1.o) this.f8990z).u(iVar3);
                } else {
                    bVar.c(b(uri));
                }
            }
        }
        return iVar2;
    }

    public final Uri b(Uri uri) {
        e eVar;
        i iVar = this.C;
        if (iVar != null && iVar.f9025v.f9007e && (eVar = (e) ((s1) iVar.f9023t).get(uri)) != null) {
            Uri.Builder buildUpon = uri.buildUpon();
            buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f8992b));
            int i10 = eVar.f8993c;
            if (i10 != -1) {
                buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
            }
            return buildUpon.build();
        }
        return uri;
    }

    public final boolean c(Uri uri) {
        int i10;
        b bVar = (b) this.f8985d.get(uri);
        if (bVar.f8976d == null) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long max = Math.max(30000L, f1.b0.c0(bVar.f8976d.f9024u));
        i iVar = bVar.f8976d;
        if (!iVar.o && (i10 = iVar.f9008d) != 2 && i10 != 1 && bVar.f8977e + max <= elapsedRealtime) {
            return false;
        }
        return true;
    }

    @Override // z1.j
    public final void f(z1.l lVar, long j4, long j10) {
        l lVar2;
        z1.r rVar = (z1.r) lVar;
        m mVar = (m) rVar.f11950f;
        boolean z9 = mVar instanceof i;
        if (z9) {
            String str = mVar.f9046a;
            l lVar3 = l.f9035n;
            Uri parse = Uri.parse(str);
            u uVar = new u();
            uVar.f1897a = "0";
            uVar.b("application/x-mpegURL");
            lVar2 = new l("", Collections.emptyList(), Collections.singletonList(new k(parse, new v(uVar), null, null, null, null)), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), null, null, false, Collections.emptyMap(), Collections.emptyList());
        } else {
            lVar2 = (l) mVar;
        }
        this.A = lVar2;
        this.B = ((k) lVar2.f9037e.get(0)).f9029a;
        this.f8986e.add(new a(this));
        List list = lVar2.f9036d;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list.get(i10);
            this.f8985d.put(uri, new b(this, uri));
        }
        Uri uri2 = rVar.f11948d.f4562c;
        v1.n nVar = new v1.n(j10);
        b bVar = (b) this.f8985d.get(this.B);
        if (z9) {
            bVar.d((i) mVar, nVar);
        } else {
            bVar.c(bVar.f8973a);
        }
        this.f8984c.getClass();
        this.f8987f.f(nVar, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    @Override // z1.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z1.i q(z1.l r5, long r6, long r8, java.io.IOException r10, int r11) {
        /*
            r4 = this;
            z1.r r5 = (z1.r) r5
            v1.n r6 = new v1.n
            long r0 = r5.f11945a
            h1.d0 r7 = r5.f11948d
            android.net.Uri r7 = r7.f4562c
            r6.<init>(r8)
            androidx.lifecycle.q0 r7 = r4.f8984c
            r7.getClass()
            boolean r7 = r10 instanceof c1.r0
            r8 = 1
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            if (r7 != 0) goto L52
            boolean r7 = r10 instanceof java.io.FileNotFoundException
            if (r7 != 0) goto L52
            boolean r7 = r10 instanceof h1.v
            if (r7 != 0) goto L52
            boolean r7 = r10 instanceof z1.n
            if (r7 != 0) goto L52
            int r7 = h1.i.f4582b
            r7 = r10
        L2c:
            if (r7 == 0) goto L42
            boolean r2 = r7 instanceof h1.i
            if (r2 == 0) goto L3d
            r2 = r7
            h1.i r2 = (h1.i) r2
            int r2 = r2.f4583a
            r3 = 2008(0x7d8, float:2.814E-42)
            if (r2 != r3) goto L3d
            r7 = r8
            goto L43
        L3d:
            java.lang.Throwable r7 = r7.getCause()
            goto L2c
        L42:
            r7 = r9
        L43:
            if (r7 == 0) goto L46
            goto L52
        L46:
            int r11 = r11 + (-1)
            int r11 = r11 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r7 = java.lang.Math.min(r11, r7)
            long r2 = (long) r7
            goto L53
        L52:
            r2 = r0
        L53:
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 != 0) goto L58
            goto L59
        L58:
            r8 = r9
        L59:
            v1.b0 r7 = r4.f8987f
            int r5 = r5.f11947c
            r7.j(r6, r5, r10, r8)
            if (r8 == 0) goto L65
            z1.i r5 = z1.o.f11941f
            goto L69
        L65:
            z1.i r5 = z1.o.c(r2, r9)
        L69:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: q1.c.q(z1.l, long, long, java.io.IOException, int):z1.i");
    }

    @Override // z1.j
    public final void r(z1.l lVar, long j4, long j10, boolean z9) {
        z1.r rVar = (z1.r) lVar;
        long j11 = rVar.f11945a;
        Uri uri = rVar.f11948d.f4562c;
        v1.n nVar = new v1.n(j10);
        this.f8984c.getClass();
        this.f8987f.c(nVar, 4);
    }
}
