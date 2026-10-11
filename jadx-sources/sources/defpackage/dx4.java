package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dx4 implements jc2 {
    public final /* synthetic */ boolean x;
    public final /* synthetic */ long y;
    public final /* synthetic */ mx4 z;

    public dx4(boolean z, long j, mx4 mx4Var) {
        this.x = z;
        this.y = j;
        this.z = mx4Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        kd2 kd2Var = (kd2) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 17) != 16) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(intValue & 1, z)) {
            t80.c(Boolean.valueOf(this.x), null, sw0.N(z04.z, kd2Var), null, nx7.R(-2064098104, new cx4(this.y, this.z), kd2Var), kd2Var, 24576);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
