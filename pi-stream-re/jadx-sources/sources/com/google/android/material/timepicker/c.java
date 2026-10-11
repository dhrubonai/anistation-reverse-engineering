package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class c extends g0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f2851d;

    public c(ClockFaceView clockFaceView) {
        this.f2851d = clockFaceView;
    }

    @Override // g0.c
    public final void d(View view, h0.h hVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4171a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f4539a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f2851d.O.get(intValue - 1));
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        hVar.b(h0.g.f4526e);
    }

    @Override // g0.c
    public final boolean g(View view, int i10, Bundle bundle) {
        if (i10 == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.f2851d;
            view.getHitRect(clockFaceView.L);
            float centerX = clockFaceView.L.centerX();
            float centerY = clockFaceView.L.centerY();
            clockFaceView.K.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.K.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.g(view, i10, bundle);
    }
}
