package i4;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f5348a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f5349b;

    public e(f fVar, View view) {
        this.f5349b = fVar;
        this.f5348a = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        p4.m.e().post(new d(this, this));
    }
}
