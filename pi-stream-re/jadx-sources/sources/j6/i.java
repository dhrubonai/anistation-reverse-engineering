package j6;

import r6.h0;

/* loaded from: classes.dex */
public final class i extends h0 {
    public i() {
        super(0);
    }

    @Override // r6.h0
    public final void V(float f10, float f11, u uVar) {
        uVar.d(f11 * f10, 180.0f, 90.0f);
        float f12 = f11 * 2.0f * f10;
        q qVar = new q(0.0f, 0.0f, f12, f12);
        qVar.f6252f = 180.0f;
        qVar.f6253g = 90.0f;
        uVar.f6265g.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f6266h.add(oVar);
        uVar.f6263e = 270.0f;
        float f13 = (f12 + 0.0f) * 0.5f;
        float f14 = (f12 - 0.0f) / 2.0f;
        double d10 = 270.0f;
        uVar.f6261c = (((float) Math.cos(Math.toRadians(d10))) * f14) + f13;
        uVar.f6262d = (f14 * ((float) Math.sin(Math.toRadians(d10)))) + f13;
    }
}
