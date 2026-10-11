package s0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f9733a;

    /* renamed from: b, reason: collision with root package name */
    public final j6.e f9734b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        boolean z9;
        j6.e eVar = new j6.e(14);
        this.f9733a = editText;
        this.f9734b = eVar;
        if (q0.l.f8923j != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            q0.l a10 = q0.l.a();
            if ((a10.b() == 1) && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                a10.f8928e.K(editorInfo);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.f9733a.getEditableText();
        this.f9734b.getClass();
        if (!j6.e.r(this, editableText, i10, i11, false) && !super.deleteSurroundingText(i10, i11)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.f9733a.getEditableText();
        this.f9734b.getClass();
        if (j6.e.r(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11)) {
            return true;
        }
        return false;
    }
}
