package g4;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p7.a0;
import v3.l;
import v3.n;
import x3.e0;

/* loaded from: classes.dex */
public final class j implements n {

    /* renamed from: a, reason: collision with root package name */
    public final List f4433a;

    /* renamed from: b, reason: collision with root package name */
    public final n f4434b;

    /* renamed from: c, reason: collision with root package name */
    public final y3.h f4435c;

    public j(ArrayList arrayList, a aVar, y3.h hVar) {
        this.f4433a = arrayList;
        this.f4434b = aVar;
        this.f4435c = hVar;
    }

    @Override // v3.n
    public final e0 a(Object obj, int i10, int i11, l lVar) {
        byte[] bArr;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr2 = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            byteArrayOutputStream.flush();
            bArr = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        return this.f4434b.a(ByteBuffer.wrap(bArr), i10, i11, lVar);
    }

    @Override // v3.n
    public final boolean b(Object obj, l lVar) {
        InputStream inputStream = (InputStream) obj;
        if (!((Boolean) lVar.c(i.f4432b)).booleanValue()) {
            if (a0.G(this.f4435c, inputStream, this.f4433a) == ImageHeaderParser$ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
}
