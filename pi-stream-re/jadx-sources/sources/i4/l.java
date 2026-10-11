package i4;

import android.content.Context;
import android.net.ConnectivityManager;
import f9.x;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class l implements o, p4.f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5356a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5357b;

    public /* synthetic */ l(Object obj, Object obj2) {
        this.f5357b = obj;
        this.f5356a = obj2;
    }

    @Override // p4.f
    public final Object get() {
        return (ConnectivityManager) ((Context) this.f5356a).getSystemService("connectivity");
    }

    public l(x xVar) {
        this.f5356a = new HashMap();
        this.f5357b = xVar;
    }
}
