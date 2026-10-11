package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class pk3 {
    public static final ni1 e;
    public static final /* synthetic */ long f;
    public static final /* synthetic */ long g;
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    static {
        Unsafe unsafe = qs.a;
        f = unsafe.objectFieldOffset(pk3.class.getDeclaredField("_next$volatile"));
        g = unsafe.objectFieldOffset(pk3.class.getDeclaredField("_state$volatile"));
        e = new ni1("REMOVE_FROZEN", (byte) 2);
    }

    public pk3(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            if ((i & i2) == 0) {
                return;
            }
            ze0.m("Check failed.");
            throw null;
        }
        ze0.m("Check failed.");
        throw null;
    }

    public final int a(Object obj) {
        pk3 pk3Var = this;
        while (true) {
            Unsafe unsafe = qs.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(pk3Var, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                if ((2305843009213693952L & longVolatile) != 0) {
                    return 2;
                }
                return 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = pk3Var.c;
            if (((i2 + 2) & i3) != (i & i3)) {
                boolean z = pk3Var.b;
                AtomicReferenceArray atomicReferenceArray = pk3Var.d;
                if (!z && atomicReferenceArray.get(i2 & i3) != null) {
                    int i4 = pk3Var.a;
                    if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                        return 1;
                    }
                } else {
                    if (unsafe.compareAndSwapLong(pk3Var, g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((i2 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i2 & i3, obj);
                        pk3 pk3Var2 = this;
                        while ((qs.a.getLongVolatile(pk3Var2, j) & 1152921504606846976L) != 0) {
                            pk3Var2 = pk3Var2.c();
                            AtomicReferenceArray atomicReferenceArray2 = pk3Var2.d;
                            int i5 = pk3Var2.c & i2;
                            Object obj2 = atomicReferenceArray2.get(i5);
                            if ((obj2 instanceof ok3) && ((ok3) obj2).a == i2) {
                                atomicReferenceArray2.set(i5, obj);
                            } else {
                                pk3Var2 = null;
                            }
                            if (pk3Var2 == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                    pk3Var = this;
                }
            } else {
                return 1;
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = qs.a.getLongVolatile(this, g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            pk3 pk3Var = this;
            if (qs.a.compareAndSwapLong(pk3Var, g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = pk3Var;
        }
    }

    public final pk3 c() {
        long j;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = qs.a;
            long j2 = g;
            long longVolatile = unsafe2.getLongVolatile(this, j2);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j = longVolatile;
                break;
            }
            j = 1152921504606846976L | longVolatile;
            if (unsafe2.compareAndSwapLong(this, j2, longVolatile, j)) {
                break;
            }
        }
        while (true) {
            Unsafe unsafe3 = qs.a;
            long j3 = f;
            pk3 pk3Var = (pk3) unsafe3.getObjectVolatile(this, j3);
            if (pk3Var != null) {
                return pk3Var;
            }
            pk3 pk3Var2 = new pk3(this.a * 2, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.d.get(i4);
                if (obj == null) {
                    obj = new ok3(i);
                }
                pk3Var2.d.set(pk3Var2.c & i, obj);
                i++;
            }
            qs.a.putLongVolatile(pk3Var2, g, j & (-1152921504606846977L));
            do {
                unsafe = qs.a;
                if (unsafe.compareAndSwapObject(this, f, (Object) null, pk3Var2)) {
                    break;
                }
            } while (unsafe.getObjectVolatile(this, j3) == null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0044, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() {
        /*
            r34 = this;
            r1 = r34
        L2:
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r2 = defpackage.pk3.g
            long r4 = r0.getLongVolatile(r1, r2)
            r8 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r6 = r4 & r8
            r10 = 0
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 == 0) goto L17
            ni1 r0 = defpackage.pk3.e
            return r0
        L17:
            r12 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r6 = r4 & r12
            int r6 = (int) r6
            r14 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r14 = r14 & r4
            r7 = 30
            long r14 = r14 >> r7
            int r7 = (int) r14
            int r14 = r1.c
            r7 = r7 & r14
            r14 = r14 & r6
            r15 = 0
            if (r7 != r14) goto L2f
            goto L44
        L2f:
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r1.d
            r16 = r8
            java.lang.Object r8 = r7.get(r14)
            boolean r9 = r1.b
            if (r8 != 0) goto L3e
            if (r9 == 0) goto L2
            goto L44
        L3e:
            r18 = r10
            boolean r10 = r8 instanceof defpackage.ok3
            if (r10 == 0) goto L45
        L44:
            return r15
        L45:
            int r6 = r6 + 1
            r10 = 1073741823(0x3fffffff, float:1.9999999)
            r6 = r6 & r10
            r10 = -1073741824(0xffffffffc0000000, double:NaN)
            long r20 = r4 & r10
            r22 = r10
            long r10 = (long) r6
            long r20 = r20 | r10
            r24 = r12
            r12 = r7
            r6 = r20
            boolean r0 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r0 == 0) goto L64
            r12.set(r14, r15)
            return r8
        L64:
            r1 = r34
            if (r9 == 0) goto L2
        L68:
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r2 = defpackage.pk3.g
            long r30 = r0.getLongVolatile(r1, r2)
            long r4 = r30 & r24
            int r4 = (int) r4
            long r5 = r30 & r16
            int r5 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r5 == 0) goto L7f
            pk3 r0 = r1.c()
            r1 = r0
            goto L98
        L7f:
            long r5 = r30 & r22
            long r32 = r5 | r10
            r26 = r0
            r27 = r1
            r28 = r2
            boolean r0 = r26.compareAndSwapLong(r27, r28, r30, r32)
            if (r0 == 0) goto L68
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.d
            int r1 = r1.c
            r1 = r1 & r4
            r0.set(r1, r15)
            r1 = r15
        L98:
            if (r1 != 0) goto L68
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk3.d():java.lang.Object");
    }
}
