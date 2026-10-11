package h1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class c implements h {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4550a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4551b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f4552c;

    /* renamed from: d, reason: collision with root package name */
    public l f4553d;

    public c(boolean z9) {
        this.f4550a = z9;
    }

    @Override // h1.h
    public Map e() {
        return Collections.emptyMap();
    }

    @Override // h1.h
    public final void f(e0 e0Var) {
        e0Var.getClass();
        ArrayList arrayList = this.f4551b;
        if (!arrayList.contains(e0Var)) {
            arrayList.add(e0Var);
            this.f4552c++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r4 == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(int r9) {
        /*
            r8 = this;
            h1.l r0 = r8.f4553d
            int r1 = f1.b0.f3799a
            r1 = 0
            r2 = r1
        L6:
            int r3 = r8.f4552c
            if (r2 >= r3) goto L3b
            java.util.ArrayList r3 = r8.f4551b
            java.lang.Object r3 = r3.get(r2)
            h1.e0 r3 = (h1.e0) r3
            boolean r4 = r8.f4550a
            z1.g r3 = (z1.g) r3
            monitor-enter(r3)
            r6.n1 r5 = z1.g.f11905n     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L29
            int r4 = r0.f4605i     // Catch: java.lang.Throwable -> L38
            r5 = 8
            r4 = r4 & r5
            r6 = 1
            if (r4 != r5) goto L25
            r4 = r6
            goto L26
        L25:
            r4 = r1
        L26:
            if (r4 != 0) goto L29
            goto L2a
        L29:
            r6 = r1
        L2a:
            if (r6 != 0) goto L2e
            monitor-exit(r3)
            goto L35
        L2e:
            long r4 = r3.f11918h     // Catch: java.lang.Throwable -> L38
            long r6 = (long) r9     // Catch: java.lang.Throwable -> L38
            long r4 = r4 + r6
            r3.f11918h = r4     // Catch: java.lang.Throwable -> L38
            monitor-exit(r3)
        L35:
            int r2 = r2 + 1
            goto L6
        L38:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.c.r(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f A[Catch: all -> 0x009b, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x0017, B:9:0x001c, B:19:0x002f, B:22:0x0036, B:24:0x0058, B:26:0x0071, B:28:0x0083, B:29:0x007a, B:30:0x0091), top: B:6:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            r14 = this;
            h1.l r0 = r14.f4553d
            int r1 = f1.b0.f3799a
            r1 = 0
            r2 = r1
        L6:
            int r3 = r14.f4552c
            if (r2 >= r3) goto L9e
            java.util.ArrayList r3 = r14.f4551b
            java.lang.Object r3 = r3.get(r2)
            h1.e0 r3 = (h1.e0) r3
            boolean r4 = r14.f4550a
            z1.g r3 = (z1.g) r3
            monitor-enter(r3)
            r6.n1 r5 = z1.g.f11905n     // Catch: java.lang.Throwable -> L9b
            r11 = 1
            if (r4 == 0) goto L2a
            int r4 = r0.f4605i     // Catch: java.lang.Throwable -> L9b
            r5 = 8
            r4 = r4 & r5
            if (r4 != r5) goto L25
            r4 = r11
            goto L26
        L25:
            r4 = r1
        L26:
            if (r4 != 0) goto L2a
            r4 = r11
            goto L2b
        L2a:
            r4 = r1
        L2b:
            if (r4 != 0) goto L2f
            monitor-exit(r3)
            goto L97
        L2f:
            int r4 = r3.f11916f     // Catch: java.lang.Throwable -> L9b
            if (r4 <= 0) goto L35
            r4 = r11
            goto L36
        L35:
            r4 = r1
        L36:
            w7.b.u(r4)     // Catch: java.lang.Throwable -> L9b
            f1.a r4 = r3.f11913c     // Catch: java.lang.Throwable -> L9b
            f1.v r4 = (f1.v) r4     // Catch: java.lang.Throwable -> L9b
            r4.getClass()     // Catch: java.lang.Throwable -> L9b
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L9b
            long r4 = r3.f11917g     // Catch: java.lang.Throwable -> L9b
            long r4 = r12 - r4
            int r6 = (int) r4     // Catch: java.lang.Throwable -> L9b
            long r4 = r3.f11919i     // Catch: java.lang.Throwable -> L9b
            long r7 = (long) r6     // Catch: java.lang.Throwable -> L9b
            long r4 = r4 + r7
            r3.f11919i = r4     // Catch: java.lang.Throwable -> L9b
            long r4 = r3.f11920j     // Catch: java.lang.Throwable -> L9b
            long r7 = r3.f11918h     // Catch: java.lang.Throwable -> L9b
            long r4 = r4 + r7
            r3.f11920j = r4     // Catch: java.lang.Throwable -> L9b
            if (r6 <= 0) goto L91
            float r4 = (float) r7     // Catch: java.lang.Throwable -> L9b
            r5 = 1174011904(0x45fa0000, float:8000.0)
            float r4 = r4 * r5
            float r5 = (float) r6     // Catch: java.lang.Throwable -> L9b
            float r4 = r4 / r5
            z1.t r5 = r3.f11915e     // Catch: java.lang.Throwable -> L9b
            double r7 = (double) r7     // Catch: java.lang.Throwable -> L9b
            double r7 = java.lang.Math.sqrt(r7)     // Catch: java.lang.Throwable -> L9b
            int r7 = (int) r7     // Catch: java.lang.Throwable -> L9b
            r5.a(r7, r4)     // Catch: java.lang.Throwable -> L9b
            long r4 = r3.f11919i     // Catch: java.lang.Throwable -> L9b
            r7 = 2000(0x7d0, double:9.88E-321)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L7a
            long r4 = r3.f11920j     // Catch: java.lang.Throwable -> L9b
            r7 = 524288(0x80000, double:2.590327E-318)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 < 0) goto L83
        L7a:
            z1.t r4 = r3.f11915e     // Catch: java.lang.Throwable -> L9b
            float r4 = r4.b()     // Catch: java.lang.Throwable -> L9b
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L9b
            r3.f11921k = r4     // Catch: java.lang.Throwable -> L9b
        L83:
            long r7 = r3.f11918h     // Catch: java.lang.Throwable -> L9b
            long r9 = r3.f11921k     // Catch: java.lang.Throwable -> L9b
            r5 = r3
            r5.c(r6, r7, r9)     // Catch: java.lang.Throwable -> L9b
            r3.f11917g = r12     // Catch: java.lang.Throwable -> L9b
            r4 = 0
            r3.f11918h = r4     // Catch: java.lang.Throwable -> L9b
        L91:
            int r4 = r3.f11916f     // Catch: java.lang.Throwable -> L9b
            int r4 = r4 - r11
            r3.f11916f = r4     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r3)
        L97:
            int r2 = r2 + 1
            goto L6
        L9b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L9e:
            r0 = 0
            r14.f4553d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.c.s():void");
    }

    public final void t() {
        for (int i10 = 0; i10 < this.f4552c; i10++) {
            ((e0) this.f4551b.get(i10)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d A[Catch: all -> 0x0047, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x0015, B:9:0x001a, B:19:0x002d, B:21:0x0031, B:22:0x003e), top: B:6:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(h1.l r8) {
        /*
            r7 = this;
            r7.f4553d = r8
            r0 = 0
            r1 = r0
        L4:
            int r2 = r7.f4552c
            if (r1 >= r2) goto L4a
            java.util.ArrayList r2 = r7.f4551b
            java.lang.Object r2 = r2.get(r1)
            h1.e0 r2 = (h1.e0) r2
            boolean r3 = r7.f4550a
            z1.g r2 = (z1.g) r2
            monitor-enter(r2)
            r6.n1 r4 = z1.g.f11905n     // Catch: java.lang.Throwable -> L47
            r4 = 1
            if (r3 == 0) goto L28
            int r3 = r8.f4605i     // Catch: java.lang.Throwable -> L47
            r5 = 8
            r3 = r3 & r5
            if (r3 != r5) goto L23
            r3 = r4
            goto L24
        L23:
            r3 = r0
        L24:
            if (r3 != 0) goto L28
            r3 = r4
            goto L29
        L28:
            r3 = r0
        L29:
            if (r3 != 0) goto L2d
            monitor-exit(r2)
            goto L44
        L2d:
            int r3 = r2.f11916f     // Catch: java.lang.Throwable -> L47
            if (r3 != 0) goto L3e
            f1.a r3 = r2.f11913c     // Catch: java.lang.Throwable -> L47
            f1.v r3 = (f1.v) r3     // Catch: java.lang.Throwable -> L47
            r3.getClass()     // Catch: java.lang.Throwable -> L47
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L47
            r2.f11917g = r5     // Catch: java.lang.Throwable -> L47
        L3e:
            int r3 = r2.f11916f     // Catch: java.lang.Throwable -> L47
            int r3 = r3 + r4
            r2.f11916f = r3     // Catch: java.lang.Throwable -> L47
            monitor-exit(r2)
        L44:
            int r1 = r1 + 1
            goto L4
        L47:
            r8 = move-exception
            monitor-exit(r2)
            throw r8
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.c.u(h1.l):void");
    }
}
