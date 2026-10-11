package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ki implements d84 {
    public final /* synthetic */ w44 x;
    public final /* synthetic */ w44 y;

    public ki(w44 w44Var, w44 w44Var2) {
        this.x = w44Var;
        this.y = w44Var2;
    }

    @Override // defpackage.d84
    public final long O(int i, long j) {
        return 0L;
    }

    @Override // defpackage.d84
    public final long z(long j, int i, long j2) {
        if (((Boolean) this.x.getValue()).booleanValue()) {
            int i2 = (int) (j & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat(i2);
            w44 w44Var = this.y;
            if (intBitsToFloat < 0.0f) {
                w44Var.setValue(Boolean.TRUE);
                return 0L;
            }
            if (Float.intBitsToFloat(i2) > 0.0f || Float.intBitsToFloat((int) (j2 & 4294967295L)) > 0.0f) {
                w44Var.setValue(Boolean.FALSE);
                return 0L;
            }
        }
        return 0L;
    }
}
