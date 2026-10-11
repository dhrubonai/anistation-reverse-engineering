package v5;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import g0.h0;
import g0.y0;
import java.util.WeakHashMap;
import o0.d;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final View f10666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f10667b;

    public b(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z9) {
        this.f10667b = swipeDismissBehavior;
        this.f10666a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.f10667b.f2643a;
        if (dVar != null && dVar.g()) {
            WeakHashMap weakHashMap = y0.f4277a;
            h0.m(this.f10666a, this);
        }
    }
}
