package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lv extends Exception {
    public final int x;
    public final boolean y;

    public lv(int i, boolean z) {
        super(qx1.h(i, "AudioOutput write failed: "));
        this.y = z;
        this.x = i;
    }
}
