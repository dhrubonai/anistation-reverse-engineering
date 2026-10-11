package p6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes.dex */
public final class b implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f8601a;

    public /* synthetic */ b(c cVar) {
        this.f8601a = cVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c cVar = this.f8601a;
        cVar.f8605b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        cVar.a().post(new b0(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c cVar = this.f8601a;
        cVar.f8605b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        cVar.a().post(new z(this, 1));
    }
}
