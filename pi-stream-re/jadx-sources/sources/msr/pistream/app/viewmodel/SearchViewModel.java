package msr.pistream.app.viewmodel;

import androidx.lifecycle.c0;
import androidx.lifecycle.w0;
import b8.a;
import dagger.hilt.android.lifecycle.HiltViewModel;
import e8.c;
import f1.k;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import y7.v;

@HiltViewModel
/* loaded from: classes.dex */
public class SearchViewModel extends w0 {

    /* renamed from: a, reason: collision with root package name */
    public final v f7850a;

    /* renamed from: b, reason: collision with root package name */
    public final c f7851b;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f7852c = Executors.newSingleThreadExecutor();

    /* renamed from: d, reason: collision with root package name */
    public final c0 f7853d = new c0();

    public SearchViewModel(v vVar, c cVar) {
        new c0();
        this.f7850a = vVar;
        this.f7851b = cVar;
    }

    public final void b(int i10, String str) {
        c0 c0Var = this.f7853d;
        if (str != null && !str.trim().isEmpty()) {
            if (i10 == 1) {
                c0Var.h(a.c());
            }
            this.f7852c.execute(new k(this, str, i10, 11));
            return;
        }
        c0Var.h(a.d(Collections.emptyList()));
    }

    @Override // androidx.lifecycle.w0
    public final void onCleared() {
        this.f7852c.shutdown();
    }
}
