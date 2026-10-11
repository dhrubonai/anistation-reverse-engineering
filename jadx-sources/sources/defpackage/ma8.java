package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ma8 extends pa8 {
    public final /* synthetic */ pa8 c;
    public final /* synthetic */ pa8 d;

    public ma8(pa8 pa8Var, pa8 pa8Var2) {
        this.c = pa8Var;
        this.d = pa8Var2;
    }

    @Override // defpackage.pa8
    public final void a() {
        pa8 pa8Var = this.d;
        try {
            this.c.a();
        } finally {
            pa8Var.a();
        }
    }
}
