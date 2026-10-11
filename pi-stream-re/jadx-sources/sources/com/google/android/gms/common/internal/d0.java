package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    public Object f2507a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2508b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f2509c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2510d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f2511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f f2512f;

    public d0(f fVar, int i10, Bundle bundle) {
        this.f2512f = fVar;
        Boolean bool = Boolean.TRUE;
        this.f2509c = fVar;
        this.f2507a = bool;
        this.f2508b = false;
        this.f2510d = i10;
        this.f2511e = bundle;
    }

    public final /* bridge */ void a() {
        f fVar = this.f2512f;
        PendingIntent pendingIntent = null;
        int i10 = this.f2510d;
        if (i10 == 0) {
            if (!c()) {
                fVar.c(1, null);
                b(new b5.a(8, null));
                return;
            }
            return;
        }
        fVar.c(1, null);
        Bundle bundle = this.f2511e;
        if (bundle != null) {
            pendingIntent = (PendingIntent) bundle.getParcelable(f.KEY_PENDING_INTENT);
        }
        b(new b5.a(i10, pendingIntent));
    }

    public abstract void b(b5.a aVar);

    public abstract boolean c();

    public final void d() {
        synchronized (this) {
            this.f2507a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.f2509c.zzt;
        synchronized (arrayList) {
            arrayList2 = this.f2509c.zzt;
            arrayList2.remove(this);
        }
    }
}
