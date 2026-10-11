package l6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g0.h0;
import g0.l0;
import g0.n0;
import g0.y0;
import j6.k;
import java.util.WeakHashMap;
import msr.pistream.app.R;
import p7.a0;
import q6.g;

/* loaded from: classes.dex */
public abstract class b extends FrameLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final a f6865z = new a();

    /* renamed from: a, reason: collision with root package name */
    public final k f6866a;

    /* renamed from: b, reason: collision with root package name */
    public int f6867b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6868c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6869d;

    /* renamed from: e, reason: collision with root package name */
    public final int f6870e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6871f;

    /* renamed from: x, reason: collision with root package name */
    public ColorStateList f6872x;

    /* renamed from: y, reason: collision with root package name */
    public PorterDuff.Mode f6873y;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Context context, AttributeSet attributeSet) {
        super(w7.b.Z(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, s5.a.f9921w);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = y0.f4277a;
            n0.s(this, dimensionPixelSize);
        }
        this.f6867b = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f6866a = new k(k.b(context2, attributeSet, 0, 0));
        }
        this.f6868c = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(a0.u(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(a0.Q(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f6869d = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f6870e = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f6871f = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f6865z);
        setFocusable(true);
        if (getBackground() == null) {
            int F = g.F(getBackgroundOverlayColorAlpha(), g.B(this, R.attr.colorSurface), g.B(this, R.attr.colorOnSurface));
            k kVar = this.f6866a;
            if (kVar != null) {
                int i10 = c.f6874a;
                j6.g gVar = new j6.g(kVar);
                gVar.j(ColorStateList.valueOf(F));
                gradientDrawable = gVar;
            } else {
                Resources resources = getResources();
                int i11 = c.f6874a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(F);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f6872x;
            if (colorStateList != null) {
                a0.b.h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = y0.f4277a;
            h0.q(this, gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(c cVar) {
    }

    public float getActionTextColorAlpha() {
        return this.f6869d;
    }

    public int getAnimationMode() {
        return this.f6867b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f6868c;
    }

    public int getMaxInlineActionWidth() {
        return this.f6871f;
    }

    public int getMaxWidth() {
        return this.f6870e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = y0.f4277a;
        l0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f6870e;
        if (i12 > 0 && getMeasuredWidth() > i12) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
        }
    }

    public void setAnimationMode(int i10) {
        this.f6867b = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f6872x != null) {
            drawable = drawable.mutate();
            a0.b.h(drawable, this.f6872x);
            a0.b.i(drawable, this.f6873y);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f6872x = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            a0.b.h(mutate, colorStateList);
            a0.b.i(mutate, this.f6873y);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f6873y = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            a0.b.i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        a aVar;
        if (onClickListener != null) {
            aVar = null;
        } else {
            aVar = f6865z;
        }
        setOnTouchListener(aVar);
        super.setOnClickListener(onClickListener);
    }
}
