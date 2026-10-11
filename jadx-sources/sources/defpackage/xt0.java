package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xt0 implements ComponentCallbacks2, ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ yt0 x;

    public xt0(yt0 yt0Var) {
        this.x = yt0Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.x.f(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        yt0 yt0Var = this.x;
        yt0Var.g.a.clear();
        f45 f45Var = yt0Var.h;
        synchronized (f45Var) {
            f45Var.a.c();
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        yt0 yt0Var = this.x;
        yt0Var.g.a.clear();
        f45 f45Var = yt0Var.h;
        synchronized (f45Var) {
            f45Var.a.c();
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        this.x.t.c.setValue(Boolean.valueOf(z));
    }
}
