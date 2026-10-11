package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class eq extends TextView {
    public boolean A;
    public pz2 B;
    public Future C;
    public final sp x;
    public final bq y;
    public vp z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        Object obj = vf6.a;
        if (!(context.getResources() instanceof wf6)) {
            context.getResources();
            int i = er6.a;
        }
        this.A = false;
        this.B = null;
        je6.a(this, getContext());
        sp spVar = new sp(this);
        this.x = spVar;
        spVar.f(attributeSet, R.attr.textViewStyle);
        bq bqVar = new bq(this);
        this.y = bqVar;
        bqVar.d(attributeSet, R.attr.textViewStyle);
        bqVar.b();
        vp emojiTextViewHelper = getEmojiTextViewHelper();
        TypedArray obtainStyledAttributes = emojiTextViewHelper.a.getContext().obtainStyledAttributes(attributeSet, ux4.b, R.attr.textViewStyle, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            ((nx7) emojiTextViewHelper.b.x).U(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private vp getEmojiTextViewHelper() {
        vp vpVar = this.z;
        if (vpVar == null) {
            vp vpVar2 = new vp(this);
            this.z = vpVar2;
            return vpVar2;
        }
        return vpVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        sp spVar = this.x;
        if (spVar != null) {
            spVar.b();
        }
        bq bqVar = this.y;
        if (bqVar != null) {
            bqVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (super.getAutoSizeTextType() == 1) {
            return 1;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public cq getSuperCaller() {
        pz2 pz2Var = this.B;
        if (pz2Var == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                dq dqVar = new dq(this);
                this.B = dqVar;
                return dqVar;
            }
            pz2 pz2Var2 = new pz2(this);
            this.B = pz2Var2;
            return pz2Var2;
        }
        return pz2Var;
    }

    public ColorStateList getSupportBackgroundTintList() {
        pn0 pn0Var;
        sp spVar = this.x;
        if (spVar == null || (pn0Var = (pn0) spVar.e) == null) {
            return null;
        }
        return (ColorStateList) pn0Var.A;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        pn0 pn0Var;
        sp spVar = this.x;
        if (spVar == null || (pn0Var = (pn0) spVar.e) == null) {
            return null;
        }
        return (PorterDuff.Mode) pn0Var.B;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        pn0 pn0Var = this.y.h;
        if (pn0Var != null) {
            return (ColorStateList) pn0Var.A;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        pn0 pn0Var = this.y.h;
        if (pn0Var != null) {
            return (PorterDuff.Mode) pn0Var.B;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.C;
        if (future != null) {
            try {
                this.C = null;
                if (future.get() == null) {
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public bs4 getTextMetricsParamsCompat() {
        return new bs4(getTextMetricsParams());
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.y.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            wc7.Q(editorInfo, getText());
        }
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        bq bqVar = this.y;
        if (bqVar != null) {
            bqVar.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.C;
        if (future != null) {
            try {
                this.C = null;
                if (future.get() == null) {
                    throw null;
                }
                throw new ClassCastException();
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((nx7) getEmojiTextViewHelper().b.x).T(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        sp spVar = this.x;
        if (spVar != null) {
            spVar.a = -1;
            spVar.i(null);
            spVar.b();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        ColorStateList colorStateList;
        super.setBackgroundResource(i);
        sp spVar = this.x;
        if (spVar != null) {
            spVar.a = i;
            up upVar = (up) spVar.c;
            if (upVar != null) {
                Context context = ((TextView) spVar.b).getContext();
                synchronized (upVar) {
                    colorStateList = upVar.a.g(context, i);
                }
            } else {
                colorStateList = null;
            }
            spVar.i(colorStateList);
            spVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        bq bqVar = this.y;
        if (bqVar != null) {
            bqVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        bq bqVar = this.y;
        if (bqVar != null) {
            bqVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = oi4.t(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = oi4.t(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = oi4.t(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = oi4.t(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        bq bqVar = this.y;
        if (bqVar != null) {
            bqVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Context context = getContext();
        Drawable drawable4 = null;
        if (i != 0) {
            drawable = oi4.t(context, i);
        } else {
            drawable = null;
        }
        if (i2 != 0) {
            drawable2 = oi4.t(context, i2);
        } else {
            drawable2 = null;
        }
        if (i3 != 0) {
            drawable3 = oi4.t(context, i3);
        } else {
            drawable3 = null;
        }
        if (i4 != 0) {
            drawable4 = oi4.t(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        bq bqVar = this.y;
        if (bqVar != null) {
            bqVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((nx7) getEmojiTextViewHelper().b.x).U(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((nx7) getEmojiTextViewHelper().b.x).E(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        super.setFirstBaselineToTopHeight(i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        super.setLastBaselineToBottomHeight(i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().h(i, f);
        } else if (i2 >= 34) {
            s3.n(this, i, f);
        } else {
            iz5.k(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(cs4 cs4Var) {
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        sp spVar = this.x;
        if (spVar != null) {
            pn0 pn0Var = (pn0) spVar.e;
            if (pn0Var == null) {
                pn0Var = new pn0((byte) 5);
                spVar.e = pn0Var;
            }
            pn0Var.A = colorStateList;
            pn0Var.z = true;
            spVar.b();
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        sp spVar = this.x;
        if (spVar != null) {
            pn0 pn0Var = (pn0) spVar.e;
            if (pn0Var == null) {
                pn0Var = new pn0((byte) 5);
                spVar.e = pn0Var;
            }
            pn0Var.B = mode;
            pn0Var.y = true;
            spVar.b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        boolean z;
        bq bqVar = this.y;
        pn0 pn0Var = bqVar.h;
        if (pn0Var == null) {
            pn0Var = new pn0((byte) 5);
            bqVar.h = pn0Var;
        }
        pn0 pn0Var2 = pn0Var;
        pn0Var.A = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        pn0Var.z = z;
        bqVar.b = pn0Var2;
        bqVar.c = pn0Var2;
        bqVar.d = pn0Var2;
        bqVar.e = pn0Var2;
        bqVar.f = pn0Var2;
        bqVar.g = pn0Var2;
        bqVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        boolean z;
        bq bqVar = this.y;
        pn0 pn0Var = bqVar.h;
        if (pn0Var == null) {
            pn0Var = new pn0((byte) 5);
            bqVar.h = pn0Var;
        }
        pn0 pn0Var2 = pn0Var;
        pn0Var.B = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        pn0Var.y = z;
        bqVar.b = pn0Var2;
        bqVar.c = pn0Var2;
        bqVar.d = pn0Var2;
        bqVar.e = pn0Var2;
        bqVar.f = pn0Var2;
        bqVar.g = pn0Var2;
        bqVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        bq bqVar = this.y;
        if (bqVar != null) {
            bqVar.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<cs4> future) {
        this.C = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(bs4 bs4Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = bs4Var.b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(bs4Var.a);
        setBreakStrategy(bs4Var.c);
        setHyphenationFrequency(bs4Var.d);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.A) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            y95 y95Var = dl6.a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                ze0.k("Context cannot be null");
                return;
            }
        } else {
            typeface2 = null;
        }
        this.A = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.A = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        iz5.k(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        bq bqVar = this.y;
        if (bqVar != null) {
            bqVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        bq bqVar = this.y;
        if (bqVar != null) {
            bqVar.b();
        }
    }
}
