package androidx.lifecycle;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class g implements s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1095a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1096b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1097c;

    public g(p pVar, n3.e eVar) {
        this.f1096b = pVar;
        this.f1097c = eVar;
    }

    @Override // androidx.lifecycle.s
    public final void onStateChanged(u uVar, n nVar) {
        Handler handler;
        int i10 = this.f1095a;
        Object obj = this.f1097c;
        Object obj2 = this.f1096b;
        switch (i10) {
            case 0:
                switch (f.f1094a[nVar.ordinal()]) {
                    case 1:
                        ((q0.m) obj2).getClass();
                        break;
                    case 2:
                        ((q0.m) obj2).getClass();
                        break;
                    case 3:
                        q0.m mVar = (q0.m) obj2;
                        mVar.f8933b.getClass();
                        if (Build.VERSION.SDK_INT >= 28) {
                            handler = q0.b.a(Looper.getMainLooper());
                        } else {
                            handler = new Handler(Looper.getMainLooper());
                        }
                        handler.postDelayed(new q0.q(), 500L);
                        mVar.f8932a.b(mVar);
                        break;
                    case 4:
                        ((q0.m) obj2).getClass();
                        break;
                    case 5:
                        ((q0.m) obj2).getClass();
                        break;
                    case 6:
                        ((q0.m) obj2).getClass();
                        break;
                    case zzaja.zze.zzg /* 7 */:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                s sVar = (s) obj;
                if (sVar != null) {
                    sVar.onStateChanged(uVar, nVar);
                    return;
                }
                return;
            case 1:
                if (nVar == n.ON_START) {
                    ((p) obj2).b(this);
                    ((n3.e) obj).d();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((b) obj).f1072a;
                b.a((List) hashMap.get(nVar), uVar, nVar, obj2);
                b.a((List) hashMap.get(n.ON_ANY), uVar, nVar, obj2);
                return;
        }
    }

    public g(q0.m mVar, s sVar) {
        r6.h0.u(mVar, "defaultLifecycleObserver");
        this.f1096b = mVar;
        this.f1097c = sVar;
    }

    public g(Object obj) {
        this.f1096b = obj;
        this.f1097c = d.f1089c.b(obj.getClass());
    }
}
