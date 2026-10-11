package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class mh1 extends n76 {
    public int z;

    public mh1(int i) {
        super(0L, false);
        this.z = i;
    }

    public abstract vz0 e();

    public Throwable f(Object obj) {
        dr0 dr0Var;
        if (obj instanceof dr0) {
            dr0Var = (dr0) obj;
        } else {
            dr0Var = null;
        }
        if (dr0Var == null) {
            return null;
        }
        return dr0Var.a;
    }

    public final void i(Throwable th) {
        h98.z(e().getContext(), new Error("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        r4 = (defpackage.h43) r5.get(defpackage.h95.F);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r11 = this;
            vz0 r0 = r11.e()     // Catch: java.lang.Throwable -> L1f defpackage.ih1 -> L22
            r0.getClass()     // Catch: java.lang.Throwable -> L1f defpackage.ih1 -> L22
            jh1 r0 = (defpackage.jh1) r0     // Catch: java.lang.Throwable -> L1f defpackage.ih1 -> L22
            xz0 r1 = r0.B     // Catch: java.lang.Throwable -> L1f defpackage.ih1 -> L22
            java.lang.Object r0 = r0.D     // Catch: java.lang.Throwable -> L1f defpackage.ih1 -> L22
            l11 r2 = r1.getContext()     // Catch: java.lang.Throwable -> L1f defpackage.ih1 -> L22
            java.lang.Object r0 = defpackage.ke6.c(r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.ih1 -> L22
            ni1 r3 = defpackage.ke6.a     // Catch: java.lang.Throwable -> L1f defpackage.ih1 -> L22
            r4 = 0
            if (r0 == r3) goto L25
            gn6 r3 = defpackage.bx7.Q(r1, r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.ih1 -> L22
            goto L26
        L1f:
            r0 = move-exception
            goto L8c
        L22:
            r0 = move-exception
            goto L90
        L25:
            r3 = r4
        L26:
            l11 r5 = r1.getContext()     // Catch: java.lang.Throwable -> L49
            java.lang.Object r6 = r11.j()     // Catch: java.lang.Throwable -> L49
            java.lang.Throwable r7 = r11.f(r6)     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L4b
            int r8 = r11.z     // Catch: java.lang.Throwable -> L49
            r9 = 1
            if (r8 == r9) goto L3e
            r10 = 2
            if (r8 != r10) goto L3d
            goto L3e
        L3d:
            r9 = 0
        L3e:
            if (r9 == 0) goto L4b
            h95 r4 = defpackage.h95.F     // Catch: java.lang.Throwable -> L49
            j11 r4 = r5.get(r4)     // Catch: java.lang.Throwable -> L49
            h43 r4 = (defpackage.h43) r4     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            r1 = move-exception
            goto L80
        L4b:
            if (r4 == 0) goto L62
            boolean r5 = r4.isActive()     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L62
            java.util.concurrent.CancellationException r4 = r4.I()     // Catch: java.lang.Throwable -> L49
            r11.d(r4)     // Catch: java.lang.Throwable -> L49
            y45 r4 = defpackage.m37.l(r4)     // Catch: java.lang.Throwable -> L49
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L49
            goto L74
        L62:
            if (r7 == 0) goto L6d
            y45 r4 = new y45     // Catch: java.lang.Throwable -> L49
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L49
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L49
            goto L74
        L6d:
            java.lang.Object r4 = r11.g(r6)     // Catch: java.lang.Throwable -> L49
            r1.resumeWith(r4)     // Catch: java.lang.Throwable -> L49
        L74:
            if (r3 == 0) goto L7c
            boolean r1 = r3.m0()     // Catch: java.lang.Throwable -> L1f defpackage.ih1 -> L22
            if (r1 == 0) goto L9d
        L7c:
            defpackage.ke6.a(r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.ih1 -> L22
            return
        L80:
            if (r3 == 0) goto L88
            boolean r3 = r3.m0()     // Catch: java.lang.Throwable -> L1f defpackage.ih1 -> L22
            if (r3 == 0) goto L8b
        L88:
            defpackage.ke6.a(r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.ih1 -> L22
        L8b:
            throw r1     // Catch: java.lang.Throwable -> L1f defpackage.ih1 -> L22
        L8c:
            r11.i(r0)
            goto L9d
        L90:
            vz0 r11 = r11.e()
            l11 r11 = r11.getContext()
            java.lang.Throwable r0 = r0.x
            defpackage.h98.z(r11, r0)
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mh1.run():void");
    }

    public void d(CancellationException cancellationException) {
    }

    public Object g(Object obj) {
        return obj;
    }
}
