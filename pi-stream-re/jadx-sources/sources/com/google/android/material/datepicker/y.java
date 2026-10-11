package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import m3.a1;
import m3.d0;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class y extends d0 {

    /* renamed from: d, reason: collision with root package name */
    public final k f2768d;

    public y(k kVar) {
        this.f2768d = kVar;
    }

    @Override // m3.d0
    public final int a() {
        return this.f2768d.f2732o0.f2714f;
    }

    @Override // m3.d0
    public final void c(a1 a1Var, int i10) {
        String format;
        k kVar = this.f2768d;
        int i11 = kVar.f2732o0.f2709a.f2748c + i10;
        String format2 = String.format(Locale.getDefault(), "%d", Integer.valueOf(i11));
        TextView textView = ((x) a1Var).f2767u;
        textView.setText(format2);
        Context context = textView.getContext();
        if (w.c().get(1) == i11) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i11));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i11));
        }
        textView.setContentDescription(format);
        android.support.v4.media.d dVar = kVar.f2735r0;
        if (w.c().get(1) == i11) {
            Object obj = dVar.f230f;
        } else {
            Object obj2 = dVar.f228d;
        }
        throw null;
    }

    @Override // m3.d0
    public final a1 d(RecyclerView recyclerView) {
        return new x((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}
