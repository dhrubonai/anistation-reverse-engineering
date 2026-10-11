package y3;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class m implements k {

    /* renamed from: a, reason: collision with root package name */
    public final c f11608a;

    /* renamed from: b, reason: collision with root package name */
    public int f11609b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.Config f11610c;

    public m(c cVar) {
        this.f11608a = cVar;
    }

    @Override // y3.k
    public final void a() {
        this.f11608a.m(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f11609b != mVar.f11609b || !p4.m.b(this.f11610c, mVar.f11610c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f11609b * 31;
        Bitmap.Config config = this.f11610c;
        if (config != null) {
            i10 = config.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final String toString() {
        return n.d(this.f11609b, this.f11610c);
    }
}
