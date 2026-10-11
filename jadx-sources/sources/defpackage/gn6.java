package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gn6 extends ec5 {
    public final ThreadLocal C;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gn6(defpackage.vz0 r3, defpackage.l11 r4) {
        /*
            r2 = this;
            ug0 r0 = defpackage.ug0.A
            j11 r1 = r4.get(r0)
            if (r1 != 0) goto Ld
            l11 r0 = r4.plus(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.C = r0
            l11 r3 = r3.getContext()
            h95 r0 = defpackage.h95.B
            j11 r3 = r3.get(r0)
            boolean r3 = r3 instanceof defpackage.n11
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = defpackage.ke6.c(r4, r3)
            defpackage.ke6.a(r4, r3)
            r2.o0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn6.<init>(vz0, l11):void");
    }

    @Override // defpackage.ec5
    public final void j0() {
        n0();
    }

    public final boolean m0() {
        boolean z;
        if (this.threadLocalIsSet && this.C.get() == null) {
            z = true;
        } else {
            z = false;
        }
        this.C.remove();
        return !z;
    }

    @Override // defpackage.ec5, defpackage.t43
    public final void n(Object obj) {
        n0();
        Object J = bx7.J(obj);
        vz0 vz0Var = this.B;
        l11 context = vz0Var.getContext();
        gn6 gn6Var = null;
        Object c = ke6.c(context, null);
        if (c != ke6.a) {
            gn6Var = bx7.Q(vz0Var, context, c);
        }
        try {
            vz0Var.resumeWith(J);
            if (gn6Var != null && !gn6Var.m0()) {
                return;
            }
            ke6.a(context, c);
        } catch (Throwable th) {
            if (gn6Var == null || gn6Var.m0()) {
                ke6.a(context, c);
            }
            throw th;
        }
    }

    public final void n0() {
        if (this.threadLocalIsSet) {
            ai4 ai4Var = (ai4) this.C.get();
            if (ai4Var != null) {
                ke6.a((l11) ai4Var.x, ai4Var.y);
            }
            this.C.remove();
        }
    }

    public final void o0(l11 l11Var, Object obj) {
        this.threadLocalIsSet = true;
        this.C.set(new ai4(l11Var, obj));
    }
}
