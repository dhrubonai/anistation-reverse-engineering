package e4;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class s implements v3.e {
    @Override // v3.e
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // v3.e
    public final int b(ByteBuffer byteBuffer, y3.h hVar) {
        AtomicReference atomicReference = p4.b.f8557a;
        return c(new p4.a(byteBuffer), hVar);
    }

    @Override // v3.e
    public final int c(InputStream inputStream, y3.h hVar) {
        t0.g gVar = new t0.g(inputStream);
        t0.c c6 = gVar.c("Orientation");
        int i10 = 1;
        if (c6 != null) {
            try {
                i10 = c6.f(gVar.f9989f);
            } catch (NumberFormatException unused) {
            }
        }
        if (i10 == 0) {
            return -1;
        }
        return i10;
    }

    @Override // v3.e
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
