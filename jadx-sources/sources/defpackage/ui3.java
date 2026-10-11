package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ui3 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final AbstractCollection g;
    public final Object h;
    public final Object i;

    public ui3(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, f46 f46Var, si3 si3Var, boolean z) {
        this.c = thread;
        this.f = copyOnWriteArraySet;
        this.e = si3Var;
        this.i = new Object();
        this.g = new ArrayDeque();
        this.h = new ArrayDeque();
        if (looper != null && f46Var != null && si3Var != null) {
            this.d = f46Var.a(looper, new jj1(this, (byte) 2));
        } else {
            this.d = null;
        }
        this.b = z;
    }

    public void a(Object obj) {
        obj.getClass();
        synchronized (this.i) {
            try {
                if (this.a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f).add(new ti3(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b() {
        boolean z;
        k46 k46Var = (k46) this.d;
        ArrayDeque arrayDeque = (ArrayDeque) this.g;
        if (this.b) {
            if (Thread.currentThread() == ((Thread) this.c)) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) this.h;
        if (!arrayDeque2.isEmpty()) {
            if (((si3) this.e) != null) {
                k46Var.getClass();
                Handler handler = k46Var.a;
                if (!handler.hasMessages(1)) {
                    j46 a = k46Var.a(1);
                    Message message = a.a;
                    message.getClass();
                    handler.sendMessageAtFrontOfQueue(message);
                    a.a();
                }
            }
            boolean isEmpty = arrayDeque.isEmpty();
            arrayDeque.addAll(arrayDeque2);
            arrayDeque2.clear();
            if (isEmpty) {
                while (!arrayDeque.isEmpty()) {
                    ((Runnable) arrayDeque.peekFirst()).run();
                    arrayDeque.removeFirst();
                }
            }
        }
    }

    public void c(int i, ri3 ri3Var) {
        boolean z;
        if (this.b) {
            if (Thread.currentThread() == ((Thread) this.c)) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
        }
        ((ArrayDeque) this.h).add(new vr0((byte) 2, i, new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f), ri3Var));
    }

    public void d() {
        boolean z;
        if (this.b) {
            if (Thread.currentThread() == ((Thread) this.c)) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
        }
        synchronized (this.i) {
            this.a = true;
        }
        Iterator it = ((CopyOnWriteArraySet) this.f).iterator();
        while (it.hasNext()) {
            ti3 ti3Var = (ti3) it.next();
            si3 si3Var = (si3) this.e;
            ti3Var.d = true;
            if (si3Var != null && ti3Var.c) {
                ti3Var.c = false;
                si3Var.c(ti3Var.a, ti3Var.b.d());
            }
        }
        ((CopyOnWriteArraySet) this.f).clear();
    }

    public void e(io4 io4Var) {
        boolean z;
        if (this.b) {
            if (Thread.currentThread() == ((Thread) this.c)) {
                z = true;
            } else {
                z = false;
            }
            io3.B(z);
        }
        CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ti3 ti3Var = (ti3) it.next();
            if (ti3Var.a.equals(io4Var)) {
                si3 si3Var = (si3) this.e;
                ti3Var.d = true;
                if (si3Var != null && ti3Var.c) {
                    ti3Var.c = false;
                    si3Var.c(ti3Var.a, ti3Var.b.d());
                }
                copyOnWriteArraySet.remove(ti3Var);
            }
        }
    }

    public void f() {
        boolean h;
        int i;
        ff2 ff2Var = (ff2) this.d;
        Context context = (Context) this.c;
        PackageManager packageManager = (PackageManager) this.f;
        ArrayList arrayList = (ArrayList) this.g;
        if (this.b) {
            ArrayList arrayList2 = new ArrayList();
            if (Build.VERSION.SDK_INT >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    ServiceInfo serviceInfo = it.next().serviceInfo;
                    if (!this.a || TextUtils.equals(context.getPackageName(), serviceInfo.packageName)) {
                        arrayList3.add(serviceInfo);
                    }
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                ServiceInfo serviceInfo2 = it2.next().serviceInfo;
                if (serviceInfo2 != null) {
                    if (rs3.c == null) {
                        h = false;
                    } else {
                        h = rs3.c().h();
                    }
                    if (h && !arrayList2.isEmpty()) {
                        int size = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList2.get(i3);
                            i3++;
                            ServiceInfo serviceInfo3 = (ServiceInfo) obj;
                            if (!serviceInfo2.packageName.equals(serviceInfo3.packageName) || !serviceInfo2.name.equals(serviceInfo3.name)) {
                            }
                        }
                    }
                    String str = serviceInfo2.packageName;
                    String str2 = serviceInfo2.name;
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size2) {
                            ComponentName componentName = ((l15) arrayList.get(i4)).F;
                            if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                                break;
                            } else {
                                i4++;
                            }
                        } else {
                            i4 = -1;
                            break;
                        }
                    }
                    if (i4 < 0) {
                        l15 l15Var = new l15(context, new ComponentName(serviceInfo2.packageName, serviceInfo2.name));
                        l15Var.M = new xv3(this, l15Var, (byte) 5);
                        if (!l15Var.I) {
                            l15Var.I = true;
                            l15Var.l();
                        }
                        i = i2 + 1;
                        arrayList.add(i2, l15Var);
                        ff2Var.a(l15Var, false);
                    } else if (i4 >= i2) {
                        l15 l15Var2 = (l15) arrayList.get(i4);
                        if (!l15Var2.I) {
                            l15Var2.I = true;
                            l15Var2.l();
                        }
                        if (l15Var2.K == null && l15Var2.I && (l15Var2.B != null || !l15Var2.H.isEmpty())) {
                            l15Var2.k();
                            l15Var2.h();
                        }
                        i = i2 + 1;
                        Collections.swap(arrayList, i4, i2);
                    }
                    i2 = i;
                }
            }
            if (i2 < arrayList.size()) {
                for (int size3 = arrayList.size() - 1; size3 >= i2; size3--) {
                    l15 l15Var3 = (l15) arrayList.get(size3);
                    ps3 d = ff2Var.d(l15Var3);
                    if (d != null) {
                        l15Var3.getClass();
                        rs3.b();
                        l15Var3.A = null;
                        l15Var3.g(null);
                        ff2Var.n(d, null);
                        ff2Var.a.b(514, d);
                        ff2Var.l.remove(d);
                    }
                    arrayList.remove(l15Var3);
                    l15Var3.M = null;
                    if (l15Var3.I) {
                        l15Var3.I = false;
                        l15Var3.l();
                    }
                }
            }
        }
    }

    public void g(int i, ri3 ri3Var) {
        c(i, ri3Var);
        b();
    }

    public ui3(Looper looper) {
        this(looper.getThread());
    }

    public ui3(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public ui3(Looper looper, f46 f46Var, si3 si3Var) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), f46Var, si3Var, true);
    }

    public ui3(Context context, ff2 ff2Var) {
        this.g = new ArrayList();
        byte b = 5;
        this.h = new o9(this, b);
        this.i = new la(this, b);
        this.c = context;
        this.d = ff2Var;
        this.e = new Handler();
        this.f = context.getPackageManager();
    }
}
