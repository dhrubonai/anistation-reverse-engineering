package v3;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface e {
    ImageHeaderParser$ImageType a(ByteBuffer byteBuffer);

    int b(ByteBuffer byteBuffer, y3.h hVar);

    int c(InputStream inputStream, y3.h hVar);

    ImageHeaderParser$ImageType d(InputStream inputStream);
}
