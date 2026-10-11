package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class m44 extends n44 implements v73, w73 {
    public m44(Class cls, String str, String str2, int i) {
        super(sf0.NO_RECEIVER, cls, str, str2, i);
    }

    @Override // defpackage.sf0
    public final d73 computeReflected() {
        z05.a.getClass();
        return this;
    }

    @Override // defpackage.v73
    public Object get(Object obj) {
        mo167getGetter();
        throw null;
    }

    @Override // defpackage.v73
    public final Object getDelegate(Object obj) {
        return ((m44) getReflected()).getDelegate(obj);
    }

    @Override // defpackage.v73
    /* renamed from: getGetter */
    public final u73 mo167getGetter() {
        ((m44) getReflected()).mo167getGetter();
        return null;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        return get(obj);
    }
}
