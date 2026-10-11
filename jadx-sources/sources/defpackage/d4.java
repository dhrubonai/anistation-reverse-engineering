package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.text.LineBreakConfig;
import android.os.Bundle;
import android.text.StaticLayout;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class d4 {
    public static PackageInfo a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object b(Bundle bundle, String str) {
        return bundle.getParcelable(str, u4.class);
    }

    public static Object c(Intent intent) {
        return intent.getParcelableExtra("android.intent.extra.KEY_EVENT", KeyEvent.class);
    }

    public static String d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static final void f(vr4 vr4Var, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if ((obj instanceof OnBackInvokedCallback) && (findOnBackInvokedDispatcher = vr4Var.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
        }
    }

    public static final void g(vr4 vr4Var, wo woVar) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (woVar != null && (findOnBackInvokedDispatcher = vr4Var.findOnBackInvokedDispatcher()) != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(woVar);
        }
    }

    public static final void h(CursorAnchorInfo.Builder builder, n05 n05Var) {
        builder.setEditorBoundsInfo(a4.l().setEditorBounds(z51.R(n05Var)).setHandwritingBounds(z51.R(n05Var)).build());
    }

    public static final void i(CursorAnchorInfo.Builder builder, n05 n05Var) {
        builder.setEditorBoundsInfo(a4.l().setEditorBounds(z51.R(n05Var)).setHandwritingBounds(z51.R(n05Var)).build());
    }

    public static final void j(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }
}
