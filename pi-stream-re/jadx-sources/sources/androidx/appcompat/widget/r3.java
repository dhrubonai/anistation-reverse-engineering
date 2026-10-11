package androidx.appcompat.widget;

import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class r3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView.SearchAutoComplete f635a;

    public r3(SearchView.SearchAutoComplete searchAutoComplete) {
        this.f635a = searchAutoComplete;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SearchView.SearchAutoComplete searchAutoComplete = this.f635a;
        if (searchAutoComplete.f373x) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.f373x = false;
        }
    }
}
