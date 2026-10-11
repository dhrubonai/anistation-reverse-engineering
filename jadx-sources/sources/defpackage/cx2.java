package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class cx2 extends zw2 implements NavigableSet, Iterable {
    public static final /* synthetic */ int C = 0;
    public final transient Comparator A;
    public transient cx2 B;

    public cx2(Comparator comparator) {
        this.A = comparator;
    }

    public static w15 r(Comparator comparator) {
        if (w64.y != comparator) {
            z62 z62Var = nw2.y;
            return new w15(o15.B, comparator);
        }
        return w15.E;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return this.A;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        cx2 cx2Var = this.B;
        if (cx2Var == null) {
            w15 w15Var = (w15) this;
            Comparator reverseOrder = Collections.reverseOrder(w15Var.A);
            if (w15Var.isEmpty()) {
                cx2Var = r(reverseOrder);
            } else {
                cx2Var = new w15(w15Var.D.v(), reverseOrder);
            }
            this.B = cx2Var;
            cx2Var.B = this;
        }
        return cx2Var;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        obj.getClass();
        w15 w15Var = (w15) this;
        return w15Var.t(0, w15Var.u(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final w15 subSet(Object obj, boolean z, Object obj2, boolean z2) {
        boolean z3;
        obj.getClass();
        obj2.getClass();
        if (this.A.compare(obj, obj2) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        io3.n(z3);
        w15 w15Var = (w15) this;
        w15 t = w15Var.t(w15Var.v(obj, z), w15Var.D.size());
        return t.t(0, t.u(obj2, z2));
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        obj.getClass();
        w15 w15Var = (w15) this;
        return w15Var.t(w15Var.v(obj, true), w15Var.D.size());
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        obj.getClass();
        w15 w15Var = (w15) this;
        return w15Var.t(0, w15Var.u(obj, false));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        obj.getClass();
        w15 w15Var = (w15) this;
        return w15Var.t(w15Var.v(obj, z), w15Var.D.size());
    }
}
