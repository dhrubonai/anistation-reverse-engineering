package q3;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import g0.n0;
import g0.y0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class s implements Cloneable {
    public static final int[] L = {2, 1, 3, 4};
    public static final w1.o M = new w1.o();
    public static final ThreadLocal N = new ThreadLocal();
    public ArrayList B;
    public ArrayList C;
    public com.bumptech.glide.c J;

    /* renamed from: a, reason: collision with root package name */
    public final String f9178a = getClass().getName();

    /* renamed from: b, reason: collision with root package name */
    public long f9179b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f9180c = -1;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f9181d = null;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f9182e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f9183f = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public i.g f9184x = new i.g(8);

    /* renamed from: y, reason: collision with root package name */
    public i.g f9185y = new i.g(8);

    /* renamed from: z, reason: collision with root package name */
    public x f9186z = null;
    public final int[] A = L;
    public final ArrayList D = new ArrayList();
    public int E = 0;
    public boolean F = false;
    public boolean G = false;
    public ArrayList H = null;
    public ArrayList I = new ArrayList();
    public w1.o K = M;

    public static void c(i.g gVar, View view, z zVar) {
        ((n.e) gVar.f5196b).put(view, zVar);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) gVar.f5197c).indexOfKey(id) >= 0) {
                ((SparseArray) gVar.f5197c).put(id, null);
            } else {
                ((SparseArray) gVar.f5197c).put(id, view);
            }
        }
        WeakHashMap weakHashMap = y0.f4277a;
        String k10 = n0.k(view);
        if (k10 != null) {
            if (((n.e) gVar.f5199e).containsKey(k10)) {
                ((n.e) gVar.f5199e).put(k10, null);
            } else {
                ((n.e) gVar.f5199e).put(k10, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                n.i iVar = (n.i) gVar.f5198d;
                if (iVar.f7881a) {
                    iVar.d();
                }
                if (j5.a.c(iVar.f7882b, iVar.f7884d, itemIdAtPosition) >= 0) {
                    View view2 = (View) ((n.i) gVar.f5198d).e(null, itemIdAtPosition);
                    if (view2 != null) {
                        g0.h0.r(view2, false);
                        ((n.i) gVar.f5198d).f(null, itemIdAtPosition);
                        return;
                    }
                    return;
                }
                g0.h0.r(view, true);
                ((n.i) gVar.f5198d).f(view, itemIdAtPosition);
            }
        }
    }

    public static n.e p() {
        ThreadLocal threadLocal = N;
        n.e eVar = (n.e) threadLocal.get();
        if (eVar == null) {
            n.e eVar2 = new n.e();
            threadLocal.set(eVar2);
            return eVar2;
        }
        return eVar;
    }

    public static boolean u(z zVar, z zVar2, String str) {
        Object obj = zVar.f9196a.get(str);
        Object obj2 = zVar2.f9196a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public void A(long j4) {
        this.f9180c = j4;
    }

    public void B(com.bumptech.glide.c cVar) {
        this.J = cVar;
    }

    public void C(TimeInterpolator timeInterpolator) {
        this.f9181d = timeInterpolator;
    }

    public void D(w1.o oVar) {
        if (oVar == null) {
            this.K = M;
        } else {
            this.K = oVar;
        }
    }

    public void E() {
    }

    public void F(long j4) {
        this.f9179b = j4;
    }

    public final void G() {
        if (this.E == 0) {
            ArrayList arrayList = this.H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.H.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((r) arrayList2.get(i10)).e(this);
                }
            }
            this.G = false;
        }
        this.E++;
    }

    public String H(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f9180c != -1) {
            StringBuilder a10 = p.j.a(str2, "dur(");
            a10.append(this.f9180c);
            a10.append(") ");
            str2 = a10.toString();
        }
        if (this.f9179b != -1) {
            StringBuilder a11 = p.j.a(str2, "dly(");
            a11.append(this.f9179b);
            a11.append(") ");
            str2 = a11.toString();
        }
        if (this.f9181d != null) {
            StringBuilder a12 = p.j.a(str2, "interp(");
            a12.append(this.f9181d);
            a12.append(") ");
            str2 = a12.toString();
        }
        ArrayList arrayList = this.f9182e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f9183f;
        if (size > 0 || arrayList2.size() > 0) {
            String s9 = a3.g.s(str2, "tgts(");
            if (arrayList.size() > 0) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (i10 > 0) {
                        s9 = a3.g.s(s9, ", ");
                    }
                    s9 = s9 + arrayList.get(i10);
                }
            }
            if (arrayList2.size() > 0) {
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    if (i11 > 0) {
                        s9 = a3.g.s(s9, ", ");
                    }
                    s9 = s9 + arrayList2.get(i11);
                }
            }
            return a3.g.s(s9, ")");
        }
        return str2;
    }

    public void a(r rVar) {
        if (this.H == null) {
            this.H = new ArrayList();
        }
        this.H.add(rVar);
    }

    public void b(View view) {
        this.f9183f.add(view);
    }

    public void d() {
        ArrayList arrayList = this.D;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                ((Animator) arrayList.get(size)).cancel();
            }
        }
        ArrayList arrayList2 = this.H;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) this.H.clone();
            int size2 = arrayList3.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ((r) arrayList3.get(i10)).d();
            }
        }
    }

    public abstract void e(z zVar);

    public final void f(View view, boolean z9) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            z zVar = new z(view);
            if (z9) {
                h(zVar);
            } else {
                e(zVar);
            }
            zVar.f9198c.add(this);
            g(zVar);
            if (z9) {
                c(this.f9184x, view, zVar);
            } else {
                c(this.f9185y, view, zVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), z9);
            }
        }
    }

    public void g(z zVar) {
    }

    public abstract void h(z zVar);

    public final void i(ViewGroup viewGroup, boolean z9) {
        j(z9);
        ArrayList arrayList = this.f9182e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f9183f;
        if (size <= 0 && arrayList2.size() <= 0) {
            f(viewGroup, z9);
            return;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i10)).intValue());
            if (findViewById != null) {
                z zVar = new z(findViewById);
                if (z9) {
                    h(zVar);
                } else {
                    e(zVar);
                }
                zVar.f9198c.add(this);
                g(zVar);
                if (z9) {
                    c(this.f9184x, findViewById, zVar);
                } else {
                    c(this.f9185y, findViewById, zVar);
                }
            }
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            View view = (View) arrayList2.get(i11);
            z zVar2 = new z(view);
            if (z9) {
                h(zVar2);
            } else {
                e(zVar2);
            }
            zVar2.f9198c.add(this);
            g(zVar2);
            if (z9) {
                c(this.f9184x, view, zVar2);
            } else {
                c(this.f9185y, view, zVar2);
            }
        }
    }

    public final void j(boolean z9) {
        if (z9) {
            ((n.e) this.f9184x.f5196b).clear();
            ((SparseArray) this.f9184x.f5197c).clear();
            ((n.i) this.f9184x.f5198d).b();
        } else {
            ((n.e) this.f9185y.f5196b).clear();
            ((SparseArray) this.f9185y.f5197c).clear();
            ((n.i) this.f9185y.f5198d).b();
        }
    }

    @Override // 
    /* renamed from: k */
    public s clone() {
        try {
            s sVar = (s) super.clone();
            sVar.I = new ArrayList();
            sVar.f9184x = new i.g(8);
            sVar.f9185y = new i.g(8);
            sVar.B = null;
            sVar.C = null;
            return sVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, z zVar, z zVar2) {
        return null;
    }

    public void m(ViewGroup viewGroup, i.g gVar, i.g gVar2, ArrayList arrayList, ArrayList arrayList2) {
        boolean z9;
        Animator l10;
        View view;
        Animator animator;
        z zVar;
        Animator animator2;
        z zVar2;
        ViewGroup viewGroup2 = viewGroup;
        n.e p3 = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            z zVar3 = (z) arrayList.get(i10);
            z zVar4 = (z) arrayList2.get(i10);
            if (zVar3 != null && !zVar3.f9198c.contains(this)) {
                zVar3 = null;
            }
            if (zVar4 != null && !zVar4.f9198c.contains(this)) {
                zVar4 = null;
            }
            if (zVar3 != null || zVar4 != null) {
                if (zVar3 != null && zVar4 != null && !s(zVar3, zVar4)) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9 && (l10 = l(viewGroup2, zVar3, zVar4)) != null) {
                    if (zVar4 != null) {
                        String[] q9 = q();
                        view = zVar4.f9197b;
                        if (q9 != null && q9.length > 0) {
                            zVar2 = new z(view);
                            z zVar5 = (z) ((n.e) gVar2.f5196b).getOrDefault(view, null);
                            if (zVar5 != null) {
                                int i11 = 0;
                                while (i11 < q9.length) {
                                    HashMap hashMap = zVar2.f9196a;
                                    Animator animator3 = l10;
                                    String str = q9[i11];
                                    hashMap.put(str, zVar5.f9196a.get(str));
                                    i11++;
                                    l10 = animator3;
                                    q9 = q9;
                                }
                            }
                            Animator animator4 = l10;
                            int i12 = p3.f7891c;
                            int i13 = 0;
                            while (true) {
                                if (i13 < i12) {
                                    q qVar = (q) p3.getOrDefault((Animator) p3.h(i13), null);
                                    if (qVar.f9175c != null && qVar.f9173a == view && qVar.f9174b.equals(this.f9178a) && qVar.f9175c.equals(zVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i13++;
                                } else {
                                    animator2 = animator4;
                                    break;
                                }
                            }
                        } else {
                            animator2 = l10;
                            zVar2 = null;
                        }
                        animator = animator2;
                        zVar = zVar2;
                    } else {
                        view = zVar3.f9197b;
                        animator = l10;
                        zVar = null;
                    }
                    if (animator != null) {
                        String str2 = this.f9178a;
                        e0 e0Var = a0.f9121a;
                        p3.put(animator, new q(view, str2, this, new j0(viewGroup2), zVar));
                        this.I.add(animator);
                    }
                    i10++;
                    viewGroup2 = viewGroup;
                }
            }
            i10++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i14 = 0; i14 < sparseIntArray.size(); i14++) {
                Animator animator5 = (Animator) this.I.get(sparseIntArray.keyAt(i14));
                animator5.setStartDelay(animator5.getStartDelay() + (sparseIntArray.valueAt(i14) - Long.MAX_VALUE));
            }
        }
    }

    public final void n() {
        int i10 = this.E - 1;
        this.E = i10;
        if (i10 == 0) {
            ArrayList arrayList = this.H;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.H.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((r) arrayList2.get(i11)).c(this);
                }
            }
            int i12 = 0;
            while (true) {
                n.i iVar = (n.i) this.f9184x.f5198d;
                if (iVar.f7881a) {
                    iVar.d();
                }
                if (i12 >= iVar.f7884d) {
                    break;
                }
                View view = (View) ((n.i) this.f9184x.f5198d).g(i12);
                if (view != null) {
                    WeakHashMap weakHashMap = y0.f4277a;
                    g0.h0.r(view, false);
                }
                i12++;
            }
            int i13 = 0;
            while (true) {
                n.i iVar2 = (n.i) this.f9185y.f5198d;
                if (iVar2.f7881a) {
                    iVar2.d();
                }
                if (i13 < iVar2.f7884d) {
                    View view2 = (View) ((n.i) this.f9185y.f5198d).g(i13);
                    if (view2 != null) {
                        WeakHashMap weakHashMap2 = y0.f4277a;
                        g0.h0.r(view2, false);
                    }
                    i13++;
                } else {
                    this.G = true;
                    return;
                }
            }
        }
    }

    public final z o(View view, boolean z9) {
        ArrayList arrayList;
        ArrayList arrayList2;
        x xVar = this.f9186z;
        if (xVar != null) {
            return xVar.o(view, z9);
        }
        if (z9) {
            arrayList = this.B;
        } else {
            arrayList = this.C;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                z zVar = (z) arrayList.get(i10);
                if (zVar == null) {
                    return null;
                }
                if (zVar.f9197b == view) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 < 0) {
            return null;
        }
        if (z9) {
            arrayList2 = this.C;
        } else {
            arrayList2 = this.B;
        }
        return (z) arrayList2.get(i10);
    }

    public String[] q() {
        return null;
    }

    public final z r(View view, boolean z9) {
        i.g gVar;
        x xVar = this.f9186z;
        if (xVar != null) {
            return xVar.r(view, z9);
        }
        if (z9) {
            gVar = this.f9184x;
        } else {
            gVar = this.f9185y;
        }
        return (z) ((n.e) gVar.f5196b).getOrDefault(view, null);
    }

    public boolean s(z zVar, z zVar2) {
        if (zVar == null || zVar2 == null) {
            return false;
        }
        String[] q9 = q();
        if (q9 != null) {
            for (String str : q9) {
                if (!u(zVar, zVar2, str)) {
                }
            }
            return false;
        }
        Iterator it = zVar.f9196a.keySet().iterator();
        while (it.hasNext()) {
            if (u(zVar, zVar2, (String) it.next())) {
            }
        }
        return false;
        return true;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f9182e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f9183f;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return H("");
    }

    public void v(View view) {
        if (!this.G) {
            ArrayList arrayList = this.D;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((Animator) arrayList.get(size)).pause();
            }
            ArrayList arrayList2 = this.H;
            if (arrayList2 != null && arrayList2.size() > 0) {
                ArrayList arrayList3 = (ArrayList) this.H.clone();
                int size2 = arrayList3.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((r) arrayList3.get(i10)).a();
                }
            }
            this.F = true;
        }
    }

    public void w(r rVar) {
        ArrayList arrayList = this.H;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(rVar);
        if (this.H.size() == 0) {
            this.H = null;
        }
    }

    public void x(View view) {
        this.f9183f.remove(view);
    }

    public void y(ViewGroup viewGroup) {
        if (this.F) {
            if (!this.G) {
                ArrayList arrayList = this.D;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        ((Animator) arrayList.get(size)).resume();
                    }
                }
                ArrayList arrayList2 = this.H;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    ArrayList arrayList3 = (ArrayList) this.H.clone();
                    int size2 = arrayList3.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((r) arrayList3.get(i10)).b();
                    }
                }
            }
            this.F = false;
        }
    }

    public void z() {
        G();
        n.e p3 = p();
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (p3.containsKey(animator)) {
                G();
                if (animator != null) {
                    animator.addListener(new p(this, p3));
                    long j4 = this.f9180c;
                    if (j4 >= 0) {
                        animator.setDuration(j4);
                    }
                    long j10 = this.f9179b;
                    if (j10 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j10);
                    }
                    TimeInterpolator timeInterpolator = this.f9181d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new androidx.appcompat.widget.d(this, 1));
                    animator.start();
                }
            }
        }
        this.I.clear();
        n();
    }
}
