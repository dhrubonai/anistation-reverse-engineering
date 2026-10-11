package f;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 implements Window.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Window.Callback f3623a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3624b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3625c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g0 f3627e;

    public a0(g0 g0Var, Window.Callback callback) {
        this.f3627e = g0Var;
        if (callback != null) {
            this.f3623a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final void a(Window.Callback callback) {
        try {
            this.f3624b = true;
            callback.onContentChanged();
        } finally {
            this.f3624b = false;
        }
    }

    @Override // android.view.Window.Callback
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f3623a.dispatchGenericMotionEvent(motionEvent);
    }

    public final boolean c(KeyEvent keyEvent) {
        return this.f3623a.dispatchKeyEvent(keyEvent);
    }

    public final boolean d(KeyEvent keyEvent) {
        return this.f3623a.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f3625c) {
            return this.f3623a.dispatchKeyEvent(keyEvent);
        }
        if (!this.f3627e.v(keyEvent) && !c(keyEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r0 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if (r7 != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyShortcutEvent(android.view.KeyEvent r7) {
        /*
            r6 = this;
            boolean r0 = r6.d(r7)
            r1 = 1
            if (r0 != 0) goto L6e
            int r0 = r7.getKeyCode()
            f.g0 r2 = r6.f3627e
            r2.D()
            f.u0 r3 = r2.F
            r4 = 0
            if (r3 == 0) goto L3b
            f.t0 r3 = r3.K
            if (r3 != 0) goto L1a
            goto L37
        L1a:
            j.o r3 = r3.f3784d
            if (r3 == 0) goto L37
            int r5 = r7.getDeviceId()
            android.view.KeyCharacterMap r5 = android.view.KeyCharacterMap.load(r5)
            int r5 = r5.getKeyboardType()
            if (r5 == r1) goto L2e
            r5 = r1
            goto L2f
        L2e:
            r5 = r4
        L2f:
            r3.setQwertyMode(r5)
            boolean r0 = r3.performShortcut(r0, r7, r4)
            goto L38
        L37:
            r0 = r4
        L38:
            if (r0 == 0) goto L3b
            goto L67
        L3b:
            f.f0 r0 = r2.f3683e0
            if (r0 == 0) goto L50
            int r3 = r7.getKeyCode()
            boolean r0 = r2.H(r0, r3, r7)
            if (r0 == 0) goto L50
            f.f0 r7 = r2.f3683e0
            if (r7 == 0) goto L67
            r7.f3674l = r1
            goto L67
        L50:
            f.f0 r0 = r2.f3683e0
            if (r0 != 0) goto L69
            f.f0 r0 = r2.B(r4)
            r2.I(r0, r7)
            int r3 = r7.getKeyCode()
            boolean r7 = r2.H(r0, r3, r7)
            r0.f3673k = r4
            if (r7 == 0) goto L69
        L67:
            r7 = r1
            goto L6a
        L69:
            r7 = r4
        L6a:
            if (r7 == 0) goto L6d
            goto L6e
        L6d:
            r1 = r4
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a0.dispatchKeyShortcutEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.Window.Callback
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f3623a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f3623a.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f3623a.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f3623a.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f3623a.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void onAttachedToWindow() {
        this.f3623a.onAttachedToWindow();
    }

    public final boolean k(int i10, Menu menu) {
        return this.f3623a.onCreatePanelMenu(i10, menu);
    }

    public final View l(int i10) {
        return this.f3623a.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void onDetachedFromWindow() {
        this.f3623a.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f3623a.onMenuItemSelected(i10, menuItem);
    }

    public final boolean o(int i10, Menu menu) {
        return this.f3623a.onMenuOpened(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f3624b) {
            this.f3623a.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0 && !(menu instanceof j.o)) {
            return false;
        }
        return k(i10, menu);
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        return l(i10);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        o(i10, menu);
        g0 g0Var = this.f3627e;
        if (i10 == 108) {
            g0Var.D();
            u0 u0Var = g0Var.F;
            if (u0Var != null && true != u0Var.N) {
                u0Var.N = true;
                ArrayList arrayList = u0Var.O;
                if (arrayList.size() > 0) {
                    a3.g.z(arrayList.get(0));
                    throw null;
                }
            }
        } else {
            g0Var.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        if (this.f3626d) {
            this.f3623a.onPanelClosed(i10, menu);
            return;
        }
        p(i10, menu);
        g0 g0Var = this.f3627e;
        if (i10 == 108) {
            g0Var.D();
            u0 u0Var = g0Var.F;
            if (u0Var != null && u0Var.N) {
                u0Var.N = false;
                ArrayList arrayList = u0Var.O;
                if (arrayList.size() > 0) {
                    a3.g.z(arrayList.get(0));
                    throw null;
                }
                return;
            }
            return;
        }
        if (i10 == 0) {
            f0 B = g0Var.B(i10);
            if (B.f3675m) {
                g0Var.t(B, false);
                return;
            }
            return;
        }
        g0Var.getClass();
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        j.o oVar;
        if (menu instanceof j.o) {
            oVar = (j.o) menu;
        } else {
            oVar = null;
        }
        if (i10 == 0 && oVar == null) {
            return false;
        }
        if (oVar != null) {
            oVar.f5568x = true;
        }
        boolean r8 = r(i10, view, menu);
        if (oVar != null) {
            oVar.f5568x = false;
        }
        return r8;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        j.o oVar = this.f3627e.B(0).f3670h;
        if (oVar != null) {
            s(list, oVar, i10);
        } else {
            s(list, menu, i10);
        }
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }

    public final void p(int i10, Menu menu) {
        this.f3623a.onPanelClosed(i10, menu);
    }

    @Override // android.view.Window.Callback
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void onPointerCaptureChanged(boolean z9) {
        i.p.a(this.f3623a, z9);
    }

    public final boolean r(int i10, View view, Menu menu) {
        return this.f3623a.onPreparePanel(i10, view, menu);
    }

    public final void s(List list, Menu menu, int i10) {
        i.o.a(this.f3623a, list, menu, i10);
    }

    @Override // android.view.Window.Callback
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final boolean onSearchRequested() {
        return this.f3623a.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return i.n.a(this.f3623a, searchEvent);
    }

    @Override // android.view.Window.Callback
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f3623a.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public final void onWindowFocusChanged(boolean z9) {
        this.f3623a.onWindowFocusChanged(z9);
    }

    public final ActionMode x(ActionMode.Callback callback, int i10) {
        return i.n.b(this.f3623a, callback, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a2  */
    @Override // android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback r10, int r11) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a0.onWindowStartingActionMode(android.view.ActionMode$Callback, int):android.view.ActionMode");
    }
}
