package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import m3.a1;
import m3.d0;
import m3.l0;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class t extends d0 {

    /* renamed from: d, reason: collision with root package name */
    public final c f2762d;

    /* renamed from: e, reason: collision with root package name */
    public final k3.d f2763e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2764f;

    public t(ContextThemeWrapper contextThemeWrapper, c cVar, k3.d dVar) {
        int i10;
        Calendar calendar = cVar.f2709a.f2746a;
        p pVar = cVar.f2712d;
        if (calendar.compareTo(pVar.f2746a) <= 0) {
            if (pVar.f2746a.compareTo(cVar.f2710b.f2746a) <= 0) {
                int i11 = q.f2753d;
                int i12 = k.f2730y0;
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i11;
                if (n.Z(contextThemeWrapper)) {
                    i10 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i10 = 0;
                }
                this.f2764f = dimensionPixelSize + i10;
                this.f2762d = cVar;
                this.f2763e = dVar;
                if (!this.f7192a.a()) {
                    this.f7193b = true;
                    return;
                }
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // m3.d0
    public final int a() {
        return this.f2762d.f2715x;
    }

    @Override // m3.d0
    public final long b(int i10) {
        Calendar b10 = w.b(this.f2762d.f2709a.f2746a);
        b10.add(2, i10);
        return new p(b10).f2746a.getTimeInMillis();
    }

    @Override // m3.d0
    public final void c(a1 a1Var, int i10) {
        s sVar = (s) a1Var;
        c cVar = this.f2762d;
        Calendar b10 = w.b(cVar.f2709a.f2746a);
        b10.add(2, i10);
        p pVar = new p(b10);
        sVar.f2760u.setText(pVar.f());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) sVar.f2761v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() != null && pVar.equals(materialCalendarGridView.getAdapter().f2755a)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().getClass();
            throw null;
        }
        new q(pVar, cVar);
        throw null;
    }

    @Override // m3.d0
    public final a1 d(RecyclerView recyclerView) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (n.Z(recyclerView.getContext())) {
            linearLayout.setLayoutParams(new l0(-1, this.f2764f));
            return new s(linearLayout, true);
        }
        return new s(linearLayout, false);
    }
}
