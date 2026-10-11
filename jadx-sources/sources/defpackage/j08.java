package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j08 implements Runnable {
    public final long x;
    public final long y;
    public final /* synthetic */ fk7 z;

    public j08(fk7 fk7Var, long j, long j2) {
        Objects.requireNonNull(fk7Var);
        this.z = fk7Var;
        this.x = j;
        this.y = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        au7 au7Var = ((gu7) ((r08) this.z.y).x).D;
        gu7.l(au7Var);
        au7Var.U(new la(this, (byte) 23));
    }
}
