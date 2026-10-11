package t7;

import g0.d1;
import java.util.Iterator;
import java.util.List;
import p7.m1;
import r6.h0;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f10087a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [n7.a] */
    static {
        String str;
        Object next;
        int i10 = y.f10092a;
        m1 m1Var = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        Iterator k10 = r.f.k();
        h0.u(k10, "<this>");
        d1 d1Var = new d1(k10, 3);
        if (!(d1Var instanceof n7.a)) {
            d1Var = new n7.a(d1Var);
        }
        List k02 = n7.e.k0(d1Var);
        Iterator it = k02.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int c6 = ((r) next).c();
                do {
                    Object next2 = it.next();
                    int c10 = ((r) next2).c();
                    if (c6 < c10) {
                        next = next2;
                        c6 = c10;
                    }
                } while (it.hasNext());
            }
        }
        r rVar = (r) next;
        if (rVar != null) {
            try {
                m1Var = rVar.b(k02);
            } catch (Throwable unused2) {
                rVar.a();
            }
            if (m1Var != null) {
                f10087a = m1Var;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
