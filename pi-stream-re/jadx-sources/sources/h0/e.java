package h0;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import g0.h0;
import g0.y0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final d f4525a;

    public e(d dVar) {
        this.f4525a = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        return this.f4525a.equals(((e) obj).f4525a);
    }

    public final int hashCode() {
        return this.f4525a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z9) {
        boolean z10;
        m6.k kVar = (m6.k) ((w.f) this.f4525a).f10698b;
        AutoCompleteTextView autoCompleteTextView = kVar.f7475h;
        if (autoCompleteTextView != null) {
            int i10 = 1;
            if (autoCompleteTextView.getInputType() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (z9) {
                    i10 = 2;
                }
                WeakHashMap weakHashMap = y0.f4277a;
                h0.s(kVar.f7499d, i10);
            }
        }
    }
}
