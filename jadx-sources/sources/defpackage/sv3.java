package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class sv3 implements ay0, ri3 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ sv3(int i, boolean z) {
        this.x = (byte) 1;
        this.y = i;
        this.z = z;
    }

    @Override // defpackage.ay0
    public void accept(Object obj) {
        ((fq4) obj).D(this.y, this.z);
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        switch (this.x) {
            case 1:
                ((io4) obj).C(this.y, this.z);
                return;
            case 2:
                ((io4) obj).M(this.y, this.z);
                return;
            default:
                ((io4) obj).r(this.y, this.z);
                return;
        }
    }

    public /* synthetic */ sv3(boolean z, int i, byte b) {
        this.x = b;
        this.z = z;
        this.y = i;
    }
}
