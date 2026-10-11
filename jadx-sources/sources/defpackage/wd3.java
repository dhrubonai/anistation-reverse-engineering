package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wd3 implements px5 {
    public int A;
    public final byte x;
    public final short y;
    public final ti4 z;

    /* JADX WARN: Multi-variable type inference failed */
    public wd3(int i, int i2, int i3) {
        this.x = i2;
        this.y = i3;
        int i4 = (i / i2) * i2;
        this.z = new ti4(db.r0(Math.max(i4 - i3, 0), i4 + i2 + i3), p7.S);
        this.A = i;
    }

    public final void b(int i) {
        if (i != this.A) {
            this.A = i;
            byte b = this.x;
            int i2 = (i / b) * b;
            short s = this.y;
            this.z.setValue(db.r0(Math.max(i2 - s, 0), i2 + b + s));
        }
    }

    @Override // defpackage.px5
    public final Object getValue() {
        return (f13) this.z.getValue();
    }
}
