package j;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.n0;
import androidx.appcompat.widget.o0;
import androidx.appcompat.widget.t0;
import androidx.appcompat.widget.u2;
import androidx.appcompat.widget.w0;
import g0.k0;
import g0.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5501a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5502b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f5501a = i10;
        this.f5502b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i10 = this.f5501a;
        boolean z9 = false;
        Object obj = this.f5502b;
        switch (i10) {
            case 0:
                i iVar = (i) obj;
                if (iVar.b()) {
                    ArrayList arrayList = iVar.f5529z;
                    if (arrayList.size() > 0 && !((h) arrayList.get(0)).f5511a.P) {
                        View view = iVar.G;
                        if (view != null && view.isShown()) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                ((h) it.next()).f5511a.d();
                            }
                            return;
                        }
                        iVar.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                h0 h0Var = (h0) obj;
                if (h0Var.b()) {
                    u2 u2Var = h0Var.f5521z;
                    if (!u2Var.P) {
                        View view2 = h0Var.E;
                        if (view2 != null && view2.isShown()) {
                            u2Var.d();
                            return;
                        } else {
                            h0Var.dismiss();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 2:
                w0 w0Var = (w0) obj;
                if (!w0Var.getInternalPopup().b()) {
                    w0Var.f693f.m(o0.b(w0Var), o0.a(w0Var));
                }
                ViewTreeObserver viewTreeObserver = w0Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    n0.a(viewTreeObserver, this);
                    return;
                }
                return;
            default:
                t0 t0Var = (t0) obj;
                w0 w0Var2 = t0Var.Y;
                WeakHashMap weakHashMap = y0.f4277a;
                if (k0.b(w0Var2) && w0Var2.getGlobalVisibleRect(t0Var.W)) {
                    z9 = true;
                }
                if (!z9) {
                    t0Var.dismiss();
                    return;
                } else {
                    t0Var.s();
                    t0Var.d();
                    return;
                }
        }
    }
}
