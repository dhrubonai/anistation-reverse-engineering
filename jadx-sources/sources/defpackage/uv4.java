package defpackage;

import java.nio.FloatBuffer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uv4 {
    public final int a;
    public final FloatBuffer b;
    public final FloatBuffer c;
    public final byte d;

    public uv4(wp wpVar) {
        float[] fArr = (float[]) wpVar.d;
        this.a = fArr.length / 3;
        this.b = a34.K(fArr);
        this.c = a34.K((float[]) wpVar.e);
        int i = wpVar.c;
        if (i != 1) {
            if (i != 2) {
                this.d = (byte) 4;
                return;
            } else {
                this.d = (byte) 6;
                return;
            }
        }
        this.d = (byte) 5;
    }
}
