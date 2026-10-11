package p6;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c {
    public static final HashMap o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f8604a;

    /* renamed from: b, reason: collision with root package name */
    public final v f8605b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8606c;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8610g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f8611h;

    /* renamed from: i, reason: collision with root package name */
    public final a0 f8612i;

    /* renamed from: m, reason: collision with root package name */
    public b f8616m;

    /* renamed from: n, reason: collision with root package name */
    public IInterface f8617n;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8607d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f8608e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f8609f = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final x f8614k = new IBinder.DeathRecipient() { // from class: p6.x
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            c cVar = c.this;
            cVar.f8605b.b("reportBinderDeath", new Object[0]);
            a3.g.z(cVar.f8613j.get());
            cVar.f8605b.b("%s : Binder has died.", cVar.f8606c);
            Iterator it = cVar.f8607d.iterator();
            while (it.hasNext()) {
                ((w) it.next()).a(new RemoteException(String.valueOf(cVar.f8606c).concat(" : Binder has died.")));
            }
            cVar.f8607d.clear();
            synchronized (cVar.f8609f) {
                cVar.e();
            }
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f8615l = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    public final WeakReference f8613j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [p6.x] */
    public c(Context context, v vVar, String str, Intent intent, a0 a0Var) {
        this.f8604a = context;
        this.f8605b = vVar;
        this.f8606c = str;
        this.f8611h = intent;
        this.f8612i = a0Var;
    }

    public static /* bridge */ /* synthetic */ void b(c cVar, w wVar) {
        IInterface iInterface = cVar.f8617n;
        ArrayList arrayList = cVar.f8607d;
        v vVar = cVar.f8605b;
        if (iInterface == null && !cVar.f8610g) {
            vVar.b("Initiate binding to the service.", new Object[0]);
            arrayList.add(wVar);
            b bVar = new b(cVar);
            cVar.f8616m = bVar;
            cVar.f8610g = true;
            if (!cVar.f8604a.bindService(cVar.f8611h, bVar, 1)) {
                vVar.b("Failed to bind to the service.", new Object[0]);
                cVar.f8610g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((w) it.next()).a(new d());
                }
                arrayList.clear();
                return;
            }
            return;
        }
        if (cVar.f8610g) {
            vVar.b("Waiting to bind to the service.", new Object[0]);
            arrayList.add(wVar);
        } else {
            wVar.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = o;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.f8606c)) {
                HandlerThread handlerThread = new HandlerThread(this.f8606c, 10);
                handlerThread.start();
                hashMap.put(this.f8606c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.f8606c);
        }
        return handler;
    }

    public final void c(w wVar, TaskCompletionSource taskCompletionSource) {
        a().post(new y(this, wVar.c(), taskCompletionSource, wVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f8609f) {
            this.f8608e.remove(taskCompletionSource);
        }
        a().post(new z(this, 0));
    }

    public final void e() {
        HashSet hashSet = this.f8608e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f8606c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
