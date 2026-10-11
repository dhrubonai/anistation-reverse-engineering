package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class gl2 implements ListIterator, j73 {
    public int A;
    public final Object B;
    public final /* synthetic */ byte x;
    public int y;
    public int z;

    public gl2(zt5 zt5Var, int i) {
        this.x = (byte) 3;
        this.B = zt5Var;
        this.y = i - 1;
        this.z = -1;
        this.A = n03.x(zt5Var);
    }

    public void a() {
        if (ai3.d(((zh3) this.B).B) == this.A) {
            return;
        }
        ze0.j();
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        byte b = this.x;
        Object obj2 = this.B;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                zh3 zh3Var = (zh3) obj2;
                int i = this.y;
                this.y = i + 1;
                zh3Var.add(i, obj);
                this.z = -1;
                this.A = zh3.d(zh3Var);
                return;
            case 2:
                b();
                ai3 ai3Var = (ai3) obj2;
                int i2 = this.y;
                this.y = i2 + 1;
                ai3Var.add(i2, obj);
                this.z = -1;
                this.A = ai3.d(ai3Var);
                return;
            default:
                c();
                zt5 zt5Var = (zt5) obj2;
                zt5Var.add(this.y + 1, obj);
                this.z = -1;
                this.y++;
                this.A = n03.x(zt5Var);
                return;
        }
    }

    public void b() {
        if (ai3.d((ai3) this.B) == this.A) {
            return;
        }
        ze0.j();
    }

    public void c() {
        if (n03.x((zt5) this.B) == this.A) {
            return;
        }
        ze0.j();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.x;
        Object obj = this.B;
        switch (b) {
            case 0:
                if (this.y >= this.A) {
                    return false;
                }
                return true;
            case 1:
                if (this.y >= ((zh3) obj).z) {
                    return false;
                }
                return true;
            case 2:
                if (this.y >= ((ai3) obj).y) {
                    return false;
                }
                return true;
            default:
                if (this.y >= ((zt5) obj).size() - 1) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.x) {
            case 0:
                if (this.y > this.z) {
                    return true;
                }
                return false;
            case 1:
                if (this.y > 0) {
                    return true;
                }
                return false;
            case 2:
                if (this.y > 0) {
                    return true;
                }
                return false;
            default:
                if (this.y >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.x;
        Object obj = this.B;
        switch (b) {
            case 0:
                f44 f44Var = ((il2) obj).x;
                int i = this.y;
                this.y = i + 1;
                Object g = f44Var.g(i);
                g.getClass();
                return (xz3) g;
            case 1:
                a();
                int i2 = this.y;
                zh3 zh3Var = (zh3) obj;
                if (i2 < zh3Var.z) {
                    this.y = i2 + 1;
                    this.z = i2;
                    return zh3Var.x[zh3Var.y + i2];
                }
                qi2.e();
                return null;
            case 2:
                b();
                int i3 = this.y;
                ai3 ai3Var = (ai3) obj;
                if (i3 < ai3Var.y) {
                    this.y = i3 + 1;
                    this.z = i3;
                    return ai3Var.x[i3];
                }
                qi2.e();
                return null;
            default:
                c();
                int i4 = this.y + 1;
                this.z = i4;
                zt5 zt5Var = (zt5) obj;
                n03.K(i4, zt5Var.size());
                Object obj2 = zt5Var.get(i4);
                this.y = i4;
                return obj2;
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.x) {
            case 0:
                return this.y - this.z;
            case 1:
                return this.y;
            case 2:
                return this.y;
            default:
                return this.y + 1;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.x;
        Object obj = this.B;
        switch (b) {
            case 0:
                f44 f44Var = ((il2) obj).x;
                int i = this.y - 1;
                this.y = i;
                Object g = f44Var.g(i);
                g.getClass();
                return (xz3) g;
            case 1:
                a();
                int i2 = this.y;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    this.y = i3;
                    this.z = i3;
                    zh3 zh3Var = (zh3) obj;
                    return zh3Var.x[zh3Var.y + i3];
                }
                qi2.e();
                return null;
            case 2:
                b();
                int i4 = this.y;
                if (i4 > 0) {
                    int i5 = i4 - 1;
                    this.y = i5;
                    this.z = i5;
                    return ((ai3) obj).x[i5];
                }
                qi2.e();
                return null;
            default:
                c();
                zt5 zt5Var = (zt5) obj;
                n03.K(this.y, zt5Var.size());
                int i6 = this.y;
                this.z = i6;
                this.y--;
                return zt5Var.get(i6);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int i;
        switch (this.x) {
            case 0:
                return (this.y - this.z) - 1;
            case 1:
                i = this.y;
                break;
            case 2:
                i = this.y;
                break;
            default:
                return this.y;
        }
        return i - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        byte b = this.x;
        Object obj = this.B;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                zh3 zh3Var = (zh3) obj;
                a();
                int i = this.z;
                if (i != -1) {
                    zh3Var.c(i);
                    this.y = this.z;
                    this.z = -1;
                    this.A = zh3.d(zh3Var);
                    return;
                }
                ze0.m("Call next() or previous() before removing element from the iterator.");
                return;
            case 2:
                ai3 ai3Var = (ai3) obj;
                b();
                int i2 = this.z;
                if (i2 != -1) {
                    ai3Var.c(i2);
                    this.y = this.z;
                    this.z = -1;
                    this.A = ai3.d(ai3Var);
                    return;
                }
                ze0.m("Call next() or previous() before removing element from the iterator.");
                return;
            default:
                c();
                zt5 zt5Var = (zt5) obj;
                zt5Var.remove(this.z);
                this.y--;
                this.z = -1;
                this.A = n03.x(zt5Var);
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        byte b = this.x;
        Object obj2 = this.B;
        switch (b) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                a();
                int i = this.z;
                if (i != -1) {
                    ((zh3) obj2).set(i, obj);
                    return;
                } else {
                    ze0.m("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            case 2:
                b();
                int i2 = this.z;
                if (i2 != -1) {
                    ((ai3) obj2).set(i2, obj);
                    return;
                } else {
                    ze0.m("Call next() or previous() before replacing element from the iterator.");
                    return;
                }
            default:
                zt5 zt5Var = (zt5) obj2;
                c();
                int i3 = this.z;
                if (i3 >= 0) {
                    zt5Var.set(i3, obj);
                    this.A = n03.x(zt5Var);
                    return;
                } else {
                    ze0.m("Cannot call set before the first call to next() or previous() or immediately after a call to add() or remove()");
                    return;
                }
        }
    }

    public gl2(ai3 ai3Var, int i) {
        this.x = (byte) 2;
        this.B = ai3Var;
        this.y = i;
        this.z = -1;
        this.A = ai3.d(ai3Var);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gl2(il2 il2Var, int i, int i2) {
        this(il2Var, (i2 & 1) != 0 ? 0 : i, 0, il2Var.x.b);
        this.x = (byte) 0;
    }

    public gl2(il2 il2Var, int i, int i2, int i3) {
        this.x = (byte) 0;
        this.B = il2Var;
        this.y = i;
        this.z = i2;
        this.A = i3;
    }

    public gl2(zh3 zh3Var, int i) {
        this.x = (byte) 1;
        this.B = zh3Var;
        this.y = i;
        this.z = -1;
        this.A = zh3.d(zh3Var);
    }
}
