package d0;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.l;
import androidx.fragment.app.m1;
import androidx.fragment.app.s0;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.f1;
import com.google.android.gms.common.api.internal.g1;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import f.p0;
import java.util.List;
import java.util.concurrent.Callable;
import msr.pistream.app.download.PiStreamDownloadService;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3008a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3009b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3010c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3011d;

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, int i10) {
        this.f3008a = i10;
        this.f3011d = obj;
        this.f3009b = obj2;
        this.f3010c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i10 = this.f3008a;
        Bundle bundle = null;
        Object obj = null;
        Bundle bundle2 = null;
        Object obj2 = this.f3011d;
        Object obj3 = this.f3010c;
        Object obj4 = this.f3009b;
        switch (i10) {
            case 0:
                Typeface typeface = (Typeface) obj3;
                z7.c cVar = (z7.c) ((p0) obj4).f3762b;
                if (cVar != null) {
                    cVar.r(typeface);
                    return;
                }
                return;
            case 1:
                ((f0.a) obj4).accept(obj3);
                return;
            case 2:
                try {
                    obj = ((Callable) obj4).call();
                } catch (Exception unused) {
                }
                ((Handler) obj2).post(new a(this, (f0.a) obj3, obj, 1));
                return;
            case 3:
                List list = (List) obj4;
                m1 m1Var = (m1) obj3;
                if (list.contains(m1Var)) {
                    list.remove(m1Var);
                    ((l) obj2).getClass();
                    a3.g.b(m1Var.f932a, m1Var.f934c.V);
                    return;
                }
                return;
            case 4:
                ((androidx.fragment.app.k) obj4).b();
                if (s0.H(2)) {
                    Log.v("FragmentManager", "Transition for operation " + ((m1) obj3) + "has completed");
                    return;
                }
                return;
            case 5:
                f1 f1Var = (f1) obj2;
                if (f1Var.f2401b > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) obj4;
                    Bundle bundle3 = f1Var.f2402c;
                    if (bundle3 != null) {
                        bundle = bundle3.getBundle((String) obj3);
                    }
                    lifecycleCallback.onCreate(bundle);
                }
                if (f1Var.f2401b >= 2) {
                    ((LifecycleCallback) obj4).onStart();
                }
                if (f1Var.f2401b >= 3) {
                    ((LifecycleCallback) obj4).onResume();
                }
                if (f1Var.f2401b >= 4) {
                    ((LifecycleCallback) obj4).onStop();
                }
                if (f1Var.f2401b >= 5) {
                    ((LifecycleCallback) obj4).onDestroy();
                    return;
                }
                return;
            case 6:
                g1 g1Var = (g1) obj2;
                if (g1Var.f2418n0 > 0) {
                    LifecycleCallback lifecycleCallback2 = (LifecycleCallback) obj4;
                    Bundle bundle4 = g1Var.f2419o0;
                    if (bundle4 != null) {
                        bundle2 = bundle4.getBundle((String) obj3);
                    }
                    lifecycleCallback2.onCreate(bundle2);
                }
                if (g1Var.f2418n0 >= 2) {
                    ((LifecycleCallback) obj4).onStart();
                }
                if (g1Var.f2418n0 >= 3) {
                    ((LifecycleCallback) obj4).onResume();
                }
                if (g1Var.f2418n0 >= 4) {
                    ((LifecycleCallback) obj4).onStop();
                }
                if (g1Var.f2418n0 >= 5) {
                    ((LifecycleCallback) obj4).onDestroy();
                    return;
                }
                return;
            case zzaja.zze.zzg /* 7 */:
                if (((View) obj3) != null) {
                    ((u5.c) obj2).getClass();
                    return;
                }
                return;
            case 8:
                for (z7.b bVar : (List) obj4) {
                    try {
                        z7.f fVar = (z7.f) obj2;
                        Context context = (Context) obj3;
                        if (bVar != null) {
                            str = bVar.f12082a;
                        } else {
                            str = "";
                        }
                        fVar.getClass();
                        z7.f.g(context, bVar, str);
                    } catch (Exception unused2) {
                    }
                }
                return;
            default:
                try {
                    z7.f.a((z7.f) obj2, (Context) obj4, ((z7.b) obj3).f12082a);
                    return;
                } finally {
                    z7.f fVar2 = (z7.f) obj2;
                    fVar2.f12126d.remove(((z7.b) obj3).f12082a);
                    Context context2 = (Context) obj4;
                    fVar2.x(context2);
                    PiStreamDownloadService.refresh(context2);
                }
        }
    }
}
