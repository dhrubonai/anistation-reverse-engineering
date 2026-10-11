package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oi5 implements at {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final ea2 d;
    public final ea2 e;
    public boolean f;
    public boolean g;
    public final /* synthetic */ qi5 h;

    public oi5(qi5 qi5Var, long j) {
        boolean z;
        boolean z2;
        this.h = qi5Var;
        this.a = j;
        if (!qi5Var.y && !qi5Var.b.contains(1)) {
            z = false;
        } else {
            z = true;
        }
        this.b = z;
        if (!qi5Var.z && !qi5Var.b.contains(2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.c = z2;
        io3.B(z || z2);
        da2 da2Var = new da2();
        da2Var.o = qy3.n("audio/raw");
        this.d = new ea2(da2Var);
        da2 da2Var2 = new da2();
        da2Var2.o = qy3.n("audio/raw");
        da2Var2.K = 44100;
        da2Var2.I = 2;
        da2Var2.L = 2;
        this.e = new ea2(da2Var2);
    }

    @Override // defpackage.at
    public final int a(mm5 mm5Var) {
        boolean z;
        boolean z2 = true;
        if (this.b && !this.f) {
            z = true;
        } else {
            z = false;
        }
        if (!this.c || this.g) {
            z2 = false;
        }
        if (z && z2) {
            mm5Var.x = 0;
            return 2;
        }
        if (!z && !z2) {
            mm5Var.x = 99;
            return 2;
        }
        mm5Var.x = 50;
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[Catch: RuntimeException -> 0x0050, oz1 -> 0x0052, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0050, oz1 -> 0x0052, blocks: (B:37:0x0027, B:40:0x0031, B:42:0x003b, B:44:0x0041, B:45:0x004d, B:17:0x0056, B:21:0x0074, B:34:0x005f), top: B:36:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r8 = this;
            boolean r0 = r8.b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            boolean r0 = r8.f
            if (r0 != 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            boolean r3 = r8.c
            if (r3 == 0) goto L17
            boolean r3 = r8.g
            if (r3 != 0) goto L17
            r3 = r2
            goto L18
        L17:
            r3 = r1
        L18:
            if (r0 != 0) goto L1f
            if (r3 == 0) goto L1d
            goto L1f
        L1d:
            r4 = r1
            goto L20
        L1f:
            r4 = r2
        L20:
            defpackage.io3.B(r4)
            qi5 r4 = r8.h
            if (r0 == 0) goto L54
            ea2 r0 = r8.e     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            pi5 r0 = r4.d(r0)     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            if (r0 != 0) goto L31
            r1 = r2
            goto L54
        L31:
            qi5 r5 = r0.d     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            java.util.concurrent.atomic.AtomicInteger r6 = r5.k     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            int r6 = r6.decrementAndGet()     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            if (r6 != 0) goto L4d
            boolean r6 = r5.j()     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            if (r6 != 0) goto L4d
            k46 r5 = r5.f     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            a92 r6 = new a92     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            r7 = 20
            r6.<init>(r0, r7)     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            r5.f(r6)     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
        L4d:
            r8.f = r2     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            goto L54
        L50:
            r8 = move-exception
            goto L83
        L52:
            r8 = move-exception
            goto L8d
        L54:
            if (r3 == 0) goto L71
            ea2 r0 = defpackage.qi5.B     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            pi5 r0 = r4.d(r0)     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            if (r0 != 0) goto L5f
            goto L72
        L5f:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            r3 = 16
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r3, r0)     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0.eraseColor(r3)     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            r4.i(r0)     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            r8.g = r2     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
        L71:
            r2 = r1
        L72:
            if (r2 == 0) goto L90
            k46 r0 = r4.f     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            a92 r1 = new a92     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            r2 = 19
            r1.<init>(r8, r2)     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            r2 = 10
            r0.g(r1, r2)     // Catch: java.lang.RuntimeException -> L50 defpackage.oz1 -> L52
            return
        L83:
            r0 = 1000(0x3e8, float:1.401E-42)
            oz1 r8 = defpackage.oz1.a(r8, r0)
            r4.b(r8)
            goto L90
        L8d:
            r4.b(r8)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi5.b():void");
    }

    @Override // defpackage.at
    public final rw2 e() {
        return t15.D;
    }

    @Override // defpackage.at
    public final void start() {
        int i;
        long j = this.a;
        qi5 qi5Var = this.h;
        qi5Var.f(j);
        boolean z = this.c;
        boolean z2 = this.b;
        if (z2 && z) {
            i = 2;
        } else {
            i = 1;
        }
        qi5Var.c(i);
        if (z2) {
            qi5Var.g(2, this.d);
        }
        if (z) {
            qi5Var.g(2, qi5.B);
        }
        b();
    }

    @Override // defpackage.at
    public final void release() {
    }
}
