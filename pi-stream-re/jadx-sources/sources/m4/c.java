package m4;

import android.graphics.drawable.Drawable;
import p4.m;

/* loaded from: classes.dex */
public abstract class c implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f7435a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7436b;

    /* renamed from: c, reason: collision with root package name */
    public l4.c f7437c;

    public c() {
        if (m.h(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f7435a = Integer.MIN_VALUE;
            this.f7436b = Integer.MIN_VALUE;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    @Override // m4.i
    public final void a(l4.c cVar) {
        this.f7437c = cVar;
    }

    @Override // m4.i
    public final void b(Drawable drawable) {
    }

    @Override // i4.j
    public final void c() {
    }

    @Override // m4.i
    public final void d(Drawable drawable) {
    }

    @Override // m4.i
    public final l4.c f() {
        return this.f7437c;
    }

    @Override // m4.i
    public final void h(h hVar) {
        ((l4.h) hVar).n(this.f7435a, this.f7436b);
    }

    @Override // m4.i
    public final void i(h hVar) {
    }

    @Override // i4.j
    public final void j() {
    }

    @Override // i4.j
    public final void k() {
    }
}
