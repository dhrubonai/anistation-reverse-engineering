package defpackage;

import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n61 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        int i5 = this.e;
        int i6 = this.f;
        int i7 = this.g;
        int i8 = this.h;
        int i9 = this.i;
        int i10 = this.j;
        long j = this.k;
        int i11 = this.l;
        String str = eq6.a;
        Locale locale = Locale.US;
        StringBuilder u = qx1.u("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i2, "\n queuedInputBuffers=");
        h11.y(u, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        h11.y(u, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        h11.y(u, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        h11.y(u, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        u.append(j);
        u.append("\n videoFrameProcessingOffsetCount=");
        u.append(i11);
        u.append("\n}");
        return u.toString();
    }
}
