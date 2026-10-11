package p7;

import com.google.android.recaptcha.internal.zzp;

/* loaded from: classes.dex */
public final class r extends k1 implements q {
    public r(a1 a1Var) {
        super(true);
        E(a1Var);
    }

    public final Object T(z6.e eVar) {
        Object a10;
        while (true) {
            Object B = B();
            if (!(B instanceof x0)) {
                if (!(B instanceof t)) {
                    a10 = l1.a(B);
                } else {
                    throw ((t) B).f8743a;
                }
            } else if (P(B) >= 0) {
                f1 f1Var = new f1(com.bumptech.glide.d.F(eVar), this);
                f1Var.t();
                f1Var.v(new l0(F(false, true, new m0(f1Var, 2)), 0));
                a10 = f1Var.s();
                a7.a aVar = a7.a.f156a;
                break;
            }
        }
        a7.a aVar2 = a7.a.f156a;
        return a10;
    }

    public final boolean U(zzp zzpVar) {
        return H(new t(zzpVar, false));
    }
}
