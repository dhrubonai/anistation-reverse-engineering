package defpackage;

import androidx.work.impl.model.WorkSpecDao_Impl;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class pb implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ long y;

    public /* synthetic */ pb(long j, byte b) {
        this.x = b;
        this.y = j;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        qg0 qg0Var;
        Object y45Var;
        float f;
        float f2;
        List recentlyCompletedWork$lambda$0;
        byte b = this.x;
        float f3 = 0.0f;
        pn6 pn6Var = pn6.a;
        long j = this.y;
        switch (b) {
            case 0:
                we0 we0Var = (we0) obj;
                float intBitsToFloat = Float.intBitsToFloat((int) (we0Var.x.g() >> 32)) / 2.0f;
                return we0Var.a(new qb(intBitsToFloat, x97.t(we0Var, intBitsToFloat), new w60(j, 5), (byte) 0));
            case 1:
                we0 we0Var2 = (we0) obj;
                we0Var2.getClass();
                float b2 = we0Var2.b() * 150.0f;
                float intBitsToFloat2 = Float.intBitsToFloat((int) (we0Var2.x.g() & 4294967295L)) - b2;
                if (intBitsToFloat2 >= 0.0f) {
                    f3 = intBitsToFloat2;
                }
                return we0Var2.a(new l0(new im(m18.P(te4.I(new ep0(ep0.h), new ep0(ep0.b(0.48f, j)), new ep0(ep0.b(0.68f, j))), f3, Float.intBitsToFloat((int) (we0Var2.x.g() & 4294967295L)), 8), f3, b2), (byte) 23));
            case 2:
                ia0 ia0Var = (ia0) obj;
                ub2 ub2Var = ia0Var.b;
                if (ub2Var != null && (qg0Var = ia0Var.a) != null) {
                    try {
                        y45Var = ub2Var.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        y45Var = new y45(th);
                    }
                    qg0Var.resumeWith(y45Var);
                }
                return pn6Var;
            case 3:
                ((bi5) obj).b(ih5.a, new hh5(cj2.x, this.y, gh5.y, true));
                return pn6Var;
            case 4:
                ((mu5) obj).z = j;
                return pn6Var;
            case 5:
                qq5 qq5Var = (qq5) obj;
                qq5Var.getClass();
                oa0 oa0Var = (oa0) qq5Var;
                yf5 T = oa0Var.T(8);
                byte[] bArr = T.a;
                int i = T.c;
                bArr[i] = (byte) ((j >>> 56) & 255);
                bArr[i + 1] = (byte) ((j >>> 48) & 255);
                bArr[i + 2] = (byte) ((j >>> 40) & 255);
                bArr[i + 3] = (byte) ((j >>> 32) & 255);
                bArr[i + 4] = (byte) ((j >>> 24) & 255);
                bArr[i + 5] = (byte) ((j >>> 16) & 255);
                bArr[i + 6] = (byte) ((j >>> 8) & 255);
                bArr[i + 7] = (byte) (j & 255);
                T.c = i + 8;
                oa0Var.z += 8;
                return pn6Var;
            case 6:
                ((j44) obj).e(sk2.b, Long.valueOf(j));
                return null;
            case 7:
                bp1 bp1Var = (bp1) obj;
                bp1Var.getClass();
                float intBitsToFloat3 = Float.intBitsToFloat((int) (bp1Var.g() & 4294967295L)) - bp1Var.g0(150.0f);
                List I = te4.I(new ep0(ep0.h), new ep0(ep0.b(0.38f, j)), new ep0(ep0.b(0.68f, j)));
                if (intBitsToFloat3 < 0.0f) {
                    f = 0.0f;
                } else {
                    f = intBitsToFloat3;
                }
                oh3 P = m18.P(I, f, Float.intBitsToFloat((int) (bp1Var.g() & 4294967295L)), 8);
                if (intBitsToFloat3 < 0.0f) {
                    intBitsToFloat3 = 0.0f;
                }
                bp1.a0(bp1Var, P, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (bp1Var.g() >> 32))) << 32) | (Float.floatToRawIntBits(r1) & 4294967295L), 0.0f, null, 120);
                return pn6Var;
            case 8:
                bp1 bp1Var2 = (bp1) obj;
                bp1Var2.getClass();
                float intBitsToFloat4 = Float.intBitsToFloat((int) (bp1Var2.g() & 4294967295L)) - bp1Var2.g0(150.0f);
                List I2 = te4.I(new ep0(ep0.h), new ep0(ep0.b(0.48f, j)), new ep0(ep0.b(0.68f, j)));
                if (intBitsToFloat4 < 0.0f) {
                    f2 = 0.0f;
                } else {
                    f2 = intBitsToFloat4;
                }
                oh3 P2 = m18.P(I2, f2, Float.intBitsToFloat((int) (bp1Var2.g() & 4294967295L)), 8);
                if (intBitsToFloat4 < 0.0f) {
                    intBitsToFloat4 = 0.0f;
                }
                bp1.a0(bp1Var2, P2, (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L), (4294967295L & Float.floatToRawIntBits(r0)) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (bp1Var2.g() >> 32))) << 32), 0.0f, null, 120);
                return pn6Var;
            default:
                recentlyCompletedWork$lambda$0 = WorkSpecDao_Impl.getRecentlyCompletedWork$lambda$0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", j, (g85) obj);
                return recentlyCompletedWork$lambda$0;
        }
    }
}
