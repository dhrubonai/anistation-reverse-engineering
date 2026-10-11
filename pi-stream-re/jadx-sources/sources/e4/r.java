package e4;

import android.graphics.drawable.Drawable;
import java.security.MessageDigest;
import r6.h0;

/* loaded from: classes.dex */
public final class r implements v3.p {

    /* renamed from: b, reason: collision with root package name */
    public final v3.p f3515b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3516c;

    public r(v3.p pVar, boolean z9) {
        this.f3515b = pVar;
        this.f3516c = z9;
    }

    @Override // v3.i
    public final void a(MessageDigest messageDigest) {
        this.f3515b.a(messageDigest);
    }

    @Override // v3.p
    public final x3.e0 b(com.bumptech.glide.f fVar, x3.e0 e0Var, int i10, int i11) {
        y3.d dVar = com.bumptech.glide.b.a(fVar).f2170a;
        Drawable drawable = (Drawable) e0Var.get();
        d C = h0.C(dVar, drawable, i10, i11);
        if (C == null) {
            if (!this.f3516c) {
                return e0Var;
            }
            throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
        }
        x3.e0 b10 = this.f3515b.b(fVar, C, i10, i11);
        if (b10.equals(C)) {
            b10.e();
            return e0Var;
        }
        return new d(fVar.getResources(), b10);
    }

    @Override // v3.i
    public final boolean equals(Object obj) {
        if (obj instanceof r) {
            return this.f3515b.equals(((r) obj).f3515b);
        }
        return false;
    }

    @Override // v3.i
    public final int hashCode() {
        return this.f3515b.hashCode();
    }
}
