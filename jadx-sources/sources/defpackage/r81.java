package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r81 extends t36 implements ic2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ s81 B;
    public final /* synthetic */ wc5 C;
    public t05 x;
    public ml y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r81(float f, s81 s81Var, wc5 wc5Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = f;
        this.B = s81Var;
        this.C = wc5Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new r81(this.A, this.B, this.C, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((r81) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [t05, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [t05, java.lang.Object] */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        float f;
        t05 t05Var;
        ml mlVar;
        boolean z = this.z;
        if (z) {
            if (z) {
                mlVar = this.y;
                t05Var = this.x;
                try {
                    m37.N(obj);
                } catch (CancellationException unused) {
                    t05Var.x = ((Number) mlVar.b()).floatValue();
                    f = t05Var.x;
                    return new Float(f);
                }
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            f = this.A;
            if (Math.abs(f) > 1.0f) {
                ?? obj2 = new Object();
                obj2.x = f;
                ?? obj3 = new Object();
                ml a = n03.a(0.0f, f, 28);
                try {
                    s81 s81Var = this.B;
                    f61 f61Var = s81Var.a;
                    bg bgVar = new bg((t05) obj3, this.C, (t05) obj2, s81Var);
                    this.x = obj2;
                    this.y = a;
                    this.z = true;
                    Object d = nv5.d(a, f61Var, false, bgVar, this);
                    w11 w11Var = w11.x;
                    if (d == w11Var) {
                        return w11Var;
                    }
                    t05Var = obj2;
                } catch (CancellationException unused2) {
                    t05Var = obj2;
                    mlVar = a;
                    t05Var.x = ((Number) mlVar.b()).floatValue();
                    f = t05Var.x;
                    return new Float(f);
                }
            }
            return new Float(f);
        }
        f = t05Var.x;
        return new Float(f);
    }
}
