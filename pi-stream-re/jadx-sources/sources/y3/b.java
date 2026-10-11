package y3;

import android.graphics.Bitmap;
import androidx.appcompat.widget.a0;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final c f11579a;

    /* renamed from: b, reason: collision with root package name */
    public int f11580b;

    /* renamed from: c, reason: collision with root package name */
    public int f11581c;

    /* renamed from: d, reason: collision with root package name */
    public Bitmap.Config f11582d;

    public b(c cVar) {
        this.f11579a = cVar;
    }

    @Override // y3.k
    public final void a() {
        this.f11579a.m(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f11580b != bVar.f11580b || this.f11581c != bVar.f11581c || this.f11582d != bVar.f11582d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int i11 = ((this.f11580b * 31) + this.f11581c) * 31;
        Bitmap.Config config = this.f11582d;
        if (config != null) {
            i10 = config.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final String toString() {
        return a0.M(this.f11580b, this.f11581c, this.f11582d);
    }
}
