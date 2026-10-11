package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class eh0 implements Map.Entry, m73 {
    public final /* synthetic */ j73 A;
    public final /* synthetic */ byte x = 0;
    public Object y;
    public Object z;

    public eh0(wx5 wx5Var) {
        this.A = wx5Var;
        Map.Entry entry = (Map.Entry) wx5Var.B;
        entry.getClass();
        this.y = entry.getKey();
        Map.Entry entry2 = (Map.Entry) wx5Var.B;
        entry2.getClass();
        this.z = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.x) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (((String) this.z).equals(entry.getKey()) && this.y.equals(entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.x) {
            case 0:
                return (String) this.z;
            default:
                return this.y;
        }
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        switch (this.x) {
            case 0:
                return this.y;
            default:
                return this.z;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.x) {
            case 0:
                return this.y.hashCode() ^ ((String) this.z).hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        byte b = this.x;
        j73 j73Var = this.A;
        switch (b) {
            case 0:
                obj.getClass();
                Object obj2 = this.y;
                this.y = obj;
                gh0 gh0Var = (gh0) j73Var;
                int a = gh0Var.a((String) this.z);
                if (a >= 0) {
                    gh0Var.y[a] = obj;
                }
                return obj2;
            default:
                wx5 wx5Var = (wx5) j73Var;
                bu5 bu5Var = (bu5) wx5Var.z;
                if (bu5Var.d().d == wx5Var.y) {
                    Object obj3 = this.z;
                    bu5Var.put(this.y, obj);
                    this.z = obj;
                    return obj3;
                }
                ze0.j();
                return null;
        }
    }

    public String toString() {
        switch (this.x) {
            case 0:
                return ((String) this.z) + '=' + this.y;
            default:
                return super.toString();
        }
    }

    public eh0(gh0 gh0Var, String str, Object obj) {
        this.A = gh0Var;
        this.z = str;
        this.y = obj;
    }
}
