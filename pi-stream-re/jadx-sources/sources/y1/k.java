package y1;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import r6.m1;

/* loaded from: classes.dex */
public final class k implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f11500a;

    public k(p pVar) {
        this.f11500a = pVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z9) {
        p pVar = this.f11500a;
        m1 m1Var = p.f11515j;
        pVar.i();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z9) {
        p pVar = this.f11500a;
        m1 m1Var = p.f11515j;
        pVar.i();
    }
}
