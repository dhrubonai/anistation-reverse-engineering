package com.bumptech.glide;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class m implements m4.i {

    /* renamed from: a, reason: collision with root package name */
    public final m4.e f2273a;

    /* renamed from: b, reason: collision with root package name */
    public final View f2274b;

    public m(ImageView imageView) {
        w7.b.q(imageView);
        this.f2274b = imageView;
        this.f2273a = new m4.e(imageView);
    }

    @Override // m4.i
    public final void a(l4.c cVar) {
        this.f2274b.setTag(R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // m4.i
    public final void b(Drawable drawable) {
    }

    @Override // i4.j
    public final /* bridge */ /* synthetic */ void c() {
    }

    @Override // m4.i
    public final /* bridge */ /* synthetic */ void d(Drawable drawable) {
    }

    @Override // m4.i
    public final void e(Object obj, n4.d dVar) {
    }

    @Override // m4.i
    public final l4.c f() {
        Object tag = this.f2274b.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof l4.c) {
                return (l4.c) tag;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // m4.i
    public final void g(Drawable drawable) {
        m4.e eVar = this.f2273a;
        ViewTreeObserver viewTreeObserver = eVar.f7441a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(eVar.f7443c);
        }
        eVar.f7443c = null;
        eVar.f7442b.clear();
    }

    @Override // m4.i
    public final void h(m4.h hVar) {
        boolean z9;
        boolean z10;
        m4.e eVar = this.f2273a;
        int c6 = eVar.c();
        int b10 = eVar.b();
        boolean z11 = false;
        if (c6 <= 0 && c6 != Integer.MIN_VALUE) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            if (b10 <= 0 && b10 != Integer.MIN_VALUE) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                z11 = true;
            }
        }
        if (z11) {
            ((l4.h) hVar).n(c6, b10);
            return;
        }
        ArrayList arrayList = eVar.f7442b;
        if (!arrayList.contains(hVar)) {
            arrayList.add(hVar);
        }
        if (eVar.f7443c == null) {
            ViewTreeObserver viewTreeObserver = eVar.f7441a.getViewTreeObserver();
            m4.d dVar = new m4.d(eVar);
            eVar.f7443c = dVar;
            viewTreeObserver.addOnPreDrawListener(dVar);
        }
    }

    @Override // m4.i
    public final void i(m4.h hVar) {
        this.f2273a.f7442b.remove(hVar);
    }

    @Override // i4.j
    public final /* bridge */ /* synthetic */ void j() {
    }

    @Override // i4.j
    public final /* bridge */ /* synthetic */ void k() {
    }

    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Target for: " + this.f2274b;
    }
}
