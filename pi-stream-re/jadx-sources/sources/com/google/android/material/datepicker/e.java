package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public static final int f2717d;

    /* renamed from: a, reason: collision with root package name */
    public final Calendar f2718a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2719b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2720c;

    static {
        int i10;
        if (Build.VERSION.SDK_INT >= 26) {
            i10 = 4;
        } else {
            i10 = 1;
        }
        f2717d = i10;
    }

    public e() {
        Calendar d10 = w.d(null);
        this.f2718a = d10;
        this.f2719b = d10.getMaximum(7);
        this.f2720c = d10.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f2719b;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        int i11 = this.f2719b;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f2720c;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i11 = i10 + this.f2720c;
        int i12 = this.f2719b;
        if (i11 > i12) {
            i11 -= i12;
        }
        Calendar calendar = this.f2718a;
        calendar.set(7, i11);
        textView.setText(calendar.getDisplayName(7, f2717d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public e(int i10) {
        Calendar d10 = w.d(null);
        this.f2718a = d10;
        this.f2719b = d10.getMaximum(7);
        this.f2720c = i10;
    }
}
