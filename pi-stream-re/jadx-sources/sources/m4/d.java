package m4;

import android.util.Log;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7438a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7439b;

    public d(e eVar) {
        this.f7439b = new WeakReference(eVar);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        int i10 = this.f7438a;
        Object obj = this.f7439b;
        switch (i10) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                e eVar = (e) ((WeakReference) obj).get();
                if (eVar != null) {
                    ArrayList arrayList = eVar.f7442b;
                    if (!arrayList.isEmpty()) {
                        int c6 = eVar.c();
                        int b10 = eVar.b();
                        if (c6 <= 0 && c6 != Integer.MIN_VALUE) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (z9) {
                            if (b10 <= 0 && b10 != Integer.MIN_VALUE) {
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                z13 = true;
                            }
                        }
                        if (z13) {
                            Iterator it = new ArrayList(arrayList).iterator();
                            while (it.hasNext()) {
                                ((l4.h) ((h) it.next())).n(c6, b10);
                            }
                            ViewTreeObserver viewTreeObserver = eVar.f7441a.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnPreDrawListener(eVar.f7443c);
                            }
                            eVar.f7443c = null;
                            arrayList.clear();
                        }
                    }
                }
                return true;
            case 1:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                j jVar = (j) ((WeakReference) obj).get();
                if (jVar != null) {
                    ArrayList arrayList2 = jVar.f7451b;
                    if (!arrayList2.isEmpty()) {
                        int c10 = jVar.c();
                        int b11 = jVar.b();
                        if (c10 <= 0 && c10 != Integer.MIN_VALUE) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            if (b11 <= 0 && b11 != Integer.MIN_VALUE) {
                                z12 = false;
                            } else {
                                z12 = true;
                            }
                            if (z12) {
                                z13 = true;
                            }
                        }
                        if (z13) {
                            Iterator it2 = new ArrayList(arrayList2).iterator();
                            while (it2.hasNext()) {
                                ((l4.h) ((h) it2.next())).n(c10, b11);
                            }
                            ViewTreeObserver viewTreeObserver2 = jVar.f7450a.getViewTreeObserver();
                            if (viewTreeObserver2.isAlive()) {
                                viewTreeObserver2.removeOnPreDrawListener(jVar.f7452c);
                            }
                            jVar.f7452c = null;
                            arrayList2.clear();
                        }
                    }
                }
                return true;
            default:
                ((CoordinatorLayout) obj).p(0);
                return true;
        }
    }

    public d(j jVar) {
        this.f7439b = new WeakReference(jVar);
    }

    public d(CoordinatorLayout coordinatorLayout) {
        this.f7439b = coordinatorLayout;
    }
}
