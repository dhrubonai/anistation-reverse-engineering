package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;

/* loaded from: classes.dex */
public final class f0 extends MultiAutoCompleteTextView implements k0.w {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f465d = {R.attr.popupBackground};

    /* renamed from: a, reason: collision with root package name */
    public final r f466a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f467b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f468c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, msr.pistream.app.R.attr.autoCompleteTextViewStyle);
        w3.a(context);
        v3.a(getContext(), this);
        o3 m5 = o3.m(getContext(), attributeSet, f465d, msr.pistream.app.R.attr.autoCompleteTextViewStyle);
        if (m5.l(0)) {
            setDropDownBackgroundDrawable(m5.e(0));
        }
        m5.p();
        r rVar = new r(this);
        this.f466a = rVar;
        rVar.e(attributeSet, msr.pistream.app.R.attr.autoCompleteTextViewStyle);
        f1 f1Var = new f1(this);
        this.f467b = f1Var;
        f1Var.f(attributeSet, msr.pistream.app.R.attr.autoCompleteTextViewStyle);
        f1Var.b();
        a0 a0Var = new a0((EditText) this);
        this.f468c = a0Var;
        a0Var.R(attributeSet, msr.pistream.app.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = isFocusable();
            boolean isClickable = isClickable();
            boolean isLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener Q = a0Var.Q(keyListener);
            if (Q != keyListener) {
                super.setKeyListener(Q);
                setRawInputType(inputType);
                setFocusable(isFocusable);
                setClickable(isClickable);
                setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f466a;
        if (rVar != null) {
            rVar.a();
        }
        f1 f1Var = this.f467b;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f466a;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f466a;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f467b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f467b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        com.bumptech.glide.c.O(this, editorInfo, onCreateInputConnection);
        return this.f468c.S(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f466a;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f466a;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f467b;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f467b;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i10) {
        setDropDownBackgroundDrawable(w7.b.G(getContext(), i10));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        ((j6.e) ((s0.b) this.f468c.f404c).f9729c).z(z9);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f468c.Q(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f466a;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f466a;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    @Override // k0.w
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f1 f1Var = this.f467b;
        f1Var.l(colorStateList);
        f1Var.b();
    }

    @Override // k0.w
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f1 f1Var = this.f467b;
        f1Var.m(mode);
        f1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f1 f1Var = this.f467b;
        if (f1Var != null) {
            f1Var.g(context, i10);
        }
    }
}
