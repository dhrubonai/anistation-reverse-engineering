package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qw5 implements Iterable {
    public final /* synthetic */ String x;
    public final /* synthetic */ i90 y;

    public qw5(i90 i90Var, String str) {
        this.x = str;
        this.y = i90Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        i90 i90Var = this.y;
        return ((rw5) i90Var.d).u(i90Var, this.x);
    }

    public final String toString() {
        tv tvVar = new tv(", ", (byte) 2);
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        tvVar.a(sb, iterator());
        sb.append(']');
        return sb.toString();
    }
}
