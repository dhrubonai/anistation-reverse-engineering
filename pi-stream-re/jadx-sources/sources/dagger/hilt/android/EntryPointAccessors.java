package dagger.hilt.android;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.y;
import dagger.hilt.EntryPoints;
import dagger.hilt.android.internal.Contexts;
import r6.h0;

/* loaded from: classes.dex */
public final class EntryPointAccessors {
    public static final EntryPointAccessors INSTANCE = new EntryPointAccessors();

    private EntryPointAccessors() {
    }

    public static final <T> T fromActivity(Activity activity, Class<T> cls) {
        h0.u(activity, "activity");
        h0.u(cls, "entryPoint");
        return (T) EntryPoints.get(activity, cls);
    }

    public static final <T> T fromApplication(Context context, Class<T> cls) {
        h0.u(context, "context");
        h0.u(cls, "entryPoint");
        return (T) EntryPoints.get(Contexts.getApplication(context.getApplicationContext()), cls);
    }

    public static final <T> T fromFragment(y yVar, Class<T> cls) {
        h0.u(yVar, "fragment");
        h0.u(cls, "entryPoint");
        return (T) EntryPoints.get(yVar, cls);
    }

    public static final <T> T fromView(View view, Class<T> cls) {
        h0.u(view, "view");
        h0.u(cls, "entryPoint");
        return (T) EntryPoints.get(view, cls);
    }

    public final <T> T fromActivity(Activity activity) {
        h0.u(activity, "activity");
        h0.W0();
        throw null;
    }

    public final <T> T fromApplication(Context context) {
        h0.u(context, "context");
        h0.W0();
        throw null;
    }

    public final <T> T fromFragment(y yVar) {
        h0.u(yVar, "fragment");
        h0.W0();
        throw null;
    }

    public final <T> T fromView(View view) {
        h0.u(view, "view");
        h0.W0();
        throw null;
    }
}
