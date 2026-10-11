package p7;

/* loaded from: classes.dex */
public final class z1 extends t7.w {

    /* renamed from: e, reason: collision with root package name */
    public final ThreadLocal f8761e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z1(z6.e r3, z6.i r4) {
        /*
            r2 = this;
            p7.a2 r0 = p7.a2.f8661a
            z6.g r1 = r4.r(r0)
            if (r1 != 0) goto Ld
            z6.i r0 = r4.t(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f8761e = r0
            z6.i r3 = r3.getContext()
            androidx.lifecycle.q0 r0 = androidx.lifecycle.q0.A
            z6.g r3 = r3.r(r0)
            boolean r3 = r3 instanceof p7.w
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = t7.z.b(r4, r3)
            t7.z.a(r4, r3)
            r2.V(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.z1.<init>(z6.e, z6.i):void");
    }

    public final boolean U() {
        boolean z9;
        if (this.threadLocalIsSet && this.f8761e.get() == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f8761e.remove();
        return !z9;
    }

    public final void V(z6.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f8761e.set(new w6.b(iVar, obj));
    }

    @Override // t7.w, p7.k1
    public final void j(Object obj) {
        if (this.threadLocalIsSet) {
            w6.b bVar = (w6.b) this.f8761e.get();
            if (bVar != null) {
                t7.z.a((z6.i) bVar.f11012a, bVar.f11013b);
            }
            this.f8761e.remove();
        }
        Object d02 = com.bumptech.glide.c.d0(obj);
        z6.e eVar = this.f10089d;
        z6.i context = eVar.getContext();
        z1 z1Var = null;
        Object b10 = t7.z.b(context, null);
        if (b10 != t7.z.f10093a) {
            z1Var = r6.h0.d1(eVar, context, b10);
        }
        try {
            this.f10089d.resumeWith(d02);
        } finally {
            if (z1Var == null || z1Var.U()) {
                t7.z.a(context, b10);
            }
        }
    }
}
