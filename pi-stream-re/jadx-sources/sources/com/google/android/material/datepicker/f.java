package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2721a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f2722b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f2723c;

    public /* synthetic */ f(k kVar, t tVar, int i10) {
        this.f2721a = i10;
        this.f2723c = kVar;
        this.f2722b = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f2721a;
        t tVar = this.f2722b;
        k kVar = this.f2723c;
        switch (i10) {
            case 0:
                int K0 = ((LinearLayoutManager) kVar.f2737t0.getLayoutManager()).K0() - 1;
                if (K0 >= 0) {
                    Calendar b10 = w.b(tVar.f2762d.f2709a.f2746a);
                    b10.add(2, K0);
                    kVar.U(new p(b10));
                    return;
                }
                return;
            default:
                int J0 = ((LinearLayoutManager) kVar.f2737t0.getLayoutManager()).J0() + 1;
                if (J0 < kVar.f2737t0.getAdapter().a()) {
                    Calendar b11 = w.b(tVar.f2762d.f2709a.f2746a);
                    b11.add(2, J0);
                    kVar.U(new p(b11));
                    return;
                }
                return;
        }
    }
}
