package v1;

import java.io.IOException;

/* loaded from: classes.dex */
public final class j0 implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f10449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f10450b;

    public j0(m0 m0Var, int i10) {
        this.f10450b = m0Var;
        this.f10449a = i10;
    }

    @Override // v1.v0
    public final boolean a() {
        m0 m0Var = this.f10450b;
        if (!m0Var.E() && m0Var.K[this.f10449a].u(m0Var.f10470c0)) {
            return true;
        }
        return false;
    }

    @Override // v1.v0
    public final void b() {
        m0 m0Var = this.f10450b;
        m0Var.K[this.f10449a].w();
        int z9 = m0Var.f10471d.z(m0Var.T);
        z1.o oVar = m0Var.B;
        IOException iOException = oVar.f11944c;
        if (iOException == null) {
            z1.k kVar = oVar.f11943b;
            if (kVar != null) {
                if (z9 == Integer.MIN_VALUE) {
                    z9 = kVar.f11930a;
                }
                IOException iOException2 = kVar.f11934e;
                if (iOException2 != null && kVar.f11935f > z9) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // v1.v0
    public final int g(androidx.appcompat.widget.a0 a0Var, i1.h hVar, int i10) {
        m0 m0Var = this.f10450b;
        if (m0Var.E()) {
            return -3;
        }
        int i11 = this.f10449a;
        m0Var.A(i11);
        int z9 = m0Var.K[i11].z(a0Var, hVar, i10, m0Var.f10470c0);
        if (z9 == -3) {
            m0Var.B(i11);
        }
        return z9;
    }

    @Override // v1.v0
    public final int i(long j4) {
        m0 m0Var = this.f10450b;
        if (m0Var.E()) {
            return 0;
        }
        int i10 = this.f10449a;
        m0Var.A(i10);
        u0 u0Var = m0Var.K[i10];
        int s9 = u0Var.s(j4, m0Var.f10470c0);
        u0Var.E(s9);
        if (s9 == 0) {
            m0Var.B(i10);
            return s9;
        }
        return s9;
    }
}
