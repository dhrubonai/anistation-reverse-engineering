package j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.i1;
import f.p0;

/* loaded from: classes.dex */
public final class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5508c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f5510e;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f5506a = i10;
        this.f5510e = obj;
        this.f5507b = obj2;
        this.f5508c = obj3;
        this.f5509d = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f5506a;
        Object obj = this.f5510e;
        Object obj2 = this.f5509d;
        Object obj3 = this.f5508c;
        Object obj4 = this.f5507b;
        switch (i10) {
            case 0:
                h hVar = (h) obj4;
                if (hVar != null) {
                    p0 p0Var = (p0) obj;
                    ((i) p0Var.f3762b).R = true;
                    hVar.f5512b.c(false);
                    ((i) p0Var.f3762b).R = false;
                }
                MenuItem menuItem = (MenuItem) obj3;
                if (menuItem.isEnabled() && menuItem.hasSubMenu()) {
                    ((o) obj2).q(menuItem, null, 4);
                    return;
                }
                return;
            case 1:
                ((i1) obj4).getClass();
                i1.g((View) obj3, (Rect) obj2);
                return;
            default:
                try {
                    ((z7.f) obj).getClass();
                    z7.f.g((Context) obj4, (z7.b) obj3, (String) obj2);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
