package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class i1 extends TextView implements k0.w {

    /* renamed from: a, reason: collision with root package name */
    public final r f524a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f525b;

    /* renamed from: c, reason: collision with root package name */
    public final a0 f526c;

    /* renamed from: d, reason: collision with root package name */
    public b0 f527d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f528e;

    /* renamed from: f, reason: collision with root package name */
    public f.p0 f529f;

    /* renamed from: x, reason: collision with root package name */
    public Future f530x;

    public i1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private b0 getEmojiTextViewHelper() {
        if (this.f527d == null) {
            this.f527d = new b0(this);
        }
        return this.f527d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        r rVar = this.f524a;
        if (rVar != null) {
            rVar.a();
        }
        f1 f1Var = this.f525b;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (n4.f581b) {
            return super.getAutoSizeMaxTextSize();
        }
        f1 f1Var = this.f525b;
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
        f1 f1Var = this.f525b;
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
        f1 f1Var = this.f525b;
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
        f1 f1Var = this.f525b;
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
        f1 f1Var = this.f525b;
        if (f1Var == null) {
            return 0;
        }
        return f1Var.f477i.f611a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.bumptech.glide.d.g0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public g1 getSuperCaller() {
        if (this.f529f == null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                this.f529f = new h1(this);
            } else if (i10 >= 26) {
                this.f529f = new f.p0(this, 6);
            }
        }
        return this.f529f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        r rVar = this.f524a;
        if (rVar != null) {
            return rVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        r rVar = this.f524a;
        if (rVar != null) {
            return rVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f525b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f525b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f530x;
        if (future != null) {
            try {
                this.f530x = null;
                a3.g.z(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                com.bumptech.glide.d.D(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        a0 a0Var;
        if (Build.VERSION.SDK_INT < 28 && (a0Var = this.f526c) != null) {
            TextClassifier textClassifier = (TextClassifier) a0Var.f404c;
            if (textClassifier == null) {
                return x0.a((TextView) a0Var.f403b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public e0.g getTextMetricsParamsCompat() {
        return com.bumptech.glide.d.D(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f525b.getClass();
        f1.h(this, onCreateInputConnection, editorInfo);
        com.bumptech.glide.c.O(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        f1 f1Var = this.f525b;
        if (f1Var != null && !n4.f581b) {
            f1Var.f477i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        Future future = this.f530x;
        if (future != null) {
            try {
                this.f530x = null;
                a3.g.z(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                com.bumptech.glide.d.D(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        boolean z9;
        super.onTextChanged(charSequence, i10, i11, i12);
        boolean z10 = false;
        f1 f1Var = this.f525b;
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
        f1 f1Var = this.f525b;
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
        f1 f1Var = this.f525b;
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
        f1 f1Var = this.f525b;
        if (f1Var != null) {
            f1Var.k(i10);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        r rVar = this.f524a;
        if (rVar != null) {
            rVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        r rVar = this.f524a;
        if (rVar != null) {
            rVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f525b;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f525b;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f525b;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        f1 f1Var = this.f525b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().v(i10);
        } else {
            com.bumptech.glide.d.a0(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().j(i10);
        } else {
            com.bumptech.glide.d.b0(this, i10);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i10) {
        com.bumptech.glide.d.j(i10);
        if (i10 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i10 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(e0.h hVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        com.bumptech.glide.d.D(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        r rVar = this.f524a;
        if (rVar != null) {
            rVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        r rVar = this.f524a;
        if (rVar != null) {
            rVar.j(mode);
        }
    }

    @Override // k0.w
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        f1 f1Var = this.f525b;
        f1Var.l(colorStateList);
        f1Var.b();
    }

    @Override // k0.w
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        f1 f1Var = this.f525b;
        f1Var.m(mode);
        f1Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        f1 f1Var = this.f525b;
        if (f1Var != null) {
            f1Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        a0 a0Var;
        if (Build.VERSION.SDK_INT >= 28 || (a0Var = this.f526c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            a0Var.f404c = textClassifier;
        }
    }

    public void setTextFuture(Future<e0.h> future) {
        this.f530x = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(e0.g gVar) {
        int i10;
        TextDirectionHeuristic textDirectionHeuristic = gVar.f3312b;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i10 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i10 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i10 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i10 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i10 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i10 = 7;
            }
            k0.p.h(this, i10);
            getPaint().set(gVar.f3311a);
            k0.q.e(this, gVar.f3313c);
            k0.q.h(this, gVar.f3314d);
        }
        i10 = 1;
        k0.p.h(this, i10);
        getPaint().set(gVar.f3311a);
        k0.q.e(this, gVar.f3313c);
        k0.q.h(this, gVar.f3314d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i10, float f10) {
        boolean z9;
        boolean z10 = n4.f581b;
        if (z10) {
            super.setTextSize(i10, f10);
            return;
        }
        f1 f1Var = this.f525b;
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i10) {
        Typeface typeface2;
        if (this.f528e) {
            return;
        }
        if (typeface != null && i10 > 0) {
            Context context = getContext();
            f.p0 p0Var = z.i.f11865a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i10);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f528e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i10);
        } finally {
            this.f528e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        w3.a(context);
        this.f528e = false;
        this.f529f = null;
        v3.a(getContext(), this);
        r rVar = new r(this);
        this.f524a = rVar;
        rVar.e(attributeSet, i10);
        f1 f1Var = new f1(this);
        this.f525b = f1Var;
        f1Var.f(attributeSet, i10);
        f1Var.b();
        this.f526c = new a0(this);
        getEmojiTextViewHelper().b(attributeSet, i10);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i10 != 0 ? w7.b.G(context, i10) : null, i11 != 0 ? w7.b.G(context, i11) : null, i12 != 0 ? w7.b.G(context, i12) : null, i13 != 0 ? w7.b.G(context, i13) : null);
        f1 f1Var = this.f525b;
        if (f1Var != null) {
            f1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i10, int i11, int i12, int i13) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i10 != 0 ? w7.b.G(context, i10) : null, i11 != 0 ? w7.b.G(context, i11) : null, i12 != 0 ? w7.b.G(context, i12) : null, i13 != 0 ? w7.b.G(context, i13) : null);
        f1 f1Var = this.f525b;
        if (f1Var != null) {
            f1Var.b();
        }
    }
}
