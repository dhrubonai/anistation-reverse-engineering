package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zt5 implements Parcelable, xx5, List, RandomAccess, l73 {
    public static final Parcelable.Creator<zt5> CREATOR = new Object();
    public vx5 x;

    public zt5(n2 n2Var) {
        ft5 h = mt5.h();
        vx5 vx5Var = new vx5(h.g(), n2Var);
        if (!(h instanceof jh2)) {
            vx5Var.b = new vx5(1L, n2Var);
        }
        this.x = vx5Var;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        n2 n2Var;
        ft5 h;
        boolean j;
        do {
            synchronized (n03.u) {
                vx5 vx5Var = this.x;
                vx5Var.getClass();
                vx5 vx5Var2 = (vx5) mt5.f(vx5Var);
                i = vx5Var2.d;
                n2Var = vx5Var2.c;
            }
            n2Var.getClass();
            n2 d = n2Var.d(obj);
            if (d.equals(n2Var)) {
                return false;
            }
            vx5 vx5Var3 = this.x;
            vx5Var3.getClass();
            synchronized (mt5.c) {
                h = mt5.h();
                j = n03.j((vx5) mt5.w(vx5Var3, this, h), i, d, true);
            }
            mt5.l(h, this);
        } while (!j);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        n2 n2Var;
        ft5 h;
        boolean j;
        do {
            synchronized (n03.u) {
                vx5 vx5Var = this.x;
                vx5Var.getClass();
                vx5 vx5Var2 = (vx5) mt5.f(vx5Var);
                i = vx5Var2.d;
                n2Var = vx5Var2.c;
            }
            n2Var.getClass();
            n2 f = n2Var.f(collection);
            if (a34.i(f, n2Var)) {
                return false;
            }
            vx5 vx5Var3 = this.x;
            vx5Var3.getClass();
            synchronized (mt5.c) {
                h = mt5.h();
                j = n03.j((vx5) mt5.w(vx5Var3, this, h), i, f, true);
            }
            mt5.l(h, this);
        } while (!j);
        return true;
    }

    @Override // defpackage.xx5
    public final zx5 b() {
        return this.x;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        ft5 h;
        vx5 vx5Var = this.x;
        vx5Var.getClass();
        synchronized (mt5.c) {
            h = mt5.h();
            vx5 vx5Var2 = (vx5) mt5.w(vx5Var, this, h);
            synchronized (n03.u) {
                vx5Var2.c = es5.y;
                vx5Var2.d++;
                vx5Var2.e++;
            }
        }
        mt5.l(h, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return n03.v(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return n03.v(this).c.containsAll(collection);
    }

    public final void d(int i, int i2) {
        int i3;
        n2 n2Var;
        ft5 h;
        boolean j;
        do {
            synchronized (n03.u) {
                vx5 vx5Var = this.x;
                vx5Var.getClass();
                vx5 vx5Var2 = (vx5) mt5.f(vx5Var);
                i3 = vx5Var2.d;
                n2Var = vx5Var2.c;
            }
            n2Var.getClass();
            ml4 g = n2Var.g();
            g.subList(i, i2).clear();
            n2 d = g.d();
            if (!a34.i(d, n2Var)) {
                vx5 vx5Var3 = this.x;
                vx5Var3.getClass();
                synchronized (mt5.c) {
                    h = mt5.h();
                    j = n03.j((vx5) mt5.w(vx5Var3, this, h), i3, d, true);
                }
                mt5.l(h, this);
            } else {
                return;
            }
        } while (!j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.xx5
    public final void f(zx5 zx5Var) {
        zx5Var.b = this.x;
        this.x = (vx5) zx5Var;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return n03.v(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return n03.v(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return n03.v(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return n03.v(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new gl2(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        n2 n2Var;
        n2 n2Var2;
        ft5 h;
        boolean j;
        do {
            synchronized (n03.u) {
                vx5 vx5Var = this.x;
                vx5Var.getClass();
                vx5 vx5Var2 = (vx5) mt5.f(vx5Var);
                i = vx5Var2.d;
                n2Var = vx5Var2.c;
            }
            n2Var.getClass();
            int indexOf = n2Var.indexOf(obj);
            if (indexOf != -1) {
                n2Var2 = n2Var.i(indexOf);
            } else {
                n2Var2 = n2Var;
            }
            if (n2Var2.equals(n2Var)) {
                return false;
            }
            vx5 vx5Var3 = this.x;
            vx5Var3.getClass();
            synchronized (mt5.c) {
                h = mt5.h();
                j = n03.j((vx5) mt5.w(vx5Var3, this, h), i, n2Var2, true);
            }
            mt5.l(h, this);
        } while (!j);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        n2 n2Var;
        ft5 h;
        boolean j;
        do {
            synchronized (n03.u) {
                vx5 vx5Var = this.x;
                vx5Var.getClass();
                vx5 vx5Var2 = (vx5) mt5.f(vx5Var);
                i = vx5Var2.d;
                n2Var = vx5Var2.c;
            }
            n2Var.getClass();
            n2 h2 = n2Var.h(new m2(collection, (byte) 0));
            if (a34.i(h2, n2Var)) {
                return false;
            }
            vx5 vx5Var3 = this.x;
            vx5Var3.getClass();
            synchronized (mt5.c) {
                h = mt5.h();
                j = n03.j((vx5) mt5.w(vx5Var3, this, h), i, h2, true);
            }
            mt5.l(h, this);
        } while (!j);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return n03.A(this, new m2(collection, (byte) 2));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        n2 n2Var;
        ft5 h;
        boolean j;
        Object obj2 = get(i);
        do {
            synchronized (n03.u) {
                vx5 vx5Var = this.x;
                vx5Var.getClass();
                vx5 vx5Var2 = (vx5) mt5.f(vx5Var);
                i2 = vx5Var2.d;
                n2Var = vx5Var2.c;
            }
            n2Var.getClass();
            n2 j2 = n2Var.j(i, obj);
            if (j2.equals(n2Var)) {
                break;
            }
            vx5 vx5Var3 = this.x;
            vx5Var3.getClass();
            synchronized (mt5.c) {
                h = mt5.h();
                j = n03.j((vx5) mt5.w(vx5Var3, this, h), i2, j2, false);
            }
            mt5.l(h, this);
        } while (!j);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return n03.v(this).c.b();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        boolean z;
        if (i >= 0 && i <= i2 && i2 <= size()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            ds4.a("fromIndex or toIndex are out of bounds");
        }
        return new r06(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return v94.M(this);
    }

    public final String toString() {
        vx5 vx5Var = this.x;
        vx5Var.getClass();
        return "SnapshotStateList(value=" + ((vx5) mt5.f(vx5Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        n2 n2Var = n03.v(this).c;
        int b = n2Var.b();
        parcel.writeInt(b);
        for (int i2 = 0; i2 < b; i2++) {
            parcel.writeValue(n2Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return v94.N(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new gl2(this, i);
    }

    public zt5() {
        this(es5.y);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        n2 n2Var;
        ft5 h;
        boolean j;
        do {
            synchronized (n03.u) {
                vx5 vx5Var = this.x;
                vx5Var.getClass();
                vx5 vx5Var2 = (vx5) mt5.f(vx5Var);
                i2 = vx5Var2.d;
                n2Var = vx5Var2.c;
            }
            n2Var.getClass();
            n2 c = n2Var.c(i, obj);
            if (c.equals(n2Var)) {
                return;
            }
            vx5 vx5Var3 = this.x;
            vx5Var3.getClass();
            synchronized (mt5.c) {
                h = mt5.h();
                j = n03.j((vx5) mt5.w(vx5Var3, this, h), i2, c, true);
            }
            mt5.l(h, this);
        } while (!j);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return n03.A(this, new xm(i, (Object) collection, (byte) 3));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        n2 n2Var;
        ft5 h;
        boolean j;
        Object obj = get(i);
        do {
            synchronized (n03.u) {
                vx5 vx5Var = this.x;
                vx5Var.getClass();
                vx5 vx5Var2 = (vx5) mt5.f(vx5Var);
                i2 = vx5Var2.d;
                n2Var = vx5Var2.c;
            }
            n2Var.getClass();
            n2 i3 = n2Var.i(i);
            if (i3.equals(n2Var)) {
                break;
            }
            vx5 vx5Var3 = this.x;
            vx5Var3.getClass();
            synchronized (mt5.c) {
                h = mt5.h();
                j = n03.j((vx5) mt5.w(vx5Var3, this, h), i2, i3, true);
            }
            mt5.l(h, this);
        } while (!j);
        return obj;
    }
}
