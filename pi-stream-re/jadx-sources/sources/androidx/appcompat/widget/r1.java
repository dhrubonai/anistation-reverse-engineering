package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* loaded from: classes.dex */
public final class r1 extends ToggleButton implements k0.w {

    /* renamed from: a, reason: collision with root package name */
    public final r f632a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f633b;

    /* renamed from: c, reason: collision with root package name */
    public b0 f634c;

    public r1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        v3.a(getContext(), this);
        r rVar = new r(this);
        this.f632a = rVar;
        rVar.e(attributeSet, R.attr.buttonStyleToggle);
        f1 f1Var = new f1(this);
        this.f633b = f1Var;
        f1Var.f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.buttonStyleToggle);
    }

    private b0 getEmojiTextViewHelper() {
        if (this.f634c == null) {
            this.f634c = new b0(this);
        }
        return this.f634c;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f632a;
        if (rVar != null) {
            rVar.a();
        }
        f1 f1Var = this.f633b;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f632a;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f632a;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f633b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f633b.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f632a;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f632a;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f633b;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f633b;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f632a;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f632a;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    @Override // k0.w
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f1 f1Var = this.f633b;
        f1Var.l(colorStateList);
        f1Var.b();
    }

    @Override // k0.w
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f1 f1Var = this.f633b;
        f1Var.m(mode);
        f1Var.b();
    }
}
