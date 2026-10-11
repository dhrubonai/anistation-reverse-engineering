package com.google.android.material.datepicker;

import java.util.Calendar;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final long f2702f;

    /* renamed from: g, reason: collision with root package name */
    public static final long f2703g;

    /* renamed from: a, reason: collision with root package name */
    public final long f2704a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2705b;

    /* renamed from: c, reason: collision with root package name */
    public Long f2706c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2707d;

    /* renamed from: e, reason: collision with root package name */
    public final b f2708e;

    static {
        p d10 = p.d(1900, 0);
        Calendar d11 = w.d(null);
        d11.setTimeInMillis(d10.f2751f);
        f2702f = w.b(d11).getTimeInMillis();
        p d12 = p.d(2100, 11);
        Calendar d13 = w.d(null);
        d13.setTimeInMillis(d12.f2751f);
        f2703g = w.b(d13).getTimeInMillis();
    }

    public a(c cVar) {
        this.f2704a = f2702f;
        this.f2705b = f2703g;
        this.f2708e = new d(Long.MIN_VALUE);
        this.f2704a = cVar.f2709a.f2751f;
        this.f2705b = cVar.f2710b.f2751f;
        this.f2706c = Long.valueOf(cVar.f2712d.f2751f);
        this.f2707d = cVar.f2713e;
        this.f2708e = cVar.f2711c;
    }
}
