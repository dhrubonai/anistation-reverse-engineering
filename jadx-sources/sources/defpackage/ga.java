package defpackage;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ga extends xz3 implements t90, sh5, j83, ra3, jj6 {
    public final l0 L = new l0(this, 7);
    public final /* synthetic */ oa M;

    public ga(oa oaVar) {
        this.M = oaVar;
    }

    @Override // defpackage.j83
    public final boolean E(KeyEvent keyEvent) {
        f72 f72Var;
        int i;
        int[] iArr = m72.a;
        long C = h41.C(keyEvent);
        byte b = 6;
        int i2 = 2;
        if (e83.a(C, e83.b)) {
            f72Var = new f72(2);
        } else if (e83.a(C, e83.c)) {
            f72Var = new f72(1);
        } else if (e83.a(C, e83.p)) {
            if (keyEvent.isShiftPressed()) {
                i = 2;
            } else {
                i = 1;
            }
            f72Var = new f72(i);
        } else if (e83.a(C, e83.g)) {
            f72Var = new f72(4);
        } else if (e83.a(C, e83.f)) {
            f72Var = new f72(3);
        } else if (!e83.a(C, e83.d) && !e83.a(C, e83.C)) {
            if (!e83.a(C, e83.e) && !e83.a(C, e83.D)) {
                if (!e83.a(C, e83.h) && !e83.a(C, e83.r) && !e83.a(C, e83.E)) {
                    if (!e83.a(C, e83.a) && !e83.a(C, e83.u)) {
                        f72Var = null;
                    } else {
                        f72Var = new f72(8);
                    }
                } else {
                    f72Var = new f72(7);
                }
            } else {
                f72Var = new f72(6);
            }
        } else {
            f72Var = new f72(5);
        }
        boolean z = false;
        if (f72Var != null) {
            int i3 = f72Var.a;
            if (h41.E(keyEvent) == 2) {
                oa oaVar = this.M;
                h82 g = ((r72) oaVar.getFocusOwner()).g();
                if (g != null && g.L && oaVar.s(i3)) {
                    ic2 playNavigationSoundEffect$ui = oaVar.getPlayNavigationSoundEffect$ui();
                    if (keyEvent.getRepeatCount() > 0) {
                        z = true;
                    }
                    playNavigationSoundEffect$ui.invoke(f72Var, Boolean.valueOf(z));
                    return true;
                }
                Boolean f = ((r72) oaVar.getFocusOwner()).f(i3, oaVar.getEmbeddedViewFocusRect(), new l0(f72Var, b));
                if (f == null) {
                    return true;
                }
                if (f.booleanValue()) {
                    ic2 playNavigationSoundEffect$ui2 = oaVar.getPlayNavigationSoundEffect$ui();
                    if (keyEvent.getRepeatCount() > 0) {
                        z = true;
                    }
                    playNavigationSoundEffect$ui2.invoke(f72Var, Boolean.valueOf(z));
                    return true;
                }
                if (i3 != 1 && i3 != 2) {
                    return false;
                }
                Integer c = m72.c(i3);
                if (c != null) {
                    i2 = c.intValue();
                }
                FocusFinder focusFinder = FocusFinder.getInstance();
                View rootView = oaVar.getRootView();
                rootView.getClass();
                View findNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, oaVar.getView(), i2);
                if (findNextFocus == null || findNextFocus.equals(oaVar)) {
                    return ((r72) oaVar.getFocusOwner()).i(i3);
                }
            }
        }
        return false;
    }

    @Override // defpackage.ra3
    public final wo3 e(xo3 xo3Var, ro3 ro3Var, long j) {
        em4 p = ro3Var.p(j);
        return xo3Var.v0(p.x, p.y, ot1.x, this.L, new r0(p, (byte) 1));
    }

    @Override // defpackage.j83
    public final boolean m(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.t90
    public final Object o0(fa4 fa4Var, n nVar, xz0 xz0Var) {
        n05 n05Var;
        long J = fa4Var.J(0L);
        n05 n05Var2 = (n05) nVar.invoke();
        if (n05Var2 != null) {
            n05Var = n05Var2.k(J);
        } else {
            n05Var = null;
        }
        if (n05Var != null) {
            this.M.requestRectangleOnScreen(new Rect((int) n05Var.a, (int) n05Var.b, (int) n05Var.c, (int) n05Var.d), false);
        }
        return pn6.a;
    }

    @Override // defpackage.jj6
    public final Object p() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }

    @Override // defpackage.sh5
    public final void I0(bi5 bi5Var) {
    }
}
