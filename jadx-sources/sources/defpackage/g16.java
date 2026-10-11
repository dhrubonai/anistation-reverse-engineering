package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class g16 extends in5 implements qx5 {
    @Override // defpackage.qx5
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            Object[] objArr = this.E;
            objArr.getClass();
            valueOf = Integer.valueOf(((Number) objArr[((int) ((this.F + ((int) ((p() + this.H) - this.F))) - 1)) & (objArr.length - 1)]).intValue());
        }
        return valueOf;
    }

    public final void w(int i) {
        synchronized (this) {
            Object[] objArr = this.E;
            objArr.getClass();
            d(Integer.valueOf(((Number) objArr[((int) ((this.F + ((int) ((p() + this.H) - this.F))) - 1)) & (objArr.length - 1)]).intValue() + i));
        }
    }
}
