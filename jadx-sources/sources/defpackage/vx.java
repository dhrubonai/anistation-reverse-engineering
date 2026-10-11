package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vx extends h21 {
    public final Context a;
    public final un0 b;
    public final un0 c;
    public final String d;

    public vx(Context context, un0 un0Var, un0 un0Var2, String str) {
        if (context != null) {
            this.a = context;
            if (un0Var != null) {
                this.b = un0Var;
                if (un0Var2 != null) {
                    this.c = un0Var2;
                    if (str != null) {
                        this.d = str;
                        return;
                    } else {
                        qi2.m("Null backendName");
                        throw null;
                    }
                }
                qi2.m("Null monotonicClock");
                throw null;
            }
            qi2.m("Null wallClock");
            throw null;
        }
        qi2.m("Null applicationContext");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h21) {
            vx vxVar = (vx) ((h21) obj);
            if (this.a.equals(vxVar.a) && this.b.equals(vxVar.b) && this.c.equals(vxVar.c) && this.d.equals(vxVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return h11.k(sb, this.d, "}");
    }
}
