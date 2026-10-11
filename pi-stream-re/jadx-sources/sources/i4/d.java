package i4;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnDrawListener f5346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f5347b;

    public d(e eVar, ViewTreeObserver.OnDrawListener onDrawListener) {
        this.f5347b = eVar;
        this.f5346a = onDrawListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e4.u a10 = e4.u.a();
        a10.getClass();
        p4.m.a();
        a10.f3525d.set(true);
        this.f5347b.f5349b.f5351b = true;
        View view = this.f5347b.f5348a;
        view.getViewTreeObserver().removeOnDrawListener(this.f5346a);
        this.f5347b.f5349b.f5350a.clear();
    }
}
