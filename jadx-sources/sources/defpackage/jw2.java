package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jw2 extends ew2 {
    @Override // defpackage.fw2
    public final fw2 a(Object obj) {
        c(obj);
        return this;
    }

    public final void f(Object... objArr) {
        int length = objArr.length;
        jf7.p(objArr, length);
        e(length);
        System.arraycopy(objArr, 0, this.a, this.b, length);
        this.b += length;
    }

    public final o15 g() {
        this.c = true;
        return nw2.j(this.a, this.b);
    }
}
