package h0;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.o f4542a;

    public i(androidx.fragment.app.o oVar) {
        this.f4542a = oVar;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
        h g10 = this.f4542a.g(i10);
        if (g10 == null) {
            return null;
        }
        return g10.f4539a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i10) {
        this.f4542a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i10, int i11, Bundle bundle) {
        return this.f4542a.i(i10, i11, bundle);
    }
}
