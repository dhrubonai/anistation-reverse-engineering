package androidx.appcompat.widget;

import android.view.KeyEvent;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class i3 implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SearchView f533a;

    public i3(SearchView searchView) {
        this.f533a = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        this.f533a.s();
        return true;
    }
}
