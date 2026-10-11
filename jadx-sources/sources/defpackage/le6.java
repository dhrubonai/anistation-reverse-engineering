package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class le6 implements j11 {
    public final Object x;
    public final ThreadLocal y;
    public final ne6 z;

    public le6(Object obj, ThreadLocal threadLocal) {
        this.x = obj;
        this.y = threadLocal;
        this.z = new ne6(threadLocal);
    }

    public final void a(Object obj) {
        this.y.set(obj);
    }

    public final Object b() {
        ThreadLocal threadLocal = this.y;
        Object obj = threadLocal.get();
        threadLocal.set(this.x);
        return obj;
    }

    @Override // defpackage.l11
    public final Object fold(Object obj, ic2 ic2Var) {
        return ic2Var.invoke(obj, this);
    }

    @Override // defpackage.l11
    public final j11 get(k11 k11Var) {
        if (this.z.equals(k11Var)) {
            return this;
        }
        return null;
    }

    @Override // defpackage.j11
    public final k11 getKey() {
        return this.z;
    }

    @Override // defpackage.l11
    public final l11 minusKey(k11 k11Var) {
        if (this.z.equals(k11Var)) {
            return it1.x;
        }
        return this;
    }

    @Override // defpackage.l11
    public final l11 plus(l11 l11Var) {
        return tl7.L(this, l11Var);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.x + ", threadLocal = " + this.y + ')';
    }
}
