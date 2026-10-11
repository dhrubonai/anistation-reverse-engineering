package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: classes.dex */
public class t extends CheckBox implements k0.v, k0.w {

    /* renamed from: a, reason: collision with root package name */
    public final v f647a;

    /* renamed from: b, reason: collision with root package name */
    public final r f648b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f649c;

    /* renamed from: d, reason: collision with root package name */
    public b0 f650d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        w3.a(context);
        v3.a(getContext(), this);
        v vVar = new v(this, 1);
        this.f647a = vVar;
        vVar.c(attributeSet, i10);
        r rVar = new r(this);
        this.f648b = rVar;
        rVar.e(attributeSet, i10);
        f1 f1Var = new f1(this);
        this.f649c = f1Var;
        f1Var.f(attributeSet, i10);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private b0 getEmojiTextViewHelper() {
        if (this.f650d == null) {
            this.f650d = new b0(this);
        }
        return this.f650d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f648b;
        if (rVar != null) {
            rVar.a();
        }
        f1 f1Var = this.f649c;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        v vVar = this.f647a;
        if (vVar != null) {
            vVar.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f648b;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f648b;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    @Override // k0.v
    public ColorStateList getSupportButtonTintList() {
        v vVar = this.f647a;
        if (vVar != null) {
            return vVar.f664b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        v vVar = this.f647a;
        if (vVar != null) {
            return vVar.f665c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f649c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f649c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f648b;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f648b;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        v vVar = this.f647a;
        if (vVar != null) {
            if (vVar.f668f) {
                vVar.f668f = false;
            } else {
                vVar.f668f = true;
                vVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f649c;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f649c;
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
        r rVar = this.f648b;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f648b;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    @Override // k0.v
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        v vVar = this.f647a;
        if (vVar != null) {
            vVar.f664b = colorStateList;
            vVar.f666d = true;
            vVar.a();
        }
    }

    @Override // k0.v
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        v vVar = this.f647a;
        if (vVar != null) {
            vVar.f665c = mode;
            vVar.f667e = true;
            vVar.a();
        }
    }

    @Override // k0.w
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f1 f1Var = this.f649c;
        f1Var.l(colorStateList);
        f1Var.b();
    }

    @Override // k0.w
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f1 f1Var = this.f649c;
        f1Var.m(mode);
        f1Var.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i10) {
        setButtonDrawable(w7.b.G(getContext(), i10));
    }
}
