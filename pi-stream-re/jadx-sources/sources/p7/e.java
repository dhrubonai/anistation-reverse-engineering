package p7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8673b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount");

    /* renamed from: a, reason: collision with root package name */
    public final d0[] f8674a;
    private volatile int notCompletedCount;

    public e(d0[] d0VarArr) {
        this.f8674a = d0VarArr;
        this.notCompletedCount = d0VarArr.length;
    }
}
