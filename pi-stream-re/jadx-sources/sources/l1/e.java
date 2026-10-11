package l1;

import android.content.Context;
import android.content.IntentFilter;
import android.util.SparseArray;
import java.util.Arrays;
import java.util.Objects;
import r6.n1;
import r6.s1;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f6644c = new e(r6.o0.o(d.f6634d));

    /* renamed from: d, reason: collision with root package name */
    public static final n1 f6645d;

    /* renamed from: e, reason: collision with root package name */
    public static final s1 f6646e;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f6647a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f6648b;

    static {
        Object[] objArr = {2, 5, 6};
        r6.h0.o(3, objArr);
        f6645d = r6.o0.h(3, objArr);
        r6.q0 q0Var = new r6.q0(4);
        q0Var.c(5, 6);
        q0Var.c(17, 6);
        q0Var.c(7, 6);
        q0Var.c(30, 10);
        q0Var.c(18, 6);
        q0Var.c(6, 8);
        q0Var.c(8, 8);
        q0Var.c(14, 8);
        f6646e = q0Var.a();
    }

    public e(n1 n1Var) {
        for (int i10 = 0; i10 < n1Var.f9499d; i10++) {
            d dVar = (d) n1Var.get(i10);
            this.f6647a.put(dVar.f6635a, dVar);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f6647a.size(); i12++) {
            i11 = Math.max(i11, ((d) this.f6647a.valueAt(i12)).f6636b);
        }
        this.f6648b = i11;
    }

    public static n1 a(int[] iArr, int i10) {
        r6.m0 m0Var = r6.o0.f9505b;
        r6.h0.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i11 = 0;
        if (iArr == null) {
            iArr = new int[0];
        }
        int i12 = 0;
        while (i11 < iArr.length) {
            d dVar = new d(iArr[i11], i10);
            int i13 = i12 + 1;
            if (objArr.length < i13) {
                objArr = Arrays.copyOf(objArr, q6.g.y(objArr.length, i13));
            }
            objArr[i12] = dVar;
            i11++;
            i12 = i13;
        }
        return r6.o0.h(i12, objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r1 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r0 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
    
        if (r0 == false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static l1.e b(android.content.Context r7, android.content.Intent r8, c1.g r9, l1.i r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.e.b(android.content.Context, android.content.Intent, c1.g, l1.i):l1.e");
    }

    public static e c(Context context, c1.g gVar, i iVar) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), gVar, iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        if (r15 != 5) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair d(c1.g r17, c1.v r18) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.e.d(c1.g, c1.v):android.util.Pair");
    }

    public final boolean e(int i10) {
        SparseArray sparseArray = this.f6647a;
        int i11 = f1.b0.f3799a;
        if (sparseArray.indexOfKey(i10) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0014, code lost:
    
        if (r3 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof l1.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l1.e r9 = (l1.e) r9
            android.util.SparseArray r1 = r8.f6647a
            android.util.SparseArray r3 = r9.f6647a
            int r4 = f1.b0.f3799a
            if (r1 != 0) goto L1a
            if (r3 != 0) goto L18
        L16:
            r1 = r0
            goto L4c
        L18:
            r1 = r2
            goto L4c
        L1a:
            if (r3 != 0) goto L1d
            goto L18
        L1d:
            int r4 = f1.b0.f3799a
            r5 = 31
            if (r4 < r5) goto L28
            boolean r1 = com.google.android.gms.common.internal.o0.z(r1, r3)
            goto L4c
        L28:
            int r4 = r1.size()
            int r5 = r3.size()
            if (r4 == r5) goto L33
            goto L18
        L33:
            r5 = r2
        L34:
            if (r5 >= r4) goto L16
            int r6 = r1.keyAt(r5)
            java.lang.Object r7 = r1.valueAt(r5)
            java.lang.Object r6 = r3.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 != 0) goto L49
            goto L18
        L49:
            int r5 = r5 + 1
            goto L34
        L4c:
            if (r1 == 0) goto L55
            int r1 = r8.f6648b
            int r9 = r9.f6648b
            if (r1 != r9) goto L55
            goto L56
        L55:
            r0 = r2
        L56:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i10;
        SparseArray sparseArray = this.f6647a;
        if (f1.b0.f3799a >= 31) {
            i10 = sparseArray.contentHashCode();
        } else {
            int i11 = 17;
            for (int i12 = 0; i12 < sparseArray.size(); i12++) {
                i11 = Objects.hashCode(sparseArray.valueAt(i12)) + ((sparseArray.keyAt(i12) + (i11 * 31)) * 31);
            }
            i10 = i11;
        }
        return (i10 * 31) + this.f6648b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f6648b + ", audioProfiles=" + this.f6647a + "]";
    }
}
