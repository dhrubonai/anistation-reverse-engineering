package androidx.concurrent.futures;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final i f755c = new i(0);

    /* renamed from: a, reason: collision with root package name */
    public volatile Thread f756a;

    /* renamed from: b, reason: collision with root package name */
    public volatile i f757b;

    public i(int i10) {
    }

    public i() {
        j.ATOMIC_HELPER.e(this, Thread.currentThread());
    }
}
