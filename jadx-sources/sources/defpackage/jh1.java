package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class jh1 extends mh1 implements x11, vz0 {
    public static final /* synthetic */ long E = qs.a.objectFieldOffset(jh1.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    public final n11 A;
    public final xz0 B;
    public Object C;
    public final Object D;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    public jh1(n11 n11Var, xz0 xz0Var) {
        super(-1);
        this.A = n11Var;
        this.B = xz0Var;
        this.C = kh1.a;
        this.D = ke6.b(xz0Var.getContext());
    }

    @Override // defpackage.x11
    public final x11 getCallerFrame() {
        return this.B;
    }

    @Override // defpackage.vz0
    public final l11 getContext() {
        return this.B.getContext();
    }

    @Override // defpackage.mh1
    public final Object j() {
        Object obj = this.C;
        this.C = kh1.a;
        return obj;
    }

    @Override // defpackage.vz0
    public final void resumeWith(Object obj) {
        Object dr0Var;
        Throwable b = z45.b(obj);
        if (b == null) {
            dr0Var = obj;
        } else {
            dr0Var = new dr0(b, false);
        }
        xz0 xz0Var = this.B;
        l11 context = xz0Var.getContext();
        n11 n11Var = this.A;
        if (kh1.c(n11Var, context)) {
            this.C = dr0Var;
            this.z = 0;
            kh1.b(n11Var, xz0Var.getContext(), this);
            return;
        }
        mw1 a = me6.a();
        if (a.y >= 4294967296L) {
            this.C = dr0Var;
            this.z = 0;
            a.z0(this);
            return;
        }
        a.A0(true);
        try {
            l11 context2 = xz0Var.getContext();
            Object c = ke6.c(context2, this.D);
            try {
                xz0Var.resumeWith(obj);
                do {
                } while (a.C0());
            } finally {
                ke6.a(context2, c);
            }
        } catch (Throwable th) {
            try {
                i(th);
            } finally {
                a.y0(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.A + ", " + z51.T(this.B) + ']';
    }

    @Override // defpackage.mh1
    public final vz0 e() {
        return this;
    }
}
