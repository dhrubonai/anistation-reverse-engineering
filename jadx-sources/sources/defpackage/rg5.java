package defpackage;

import java.io.Closeable;
import java.nio.channels.SocketChannel;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class rg5 implements Closeable, ei1 {
    public static final /* synthetic */ long z = qs.a.objectFieldOffset(rg5.class.getDeclaredField("_interestedOps"));
    public final AtomicBoolean x = new AtomicBoolean(false);
    public final w13 y = new Object();
    private volatile /* synthetic */ int _interestedOps = 0;

    public final void A(pg5 pg5Var, boolean z2) {
        int i;
        byte b = pg5Var.x;
        while (true) {
            int i2 = this._interestedOps;
            if (z2) {
                i = i2 | b;
            } else {
                i = (~b) & i2;
            }
            rg5 rg5Var = this;
            if (qs.a.compareAndSwapInt(rg5Var, z, i2, i)) {
                return;
            } else {
                this = rg5Var;
            }
        }
    }

    @Override // defpackage.ei1
    public void dispose() {
        close();
    }

    public abstract SocketChannel q();

    public final int t() {
        return this._interestedOps;
    }
}
