package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.b0;
import f9.x;
import java.util.List;
import java.util.Map;
import o1.d0;
import x3.q;

/* loaded from: classes.dex */
public final class f extends ContextWrapper {

    /* renamed from: k, reason: collision with root package name */
    public static final a f2214k = new a();

    /* renamed from: a, reason: collision with root package name */
    public final y3.h f2215a;

    /* renamed from: b, reason: collision with root package name */
    public final x3.p f2216b;

    /* renamed from: c, reason: collision with root package name */
    public final x f2217c;

    /* renamed from: d, reason: collision with root package name */
    public final k3.d f2218d;

    /* renamed from: e, reason: collision with root package name */
    public final List f2219e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f2220f;

    /* renamed from: g, reason: collision with root package name */
    public final q f2221g;

    /* renamed from: h, reason: collision with root package name */
    public final b0 f2222h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2223i;

    /* renamed from: j, reason: collision with root package name */
    public l4.f f2224j;

    public f(Context context, y3.h hVar, d0 d0Var, x xVar, k3.d dVar, n.e eVar, List list, q qVar, b0 b0Var, int i10) {
        super(context.getApplicationContext());
        this.f2215a = hVar;
        this.f2217c = xVar;
        this.f2218d = dVar;
        this.f2219e = list;
        this.f2220f = eVar;
        this.f2221g = qVar;
        this.f2222h = b0Var;
        this.f2223i = i10;
        this.f2216b = new x3.p(d0Var);
    }

    public final synchronized l4.f a() {
        if (this.f2224j == null) {
            this.f2218d.getClass();
            l4.f fVar = new l4.f();
            fVar.K = true;
            this.f2224j = fVar;
        }
        return this.f2224j;
    }

    public final j b() {
        return (j) this.f2216b.get();
    }
}
