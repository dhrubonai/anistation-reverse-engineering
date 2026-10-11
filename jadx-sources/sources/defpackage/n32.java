package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import com.unity3d.ads.metadata.MediationMetaData;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n32 {
    public static final Object j = new Object();
    public static final js k = new so5(0);
    public final Context a;
    public final String b;
    public final t32 c;
    public final ls0 d;
    public final qb3 g;
    public final ow4 h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public n32(Context context, String str, t32 t32Var) {
        ?? arrayList;
        byte b = 0;
        new CopyOnWriteArrayList();
        this.a = context;
        a34.u(str);
        this.b = str;
        this.c = t32Var;
        my myVar = FirebaseInitProvider.x;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ds0((String) it.next(), b));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        sm6 sm6Var = sm6.x;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        byte b2 = 1;
        arrayList3.add(new ds0(new FirebaseCommonRegistrar(), b2));
        arrayList3.add(new ds0(new ExecutorsRegistrar(), b2));
        arrayList4.add(kr0.a(context, Context.class, new Class[0]));
        arrayList4.add(kr0.a(this, n32.class, new Class[0]));
        arrayList4.add(kr0.a(t32Var, t32.class, new Class[0]));
        p18 p18Var = new p18((byte) 10);
        if (lt5.o(context) && FirebaseInitProvider.y.get()) {
            arrayList4.add(kr0.a(myVar, my.class, new Class[0]));
        }
        ls0 ls0Var = new ls0(arrayList3, arrayList4, p18Var);
        this.d = ls0Var;
        Trace.endSection();
        this.g = new qb3(new ks0(this, context, (byte) 2));
        this.h = ls0Var.f(w81.class);
        k32 k32Var = new k32(this);
        a();
        if (this.e.get()) {
            xz.B.x.get();
        }
        this.i.add(k32Var);
        Trace.endSection();
    }

    public static n32 b() {
        n32 n32Var;
        synchronized (j) {
            try {
                n32Var = (n32) k.get("[DEFAULT]");
                if (n32Var != null) {
                    ((w81) n32Var.h.get()).b();
                } else {
                    StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    String str = m37.s;
                    if (str == null) {
                        str = Application.getProcessName();
                        m37.s = str;
                    }
                    sb.append(str);
                    sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return n32Var;
    }

    public static n32 e(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    return b();
                }
                t32 a = t32.a(context);
                if (a == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return f(context, a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static n32 f(Context context, t32 t32Var) {
        n32 n32Var;
        AtomicReference atomicReference = l32.a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = l32.a;
            if (atomicReference2.get() == null) {
                Object obj = new Object();
                while (true) {
                    if (atomicReference2.compareAndSet(null, obj)) {
                        xz.a(application);
                        xz xzVar = xz.B;
                        xzVar.getClass();
                        synchronized (xzVar) {
                            xzVar.z.add(obj);
                        }
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            js jsVar = k;
            a34.A("FirebaseApp name [DEFAULT] already exists!", !jsVar.containsKey("[DEFAULT]"));
            a34.y(context, "Application context cannot be null.");
            n32Var = new n32(context, "[DEFAULT]", t32Var);
            jsVar.put("[DEFAULT]", n32Var);
        }
        n32Var.d();
        return n32Var;
    }

    public final void a() {
        a34.A("FirebaseApp was deleted", !this.f.get());
    }

    public final String c() {
        String encodeToString;
        StringBuilder sb = new StringBuilder();
        a();
        byte[] bytes = this.b.getBytes(Charset.defaultCharset());
        String str = null;
        if (bytes == null) {
            encodeToString = null;
        } else {
            encodeToString = Base64.encodeToString(bytes, 11);
        }
        sb.append(encodeToString);
        sb.append("+");
        a();
        byte[] bytes2 = this.c.b.getBytes(Charset.defaultCharset());
        if (bytes2 != null) {
            str = Base64.encodeToString(bytes2, 11);
        }
        sb.append(str);
        return sb.toString();
    }

    public final void d() {
        HashMap hashMap;
        if (!lt5.o(this.a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.a;
            AtomicReference atomicReference = m32.b;
            if (atomicReference.get() == null) {
                m32 m32Var = new m32(context);
                while (!atomicReference.compareAndSet(null, m32Var)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(m32Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.b);
        Log.i("FirebaseApp", sb2.toString());
        ls0 ls0Var = this.d;
        a();
        boolean equals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = (AtomicReference) ls0Var.D;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                synchronized (ls0Var) {
                    hashMap = new HashMap((HashMap) ls0Var.y);
                }
                ls0Var.c(hashMap, equals);
                break;
            } else if (atomicReference2.get() != null) {
                break;
            }
        }
        ((w81) this.h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof n32)) {
            return false;
        }
        n32 n32Var = (n32) obj;
        n32Var.a();
        return this.b.equals(n32Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        y23 y23Var = new y23(this);
        y23Var.R(this.b, MediationMetaData.KEY_NAME);
        y23Var.R(this.c, "options");
        return y23Var.toString();
    }
}
