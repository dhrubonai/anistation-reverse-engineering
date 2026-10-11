package q3;

import android.os.Build;

/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f9193a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f9194b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f9195c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        boolean z9 = true;
        f9193a = true;
        f9194b = true;
        if (i10 < 28) {
            z9 = false;
        }
        f9195c = z9;
    }
}
