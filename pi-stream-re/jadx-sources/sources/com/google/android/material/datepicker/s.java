package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import g0.d0;
import g0.y0;
import java.util.WeakHashMap;
import m3.a1;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class s extends a1 {

    /* renamed from: u, reason: collision with root package name */
    public final TextView f2760u;

    /* renamed from: v, reason: collision with root package name */
    public final MaterialCalendarGridView f2761v;

    public s(LinearLayout linearLayout, boolean z9) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f2760u = textView;
        WeakHashMap weakHashMap = y0.f4277a;
        new d0(R.id.tag_accessibility_heading, 3).c(textView, Boolean.TRUE);
        this.f2761v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z9) {
            textView.setVisibility(8);
        }
    }
}
