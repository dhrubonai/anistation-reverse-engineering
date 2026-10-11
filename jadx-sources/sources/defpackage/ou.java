package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ou {
    public final String a;
    public final vk6 b;

    public ou(String str, vk6 vk6Var) {
        this.a = str;
        this.b = vk6Var;
        if (!uz5.V(str)) {
            return;
        }
        ze0.k("Name can't be blank");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ou) {
                ou ouVar = (ou) obj;
                if (!this.a.equals(ouVar.a) || !this.b.equals(ouVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AttributeKey: ".concat(this.a);
    }
}
