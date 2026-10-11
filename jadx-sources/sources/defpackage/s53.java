package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class s53 {
    public final cs1 a;
    public boolean b;

    /* JADX WARN: Type inference failed for: r0v0, types: [cs1, java.lang.Object] */
    public s53(aj5 aj5Var) {
        aj5Var.getClass();
        hj1 hj1Var = new hj1(2, this, s53.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0, (byte) 4);
        aj5Var.getClass();
        ?? obj = new Object();
        obj.b = aj5Var;
        obj.c = hj1Var;
        int e = aj5Var.e();
        if (e <= 64) {
            obj.a = e != 64 ? (-1) << e : 0L;
            obj.d = cs1.e;
        } else {
            obj.a = 0L;
            int i = (e - 1) >>> 6;
            long[] jArr = new long[i];
            if ((e & 63) != 0) {
                jArr[i - 1] = (-1) << e;
            }
            obj.d = jArr;
        }
        this.a = obj;
    }
}
