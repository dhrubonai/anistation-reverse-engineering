package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
public final class q0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2455b;

    public /* synthetic */ q0(Object obj, int i10) {
        this.f2454a = i10;
        this.f2455b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2454a;
        Object obj = this.f2455b;
        switch (i10) {
            case 0:
                ((r0) obj).f2463g.e(new b5.a(4));
                return;
            case 1:
                ((g0) obj).h();
                return;
            default:
                com.google.android.gms.common.api.g gVar = ((f0) obj).f2398a.f2404b;
                gVar.disconnect(gVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
        }
    }
}
