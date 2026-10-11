package j;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class u implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f5601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f5602b;

    public u(w wVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f5602b = wVar;
        this.f5601a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f5601a.onMenuItemActionCollapse(this.f5602b.c(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f5601a.onMenuItemActionExpand(this.f5602b.c(menuItem));
    }
}
