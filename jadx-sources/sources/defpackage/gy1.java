package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class gy1 implements ri3, au3, ay0 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ int z;

    public /* synthetic */ gy1(int i, int i2, byte b) {
        this.x = b;
        this.y = i;
        this.z = i2;
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        switch (this.x) {
            case 2:
                ((fq4) obj).F(this.y, this.z);
                return;
            default:
                ((fq4) obj).A0(this.y, this.z);
                return;
        }
    }

    @Override // defpackage.au3
    public void d(ct3 ct3Var, int i) {
        ct3Var.c(i, this.y, this.z);
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        ((io4) obj).S(this.y, this.z);
    }
}
