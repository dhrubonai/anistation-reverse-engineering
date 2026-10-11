package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e98 extends qt0 {
    public final /* synthetic */ byte y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e98(byte b) {
        super((byte) 9);
        this.y = b;
    }

    @Override // defpackage.qt0
    public final /* synthetic */ Object G() {
        switch (this.y) {
            case 0:
                return new g98();
            case 1:
                return new i98();
            case 2:
                return new na8();
            default:
                return new qa8();
        }
    }
}
