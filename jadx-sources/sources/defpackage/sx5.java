package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class sx5 extends d3 implements x44, w42, wc2 {
    public static final /* synthetic */ long C = qs.a.objectFieldOffset(sx5.class.getDeclaredField("_state$volatile"));
    public int B;
    private volatile /* synthetic */ Object _state$volatile;

    public sx5(Object obj) {
        this._state$volatile = obj;
    }

    @Override // defpackage.wc2
    public final w42 a(l11 l11Var, int i, ta0 ta0Var) {
        if (((i < 0 || i >= 2) && i != -2) || ta0Var != ta0.y) {
            return jn5.c(this, l11Var, i, ta0Var);
        }
        return this;
    }

    @Override // defpackage.t44
    public final void b() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (r14.equals(r15) != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
    
        if (r9 == r2) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0082, code lost:
    
        if (r15 != r2) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:14:0x0082, B:16:0x008c, B:19:0x0093, B:20:0x0097, B:24:0x009a, B:26:0x00bb, B:29:0x00cb, B:30:0x00e7, B:36:0x00f7, B:32:0x00ee, B:35:0x00f4, B:45:0x00a0, B:48:0x00a7, B:56:0x0047, B:58:0x0050, B:59:0x0073, B:61:0x005e, B:63:0x0062), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0032, B:14:0x0082, B:16:0x008c, B:19:0x0093, B:20:0x0097, B:24:0x009a, B:26:0x00bb, B:29:0x00cb, B:30:0x00e7, B:36:0x00f7, B:32:0x00ee, B:35:0x00f4, B:45:0x00a0, B:48:0x00a7, B:56:0x0047, B:58:0x0050, B:59:0x0073, B:61:0x005e, B:63:0x0062), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ca -> B:14:0x0082). Please report as a decompilation issue!!! */
    @Override // defpackage.w42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(defpackage.x42 r14, defpackage.vz0 r15) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sx5.collect(x42, vz0):java.lang.Object");
    }

    @Override // defpackage.t44
    public final boolean d(Object obj) {
        l(null, obj);
        return true;
    }

    @Override // defpackage.t44, defpackage.x42
    public final Object emit(Object obj, vz0 vz0Var) {
        k(obj);
        return pn6.a;
    }

    @Override // defpackage.qx5
    public final Object getValue() {
        Object objectVolatile = qs.a.getObjectVolatile(this, C);
        if (objectVolatile == tb4.a) {
            return null;
        }
        return objectVolatile;
    }

    public final boolean j(Object obj, Object obj2) {
        ni1 ni1Var = tb4.a;
        if (obj == null) {
            obj = ni1Var;
        }
        if (obj2 == null) {
            obj2 = ni1Var;
        }
        return l(obj, obj2);
    }

    public final void k(Object obj) {
        if (obj == null) {
            obj = tb4.a;
        }
        l(null, obj);
    }

    public final boolean l(Object obj, Object obj2) {
        int i;
        e3[] e3VarArr;
        ni1 ni1Var;
        synchronized (this) {
            Unsafe unsafe = qs.a;
            long j = C;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !a34.i(objectVolatile, obj)) {
                return false;
            }
            if (a34.i(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.B;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.B = i3;
                e3[] e3VarArr2 = this.x;
                while (true) {
                    ux5[] ux5VarArr = (ux5[]) e3VarArr2;
                    if (ux5VarArr != null) {
                        for (ux5 ux5Var : ux5VarArr) {
                            if (ux5Var != null) {
                                AtomicReference atomicReference = ux5Var.a;
                                while (true) {
                                    Object obj3 = atomicReference.get();
                                    if (obj3 != null && obj3 != (ni1Var = tx5.b)) {
                                        ni1 ni1Var2 = tx5.a;
                                        if (obj3 == ni1Var2) {
                                            while (!atomicReference.compareAndSet(obj3, ni1Var)) {
                                                if (atomicReference.get() != obj3) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj3, ni1Var2)) {
                                                if (atomicReference.get() != obj3) {
                                                    break;
                                                }
                                            }
                                            ((qg0) obj3).resumeWith(pn6.a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.B;
                        if (i == i3) {
                            this.B = i3 + 1;
                            return true;
                        }
                        e3VarArr = this.x;
                    }
                    e3VarArr2 = e3VarArr;
                    i3 = i;
                }
            } else {
                this.B = i2 + 2;
                return true;
            }
        }
    }
}
