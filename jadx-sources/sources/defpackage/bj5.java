package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class bj5 implements aj5, kf0 {
    public final aj5 a;
    public final String b;
    public final Set c;

    public bj5(aj5 aj5Var) {
        aj5Var.getClass();
        this.a = aj5Var;
        this.b = aj5Var.a() + '?';
        this.c = db.s(aj5Var);
    }

    @Override // defpackage.aj5
    public final String a() {
        return this.b;
    }

    @Override // defpackage.kf0
    public final Set b() {
        return this.c;
    }

    @Override // defpackage.aj5
    public final boolean c() {
        return true;
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
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj5)) {
            return false;
        }
        if (a34.i(this.a, ((bj5) obj).a)) {
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
        return this.a.hashCode() * 31;
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
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
