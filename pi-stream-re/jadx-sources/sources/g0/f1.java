package g0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class f1 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4208a;

    /* renamed from: b, reason: collision with root package name */
    public int f4209b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4210c;

    public /* synthetic */ f1(Object obj, int i10) {
        this.f4208a = i10;
        this.f4210c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f4208a;
        Object obj = this.f4210c;
        switch (i10) {
            case 0:
                if (this.f4209b < ((ViewGroup) obj).getChildCount()) {
                    return true;
                }
                return false;
            case 1:
                if (this.f4209b < ((x6.e) obj).b()) {
                    return true;
                }
                return false;
            case 2:
                if (this.f4209b < ((Object[]) obj).length) {
                    return true;
                }
                return false;
        }
        while (this.f4209b > 0) {
            Iterator it = (Iterator) obj;
            if (it.hasNext()) {
                it.next();
                this.f4209b--;
            } else {
                return ((Iterator) obj).hasNext();
            }
        }
        return ((Iterator) obj).hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f4208a;
        Object obj = this.f4210c;
        switch (i10) {
            case 0:
                int i11 = this.f4209b;
                this.f4209b = i11 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i11);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                if (hasNext()) {
                    int i12 = this.f4209b;
                    this.f4209b = i12 + 1;
                    return ((x6.e) obj).get(i12);
                }
                throw new NoSuchElementException();
            case 2:
                try {
                    int i13 = this.f4209b;
                    this.f4209b = i13 + 1;
                    return ((Object[]) obj)[i13];
                } catch (ArrayIndexOutOfBoundsException e10) {
                    this.f4209b--;
                    throw new NoSuchElementException(e10.getMessage());
                }
        }
        while (this.f4209b > 0) {
            Iterator it = (Iterator) obj;
            if (it.hasNext()) {
                it.next();
                this.f4209b--;
            } else {
                return ((Iterator) obj).next();
            }
        }
        return ((Iterator) obj).next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f4208a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f4210c;
                int i10 = this.f4209b - 1;
                this.f4209b = i10;
                viewGroup.removeViewAt(i10);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f1(Object[] objArr) {
        this.f4208a = 2;
        r6.h0.u(objArr, "array");
        this.f4210c = objArr;
    }

    public f1(n7.b bVar) {
        this.f4208a = 3;
        this.f4210c = bVar.f8012a.iterator();
        this.f4209b = bVar.f8013b;
    }
}
