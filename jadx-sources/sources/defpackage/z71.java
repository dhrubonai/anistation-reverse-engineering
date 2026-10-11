package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z71 extends Handler {
    public boolean a;
    public final /* synthetic */ b81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z71(b81 b81Var, Looper looper) {
        super(looper);
        this.b = b81Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Throwable iOException;
        long min;
        Object obj;
        ij3 ij3Var;
        a81 a81Var = (a81) message.obj;
        try {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    b81 b81Var = this.b;
                    kq3 c = b81Var.k.c(b81Var.l, (vx1) a81Var.d);
                    synchronized (this.b.o) {
                        try {
                            cn7 cn7Var = this.b.y;
                            if (cn7Var != null && (ij3Var = c.b) != null) {
                                hj3 a = ij3Var.a();
                                a.a = a81Var.a;
                                a.c = SystemClock.elapsedRealtime() - a81Var.c;
                                ((jw2) cn7Var.x).c(new ij3(a));
                            }
                        } finally {
                        }
                    }
                    obj = c;
                } else {
                    throw new RuntimeException();
                }
            } else {
                obj = this.b.k.d((wx1) a81Var.d);
            }
        } catch (lq3 e) {
            a81 a81Var2 = (a81) message.obj;
            obj = e;
            if (a81Var2.b) {
                int i2 = a81Var2.e + 1;
                a81Var2.e = i2;
                this.b.i.getClass();
                obj = e;
                if (i2 <= 3) {
                    hj3 hj3Var = new hj3(a81Var2.a, e.x, SystemClock.elapsedRealtime());
                    hj3Var.f = e.y;
                    hj3Var.g = e.z;
                    hj3Var.c = SystemClock.elapsedRealtime() - a81Var2.c;
                    hj3Var.d = e.A;
                    ij3 ij3Var2 = new ij3(hj3Var);
                    if (e.getCause() instanceof IOException) {
                        iOException = (IOException) e.getCause();
                    } else {
                        iOException = new IOException(e.getCause());
                    }
                    q18 q18Var = this.b.i;
                    int i3 = a81Var2.e;
                    q18Var.getClass();
                    while (iOException != null) {
                        if (!(iOException instanceof bj4) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof lq2) && !(iOException instanceof oj3) && (!(iOException instanceof s41) || ((s41) iOException).x != 2008)) {
                            iOException = iOException.getCause();
                        } else {
                            min = -9223372036854775807L;
                            break;
                        }
                    }
                    min = Math.min((i3 - 1) * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_DURATION);
                    obj = e;
                    if (min != -9223372036854775807L) {
                        synchronized (this.b.o) {
                            cn7 cn7Var2 = this.b.y;
                            if (cn7Var2 != null) {
                                ((jw2) cn7Var2.x).c(ij3Var2);
                            }
                            synchronized (this) {
                                try {
                                    if (!this.a) {
                                        sendMessageDelayed(Message.obtain(message), min);
                                        return;
                                    }
                                    obj = e;
                                } finally {
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            kb0.P("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e2);
            obj = e2;
        }
        q18 q18Var2 = this.b.i;
        long j = a81Var.a;
        q18Var2.getClass();
        synchronized (this) {
            try {
                if (!this.a) {
                    this.b.n.obtainMessage(message.what, Pair.create(a81Var.d, obj)).sendToTarget();
                }
            } finally {
            }
        }
    }
}
