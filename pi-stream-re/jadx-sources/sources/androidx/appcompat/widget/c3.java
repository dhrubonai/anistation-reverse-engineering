package androidx.appcompat.widget;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class c3 implements TextWatcher {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f434b;

    public /* synthetic */ c3(Object obj, int i10) {
        this.f433a = i10;
        this.f434b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String str;
        int i10 = this.f433a;
        Object obj = this.f434b;
        switch (i10) {
            case 1:
                TextInputLayout textInputLayout = (TextInputLayout) obj;
                textInputLayout.t(!textInputLayout.O0, false);
                if (textInputLayout.B) {
                    textInputLayout.n(editable);
                }
                if (textInputLayout.J) {
                    textInputLayout.u(editable);
                    return;
                }
                return;
            case 2:
                h8.x xVar = (h8.x) obj;
                if (editable != null) {
                    str = editable.toString().trim().toLowerCase();
                } else {
                    str = "";
                }
                xVar.f5138t = str;
                xVar.i();
                return;
            default:
                return;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        String charSequence2;
        int i13 = this.f433a;
        Object obj = this.f434b;
        switch (i13) {
            case 0:
                SearchView searchView = (SearchView) obj;
                Editable text = searchView.G.getText();
                searchView.f363p0 = text;
                boolean z9 = !TextUtils.isEmpty(text);
                searchView.x(z9);
                boolean z10 = !z9;
                int i14 = 8;
                if (searchView.f362o0 && !searchView.f355h0 && z10) {
                    searchView.L.setVisibility(8);
                    i14 = 0;
                }
                searchView.N.setVisibility(i14);
                searchView.t();
                searchView.w();
                charSequence.toString();
                searchView.getClass();
                return;
            case 1:
            case 2:
                return;
            case 3:
                h8.y yVar = (h8.y) obj;
                if (charSequence == null) {
                    charSequence2 = "";
                } else {
                    charSequence2 = charSequence.toString();
                }
                yVar.a(charSequence2);
                return;
            default:
                if (charSequence != null && charSequence.length() >= 2) {
                    ((n8.a) ((z3.e) obj).f12044b).f8024b.F.d(charSequence.toString());
                    return;
                }
                return;
        }
    }
}
