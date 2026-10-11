package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class s18 implements Handler.Callback {
    public final /* synthetic */ o28 x;

    public /* synthetic */ s18(o28 o28Var) {
        this.x = o28Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            o28 o28Var = this.x;
            synchronized (o28Var.a) {
                try {
                    oz7 oz7Var = (oz7) message.obj;
                    o08 o08Var = (o08) o28Var.a.get(oz7Var);
                    if (o08Var != null && o08Var.y == 3) {
                        String valueOf = String.valueOf(oz7Var);
                        StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                        sb.append("Timeout waiting for ServiceConnection callback ");
                        sb.append(valueOf);
                        Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                        ComponentName componentName = o08Var.C;
                        if (componentName == null) {
                            oz7Var.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            oz7Var.getClass();
                            componentName = new ComponentName("com.google.android.gms", "unknown");
                        }
                        o08Var.onServiceDisconnected(componentName);
                    }
                } finally {
                }
            }
            return true;
        }
        o28 o28Var2 = this.x;
        synchronized (o28Var2.a) {
            try {
                oz7 oz7Var2 = (oz7) message.obj;
                o08 o08Var2 = (o08) o28Var2.a.get(oz7Var2);
                if (o08Var2 != null && o08Var2.x.isEmpty()) {
                    if (o08Var2.z) {
                        oz7 oz7Var3 = o08Var2.B;
                        o28 o28Var3 = o08Var2.D;
                        o28Var3.c.removeMessages(1, oz7Var3);
                        o28Var3.d.u(o28Var3.b, o08Var2);
                        o08Var2.z = false;
                        o08Var2.y = (byte) 2;
                    }
                    o28Var2.a.remove(oz7Var2);
                }
            } finally {
            }
        }
        return true;
    }
}
