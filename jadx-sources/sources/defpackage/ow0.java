package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ow0 implements g85, k54 {
    public Throwable A;
    public final nw0 B;
    public final g85 x;
    public final k54 y;
    public l11 z;

    public ow0(g85 g85Var) {
        m54 m54Var = new m54();
        g85Var.getClass();
        this.x = g85Var;
        this.y = m54Var;
        this.B = new nw0(this);
    }

    @Override // defpackage.k54
    public final Object a(vz0 vz0Var) {
        return this.y.a(vz0Var);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        nw0 nw0Var = this.B;
        if (nw0Var != null) {
            nw0Var.f(-1);
        }
        this.x.close();
    }

    @Override // defpackage.g85
    public final boolean j() {
        return this.x.j();
    }

    @Override // defpackage.k54
    public final void l(Object obj) {
        this.y.l(null);
    }

    public final void p(StringBuilder sb) {
        int i;
        if (this.z == null && this.A == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            l11 l11Var = this.z;
            if (l11Var != null) {
                sb.append("\t\tCoroutine: " + l11Var);
                sb.append('\n');
            }
            Throwable th = this.A;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                Iterator it = yo0.g0(uz5.Z(n03.J(th)), 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (this.B != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            nw0 nw0Var = this.B;
            synchronized (nw0Var.c) {
                i = nw0Var.d;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    @Override // defpackage.g85
    public final m85 s0(String str) {
        str.getClass();
        nw0 nw0Var = this.B;
        if (nw0Var != null) {
            Object c = nw0Var.c(str);
            c.getClass();
            return new g60((m85) c, (byte) 1);
        }
        return this.x.s0(str);
    }

    public final String toString() {
        return this.x.toString();
    }
}
