package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class zs5 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ float y;
    public final /* synthetic */ Object z;

    public /* synthetic */ zs5(tr5 tr5Var, float f, px5 px5Var, px5 px5Var2) {
        this.x = (byte) 2;
        this.z = tr5Var;
        this.y = f;
        this.A = px5Var;
        this.B = px5Var2;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        float f = 0.0f;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.B;
        Object obj3 = this.A;
        float f2 = this.y;
        Object obj4 = this.z;
        switch (b) {
            case 0:
                t05 t05Var = (t05) obj4;
                wc5 wc5Var = (wc5) obj3;
                ub2 ub2Var = (ub2) obj2;
                kl klVar = (kl) obj;
                float abs = Math.abs(((Number) klVar.e.getValue()).floatValue());
                float abs2 = Math.abs(f2);
                ti4 ti4Var = klVar.e;
                if (abs >= abs2) {
                    float f3 = ct5.f(((Number) ti4Var.getValue()).floatValue(), f2);
                    ct5.c(klVar, wc5Var, ub2Var, f3 - t05Var.x);
                    klVar.a();
                    t05Var.x = f3;
                } else {
                    ct5.c(klVar, wc5Var, ub2Var, ((Number) ti4Var.getValue()).floatValue() - t05Var.x);
                    t05Var.x = ((Number) ti4Var.getValue()).floatValue();
                }
                return pn6Var;
            case 1:
                t05 t05Var2 = (t05) obj4;
                wc5 wc5Var2 = (wc5) obj3;
                ub2 ub2Var2 = (ub2) obj2;
                kl klVar2 = (kl) obj;
                float f4 = ct5.f(((Number) klVar2.e.getValue()).floatValue(), f2);
                float f5 = f4 - t05Var2.x;
                try {
                    f = wc5Var2.a(f5);
                } catch (CancellationException unused) {
                    klVar2.a();
                }
                ub2Var2.invoke(Float.valueOf(f));
                if (Math.abs(f5 - f) > 0.5f || f4 != ((Number) klVar2.e.getValue()).floatValue()) {
                    klVar2.a();
                }
                t05Var2.x += f;
                return pn6Var;
            default:
                bp1 bp1Var = (bp1) obj;
                bp1Var.getClass();
                float c = ((tr5) obj4).c() * Float.intBitsToFloat((int) (bp1Var.g() >> 32));
                ep0 ep0Var = (ep0) ((px5) obj3).getValue();
                long j = ep0Var.a;
                ep0 ep0Var2 = (ep0) ((px5) obj2).getValue();
                long j2 = ep0Var2.a;
                oh3 oh3Var = new oh3(te4.I(ep0Var, ep0Var2), null, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L), (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(c) << 32));
                float intBitsToFloat = Float.intBitsToFloat((int) (bp1Var.g() & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(c) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
                float g0 = bp1Var.g0(f2);
                bp1.I(bp1Var, oh3Var, 0L, floatToRawIntBits, (Float.floatToRawIntBits(g0) << 32) | (Float.floatToRawIntBits(g0) & 4294967295L), null, 242);
                return pn6Var;
        }
    }

    public /* synthetic */ zs5(float f, t05 t05Var, wc5 wc5Var, ub2 ub2Var, byte b) {
        this.x = b;
        this.y = f;
        this.z = t05Var;
        this.A = wc5Var;
        this.B = ub2Var;
    }
}
