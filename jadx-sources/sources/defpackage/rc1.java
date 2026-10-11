package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rc1 extends x93 implements sb2 {
    public static final rc1 A;
    public static final rc1 z;
    public final /* synthetic */ byte y;

    static {
        int i = 0;
        z = new rc1(i, (byte) 0);
        A = new rc1(i, (byte) 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rc1(int i, byte b) {
        super(i);
        this.y = b;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        switch (this.y) {
            case 0:
                return null;
            default:
                return Boolean.TRUE;
        }
    }
}
