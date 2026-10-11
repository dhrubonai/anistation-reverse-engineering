package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public interface hc0 extends jc0 {
    default void a(Throwable th) {
        Object obj;
        vz0 d = d();
        if (th != null) {
            obj = new y45(th);
        } else {
            jc0.a.getClass();
            obj = pn6.a;
        }
        d.resumeWith(obj);
    }

    default void b() {
        vz0 d = d();
        jc0.a.getClass();
        d.resumeWith(pn6.a);
    }

    Throwable c();

    vz0 d();
}
