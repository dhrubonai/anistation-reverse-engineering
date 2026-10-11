package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tp1 {
    public final int a;
    public final jw3 b;
    public final CopyOnWriteArrayList c;

    public tp1(CopyOnWriteArrayList copyOnWriteArrayList, int i, jw3 jw3Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = jw3Var;
    }

    public final void a(i18 i18Var) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            sp1 sp1Var = (sp1) it.next();
            eq6.a0(sp1Var.a, new ze((Object) this, (Object) sp1Var.b, (Object) i18Var, (byte) 7));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            sp1 sp1Var = (sp1) it.next();
            eq6.a0(sp1Var.a, new rp1(this, sp1Var.b, (byte) 1));
        }
    }

    public final void c(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            sp1 sp1Var = (sp1) it.next();
            eq6.a0(sp1Var.a, new sf1((byte) 1, i, this, sp1Var.b));
        }
    }

    public final void d(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            sp1 sp1Var = (sp1) it.next();
            eq6.a0(sp1Var.a, new ze((Object) this, (Object) sp1Var.b, (Object) exc, (byte) 6));
        }
    }

    public final void e() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            sp1 sp1Var = (sp1) it.next();
            eq6.a0(sp1Var.a, new rp1(this, sp1Var.b, (byte) 0));
        }
    }
}
