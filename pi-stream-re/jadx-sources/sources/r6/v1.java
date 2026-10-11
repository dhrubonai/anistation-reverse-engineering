package r6;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class v1 extends m1 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final m1 f9556a;

    public v1(m1 m1Var) {
        m1Var.getClass();
        this.f9556a = m1Var;
    }

    @Override // r6.m1
    public final m1 a() {
        return this.f9556a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f9556a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            return this.f9556a.equals(((v1) obj).f9556a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f9556a.hashCode();
    }

    public final String toString() {
        return this.f9556a + ".reverse()";
    }
}
