package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v66 {
    public final String a;
    public final Map b;
    public final Set c;
    public final Set d;

    public v66(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this != obj) {
            if (obj instanceof v66) {
                v66 v66Var = (v66) obj;
                if (!this.a.equals(v66Var.a) || !this.b.equals(v66Var.b) || !this.c.equals(v66Var.c)) {
                    return false;
                }
                Set set2 = this.d;
                if (set2 != null && (set = v66Var.d) != null) {
                    return set2.equals(set);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        Collection collection;
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.a);
        sb.append("',\n            |    columns = {");
        sb.append(gy5.e(yo0.C0(this.b.values(), new k82((byte) 29))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(gy5.e(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        if (set != null) {
            collection = yo0.C0(set, new w66((byte) 0));
        } else {
            collection = nt1.x;
        }
        sb.append(gy5.e(collection));
        sb.append("\n            |}\n        ");
        return vz5.v(sb.toString());
    }
}
