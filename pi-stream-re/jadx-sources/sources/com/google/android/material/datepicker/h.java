package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import m3.a0;
import m3.w0;

/* loaded from: classes.dex */
public final class h extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ k F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, int i10, int i11) {
        super(i10);
        this.F = kVar;
        this.E = i11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m3.k0
    public final void w0(RecyclerView recyclerView, int i10) {
        a0 a0Var = new a0(3, recyclerView.getContext(), this);
        a0Var.f7391a = i10;
        x0(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void z0(w0 w0Var, int[] iArr) {
        int i10 = this.E;
        k kVar = this.F;
        if (i10 == 0) {
            iArr[0] = kVar.f2737t0.getWidth();
            iArr[1] = kVar.f2737t0.getWidth();
        } else {
            iArr[0] = kVar.f2737t0.getHeight();
            iArr[1] = kVar.f2737t0.getHeight();
        }
    }
}
