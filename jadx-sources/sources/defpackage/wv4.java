package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class wv4 extends zv4 implements v73 {
    @Override // defpackage.sf0
    public d73 computeReflected() {
        z05.a.getClass();
        return this;
    }

    @Override // defpackage.v73
    public Object getDelegate(Object obj) {
        return ((v73) getReflected()).getDelegate(obj);
    }

    @Override // defpackage.v73
    /* renamed from: getGetter, reason: collision with other method in class */
    public u73 mo167getGetter() {
        ((v73) getReflected()).mo167getGetter();
        return null;
    }

    @Override // defpackage.ub2
    public Object invoke(Object obj) {
        return get(obj);
    }

    public /* bridge */ /* synthetic */ r73 getGetter() {
        mo167getGetter();
        return null;
    }
}
