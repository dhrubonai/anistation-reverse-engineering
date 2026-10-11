package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lb4 implements Handler.Callback, ServiceConnection {
    public final Context x;
    public final Handler y;
    public final HashMap z = new HashMap();
    public HashSet A = new HashSet();

    public lb4(Context context) {
        this.x = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.y = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(kb4 kb4Var) {
        boolean z;
        ArrayDeque arrayDeque = kb4Var.d;
        ComponentName componentName = kb4Var.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (!arrayDeque.isEmpty()) {
            if (kb4Var.b) {
                z = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.x;
                boolean bindService = context.bindService(component, this, 33);
                kb4Var.b = bindService;
                if (bindService) {
                    kb4Var.e = 0;
                } else {
                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z = kb4Var.b;
            }
            if (z && kb4Var.c != null) {
                while (true) {
                    ib4 ib4Var = (ib4) arrayDeque.peek();
                    if (ib4Var == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + ib4Var);
                        }
                        ib4Var.a(kb4Var.c);
                        arrayDeque.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + componentName);
                        }
                    } catch (RemoteException e) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
                    }
                }
                if (!arrayDeque.isEmpty()) {
                    b(kb4Var);
                    return;
                }
                return;
            }
            b(kb4Var);
        }
    }

    public final void b(kb4 kb4Var) {
        ComponentName componentName = kb4Var.a;
        ArrayDeque arrayDeque = kb4Var.d;
        Handler handler = this.y;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = kb4Var.e;
        int i2 = i + 1;
        kb4Var.e = i2;
        if (i2 > 6) {
            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + kb4Var.e + " retries");
            arrayDeque.clear();
            return;
        }
        int i3 = (1 << i) * UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, qt2] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        st2 st2Var = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return false;
                    }
                    kb4 kb4Var = (kb4) this.z.get((ComponentName) message.obj);
                    if (kb4Var != null) {
                        a(kb4Var);
                        return true;
                    }
                } else {
                    kb4 kb4Var2 = (kb4) this.z.get((ComponentName) message.obj);
                    if (kb4Var2 != null) {
                        if (kb4Var2.b) {
                            this.x.unbindService(this);
                            kb4Var2.b = false;
                        }
                        kb4Var2.c = null;
                        return true;
                    }
                }
            } else {
                jb4 jb4Var = (jb4) message.obj;
                ComponentName componentName = jb4Var.a;
                IBinder iBinder = jb4Var.b;
                kb4 kb4Var3 = (kb4) this.z.get(componentName);
                if (kb4Var3 != null) {
                    int i2 = rt2.e;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(st2.c);
                        if (queryLocalInterface != null && (queryLocalInterface instanceof st2)) {
                            st2Var = (st2) queryLocalInterface;
                        } else {
                            ?? obj = new Object();
                            obj.e = iBinder;
                            st2Var = obj;
                        }
                    }
                    kb4Var3.c = st2Var;
                    kb4Var3.e = 0;
                    a(kb4Var3);
                    return true;
                }
            }
        } else {
            ib4 ib4Var = (ib4) message.obj;
            String string = Settings.Secure.getString(this.x.getContentResolver(), "enabled_notification_listeners");
            synchronized (mb4.c) {
                if (string != null) {
                    try {
                        if (!string.equals(mb4.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String str : split) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                                if (unflattenFromString != null) {
                                    hashSet2.add(unflattenFromString.getPackageName());
                                }
                            }
                            mb4.e = hashSet2;
                            mb4.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = mb4.e;
            }
            if (!hashSet.equals(this.A)) {
                this.A = hashSet;
                List<ResolveInfo> queryIntentServices = this.x.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : queryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName2);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName3 = (ComponentName) it.next();
                    if (!this.z.containsKey(componentName3)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                        }
                        this.z.put(componentName3, new kb4(componentName3));
                    }
                }
                Iterator it2 = this.z.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        kb4 kb4Var4 = (kb4) entry.getValue();
                        if (kb4Var4.b) {
                            this.x.unbindService(this);
                            kb4Var4.b = false;
                        }
                        kb4Var4.c = null;
                        it2.remove();
                    }
                }
            }
            for (kb4 kb4Var5 : this.z.values()) {
                kb4Var5.d.add(ib4Var);
                a(kb4Var5);
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.y.obtainMessage(1, new jb4(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.y.obtainMessage(2, componentName).sendToTarget();
    }
}
