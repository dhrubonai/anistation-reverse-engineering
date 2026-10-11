package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mx2 implements o54 {
    public final x14 x;
    public final LinkedHashSet y = new LinkedHashSet();

    public mx2(x14 x14Var) {
        this.x = x14Var;
    }

    @Override // defpackage.o54
    public final void N(ey3 ey3Var) {
        if (io3.U(ey3Var)) {
            this.y.add(ey3Var);
        }
    }

    @Override // defpackage.o54
    public final void W(int i, ByteBuffer byteBuffer, ra0 ra0Var) {
        this.x.W(i, byteBuffer, ra0Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.y.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            x14 x14Var = this.x;
            if (hasNext) {
                x14Var.N((ey3) it.next());
            } else {
                x14Var.close();
                return;
            }
        }
    }

    @Override // defpackage.o54
    public final int n0(ea2 ea2Var) {
        x14 x14Var = this.x;
        int n0 = x14Var.n0(ea2Var);
        if (qy3.m(ea2Var.p)) {
            x14Var.N(new y14(ea2Var.C));
        }
        return n0;
    }
}
