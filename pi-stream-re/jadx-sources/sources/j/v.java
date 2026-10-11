package j;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class v implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f5603a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f5604b;

    public v(w wVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f5604b = wVar;
        this.f5603a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f5603a.onMenuItemClick(this.f5604b.c(menuItem));
    }
}
