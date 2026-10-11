package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gp1 implements mu2 {
    public final Drawable a;

    public gp1(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.mu2
    public final boolean a() {
        return false;
    }

    @Override // defpackage.mu2
    public final void b(Canvas canvas) {
        this.a.draw(canvas);
    }

    @Override // defpackage.mu2
    public final long c() {
        Drawable drawable = this.a;
        long b = pq6.b(drawable) * 4 * pq6.a(drawable);
        if (b < 0) {
            return 0L;
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gp1) && a34.i(this.a, ((gp1) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mu2
    public final int getHeight() {
        return pq6.a(this.a);
    }

    @Override // defpackage.mu2
    public final int getWidth() {
        return pq6.b(this.a);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
