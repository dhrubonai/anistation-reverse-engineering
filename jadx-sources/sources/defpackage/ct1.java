package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ct1 implements TextWatcher {
    public final rp x;
    public bt1 y;
    public boolean z = true;

    public ct1(rp rpVar) {
        this.x = rpVar;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            ks1 a = ks1.a();
            if (editableText == null) {
                length = 0;
            } else {
                a.getClass();
                length = editableText.length();
            }
            a.g(editableText, 0, length, 0);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        rp rpVar = this.x;
        if (!rpVar.isInEditMode() && this.z && ks1.d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int c = ks1.a().c();
            if (c != 0) {
                if (c != 1) {
                    if (c != 3) {
                        return;
                    }
                } else {
                    ks1.a().g((Spannable) charSequence, i, i3 + i, 0);
                    return;
                }
            }
            ks1 a = ks1.a();
            bt1 bt1Var = this.y;
            if (bt1Var == null) {
                bt1Var = new bt1(rpVar);
                this.y = bt1Var;
            }
            a.h(bt1Var);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
