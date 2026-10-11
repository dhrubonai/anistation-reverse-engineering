package defpackage;

import com.google.protobuf.CodedOutputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class ea1 implements gc4 {
    public static final /* synthetic */ long B = qs.a.objectFieldOffset(ea1.class.getDeclaredField("top"));
    public final int[] A;
    private volatile /* synthetic */ long top;
    public final int x;
    public final int y;
    public final AtomicReferenceArray z;

    public ea1(int i) {
        if (i > 0) {
            if (i <= 536870911) {
                this.top = 0L;
                int highestOneBit = Integer.highestOneBit((i * 4) - 1) * 2;
                this.x = highestOneBit;
                this.y = Integer.numberOfLeadingZeros(highestOneBit) + 1;
                int i2 = highestOneBit + 1;
                this.z = new AtomicReferenceArray(i2);
                this.A = new int[i2];
                return;
            }
            ze0.e(qx1.h(i, "capacity should be less or equal to 536870911 but it is "));
            throw null;
        }
        ze0.e(qx1.h(i, "capacity should be positive but it is "));
        throw null;
    }

    @Override // defpackage.gc4
    public final void dispose() {
        do {
        } while (p() != null);
    }

    @Override // defpackage.gc4
    public final void i0(Object obj) {
        obj.getClass();
        q(obj);
        int identityHashCode = ((System.identityHashCode(obj) * (-1640531527)) >>> this.y) + 1;
        int i = 0;
        while (i < 8) {
            AtomicReferenceArray atomicReferenceArray = this.z;
            while (!atomicReferenceArray.compareAndSet(identityHashCode, null, obj)) {
                ea1 ea1Var = this;
                if (atomicReferenceArray.get(identityHashCode) != null) {
                    identityHashCode--;
                    if (identityHashCode == 0) {
                        identityHashCode = ea1Var.x;
                    }
                    i++;
                    this = ea1Var;
                } else {
                    this = ea1Var;
                }
            }
            if (identityHashCode <= 0) {
                ze0.k("index should be positive");
                return;
            }
            while (true) {
                long j = this.top;
                long j2 = ((((j >> 32) & 4294967295L) + 1) << 32) | identityHashCode;
                this.A[identityHashCode] = (int) (4294967295L & j);
                ea1 ea1Var2 = this;
                if (!qs.a.compareAndSwapLong(ea1Var2, B, j, j2)) {
                    this = ea1Var2;
                } else {
                    return;
                }
            }
        }
    }

    public Object l() {
        return new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0009, code lost:
    
        r8 = 0;
        r1 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p() {
        /*
            r10 = this;
        L0:
            long r4 = r10.top
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto Lc
        L9:
            r8 = r1
            r1 = r10
            goto L31
        Lc:
            r0 = 32
            long r2 = r4 >> r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            r8 = 1
            long r2 = r2 + r8
            long r6 = r6 & r4
            int r8 = (int) r6
            if (r8 != 0) goto L1e
            goto L9
        L1e:
            int[] r1 = r10.A
            r1 = r1[r8]
            long r2 = r2 << r0
            long r0 = (long) r1
            long r6 = r2 | r0
            sun.misc.Unsafe r0 = defpackage.qs.a
            long r2 = defpackage.ea1.B
            r1 = r10
            boolean r10 = r0.compareAndSwapLong(r1, r2, r4, r6)
            if (r10 == 0) goto L3c
        L31:
            r10 = 0
            if (r8 != 0) goto L35
            return r10
        L35:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.z
            java.lang.Object r10 = r0.getAndSet(r8, r10)
            return r10
        L3c:
            r10 = r1
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea1.p():java.lang.Object");
    }

    public void q(Object obj) {
        obj.getClass();
    }

    @Override // defpackage.gc4
    public final Object y() {
        Object p = p();
        if (p != null) {
            return a(p);
        }
        return l();
    }

    public Object a(Object obj) {
        return obj;
    }
}
