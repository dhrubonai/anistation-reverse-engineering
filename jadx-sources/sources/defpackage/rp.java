package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class rp extends AutoCompleteTextView {
    public static final int[] A = {R.attr.popupBackground};
    public final sp x;
    public final bq y;
    public final i75 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.anistation.android.R.attr.autoCompleteTextViewStyle);
        Drawable drawable;
        int resourceId;
        Object obj = vf6.a;
        if (!(context.getResources() instanceof wf6)) {
            context.getResources();
            int i = er6.a;
        }
        je6.a(this, getContext());
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, A, com.anistation.android.R.attr.autoCompleteTextViewStyle, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                drawable = oi4.t(context2, resourceId);
            } else {
                drawable = obtainStyledAttributes.getDrawable(0);
            }
            setDropDownBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        sp spVar = new sp(this);
        this.x = spVar;
        spVar.f(attributeSet, com.anistation.android.R.attr.autoCompleteTextViewStyle);
        bq bqVar = new bq(this);
        this.y = bqVar;
        bqVar.d(attributeSet, com.anistation.android.R.attr.autoCompleteTextViewStyle);
        bqVar.b();
        i75 i75Var = new i75(this, (byte) 4);
        this.z = i75Var;
        TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, ux4.b, com.anistation.android.R.attr.autoCompleteTextViewStyle, 0);
        try {
            boolean z = obtainStyledAttributes2.hasValue(14) ? obtainStyledAttributes2.getBoolean(14, true) : true;
            obtainStyledAttributes2.recycle();
            i75Var.v(z);
            KeyListener keyListener = getKeyListener();
            if (!(keyListener instanceof NumberKeyListener)) {
                boolean isFocusable = super.isFocusable();
                boolean isClickable = super.isClickable();
                boolean isLongClickable = super.isLongClickable();
                int inputType = super.getInputType();
                KeyListener o = i75Var.o(keyListener);
                if (o != keyListener) {
                    super.setKeyListener(o);
                    super.setRawInputType(inputType);
                    super.setFocusable(isFocusable);
                    super.setClickable(isClickable);
                    super.setLongClickable(isLongClickable);
                }
            }
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
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
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        i75 i75Var = (i75) this.z.y;
        if (onCreateInputConnection == null) {
            return null;
        }
        pz2 pz2Var = (pz2) i75Var.y;
        if (onCreateInputConnection instanceof rs1) {
            return onCreateInputConnection;
        }
        return new rs1((rp) pz2Var.y, onCreateInputConnection, editorInfo);
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(oi4.t(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.z.v(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.z.o(keyListener));
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
}
