package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c70 implements ServiceConnection {
    public boolean x = false;
    public final LinkedBlockingQueue y = new LinkedBlockingQueue();

    public final IBinder a() {
        a34.w("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.x) {
            this.x = true;
            IBinder iBinder = (IBinder) this.y.poll(10000L, TimeUnit.MILLISECONDS);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        ze0.m("Cannot call get on this connection more than once");
        return null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.y.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
