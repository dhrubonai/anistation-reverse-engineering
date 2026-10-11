package q3;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.i1;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class n extends i1 {
    @Override // androidx.fragment.app.i1
    public final void a(View view, Object obj) {
        ((s) obj).b(view);
    }

    @Override // androidx.fragment.app.i1
    public final void b(Object obj, ArrayList arrayList) {
        boolean z9;
        s sVar;
        s sVar2 = (s) obj;
        if (sVar2 == null) {
            return;
        }
        int i10 = 0;
        if (sVar2 instanceof x) {
            x xVar = (x) sVar2;
            int size = xVar.O.size();
            while (i10 < size) {
                if (i10 >= 0 && i10 < xVar.O.size()) {
                    sVar = (s) xVar.O.get(i10);
                } else {
                    sVar = null;
                }
                b(sVar, arrayList);
                i10++;
            }
            return;
        }
        if (i1.h(sVar2.f9182e) && i1.h(null) && i1.h(null)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9 && i1.h(sVar2.f9183f)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                sVar2.b((View) arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.i1
    public final void c(ViewGroup viewGroup, Object obj) {
        v.a(viewGroup, (s) obj);
    }

    @Override // androidx.fragment.app.i1
    public final boolean e(Object obj) {
        return obj instanceof s;
    }

    @Override // androidx.fragment.app.i1
    public final Object f(Object obj) {
        if (obj != null) {
            return ((s) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.i1
    public final Object i(Object obj, Object obj2, Object obj3) {
        s sVar = (s) obj;
        s sVar2 = (s) obj2;
        s sVar3 = (s) obj3;
        if (sVar != null && sVar2 != null) {
            x xVar = new x();
            xVar.I(sVar);
            xVar.I(sVar2);
            xVar.P = false;
            sVar = xVar;
        } else if (sVar == null) {
            if (sVar2 != null) {
                sVar = sVar2;
            } else {
                sVar = null;
            }
        }
        if (sVar3 != null) {
            x xVar2 = new x();
            if (sVar != null) {
                xVar2.I(sVar);
            }
            xVar2.I(sVar3);
            return xVar2;
        }
        return sVar;
    }

    @Override // androidx.fragment.app.i1
    public final Object j(Object obj, Object obj2) {
        x xVar = new x();
        if (obj != null) {
            xVar.I((s) obj);
        }
        xVar.I((s) obj2);
        return xVar;
    }

    @Override // androidx.fragment.app.i1
    public final void k(Object obj, View view, ArrayList arrayList) {
        ((s) obj).a(new k(view, arrayList));
    }

    @Override // androidx.fragment.app.i1
    public final void l(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((s) obj).a(new l(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // androidx.fragment.app.i1
    public final void m(View view, Object obj) {
        if (view != null) {
            i1.g(view, new Rect());
            ((s) obj).B(new j());
        }
    }

    @Override // androidx.fragment.app.i1
    public final void n(Object obj, Rect rect) {
        ((s) obj).B(new j());
    }

    @Override // androidx.fragment.app.i1
    public final void o(Object obj, c0.d dVar, d0.a aVar) {
        s sVar = (s) obj;
        dVar.a(new androidx.appcompat.widget.a0(this, sVar, 22));
        sVar.a(new m(aVar));
    }

    @Override // androidx.fragment.app.i1
    public final void p(Object obj, View view, ArrayList arrayList) {
        x xVar = (x) obj;
        ArrayList arrayList2 = xVar.f9183f;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i1.d((View) arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(xVar, arrayList);
    }

    @Override // androidx.fragment.app.i1
    public final void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        x xVar = (x) obj;
        if (xVar != null) {
            ArrayList arrayList3 = xVar.f9183f;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            s(xVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.i1
    public final Object r(Object obj) {
        if (obj == null) {
            return null;
        }
        x xVar = new x();
        xVar.I((s) obj);
        return xVar;
    }

    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        boolean z9;
        int size;
        s sVar;
        s sVar2 = (s) obj;
        int i10 = 0;
        if (sVar2 instanceof x) {
            x xVar = (x) sVar2;
            int size2 = xVar.O.size();
            while (i10 < size2) {
                if (i10 >= 0 && i10 < xVar.O.size()) {
                    sVar = (s) xVar.O.get(i10);
                } else {
                    sVar = null;
                }
                s(sVar, arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (i1.h(sVar2.f9182e) && i1.h(null) && i1.h(null)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            ArrayList arrayList3 = sVar2.f9183f;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i10 < size) {
                    sVar2.b((View) arrayList2.get(i10));
                    i10++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        sVar2.x((View) arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
