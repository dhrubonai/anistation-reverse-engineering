package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class o<S> extends u {

    /* renamed from: n0, reason: collision with root package name */
    public int f2744n0;

    /* renamed from: o0, reason: collision with root package name */
    public c f2745o0;

    @Override // androidx.fragment.app.y
    public final void F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2744n0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2745o0);
    }

    @Override // androidx.fragment.app.y
    public final void x(Bundle bundle) {
        super.x(bundle);
        if (bundle == null) {
            bundle = this.f1039f;
        }
        this.f2744n0 = bundle.getInt("THEME_RES_ID_KEY");
        a3.g.y(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f2745o0 = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.y
    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(k(), this.f2744n0));
        throw null;
    }
}
