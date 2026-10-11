package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public CharSequence A;
    public View B;
    public View C;
    public View D;
    public LinearLayout E;
    public TextView F;
    public TextView G;
    public final int H;
    public final int I;
    public boolean J;
    public final int K;

    /* renamed from: a, reason: collision with root package name */
    public final a f315a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f316b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f317c;

    /* renamed from: d, reason: collision with root package name */
    public m f318d;

    /* renamed from: e, reason: collision with root package name */
    public int f319e;

    /* renamed from: f, reason: collision with root package name */
    public g0.l1 f320f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f321x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f322y;

    /* renamed from: z, reason: collision with root package name */
    public CharSequence f323z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        this.f315a = new a(this);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.f316b = new ContextThemeWrapper(context, typedValue.resourceId);
        } else {
            this.f316b = context;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.a.f3273d, R.attr.actionModeStyle, 0);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = w7.b.G(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        WeakHashMap weakHashMap = g0.y0.f4277a;
        g0.h0.q(this, drawable);
        this.H = obtainStyledAttributes.getResourceId(5, 0);
        this.I = obtainStyledAttributes.getResourceId(4, 0);
        this.f319e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.K = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public static int f(View view, int i10, int i11) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - 0);
    }

    public static int j(View view, int i10, int i11, int i12, boolean z9) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = ((i12 - measuredHeight) / 2) + i11;
        if (z9) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        if (z9) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    public final void c(i.b bVar) {
        View view = this.B;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.K, (ViewGroup) this, false);
            this.B = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.B);
        }
        View findViewById = this.B.findViewById(R.id.action_mode_close_button);
        this.C = findViewById;
        findViewById.setOnClickListener(new c(this, bVar));
        j.o oVar = (j.o) bVar.c();
        m mVar = this.f318d;
        if (mVar != null) {
            mVar.d();
            h hVar = mVar.K;
            if (hVar != null && hVar.b()) {
                hVar.f5496j.dismiss();
            }
        }
        m mVar2 = new m(getContext());
        this.f318d = mVar2;
        mVar2.C = true;
        mVar2.D = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        oVar.b(this.f318d, this.f316b);
        m mVar3 = this.f318d;
        j.e0 e0Var = mVar3.f570y;
        if (e0Var == null) {
            j.e0 e0Var2 = (j.e0) mVar3.f566d.inflate(mVar3.f568f, (ViewGroup) this, false);
            mVar3.f570y = e0Var2;
            e0Var2.a(mVar3.f565c);
            mVar3.e();
        }
        j.e0 e0Var3 = mVar3.f570y;
        if (e0Var != e0Var3) {
            ((ActionMenuView) e0Var3).setPresenter(mVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) e0Var3;
        this.f317c = actionMenuView;
        WeakHashMap weakHashMap = g0.y0.f4277a;
        g0.h0.q(actionMenuView, null);
        addView(this.f317c, layoutParams);
    }

    public final void d() {
        int i10;
        if (this.E == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.E = linearLayout;
            this.F = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.G = (TextView) this.E.findViewById(R.id.action_bar_subtitle);
            int i11 = this.H;
            if (i11 != 0) {
                this.F.setTextAppearance(getContext(), i11);
            }
            int i12 = this.I;
            if (i12 != 0) {
                this.G.setTextAppearance(getContext(), i12);
            }
        }
        this.F.setText(this.f323z);
        this.G.setText(this.A);
        boolean z9 = !TextUtils.isEmpty(this.f323z);
        boolean z10 = !TextUtils.isEmpty(this.A);
        TextView textView = this.G;
        int i13 = 0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        textView.setVisibility(i10);
        LinearLayout linearLayout2 = this.E;
        if (!z9 && !z10) {
            i13 = 8;
        }
        linearLayout2.setVisibility(i13);
        if (this.E.getParent() == null) {
            addView(this.E);
        }
    }

    public final void e() {
        removeAllViews();
        this.D = null;
        this.f317c = null;
        this.f318d = null;
        View view = this.C;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.View
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, e.a.f3270a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        m mVar = this.f318d;
        if (mVar != null) {
            Configuration configuration2 = mVar.f564b.getResources().getConfiguration();
            int i11 = configuration2.screenWidthDp;
            int i12 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i11 <= 600 && ((i11 <= 960 || i12 <= 720) && (i11 <= 720 || i12 <= 960))) {
                if (i11 < 500 && ((i11 <= 640 || i12 <= 480) && (i11 <= 480 || i12 <= 640))) {
                    if (i11 >= 360) {
                        i10 = 3;
                    } else {
                        i10 = 2;
                    }
                } else {
                    i10 = 4;
                }
            } else {
                i10 = 5;
            }
            mVar.G = i10;
            j.o oVar = mVar.f565c;
            if (oVar != null) {
                oVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        if (this.f320f != null) {
            return this.f315a.f400b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f319e;
    }

    public CharSequence getSubtitle() {
        return this.A;
    }

    public CharSequence getTitle() {
        return this.f323z;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f322y = false;
        }
        if (!this.f322y) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f322y = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f322y = false;
        }
        return true;
    }

    @Override // android.view.View
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f321x = false;
        }
        if (!this.f321x) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f321x = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f321x = false;
        }
        return true;
    }

    @Override // android.view.View
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            g0.l1 l1Var = this.f320f;
            if (l1Var != null) {
                l1Var.b();
            }
            super.setVisibility(i10);
        }
    }

    public final g0.l1 l(int i10, long j4) {
        g0.l1 l1Var = this.f320f;
        if (l1Var != null) {
            l1Var.b();
        }
        a aVar = this.f315a;
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            g0.l1 a10 = g0.y0.a(this);
            a10.a(1.0f);
            a10.c(j4);
            aVar.f401c.f320f = a10;
            aVar.f400b = i10;
            a10.d(aVar);
            return a10;
        }
        g0.l1 a11 = g0.y0.a(this);
        a11.a(0.0f);
        a11.c(j4);
        aVar.f401c.f320f = a11;
        aVar.f400b = i10;
        a11.d(aVar);
        return a11;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m mVar = this.f318d;
        if (mVar != null) {
            mVar.d();
            h hVar = this.f318d.K;
            if (hVar != null && hVar.b()) {
                hVar.f5496j.dismiss();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int paddingRight;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean a10 = n4.a(this);
        if (a10) {
            paddingLeft = (i12 - i10) - getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.B;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.B.getLayoutParams();
            if (a10) {
                i14 = marginLayoutParams.rightMargin;
            } else {
                i14 = marginLayoutParams.leftMargin;
            }
            if (a10) {
                i15 = marginLayoutParams.leftMargin;
            } else {
                i15 = marginLayoutParams.rightMargin;
            }
            if (a10) {
                i16 = paddingLeft - i14;
            } else {
                i16 = paddingLeft + i14;
            }
            int j4 = j(this.B, i16, paddingTop, paddingTop2, a10) + i16;
            if (a10) {
                i17 = j4 - i15;
            } else {
                i17 = j4 + i15;
            }
            paddingLeft = i17;
        }
        LinearLayout linearLayout = this.E;
        if (linearLayout != null && this.D == null && linearLayout.getVisibility() != 8) {
            paddingLeft += j(this.E, paddingLeft, paddingTop, paddingTop2, a10);
        }
        View view2 = this.D;
        if (view2 != null) {
            j(view2, paddingLeft, paddingTop, paddingTop2, a10);
        }
        if (a10) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = (i12 - i10) - getPaddingRight();
        }
        ActionMenuView actionMenuView = this.f317c;
        if (actionMenuView != null) {
            j(actionMenuView, paddingRight, paddingTop, paddingTop2, !a10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        boolean z9;
        int i13;
        int i14 = 1073741824;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            if (View.MeasureSpec.getMode(i11) != 0) {
                int size = View.MeasureSpec.getSize(i10);
                int i15 = this.f319e;
                if (i15 <= 0) {
                    i15 = View.MeasureSpec.getSize(i11);
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                int i16 = i15 - paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16, Integer.MIN_VALUE);
                View view = this.B;
                if (view != null) {
                    int f10 = f(view, paddingLeft, makeMeasureSpec);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.B.getLayoutParams();
                    paddingLeft = f10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
                }
                ActionMenuView actionMenuView = this.f317c;
                if (actionMenuView != null && actionMenuView.getParent() == this) {
                    paddingLeft = f(this.f317c, paddingLeft, makeMeasureSpec);
                }
                LinearLayout linearLayout = this.E;
                if (linearLayout != null && this.D == null) {
                    if (this.J) {
                        this.E.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                        int measuredWidth = this.E.getMeasuredWidth();
                        if (measuredWidth <= paddingLeft) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            paddingLeft -= measuredWidth;
                        }
                        LinearLayout linearLayout2 = this.E;
                        if (z9) {
                            i13 = 0;
                        } else {
                            i13 = 8;
                        }
                        linearLayout2.setVisibility(i13);
                    } else {
                        paddingLeft = f(linearLayout, paddingLeft, makeMeasureSpec);
                    }
                }
                View view2 = this.D;
                if (view2 != null) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    int i17 = layoutParams.width;
                    if (i17 != -2) {
                        i12 = 1073741824;
                    } else {
                        i12 = Integer.MIN_VALUE;
                    }
                    if (i17 >= 0) {
                        paddingLeft = Math.min(i17, paddingLeft);
                    }
                    int i18 = layoutParams.height;
                    if (i18 == -2) {
                        i14 = Integer.MIN_VALUE;
                    }
                    if (i18 >= 0) {
                        i16 = Math.min(i18, i16);
                    }
                    this.D.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i16, i14));
                }
                if (this.f319e <= 0) {
                    int childCount = getChildCount();
                    int i19 = 0;
                    for (int i20 = 0; i20 < childCount; i20++) {
                        int measuredHeight = getChildAt(i20).getMeasuredHeight() + paddingBottom;
                        if (measuredHeight > i19) {
                            i19 = measuredHeight;
                        }
                    }
                    setMeasuredDimension(size, i19);
                    return;
                }
                setMeasuredDimension(size, i15);
                return;
            }
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
    }

    public void setContentHeight(int i10) {
        this.f319e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.D;
        if (view2 != null) {
            removeView(view2);
        }
        this.D = view;
        if (view != null && (linearLayout = this.E) != null) {
            removeView(linearLayout);
            this.E = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.A = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f323z = charSequence;
        d();
        g0.y0.m(this, charSequence);
    }

    public void setTitleOptional(boolean z9) {
        if (z9 != this.J) {
            requestLayout();
        }
        this.J = z9;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
