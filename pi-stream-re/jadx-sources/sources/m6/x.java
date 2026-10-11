package m6;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import androidx.appcompat.widget.i1;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class x extends g0.c {

    /* renamed from: d, reason: collision with root package name */
    public final TextInputLayout f7553d;

    public x(TextInputLayout textInputLayout) {
        this.f7553d = textInputLayout;
    }

    @Override // g0.c
    public final void d(View view, h0.h hVar) {
        CharSequence charSequence;
        boolean z9;
        String str;
        View.AccessibilityDelegate accessibilityDelegate = this.f4171a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f4539a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.f7553d;
        EditText editText = textInputLayout.getEditText();
        if (editText != null) {
            charSequence = editText.getText();
        } else {
            charSequence = null;
        }
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean z10 = !TextUtils.isEmpty(charSequence);
        boolean z11 = !TextUtils.isEmpty(hint);
        boolean z12 = !textInputLayout.I0;
        boolean z13 = !TextUtils.isEmpty(error);
        if (!z13 && TextUtils.isEmpty(counterOverflowDescription)) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z11) {
            str = hint.toString();
        } else {
            str = "";
        }
        v vVar = textInputLayout.f2803b;
        i1 i1Var = vVar.f7543b;
        if (i1Var.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(i1Var);
            accessibilityNodeInfo.setTraversalAfter(i1Var);
        } else {
            accessibilityNodeInfo.setTraversalAfter(vVar.f7545d);
        }
        if (z10) {
            hVar.h(charSequence);
        } else if (!TextUtils.isEmpty(str)) {
            hVar.h(str);
            if (z12 && placeholderText != null) {
                hVar.h(str + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            hVar.h(placeholderText);
        }
        if (!TextUtils.isEmpty(str)) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 26) {
                hVar.g(str);
            } else {
                if (z10) {
                    str = ((Object) charSequence) + ", " + str;
                }
                hVar.h(str);
            }
            boolean z14 = true ^ z10;
            if (i10 >= 26) {
                accessibilityNodeInfo.setShowingHintText(z14);
            } else {
                hVar.f(4, z14);
            }
        }
        if (charSequence == null || charSequence.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z9) {
            if (!z13) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        i1 i1Var2 = textInputLayout.A.f7529y;
        if (i1Var2 != null) {
            accessibilityNodeInfo.setLabelFor(i1Var2);
        }
        textInputLayout.f2805c.b().n(hVar);
    }

    @Override // g0.c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        super.e(view, accessibilityEvent);
        this.f7553d.f2805c.b().o(accessibilityEvent);
    }
}
