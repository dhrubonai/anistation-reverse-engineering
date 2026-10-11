package defpackage;

import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.SocketChannel;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class c43 {
    public static final boolean a;

    static {
        boolean z;
        try {
            Class.forName("java.net.StandardSocketOptions");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
    }

    public static final void a(SocketChannel socketChannel, mu5 mu5Var) {
        mu5Var.getClass();
        int i = mu5Var.y;
        Integer valueOf = Integer.valueOf(i);
        if (i < 0) {
            valueOf = null;
        }
        boolean z = a;
        if (valueOf != null) {
            int intValue = valueOf.intValue();
            if (z) {
                socketChannel.setOption((SocketOption<SocketOption>) StandardSocketOptions.SO_LINGER, (SocketOption) Integer.valueOf(intValue));
            } else {
                socketChannel.socket().setSoLinger(true, intValue);
            }
        }
        if (z) {
            socketChannel.setOption((SocketOption<SocketOption>) StandardSocketOptions.TCP_NODELAY, (SocketOption) Boolean.valueOf(mu5Var.x));
        } else {
            socketChannel.socket().setTcpNoDelay(mu5Var.x);
        }
    }
}
