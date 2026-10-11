package c;

import android.os.Bundle;
import androidx.lifecycle.n;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class d implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f1575b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d.a f1576c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f1577d;

    public d(h hVar, String str, b bVar, d.a aVar) {
        this.f1577d = hVar;
        this.f1574a = str;
        this.f1575b = bVar;
        this.f1576c = aVar;
    }

    @Override // androidx.lifecycle.s
    public final void onStateChanged(u uVar, n nVar) {
        boolean equals = n.ON_START.equals(nVar);
        String str = this.f1574a;
        h hVar = this.f1577d;
        if (equals) {
            HashMap hashMap = hVar.f1591f;
            d.a aVar = this.f1576c;
            b bVar = this.f1575b;
            hashMap.put(str, new f(aVar, bVar));
            HashMap hashMap2 = hVar.f1592g;
            if (hashMap2.containsKey(str)) {
                Object obj = hashMap2.get(str);
                hashMap2.remove(str);
                bVar.a(obj);
            }
            Bundle bundle = hVar.f1593h;
            a aVar2 = (a) bundle.getParcelable(str);
            if (aVar2 != null) {
                bundle.remove(str);
                bVar.a(aVar.c(aVar2.f1573b, aVar2.f1572a));
                return;
            }
            return;
        }
        if (n.ON_STOP.equals(nVar)) {
            hVar.f1591f.remove(str);
        } else if (n.ON_DESTROY.equals(nVar)) {
            hVar.f(str);
        }
    }
}
