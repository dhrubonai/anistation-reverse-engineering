package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class u extends CheckedTextView implements k0.w {

    /* renamed from: a, reason: collision with root package name */
    public final v f656a;

    /* renamed from: b, reason: collision with root package name */
    public final r f657b;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f658c;

    /* renamed from: d, reason: collision with root package name */
    public b0 f659d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        w3.a(context);
        v3.a(getContext(), this);
        f1 f1Var = new f1(this);
        this.f658c = f1Var;
        f1Var.f(attributeSet, R.attr.checkedTextViewStyle);
        f1Var.b();
        r rVar = new r(this);
        this.f657b = rVar;
        rVar.e(attributeSet, R.attr.checkedTextViewStyle);
        v vVar = new v(this, 0);
        this.f656a = vVar;
        vVar.c(attributeSet, R.attr.checkedTextViewStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
    }

    private b0 getEmojiTextViewHelper() {
        if (this.f659d == null) {
            this.f659d = new b0(this);
        }
        return this.f659d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        f1 f1Var = this.f658c;
        if (f1Var != null) {
            f1Var.b();
        }
        r rVar = this.f657b;
        if (rVar != null) {
            rVar.a();
        }
        v vVar = this.f656a;
        if (vVar != null) {
            vVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.bumptech.glide.d.g0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f657b;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f657b;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        v vVar = this.f656a;
        if (vVar != null) {
            return vVar.f664b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        v vVar = this.f656a;
        if (vVar != null) {
            return vVar.f665c;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f658c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f658c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.bumptech.glide.c.O(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f657b;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f657b;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        v vVar = this.f656a;
        if (vVar != null) {
            if (vVar.f668f) {
                vVar.f668f = false;
            } else {
                vVar.f668f = true;
                vVar.b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f658c;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f658c;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.bumptech.glide.d.i0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f657b;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f657b;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        v vVar = this.f656a;
        if (vVar != null) {
            vVar.f664b = colorStateList;
            vVar.f666d = true;
            vVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        v vVar = this.f656a;
        if (vVar != null) {
            vVar.f665c = mode;
            vVar.f667e = true;
            vVar.b();
        }
    }

    @Override // k0.w
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f1 f1Var = this.f658c;
        f1Var.l(colorStateList);
        f1Var.b();
    }

    @Override // k0.w
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f1 f1Var = this.f658c;
        f1Var.m(mode);
        f1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f1 f1Var = this.f658c;
        if (f1Var != null) {
            f1Var.g(context, i10);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i10) {
        setCheckMarkDrawable(w7.b.G(getContext(), i10));
    }
}
