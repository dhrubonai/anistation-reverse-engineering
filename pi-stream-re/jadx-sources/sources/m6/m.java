package m6;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f7486a;

    public m(n nVar) {
        this.f7486a = nVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        n nVar = this.f7486a;
        if (nVar.J == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = nVar.J;
        l lVar = nVar.M;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (nVar.J.getOnFocusChangeListener() == nVar.b().e()) {
                nVar.J.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        nVar.J = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        nVar.b().m(nVar.J);
        nVar.i(nVar.b());
    }
}
