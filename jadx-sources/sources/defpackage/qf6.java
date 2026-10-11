package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qf6 extends CancellationException implements m01 {
    public final transient h43 x;

    public qf6(String str, h43 h43Var) {
        super(str);
        this.x = h43Var;
    }

    @Override // defpackage.m01
    public final Throwable a() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        qf6 qf6Var = new qf6(message, this.x);
        qf6Var.initCause(this);
        return qf6Var;
    }
}
