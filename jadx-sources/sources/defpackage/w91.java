package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class w91 implements r26 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ w91(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // defpackage.r26
    public final Object get() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                try {
                    return (iw3) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                return (r91) obj;
            case 2:
                return (mb1) obj;
            case 3:
                return (iw3) obj;
            default:
                return (cy1) obj;
        }
    }
}
