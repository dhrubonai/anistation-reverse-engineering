package msr.pistream.app.viewmodel;

import androidx.lifecycle.c0;
import androidx.lifecycle.w0;
import dagger.hilt.android.lifecycle.HiltViewModel;
import e8.b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@HiltViewModel
/* loaded from: classes.dex */
public class AuthViewModel extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final b f7779a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f7780b = Executors.newSingleThreadExecutor();

    /* renamed from: c, reason: collision with root package name */
    public final c0 f7781c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f7782d;

    public AuthViewModel(b bVar) {
        boolean z9;
        c0 c0Var = new c0(Boolean.FALSE);
        this.f7781c = c0Var;
        this.f7782d = new c0();
        this.f7779a = bVar;
        if (bVar.f3595a.getCurrentUser() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        c0Var.j(Boolean.valueOf(z9));
    }

    @Override // androidx.lifecycle.w0
    public final void onCleared() {
        this.f7780b.shutdown();
    }
}
