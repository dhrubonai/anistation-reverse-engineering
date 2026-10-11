package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class k43 extends jk3 implements ei1, ox2 {
    public t43 A;

    @Override // defpackage.ox2
    public final ha4 a() {
        return null;
    }

    @Override // defpackage.ei1
    public final void dispose() {
        k43 k43Var;
        Unsafe unsafe;
        long j;
        t43 i = i();
        while (true) {
            Object K = i.K();
            if (K instanceof k43) {
                if (K != this) {
                    return;
                }
                do {
                    unsafe = qs.a;
                    j = t43.y;
                    if (unsafe.compareAndSwapObject(i, j, K, u43.g)) {
                        return;
                    }
                } while (unsafe.getObjectVolatile(i, j) == K);
            } else {
                if (!(K instanceof ox2) || ((ox2) K).a() == null) {
                    return;
                }
                while (true) {
                    Object e = this.e();
                    if (!(e instanceof t25)) {
                        if (e == this) {
                            return;
                        }
                        e.getClass();
                        jk3 jk3Var = (jk3) e;
                        Unsafe unsafe2 = qs.a;
                        long j2 = jk3.z;
                        t25 t25Var = (t25) unsafe2.getObjectVolatile(jk3Var, j2);
                        if (t25Var == null) {
                            t25Var = new t25(jk3Var);
                            unsafe2.putObjectVolatile(jk3Var, j2, t25Var);
                        }
                        t25 t25Var2 = t25Var;
                        while (true) {
                            Unsafe unsafe3 = qs.a;
                            long j3 = jk3.x;
                            k43Var = this;
                            if (unsafe3.compareAndSwapObject(k43Var, j3, e, t25Var2)) {
                                jk3Var.c();
                                return;
                            } else if (unsafe3.getObjectVolatile(k43Var, j3) != e) {
                                break;
                            } else {
                                this = k43Var;
                            }
                        }
                    } else {
                        return;
                    }
                    this = k43Var;
                }
            }
        }
    }

    public final t43 i() {
        t43 t43Var = this.A;
        if (t43Var != null) {
            return t43Var;
        }
        a34.s0("job");
        throw null;
    }

    @Override // defpackage.ox2
    public final boolean isActive() {
        return true;
    }

    public boolean j() {
        return true;
    }

    public abstract void k(Throwable th);

    @Override // defpackage.jk3
    public final String toString() {
        return getClass().getSimpleName() + '@' + z51.t(this) + "[job@" + z51.t(i()) + ']';
    }
}
