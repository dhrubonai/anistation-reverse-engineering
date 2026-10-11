package m6;

import android.text.Editable;

/* loaded from: classes.dex */
public final class l extends e6.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f7485a;

    public l(n nVar) {
        this.f7485a = nVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f7485a.b().a();
    }

    @Override // e6.j, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f7485a.b().b();
    }
}
