package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* loaded from: classes.dex */
public class ActionMenuView extends g2 implements j.n, j.e0 {
    public j.o G;
    public Context H;
    public int I;
    public boolean J;
    public m K;
    public j.b0 L;
    public j.m M;
    public boolean N;
    public int O;
    public final int P;
    public final int Q;
    public p R;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.P = (int) (56.0f * f10);
        this.Q = (int) (f10 * 4.0f);
        this.H = context;
        this.I = 0;
    }

    public static o l(ViewGroup.LayoutParams layoutParams) {
        o oVar;
        if (layoutParams != null) {
            if (layoutParams instanceof o) {
                oVar = new o((o) layoutParams);
            } else {
                oVar = new o(layoutParams);
            }
            if (((LinearLayout.LayoutParams) oVar).gravity <= 0) {
                ((LinearLayout.LayoutParams) oVar).gravity = 16;
            }
            return oVar;
        }
        o oVar2 = new o();
        ((LinearLayout.LayoutParams) oVar2).gravity = 16;
        return oVar2;
    }

    @Override // j.e0
    public final void a(j.o oVar) {
        this.G = oVar;
    }

    @Override // androidx.appcompat.widget.g2, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o;
    }

    @Override // j.n
    public final boolean d(j.q qVar) {
        return this.G.q(qVar, null, 0);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.g2, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = new o();
        ((LinearLayout.LayoutParams) oVar).gravity = 16;
        return oVar;
    }

    @Override // androidx.appcompat.widget.g2, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }

    public Menu getMenu() {
        if (this.G == null) {
            Context context = getContext();
            j.o oVar = new j.o(context);
            this.G = oVar;
            oVar.f5550e = new f.p0(this, 5);
            m mVar = new m(context);
            this.K = mVar;
            mVar.C = true;
            mVar.D = true;
            j.b0 b0Var = this.L;
            if (b0Var == null) {
                b0Var = new j6.e(4);
            }
            mVar.f567e = b0Var;
            this.G.b(mVar, this.H);
            m mVar2 = this.K;
            mVar2.f570y = this;
            this.G = mVar2.f565c;
        }
        return this.G;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        m mVar = this.K;
        l lVar = mVar.f571z;
        if (lVar != null) {
            return lVar.getDrawable();
        }
        if (mVar.B) {
            return mVar.A;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.I;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.g2
    /* renamed from: h */
    public final f2 generateDefaultLayoutParams() {
        o oVar = new o();
        ((LinearLayout.LayoutParams) oVar).gravity = 16;
        return oVar;
    }

    @Override // androidx.appcompat.widget.g2
    /* renamed from: i */
    public final f2 generateLayoutParams(AttributeSet attributeSet) {
        return new o(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.g2
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ f2 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return l(layoutParams);
    }

    public final boolean m(int i10) {
        boolean z9 = false;
        if (i10 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i10 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i10);
        if (i10 < getChildCount() && (childAt instanceof n)) {
            z9 = false | ((n) childAt).a();
        }
        if (i10 > 0 && (childAt2 instanceof n)) {
            return z9 | ((n) childAt2).b();
        }
        return z9;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m mVar = this.K;
        if (mVar != null) {
            mVar.e();
            if (this.K.f()) {
                this.K.d();
                this.K.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m mVar = this.K;
        if (mVar != null) {
            mVar.d();
            h hVar = mVar.K;
            if (hVar != null && hVar.b()) {
                hVar.f5496j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.g2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int i14;
        int width;
        int i15;
        if (!this.N) {
            super.onLayout(z9, i10, i11, i12, i13);
            return;
        }
        int childCount = getChildCount();
        int i16 = (i13 - i11) / 2;
        int dividerWidth = getDividerWidth();
        int i17 = i12 - i10;
        int paddingRight = (i17 - getPaddingRight()) - getPaddingLeft();
        boolean a10 = n4.a(this);
        int i18 = 0;
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                o oVar = (o) childAt.getLayoutParams();
                if (oVar.f582a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m(i20)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a10) {
                        i15 = getPaddingLeft() + ((LinearLayout.LayoutParams) oVar).leftMargin;
                        width = i15 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) oVar).rightMargin;
                        i15 = width - measuredWidth;
                    }
                    int i21 = i16 - (measuredHeight / 2);
                    childAt.layout(i15, i21, width, measuredHeight + i21);
                    paddingRight -= measuredWidth;
                    i18 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) oVar).leftMargin) + ((LinearLayout.LayoutParams) oVar).rightMargin;
                    m(i20);
                    i19++;
                }
            }
        }
        if (childCount == 1 && i18 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i22 = (i17 / 2) - (measuredWidth2 / 2);
            int i23 = i16 - (measuredHeight2 / 2);
            childAt2.layout(i22, i23, measuredWidth2 + i22, measuredHeight2 + i23);
            return;
        }
        int i24 = i19 - (i18 ^ 1);
        if (i24 > 0) {
            i14 = paddingRight / i24;
        } else {
            i14 = 0;
        }
        int max = Math.max(0, i14);
        if (a10) {
            int width2 = getWidth() - getPaddingRight();
            for (int i25 = 0; i25 < childCount; i25++) {
                View childAt3 = getChildAt(i25);
                o oVar2 = (o) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !oVar2.f582a) {
                    int i26 = width2 - ((LinearLayout.LayoutParams) oVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i27 = i16 - (measuredHeight3 / 2);
                    childAt3.layout(i26 - measuredWidth3, i27, i26, measuredHeight3 + i27);
                    width2 = i26 - ((measuredWidth3 + ((LinearLayout.LayoutParams) oVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i28 = 0; i28 < childCount; i28++) {
            View childAt4 = getChildAt(i28);
            o oVar3 = (o) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !oVar3.f582a) {
                int i29 = paddingLeft + ((LinearLayout.LayoutParams) oVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i30 = i16 - (measuredHeight4 / 2);
                childAt4.layout(i29, i30, i29 + measuredWidth4, measuredHeight4 + i30);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) oVar3).rightMargin + max + i29;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // androidx.appcompat.widget.g2, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z9;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        int i13;
        boolean z13;
        int i14;
        int i15;
        int i16;
        int i17;
        ?? r42;
        boolean z14;
        int i18;
        int i19;
        int i20;
        ActionMenuItemView actionMenuItemView;
        boolean z15;
        int i21;
        boolean z16;
        j.o oVar;
        boolean z17 = this.N;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.N = z9;
        if (z17 != z9) {
            this.O = 0;
        }
        int size = View.MeasureSpec.getSize(i10);
        if (this.N && (oVar = this.G) != null && size != this.O) {
            this.O = size;
            oVar.p(true);
        }
        int childCount = getChildCount();
        if (this.N && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i10);
            int size3 = View.MeasureSpec.getSize(i11);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
            int i22 = size2 - paddingRight;
            int i23 = this.P;
            int i24 = i22 / i23;
            int i25 = i22 % i23;
            if (i24 == 0) {
                setMeasuredDimension(i22, 0);
                return;
            }
            int i26 = (i25 / i24) + i23;
            int childCount2 = getChildCount();
            int i27 = 0;
            int i28 = 0;
            int i29 = 0;
            int i30 = 0;
            boolean z18 = false;
            int i31 = 0;
            long j4 = 0;
            while (true) {
                i12 = this.Q;
                if (i30 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i30);
                int i32 = size3;
                int i33 = i22;
                if (childAt.getVisibility() == 8) {
                    i19 = mode;
                    i20 = paddingBottom;
                } else {
                    boolean z19 = childAt instanceof ActionMenuItemView;
                    int i34 = i28 + 1;
                    if (z19) {
                        childAt.setPadding(i12, 0, i12, 0);
                    }
                    o oVar2 = (o) childAt.getLayoutParams();
                    oVar2.f587f = false;
                    oVar2.f584c = 0;
                    oVar2.f583b = 0;
                    oVar2.f585d = false;
                    ((LinearLayout.LayoutParams) oVar2).leftMargin = 0;
                    ((LinearLayout.LayoutParams) oVar2).rightMargin = 0;
                    if (z19 && ((ActionMenuItemView) childAt).l()) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    oVar2.f586e = z14;
                    if (oVar2.f582a) {
                        i18 = 1;
                    } else {
                        i18 = i24;
                    }
                    o oVar3 = (o) childAt.getLayoutParams();
                    i19 = mode;
                    i20 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z19) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && actionMenuItemView.l()) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (i18 > 0 && (!z15 || i18 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i18 * i26, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i21 = measuredWidth / i26;
                        if (measuredWidth % i26 != 0) {
                            i21++;
                        }
                        if (z15 && i21 < 2) {
                            i21 = 2;
                        }
                    } else {
                        i21 = 0;
                    }
                    if (!oVar3.f582a && z15) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    oVar3.f585d = z16;
                    oVar3.f583b = i21;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i26 * i21, 1073741824), makeMeasureSpec);
                    i29 = Math.max(i29, i21);
                    if (oVar2.f585d) {
                        i31++;
                    }
                    if (oVar2.f582a) {
                        z18 = true;
                    }
                    i24 -= i21;
                    i27 = Math.max(i27, childAt.getMeasuredHeight());
                    if (i21 == 1) {
                        j4 |= 1 << i30;
                    }
                    i28 = i34;
                }
                i30++;
                size3 = i32;
                i22 = i33;
                paddingBottom = i20;
                mode = i19;
            }
            int i35 = mode;
            int i36 = i22;
            int i37 = size3;
            if (z18 && i28 == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z20 = false;
            while (i31 > 0 && i24 > 0) {
                int i38 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                int i39 = 0;
                int i40 = 0;
                long j10 = 0;
                while (i40 < childCount2) {
                    o oVar4 = (o) getChildAt(i40).getLayoutParams();
                    boolean z21 = z20;
                    if (oVar4.f585d) {
                        int i41 = oVar4.f583b;
                        if (i41 < i38) {
                            j10 = 1 << i40;
                            i38 = i41;
                            i39 = 1;
                        } else if (i41 == i38) {
                            j10 |= 1 << i40;
                            i39++;
                        }
                    }
                    i40++;
                    z20 = z21;
                }
                z11 = z20;
                j4 |= j10;
                if (i39 > i24) {
                    break;
                }
                int i42 = i38 + 1;
                int i43 = 0;
                while (i43 < childCount2) {
                    View childAt2 = getChildAt(i43);
                    o oVar5 = (o) childAt2.getLayoutParams();
                    int i44 = i27;
                    int i45 = childMeasureSpec;
                    int i46 = childCount2;
                    long j11 = 1 << i43;
                    if ((j10 & j11) == 0) {
                        if (oVar5.f583b == i42) {
                            j4 |= j11;
                        }
                    } else {
                        if (z10 && oVar5.f586e) {
                            r42 = 1;
                            r42 = 1;
                            if (i24 == 1) {
                                childAt2.setPadding(i12 + i26, 0, i12, 0);
                            }
                        } else {
                            r42 = 1;
                        }
                        oVar5.f583b += r42;
                        oVar5.f587f = r42;
                        i24--;
                    }
                    i43++;
                    childMeasureSpec = i45;
                    i27 = i44;
                    childCount2 = i46;
                }
                z20 = true;
            }
            z11 = z20;
            int i47 = i27;
            int i48 = childMeasureSpec;
            int i49 = childCount2;
            if (!z18 && i28 == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (i24 > 0 && j4 != 0 && (i24 < i28 - 1 || z12 || i29 > 1)) {
                float bitCount = Long.bitCount(j4);
                if (!z12) {
                    if ((j4 & 1) != 0 && !((o) getChildAt(0).getLayoutParams()).f586e) {
                        bitCount -= 0.5f;
                    }
                    int i50 = i49 - 1;
                    if ((j4 & (1 << i50)) != 0 && !((o) getChildAt(i50).getLayoutParams()).f586e) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i17 = (int) ((i24 * i26) / bitCount);
                } else {
                    i17 = 0;
                }
                boolean z22 = z11;
                i13 = i49;
                for (int i51 = 0; i51 < i13; i51++) {
                    if ((j4 & (1 << i51)) != 0) {
                        View childAt3 = getChildAt(i51);
                        o oVar6 = (o) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            oVar6.f584c = i17;
                            oVar6.f587f = true;
                            if (i51 == 0 && !oVar6.f586e) {
                                ((LinearLayout.LayoutParams) oVar6).leftMargin = (-i17) / 2;
                            }
                            z22 = true;
                        } else {
                            if (oVar6.f582a) {
                                oVar6.f584c = i17;
                                oVar6.f587f = true;
                                ((LinearLayout.LayoutParams) oVar6).rightMargin = (-i17) / 2;
                                z22 = true;
                            } else {
                                if (i51 != 0) {
                                    ((LinearLayout.LayoutParams) oVar6).leftMargin = i17 / 2;
                                }
                                if (i51 != i13 - 1) {
                                    ((LinearLayout.LayoutParams) oVar6).rightMargin = i17 / 2;
                                }
                            }
                        }
                    }
                }
                z13 = z22;
            } else {
                i13 = i49;
                z13 = z11;
            }
            if (z13) {
                int i52 = 0;
                while (i52 < i13) {
                    View childAt4 = getChildAt(i52);
                    o oVar7 = (o) childAt4.getLayoutParams();
                    if (!oVar7.f587f) {
                        i16 = i48;
                    } else {
                        i16 = i48;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((oVar7.f583b * i26) + oVar7.f584c, 1073741824), i16);
                    }
                    i52++;
                    i48 = i16;
                }
            }
            if (i35 != 1073741824) {
                i15 = i36;
                i14 = i47;
            } else {
                i14 = i37;
                i15 = i36;
            }
            setMeasuredDimension(i15, i14);
            return;
        }
        for (int i53 = 0; i53 < childCount; i53++) {
            o oVar8 = (o) getChildAt(i53).getLayoutParams();
            ((LinearLayout.LayoutParams) oVar8).rightMargin = 0;
            ((LinearLayout.LayoutParams) oVar8).leftMargin = 0;
        }
        super.onMeasure(i10, i11);
    }

    public void setExpandedActionViewsExclusive(boolean z9) {
        this.K.H = z9;
    }

    public void setOnMenuItemClickListener(p pVar) {
        this.R = pVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        m mVar = this.K;
        l lVar = mVar.f571z;
        if (lVar != null) {
            lVar.setImageDrawable(drawable);
        } else {
            mVar.B = true;
            mVar.A = drawable;
        }
    }

    public void setOverflowReserved(boolean z9) {
        this.J = z9;
    }

    public void setPopupTheme(int i10) {
        if (this.I != i10) {
            this.I = i10;
            if (i10 == 0) {
                this.H = getContext();
            } else {
                this.H = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setPresenter(m mVar) {
        this.K = mVar;
        mVar.f570y = this;
        this.G = mVar.f565c;
    }

    @Override // androidx.appcompat.widget.g2, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new o(getContext(), attributeSet);
    }
}
