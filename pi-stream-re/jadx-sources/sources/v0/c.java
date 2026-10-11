package v0;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.s0;
import androidx.fragment.app.y;
import f.m0;
import java.util.Set;
import r6.h0;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f10351a = b.f10348c;

    public static b a(y yVar) {
        while (yVar != null) {
            if (yVar.q()) {
                yVar.m();
            }
            yVar = yVar.L;
        }
        return f10351a;
    }

    public static void b(b bVar, e eVar) {
        y yVar = eVar.f10352a;
        String name = yVar.getClass().getName();
        a aVar = a.PENALTY_LOG;
        Set set = bVar.f10349a;
        if (set.contains(aVar)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), eVar);
        }
        if (set.contains(a.PENALTY_DEATH)) {
            m0 m0Var = new m0(3, name, eVar);
            if (yVar.q()) {
                Handler handler = yVar.m().f986t.E;
                h0.s(handler, "fragment.parentFragmentManager.host.handler");
                if (h0.g(handler.getLooper(), Looper.myLooper())) {
                    m0Var.run();
                    return;
                } else {
                    handler.post(m0Var);
                    return;
                }
            }
            m0Var.run();
        }
    }

    public static void c(e eVar) {
        if (s0.H(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(eVar.f10352a.getClass().getName()), eVar);
        }
    }

    public static final void d(y yVar, String str) {
        h0.u(yVar, "fragment");
        h0.u(str, "previousFragmentId");
        d dVar = new d(yVar, str);
        c(dVar);
        b a10 = a(yVar);
        if (a10.f10349a.contains(a.DETECT_FRAGMENT_REUSE) && e(a10, yVar.getClass(), d.class)) {
            b(a10, dVar);
        }
    }

    public static boolean e(b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.f10350b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (!h0.g(cls2.getSuperclass(), e.class) && set.contains(cls2.getSuperclass())) {
            return false;
        }
        return !set.contains(cls2);
    }
}
