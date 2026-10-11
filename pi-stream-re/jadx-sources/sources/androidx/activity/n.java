package androidx.activity;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f277b;

    public /* synthetic */ n(Runnable runnable, int i10) {
        this.f276a = i10;
        this.f277b = runnable;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f276a) {
            case 0:
            default:
                this.f277b.run();
                return;
        }
    }
}
