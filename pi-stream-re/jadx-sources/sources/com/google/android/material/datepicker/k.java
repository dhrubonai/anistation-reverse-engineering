package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.material.button.MaterialButton;
import g0.y0;
import java.util.Calendar;
import java.util.GregorianCalendar;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class k<S> extends u {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f2730y0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public int f2731n0;

    /* renamed from: o0, reason: collision with root package name */
    public c f2732o0;

    /* renamed from: p0, reason: collision with root package name */
    public p f2733p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f2734q0;

    /* renamed from: r0, reason: collision with root package name */
    public android.support.v4.media.d f2735r0;

    /* renamed from: s0, reason: collision with root package name */
    public RecyclerView f2736s0;

    /* renamed from: t0, reason: collision with root package name */
    public RecyclerView f2737t0;

    /* renamed from: u0, reason: collision with root package name */
    public View f2738u0;

    /* renamed from: v0, reason: collision with root package name */
    public View f2739v0;

    /* renamed from: w0, reason: collision with root package name */
    public View f2740w0;

    /* renamed from: x0, reason: collision with root package name */
    public View f2741x0;

    @Override // androidx.fragment.app.y
    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2731n0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2732o0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f2733p0);
    }

    public final void U(p pVar) {
        boolean z9;
        p pVar2 = ((t) this.f2737t0.getAdapter()).f2762d.f2709a;
        Calendar calendar = pVar2.f2746a;
        if (calendar instanceof GregorianCalendar) {
            int i10 = pVar.f2748c;
            int i11 = pVar2.f2748c;
            int i12 = pVar.f2747b;
            int i13 = pVar2.f2747b;
            int i14 = (i12 - i13) + ((i10 - i11) * 12);
            p pVar3 = this.f2733p0;
            if (calendar instanceof GregorianCalendar) {
                int i15 = i14 - ((pVar3.f2747b - i13) + ((pVar3.f2748c - i11) * 12));
                int i16 = 1;
                boolean z10 = false;
                if (Math.abs(i15) > 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i15 > 0) {
                    z10 = true;
                }
                this.f2733p0 = pVar;
                if (z9 && z10) {
                    this.f2737t0.e0(i14 - 3);
                    this.f2737t0.post(new e0(this, i14, i16));
                    return;
                } else if (z9) {
                    this.f2737t0.e0(i14 + 3);
                    this.f2737t0.post(new e0(this, i14, i16));
                    return;
                } else {
                    this.f2737t0.post(new e0(this, i14, i16));
                    return;
                }
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void V(int i10) {
        this.f2734q0 = i10;
        if (i10 == 2) {
            this.f2736s0.getLayoutManager().m0(this.f2733p0.f2748c - ((y) this.f2736s0.getAdapter()).f2768d.f2732o0.f2709a.f2748c);
            this.f2740w0.setVisibility(0);
            this.f2741x0.setVisibility(8);
            this.f2738u0.setVisibility(8);
            this.f2739v0.setVisibility(8);
            return;
        }
        if (i10 == 1) {
            this.f2740w0.setVisibility(8);
            this.f2741x0.setVisibility(0);
            this.f2738u0.setVisibility(0);
            this.f2739v0.setVisibility(0);
            U(this.f2733p0);
        }
    }

    @Override // androidx.fragment.app.y
    public final void x(Bundle bundle) {
        super.x(bundle);
        if (bundle == null) {
            bundle = this.f1039f;
        }
        this.f2731n0 = bundle.getInt("THEME_RES_ID_KEY");
        a3.g.y(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f2732o0 = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        a3.g.y(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f2733p0 = (p) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.y
    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i10;
        int i11;
        e eVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(k(), this.f2731n0);
        this.f2735r0 = new android.support.v4.media.d(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        p pVar = this.f2732o0.f2709a;
        int i12 = 1;
        int i13 = 0;
        if (n.Z(contextThemeWrapper)) {
            i10 = R.layout.mtrl_calendar_vertical;
            i11 = 1;
        } else {
            i10 = R.layout.mtrl_calendar_horizontal;
            i11 = 0;
        }
        View inflate = cloneInContext.inflate(i10, viewGroup, false);
        Resources resources = O().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i14 = q.f2753d;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i14 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i14) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        y0.l(gridView, new g(this, i13));
        int i15 = this.f2732o0.f2713e;
        if (i15 > 0) {
            eVar = new e(i15);
        } else {
            eVar = new e();
        }
        gridView.setAdapter((ListAdapter) eVar);
        gridView.setNumColumns(pVar.f2749d);
        gridView.setEnabled(false);
        this.f2737t0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        k();
        this.f2737t0.setLayoutManager(new h(this, i11, i11));
        this.f2737t0.setTag("MONTHS_VIEW_GROUP_TAG");
        t tVar = new t(contextThemeWrapper, this.f2732o0, new k3.d(this, 22));
        this.f2737t0.setAdapter(tVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f2736s0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f2736s0.setLayoutManager(new GridLayoutManager(integer));
            this.f2736s0.setAdapter(new y(this));
            this.f2736s0.i(new i(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            y0.l(materialButton, new g(this, 2));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.f2738u0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.f2739v0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f2740w0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f2741x0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            V(1);
            materialButton.setText(this.f2733p0.f());
            this.f2737t0.j(new j(this, tVar, materialButton));
            materialButton.setOnClickListener(new f.b(this, 3));
            this.f2739v0.setOnClickListener(new f(this, tVar, i12));
            this.f2738u0.setOnClickListener(new f(this, tVar, i13));
        }
        if (!n.Z(contextThemeWrapper)) {
            new m3.x(i12).a(this.f2737t0);
        }
        RecyclerView recyclerView2 = this.f2737t0;
        p pVar2 = this.f2733p0;
        p pVar3 = tVar.f2762d.f2709a;
        if (pVar3.f2746a instanceof GregorianCalendar) {
            recyclerView2.e0((pVar2.f2747b - pVar3.f2747b) + ((pVar2.f2748c - pVar3.f2748c) * 12));
            y0.l(this.f2737t0, new g(this, i12));
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }
}
