package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.anistation.android.R;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vr4 extends q0 {
    public static final c94 d0 = new c94((byte) 29);
    public sb2 G;
    public yr4 H;
    public String I;
    public final View J;
    public final boolean K;
    public final i18 L;
    public final WindowManager M;
    public final WindowManager.LayoutParams N;
    public xr4 O;
    public ia3 P;
    public final ti4 Q;
    public final ti4 R;
    public g13 S;
    public final he1 T;
    public final Rect U;
    public final eu5 V;
    public wo W;
    public final ti4 a0;
    public boolean b0;
    public final int[] c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr4(sb2 sb2Var, yr4 yr4Var, String str, View view, ud1 ud1Var, xr4 xr4Var, UUID uuid, boolean z) {
        super(view.getContext());
        i18 i18Var;
        if (Build.VERSION.SDK_INT >= 30) {
            i18Var = new i18((byte) 28);
        } else {
            i18Var = new i18((byte) 28);
        }
        this.G = sb2Var;
        this.H = yr4Var;
        this.I = str;
        this.J = view;
        this.K = z;
        this.L = i18Var;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.M = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        yr4 yr4Var2 = this.H;
        boolean b = ae.b(view);
        boolean z2 = yr4Var2.b;
        int i = yr4Var2.a;
        if (z2 && b) {
            i |= 8192;
        } else if (z2 && !b) {
            i &= -8193;
        }
        layoutParams.flags = i;
        layoutParams.type = this.H.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.N = layoutParams;
        this.O = xr4Var;
        this.P = ia3.x;
        this.Q = xt5.g(null);
        this.R = xt5.g(null);
        this.T = ut5.b(new nj4(this, (byte) 2));
        this.U = new Rect();
        this.V = new eu5(new td(this, (byte) 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, rz5.c(view));
        setTag(R.id.view_tree_view_model_store_owner, ss5.d(view));
        setTag(R.id.view_tree_saved_state_registry_owner, qs5.f(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(ud1Var.g0(8.0f));
        setOutlineProvider(new gg1((byte) 2));
        this.a0 = xt5.g(oi4.a);
        this.c0 = new int[2];
    }

    private final ic2 getContent() {
        return (ic2) this.a0.getValue();
    }

    private final g13 getDisplayBounds() {
        int i = this.H.a & 512;
        View view = this.J;
        Rect rect = this.U;
        i18 i18Var = this.L;
        if (i == 0) {
            i18Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            i18Var.M(view, rect);
        }
        return new g13(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final ha3 getParentLayoutCoordinates() {
        return (ha3) this.R.getValue();
    }

    public static final boolean m(vr4 vr4Var) {
        ha3 parentLayoutCoordinates = vr4Var.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.m()) {
            parentLayoutCoordinates = null;
        }
        if (parentLayoutCoordinates != null && vr4Var.m165getPopupContentSizebOM6tXw() != null) {
            return true;
        }
        return false;
    }

    private final void setContent(ic2 ic2Var) {
        this.a0.setValue(ic2Var);
    }

    private final void setParentLayoutCoordinates(ha3 ha3Var) {
        this.R.setValue(ha3Var);
    }

    @Override // defpackage.q0
    public final void a(int i, kd2 kd2Var) {
        int i2;
        boolean z;
        kd2Var.f0(-857613600);
        if (kd2Var.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            getContent().invoke(kd2Var, 0);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new o0(this, i, (byte) 22);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.H.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                sb2 sb2Var = this.G;
                if (sb2Var != null) {
                    sb2Var.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.q0
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        super.g(z, i, i2, i3, i4);
        this.H.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.N;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.L.getClass();
        this.M.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.T.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.N;
    }

    public final ia3 getParentLayoutDirection() {
        return this.P;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final k13 m165getPopupContentSizebOM6tXw() {
        return (k13) this.Q.getValue();
    }

    public final xr4 getPositionProvider() {
        return this.O;
    }

    @Override // defpackage.q0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.b0;
    }

    public final String getTestTag() {
        return this.I;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.q0
    public final void h(int i, int i2) {
        this.H.getClass();
        g13 displayBounds = getDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(displayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), Integer.MIN_VALUE));
    }

    public final void n(qu0 qu0Var, ic2 ic2Var) {
        setParentCompositionContext(qu0Var);
        setContent(ic2Var);
        this.b0 = true;
    }

    public final void o(sb2 sb2Var, yr4 yr4Var, String str, ia3 ia3Var) {
        int i;
        this.G = sb2Var;
        this.I = str;
        if (!a34.i(this.H, yr4Var)) {
            yr4Var.getClass();
            this.H = yr4Var;
            boolean b = ae.b(this.J);
            boolean z = yr4Var.b;
            int i2 = yr4Var.a;
            if (z && b) {
                i2 |= 8192;
            } else if (z && !b) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.N;
            layoutParams.flags = i2;
            this.L.getClass();
            this.M.updateViewLayout(this, layoutParams);
        }
        int ordinal = ia3Var.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                ze0.l();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    @Override // defpackage.q0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V.e();
        if (this.H.c && Build.VERSION.SDK_INT >= 33) {
            wo woVar = this.W;
            if (woVar == null) {
                wo woVar2 = new wo(this.G, (byte) 0);
                this.W = woVar2;
                woVar = woVar2;
            }
            d4.f(this, woVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        eu5 eu5Var = this.V;
        xv3 xv3Var = eu5Var.h;
        if (xv3Var != null) {
            xv3Var.d();
        }
        eu5Var.a();
        if (Build.VERSION.SDK_INT >= 33) {
            d4.g(this, this.W);
        }
        this.W = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.H.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            sb2 sb2Var = this.G;
            if (sb2Var != null) {
                sb2Var.invoke();
                return true;
            }
        } else if (motionEvent != null && motionEvent.getAction() == 4) {
            sb2 sb2Var2 = this.G;
            if (sb2Var2 != null) {
                sb2Var2.invoke();
            }
        } else {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void p() {
        long d;
        ha3 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.m()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long j = parentLayoutCoordinates.j();
                if (this.K) {
                    d = parentLayoutCoordinates.o(0L);
                } else {
                    d = parentLayoutCoordinates.d(0L);
                }
                g13 d2 = wk6.d((Math.round(Float.intBitsToFloat((int) (d >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (d & 4294967295L)))), j);
                if (!d2.equals(this.S)) {
                    this.S = d2;
                    r();
                }
            }
        }
    }

    public final void q(ha3 ha3Var) {
        setParentLayoutCoordinates(ha3Var);
        p();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, v05] */
    public final void r() {
        k13 m165getPopupContentSizebOM6tXw;
        final g13 g13Var = this.S;
        if (g13Var != null && (m165getPopupContentSizebOM6tXw = m165getPopupContentSizebOM6tXw()) != null) {
            final long j = m165getPopupContentSizebOM6tXw.a;
            g13 displayBounds = getDisplayBounds();
            final long b = (displayBounds.b() & 4294967295L) | (displayBounds.d() << 32);
            final ?? obj = new Object();
            obj.x = 0L;
            this.V.d(this, d0, new sb2() { // from class: ur4
                @Override // defpackage.sb2
                public final Object invoke() {
                    vr4 vr4Var = this;
                    v05.this.x = vr4Var.O.b(g13Var, b, vr4Var.P, j);
                    return pn6.a;
                }
            });
            long j2 = obj.x;
            WindowManager.LayoutParams layoutParams = this.N;
            layoutParams.x = (int) (j2 >> 32);
            layoutParams.y = (int) (j2 & 4294967295L);
            boolean z = this.H.e;
            i18 i18Var = this.L;
            if (z) {
                i18Var.getClass();
                setSystemGestureExclusionRects(te4.J(new Rect(0, 0, (int) (b >> 32), (int) (b & 4294967295L))));
            }
            i18Var.getClass();
            this.M.updateViewLayout(this, layoutParams);
        }
    }

    public final void setParentLayoutDirection(ia3 ia3Var) {
        this.P = ia3Var;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m166setPopupContentSizefhxjrPA(k13 k13Var) {
        this.Q.setValue(k13Var);
    }

    public final void setPositionProvider(xr4 xr4Var) {
        this.O = xr4Var;
    }

    public final void setTestTag(String str) {
        this.I = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public q0 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
