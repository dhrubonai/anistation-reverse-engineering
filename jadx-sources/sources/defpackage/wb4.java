package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class wb4 implements x73 {
    public final x73 a;
    public final bj5 b;

    public wb4(x73 x73Var) {
        x73Var.getClass();
        this.a = x73Var;
        this.b = new bj5(x73Var.getDescriptor());
    }

    @Override // defpackage.ne1
    public final Object deserialize(l61 l61Var) {
        if (l61Var.decodeNotNullMark()) {
            return l61Var.f(this.a);
        }
        return l61Var.decodeNull();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wb4.class == obj.getClass() && a34.i(this.a, ((wb4) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Object obj) {
        if (obj != null) {
            ((v0) wt1Var).encodeNotNullMark();
            wt1Var.j(this.a, obj);
        } else {
            wt1Var.encodeNull();
        }
    }
}
