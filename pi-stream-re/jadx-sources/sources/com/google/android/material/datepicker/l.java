package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class l extends g0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2742d;

    @Override // g0.c
    public final void d(View view, h0.h hVar) {
        View.AccessibilityDelegate accessibilityDelegate = this.f4171a;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f4539a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(null);
    }
}
