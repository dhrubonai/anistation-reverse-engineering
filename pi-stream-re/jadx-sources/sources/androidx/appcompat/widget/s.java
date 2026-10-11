package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class s extends Button implements k0.w {

    /* renamed from: a, reason: collision with root package name */
    public final r f636a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f637b;

    /* renamed from: c, reason: collision with root package name */
    public b0 f638c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        w3.a(context);
        v3.a(getContext(), this);
        r rVar = new r(this);
        this.f636a = rVar;
        rVar.e(attributeSet, i10);
        f1 f1Var = new f1(this);
        this.f637b = f1Var;
        f1Var.f(attributeSet, i10);
        f1Var.b();
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    private b0 getEmojiTextViewHelper() {
        if (this.f638c == null) {
            this.f638c = new b0(this);
        }
        return this.f638c;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f636a;
        if (rVar != null) {
            rVar.a();
        }
        f1 f1Var = this.f637b;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (n4.f581b) {
            return super.getAutoSizeMaxTextSize();
        }
        f1 f1Var = this.f637b;
        if (f1Var != null) {
            return Math.round(f1Var.f477i.f615e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (n4.f581b) {
            return super.getAutoSizeMinTextSize();
        }
        f1 f1Var = this.f637b;
        if (f1Var != null) {
            return Math.round(f1Var.f477i.f614d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (n4.f581b) {
            return super.getAutoSizeStepGranularity();
        }
        f1 f1Var = this.f637b;
        if (f1Var != null) {
            return Math.round(f1Var.f477i.f613c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (n4.f581b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        f1 f1Var = this.f637b;
        if (f1Var != null) {
            return f1Var.f477i.f616f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (n4.f581b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        f1 f1Var = this.f637b;
        if (f1Var == null) {
            return 0;
        }
        return f1Var.f477i.f611a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.bumptech.glide.d.g0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f636a;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f636a;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f637b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f637b.e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        f1 f1Var = this.f637b;
        if (f1Var != null && !n4.f581b) {
            f1Var.f477i.a();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z9;
        super.onTextChanged(charSequence, i10, i11, i12);
        boolean z10 = false;
        f1 f1Var = this.f637b;
        if (f1Var != null && !n4.f581b) {
            q1 q1Var = f1Var.f477i;
            if (q1Var.i() && q1Var.f611a != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                z10 = true;
            }
        }
        if (z10) {
            f1Var.f477i.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i10, int i11, int i12, int i13) {
        if (n4.f581b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
            return;
        }
        f1 f1Var = this.f637b;
        if (f1Var != null) {
            f1Var.i(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i10) {
        if (n4.f581b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
            return;
        }
        f1 f1Var = this.f637b;
        if (f1Var != null) {
            f1Var.j(iArr, i10);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i10) {
        if (n4.f581b) {
            super.setAutoSizeTextTypeWithDefaults(i10);
            return;
        }
        f1 f1Var = this.f637b;
        if (f1Var != null) {
            f1Var.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f636a;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f636a;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.bumptech.glide.d.i0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z9) {
        f1 f1Var = this.f637b;
        if (f1Var != null) {
            f1Var.f469a.setAllCaps(z9);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f636a;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f636a;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    @Override // k0.w
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f1 f1Var = this.f637b;
        f1Var.l(colorStateList);
        f1Var.b();
    }

    @Override // k0.w
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f1 f1Var = this.f637b;
        f1Var.m(mode);
        f1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f1 f1Var = this.f637b;
        if (f1Var != null) {
            f1Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z9;
        boolean z10 = n4.f581b;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        f1 f1Var = this.f637b;
        if (f1Var != null && !z10) {
            q1 q1Var = f1Var.f477i;
            if (q1Var.i() && q1Var.f611a != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                q1Var.f(i10, f10);
            }
        }
    }
}
