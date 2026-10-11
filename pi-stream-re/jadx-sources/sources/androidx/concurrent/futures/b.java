package androidx.concurrent.futures;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f738c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f739d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f740a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f741b;

    static {
        if (j.GENERATE_CANCELLATION_CAUSES) {
            f739d = null;
            f738c = null;
        } else {
            f739d = new b(null, false);
            f738c = new b(null, true);
        }
    }

    public b(Throwable th, boolean z9) {
        this.f740a = z9;
        this.f741b = th;
    }
}
