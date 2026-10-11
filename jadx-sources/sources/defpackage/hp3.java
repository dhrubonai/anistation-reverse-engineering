package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public interface hp3 {
    void M(ArrayList arrayList);

    void O(zp3 zp3Var, Handler handler);

    void Q(ArrayList arrayList);

    void c(int i, x21 x21Var, long j, int i2);

    void d(int i, int i2, int i3, long j);

    void f(int i);

    void flush();

    default boolean g(eo3 eo3Var) {
        return false;
    }

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    void k();

    void n(int i, long j);

    int o();

    void release();

    void setOutputSurface(Surface surface);

    void setParameters(Bundle bundle);

    int v(MediaCodec.BufferInfo bufferInfo);

    default void y(ve6 ve6Var) {
        ve6Var.run();
    }

    void z(int i);
}
