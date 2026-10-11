package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class k44 extends n44 implements t73 {
    @Override // defpackage.sf0
    public d73 computeReflected() {
        z05.a.getClass();
        return this;
    }

    @Override // defpackage.t73
    public Object getDelegate() {
        return ((k44) getReflected()).getDelegate();
    }

    @Override // defpackage.t73
    /* renamed from: getGetter, reason: collision with other method in class */
    public s73 mo152getGetter() {
        ((k44) getReflected()).mo152getGetter();
        return null;
    }

    /* renamed from: getSetter, reason: collision with other method in class */
    public p73 m153getSetter() {
        ((k44) getReflected()).m153getSetter();
        return null;
    }

    @Override // defpackage.sb2
    public Object invoke() {
        return get();
    }

    public abstract void set(Object obj);

    public /* bridge */ /* synthetic */ r73 getGetter() {
        mo152getGetter();
        return null;
    }

    public /* bridge */ /* synthetic */ o73 getSetter() {
        m153getSetter();
        return null;
    }
}
