package p7;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class h0 extends u7.h {

    /* renamed from: c, reason: collision with root package name */
    public int f8686c;

    public h0(int i10) {
        super(0L, u7.j.f10327g);
        this.f8686c = i10;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract z6.e f();

    public Throwable h(Object obj) {
        t tVar;
        if (obj instanceof t) {
            tVar = (t) obj;
        } else {
            tVar = null;
        }
        if (tVar == null) {
            return null;
        }
        return tVar.f8743a;
    }

    public Object i(Object obj) {
        return obj;
    }

    public final void j(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            com.bumptech.glide.d.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        r6.h0.q(th);
        q6.g.C(f().getContext(), new z("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object k();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        r7 = (p7.a1) r7.r(androidx.lifecycle.q0.f1134x);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r13 = this;
            w6.f r0 = w6.f.f11019a
            f9.x r1 = r13.f10319b
            z6.e r2 = r13.f()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            r6.h0.r(r2, r3)     // Catch: java.lang.Throwable -> L9e
            t7.i r2 = (t7.i) r2     // Catch: java.lang.Throwable -> L9e
            z6.e r3 = r2.f10063e     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r2.f10065x     // Catch: java.lang.Throwable -> L9e
            z6.i r4 = r3.getContext()     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = t7.z.b(r4, r2)     // Catch: java.lang.Throwable -> L9e
            w4.o r5 = t7.z.f10093a     // Catch: java.lang.Throwable -> L9e
            r6 = 0
            if (r2 == r5) goto L25
            p7.z1 r5 = r6.h0.d1(r3, r4, r2)     // Catch: java.lang.Throwable -> L9e
            goto L26
        L25:
            r5 = r6
        L26:
            z6.i r7 = r3.getContext()     // Catch: java.lang.Throwable -> L63
            java.lang.Object r8 = r13.k()     // Catch: java.lang.Throwable -> L63
            java.lang.Throwable r9 = r13.h(r8)     // Catch: java.lang.Throwable -> L63
            if (r9 != 0) goto L49
            int r10 = r13.f8686c     // Catch: java.lang.Throwable -> L63
            r11 = 1
            if (r10 == r11) goto L3e
            r12 = 2
            if (r10 != r12) goto L3d
            goto L3e
        L3d:
            r11 = 0
        L3e:
            if (r11 == 0) goto L49
            androidx.lifecycle.q0 r10 = androidx.lifecycle.q0.f1134x     // Catch: java.lang.Throwable -> L63
            z6.g r7 = r7.r(r10)     // Catch: java.lang.Throwable -> L63
            p7.a1 r7 = (p7.a1) r7     // Catch: java.lang.Throwable -> L63
            goto L4a
        L49:
            r7 = r6
        L4a:
            if (r7 == 0) goto L65
            boolean r10 = r7.a()     // Catch: java.lang.Throwable -> L63
            if (r10 != 0) goto L65
            p7.k1 r7 = (p7.k1) r7     // Catch: java.lang.Throwable -> L63
            java.util.concurrent.CancellationException r7 = r7.s()     // Catch: java.lang.Throwable -> L63
            r13.b(r8, r7)     // Catch: java.lang.Throwable -> L63
            w6.c r7 = r6.h0.F(r7)     // Catch: java.lang.Throwable -> L63
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L63
            goto L76
        L63:
            r3 = move-exception
            goto L92
        L65:
            if (r9 == 0) goto L6f
            w6.c r7 = r6.h0.F(r9)     // Catch: java.lang.Throwable -> L63
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L63
            goto L76
        L6f:
            java.lang.Object r7 = r13.i(r8)     // Catch: java.lang.Throwable -> L63
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L63
        L76:
            if (r5 == 0) goto L7e
            boolean r3 = r5.U()     // Catch: java.lang.Throwable -> L9e
            if (r3 == 0) goto L81
        L7e:
            t7.z.a(r4, r2)     // Catch: java.lang.Throwable -> L9e
        L81:
            r1.getClass()     // Catch: java.lang.Throwable -> L85
            goto L8a
        L85:
            r0 = move-exception
            w6.c r0 = r6.h0.F(r0)
        L8a:
            java.lang.Throwable r0 = w6.d.a(r0)
            r13.j(r6, r0)
            goto Laf
        L92:
            if (r5 == 0) goto L9a
            boolean r5 = r5.U()     // Catch: java.lang.Throwable -> L9e
            if (r5 == 0) goto L9d
        L9a:
            t7.z.a(r4, r2)     // Catch: java.lang.Throwable -> L9e
        L9d:
            throw r3     // Catch: java.lang.Throwable -> L9e
        L9e:
            r2 = move-exception
            r1.getClass()     // Catch: java.lang.Throwable -> La3
            goto La8
        La3:
            r0 = move-exception
            w6.c r0 = r6.h0.F(r0)
        La8:
            java.lang.Throwable r0 = w6.d.a(r0)
            r13.j(r2, r0)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.h0.run():void");
    }
}
