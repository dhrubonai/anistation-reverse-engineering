package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fn0 extends u45 {
    public final /* synthetic */ byte y;
    public final String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn0(f91 f91Var, String str, byte b) {
        super(f91Var, str);
        this.y = b;
        f91Var.getClass();
        str.getClass();
        switch (b) {
            case 1:
                super(f91Var, str);
                this.z = "Unhandled redirect: " + f91Var.d0().c().getMethod().a + ' ' + f91Var.d0().c().getUrl() + ". Status: " + f91Var.c() + ". Text: \"" + str + '\"';
                return;
            case 2:
                super(f91Var, str);
                this.z = "Server error(" + f91Var.d0().c().getMethod().a + ' ' + f91Var.d0().c().getUrl() + ": " + f91Var.c() + ". Text: \"" + str + '\"';
                return;
            default:
                this.z = "Client request(" + f91Var.d0().c().getMethod().a + ' ' + f91Var.d0().c().getUrl() + ") invalid: " + f91Var.c() + ". Text: \"" + str + '\"';
                return;
        }
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        switch (this.y) {
            case 0:
                return this.z;
            case 1:
                return this.z;
            default:
                return this.z;
        }
    }
}
