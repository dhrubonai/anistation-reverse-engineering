package b2;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class w implements v, DisplayManager.DisplayListener {

    /* renamed from: a, reason: collision with root package name */
    public final DisplayManager f1397a;

    /* renamed from: b, reason: collision with root package name */
    public w.f f1398b;

    public w(DisplayManager displayManager) {
        this.f1397a = displayManager;
    }

    @Override // b2.v
    public final void b() {
        this.f1397a.unregisterDisplayListener(this);
        this.f1398b = null;
    }

    @Override // b2.v
    public final void c(w.f fVar) {
        this.f1398b = fVar;
        Handler l10 = f1.b0.l(null);
        DisplayManager displayManager = this.f1397a;
        displayManager.registerDisplayListener(this, l10);
        fVar.h(displayManager.getDisplay(0));
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i10) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i10) {
        w.f fVar = this.f1398b;
        if (fVar != null && i10 == 0) {
            fVar.h(this.f1397a.getDisplay(0));
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i10) {
    }
}
