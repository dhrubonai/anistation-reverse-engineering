package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2850a;

    public b(ClockFaceView clockFaceView) {
        this.f2850a = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f2850a;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.K.f2843d) - clockFaceView.S;
        if (height != clockFaceView.I) {
            clockFaceView.I = height;
            clockFaceView.f();
            int i10 = clockFaceView.I;
            ClockHandView clockHandView = clockFaceView.K;
            clockHandView.C = i10;
            clockHandView.invalidate();
        }
        return true;
    }
}
