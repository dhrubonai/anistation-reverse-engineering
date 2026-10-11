package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

/* loaded from: classes.dex */
public class q extends AutoCompleteTextView implements k0.w {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f601d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final r f602a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f603b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f604c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, msr.pistream.app.R.attr.autoCompleteTextViewStyle);
        w3.a(context);
        v3.a(getContext(), this);
        o3 m5 = o3.m(getContext(), attributeSet, f601d, msr.pistream.app.R.attr.autoCompleteTextViewStyle);
        if (m5.l(0)) {
            setDropDownBackgroundDrawable(m5.e(0));
        }
        m5.p();
        r rVar = new r(this);
        this.f602a = rVar;
        rVar.e(attributeSet, msr.pistream.app.R.attr.autoCompleteTextViewStyle);
        f1 f1Var = new f1(this);
        this.f603b = f1Var;
        f1Var.f(attributeSet, msr.pistream.app.R.attr.autoCompleteTextViewStyle);
        f1Var.b();
        a0 a0Var = new a0((EditText) this);
        this.f604c = a0Var;
        a0Var.R(attributeSet, msr.pistream.app.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener Q = a0Var.Q(keyListener);
            if (Q != keyListener) {
                super.setKeyListener(Q);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f602a;
        if (rVar != null) {
            rVar.a();
        }
        f1 f1Var = this.f603b;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.bumptech.glide.d.g0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f602a;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f602a;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f603b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f603b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.bumptech.glide.c.O(this, editorInfo, onCreateInputConnection);
        return this.f604c.S(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f602a;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f602a;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f603b;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f603b;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.bumptech.glide.d.i0(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(w7.b.G(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        ((j6.e) ((s0.b) this.f604c.f404c).f9729c).z(z9);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f604c.Q(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f602a;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f602a;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    @Override // k0.w
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f1 f1Var = this.f603b;
        f1Var.l(colorStateList);
        f1Var.b();
    }

    @Override // k0.w
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f1 f1Var = this.f603b;
        f1Var.m(mode);
        f1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f1 f1Var = this.f603b;
        if (f1Var != null) {
            f1Var.g(context, i10);
        }
    }
}
