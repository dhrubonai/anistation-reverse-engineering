package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jv {
    public boolean a;
    public boolean b;
    public boolean c;

    public kv a() {
        if (!this.a && (this.b || this.c)) {
            ze0.m("Secondary offload attribute fields are true but primary isFormatSupported is false");
            return null;
        }
        return new kv(this);
    }
}
