package b7;

import z6.i;

/* loaded from: classes.dex */
public final class b implements z6.e {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1543a = new b();

    @Override // z6.e
    public final i getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // z6.e
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
