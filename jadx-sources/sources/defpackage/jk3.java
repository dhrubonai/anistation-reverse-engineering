package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class jk3 {
    public static final /* synthetic */ long x;
    public static final /* synthetic */ long y;
    public static final /* synthetic */ long z;
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    static {
        Unsafe unsafe = qs.a;
        x = unsafe.objectFieldOffset(jk3.class.getDeclaredField("_next$volatile"));
        y = unsafe.objectFieldOffset(jk3.class.getDeclaredField("_prev$volatile"));
        z = unsafe.objectFieldOffset(jk3.class.getDeclaredField("_removedRef$volatile"));
    }

    public final boolean b(jk3 jk3Var, int i) {
        jk3 jk3Var2;
        jk3 jk3Var3;
        while (true) {
            jk3 g = this.g();
            if (g instanceof ci3) {
                if ((((ci3) g).A & i) == 0 && g.b(jk3Var, i)) {
                    return true;
                }
                return false;
            }
            Unsafe unsafe = qs.a;
            unsafe.putObjectVolatile(jk3Var, y, g);
            long j = x;
            unsafe.putObjectVolatile(jk3Var, j, this);
            while (true) {
                Unsafe unsafe2 = qs.a;
                jk3Var2 = this;
                jk3Var3 = jk3Var;
                if (unsafe2.compareAndSwapObject(g, x, jk3Var2, jk3Var3)) {
                    jk3Var3.d(jk3Var2);
                    return true;
                }
                if (unsafe2.getObjectVolatile(g, j) != jk3Var2) {
                    break;
                }
                this = jk3Var2;
                jk3Var = jk3Var3;
            }
            this = jk3Var2;
            jk3Var = jk3Var3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x002a, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.jk3 c() {
        /*
            r15 = this;
        L0:
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r1 = defpackage.jk3.y
            java.lang.Object r0 = r0.getObjectVolatile(r15, r1)
            r7 = r0
            jk3 r7 = (defpackage.jk3) r7
            r0 = 0
            r9 = r0
            r8 = r7
        Le:
            if (r8 == 0) goto L7b
            sun.misc.Unsafe r3 = defpackage.qs.a
            long r4 = defpackage.jk3.x
            java.lang.Object r6 = r3.getObjectVolatile(r8, r4)
            if (r6 != r15) goto L36
            if (r7 != r8) goto L1d
            goto L2a
        L1d:
            sun.misc.Unsafe r3 = defpackage.qs.a
            long r5 = defpackage.jk3.y
            r4 = r15
            boolean r15 = r3.compareAndSwapObject(r4, r5, r7, r8)
            r14 = r7
            r7 = r4
            if (r15 == 0) goto L2b
        L2a:
            return r8
        L2b:
            java.lang.Object r15 = r3.getObjectVolatile(r7, r1)
            if (r15 == r14) goto L33
        L31:
            r15 = r7
            goto L0
        L33:
            r15 = r7
            r7 = r14
            goto L1d
        L36:
            r14 = r7
            r7 = r15
            boolean r15 = r7.h()
            if (r15 == 0) goto L3f
            return r0
        L3f:
            boolean r15 = r6 instanceof defpackage.t25
            if (r15 == 0) goto L72
            if (r9 == 0) goto L62
            t25 r6 = (defpackage.t25) r6
            jk3 r13 = r6.a
        L49:
            r12 = r8
            sun.misc.Unsafe r8 = defpackage.qs.a
            long r10 = defpackage.jk3.x
            boolean r15 = r8.compareAndSwapObject(r9, r10, r12, r13)
            r3 = r8
            r8 = r12
            if (r15 == 0) goto L5b
            r15 = r7
            r8 = r9
            r7 = r14
            r9 = r0
            goto Le
        L5b:
            java.lang.Object r15 = r3.getObjectVolatile(r9, r4)
            if (r15 == r8) goto L49
            goto L31
        L62:
            if (r8 == 0) goto L6e
            java.lang.Object r15 = r3.getObjectVolatile(r8, r1)
            r8 = r15
            jk3 r8 = (defpackage.jk3) r8
        L6b:
            r15 = r7
            r7 = r14
            goto Le
        L6e:
            defpackage.ov3.d()
            return r0
        L72:
            r6.getClass()
            r15 = r6
            jk3 r15 = (defpackage.jk3) r15
            r9 = r8
            r8 = r15
            goto L6b
        L7b:
            defpackage.ov3.d()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk3.c():jk3");
    }

    public final void d(jk3 jk3Var) {
        jk3 jk3Var2;
        while (true) {
            Unsafe unsafe = qs.a;
            long j = y;
            jk3 jk3Var3 = (jk3) unsafe.getObjectVolatile(jk3Var, j);
            if (this.e() != jk3Var) {
                return;
            }
            while (true) {
                Unsafe unsafe2 = qs.a;
                jk3Var2 = this;
                jk3 jk3Var4 = jk3Var;
                if (unsafe2.compareAndSwapObject(jk3Var4, y, jk3Var3, jk3Var2)) {
                    if (jk3Var2.h()) {
                        jk3Var4.c();
                        return;
                    }
                    return;
                } else {
                    jk3Var = jk3Var4;
                    if (unsafe2.getObjectVolatile(jk3Var4, j) != jk3Var3) {
                        break;
                    } else {
                        this = jk3Var2;
                    }
                }
            }
            this = jk3Var2;
        }
    }

    public final Object e() {
        return qs.a.getObjectVolatile(this, x);
    }

    public final jk3 f() {
        t25 t25Var;
        Object e = e();
        if (e instanceof t25) {
            t25Var = (t25) e;
        } else {
            t25Var = null;
        }
        if (t25Var != null) {
            return t25Var.a;
        }
        e.getClass();
        return (jk3) e;
    }

    public final jk3 g() {
        jk3 c = c();
        if (c == null) {
            Unsafe unsafe = qs.a;
            long j = y;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            while (true) {
                jk3 jk3Var = (jk3) objectVolatile;
                if (!jk3Var.h()) {
                    return jk3Var;
                }
                objectVolatile = qs.a.getObjectVolatile(jk3Var, j);
            }
        } else {
            return c;
        }
    }

    public boolean h() {
        return e() instanceof t25;
    }

    public String toString() {
        return new ec3(this, z51.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1, (byte) 2) + '@' + z51.t(this);
    }
}
