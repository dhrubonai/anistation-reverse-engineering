package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ec3 extends zv4 implements t73 {
    public final /* synthetic */ byte x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec3(Object obj, Class cls, String str, String str2, int i, byte b) {
        super(obj, cls, str, str2, i);
        this.x = b;
    }

    @Override // defpackage.t73
    public final Object get() {
        switch (this.x) {
            case 0:
                return ((px5) this.receiver).getValue();
            case 1:
                return ((px5) this.receiver).getValue();
            default:
                return this.receiver.getClass().getSimpleName();
        }
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        return get();
    }
}
