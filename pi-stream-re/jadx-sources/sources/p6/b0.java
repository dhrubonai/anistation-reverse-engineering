package p6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b0 extends w {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ IBinder f8602x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f8603y;

    public b0(b bVar, IBinder iBinder) {
        this.f8603y = bVar;
        this.f8602x = iBinder;
    }

    @Override // p6.w
    public final void b() {
        b bVar = this.f8603y;
        c cVar = bVar.f8601a;
        cVar.f8617n = (IInterface) cVar.f8612i.a(this.f8602x);
        c cVar2 = bVar.f8601a;
        cVar2.f8605b.b("linkToDeath", new Object[0]);
        try {
            cVar2.f8617n.asBinder().linkToDeath(cVar2.f8614k, 0);
        } catch (RemoteException e10) {
            cVar2.f8605b.a("linkToDeath failed", e10, new Object[0]);
        }
        cVar2.f8610g = false;
        Iterator it = cVar2.f8607d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        cVar2.f8607d.clear();
    }
}
