package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public abstract class n1 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f942a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f943b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f944c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public boolean f945d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f946e = false;

    public n1(ViewGroup viewGroup) {
        this.f942a = viewGroup;
    }

    public static n1 f(ViewGroup viewGroup, j0 j0Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof n1) {
            return (n1) tag;
        }
        j0Var.getClass();
        l lVar = new l(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, lVar);
        return lVar;
    }

    public final void a(int i10, int i11, z0 z0Var) {
        synchronized (this.f943b) {
            c0.d dVar = new c0.d();
            m1 d10 = d(z0Var.f1062c);
            if (d10 != null) {
                d10.c(i10, i11);
                return;
            }
            m1 m1Var = new m1(i10, i11, z0Var, dVar);
            this.f943b.add(m1Var);
            m1Var.f935d.add(new l1(this, m1Var, 0));
            m1Var.f935d.add(new l1(this, m1Var, 1));
        }
    }

    public abstract void b(ArrayList arrayList, boolean z9);

    public final void c() {
        if (this.f946e) {
            return;
        }
        ViewGroup viewGroup = this.f942a;
        WeakHashMap weakHashMap = g0.y0.f4277a;
        if (!g0.k0.b(viewGroup)) {
            e();
            this.f945d = false;
            return;
        }
        synchronized (this.f943b) {
            if (!this.f943b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f944c);
                this.f944c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m1 m1Var = (m1) it.next();
                    if (s0.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + m1Var);
                    }
                    m1Var.a();
                    if (!m1Var.f938g) {
                        this.f944c.add(m1Var);
                    }
                }
                h();
                ArrayList arrayList2 = new ArrayList(this.f943b);
                this.f943b.clear();
                this.f944c.addAll(arrayList2);
                if (s0.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((m1) it2.next()).d();
                }
                b(arrayList2, this.f945d);
                this.f945d = false;
                if (s0.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    public final m1 d(y yVar) {
        Iterator it = this.f943b.iterator();
        while (it.hasNext()) {
            m1 m1Var = (m1) it.next();
            if (m1Var.f934c.equals(yVar) && !m1Var.f937f) {
                return m1Var;
            }
        }
        return null;
    }

    public final void e() {
        String str;
        String str2;
        if (s0.H(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f942a;
        WeakHashMap weakHashMap = g0.y0.f4277a;
        boolean b10 = g0.k0.b(viewGroup);
        synchronized (this.f943b) {
            h();
            Iterator it = this.f943b.iterator();
            while (it.hasNext()) {
                ((m1) it.next()).d();
            }
            Iterator it2 = new ArrayList(this.f944c).iterator();
            while (it2.hasNext()) {
                m1 m1Var = (m1) it2.next();
                if (s0.H(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (b10) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f942a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(m1Var);
                    Log.v("FragmentManager", sb.toString());
                }
                m1Var.a();
            }
            Iterator it3 = new ArrayList(this.f943b).iterator();
            while (it3.hasNext()) {
                m1 m1Var2 = (m1) it3.next();
                if (s0.H(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (b10) {
                        str = "";
                    } else {
                        str = "Container " + this.f942a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(m1Var2);
                    Log.v("FragmentManager", sb2.toString());
                }
                m1Var2.a();
            }
        }
    }

    public final void g() {
        synchronized (this.f943b) {
            h();
            this.f946e = false;
            int size = this.f943b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                m1 m1Var = (m1) this.f943b.get(size);
                int d10 = a3.g.d(m1Var.f934c.V);
                if (m1Var.f932a == 2 && d10 != 2) {
                    v vVar = m1Var.f934c.Y;
                    this.f946e = false;
                    break;
                }
            }
        }
    }

    public final void h() {
        Iterator it = this.f943b.iterator();
        while (it.hasNext()) {
            m1 m1Var = (m1) it.next();
            if (m1Var.f933b == 2) {
                m1Var.c(a3.g.c(m1Var.f934c.P().getVisibility()), 1);
            }
        }
    }
}
