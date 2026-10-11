package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class d65 extends l1 {
    public int A;
    public final /* synthetic */ e65 B;
    public int z;

    public d65(e65 e65Var) {
        this.B = e65Var;
        this.z = e65Var.A;
        this.A = e65Var.z;
    }

    @Override // defpackage.l1
    public final void a() {
        int i = this.z;
        if (i == 0) {
            this.x = (byte) 2;
            return;
        }
        e65 e65Var = this.B;
        Object[] objArr = e65Var.x;
        int i2 = this.A;
        this.y = objArr[i2];
        this.x = (byte) 1;
        this.A = (i2 + 1) % e65Var.y;
        this.z = i - 1;
    }
}
