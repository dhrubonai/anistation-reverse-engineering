package f1;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import f.c0;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: e, reason: collision with root package name */
    public static r f3845e;

    /* renamed from: a, reason: collision with root package name */
    public int f3846a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3847b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3848c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3849d;

    public r(Context context) {
        this.f3847b = new Handler(Looper.getMainLooper());
        this.f3848c = new CopyOnWriteArrayList();
        this.f3849d = new Object();
        this.f3846a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new c0(this), intentFilter);
    }

    public static void a(r rVar, int i10) {
        synchronized (rVar.f3849d) {
            if (rVar.f3846a != i10) {
                rVar.f3846a = i10;
                Iterator it = ((CopyOnWriteArrayList) rVar.f3848c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    z1.e eVar = (z1.e) weakReference.get();
                    if (eVar != null) {
                        eVar.a(i10);
                    } else {
                        ((CopyOnWriteArrayList) rVar.f3848c).remove(weakReference);
                    }
                }
            }
        }
    }

    public static synchronized r b(Context context) {
        r rVar;
        synchronized (r.class) {
            if (f3845e == null) {
                f3845e = new r(context);
            }
            rVar = f3845e;
        }
        return rVar;
    }

    public final int c() {
        int i10;
        synchronized (this.f3849d) {
            i10 = this.f3846a;
        }
        return i10;
    }

    public r(v1.n nVar, v1.s sVar, IOException iOException, int i10) {
        this.f3847b = nVar;
        this.f3848c = sVar;
        this.f3849d = iOException;
        this.f3846a = i10;
    }

    public r(UUID uuid, int i10, byte[] bArr, UUID[] uuidArr) {
        this.f3847b = uuid;
        this.f3846a = i10;
        this.f3848c = bArr;
        this.f3849d = uuidArr;
    }
}
