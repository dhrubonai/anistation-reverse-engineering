package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ek0 extends ag5 {
    public final za0 D;
    public final /* synthetic */ AtomicReferenceArray E;

    public ek0(long j, ek0 ek0Var, za0 za0Var, int i) {
        super(j, ek0Var, i);
        this.D = za0Var;
        this.E = new AtomicReferenceArray(bb0.b * 2);
    }

    @Override // defpackage.ag5
    public final int g() {
        return bb0.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0048, code lost:
    
        n(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x004b, code lost:
    
        if (r1 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x004d, code lost:
    
        r4.getClass();
        r6 = r4.y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0052, code lost:
    
        if (r6 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0054, code lost:
    
        defpackage.o80.n(r6, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0057, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // defpackage.ag5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r7, defpackage.l11 r8) {
        /*
            r6 = this;
            int r0 = defpackage.bb0.b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            int r0 = r7 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r6.E
            java.lang.Object r0 = r2.get(r0)
        L12:
            java.lang.Object r2 = r6.l(r7)
            boolean r3 = r2 instanceof defpackage.dx6
            za0 r4 = r6.D
            r5 = 0
            if (r3 != 0) goto L58
            boolean r3 = r2 instanceof defpackage.ex6
            if (r3 == 0) goto L22
            goto L58
        L22:
            ni1 r3 = defpackage.bb0.j
            if (r2 == r3) goto L48
            ni1 r3 = defpackage.bb0.k
            if (r2 != r3) goto L2b
            goto L48
        L2b:
            ni1 r3 = defpackage.bb0.g
            if (r2 == r3) goto L12
            ni1 r3 = defpackage.bb0.f
            if (r2 != r3) goto L34
            goto L12
        L34:
            ni1 r6 = defpackage.bb0.i
            if (r2 == r6) goto L79
            ni1 r6 = defpackage.bb0.d
            if (r2 != r6) goto L3d
            goto L79
        L3d:
            ni1 r6 = defpackage.bb0.l
            if (r2 != r6) goto L42
            goto L79
        L42:
            java.lang.String r6 = "unexpected state: "
            defpackage.v71.g(r2, r6)
            return
        L48:
            r6.n(r7, r5)
            if (r1 == 0) goto L79
            r4.getClass()
            ub2 r6 = r4.y
            if (r6 == 0) goto L79
            defpackage.o80.n(r6, r0, r8)
            return
        L58:
            if (r1 == 0) goto L5d
            ni1 r3 = defpackage.bb0.j
            goto L5f
        L5d:
            ni1 r3 = defpackage.bb0.k
        L5f:
            boolean r2 = r6.k(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.n(r7, r5)
            r2 = r1 ^ 1
            r6.m(r7, r2)
            if (r1 == 0) goto L79
            r4.getClass()
            ub2 r6 = r4.y
            if (r6 == 0) goto L79
            defpackage.o80.n(r6, r0, r8)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek0.h(int, l11):void");
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.E;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.E.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            za0 za0Var = this.D;
            za0Var.getClass();
            za0Var.N((this.A * bb0.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.E.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.E.set((i * 2) + 1, obj);
    }
}
