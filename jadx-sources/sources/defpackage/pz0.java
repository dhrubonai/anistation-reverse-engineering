package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pz0 implements aj5 {
    public final aj5 a;
    public final e73 b;
    public final String c;

    public pz0(aj5 aj5Var, e73 e73Var) {
        this.a = aj5Var;
        this.b = e73Var;
        this.c = aj5Var.a() + '<' + ((im0) e73Var).f() + '>';
    }

    @Override // defpackage.aj5
    public final String a() {
        return this.c;
    }

    @Override // defpackage.aj5
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.aj5
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // defpackage.aj5
    public final int e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        pz0 pz0Var;
        if (obj instanceof pz0) {
            pz0Var = (pz0) obj;
        } else {
            pz0Var = null;
        }
        if (pz0Var != null && this.a.equals(pz0Var.a) && pz0Var.b.equals(this.b)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aj5
    public final String f(int i) {
        return this.a.f(i);
    }

    @Override // defpackage.aj5
    public final List g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.aj5
    public final List getAnnotations() {
        return this.a.getAnnotations();
    }

    @Override // defpackage.aj5
    public final hj5 getKind() {
        return this.a.getKind();
    }

    @Override // defpackage.aj5
    public final aj5 h(int i) {
        return this.a.h(i);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((im0) this.b).hashCode() * 31);
    }

    @Override // defpackage.aj5
    public final boolean i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.aj5
    public final boolean isInline() {
        return this.a.isInline();
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
