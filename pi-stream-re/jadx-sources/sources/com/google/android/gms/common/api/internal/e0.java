package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class e0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2397c;

    public /* synthetic */ e0(Object obj, int i10, int i11) {
        this.f2395a = i11;
        this.f2397c = obj;
        this.f2396b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2395a;
        int i11 = this.f2396b;
        Object obj = this.f2397c;
        switch (i10) {
            case 0:
                ((g0) obj).i(i11);
                return;
            default:
                RecyclerView recyclerView = ((com.google.android.material.datepicker.k) obj).f2737t0;
                if (!recyclerView.O) {
                    m3.k0 k0Var = recyclerView.E;
                    if (k0Var == null) {
                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                        return;
                    } else {
                        k0Var.w0(recyclerView, i11);
                        return;
                    }
                }
                return;
        }
    }
}
