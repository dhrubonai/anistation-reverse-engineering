package com.google.android.gms.common.internal;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    public static s f2592b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f2593c = new t(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public t f2594a;

    public static synchronized s a() {
        s sVar;
        synchronized (s.class) {
            if (f2592b == null) {
                f2592b = new s();
            }
            sVar = f2592b;
        }
        return sVar;
    }
}
