package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class t30 implements lw3 {
    public final ArrayList a = new ArrayList(1);
    public final HashSet b = new HashSet(1);
    public final eb2 c = new eb2(new CopyOnWriteArrayList(), 0, (jw3) null);
    public final tp1 d = new tp1(new CopyOnWriteArrayList(), 0, null);
    public Looper e;
    public kf6 f;
    public cp4 g;
    public z20 h;

    public final void i(kw3 kw3Var) {
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(kw3Var);
        if (!isEmpty && hashSet.isEmpty()) {
            j();
        }
    }

    public final void k(kw3 kw3Var) {
        this.e.getClass();
        HashSet hashSet = this.b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(kw3Var);
        if (isEmpty) {
            l();
        }
    }

    public final void m(kw3 kw3Var, cp4 cp4Var, z20 z20Var) {
        boolean z;
        Looper myLooper = Looper.myLooper();
        Looper looper = this.e;
        if (looper != null && looper != myLooper) {
            z = false;
        } else {
            z = true;
        }
        io3.n(z);
        this.g = cp4Var;
        this.h = z20Var;
        kf6 kf6Var = this.f;
        this.a.add(kw3Var);
        if (this.e == null) {
            this.e = myLooper;
            this.b.add(kw3Var);
            n(z20Var.y());
        } else if (kf6Var != null) {
            k(kw3Var);
            kw3Var.b(this, kf6Var);
        }
    }

    public abstract void n(n71 n71Var);

    public final void o(kf6 kf6Var) {
        this.f = kf6Var;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((kw3) obj).b(this, kf6Var);
        }
    }

    public final void p(kw3 kw3Var) {
        ArrayList arrayList = this.a;
        arrayList.remove(kw3Var);
        if (arrayList.isEmpty()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.b.clear();
            q();
            return;
        }
        i(kw3Var);
    }

    public final void r(up1 up1Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.d.c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            sp1 sp1Var = (sp1) it.next();
            if (sp1Var.b == up1Var) {
                copyOnWriteArrayList.remove(sp1Var);
            }
        }
    }

    public final void s(qw3 qw3Var) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.c.A;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            pw3 pw3Var = (pw3) it.next();
            if (pw3Var.b == qw3Var) {
                copyOnWriteArrayList.remove(pw3Var);
            }
        }
    }

    public void j() {
    }

    public void l() {
    }

    public void q() {
    }
}
