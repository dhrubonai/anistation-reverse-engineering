package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.os.Handler;
import android.os.Looper;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class i0 implements com.google.android.gms.common.internal.d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2431a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2432b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2433c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2434d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2435e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2436f;

    public i0(h hVar, com.google.android.gms.common.api.g gVar, a aVar) {
        this.f2436f = hVar;
        this.f2434d = null;
        this.f2435e = null;
        this.f2431a = false;
        this.f2432b = gVar;
        this.f2433c = aVar;
    }

    public final void a(String str) {
        ((Handler) this.f2436f).post(new d8.a(1, this, str, 1 == true ? 1 : 0));
    }

    @Override // com.google.android.gms.common.internal.d
    public final void b(b5.a aVar) {
        ((h) this.f2436f).E.post(new t0(2, this, aVar));
    }

    public final void c(boolean z9) {
        this.f2431a = z9;
        ((Handler) this.f2436f).post(new l1.p(1, this, z9));
    }

    public final void d(String str) {
        ((Handler) this.f2436f).post(new f.m0(20, this, str));
    }

    public final void e(b5.a aVar) {
        g0 g0Var = (g0) ((h) this.f2436f).A.get((a) this.f2433c);
        if (g0Var != null) {
            w7.b.l(g0Var.f2415m.E);
            com.google.android.gms.common.api.g gVar = g0Var.f2404b;
            String name = gVar.getClass().getName();
            String valueOf = String.valueOf(aVar);
            StringBuilder sb = new StringBuilder(name.length() + 25 + valueOf.length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            gVar.disconnect(sb.toString());
            g0Var.p(aVar, null);
        }
    }

    public i0(Dialog dialog, TextView textView, ProgressBar progressBar, TextView textView2) {
        this.f2436f = new Handler(Looper.getMainLooper());
        this.f2432b = dialog;
        this.f2433c = textView;
        this.f2434d = progressBar;
        this.f2435e = textView2;
    }
}
