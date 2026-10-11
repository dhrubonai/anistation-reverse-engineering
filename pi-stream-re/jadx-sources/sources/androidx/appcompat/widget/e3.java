package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class e3 implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f464a;

    public e3(SearchView searchView) {
        this.f464a = searchView;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z9) {
        SearchView searchView = this.f464a;
        View.OnFocusChangeListener onFocusChangeListener = searchView.f352e0;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z9);
        }
    }
}
