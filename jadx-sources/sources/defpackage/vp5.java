package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vp5 extends k03 {
    public volatile Object b;

    @Override // defpackage.k03
    public final Object a(tp tpVar) {
        if (this.b == null) {
            return super.a(tpVar);
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        ze0.m("Single instance created couldn't return value");
        return null;
    }

    @Override // defpackage.k03
    public final Object b(tp tpVar) {
        boolean z;
        if (this.b == null) {
            synchronized (this) {
                if (this.b != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    this.b = a(tpVar);
                }
            }
        }
        Object obj = this.b;
        if (obj != null) {
            return obj;
        }
        ze0.m("Single instance created couldn't return value");
        return null;
    }
}
