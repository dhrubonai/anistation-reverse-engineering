package s1;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface k {
    void a();

    void b(int i10, i1.d dVar, long j4, int i11);

    void c(Bundle bundle);

    void d(int i10, int i11, long j4, int i12);

    int e(MediaCodec.BufferInfo bufferInfo);

    void f();

    void flush();

    void g(int i10, boolean z9);

    void h(b2.k kVar, Handler handler);

    void i(int i10);

    MediaFormat j();

    ByteBuffer k(int i10);

    void l(Surface surface);

    ByteBuffer m(int i10);

    void n(int i10, long j4);

    int o();
}
