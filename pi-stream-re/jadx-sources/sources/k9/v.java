package k9;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class v extends e {

    /* renamed from: m, reason: collision with root package name */
    public final Socket f6557m;

    public v(Socket socket) {
        this.f6557m = socket;
    }

    @Override // k9.e
    public final IOException j(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // k9.e
    public final void k() {
        Socket socket = this.f6557m;
        try {
            socket.close();
        } catch (AssertionError e10) {
            if (com.bumptech.glide.c.D(e10)) {
                n.f6536a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
                return;
            }
            throw e10;
        } catch (Exception e11) {
            n.f6536a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e11);
        }
    }
}
