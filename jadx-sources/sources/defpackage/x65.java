package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x65 extends cj3 {
    public final v65 k;
    public final boolean l;
    public final d75 m;
    public final AtomicBoolean n;
    public final AtomicBoolean o;
    public final AtomicBoolean p;
    public final l11 q;
    public final ub2 r;

    public x65(v65 v65Var, af2 af2Var, boolean z, String[] strArr, ub2 ub2Var) {
        l11 l11Var;
        af2Var.getClass();
        this.k = v65Var;
        this.l = z;
        this.m = new d75(strArr, this);
        this.n = new AtomicBoolean(true);
        this.o = new AtomicBoolean(false);
        this.p = new AtomicBoolean(false);
        if (v65Var.inCompatibilityMode()) {
            if (z) {
                l11Var = v65Var.getTransactionContext$room_runtime();
            } else {
                l11Var = v65Var.getQueryContext();
            }
        } else {
            l11Var = it1.x;
        }
        this.q = l11Var;
        this.r = ub2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0074 A[Catch: all -> 0x0032, Exception -> 0x0034, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0034, blocks: (B:12:0x002b, B:17:0x0074), top: B:11:0x002b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092 A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:12:0x002b, B:15:0x006e, B:17:0x0074, B:27:0x0092, B:39:0x0088, B:40:0x008f), top: B:7:0x0025, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x006c -> B:14:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x009d -> B:26:0x009e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.xz0 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.e75
            if (r0 == 0) goto L13
            r0 = r11
            e75 r0 = (defpackage.e75) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            e75 r0 = new e75
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.y
            int r1 = r0.A
            java.util.concurrent.atomic.AtomicBoolean r2 = r10.n
            r3 = 0
            v65 r4 = r10.k
            java.util.concurrent.atomic.AtomicBoolean r5 = r10.o
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L3c
            if (r1 != r7) goto L36
            boolean r1 = r0.x
            defpackage.m37.N(r11)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r9 = r1
            r1 = r11
            r11 = r9
            goto L6e
        L32:
            r10 = move-exception
            goto L99
        L34:
            r10 = move-exception
            goto L88
        L36:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r10)
            return r3
        L3c:
            defpackage.m37.N(r11)
            java.util.concurrent.atomic.AtomicBoolean r11 = r10.p
            boolean r11 = r11.compareAndSet(r6, r7)
            if (r11 == 0) goto L66
            i33 r11 = r4.getInvalidationTracker()
            r11.getClass()
            d75 r1 = r10.m
            r1.getClass()
            b37 r8 = new b37
            r8.<init>(r11, r1)
            boolean r1 = r11.a(r8)
            if (r1 == 0) goto L66
            h33 r1 = new h33
            r1.<init>(r11, r3, r6)
            defpackage.iv.L(r1)
        L66:
            boolean r11 = r5.compareAndSet(r6, r7)
            if (r11 == 0) goto L9d
            r1 = r3
            r11 = r6
        L6e:
            boolean r8 = r2.compareAndSet(r7, r6)     // Catch: java.lang.Throwable -> L32
            if (r8 == 0) goto L90
            r0.x = r7     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            r0.A = r7     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            boolean r11 = r10.l     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            ub2 r1 = r10.r     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            java.lang.Object r11 = defpackage.q23.L(r0, r4, r7, r11, r1)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L34
            w11 r1 = defpackage.w11.x
            if (r11 != r1) goto L85
            return r1
        L85:
            r1 = r11
            r11 = r7
            goto L6e
        L88:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L32
            java.lang.String r0 = "Exception while computing database live data."
            r11.<init>(r0, r10)     // Catch: java.lang.Throwable -> L32
            throw r11     // Catch: java.lang.Throwable -> L32
        L90:
            if (r11 == 0) goto L95
            r10.a(r1)     // Catch: java.lang.Throwable -> L32
        L95:
            r5.set(r6)
            goto L9e
        L99:
            r5.set(r6)
            throw r10
        L9d:
            r11 = r6
        L9e:
            if (r11 == 0) goto La6
            boolean r11 = r2.get()
            if (r11 != 0) goto L66
        La6:
            pn6 r10 = defpackage.pn6.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x65.b(xz0):java.lang.Object");
    }
}
