package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import java.util.Set;

/* loaded from: classes.dex */
public final class r0 extends r5.c implements com.google.android.gms.common.api.m, com.google.android.gms.common.api.n {

    /* renamed from: h, reason: collision with root package name */
    public static final s4.g f2456h = q5.b.f9201a;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2457a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f2458b;

    /* renamed from: c, reason: collision with root package name */
    public final s4.g f2459c = f2456h;

    /* renamed from: d, reason: collision with root package name */
    public final Set f2460d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.common.internal.h f2461e;

    /* renamed from: f, reason: collision with root package name */
    public q5.c f2462f;

    /* renamed from: g, reason: collision with root package name */
    public i0 f2463g;

    public r0(Context context, Handler handler, com.google.android.gms.common.internal.h hVar) {
        this.f2457a = context;
        this.f2458b = handler;
        this.f2461e = hVar;
        this.f2460d = hVar.f2522b;
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void a(int i10) {
        this.f2462f.disconnect();
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void b() {
        this.f2462f.a(this);
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void c(b5.a aVar) {
        this.f2463g.e(aVar);
    }
}
