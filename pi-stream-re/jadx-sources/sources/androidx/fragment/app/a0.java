package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class a0 extends com.bumptech.glide.c implements x.n, x.o, w.v, w.w, androidx.lifecycle.c1, androidx.activity.s, c.i, n3.g, x0, g0.n {
    public final Activity C;
    public final Context D;
    public final Handler E;
    public final t0 F;
    public final /* synthetic */ b0 G;

    public a0(b0 b0Var) {
        this.G = b0Var;
        Handler handler = new Handler();
        this.F = new t0();
        this.C = b0Var;
        this.D = b0Var;
        this.E = handler;
    }

    @Override // com.bumptech.glide.c
    public final View P(int i10) {
        return this.G.findViewById(i10);
    }

    @Override // com.bumptech.glide.c
    public final boolean Q() {
        Window window = this.G.getWindow();
        if (window != null && window.peekDecorView() != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.x0
    public final void a(y yVar) {
        this.G.onAttachFragment(yVar);
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.p getLifecycle() {
        return this.G.mFragmentLifecycleRegistry;
    }

    @Override // n3.g
    public final n3.e getSavedStateRegistry() {
        return this.G.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.c1
    public final androidx.lifecycle.b1 getViewModelStore() {
        return this.G.getViewModelStore();
    }

    public final void o0(g0.t tVar) {
        this.G.addMenuProvider(tVar);
    }

    public final void p0(f0.a aVar) {
        this.G.addOnConfigurationChangedListener(aVar);
    }

    public final void q0(f0.a aVar) {
        this.G.addOnMultiWindowModeChangedListener(aVar);
    }

    public final void r0(f0.a aVar) {
        this.G.addOnPictureInPictureModeChangedListener(aVar);
    }

    public final void s0(f0.a aVar) {
        this.G.addOnTrimMemoryListener(aVar);
    }

    public final androidx.activity.r t0() {
        return this.G.getOnBackPressedDispatcher();
    }

    public final void u0(g0.t tVar) {
        this.G.removeMenuProvider(tVar);
    }

    public final void v0(f0.a aVar) {
        this.G.removeOnConfigurationChangedListener(aVar);
    }

    public final void w0(f0.a aVar) {
        this.G.removeOnMultiWindowModeChangedListener(aVar);
    }

    public final void x0(f0.a aVar) {
        this.G.removeOnPictureInPictureModeChangedListener(aVar);
    }

    public final void y0(f0.a aVar) {
        this.G.removeOnTrimMemoryListener(aVar);
    }
}
