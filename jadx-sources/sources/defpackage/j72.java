package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j72 extends xz3 implements v72, ViewTreeObserver.OnGlobalFocusChangeListener {
    public View L;
    public ViewTreeObserver M;
    public final i72 N;
    public final i72 O;

    /* JADX WARN: Type inference failed for: r0v0, types: [i72] */
    /* JADX WARN: Type inference failed for: r0v1, types: [i72] */
    public j72() {
        final byte b = 0;
        this.N = new ub2(this) { // from class: i72
            public final /* synthetic */ j72 y;

            {
                this.y = this;
            }

            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                n05 n05Var;
                byte b2 = b;
                pn6 pn6Var = pn6.a;
                j72 j72Var = this.y;
                mg0 mg0Var = (mg0) obj;
                switch (b2) {
                    case 0:
                        View L = io3.L(j72Var);
                        if (!L.isFocused() && !L.hasFocus()) {
                            p72 focusOwner = ((oa) wc7.P(j72Var)).getFocusOwner();
                            View E = jf7.E(j72Var);
                            Integer c = m72.c(mg0Var.a);
                            int[] iArr = new int[2];
                            E.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            L.getLocationOnScreen(iArr2);
                            h82 y = bb4.y(((r72) focusOwner).c);
                            Rect rect = null;
                            if (y != null) {
                                n05Var = bb4.A(y);
                            } else {
                                n05Var = null;
                            }
                            if (n05Var != null) {
                                int i = (int) n05Var.a;
                                int i2 = iArr[0];
                                int i3 = iArr2[0];
                                int i4 = (int) n05Var.b;
                                int i5 = iArr[1];
                                int i6 = iArr2[1];
                                rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) n05Var.c) + i2) - i3, (((int) n05Var.d) + i5) - i6);
                            }
                            if (!m72.b(L, c, rect)) {
                                mg0Var.b = true;
                            }
                        }
                        return pn6Var;
                    default:
                        io3.L(j72Var);
                        return pn6Var;
                }
            }
        };
        final byte b2 = 1;
        this.O = new ub2(this) { // from class: i72
            public final /* synthetic */ j72 y;

            {
                this.y = this;
            }

            @Override // defpackage.ub2
            public final Object invoke(Object obj) {
                n05 n05Var;
                byte b22 = b2;
                pn6 pn6Var = pn6.a;
                j72 j72Var = this.y;
                mg0 mg0Var = (mg0) obj;
                switch (b22) {
                    case 0:
                        View L = io3.L(j72Var);
                        if (!L.isFocused() && !L.hasFocus()) {
                            p72 focusOwner = ((oa) wc7.P(j72Var)).getFocusOwner();
                            View E = jf7.E(j72Var);
                            Integer c = m72.c(mg0Var.a);
                            int[] iArr = new int[2];
                            E.getLocationOnScreen(iArr);
                            int[] iArr2 = new int[2];
                            L.getLocationOnScreen(iArr2);
                            h82 y = bb4.y(((r72) focusOwner).c);
                            Rect rect = null;
                            if (y != null) {
                                n05Var = bb4.A(y);
                            } else {
                                n05Var = null;
                            }
                            if (n05Var != null) {
                                int i = (int) n05Var.a;
                                int i2 = iArr[0];
                                int i3 = iArr2[0];
                                int i4 = (int) n05Var.b;
                                int i5 = iArr[1];
                                int i6 = iArr2[1];
                                rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) n05Var.c) + i2) - i3, (((int) n05Var.d) + i5) - i6);
                            }
                            if (!m72.b(L, c, rect)) {
                                mg0Var.b = true;
                            }
                        }
                        return pn6Var;
                    default:
                        io3.L(j72Var);
                        return pn6Var;
                }
            }
        };
    }

    @Override // defpackage.v72
    public final void D(s72 s72Var) {
        s72Var.c(false);
        s72Var.b(this.N);
        s72Var.e(this.O);
    }

    @Override // defpackage.xz3
    public final void S0() {
        ViewTreeObserver viewTreeObserver = jf7.E(this).getViewTreeObserver();
        this.M = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.xz3
    public final void T0() {
        ViewTreeObserver viewTreeObserver = this.M;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.M = null;
        jf7.E(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.L = null;
    }

    public final h82 a1() {
        boolean z;
        if (!this.x.K) {
            ez2.b("visitLocalDescendants called on an unattached node");
        }
        xz3 xz3Var = this.x;
        if ((xz3Var.A & 1024) != 0) {
            boolean z2 = false;
            for (xz3 xz3Var2 = xz3Var.C; xz3Var2 != null; xz3Var2 = xz3Var2.C) {
                if ((xz3Var2.z & 1024) != 0) {
                    xz3 xz3Var3 = xz3Var2;
                    z44 z44Var = null;
                    while (xz3Var3 != null) {
                        if (xz3Var3 instanceof h82) {
                            h82 h82Var = (h82) xz3Var3;
                            if (z2) {
                                return h82Var;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (xz3Var3.z & 1024) != 0 && (xz3Var3 instanceof zc1)) {
                            int i = 0;
                            for (xz3 xz3Var4 = ((zc1) xz3Var3).M; xz3Var4 != null; xz3Var4 = xz3Var4.C) {
                                if ((xz3Var4.z & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        xz3Var3 = xz3Var4;
                                    } else {
                                        if (z44Var == null) {
                                            z44Var = new z44(new xz3[16], 0);
                                        }
                                        if (xz3Var3 != null) {
                                            z44Var.b(xz3Var3);
                                            xz3Var3 = null;
                                        }
                                        z44Var.b(xz3Var4);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        xz3Var3 = wc7.J(z44Var);
                    }
                }
            }
        }
        ze0.m("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        boolean z2;
        if (wc7.O(this).K != null) {
            View L = io3.L(this);
            p72 focusOwner = ((oa) wc7.P(this)).getFocusOwner();
            kh4 P = wc7.P(this);
            if (view != null && !view.equals(P)) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent == L.getParent()) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (view2 != null && !view2.equals(P)) {
                for (ViewParent parent2 = view2.getParent(); parent2 != null; parent2 = parent2.getParent()) {
                    if (parent2 == L.getParent()) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (z && z2) {
                this.L = view2;
                return;
            }
            if (z2) {
                this.L = view2;
                h82 a1 = a1();
                int ordinal = a1.f1().ordinal();
                if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
                    if (ordinal == 3) {
                        v94.H(a1);
                        return;
                    } else {
                        ze0.l();
                        return;
                    }
                }
                return;
            }
            if (z) {
                this.L = null;
                if (a1().f1().a()) {
                    ((r72) focusOwner).c(8, false, false);
                    return;
                }
                return;
            }
            this.L = null;
        }
    }
}
