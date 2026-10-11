package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m25 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m25(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void a(int i) {
        switch (this.a) {
            case 1:
                Iterator it = new HashSet(((gi0) this.b).d).iterator();
                while (it.hasNext()) {
                    ((m25) it.next()).a(i);
                }
                return;
            default:
                return;
        }
    }

    public void c(int i) {
        switch (this.a) {
            case 1:
                gi0 gi0Var = (gi0) this.b;
                gi0Var.g(i);
                gi0Var.b(i);
                Iterator it = new HashSet(gi0Var.d).iterator();
                while (it.hasNext()) {
                    ((m25) it.next()).c(i);
                }
                return;
            default:
                return;
        }
    }

    public void e(mr mrVar) {
        switch (this.a) {
            case 1:
                Iterator it = new HashSet(((gi0) this.b).d).iterator();
                while (it.hasNext()) {
                    ((m25) it.next()).e(mrVar);
                }
                return;
            default:
                return;
        }
    }

    public void g() {
        switch (this.a) {
            case 1:
                Iterator it = new HashSet(((gi0) this.b).d).iterator();
                while (it.hasNext()) {
                    ((m25) it.next()).g();
                }
                return;
            default:
                return;
        }
    }

    public void i(int i) {
        switch (this.a) {
            case 1:
                Iterator it = new HashSet(((gi0) this.b).d).iterator();
                while (it.hasNext()) {
                    ((m25) it.next()).i(i);
                }
                return;
            default:
                return;
        }
    }

    public final void k() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                p25 p25Var = (p25) obj;
                p25Var.s1();
                p25Var.n.b();
                return;
            default:
                Iterator it = new HashSet(((gi0) obj).d).iterator();
                while (it.hasNext()) {
                    ((m25) it.next()).k();
                }
                return;
        }
    }

    public final void h() {
    }

    public final void b(int i) {
    }

    public final void d(int i) {
    }

    public final void f(mr mrVar) {
    }

    public final void j(int i) {
    }
}
