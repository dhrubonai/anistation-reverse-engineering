package i4;

import android.content.IntentFilter;
import android.util.Log;

/* loaded from: classes.dex */
public final class t implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5369a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f5370b;

    public /* synthetic */ t(u uVar, int i10) {
        this.f5369a = i10;
        this.f5370b = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5369a) {
            case 0:
                u uVar = this.f5370b;
                uVar.f5375d = uVar.c();
                try {
                    u uVar2 = this.f5370b;
                    uVar2.f5372a.registerReceiver(uVar2.f5377f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    this.f5370b.f5376e = true;
                    return;
                } catch (SecurityException e10) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e10);
                    }
                    this.f5370b.f5376e = false;
                    return;
                }
            case 1:
                if (this.f5370b.f5376e) {
                    this.f5370b.f5376e = false;
                    u uVar3 = this.f5370b;
                    uVar3.f5372a.unregisterReceiver(uVar3.f5377f);
                    return;
                }
                return;
            default:
                boolean z9 = this.f5370b.f5375d;
                u uVar4 = this.f5370b;
                uVar4.f5375d = uVar4.c();
                if (z9 != this.f5370b.f5375d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + this.f5370b.f5375d);
                    }
                    u uVar5 = this.f5370b;
                    p4.m.e().post(new r(1, uVar5, uVar5.f5375d));
                    return;
                }
                return;
        }
    }
}
