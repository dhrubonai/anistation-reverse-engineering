package r6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i0 extends q6.g {

    /* renamed from: c, reason: collision with root package name */
    public Object[] f9478c;

    /* renamed from: d, reason: collision with root package name */
    public int f9479d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9480e;

    public i0() {
        super((Object) null);
        h0.p(4, "initialCapacity");
        this.f9478c = new Object[4];
        this.f9479d = 0;
    }

    public void A0(o0 o0Var) {
        z0(o0Var);
    }

    public final void B0(int i10) {
        Object[] objArr = this.f9478c;
        if (objArr.length < i10) {
            this.f9478c = Arrays.copyOf(objArr, q6.g.y(objArr.length, i10));
            this.f9480e = false;
        } else if (this.f9480e) {
            this.f9478c = (Object[]) objArr.clone();
            this.f9480e = false;
        }
    }

    public final void x0(Object obj) {
        obj.getClass();
        B0(this.f9479d + 1);
        Object[] objArr = this.f9478c;
        int i10 = this.f9479d;
        this.f9479d = i10 + 1;
        objArr[i10] = obj;
    }

    public void y0(Object obj) {
        x0(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i0 z0(List list) {
        if (list instanceof Collection) {
            B0(list.size() + this.f9479d);
            if (list instanceof j0) {
                this.f9479d = ((j0) list).c(this.f9479d, this.f9478c);
                return this;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this;
    }
}
