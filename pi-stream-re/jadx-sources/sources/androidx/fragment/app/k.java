package androidx.fragment.app;

import android.transition.Transition;

/* loaded from: classes.dex */
public final class k extends f.d0 {

    /* renamed from: c, reason: collision with root package name */
    public final Object f916c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f917d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f918e;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0035, code lost:
    
        if (r5 == androidx.fragment.app.y.f1028l0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r5 == androidx.fragment.app.y.f1028l0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(androidx.fragment.app.m1 r4, c0.d r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            r3.<init>(r4, r5)
            int r5 = r4.f932a
            r0 = 2
            r1 = 1
            r2 = 0
            androidx.fragment.app.y r4 = r4.f934c
            if (r5 != r0) goto L2a
            if (r6 == 0) goto L1a
            androidx.fragment.app.v r5 = r4.Y
            if (r5 != 0) goto L13
            goto L1d
        L13:
            java.lang.Object r5 = r5.f1016j
            java.lang.Object r0 = androidx.fragment.app.y.f1028l0
            if (r5 != r0) goto L1e
            goto L1d
        L1a:
            r4.getClass()
        L1d:
            r5 = r2
        L1e:
            r3.f916c = r5
            if (r6 == 0) goto L25
            androidx.fragment.app.v r5 = r4.Y
            goto L27
        L25:
            androidx.fragment.app.v r5 = r4.Y
        L27:
            r3.f917d = r1
            goto L40
        L2a:
            if (r6 == 0) goto L38
            androidx.fragment.app.v r5 = r4.Y
            if (r5 != 0) goto L31
            goto L3b
        L31:
            java.lang.Object r5 = r5.f1015i
            java.lang.Object r0 = androidx.fragment.app.y.f1028l0
            if (r5 != r0) goto L3c
            goto L3b
        L38:
            r4.getClass()
        L3b:
            r5 = r2
        L3c:
            r3.f916c = r5
            r3.f917d = r1
        L40:
            if (r7 == 0) goto L5a
            if (r6 == 0) goto L54
            androidx.fragment.app.v r4 = r4.Y
            if (r4 != 0) goto L49
            goto L51
        L49:
            java.lang.Object r4 = r4.f1017k
            java.lang.Object r5 = androidx.fragment.app.y.f1028l0
            if (r4 != r5) goto L50
            goto L51
        L50:
            r2 = r4
        L51:
            r3.f918e = r2
            goto L5c
        L54:
            r4.getClass()
            r3.f918e = r2
            goto L5c
        L5a:
            r3.f918e = r2
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.k.<init>(androidx.fragment.app.m1, c0.d, boolean, boolean):void");
    }

    public final i1 h(Object obj) {
        if (obj == null) {
            return null;
        }
        g1 g1Var = b1.f847a;
        if (obj instanceof Transition) {
            return g1Var;
        }
        i1 i1Var = b1.f848b;
        if (i1Var != null && i1Var.e(obj)) {
            return i1Var;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + ((m1) this.f3644a).f934c + " is not a valid framework Transition or AndroidX Transition");
    }
}
