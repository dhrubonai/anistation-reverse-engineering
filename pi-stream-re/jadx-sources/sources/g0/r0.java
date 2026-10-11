package g0;

import android.view.View;
import java.util.Objects;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public abstract class r0 {
    public static void a(View view, w0 w0Var) {
        n.k kVar = (n.k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (kVar == null) {
            kVar = new n.k();
            view.setTag(R.id.tag_unhandled_key_listeners, kVar);
        }
        Objects.requireNonNull(w0Var);
        View.OnUnhandledKeyEventListener q0Var = new q0();
        kVar.put(w0Var, q0Var);
        view.addOnUnhandledKeyEventListener(q0Var);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, w0 w0Var) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        n.k kVar = (n.k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (kVar != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kVar.getOrDefault(w0Var, null)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int i10) {
        return (T) view.requireViewById(i10);
    }

    public static void g(View view, boolean z9) {
        view.setAccessibilityHeading(z9);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, boolean z9) {
        view.setScreenReaderFocusable(z9);
    }
}
