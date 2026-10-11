package e4;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class t extends e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f3517b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(v3.i.f10644a);

    @Override // v3.i
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f3517b);
    }

    @Override // e4.e
    public final Bitmap c(y3.d dVar, Bitmap bitmap, int i10, int i11) {
        return y.b(dVar, bitmap, i10, i11);
    }

    @Override // v3.i
    public final boolean equals(Object obj) {
        return obj instanceof t;
    }

    @Override // v3.i
    public final int hashCode() {
        return 1572326941;
    }
}
