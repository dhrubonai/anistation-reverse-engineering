package t7;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p7.p0;
import p7.q0;
import r6.h0;

/* loaded from: classes.dex */
public class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10049b = AtomicIntegerFieldUpdater.newUpdater(a0.class, "_size");
    private volatile int _size;

    /* renamed from: a, reason: collision with root package name */
    public p0[] f10050a;

    public final void a(p0 p0Var) {
        p0Var.e((q0) this);
        p0[] p0VarArr = this.f10050a;
        if (p0VarArr == null) {
            p0VarArr = new p0[4];
            this.f10050a = p0VarArr;
        } else if (b() >= p0VarArr.length) {
            Object[] copyOf = Arrays.copyOf(p0VarArr, b() * 2);
            h0.s(copyOf, "copyOf(this, newSize)");
            p0VarArr = (p0[]) copyOf;
            this.f10050a = p0VarArr;
        }
        int b10 = b();
        f10049b.set(this, b10 + 1);
        p0VarArr[b10] = p0Var;
        p0Var.f8729b = b10;
        f(b10);
    }

    public final int b() {
        return f10049b.get(this);
    }

    public final p0 c() {
        p0 p0Var;
        synchronized (this) {
            p0[] p0VarArr = this.f10050a;
            if (p0VarArr != null) {
                p0Var = p0VarArr[0];
            } else {
                p0Var = null;
            }
        }
        return p0Var;
    }

    public final void d(p0 p0Var) {
        synchronized (this) {
            if (p0Var.a() != null) {
                e(p0Var.f8729b);
            }
        }
    }

    public final p0 e(int i10) {
        Object[] objArr = this.f10050a;
        h0.q(objArr);
        f10049b.set(this, b() - 1);
        if (i10 < b()) {
            g(i10, b());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                p0 p0Var = objArr[i10];
                h0.q(p0Var);
                Object obj = objArr[i11];
                h0.q(obj);
                if (p0Var.compareTo(obj) < 0) {
                    g(i10, i11);
                    f(i11);
                }
            }
            while (true) {
                int i12 = (i10 * 2) + 1;
                if (i12 >= b()) {
                    break;
                }
                Object[] objArr2 = this.f10050a;
                h0.q(objArr2);
                int i13 = i12 + 1;
                if (i13 < b()) {
                    Comparable comparable = objArr2[i13];
                    h0.q(comparable);
                    Object obj2 = objArr2[i12];
                    h0.q(obj2);
                    if (comparable.compareTo(obj2) < 0) {
                        i12 = i13;
                    }
                }
                Comparable comparable2 = objArr2[i10];
                h0.q(comparable2);
                Comparable comparable3 = objArr2[i12];
                h0.q(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                g(i10, i12);
                i10 = i12;
            }
        }
        p0 p0Var2 = objArr[b()];
        h0.q(p0Var2);
        p0Var2.e(null);
        p0Var2.f8729b = -1;
        objArr[b()] = null;
        return p0Var2;
    }

    public final void f(int i10) {
        while (i10 > 0) {
            p0[] p0VarArr = this.f10050a;
            h0.q(p0VarArr);
            int i11 = (i10 - 1) / 2;
            p0 p0Var = p0VarArr[i11];
            h0.q(p0Var);
            p0 p0Var2 = p0VarArr[i10];
            h0.q(p0Var2);
            if (p0Var.compareTo(p0Var2) <= 0) {
                return;
            }
            g(i10, i11);
            i10 = i11;
        }
    }

    public final void g(int i10, int i11) {
        p0[] p0VarArr = this.f10050a;
        h0.q(p0VarArr);
        p0 p0Var = p0VarArr[i11];
        h0.q(p0Var);
        p0 p0Var2 = p0VarArr[i10];
        h0.q(p0Var2);
        p0VarArr[i10] = p0Var;
        p0VarArr[i11] = p0Var2;
        p0Var.f8729b = i10;
        p0Var2.f8729b = i11;
    }
}
