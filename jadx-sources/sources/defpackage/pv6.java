package defpackage;

import android.view.ViewGroup;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class pv6 {
    public static final /* synthetic */ int a = 0;

    static {
        new WeakHashMap();
    }

    public static void a(ViewGroup viewGroup, r3 r3Var) {
        q3 q3Var;
        if (r3Var == null && (nv6.a(viewGroup) instanceof q3)) {
            r3Var = new r3();
        }
        if (viewGroup.getImportantForAccessibility() == 0) {
            viewGroup.setImportantForAccessibility(1);
        }
        if (r3Var == null) {
            q3Var = null;
        } else {
            q3Var = r3Var.y;
        }
        viewGroup.setAccessibilityDelegate(q3Var);
    }
}
