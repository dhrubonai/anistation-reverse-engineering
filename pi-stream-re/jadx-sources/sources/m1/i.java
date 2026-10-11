package m1;

import java.io.IOException;
import java.util.ConcurrentModificationException;

/* loaded from: classes.dex */
public final class i implements z1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7073a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7074b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f7073a = i10;
        this.f7074b = obj;
    }

    public final void a(z1.r rVar, long j4, long j10) {
        int i10 = this.f7073a;
        Object obj = this.f7074b;
        switch (i10) {
            case 0:
                ((j) obj).v(rVar, j4, j10);
                return;
            default:
                ((j) obj).v(rVar, j4, j10);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(z1.r r19, long r20, long r22) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.i.b(z1.r, long, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final z1.i c(z1.r r6, long r7, long r9, java.io.IOException r11, int r12) {
        /*
            r5 = this;
            int r7 = r5.f7073a
            r8 = 1
            java.lang.Object r0 = r5.f7074b
            switch(r7) {
                case 0: goto La;
                default: goto L8;
            }
        L8:
            goto L77
        La:
            m1.j r0 = (m1.j) r0
            r0.getClass()
            v1.n r7 = new v1.n
            long r1 = r6.f11945a
            h1.d0 r1 = r6.f11948d
            android.net.Uri r1 = r1.f4562c
            r7.<init>(r9)
            androidx.lifecycle.q0 r9 = r0.f7080m
            r9.getClass()
            boolean r9 = r11 instanceof c1.r0
            r10 = 0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r9 != 0) goto L5e
            boolean r9 = r11 instanceof java.io.FileNotFoundException
            if (r9 != 0) goto L5e
            boolean r9 = r11 instanceof h1.v
            if (r9 != 0) goto L5e
            boolean r9 = r11 instanceof z1.n
            if (r9 != 0) goto L5e
            int r9 = h1.i.f4582b
            r9 = r11
        L38:
            if (r9 == 0) goto L4e
            boolean r3 = r9 instanceof h1.i
            if (r3 == 0) goto L49
            r3 = r9
            h1.i r3 = (h1.i) r3
            int r3 = r3.f4583a
            r4 = 2008(0x7d8, float:2.814E-42)
            if (r3 != r4) goto L49
            r9 = r8
            goto L4f
        L49:
            java.lang.Throwable r9 = r9.getCause()
            goto L38
        L4e:
            r9 = r10
        L4f:
            if (r9 == 0) goto L52
            goto L5e
        L52:
            int r12 = r12 + (-1)
            int r12 = r12 * 1000
            r9 = 5000(0x1388, float:7.006E-42)
            int r9 = java.lang.Math.min(r12, r9)
            long r3 = (long) r9
            goto L5f
        L5e:
            r3 = r1
        L5f:
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 != 0) goto L66
            z1.i r9 = z1.o.f11941f
            goto L6a
        L66:
            z1.i r9 = z1.o.c(r3, r10)
        L6a:
            boolean r10 = r9.a()
            r8 = r8 ^ r10
            v1.b0 r10 = r0.f7083q
            int r6 = r6.f11947c
            r10.j(r7, r6, r11, r8)
            return r9
        L77:
            m1.j r0 = (m1.j) r0
            r0.getClass()
            v1.n r7 = new v1.n
            long r1 = r6.f11945a
            h1.d0 r12 = r6.f11948d
            android.net.Uri r12 = r12.f4562c
            r7.<init>(r9)
            v1.b0 r9 = r0.f7083q
            int r6 = r6.f11947c
            r9.j(r7, r6, r11, r8)
            androidx.lifecycle.q0 r6 = r0.f7080m
            r6.getClass()
            java.lang.String r6 = "DashMediaSource"
            java.lang.String r7 = "Failed to resolve time offset."
            f1.o.d(r6, r7, r11)
            r0.w(r8)
            z1.i r6 = z1.o.f11940e
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.i.c(z1.r, long, long, java.io.IOException, int):z1.i");
    }

    @Override // z1.j
    public final void f(z1.l lVar, long j4, long j10) {
        boolean z9;
        switch (this.f7073a) {
            case 0:
                b((z1.r) lVar, j4, j10);
                return;
            case 1:
                b((z1.r) lVar, j4, j10);
                return;
            default:
                a2.a aVar = (a2.a) this.f7074b;
                if (aVar != null) {
                    synchronized (a2.b.f33b) {
                        z9 = a2.b.f34c;
                    }
                    if (!z9) {
                        IOException iOException = new IOException(new ConcurrentModificationException());
                        j jVar = ((f) aVar).f7061a;
                        jVar.getClass();
                        f1.o.d("DashMediaSource", "Failed to resolve time offset.", iOException);
                        jVar.w(true);
                        return;
                    }
                    ((f) aVar).a();
                    return;
                }
                return;
        }
    }

    @Override // z1.j
    public final z1.i q(z1.l lVar, long j4, long j10, IOException iOException, int i10) {
        switch (this.f7073a) {
            case 0:
                return c((z1.r) lVar, j4, j10, iOException, i10);
            case 1:
                return c((z1.r) lVar, j4, j10, iOException, i10);
            default:
                a2.a aVar = (a2.a) this.f7074b;
                if (aVar != null) {
                    j jVar = ((f) aVar).f7061a;
                    jVar.getClass();
                    f1.o.d("DashMediaSource", "Failed to resolve time offset.", iOException);
                    jVar.w(true);
                }
                return z1.o.f11940e;
        }
    }

    @Override // z1.j
    public final void r(z1.l lVar, long j4, long j10, boolean z9) {
        switch (this.f7073a) {
            case 0:
                a((z1.r) lVar, j4, j10);
                return;
            case 1:
                a((z1.r) lVar, j4, j10);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i10) {
        this((Object) jVar, 0);
        this.f7073a = i10;
        int i11 = 1;
        if (i10 != 1) {
        } else {
            this((Object) jVar, i11);
        }
    }
}
