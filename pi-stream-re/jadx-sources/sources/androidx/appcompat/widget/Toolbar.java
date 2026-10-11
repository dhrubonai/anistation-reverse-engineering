package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements g0.n {
    public Context A;
    public int B;
    public int C;
    public int D;
    public final int E;
    public final int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public a3 K;
    public int L;
    public int M;
    public final int N;
    public CharSequence O;
    public CharSequence P;
    public ColorStateList Q;
    public ColorStateList R;
    public boolean S;
    public boolean T;
    public final ArrayList U;
    public final ArrayList V;
    public final int[] W;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f375a;

    /* renamed from: a0, reason: collision with root package name */
    public final g0.r f376a0;

    /* renamed from: b, reason: collision with root package name */
    public i1 f377b;

    /* renamed from: b0, reason: collision with root package name */
    public ArrayList f378b0;

    /* renamed from: c, reason: collision with root package name */
    public i1 f379c;

    /* renamed from: c0, reason: collision with root package name */
    public final a4 f380c0;

    /* renamed from: d, reason: collision with root package name */
    public c0 f381d;

    /* renamed from: d0, reason: collision with root package name */
    public g4 f382d0;

    /* renamed from: e, reason: collision with root package name */
    public e0 f383e;

    /* renamed from: e0, reason: collision with root package name */
    public m f384e0;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f385f;

    /* renamed from: f0, reason: collision with root package name */
    public c4 f386f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f387g0;

    /* renamed from: h0, reason: collision with root package name */
    public OnBackInvokedCallback f388h0;

    /* renamed from: i0, reason: collision with root package name */
    public OnBackInvokedDispatcher f389i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f390j0;

    /* renamed from: k0, reason: collision with root package name */
    public final g.f f391k0;

    /* renamed from: x, reason: collision with root package name */
    public final CharSequence f392x;

    /* renamed from: y, reason: collision with root package name */
    public c0 f393y;

    /* renamed from: z, reason: collision with root package name */
    public View f394z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static d4 g(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d4) {
            return new d4((d4) layoutParams);
        }
        if (layoutParams instanceof f.a) {
            return new d4((f.a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d4((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d4(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new i.k(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return g0.m.b(marginLayoutParams) + g0.m.c(marginLayoutParams);
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i10, ArrayList arrayList) {
        boolean z9;
        WeakHashMap weakHashMap = g0.y0.f4277a;
        if (g0.i0.d(this) == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i10, g0.i0.d(this));
        arrayList.clear();
        if (z9) {
            for (int i11 = childCount - 1; i11 >= 0; i11--) {
                View childAt = getChildAt(i11);
                d4 d4Var = (d4) childAt.getLayoutParams();
                if (d4Var.f449b == 0 && r(childAt)) {
                    int i12 = d4Var.f3622a;
                    WeakHashMap weakHashMap2 = g0.y0.f4277a;
                    int d10 = g0.i0.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i12, d10) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = d10 == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            d4 d4Var2 = (d4) childAt2.getLayoutParams();
            if (d4Var2.f449b == 0 && r(childAt2)) {
                int i14 = d4Var2.f3622a;
                WeakHashMap weakHashMap3 = g0.y0.f4277a;
                int d11 = g0.i0.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i14, d11) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = d11 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z9) {
        d4 d4Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            d4Var = new d4();
        } else if (!checkLayoutParams(layoutParams)) {
            d4Var = g(layoutParams);
        } else {
            d4Var = (d4) layoutParams;
        }
        d4Var.f449b = 1;
        if (z9 && this.f394z != null) {
            view.setLayoutParams(d4Var);
            this.V.add(view);
        } else {
            addView(view, d4Var);
        }
    }

    public final void c() {
        if (this.f393y == null) {
            c0 c0Var = new c0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f393y = c0Var;
            c0Var.setImageDrawable(this.f385f);
            this.f393y.setContentDescription(this.f392x);
            d4 d4Var = new d4();
            d4Var.f3622a = (this.E & 112) | 8388611;
            d4Var.f449b = 2;
            this.f393y.setLayoutParams(d4Var);
            this.f393y.setOnClickListener(new f.b(this, 1));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof d4)) {
            return true;
        }
        return false;
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f375a;
        if (actionMenuView.G == null) {
            j.o oVar = (j.o) actionMenuView.getMenu();
            if (this.f386f0 == null) {
                this.f386f0 = new c4(this);
            }
            this.f375a.setExpandedActionViewsExclusive(true);
            oVar.b(this.f386f0, this.A);
            s();
        }
    }

    public final void e() {
        if (this.f375a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f375a = actionMenuView;
            actionMenuView.setPopupTheme(this.B);
            this.f375a.setOnMenuItemClickListener(this.f380c0);
            ActionMenuView actionMenuView2 = this.f375a;
            a4 a4Var = new a4(this);
            actionMenuView2.L = null;
            actionMenuView2.M = a4Var;
            d4 d4Var = new d4();
            d4Var.f3622a = (this.E & 112) | 8388613;
            this.f375a.setLayoutParams(d4Var);
            b(this.f375a, false);
        }
    }

    public final void f() {
        if (this.f381d == null) {
            this.f381d = new c0(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            d4 d4Var = new d4();
            d4Var.f3622a = (this.E & 112) | 8388611;
            this.f381d.setLayoutParams(d4Var);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d4();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        c0 c0Var = this.f393y;
        if (c0Var != null) {
            return c0Var.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        c0 c0Var = this.f393y;
        if (c0Var != null) {
            return c0Var.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        a3 a3Var = this.K;
        if (a3Var != null) {
            if (a3Var.f412g) {
                return a3Var.f406a;
            }
            return a3Var.f407b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.M;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i10;
    }

    public int getContentInsetLeft() {
        a3 a3Var = this.K;
        if (a3Var != null) {
            return a3Var.f406a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        a3 a3Var = this.K;
        if (a3Var != null) {
            return a3Var.f407b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        a3 a3Var = this.K;
        if (a3Var != null) {
            if (a3Var.f412g) {
                return a3Var.f407b;
            }
            return a3Var.f406a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.L;
        if (i10 == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i10;
    }

    public int getCurrentContentInsetEnd() {
        boolean z9;
        j.o oVar;
        ActionMenuView actionMenuView = this.f375a;
        if (actionMenuView != null && (oVar = actionMenuView.G) != null && oVar.hasVisibleItems()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return Math.max(getContentInsetEnd(), Math.max(this.M, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = g0.y0.f4277a;
        if (g0.i0.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = g0.y0.f4277a;
        if (g0.i0.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.L, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        e0 e0Var = this.f383e;
        if (e0Var != null) {
            return e0Var.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        e0 e0Var = this.f383e;
        if (e0Var != null) {
            return e0Var.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f375a.getMenu();
    }

    public View getNavButtonView() {
        return this.f381d;
    }

    public CharSequence getNavigationContentDescription() {
        c0 c0Var = this.f381d;
        if (c0Var != null) {
            return c0Var.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        c0 c0Var = this.f381d;
        if (c0Var != null) {
            return c0Var.getDrawable();
        }
        return null;
    }

    public m getOuterActionMenuPresenter() {
        return this.f384e0;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.f375a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.A;
    }

    public int getPopupTheme() {
        return this.B;
    }

    public CharSequence getSubtitle() {
        return this.P;
    }

    public final TextView getSubtitleTextView() {
        return this.f379c;
    }

    public CharSequence getTitle() {
        return this.O;
    }

    public int getTitleMarginBottom() {
        return this.J;
    }

    public int getTitleMarginEnd() {
        return this.H;
    }

    public int getTitleMarginStart() {
        return this.G;
    }

    public int getTitleMarginTop() {
        return this.I;
    }

    public final TextView getTitleTextView() {
        return this.f377b;
    }

    public u1 getWrapper() {
        if (this.f382d0 == null) {
            this.f382d0 = new g4(this);
        }
        return this.f382d0;
    }

    public final int h(View view, int i10) {
        int i11;
        d4 d4Var = (d4) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i10 > 0) {
            i11 = (measuredHeight - i10) / 2;
        } else {
            i11 = 0;
        }
        int i12 = d4Var.f3622a & 112;
        if (i12 != 16 && i12 != 48 && i12 != 80) {
            i12 = this.N & 112;
        }
        if (i12 != 48) {
            if (i12 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i13 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i14 = ((ViewGroup.MarginLayoutParams) d4Var).topMargin;
                if (i13 < i14) {
                    i13 = i14;
                } else {
                    int i15 = (((height - paddingBottom) - measuredHeight) - i13) - paddingTop;
                    int i16 = ((ViewGroup.MarginLayoutParams) d4Var).bottomMargin;
                    if (i15 < i16) {
                        i13 = Math.max(0, i13 - (i16 - i15));
                    }
                }
                return paddingTop + i13;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) d4Var).bottomMargin) - i11;
        }
        return getPaddingTop() - i11;
    }

    public void k(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public final void l() {
        Iterator it = this.f378b0.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = this.f376a0.f4248b.iterator();
        while (it2.hasNext()) {
            ((androidx.fragment.app.l0) ((g0.t) it2.next())).f925a.j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f378b0 = currentMenuItems2;
    }

    public final boolean m(View view) {
        if (view.getParent() != this && !this.V.contains(view)) {
            return false;
        }
        return true;
    }

    public final int n(View view, int i10, int i11, int[] iArr) {
        d4 d4Var = (d4) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) d4Var).leftMargin - iArr[0];
        int max = Math.max(0, i12) + i10;
        iArr[0] = Math.max(0, -i12);
        int h10 = h(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h10, max + measuredWidth, view.getMeasuredHeight() + h10);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) d4Var).rightMargin + max;
    }

    public final int o(View view, int i10, int i11, int[] iArr) {
        d4 d4Var = (d4) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) d4Var).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int h10 = h(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h10, max, view.getMeasuredHeight() + h10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) d4Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f391k0);
        s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.T = false;
        }
        if (!this.T) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.T = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.T = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0292 A[LOOP:0: B:40:0x0290->B:41:0x0292, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ae A[LOOP:1: B:44:0x02ac->B:45:0x02ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02cd A[LOOP:2: B:48:0x02cb->B:49:0x02cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031b A[LOOP:3: B:57:0x0319->B:58:0x031b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        j.o oVar;
        MenuItem findItem;
        if (!(parcelable instanceof f4)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f4 f4Var = (f4) parcelable;
        super.onRestoreInstanceState(f4Var.f7897a);
        ActionMenuView actionMenuView = this.f375a;
        if (actionMenuView != null) {
            oVar = actionMenuView.G;
        } else {
            oVar = null;
        }
        int i10 = f4Var.f484c;
        if (i10 != 0 && this.f386f0 != null && oVar != null && (findItem = oVar.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (f4Var.f485d) {
            g.f fVar = this.f391k0;
            removeCallbacks(fVar);
            post(fVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        if (this.K == null) {
            this.K = new a3();
        }
        a3 a3Var = this.K;
        boolean z9 = true;
        if (i10 != 1) {
            z9 = false;
        }
        if (z9 != a3Var.f412g) {
            a3Var.f412g = z9;
            if (a3Var.f413h) {
                if (z9) {
                    int i11 = a3Var.f409d;
                    if (i11 == Integer.MIN_VALUE) {
                        i11 = a3Var.f410e;
                    }
                    a3Var.f406a = i11;
                    int i12 = a3Var.f408c;
                    if (i12 == Integer.MIN_VALUE) {
                        i12 = a3Var.f411f;
                    }
                    a3Var.f407b = i12;
                    return;
                }
                int i13 = a3Var.f408c;
                if (i13 == Integer.MIN_VALUE) {
                    i13 = a3Var.f410e;
                }
                a3Var.f406a = i13;
                int i14 = a3Var.f409d;
                if (i14 == Integer.MIN_VALUE) {
                    i14 = a3Var.f411f;
                }
                a3Var.f407b = i14;
                return;
            }
            a3Var.f406a = a3Var.f410e;
            a3Var.f407b = a3Var.f411f;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z9;
        j.q qVar;
        f4 f4Var = new f4(super.onSaveInstanceState());
        c4 c4Var = this.f386f0;
        if (c4Var != null && (qVar = c4Var.f436b) != null) {
            f4Var.f484c = qVar.f5572a;
        }
        ActionMenuView actionMenuView = this.f375a;
        boolean z10 = false;
        if (actionMenuView != null) {
            m mVar = actionMenuView.K;
            if (mVar != null && mVar.f()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                z10 = true;
            }
        }
        f4Var.f485d = z10;
        return f4Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.S = false;
        }
        if (!this.S) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.S = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.S = false;
        }
        return true;
    }

    public final int p(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i15) + Math.max(0, i14);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i13 >= 0) {
            if (mode != 0) {
                i13 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i13);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s() {
        boolean z9;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a10 = b4.a(this);
            c4 c4Var = this.f386f0;
            int i10 = 1;
            boolean z10 = false;
            if (c4Var != null && c4Var.f436b != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && a10 != null) {
                WeakHashMap weakHashMap = g0.y0.f4277a;
                if (g0.k0.b(this) && this.f390j0) {
                    z10 = true;
                }
            }
            if (z10 && this.f389i0 == null) {
                if (this.f388h0 == null) {
                    this.f388h0 = b4.b(new z3(this, i10));
                }
                b4.c(a10, this.f388h0);
                this.f389i0 = a10;
                return;
            }
            if (!z10 && (onBackInvokedDispatcher = this.f389i0) != null) {
                b4.d(onBackInvokedDispatcher, this.f388h0);
                this.f389i0 = null;
            }
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z9) {
        if (this.f390j0 != z9) {
            this.f390j0 = z9;
            s();
        }
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(w7.b.G(getContext(), i10));
    }

    public void setCollapsible(boolean z9) {
        this.f387g0 = z9;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.M) {
            this.M = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.L) {
            this.L = i10;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i10) {
        setLogo(w7.b.G(getContext(), i10));
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(w7.b.G(getContext(), i10));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.f381d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(e4 e4Var) {
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.f375a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.B != i10) {
            this.B = i10;
            if (i10 == 0) {
                this.A = getContext();
            } else {
                this.A = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitleMarginBottom(int i10) {
        this.J = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.H = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.G = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.I = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.N = 8388627;
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new int[2];
        this.f376a0 = new g0.r(new z3(this, 0));
        this.f378b0 = new ArrayList();
        this.f380c0 = new a4(this);
        this.f391k0 = new g.f(this, 2);
        Context context2 = getContext();
        int[] iArr = e.a.f3292x;
        o3 m5 = o3.m(context2, attributeSet, iArr, R.attr.toolbarStyle);
        Object obj = m5.f598b;
        g0.y0.k(this, context, iArr, attributeSet, (TypedArray) obj, R.attr.toolbarStyle);
        this.C = m5.i(28, 0);
        this.D = m5.i(19, 0);
        this.N = ((TypedArray) obj).getInteger(0, 8388627);
        this.E = ((TypedArray) obj).getInteger(2, 48);
        int c6 = m5.c(22, 0);
        c6 = m5.l(27) ? m5.c(27, c6) : c6;
        this.J = c6;
        this.I = c6;
        this.H = c6;
        this.G = c6;
        int c10 = m5.c(25, -1);
        if (c10 >= 0) {
            this.G = c10;
        }
        int c11 = m5.c(24, -1);
        if (c11 >= 0) {
            this.H = c11;
        }
        int c12 = m5.c(26, -1);
        if (c12 >= 0) {
            this.I = c12;
        }
        int c13 = m5.c(23, -1);
        if (c13 >= 0) {
            this.J = c13;
        }
        this.F = m5.d(13, -1);
        int c14 = m5.c(9, Integer.MIN_VALUE);
        int c15 = m5.c(5, Integer.MIN_VALUE);
        int d10 = m5.d(7, 0);
        int d11 = m5.d(8, 0);
        if (this.K == null) {
            this.K = new a3();
        }
        a3 a3Var = this.K;
        a3Var.f413h = false;
        if (d10 != Integer.MIN_VALUE) {
            a3Var.f410e = d10;
            a3Var.f406a = d10;
        }
        if (d11 != Integer.MIN_VALUE) {
            a3Var.f411f = d11;
            a3Var.f407b = d11;
        }
        if (c14 != Integer.MIN_VALUE || c15 != Integer.MIN_VALUE) {
            a3Var.a(c14, c15);
        }
        this.L = m5.c(10, Integer.MIN_VALUE);
        this.M = m5.c(6, Integer.MIN_VALUE);
        this.f385f = m5.e(4);
        this.f392x = m5.k(3);
        CharSequence k10 = m5.k(21);
        if (!TextUtils.isEmpty(k10)) {
            setTitle(k10);
        }
        CharSequence k11 = m5.k(18);
        if (!TextUtils.isEmpty(k11)) {
            setSubtitle(k11);
        }
        this.A = getContext();
        setPopupTheme(m5.i(17, 0));
        Drawable e10 = m5.e(16);
        if (e10 != null) {
            setNavigationIcon(e10);
        }
        CharSequence k12 = m5.k(15);
        if (!TextUtils.isEmpty(k12)) {
            setNavigationContentDescription(k12);
        }
        Drawable e11 = m5.e(11);
        if (e11 != null) {
            setLogo(e11);
        }
        CharSequence k13 = m5.k(12);
        if (!TextUtils.isEmpty(k13)) {
            setLogoDescription(k13);
        }
        if (m5.l(29)) {
            setTitleTextColor(m5.b(29));
        }
        if (m5.l(20)) {
            setSubtitleTextColor(m5.b(20));
        }
        if (m5.l(14)) {
            k(m5.i(14, 0));
        }
        m5.p();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d4(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        c0 c0Var = this.f393y;
        if (c0Var != null) {
            c0Var.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f393y.setImageDrawable(drawable);
        } else {
            c0 c0Var = this.f393y;
            if (c0Var != null) {
                c0Var.setImageDrawable(this.f385f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f383e == null) {
                this.f383e = new e0(getContext(), null, 0);
            }
            if (!m(this.f383e)) {
                b(this.f383e, true);
            }
        } else {
            e0 e0Var = this.f383e;
            if (e0Var != null && m(e0Var)) {
                removeView(this.f383e);
                this.V.remove(this.f383e);
            }
        }
        e0 e0Var2 = this.f383e;
        if (e0Var2 != null) {
            e0Var2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f383e == null) {
            this.f383e = new e0(getContext(), null, 0);
        }
        e0 e0Var = this.f383e;
        if (e0Var != null) {
            e0Var.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        c0 c0Var = this.f381d;
        if (c0Var != null) {
            c0Var.setContentDescription(charSequence);
            p7.a0.W(this.f381d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.f381d)) {
                b(this.f381d, true);
            }
        } else {
            c0 c0Var = this.f381d;
            if (c0Var != null && m(c0Var)) {
                removeView(this.f381d);
                this.V.remove(this.f381d);
            }
        }
        c0 c0Var2 = this.f381d;
        if (c0Var2 != null) {
            c0Var2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f379c == null) {
                Context context = getContext();
                i1 i1Var = new i1(context, null);
                this.f379c = i1Var;
                i1Var.setSingleLine();
                this.f379c.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.D;
                if (i10 != 0) {
                    this.f379c.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.R;
                if (colorStateList != null) {
                    this.f379c.setTextColor(colorStateList);
                }
            }
            if (!m(this.f379c)) {
                b(this.f379c, true);
            }
        } else {
            i1 i1Var2 = this.f379c;
            if (i1Var2 != null && m(i1Var2)) {
                removeView(this.f379c);
                this.V.remove(this.f379c);
            }
        }
        i1 i1Var3 = this.f379c;
        if (i1Var3 != null) {
            i1Var3.setText(charSequence);
        }
        this.P = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.R = colorStateList;
        i1 i1Var = this.f379c;
        if (i1Var != null) {
            i1Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f377b == null) {
                Context context = getContext();
                i1 i1Var = new i1(context, null);
                this.f377b = i1Var;
                i1Var.setSingleLine();
                this.f377b.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.C;
                if (i10 != 0) {
                    this.f377b.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.Q;
                if (colorStateList != null) {
                    this.f377b.setTextColor(colorStateList);
                }
            }
            if (!m(this.f377b)) {
                b(this.f377b, true);
            }
        } else {
            i1 i1Var2 = this.f377b;
            if (i1Var2 != null && m(i1Var2)) {
                removeView(this.f377b);
                this.V.remove(this.f377b);
            }
        }
        i1 i1Var3 = this.f377b;
        if (i1Var3 != null) {
            i1Var3.setText(charSequence);
        }
        this.O = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.Q = colorStateList;
        i1 i1Var = this.f377b;
        if (i1Var != null) {
            i1Var.setTextColor(colorStateList);
        }
    }
}
