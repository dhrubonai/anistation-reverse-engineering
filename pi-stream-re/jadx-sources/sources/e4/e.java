package e4;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public abstract class e implements v3.p {
    @Override // v3.p
    public final x3.e0 b(com.bumptech.glide.f fVar, x3.e0 e0Var, int i10, int i11) {
        if (p4.m.h(i10, i11)) {
            y3.d dVar = com.bumptech.glide.b.a(fVar).f2170a;
            Bitmap bitmap = (Bitmap) e0Var.get();
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getWidth();
            }
            if (i11 == Integer.MIN_VALUE) {
                i11 = bitmap.getHeight();
            }
            Bitmap c6 = c(dVar, bitmap, i10, i11);
            if (!bitmap.equals(c6)) {
                return d.c(c6, dVar);
            }
            return e0Var;
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i10 + " or height: " + i11 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(y3.d dVar, Bitmap bitmap, int i10, int i11);
}
