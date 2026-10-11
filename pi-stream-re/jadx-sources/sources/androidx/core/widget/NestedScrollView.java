package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.bumptech.glide.d;
import com.google.android.gms.common.api.f;
import f.c;
import f.h;
import g0.h0;
import g0.n0;
import g0.u;
import g0.w;
import g0.x;
import g0.y0;
import j5.a;
import java.util.ArrayList;
import java.util.WeakHashMap;
import k0.e;
import k0.i;
import k0.j;
import k0.k;
import k0.l;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements w {
    public static final float S = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final i T = new i();
    public static final int[] U = {R.attr.fillViewport};
    public View A;
    public boolean B;
    public VelocityTracker C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final int[] J;
    public final int[] K;
    public int L;
    public int M;
    public l N;
    public final x O;
    public final u P;
    public float Q;
    public k R;

    /* renamed from: a, reason: collision with root package name */
    public final float f799a;

    /* renamed from: b, reason: collision with root package name */
    public long f800b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f801c;

    /* renamed from: d, reason: collision with root package name */
    public OverScroller f802d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f803e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f804f;

    /* renamed from: x, reason: collision with root package name */
    public int f805x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f806y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f807z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, msr.pistream.app.R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f801c = new Rect();
        this.f806y = true;
        this.f807z = false;
        this.A = null;
        this.B = false;
        this.E = true;
        this.I = -1;
        this.J = new int[2];
        this.K = new int[2];
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            edgeEffect = e.a(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f803e = edgeEffect;
        if (i10 >= 31) {
            edgeEffect2 = e.a(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f804f = edgeEffect2;
        this.f799a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f802d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.F = viewConfiguration.getScaledTouchSlop();
        this.G = viewConfiguration.getScaledMinimumFlingVelocity();
        this.H = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, U, msr.pistream.app.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.O = new x();
        this.P = new u(this);
        setNestedScrollingEnabled(true);
        y0.l(this, T);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.Q == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                this.Q = typedValue.getDimension(context.getResources().getDisplayMetrics());
            } else {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
        }
        return this.Q;
    }

    public static boolean m(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        if ((parent instanceof ViewGroup) && m((View) parent, view2)) {
            return true;
        }
        return false;
    }

    @Override // g0.v
    public final void a(View view, View view2, int i10, int i11) {
        x xVar = this.O;
        if (i11 == 1) {
            xVar.f4271b = i10;
        } else {
            xVar.f4270a = i10;
        }
        this.P.g(2, i11);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // g0.v
    public final void b(View view, int i10) {
        x xVar = this.O;
        if (i10 == 1) {
            xVar.f4271b = 0;
        } else {
            xVar.f4270a = 0;
        }
        v(i10);
    }

    @Override // g0.v
    public final void c(View view, int i10, int i11, int[] iArr, int i12) {
        this.P.c(i10, i11, i12, iArr, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > max) {
            return bottom + (scrollY - max);
        }
        return bottom;
    }

    @Override // g0.w
    public final void d(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        o(i13, i14, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !j(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z9) {
        return this.P.a(f10, f11, z9);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.P.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.P.c(i10, i11, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.P.e(i10, i11, i12, i13, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f803e;
        int i11 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (j.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i10 = getPaddingLeft() + 0;
            } else {
                i10 = 0;
            }
            if (j.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i10, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap weakHashMap = y0.f4277a;
                h0.k(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f804f;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (j.a(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i11 = 0 + getPaddingLeft();
            }
            if (j.a(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i11 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                WeakHashMap weakHashMap2 = y0.f4277a;
                h0.k(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // g0.v
    public final void e(View view, int i10, int i11, int i12, int i13, int i14) {
        o(i13, i14, null);
    }

    @Override // g0.v
    public final boolean f(View view, View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public final boolean g(int i10) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && n(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.f801c;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            i(h(rect));
            findNextFocus.requestFocus(i10);
        } else {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            i(maxScrollAmount);
        }
        if (findFocus != null && findFocus.isFocused() && (!n(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        x xVar = this.O;
        return xVar.f4271b | xVar.f4270a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final int h(Rect rect) {
        int i10;
        int i11;
        int i12;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i10 = i13 - verticalFadingEdgeLength;
        } else {
            i10 = i13;
        }
        int i14 = rect.bottom;
        if (i14 > i10 && rect.top > scrollY) {
            if (rect.height() > height) {
                i12 = rect.top - scrollY;
            } else {
                i12 = rect.bottom - i10;
            }
            return Math.min(i12 + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i13);
        }
        if (rect.top >= scrollY || i14 >= i10) {
            return 0;
        }
        if (rect.height() > height) {
            i11 = 0 - (i10 - rect.bottom);
        } else {
            i11 = 0 - (scrollY - rect.top);
        }
        return Math.max(i11, -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (this.P.f(0) == null) {
            return false;
        }
        return true;
    }

    public final void i(int i10) {
        if (i10 != 0) {
            if (this.E) {
                t(0, i10, false);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.P.f4258d;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(android.view.KeyEvent r8) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.j(android.view.KeyEvent):boolean");
    }

    public final void k(int i10) {
        if (getChildCount() > 0) {
            this.f802d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, f.API_PRIORITY_OTHER, 0, 0);
            this.P.g(2, 1);
            this.M = getScrollY();
            WeakHashMap weakHashMap = y0.f4277a;
            h0.k(this);
        }
    }

    public final boolean l(int i10) {
        boolean z9;
        int childCount;
        if (i10 == 130) {
            z9 = true;
        } else {
            z9 = false;
        }
        int height = getHeight();
        Rect rect = this.f801c;
        rect.top = 0;
        rect.bottom = height;
        if (z9 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return r(i10, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i10, int i11) {
        Rect rect = this.f801c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        if (rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11) {
            return true;
        }
        return false;
    }

    public final void o(int i10, int i11, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.P.d(scrollY2, i10 - scrollY2, i11, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f807z = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10 = 0;
        if (motionEvent.getAction() == 8 && !this.B) {
            if (d.H(motionEvent, 2)) {
                f10 = motionEvent.getAxisValue(9);
            } else if (d.H(motionEvent, 4194304)) {
                f10 = motionEvent.getAxisValue(26);
            } else {
                f10 = 0.0f;
            }
            if (f10 != 0.0f) {
                int verticalScrollFactorCompat = (int) (f10 * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i11 = scrollY - verticalScrollFactorCompat;
                if (i11 < 0) {
                    int overScrollMode = getOverScrollMode();
                    if (overScrollMode != 0 && (overScrollMode != 1 || getScrollRange() <= 0)) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12 && !d.H(motionEvent, 8194)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        float height = (-i11) / getHeight();
                        EdgeEffect edgeEffect = this.f803e;
                        a.O(edgeEffect, height, 0.5f);
                        edgeEffect.onRelease();
                        invalidate();
                        z9 = 1;
                    } else {
                        z9 = 0;
                    }
                } else if (i11 > scrollRange) {
                    int overScrollMode2 = getOverScrollMode();
                    if (overScrollMode2 != 0 && (overScrollMode2 != 1 || getScrollRange() <= 0)) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z10 && !d.H(motionEvent, 8194)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        float height2 = (i11 - scrollRange) / getHeight();
                        EdgeEffect edgeEffect2 = this.f804f;
                        a.O(edgeEffect2, height2, 0.5f);
                        edgeEffect2.onRelease();
                        invalidate();
                        i10 = 1;
                    }
                    z9 = i10;
                    i10 = scrollRange;
                } else {
                    z9 = 0;
                    i10 = i11;
                }
                if (i10 != scrollY) {
                    super.scrollTo(getScrollX(), i10);
                    return true;
                }
                return z9;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0104  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z9, i10, i11, i12, i13);
        int i15 = 0;
        this.f806y = false;
        View view = this.A;
        if (view != null && m(view, this)) {
            View view2 = this.A;
            Rect rect = this.f801c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h10 = h(rect);
            if (h10 != 0) {
                scrollBy(0, h10);
            }
        }
        this.A = null;
        if (!this.f807z) {
            if (this.N != null) {
                scrollTo(getScrollX(), this.N.f6306a);
                this.N = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i14 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i14 = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i14 && scrollY >= 0) {
                i15 = paddingTop + scrollY > i14 ? i14 - paddingTop : scrollY;
            }
            if (i15 != scrollY) {
                scrollTo(getScrollX(), i15);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f807z = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.D && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z9) {
        if (!z9) {
            dispatchNestedFling(0.0f, f11, true);
            k((int) f11);
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        c(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        o(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        a(view, view2, i10, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i10, int i11, boolean z9, boolean z10) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        View findNextFocusFromRect;
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        if (rect == null) {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i10);
        } else {
            findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        }
        if (findNextFocusFromRect == null || (true ^ n(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l lVar = (l) parcelable;
        super.onRestoreInstanceState(lVar.getSuperState());
        this.N = lVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        l lVar = new l(super.onSaveInstanceState());
        lVar.f6306a = getScrollY();
        return lVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        k kVar = this.R;
        if (kVar != null) {
            c cVar = (c) kVar;
            h.c(this, (View) cVar.f3635b, (View) cVar.f3636c);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && n(findFocus, 0, i13)) {
            Rect rect = this.f801c;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            i(h(rect));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        return f(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x022d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.I) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.f805x = (int) motionEvent.getY(i10);
            this.I = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.C;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            r1 = 1
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r10
            int r13 = r13 + r0
            if (r11 <= 0) goto L1a
        L17:
            r11 = r0
            r10 = r1
            goto L1e
        L1a:
            if (r11 >= 0) goto L1d
            goto L17
        L1d:
            r10 = r0
        L1e:
            if (r12 <= r13) goto L23
            r12 = r13
        L21:
            r13 = r1
            goto L28
        L23:
            if (r12 >= 0) goto L27
            r12 = r0
            goto L21
        L27:
            r13 = r0
        L28:
            if (r13 == 0) goto L45
            g0.u r2 = r9.P
            android.view.ViewParent r2 = r2.f(r1)
            if (r2 == 0) goto L34
            r2 = r1
            goto L35
        L34:
            r2 = r0
        L35:
            if (r2 != 0) goto L45
            android.widget.OverScroller r2 = r9.f802d
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r9.getScrollRange()
            r3 = r11
            r4 = r12
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L45:
            r9.onOverScrolled(r11, r12, r10, r13)
            if (r10 != 0) goto L4e
            if (r13 == 0) goto L4d
            goto L4e
        L4d:
            r1 = r0
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.q(int, int, int, int):boolean");
    }

    public final boolean r(int i10, int i11, int i12) {
        boolean z9;
        int i13;
        boolean z10;
        boolean z11;
        boolean z12;
        int height = getHeight();
        int scrollY = getScrollY();
        int i14 = height + scrollY;
        if (i10 == 33) {
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z13 = false;
        for (int i15 = 0; i15 < size; i15++) {
            View view2 = focusables.get(i15);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                if (i11 < top && bottom < i12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (view == null) {
                    view = view2;
                    z13 = z11;
                } else {
                    if ((z9 && top < view.getTop()) || (!z9 && bottom > view.getBottom())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z13) {
                        if (z11) {
                            if (!z12) {
                            }
                            view = view2;
                        }
                    } else if (z11) {
                        view = view2;
                        z13 = true;
                    } else {
                        if (!z12) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 >= scrollY && i12 <= i14) {
            z10 = false;
        } else {
            if (z9) {
                i13 = i11 - scrollY;
            } else {
                i13 = i12 - i14;
            }
            i(i13);
            z10 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f806y) {
            Rect rect = this.f801c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int h10 = h(rect);
            if (h10 != 0) {
                scrollBy(0, h10);
            }
        } else {
            this.A = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z9) {
        boolean z10;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int h10 = h(rect);
        if (h10 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (z9) {
                scrollBy(0, h10);
            } else {
                t(0, h10, false);
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z9) {
        VelocityTracker velocityTracker;
        if (z9 && (velocityTracker = this.C) != null) {
            velocityTracker.recycle();
            this.C = null;
        }
        super.requestDisallowInterceptTouchEvent(z9);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f806y = true;
        super.requestLayout();
    }

    public final boolean s(EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float u9 = a.u(edgeEffect) * getHeight();
        float abs = Math.abs(-i10) * 0.35f;
        float f10 = this.f799a * 0.015f;
        double log = Math.log(abs / f10);
        double d10 = S;
        if (((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * f10)) < u9) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width < width2 && i10 >= 0) {
                if (width + i10 > width2) {
                    i10 = width2 - width;
                }
            } else {
                i10 = 0;
            }
            if (height < height2 && i11 >= 0) {
                if (height + i11 > height2) {
                    i11 = height2 - height;
                }
            } else {
                i11 = 0;
            }
            if (i10 != getScrollX() || i11 != getScrollY()) {
                super.scrollTo(i10, i11);
            }
        }
    }

    public void setFillViewport(boolean z9) {
        if (z9 != this.D) {
            this.D = z9;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z9) {
        u uVar = this.P;
        if (uVar.f4258d) {
            WeakHashMap weakHashMap = y0.f4277a;
            n0.z(uVar.f4257c);
        }
        uVar.f4258d = z9;
    }

    public void setOnScrollChangeListener(k kVar) {
        this.R = kVar;
    }

    public void setSmoothScrollingEnabled(boolean z9) {
        this.E = z9;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i10) {
        return this.P.g(i10, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        v(0);
    }

    public final void t(int i10, int i11, boolean z9) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f800b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f802d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z9) {
                this.P.g(2, 1);
            } else {
                v(1);
            }
            this.M = getScrollY();
            WeakHashMap weakHashMap = y0.f4277a;
            h0.k(this);
        } else {
            if (!this.f802d.isFinished()) {
                this.f802d.abortAnimation();
                v(1);
            }
            scrollBy(i10, i11);
        }
        this.f800b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean u(MotionEvent motionEvent) {
        boolean z9;
        EdgeEffect edgeEffect = this.f803e;
        if (a.u(edgeEffect) != 0.0f) {
            a.O(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z9 = true;
        } else {
            z9 = false;
        }
        EdgeEffect edgeEffect2 = this.f804f;
        if (a.u(edgeEffect2) != 0.0f) {
            a.O(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z9;
    }

    public final void v(int i10) {
        this.P.h(i10);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
