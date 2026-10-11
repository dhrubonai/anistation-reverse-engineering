package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class wm0 extends IllegalStateException {
    public final /* synthetic */ byte x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm0(String str, Throwable th) {
        super("Concurrent " + str + " attempts", th);
        this.x = (byte) 1;
        str.getClass();
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        switch (this.x) {
            case 0:
                return null;
            default:
                return super.getCause();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wm0(String str, Throwable th, byte b) {
        super(str, th);
        this.x = b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wm0(byte b) {
        super("Client already closed");
        this.x = b;
        switch (b) {
            case 3:
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wm0(String str, byte b) {
        super(str);
        this.x = b;
    }
}
