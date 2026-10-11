package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.z;
import java.util.Locale;
import msr.pistream.app.R;
import s5.a;
import w7.b;

/* loaded from: classes.dex */
public class TextInputEditText extends z {

    /* renamed from: x, reason: collision with root package name */
    public final Rect f2799x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2800y;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(b.Z(context, attributeSet, R.attr.editTextStyle, 0), attributeSet);
        this.f2799x = new Rect();
        TypedArray N = b.N(context, attributeSet, a.f9923y, R.attr.editTextStyle, R.style.Widget_Design_TextInputEditText, new int[0]);
        setTextInputLayoutFocusedRectEnabled(N.getBoolean(0, false));
        N.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        boolean z9;
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f2800y) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && rect != null) {
            Rect rect2 = this.f2799x;
            textInputLayout.getFocusedRect(rect2);
            rect.bottom = rect2.bottom;
        }
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean z9;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f2800y) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return textInputLayout.getGlobalVisibleRect(rect, point);
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.T) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.T && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.z, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean z9;
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.f2800y) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 && rect != null) {
            int height = textInputLayout.getHeight() - getHeight();
            int i10 = rect.left;
            int i11 = rect.top;
            int i12 = rect.right;
            int i13 = rect.bottom + height;
            Rect rect2 = this.f2799x;
            rect2.set(i10, i11, i12, i13);
            return super.requestRectangleOnScreen(rect2);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z9) {
        this.f2800y = z9;
    }
}
