package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class g extends g0.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f2725e;

    public /* synthetic */ g(k kVar, int i10) {
        this.f2724d = i10;
        this.f2725e = kVar;
    }

    @Override // g0.c
    public final void d(View view, h0.h hVar) {
        String string;
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f4539a;
        int i10 = this.f2724d;
        View.AccessibilityDelegate accessibilityDelegate = this.f4171a;
        switch (i10) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setScrollable(false);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                k kVar = this.f2725e;
                if (kVar.f2741x0.getVisibility() == 0) {
                    string = kVar.O().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection);
                } else {
                    string = kVar.O().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection);
                }
                hVar.g(string);
                return;
        }
    }
}
