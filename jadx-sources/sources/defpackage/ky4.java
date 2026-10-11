package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ky4 implements wc0 {
    public final uz2 b;
    public zn0 c;
    public final oa0 d = new Object();
    public final j43 e;
    public final l11 f;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, oa0] */
    public ky4(uz2 uz2Var, l11 l11Var) {
        this.b = uz2Var;
        j43 j43Var = new j43((h43) l11Var.get(h95.F));
        this.e = j43Var;
        this.f = l11Var.plus(j43Var).plus(new r11("RawSourceChannel"));
        j43Var.t(true, true, new pz3((Object) this, (byte) 11));
    }

    @Override // defpackage.wc0
    public final void a(Throwable th) {
        if (this.c == null) {
            CancellationException cancellationException = null;
            if (th != null) {
                if (th instanceof CancellationException) {
                    cancellationException = (CancellationException) th;
                }
                if (cancellationException == null) {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "Channel was cancelled";
                    }
                    cancellationException = z51.b(message, th);
                }
            }
            this.e.l(cancellationException);
            if (this.c != null) {
                return;
            }
            this.c = new zn0(cancellationException);
            this.b.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wc0
    public final Throwable b() {
        Throwable th;
        zn0 zn0Var = this.c;
        if (zn0Var != null && (th = zn0Var.a) != 0) {
            if (th instanceof m01) {
                return ((m01) th).a();
            }
            if (th instanceof CancellationException) {
                return z51.b(((CancellationException) th).getMessage(), th);
            }
            return new co0(th);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.wc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(int r7, defpackage.xz0 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.jy4
            if (r0 == 0) goto L13
            r0 = r8
            jy4 r0 = (defpackage.jy4) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            jy4 r0 = new jy4
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.y
            int r1 = r0.A
            r2 = 0
            r3 = 0
            oa0 r4 = r6.d
            r5 = 1
            if (r1 == 0) goto L31
            if (r1 != r5) goto L2b
            int r7 = r0.x
            defpackage.m37.N(r8)
            goto L61
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r2
        L31:
            defpackage.m37.N(r8)
            zn0 r8 = r6.c
            if (r8 == 0) goto L4c
            java.lang.Throwable r6 = r6.b()
            if (r6 != 0) goto L4b
            long r0 = r4.z
            long r6 = (long) r7
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L46
            r3 = r5
        L46:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        L4b:
            throw r6
        L4c:
            vq r8 = new vq
            r1 = 2
            r8.<init>(r6, r7, r2, r1)
            r0.x = r7
            r0.A = r5
            l11 r6 = r6.f
            java.lang.Object r6 = defpackage.tl7.V(r6, r8, r0)
            w11 r8 = defpackage.w11.x
            if (r6 != r8) goto L61
            return r8
        L61:
            long r0 = r4.z
            long r6 = (long) r7
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L69
            r3 = r5
        L69:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky4.c(int, xz0):java.lang.Object");
    }

    @Override // defpackage.wc0
    public final oa0 g() {
        return this.d;
    }

    @Override // defpackage.wc0
    public final boolean h() {
        if (this.c != null && this.d.D()) {
            return true;
        }
        return false;
    }
}
