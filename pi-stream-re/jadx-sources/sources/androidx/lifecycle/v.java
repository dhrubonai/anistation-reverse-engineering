package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public o f1150a;

    /* renamed from: b, reason: collision with root package name */
    public final s f1151b;

    public v(t tVar, o oVar) {
        s gVar;
        r6.h0.q(tVar);
        HashMap hashMap = x.f1163a;
        boolean z9 = tVar instanceof s;
        boolean z10 = tVar instanceof q0.m;
        if (z9 && z10) {
            gVar = new g((q0.m) tVar, (s) tVar);
        } else if (z10) {
            gVar = new g((q0.m) tVar, (s) null);
        } else if (z9) {
            gVar = (s) tVar;
        } else {
            Class<?> cls = tVar.getClass();
            if (x.b(cls) == 2) {
                Object obj = x.f1164b.get(cls);
                r6.h0.q(obj);
                List list = (List) obj;
                if (list.size() != 1) {
                    int size = list.size();
                    i[] iVarArr = new i[size];
                    if (size <= 0) {
                        gVar = new e(iVarArr);
                    } else {
                        x.a((Constructor) list.get(0), tVar);
                        throw null;
                    }
                } else {
                    x.a((Constructor) list.get(0), tVar);
                    throw null;
                }
            } else {
                gVar = new g(tVar);
            }
        }
        this.f1151b = gVar;
        this.f1150a = oVar;
    }

    public final void a(u uVar, n nVar) {
        o a10 = nVar.a();
        o oVar = this.f1150a;
        r6.h0.u(oVar, "state1");
        if (a10.compareTo(oVar) < 0) {
            oVar = a10;
        }
        this.f1150a = oVar;
        this.f1151b.onStateChanged(uVar, nVar);
        this.f1150a = a10;
    }
}
