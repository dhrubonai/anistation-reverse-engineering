package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class q85 extends xz0 implements x42 {
    public l11 A;
    public vz0 B;
    public final x42 x;
    public final l11 y;
    public final int z;

    public q85(x42 x42Var, l11 l11Var) {
        super(cr0.z, it1.x);
        this.x = x42Var;
        this.y = l11Var;
        this.z = ((Number) l11Var.fold(0, new wj3((byte) 26))).intValue();
    }

    @Override // defpackage.x42
    public final Object emit(Object obj, vz0 vz0Var) {
        try {
            Object i = i(vz0Var, obj);
            if (i == w11.x) {
                return i;
            }
            return pn6.a;
        } catch (Throwable th) {
            this.A = new um1(vz0Var.getContext(), th);
            throw th;
        }
    }

    @Override // defpackage.h30, defpackage.x11
    public final x11 getCallerFrame() {
        vz0 vz0Var = this.B;
        if (vz0Var instanceof x11) {
            return (x11) vz0Var;
        }
        return null;
    }

    @Override // defpackage.xz0, defpackage.vz0
    public final l11 getContext() {
        l11 l11Var = this.A;
        if (l11Var == null) {
            return it1.x;
        }
        return l11Var;
    }

    @Override // defpackage.h30
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final Object i(vz0 vz0Var, Object obj) {
        l11 context = vz0Var.getContext();
        h98.o(context);
        l11 l11Var = this.A;
        if (l11Var != context) {
            if (!(l11Var instanceof um1)) {
                if (((Number) context.fold(0, new o0((Object) this, (byte) 24))).intValue() == this.z) {
                    this.A = context;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.y + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(vz5.u("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((um1) l11Var).y + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.B = vz0Var;
        jc2 jc2Var = s85.a;
        x42 x42Var = this.x;
        x42Var.getClass();
        Object invoke = jc2Var.invoke(x42Var, obj, this);
        if (!a34.i(invoke, w11.x)) {
            this.B = null;
        }
        return invoke;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Throwable b = z45.b(obj);
        if (b != null) {
            this.A = new um1(getContext(), b);
        }
        vz0 vz0Var = this.B;
        if (vz0Var != null) {
            vz0Var.resumeWith(obj);
        }
        return w11.x;
    }
}
