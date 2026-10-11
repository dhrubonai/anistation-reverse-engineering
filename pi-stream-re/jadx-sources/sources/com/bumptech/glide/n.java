package com.bumptech.glide;

import i4.v;

/* loaded from: classes.dex */
public final class n implements i4.a {

    /* renamed from: a, reason: collision with root package name */
    public final v f2275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f2276b;

    public n(o oVar, v vVar) {
        this.f2276b = oVar;
        this.f2275a = vVar;
    }

    @Override // i4.a
    public final void a(boolean z9) {
        if (z9) {
            synchronized (this.f2276b) {
                this.f2275a.g();
            }
        }
    }
}
