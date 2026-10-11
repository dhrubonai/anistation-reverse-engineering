package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.WeakHashMap;
import msr.pistream.app.R;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements t1, g0.v, g0.w {
    public static final int[] S = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public final Rect E;
    public final Rect F;
    public final Rect G;
    public g0.k2 H;
    public g0.k2 I;
    public g0.k2 J;
    public g0.k2 K;
    public f L;
    public OverScroller M;
    public ViewPropertyAnimator N;
    public final d O;
    public final e P;
    public final e Q;
    public final g0.x R;

    /* renamed from: a, reason: collision with root package name */
    public int f324a;

    /* renamed from: b, reason: collision with root package name */
    public int f325b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f326c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f327d;

    /* renamed from: e, reason: collision with root package name */
    public u1 f328e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f329f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f330x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f331y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f332z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f325b = 0;
        this.E = new Rect();
        this.F = new Rect();
        this.G = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        g0.k2 k2Var = g0.k2.f4226b;
        this.H = k2Var;
        this.I = k2Var;
        this.J = k2Var;
        this.K = k2Var;
        this.O = new d(this, 0);
        this.P = new e(this, 0);
        this.Q = new e(this, 1);
        j(context);
        this.R = new g0.x();
    }

    public static boolean g(FrameLayout frameLayout, Rect rect, boolean z9) {
        boolean z10;
        g gVar = (g) frameLayout.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin;
        int i11 = rect.left;
        if (i10 != i11) {
            ((ViewGroup.MarginLayoutParams) gVar).leftMargin = i11;
            z10 = true;
        } else {
            z10 = false;
        }
        int i12 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        int i13 = rect.top;
        if (i12 != i13) {
            ((ViewGroup.MarginLayoutParams) gVar).topMargin = i13;
            z10 = true;
        }
        int i14 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
        int i15 = rect.right;
        if (i14 != i15) {
            ((ViewGroup.MarginLayoutParams) gVar).rightMargin = i15;
            z10 = true;
        }
        if (z9) {
            int i16 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) gVar).bottomMargin = i17;
                return true;
            }
        }
        return z10;
    }

    @Override // g0.v
    public final void a(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // g0.v
    public final void b(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // g0.v
    public final void c(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g;
    }

    @Override // g0.w
    public final void d(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        e(view, i10, i11, i12, i13, i14);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        if (this.f329f != null && !this.f330x) {
            if (this.f327d.getVisibility() == 0) {
                i10 = (int) (this.f327d.getTranslationY() + this.f327d.getBottom() + 0.5f);
            } else {
                i10 = 0;
            }
            this.f329f.setBounds(0, i10, getWidth(), this.f329f.getIntrinsicHeight() + i10);
            this.f329f.draw(canvas);
        }
    }

    @Override // g0.v
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // g0.v
    public final boolean f(View view, View view2, int i10, int i11) {
        if (i11 == 0 && onStartNestedScroll(view, view2, i10)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f327d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        g0.x xVar = this.R;
        return xVar.f4271b | xVar.f4270a;
    }

    public CharSequence getTitle() {
        l();
        return ((g4) this.f328e).f496a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.P);
        removeCallbacks(this.Q);
        ViewPropertyAnimator viewPropertyAnimator = this.N;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final boolean i() {
        boolean z9;
        l();
        ActionMenuView actionMenuView = ((g4) this.f328e).f496a.f375a;
        if (actionMenuView == null) {
            return false;
        }
        m mVar = actionMenuView.K;
        if (mVar != null && mVar.d()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        return true;
    }

    public final void j(Context context) {
        boolean z9;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(S);
        boolean z10 = false;
        this.f324a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f329f = drawable;
        if (drawable == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        setWillNotDraw(z9);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z10 = true;
        }
        this.f330x = z10;
        this.M = new OverScroller(context);
    }

    public final void k(int i10) {
        l();
        if (i10 != 2) {
            if (i10 != 5) {
                if (i10 == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            } else {
                ((g4) this.f328e).getClass();
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            }
        }
        ((g4) this.f328e).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void l() {
        u1 wrapper;
        if (this.f326c == null) {
            this.f326c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f327d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof u1) {
                wrapper = (u1) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f328e = wrapper;
        }
    }

    public final void m(j.o oVar, f.s sVar) {
        l();
        g4 g4Var = (g4) this.f328e;
        m mVar = g4Var.f508m;
        Toolbar toolbar = g4Var.f496a;
        if (mVar == null) {
            g4Var.f508m = new m(toolbar.getContext());
        }
        m mVar2 = g4Var.f508m;
        mVar2.f567e = sVar;
        if (oVar != null || toolbar.f375a != null) {
            toolbar.e();
            j.o oVar2 = toolbar.f375a.G;
            if (oVar2 != oVar) {
                if (oVar2 != null) {
                    oVar2.r(toolbar.f384e0);
                    oVar2.r(toolbar.f386f0);
                }
                if (toolbar.f386f0 == null) {
                    toolbar.f386f0 = new c4(toolbar);
                }
                mVar2.H = true;
                if (oVar != null) {
                    oVar.b(mVar2, toolbar.A);
                    oVar.b(toolbar.f386f0, toolbar.A);
                } else {
                    mVar2.g(toolbar.A, null);
                    toolbar.f386f0.g(toolbar.A, null);
                    mVar2.e();
                    toolbar.f386f0.e();
                }
                toolbar.f375a.setPopupTheme(toolbar.B);
                toolbar.f375a.setPresenter(mVar2);
                toolbar.f384e0 = mVar2;
                toolbar.s();
            }
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        l();
        g0.k2 h10 = g0.k2.h(this, windowInsets);
        boolean g10 = g(this.f327d, new Rect(h10.c(), h10.e(), h10.d(), h10.b()), false);
        WeakHashMap weakHashMap = g0.y0.f4277a;
        Rect rect = this.E;
        g0.n0.b(this, h10, rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int i12 = rect.right;
        int i13 = rect.bottom;
        g0.i2 i2Var = h10.f4227a;
        g0.k2 l10 = i2Var.l(i10, i11, i12, i13);
        this.H = l10;
        boolean z9 = true;
        if (!this.I.equals(l10)) {
            this.I = this.H;
            g10 = true;
        }
        Rect rect2 = this.F;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z9 = g10;
        }
        if (z9) {
            requestLayout();
        }
        return i2Var.a().f4227a.c().f4227a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j(getContext());
        WeakHashMap weakHashMap = g0.y0.f4277a;
        g0.l0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) gVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z9;
        int measuredHeight;
        g0.c2 z1Var;
        l();
        measureChildWithMargins(this.f327d, i10, 0, i11, 0);
        g gVar = (g) this.f327d.getLayoutParams();
        int max = Math.max(0, this.f327d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
        int max2 = Math.max(0, this.f327d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f327d.getMeasuredState());
        WeakHashMap weakHashMap = g0.y0.f4277a;
        if ((g0.h0.g(this) & 256) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            measuredHeight = this.f324a;
            if (this.f332z && this.f327d.getTabContainer() != null) {
                measuredHeight += this.f324a;
            }
        } else {
            measuredHeight = this.f327d.getVisibility() != 8 ? this.f327d.getMeasuredHeight() : 0;
        }
        Rect rect = this.E;
        Rect rect2 = this.G;
        rect2.set(rect);
        g0.k2 k2Var = this.H;
        this.J = k2Var;
        if (!this.f331y && !z9) {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            this.J = k2Var.f4227a.l(0, measuredHeight, 0, 0);
        } else {
            z.d b10 = z.d.b(k2Var.c(), this.J.e() + measuredHeight, this.J.d(), this.J.b() + 0);
            g0.k2 k2Var2 = this.J;
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 30) {
                z1Var = new g0.b2(k2Var2);
            } else if (i12 >= 29) {
                z1Var = new g0.a2(k2Var2);
            } else {
                z1Var = new g0.z1(k2Var2);
            }
            z1Var.g(b10);
            this.J = z1Var.b();
        }
        g(this.f326c, rect2, true);
        if (!this.K.equals(this.J)) {
            g0.k2 k2Var3 = this.J;
            this.K = k2Var3;
            ContentFrameLayout contentFrameLayout = this.f326c;
            WindowInsets g10 = k2Var3.g();
            if (g10 != null) {
                WindowInsets a10 = g0.l0.a(contentFrameLayout, g10);
                if (!a10.equals(g10)) {
                    g0.k2.h(contentFrameLayout, a10);
                }
            }
        }
        measureChildWithMargins(this.f326c, i10, 0, i11, 0);
        g gVar2 = (g) this.f326c.getLayoutParams();
        int max3 = Math.max(max, this.f326c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar2).leftMargin + ((ViewGroup.MarginLayoutParams) gVar2).rightMargin);
        int max4 = Math.max(max2, this.f326c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar2).topMargin + ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f326c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i10, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i11, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        boolean z10 = false;
        if (!this.A || !z9) {
            return false;
        }
        this.M.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        if (this.M.getFinalY() > this.f327d.getHeight()) {
            z10 = true;
        }
        if (z10) {
            h();
            this.Q.run();
        } else {
            h();
            this.P.run();
        }
        this.B = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.C + i11;
        this.C = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        f.u0 u0Var;
        i.m mVar;
        this.R.f4270a = i10;
        this.C = getActionBarHideOffset();
        h();
        f fVar = this.L;
        if (fVar != null && (mVar = (u0Var = (f.u0) fVar).U) != null) {
            mVar.a();
            u0Var.U = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) != 0 && this.f327d.getVisibility() == 0) {
            return this.A;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.A && !this.B) {
            if (this.C <= this.f327d.getHeight()) {
                h();
                postDelayed(this.P, 600L);
            } else {
                h();
                postDelayed(this.Q, 600L);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i10) {
        boolean z9;
        boolean z10;
        super.onWindowSystemUiVisibilityChanged(i10);
        l();
        int i11 = this.D ^ i10;
        this.D = i10;
        if ((i10 & 4) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if ((i10 & 256) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        f fVar = this.L;
        if (fVar != null) {
            ((f.u0) fVar).Q = !z10;
            if (!z9 && z10) {
                f.u0 u0Var = (f.u0) fVar;
                if (!u0Var.R) {
                    u0Var.R = true;
                    u0Var.u0(true);
                }
            } else {
                f.u0 u0Var2 = (f.u0) fVar;
                if (u0Var2.R) {
                    u0Var2.R = false;
                    u0Var2.u0(true);
                }
            }
        }
        if ((i11 & 256) != 0 && this.L != null) {
            WeakHashMap weakHashMap = g0.y0.f4277a;
            g0.l0.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f325b = i10;
        f fVar = this.L;
        if (fVar != null) {
            ((f.u0) fVar).P = i10;
        }
    }

    public void setActionBarHideOffset(int i10) {
        h();
        this.f327d.setTranslationY(-Math.max(0, Math.min(i10, this.f327d.getHeight())));
    }

    public void setActionBarVisibilityCallback(f fVar) {
        this.L = fVar;
        if (getWindowToken() != null) {
            ((f.u0) this.L).P = this.f325b;
            int i10 = this.D;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                WeakHashMap weakHashMap = g0.y0.f4277a;
                g0.l0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z9) {
        this.f332z = z9;
    }

    public void setHideOnContentScrollEnabled(boolean z9) {
        if (z9 != this.A) {
            this.A = z9;
            if (!z9) {
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i10) {
        l();
        g4 g4Var = (g4) this.f328e;
        g4Var.f499d = i10 != 0 ? w7.b.G(g4Var.f496a.getContext(), i10) : null;
        g4Var.b();
    }

    public void setLogo(int i10) {
        Drawable drawable;
        l();
        g4 g4Var = (g4) this.f328e;
        if (i10 != 0) {
            drawable = w7.b.G(g4Var.f496a.getContext(), i10);
        } else {
            drawable = null;
        }
        g4Var.f500e = drawable;
        g4Var.b();
    }

    public void setOverlayMode(boolean z9) {
        boolean z10;
        this.f331y = z9;
        if (z9 && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f330x = z10;
    }

    public void setShowingForActionMode(boolean z9) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.t1
    public void setWindowCallback(Window.Callback callback) {
        l();
        ((g4) this.f328e).f506k = callback;
    }

    @Override // androidx.appcompat.widget.t1
    public void setWindowTitle(CharSequence charSequence) {
        l();
        g4 g4Var = (g4) this.f328e;
        if (!g4Var.f502g) {
            g4Var.f503h = charSequence;
            if ((g4Var.f497b & 8) != 0) {
                Toolbar toolbar = g4Var.f496a;
                toolbar.setTitle(charSequence);
                if (g4Var.f502g) {
                    g0.y0.m(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new g(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        l();
        g4 g4Var = (g4) this.f328e;
        g4Var.f499d = drawable;
        g4Var.b();
    }
}
