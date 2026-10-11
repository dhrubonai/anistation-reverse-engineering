package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public final class h3 implements View.OnKeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f518a;

    public h3(SearchView searchView) {
        this.f518a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        boolean z9;
        int length;
        SearchView searchView = this.f518a;
        if (searchView.f366s0 == null) {
            return false;
        }
        SearchView.SearchAutoComplete searchAutoComplete = searchView.G;
        if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
            if (searchView.f366s0 == null || searchView.f356i0 == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i10 != 66 && i10 != 84 && i10 != 61) {
                if (i10 != 21 && i10 != 22) {
                    if (i10 != 19) {
                        return false;
                    }
                    searchAutoComplete.getListSelection();
                    return false;
                }
                if (i10 == 21) {
                    length = 0;
                } else {
                    length = searchAutoComplete.length();
                }
                searchAutoComplete.setSelection(length);
                searchAutoComplete.setListSelection(0);
                searchAutoComplete.clearListSelection();
                searchAutoComplete.a();
            } else {
                searchView.p(searchAutoComplete.getListSelection());
            }
            return true;
        }
        if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
            return false;
        }
        view.cancelLongPress();
        searchView.getContext().startActivity(searchView.l("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
        return true;
    }
}
