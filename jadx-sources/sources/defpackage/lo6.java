package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lo6 extends bj4 {
    public final nw2 z;

    public lo6(String str, o15 o15Var) {
        super(str, null, false, 1);
        this.z = nw2.o(o15Var);
    }

    @Override // defpackage.bj4, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        nw2 nw2Var = this.z;
        if (nw2Var.isEmpty()) {
            return message;
        }
        return message + "\nsniff failures: " + nw2Var;
    }
}
