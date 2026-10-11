package j;

import android.content.Context;
import android.view.MenuItem;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5499a;

    /* renamed from: b, reason: collision with root package name */
    public n.k f5500b;

    public d(Context context) {
        this.f5499a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (menuItem instanceof b0.b) {
            b0.b bVar = (b0.b) menuItem;
            if (this.f5500b == null) {
                this.f5500b = new n.k();
            }
            MenuItem menuItem2 = (MenuItem) this.f5500b.getOrDefault(bVar, null);
            if (menuItem2 == null) {
                w wVar = new w(this.f5499a, bVar);
                this.f5500b.put(bVar, wVar);
                return wVar;
            }
            return menuItem2;
        }
        return menuItem;
    }
}
