package com.google.android.material.datepicker;

import android.os.Build;
import android.text.format.DateUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import m3.o0;

/* loaded from: classes.dex */
public final class j extends o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f2727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialButton f2728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f2729c;

    public j(k kVar, t tVar, MaterialButton materialButton) {
        this.f2729c = kVar;
        this.f2727a = tVar;
        this.f2728b = materialButton;
    }

    @Override // m3.o0
    public final void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f2728b.getText());
        }
    }

    @Override // m3.o0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int K0;
        String formatDateTime;
        k kVar = this.f2729c;
        if (i10 < 0) {
            K0 = ((LinearLayoutManager) kVar.f2737t0.getLayoutManager()).J0();
        } else {
            K0 = ((LinearLayoutManager) kVar.f2737t0.getLayoutManager()).K0();
        }
        t tVar = this.f2727a;
        Calendar b10 = w.b(tVar.f2762d.f2709a.f2746a);
        b10.add(2, K0);
        kVar.f2733p0 = new p(b10);
        Calendar b11 = w.b(tVar.f2762d.f2709a.f2746a);
        b11.add(2, K0);
        b11.set(5, 1);
        Calendar b12 = w.b(b11);
        b12.get(2);
        b12.get(1);
        b12.getMaximum(7);
        b12.getActualMaximum(5);
        b12.getTimeInMillis();
        long timeInMillis = b12.getTimeInMillis();
        if (Build.VERSION.SDK_INT >= 24) {
            formatDateTime = w.a("yMMMM", Locale.getDefault()).format(new Date(timeInMillis));
        } else {
            formatDateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
        }
        this.f2728b.setText(formatDateTime);
    }
}
