package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mb2 implements a36 {
    public final boolean A;
    public final boolean B;
    public final d46 C;
    public boolean D;
    public final Context x;
    public final String y;
    public final fr0 z;

    public mb2(Context context, String str, fr0 fr0Var, boolean z, boolean z2) {
        context.getClass();
        fr0Var.getClass();
        this.x = context;
        this.y = str;
        this.z = fr0Var;
        this.A = z;
        this.B = z2;
        this.C = new d46(new vt0(this, (byte) 10));
    }

    @Override // defpackage.a36
    public final x26 X() {
        return ((lb2) this.C.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d46 d46Var = this.C;
        if (d46Var.isInitialized()) {
            ((lb2) d46Var.getValue()).close();
        }
    }

    @Override // defpackage.a36
    public final String getDatabaseName() {
        return this.y;
    }

    @Override // defpackage.a36
    public final void setWriteAheadLoggingEnabled(boolean z) {
        d46 d46Var = this.C;
        if (d46Var.isInitialized()) {
            ((lb2) d46Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.D = z;
    }
}
