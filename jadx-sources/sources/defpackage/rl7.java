package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rl7 extends h15 {
    public final /* synthetic */ r30 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl7(r30 r30Var, Looper looper) {
        super(looper, (byte) 5);
        this.a = r30Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        PendingIntent pendingIntent;
        PendingIntent pendingIntent2;
        jc7 jc7Var;
        r30 r30Var = this.a;
        int i = r30Var.y.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (jc7Var = (jc7) message.obj) != null) {
                synchronized (jc7Var) {
                    jc7Var.a = null;
                }
                r30 r30Var2 = jc7Var.c;
                synchronized (r30Var2.m) {
                    r30Var2.m.remove(jc7Var);
                }
                return;
            }
            return;
        }
        if ((i3 != 1 && i3 != 7 && i3 != 4 && i3 != 5) || r30Var.r()) {
            int i4 = message.what;
            if (i4 == 4) {
                r30Var.v = new hw0(message.arg2, null, null);
                if (!r30Var.w && !TextUtils.isEmpty(r30Var.n()) && !TextUtils.isEmpty(null)) {
                    try {
                        Class.forName(r30Var.n());
                        if (!r30Var.w) {
                            r30Var.x(3, null);
                            return;
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                }
                hw0 hw0Var = r30Var.v;
                if (hw0Var == null) {
                    hw0Var = new hw0(8, null, null);
                }
                r30Var.k.j(hw0Var);
                r30Var.s(hw0Var);
                return;
            }
            if (i4 == 5) {
                hw0 hw0Var2 = r30Var.v;
                if (hw0Var2 == null) {
                    hw0Var2 = new hw0(8, null, null);
                }
                r30Var.k.j(hw0Var2);
                r30Var.s(hw0Var2);
                return;
            }
            if (i4 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent2 = (PendingIntent) obj;
                } else {
                    pendingIntent2 = null;
                }
                hw0 hw0Var3 = new hw0(message.arg2, pendingIntent2, null);
                r30Var.k.j(hw0Var3);
                r30Var.s(hw0Var3);
                return;
            }
            if (i4 == 6) {
                r30Var.x(5, null);
                o30 o30Var = r30Var.p;
                if (o30Var != null) {
                    o30Var.b(message.arg2);
                }
                System.currentTimeMillis();
                r30Var.w(5, 1, null);
                return;
            }
            if (i4 == 2 && !r30Var.q()) {
                jc7 jc7Var2 = (jc7) message.obj;
                if (jc7Var2 != null) {
                    synchronized (jc7Var2) {
                        jc7Var2.a = null;
                    }
                    r30 r30Var3 = jc7Var2.c;
                    synchronized (r30Var3.m) {
                        r30Var3.m.remove(jc7Var2);
                    }
                    return;
                }
                return;
            }
            int i5 = message.what;
            if (i5 != 2 && i5 != 1 && i5 != 7) {
                Log.wtf("GmsClient", h11.g(i5, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i5).length() + 34)), new Exception());
                return;
            }
            jc7 jc7Var3 = (jc7) message.obj;
            synchronized (jc7Var3) {
                try {
                    bool = jc7Var3.a;
                    if (jc7Var3.b) {
                        String obj2 = jc7Var3.toString();
                        StringBuilder sb = new StringBuilder(obj2.length() + 47);
                        sb.append("Callback proxy ");
                        sb.append(obj2);
                        sb.append(" being reused. This is not safe.");
                        Log.w("GmsClient", sb.toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (bool != null) {
                r30 r30Var4 = jc7Var3.f;
                int i6 = jc7Var3.d;
                if (i6 == 0) {
                    if (!jc7Var3.a()) {
                        r30Var4.x(1, null);
                        jc7Var3.b(new hw0(8, null, null));
                    }
                } else {
                    r30Var4.x(1, null);
                    Bundle bundle = jc7Var3.e;
                    if (bundle != null) {
                        pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
                    } else {
                        pendingIntent = null;
                    }
                    jc7Var3.b(new hw0(i6, pendingIntent, null));
                }
            }
            synchronized (jc7Var3) {
                jc7Var3.b = true;
            }
            synchronized (jc7Var3) {
                jc7Var3.a = null;
            }
            r30 r30Var5 = jc7Var3.c;
            synchronized (r30Var5.m) {
                r30Var5.m.remove(jc7Var3);
            }
            return;
        }
        jc7 jc7Var4 = (jc7) message.obj;
        if (jc7Var4 != null) {
            synchronized (jc7Var4) {
                jc7Var4.a = null;
            }
            r30 r30Var6 = jc7Var4.c;
            synchronized (r30Var6.m) {
                r30Var6.m.remove(jc7Var4);
            }
        }
    }
}
