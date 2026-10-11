package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class lq6 {
    public static final long a = sx0.b(0, 0, 0, 0, 5);
    public static final /* synthetic */ int b = 0;

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, ux0] */
    public static final cr5 a(dz0 dz0Var, kd2 kd2Var) {
        pz4 pz4Var;
        boolean i = a34.i(dz0Var, pk2.T);
        boolean g = kd2Var.g(i);
        Object Q = kd2Var.Q();
        if (g || Q == au0.a) {
            if (i) {
                pz4Var = cr5.m;
            } else {
                ?? obj = new Object();
                obj.x = a;
                obj.y = new ArrayList();
                pz4Var = obj;
            }
            Q = pz4Var;
            kd2Var.n0(Q);
        }
        return (cr5) Q;
    }

    public static final long b(long j) {
        return (io3.h0(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (io3.h0(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    public static void c(String str) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + qx1.m("If you wish to display this ", str, ", use androidx.compose.foundation.Image."));
    }
}
