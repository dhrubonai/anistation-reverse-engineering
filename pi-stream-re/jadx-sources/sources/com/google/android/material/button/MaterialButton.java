package com.google.android.material.button;

import a3.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.s;
import g0.i0;
import g0.y0;
import j6.j;
import j6.k;
import j6.v;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k0.p;
import k3.d;
import p7.a0;
import w7.b;
import x5.a;
import x5.c;

/* loaded from: classes.dex */
public class MaterialButton extends s implements Checkable, v {
    public static final int[] I = {R.attr.state_checkable};
    public static final int[] J = {R.attr.state_checked};
    public String A;
    public int B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;

    /* renamed from: d, reason: collision with root package name */
    public final c f2680d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f2681e;

    /* renamed from: f, reason: collision with root package name */
    public a f2682f;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuff.Mode f2683x;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f2684y;

    /* renamed from: z, reason: collision with root package name */
    public Drawable f2685z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(b.Z(context, attributeSet, msr.pistream.app.R.attr.materialButtonStyle, msr.pistream.app.R.style.Widget_MaterialComponents_Button), attributeSet, msr.pistream.app.R.attr.materialButtonStyle);
        this.f2681e = new LinkedHashSet();
        this.F = false;
        this.G = false;
        Context context2 = getContext();
        TypedArray N = b.N(context2, attributeSet, s5.a.f9908i, msr.pistream.app.R.attr.materialButtonStyle, msr.pistream.app.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.E = N.getDimensionPixelSize(12, 0);
        this.f2683x = a0.Q(N.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f2684y = a0.u(getContext(), N, 14);
        this.f2685z = a0.x(getContext(), N, 10);
        this.H = N.getInteger(11, 1);
        this.B = N.getDimensionPixelSize(13, 0);
        c cVar = new c(this, new k(k.b(context2, attributeSet, msr.pistream.app.R.attr.materialButtonStyle, msr.pistream.app.R.style.Widget_MaterialComponents_Button)));
        this.f2680d = cVar;
        cVar.f11283c = N.getDimensionPixelOffset(1, 0);
        cVar.f11284d = N.getDimensionPixelOffset(2, 0);
        cVar.f11285e = N.getDimensionPixelOffset(3, 0);
        cVar.f11286f = N.getDimensionPixelOffset(4, 0);
        if (N.hasValue(8)) {
            int dimensionPixelSize = N.getDimensionPixelSize(8, -1);
            cVar.f11287g = dimensionPixelSize;
            k kVar = cVar.f11282b;
            float f10 = dimensionPixelSize;
            kVar.getClass();
            j jVar = new j(kVar);
            jVar.f6208e = new j6.a(f10);
            jVar.f6209f = new j6.a(f10);
            jVar.f6210g = new j6.a(f10);
            jVar.f6211h = new j6.a(f10);
            cVar.c(new k(jVar));
            cVar.f11295p = true;
        }
        cVar.f11288h = N.getDimensionPixelSize(20, 0);
        cVar.f11289i = a0.Q(N.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        cVar.f11290j = a0.u(getContext(), N, 6);
        cVar.f11291k = a0.u(getContext(), N, 19);
        cVar.f11292l = a0.u(getContext(), N, 16);
        cVar.f11296q = N.getBoolean(5, false);
        cVar.f11299t = N.getDimensionPixelSize(9, 0);
        cVar.f11297r = N.getBoolean(21, true);
        WeakHashMap weakHashMap = y0.f4277a;
        int f11 = i0.f(this);
        int paddingTop = getPaddingTop();
        int e10 = i0.e(this);
        int paddingBottom = getPaddingBottom();
        if (N.hasValue(0)) {
            cVar.o = true;
            setSupportBackgroundTintList(cVar.f11290j);
            setSupportBackgroundTintMode(cVar.f11289i);
        } else {
            cVar.e();
        }
        i0.k(this, f11 + cVar.f11283c, paddingTop + cVar.f11285e, e10 + cVar.f11284d, paddingBottom + cVar.f11286f);
        N.recycle();
        setCompoundDrawablePadding(this.E);
        c(this.f2685z != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f10 = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            f10 = Math.max(f10, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(f10);
    }

    public final boolean a() {
        c cVar = this.f2680d;
        if (cVar != null && !cVar.o) {
            return true;
        }
        return false;
    }

    public final void b() {
        boolean z9;
        boolean z10;
        int i10 = this.H;
        boolean z11 = false;
        if (i10 != 1 && i10 != 2) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            p.e(this, this.f2685z, null, null, null);
            return;
        }
        if (i10 != 3 && i10 != 4) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            p.e(this, null, null, this.f2685z, null);
            return;
        }
        if (i10 == 16 || i10 == 32) {
            z11 = true;
        }
        if (z11) {
            p.e(this, null, this.f2685z, null, null);
        }
    }

    public final void c(boolean z9) {
        boolean z10;
        boolean z11;
        boolean z12;
        Drawable drawable = this.f2685z;
        boolean z13 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f2685z = mutate;
            a0.b.h(mutate, this.f2684y);
            PorterDuff.Mode mode = this.f2683x;
            if (mode != null) {
                a0.b.i(this.f2685z, mode);
            }
            int i10 = this.B;
            if (i10 == 0) {
                i10 = this.f2685z.getIntrinsicWidth();
            }
            int i11 = this.B;
            if (i11 == 0) {
                i11 = this.f2685z.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2685z;
            int i12 = this.C;
            int i13 = this.D;
            drawable2.setBounds(i12, i13, i10 + i12, i11 + i13);
            this.f2685z.setVisible(true, z9);
        }
        if (z9) {
            b();
            return;
        }
        Drawable[] a10 = p.a(this);
        Drawable drawable3 = a10[0];
        Drawable drawable4 = a10[1];
        Drawable drawable5 = a10[2];
        int i14 = this.H;
        if (i14 != 1 && i14 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || drawable3 == this.f2685z) {
            if (i14 != 3 && i14 != 4) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11 || drawable5 == this.f2685z) {
                if (i14 != 16 && i14 != 32) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                if (!z12 || drawable4 == this.f2685z) {
                    z13 = false;
                }
            }
        }
        if (z13) {
            b();
        }
    }

    public final void d(int i10, int i11) {
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.f2685z != null && getLayout() != null) {
            int i12 = this.H;
            boolean z12 = true;
            if (i12 != 1 && i12 != 2) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (!z9) {
                if (i12 != 3 && i12 != 4) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    if (i12 != 16 && i12 != 32) {
                        z12 = false;
                    }
                    if (z12) {
                        this.C = 0;
                        if (i12 == 16) {
                            this.D = 0;
                            c(false);
                            return;
                        }
                        int i13 = this.B;
                        if (i13 == 0) {
                            i13 = this.f2685z.getIntrinsicHeight();
                        }
                        int max = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - i13) - this.E) - getPaddingBottom()) / 2);
                        if (this.D != max) {
                            this.D = max;
                            c(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.D = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i14 = this.H;
            if (i14 != 1 && i14 != 3 && ((i14 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i14 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i15 = this.B;
                if (i15 == 0) {
                    i15 = this.f2685z.getIntrinsicWidth();
                }
                int textLayoutWidth = i10 - getTextLayoutWidth();
                WeakHashMap weakHashMap = y0.f4277a;
                int e10 = (((textLayoutWidth - i0.e(this)) - i15) - this.E) - i0.f(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    e10 /= 2;
                }
                if (i0.d(this) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.H != 4) {
                    z12 = false;
                }
                if (z10 != z12) {
                    e10 = -e10;
                }
                if (this.C != e10) {
                    this.C = e10;
                    c(false);
                    return;
                }
                return;
            }
            this.C = 0;
            c(false);
        }
    }

    public String getA11yClassName() {
        boolean z9;
        Class cls;
        if (!TextUtils.isEmpty(this.A)) {
            return this.A;
        }
        c cVar = this.f2680d;
        if (cVar != null && cVar.f11296q) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f2680d.f11287g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f2685z;
    }

    public int getIconGravity() {
        return this.H;
    }

    public int getIconPadding() {
        return this.E;
    }

    public int getIconSize() {
        return this.B;
    }

    public ColorStateList getIconTint() {
        return this.f2684y;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2683x;
    }

    public int getInsetBottom() {
        return this.f2680d.f11286f;
    }

    public int getInsetTop() {
        return this.f2680d.f11285e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f2680d.f11292l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (a()) {
            return this.f2680d.f11282b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f2680d.f11291k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f2680d.f11288h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.s
    public ColorStateList getSupportBackgroundTintList() {
        if (a()) {
            return this.f2680d.f11290j;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.s
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (a()) {
            return this.f2680d.f11289i;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.F;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            a0.V(this, this.f2680d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        boolean z9;
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        c cVar = this.f2680d;
        if (cVar != null && cVar.f11296q) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            View.mergeDrawableStates(onCreateDrawableState, I);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, J);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.s, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.s, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.f2680d;
        if (cVar != null && cVar.f11296q) {
            z9 = true;
        } else {
            z9 = false;
        }
        accessibilityNodeInfo.setCheckable(z9);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.s, android.widget.TextView, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x5.b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x5.b bVar = (x5.b) parcelable;
        super.onRestoreInstanceState(bVar.f7897a);
        setChecked(bVar.f11280c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        x5.b bVar = new x5.b(super.onSaveInstanceState());
        bVar.f11280c = this.F;
        return bVar;
    }

    @Override // androidx.appcompat.widget.s, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f2680d.f11297r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f2685z != null) {
            if (this.f2685z.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.A = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (a()) {
            c cVar = this.f2680d;
            if (cVar.b(false) != null) {
                cVar.b(false).setTint(i10);
                return;
            }
            return;
        }
        super.setBackgroundColor(i10);
    }

    @Override // androidx.appcompat.widget.s, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (a()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                c cVar = this.f2680d;
                cVar.o = true;
                ColorStateList colorStateList = cVar.f11290j;
                MaterialButton materialButton = cVar.f11281a;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(cVar.f11289i);
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.s, android.view.View
    public void setBackgroundResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = b.G(getContext(), i10);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z9) {
        if (a()) {
            this.f2680d.f11296q = z9;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        boolean z10;
        c cVar = this.f2680d;
        if (cVar != null && cVar.f11296q) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && isEnabled() && this.F != z9) {
            this.F = z9;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z11 = this.F;
                if (!materialButtonToggleGroup.f2691f) {
                    materialButtonToggleGroup.b(getId(), z11);
                }
            }
            if (this.G) {
                return;
            }
            this.G = true;
            Iterator it = this.f2681e.iterator();
            if (!it.hasNext()) {
                this.G = false;
            } else {
                g.z(it.next());
                throw null;
            }
        }
    }

    public void setCornerRadius(int i10) {
        if (a()) {
            c cVar = this.f2680d;
            if (!cVar.f11295p || cVar.f11287g != i10) {
                cVar.f11287g = i10;
                cVar.f11295p = true;
                k kVar = cVar.f11282b;
                float f10 = i10;
                kVar.getClass();
                j jVar = new j(kVar);
                jVar.f6208e = new j6.a(f10);
                jVar.f6209f = new j6.a(f10);
                jVar.f6210g = new j6.a(f10);
                jVar.f6211h = new j6.a(f10);
                cVar.c(new k(jVar));
            }
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (a()) {
            this.f2680d.b(false).i(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f2685z != drawable) {
            this.f2685z = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.H != i10) {
            this.H = i10;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.E != i10) {
            this.E = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        Drawable drawable;
        if (i10 != 0) {
            drawable = b.G(getContext(), i10);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconSize(int i10) {
        if (i10 >= 0) {
            if (this.B != i10) {
                this.B = i10;
                c(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2684y != colorStateList) {
            this.f2684y = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2683x != mode) {
            this.f2683x = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(x.j.getColorStateList(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        c cVar = this.f2680d;
        cVar.d(cVar.f11285e, i10);
    }

    public void setInsetTop(int i10) {
        c cVar = this.f2680d;
        cVar.d(i10, cVar.f11286f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f2682f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        a aVar = this.f2682f;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((d) aVar).f6453b).invalidate();
        }
        super.setPressed(z9);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f2680d;
            if (cVar.f11292l != colorStateList) {
                cVar.f11292l = colorStateList;
                MaterialButton materialButton = cVar.f11281a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(h6.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (a()) {
            setRippleColor(x.j.getColorStateList(getContext(), i10));
        }
    }

    @Override // j6.v
    public void setShapeAppearanceModel(k kVar) {
        if (a()) {
            this.f2680d.c(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z9) {
        if (a()) {
            c cVar = this.f2680d;
            cVar.f11294n = z9;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f2680d;
            if (cVar.f11291k != colorStateList) {
                cVar.f11291k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (a()) {
            setStrokeColor(x.j.getColorStateList(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (a()) {
            c cVar = this.f2680d;
            if (cVar.f11288h != i10) {
                cVar.f11288h = i10;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.s
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f2680d;
            if (cVar.f11290j != colorStateList) {
                cVar.f11290j = colorStateList;
                if (cVar.b(false) != null) {
                    a0.b.h(cVar.b(false), cVar.f11290j);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.s
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (a()) {
            c cVar = this.f2680d;
            if (cVar.f11289i != mode) {
                cVar.f11289i = mode;
                if (cVar.b(false) != null && cVar.f11289i != null) {
                    a0.b.i(cVar.b(false), cVar.f11289i);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z9) {
        this.f2680d.f11297r = z9;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.F);
    }
}
