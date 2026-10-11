package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class y94 extends UnsupportedOperationException {
    public final String x;

    public y94(f91 f91Var, im0 im0Var, e73 e73Var) {
        this.x = vz5.u("\n        Expected response body of the type '" + e73Var + "' but was '" + im0Var + "'\n        In response from `" + f91Var.d0().c().getUrl() + "`\n        Response status `" + f91Var.c() + "`\n        Response header `ContentType: " + f91Var.a().get("Content-Type") + "` \n        Request header `Accept: " + f91Var.d0().c().a().get("Accept") + "`\n        \n        You can read how to resolve NoTransformationFoundException at FAQ: \n        https://ktor.io/docs/faq.html#no-transformation-found-exception\n    ");
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.x;
    }
}
