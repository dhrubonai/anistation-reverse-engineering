package i4;

import android.app.Activity;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Set f5350a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f5351b;

    @Override // i4.g
    public final void d(Activity activity) {
        if (this.f5351b || !this.f5350a.add(activity)) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        decorView.getViewTreeObserver().addOnDrawListener(new e(this, decorView));
    }
}
