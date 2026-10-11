package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class n6 implements sc2, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public n6(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = false;
        this.arity = i;
        this.flags = i2 >> 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n6)) {
            return false;
        }
        n6 n6Var = (n6) obj;
        if (this.isTopLevel == n6Var.isTopLevel && this.arity == n6Var.arity && this.flags == n6Var.flags && a34.i(this.receiver, n6Var.receiver) && a34.i(this.owner, n6Var.owner) && this.name.equals(n6Var.name) && this.signature.equals(n6Var.signature)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.sc2
    public int getArity() {
        return this.arity;
    }

    public h73 getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            z05.a.getClass();
            return new qh4(cls);
        }
        return z05.a(cls);
    }

    public int hashCode() {
        int i;
        int i2;
        Object obj = this.receiver;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Class cls = this.owner;
        if (cls != null) {
            i3 = cls.hashCode();
        }
        int i5 = zo5.i(this.signature, zo5.i(this.name, (i4 + i3) * 31, 31), 31);
        if (this.isTopLevel) {
            i2 = 1231;
        } else {
            i2 = 1237;
        }
        return ((((i5 + i2) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        z05.a.getClass();
        return a15.a(this);
    }

    public n6(String str, Class cls) {
        this(0, sf0.NO_RECEIVER, cls, "<init>", str, 0);
    }
}
