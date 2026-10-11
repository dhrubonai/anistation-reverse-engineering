package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o28 {
    public static final Object g = new Object();
    public static o28 h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile h15 c;
    public final af2 d;
    public final short e;
    public final int f;

    /* JADX WARN: Type inference failed for: r2v2, types: [android.os.Handler, h15] */
    public o28(Context context, Looper looper) {
        s18 s18Var = new s18(this);
        this.b = context.getApplicationContext();
        ?? handler = new Handler(looper, s18Var);
        Looper.getMainLooper();
        this.c = handler;
        this.d = af2.g();
        this.e = (short) 5000;
        this.f = 300000;
    }

    public static o28 a(Context context) {
        o28 o28Var;
        synchronized (g) {
            try {
                o28Var = h;
                if (o28Var == null) {
                    o28Var = new o28(context.getApplicationContext(), context.getMainLooper());
                    h = o28Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o28Var;
    }

    public final hw0 b(oz7 oz7Var, gp7 gp7Var, String str, Executor executor) {
        hw0 hw0Var;
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            try {
                o08 o08Var = (o08) hashMap.get(oz7Var);
                if (executor == null) {
                    executor = null;
                }
                if (o08Var == null) {
                    o08Var = new o08(this, oz7Var);
                    o08Var.x.put(gp7Var, gp7Var);
                    hw0Var = o08Var.a(str, executor);
                    hashMap.put(oz7Var, o08Var);
                } else {
                    this.c.removeMessages(0, oz7Var);
                    if (!o08Var.x.containsKey(gp7Var)) {
                        o08Var.x.put(gp7Var, gp7Var);
                        byte b = o08Var.y;
                        if (b != 1) {
                            if (b == 2) {
                                hw0Var = o08Var.a(str, executor);
                            }
                        } else {
                            gp7Var.onServiceConnected(o08Var.C, o08Var.A);
                        }
                        hw0Var = null;
                    } else {
                        String oz7Var2 = oz7Var.toString();
                        StringBuilder sb = new StringBuilder(oz7Var2.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(oz7Var2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                if (o08Var.z) {
                    return hw0.C;
                }
                if (hw0Var == null) {
                    hw0Var = new hw0(-1, null, null);
                }
                return hw0Var;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z) {
        oz7 oz7Var = new oz7(str, z);
        a34.y(serviceConnection, "ServiceConnection must not be null");
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            try {
                o08 o08Var = (o08) hashMap.get(oz7Var);
                if (o08Var != null) {
                    if (o08Var.x.containsKey(serviceConnection)) {
                        o08Var.x.remove(serviceConnection);
                        if (o08Var.x.isEmpty()) {
                            this.c.sendMessageDelayed(this.c.obtainMessage(0, oz7Var), this.e);
                        }
                    } else {
                        String oz7Var2 = oz7Var.toString();
                        StringBuilder sb = new StringBuilder(oz7Var2.length() + 76);
                        sb.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                        sb.append(oz7Var2);
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    String oz7Var3 = oz7Var.toString();
                    StringBuilder sb2 = new StringBuilder(oz7Var3.length() + 50);
                    sb2.append("Nonexistent connection status for service config: ");
                    sb2.append(oz7Var3);
                    throw new IllegalStateException(sb2.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
