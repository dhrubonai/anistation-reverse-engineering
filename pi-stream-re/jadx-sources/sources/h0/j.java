package h0;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public class j extends i {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i10) {
        h h10 = this.f4542a.h(i10);
        if (h10 == null) {
            return null;
        }
        return h10.f4539a;
    }
}
