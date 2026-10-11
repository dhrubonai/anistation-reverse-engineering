package q3;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class i extends s {
    public static final String[] P = {"android:visibility:visibility", "android:visibility:parent"};
    public int O;

    public i() {
        this.O = 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q3.i0 K(q3.z r8, q3.z r9) {
        /*
            q3.i0 r0 = new q3.i0
            r0.<init>()
            r1 = 0
            r0.f9152a = r1
            r0.f9153b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f9196a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f9154c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f9156e = r6
            goto L33
        L2f:
            r0.f9154c = r4
            r0.f9156e = r3
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f9196a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f9155d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f9157f = r2
            goto L56
        L52:
            r0.f9155d = r4
            r0.f9157f = r3
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f9154c
            int r9 = r0.f9155d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f9156e
            android.view.ViewGroup r4 = r0.f9157f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f9153b = r1
            r0.f9152a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f9153b = r2
            r0.f9152a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f9157f
            if (r8 != 0) goto L81
            r0.f9153b = r1
            r0.f9152a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f9156e
            if (r8 != 0) goto L9f
            r0.f9153b = r2
            r0.f9152a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f9155d
            if (r8 != 0) goto L95
            r0.f9153b = r2
            r0.f9152a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f9154c
            if (r8 != 0) goto L9f
            r0.f9153b = r1
            r0.f9152a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.i.K(q3.z, q3.z):q3.i0");
    }

    public final void I(z zVar) {
        View view = zVar.f9197b;
        int visibility = view.getVisibility();
        HashMap hashMap = zVar.f9196a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public final ObjectAnimator J(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        a0.f9121a.y(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, a0.f9122b, f11);
        ofFloat.addListener(new m3.m(view));
        a(new h(0, this, view));
        return ofFloat;
    }

    @Override // q3.s
    public final void e(z zVar) {
        I(zVar);
    }

    @Override // q3.s
    public final void h(z zVar) {
        I(zVar);
        zVar.f9196a.put("android:fade:transitionAlpha", Float.valueOf(a0.f9121a.x(zVar.f9197b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (K(o(r3, false), r(r3, false)).f9152a != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ee  */
    @Override // q3.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator l(android.view.ViewGroup r23, q3.z r24, q3.z r25) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q3.i.l(android.view.ViewGroup, q3.z, q3.z):android.animation.Animator");
    }

    @Override // q3.s
    public final /* bridge */ /* synthetic */ String[] q() {
        return P;
    }

    @Override // q3.s
    public final boolean s(z zVar, z zVar2) {
        if ((zVar != null || zVar2 != null) && (zVar == null || zVar2 == null || zVar2.f9196a.containsKey("android:visibility:visibility") == zVar.f9196a.containsKey("android:visibility:visibility"))) {
            i0 K = K(zVar, zVar2);
            if (K.f9152a && (K.f9154c == 0 || K.f9155d == 0)) {
                return true;
            }
        }
        return false;
    }

    public i(int i10) {
        this.O = 3;
        if ((i10 & (-4)) == 0) {
            this.O = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
