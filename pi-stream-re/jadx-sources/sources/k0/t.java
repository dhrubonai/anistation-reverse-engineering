package k0;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class t implements ActionMode.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f6307a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f6308b;

    /* renamed from: c, reason: collision with root package name */
    public Class f6309c;

    /* renamed from: d, reason: collision with root package name */
    public Method f6310d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6311e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6312f = false;

    public t(ActionMode.Callback callback, TextView textView) {
        this.f6307a = callback;
        this.f6308b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f6307a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f6307a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f6307a.onDestroyActionMode(actionMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009f A[SYNTHETIC] */
    @Override // android.view.ActionMode.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.t.onPrepareActionMode(android.view.ActionMode, android.view.Menu):boolean");
    }
}
