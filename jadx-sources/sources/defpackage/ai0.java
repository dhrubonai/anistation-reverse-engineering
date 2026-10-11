package defpackage;

import java.net.Inet4Address;
import java.net.ServerSocket;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ai0 {
    public final ServerSocket a;
    public final Inet4Address b;

    public ai0(ServerSocket serverSocket, Inet4Address inet4Address) {
        this.a = serverSocket;
        this.b = inet4Address;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ai0) {
                ai0 ai0Var = (ai0) obj;
                if (!this.a.equals(ai0Var.a) || !this.b.equals(ai0Var.b)) {
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
        return "RelayServer(socket=" + this.a + ", address=" + this.b + ")";
    }
}
