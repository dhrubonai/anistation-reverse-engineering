package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r55 implements ListIterator, j73 {
    public final /* synthetic */ byte x = 1;
    public final Object y;
    public final /* synthetic */ Object z;

    public r55(bo3 bo3Var, int i) {
        this.z = bo3Var;
        this.y = ((List) bo3Var.y).listIterator(yo0.x0(i, bo3Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.x) {
            case 0:
                ListIterator listIterator = (ListIterator) this.y;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return ((ListIterator) obj).hasPrevious();
            case 1:
                return ((ListIterator) obj).hasPrevious();
            default:
                if (((u05) obj).x < ((r06) this.z).A - 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return ((ListIterator) obj).hasNext();
            case 1:
                return ((ListIterator) obj).hasNext();
            default:
                if (((u05) obj).x >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return ((ListIterator) obj).previous();
            case 1:
                return ((ListIterator) obj).previous();
            default:
                u05 u05Var = (u05) obj;
                int i = u05Var.x + 1;
                r06 r06Var = (r06) this.z;
                n03.K(i, r06Var.A);
                u05Var.x = i;
                return r06Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        int previousIndex;
        int size;
        byte b = this.x;
        Object obj = this.z;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                previousIndex = ((ListIterator) obj2).previousIndex();
                size = ((s55) obj).size();
                break;
            case 1:
                previousIndex = ((ListIterator) obj2).previousIndex();
                size = ((bo3) obj).size();
                break;
            default:
                return ((u05) obj2).x + 1;
        }
        return (size - 1) - previousIndex;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return ((ListIterator) obj).next();
            case 1:
                return ((ListIterator) obj).next();
            default:
                u05 u05Var = (u05) obj;
                int i = u05Var.x;
                r06 r06Var = (r06) this.z;
                n03.K(i, r06Var.A);
                u05Var.x = i - 1;
                return r06Var.get(i);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int nextIndex;
        int size;
        byte b = this.x;
        Object obj = this.z;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                nextIndex = ((ListIterator) obj2).nextIndex();
                size = ((s55) obj).size();
                break;
            case 1:
                nextIndex = ((ListIterator) obj2).nextIndex();
                size = ((bo3) obj).size();
                break;
            default:
                return ((u05) obj2).x;
        }
        return (size - 1) - nextIndex;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.x) {
            case 0:
                ((ListIterator) this.y).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.x) {
            case 0:
                ((ListIterator) this.y).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public r55(s55 s55Var, int i) {
        this.z = s55Var;
        this.y = s55Var.x.listIterator(yo0.x0(i, s55Var));
    }

    public r55(u05 u05Var, r06 r06Var) {
        this.y = u05Var;
        this.z = r06Var;
    }
}
