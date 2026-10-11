package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jr0 {
    public String a = null;
    public final HashSet b;
    public final HashSet c;
    public byte d;
    public final boolean e;
    public es0 f;
    public final HashSet g;

    public jr0(Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        this.b = hashSet;
        this.c = new HashSet();
        this.d = (byte) 0;
        this.e = false;
        this.g = new HashSet();
        hashSet.add(px4.a(cls));
        for (Class cls2 : clsArr) {
            v94.l(cls2, "Null interface");
            this.b.add(px4.a(cls2));
        }
    }

    public final void a(zd1 zd1Var) {
        if (!this.b.contains(zd1Var.a)) {
            this.c.add(zd1Var);
        } else {
            ze0.k("Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public final kr0 b() {
        boolean z;
        if (this.f != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new kr0(this.a, new HashSet(this.b), new HashSet(this.c), this.d, this.e ? 1 : 0, this.f, this.g);
        }
        ze0.m("Missing required property: factory.");
        return null;
    }
}
