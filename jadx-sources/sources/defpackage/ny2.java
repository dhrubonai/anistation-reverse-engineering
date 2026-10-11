package defpackage;

import java.net.InetSocketAddress;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ny2 {
    public final InetSocketAddress a;

    public ny2(String str, int i) {
        str.getClass();
        this.a = new InetSocketAddress(str, i);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!ny2.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        return this.a.equals(((ny2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String inetSocketAddress = this.a.toString();
        inetSocketAddress.getClass();
        return inetSocketAddress;
    }
}
