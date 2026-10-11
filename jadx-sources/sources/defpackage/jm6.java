package defpackage;

import com.unity3d.services.core.network.model.HttpRequest;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jm6 implements Serializable {
    public static final LinkedHashMap A;
    public static final jm6 z;
    public final String x;
    public final short y;

    static {
        jm6 jm6Var = new jm6("http", 80);
        z = jm6Var;
        List I = te4.I(jm6Var, new jm6(HttpRequest.DEFAULT_SCHEME, 443), new jm6("ws", 80), new jm6("wss", 443), new jm6("socks", 1080));
        int S = vn3.S(zo0.V(I, 10));
        if (S < 16) {
            S = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S);
        for (Object obj : I) {
            linkedHashMap.put(((jm6) obj).x, obj);
        }
        A = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public jm6(String str, int i) {
        this.x = str;
        this.y = i;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (Character.toLowerCase(charAt) != charAt) {
                ze0.k("All characters should be lower case");
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof jm6) {
                jm6 jm6Var = (jm6) obj;
                if (!this.x.equals(jm6Var.x) || this.y != jm6Var.y) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.y) + (this.x.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("URLProtocol(name=");
        sb.append(this.x);
        sb.append(", defaultPort=");
        return qx1.o(sb, this.y, ')');
    }
}
