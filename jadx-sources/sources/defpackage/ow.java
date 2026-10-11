package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ow extends Exception {
    public final int x;
    public final boolean y;
    public final ea2 z;

    public ow(int i, ea2 ea2Var, boolean z) {
        super(qx1.h(i, "AudioTrack write failed: "));
        this.y = z;
        this.x = i;
        this.z = ea2Var;
    }
}
