package com.bumptech.glide;

/* loaded from: classes.dex */
public abstract class p implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public n4.e f2286a = n4.b.f8010b;

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final p clone() {
        try {
            return (p) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof p) {
            return p4.m.b(this.f2286a, ((p) obj).f2286a);
        }
        return false;
    }

    public int hashCode() {
        n4.e eVar = this.f2286a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }
}
