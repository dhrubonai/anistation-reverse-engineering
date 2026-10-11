package com.google.android.gms.common.api.internal;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2469a;

    /* renamed from: b, reason: collision with root package name */
    public int f2470b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2471c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2472d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2473e;

    public /* synthetic */ v() {
        this.f2469a = 0;
        this.f2471c = true;
        this.f2470b = 0;
    }

    public final s0 a() {
        boolean z9;
        if (((s) this.f2472d) != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.i("execute parameter required", z9);
        return new s0(this, (b5.c[]) this.f2473e, this.f2471c, this.f2470b);
    }

    public final void b(int i10) {
        switch (this.f2469a) {
            case 1:
                WeakReference weakReference = ((BottomSheetBehavior) this.f2473e).U;
                if (weakReference != null && weakReference.get() != null) {
                    this.f2470b = i10;
                    if (!this.f2471c) {
                        View view = (View) ((BottomSheetBehavior) this.f2473e).U.get();
                        Runnable runnable = (Runnable) this.f2472d;
                        WeakHashMap weakHashMap = g0.y0.f4277a;
                        g0.h0.m(view, runnable);
                        this.f2471c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                WeakReference weakReference2 = ((SideSheetBehavior) this.f2473e).o;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f2470b = i10;
                    if (!this.f2471c) {
                        View view2 = (View) ((SideSheetBehavior) this.f2473e).o.get();
                        Runnable runnable2 = (Runnable) this.f2472d;
                        WeakHashMap weakHashMap2 = g0.y0.f4277a;
                        g0.h0.m(view2, runnable2);
                        this.f2471c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public v(SideSheetBehavior sideSheetBehavior) {
        this.f2469a = 2;
        this.f2473e = sideSheetBehavior;
        this.f2472d = new androidx.activity.b(this, 16);
    }

    public v(BottomSheetBehavior bottomSheetBehavior) {
        this.f2469a = 1;
        this.f2473e = bottomSheetBehavior;
        this.f2472d = new g.f(this, 10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this(bottomSheetBehavior);
        this.f2469a = 1;
    }
}
