package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class r implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f2758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f2759b;

    public r(t tVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f2759b = tVar;
        this.f2758a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j4) {
        boolean z9;
        MaterialCalendarGridView materialCalendarGridView = this.f2758a;
        boolean z10 = true;
        if (i10 >= materialCalendarGridView.getAdapter().a() && i10 <= (r5.a() + r5.f2755a.f2750e) - 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            k3.d dVar = this.f2759b.f2763e;
            long longValue = materialCalendarGridView.getAdapter().getItem(i10).longValue();
            Object obj = dVar.f6453b;
            if (longValue < ((d) ((k) obj).f2732o0.f2711c).f2716a) {
                z10 = false;
            }
            if (z10) {
                ((k) obj).getClass();
                throw null;
            }
        }
    }
}
