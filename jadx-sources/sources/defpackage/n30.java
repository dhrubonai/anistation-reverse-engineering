package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class n30 implements ve2 {
    public final he6 a;
    public te2 b;
    public ue2 c;
    public se2 d = new ze0(14);
    public Executor e = qg1.x;
    public int f = -1;
    public int g = -1;

    public n30(boolean z, int i) {
        this.a = new he6(z, i);
        byte b = 7;
        this.b = new p18(b);
        this.c = new q18(b);
    }

    public abstract sq5 a(int i, int i2);

    @Override // defpackage.ve2
    public final void b() {
        this.c.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[Catch: ns6 | ze2 -> 0x001b, ns6 | ze2 -> 0x001b, TryCatch #0 {ns6 | ze2 -> 0x001b, blocks: (B:2:0x0000, B:5:0x000a, B:5:0x000a, B:7:0x000e, B:7:0x000e, B:10:0x002e, B:10:0x002e, B:12:0x0041, B:12:0x0041, B:13:0x0044, B:13:0x0044, B:17:0x001d, B:17:0x001d), top: B:1:0x0000 }] */
    @Override // defpackage.ve2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(defpackage.oe2 r5, defpackage.we2 r6, long r7) {
        /*
            r4 = this;
            int r0 = r4.f     // Catch: java.lang.Throwable -> L1b
            int r1 = r6.c     // Catch: java.lang.Throwable -> L1b
            int r2 = r6.d
            he6 r3 = r4.a
            if (r0 != r1) goto L1d
            int r0 = r4.g     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            if (r0 != r2) goto L1d
            java.util.Iterator r0 = r3.e()     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            u33 r0 = (defpackage.u33) r0     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            boolean r0 = r0.hasNext()     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            if (r0 != 0) goto L2e
            goto L1d
        L1b:
            r5 = move-exception
            goto L54
        L1d:
            int r0 = r6.c     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            r4.f = r0     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            r4.g = r2     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            sq5 r0 = r4.a(r0, r2)     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            int r1 = r0.a     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            int r0 = r0.b     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            r3.c(r5, r1, r0)     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
        L2e:
            we2 r5 = r3.f()     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            int r0 = r5.b     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            int r1 = r5.c     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            int r2 = r5.d     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            defpackage.a34.T(r0, r1, r2)     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            boolean r0 = r4.i()     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            if (r0 == 0) goto L44
            defpackage.a34.B()     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
        L44:
            int r0 = r6.a     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            r4.h(r0, r7)     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            te2 r0 = r4.b     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            r0.k(r6)     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            ue2 r6 = r4.c     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            r6.n(r5, r7)     // Catch: java.lang.Throwable -> L1b java.lang.Throwable -> L1b
            return
        L54:
            java.util.concurrent.Executor r6 = r4.e
            gb r7 = new gb
            r8 = 7
            r7.<init>(r4, r5, r8)
            r6.execute(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n30.c(oe2, we2, long):void");
    }

    @Override // defpackage.ve2
    public void d(we2 we2Var) {
        he6 he6Var = this.a;
        ArrayDeque arrayDeque = he6Var.b;
        if (!arrayDeque.contains(we2Var)) {
            return;
        }
        io3.B(arrayDeque.contains(we2Var));
        arrayDeque.remove(we2Var);
        he6Var.a.add(we2Var);
        this.b.h();
    }

    @Override // defpackage.ve2
    public final void e(dn0 dn0Var) {
        this.c = dn0Var;
    }

    @Override // defpackage.ve2
    public final void f(Executor executor, ac1 ac1Var) {
        this.e = executor;
        this.d = ac1Var;
    }

    @Override // defpackage.ve2
    public void flush() {
        he6 he6Var = this.a;
        ArrayDeque arrayDeque = he6Var.a;
        ArrayDeque arrayDeque2 = he6Var.b;
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        this.b.q();
        for (int i = 0; i < he6Var.c; i++) {
            this.b.h();
        }
    }

    @Override // defpackage.ve2
    public final void g(te2 te2Var) {
        this.b = te2Var;
        for (int i = 0; i < this.a.d(); i++) {
            te2Var.h();
        }
    }

    public abstract void h(int i, long j);

    public abstract boolean i();
}
