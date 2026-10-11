package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hw4 implements vq6 {
    public boolean a = false;
    public boolean b = false;
    public u12 c;
    public final gw4 d;

    public hw4(gw4 gw4Var) {
        this.d = gw4Var;
    }

    @Override // defpackage.vq6
    public final vq6 b(String str) {
        if (!this.a) {
            this.a = true;
            this.d.e(this.c, str, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // defpackage.vq6
    public final vq6 c(boolean z) {
        if (!this.a) {
            this.a = true;
            this.d.b(this.c, z ? 1 : 0, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
