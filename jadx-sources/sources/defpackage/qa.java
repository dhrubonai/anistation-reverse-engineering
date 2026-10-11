package defpackage;

import android.app.Notification;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class qa {
    public static void a(Notification.Action.Builder builder) {
        builder.setEmphasisHint(0);
    }

    public static final void b(uh5 uh5Var, AccessibilityEvent accessibilityEvent) {
        int i;
        ph5 ph5Var = uh5Var.d;
        Object g = ph5Var.x.g(yh5.M);
        Object obj = null;
        if (g == null) {
            g = null;
        }
        xz2 xz2Var = (xz2) g;
        Object g2 = ph5Var.x.g(yh5.I);
        if (g2 != null) {
            obj = g2;
        }
        if (((nd6) obj) != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (xz2Var != null && xz2Var.b) {
            i |= 4;
        }
        if (xz2Var != null && xz2Var.a) {
            i |= 2;
        }
        accessibilityEvent.setTextChangeTypes(i | accessibilityEvent.getTextChangeTypes());
    }

    public static void c(Notification.Action.Builder builder) {
        builder.setStyleHint(0);
    }
}
