package z3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final int f12048e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f12049a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f12050b;

    /* renamed from: c, reason: collision with root package name */
    public final k3.d f12051c;

    /* renamed from: d, reason: collision with root package name */
    public final float f12052d;

    static {
        int i10;
        if (Build.VERSION.SDK_INT < 26) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        f12048e = i10;
    }

    public i(Context context) {
        this.f12052d = f12048e;
        this.f12049a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f12050b = activityManager;
        this.f12051c = new k3.d(context.getResources().getDisplayMetrics(), 6);
        if (Build.VERSION.SDK_INT >= 26 && activityManager.isLowRamDevice()) {
            this.f12052d = 0.0f;
        }
    }
}
