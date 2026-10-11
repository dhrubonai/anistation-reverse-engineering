package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class cr0 implements vz0 {
    public static final cr0 y = new cr0(0);
    public static final cr0 z = new cr0(1);
    public final /* synthetic */ byte x;

    public /* synthetic */ cr0(byte b) {
        this.x = b;
    }

    @Override // defpackage.vz0
    public final l11 getContext() {
        byte b = this.x;
        it1 it1Var = it1.x;
        switch (b) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            case 1:
            default:
                return it1Var;
        }
    }

    @Override // defpackage.vz0
    public final void resumeWith(Object obj) {
        switch (this.x) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            case 1:
            default:
                return;
        }
    }

    public String toString() {
        switch (this.x) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void b(Object obj) {
    }

    private final void d(Object obj) {
    }
}
