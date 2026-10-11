package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public interface nr2 extends wq2, v11 {
    yp2 d0();

    mv0 getAttributes();

    default l11 getCoroutineContext() {
        return d0().getCoroutineContext();
    }

    xq2 getMethod();

    op6 getUrl();
}
