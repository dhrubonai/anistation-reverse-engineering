package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class s42 {
    public static final float[] a;

    static {
        int i;
        long[] jArr = cb5.a;
        int d = cb5.d(0);
        if (d > 0) {
            i = Math.max(7, cb5.c(d));
        } else {
            i = 0;
        }
        if (i != 0) {
            int i2 = ((i + 15) & (-8)) >> 3;
            long[] jArr2 = new long[i2];
            Arrays.fill(jArr2, 0, i2, -9187201950435737472L);
            jArr = jArr2;
        }
        int i3 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j)) | j;
        float[] fArr = new float[i];
        a = new float[0];
    }
}
