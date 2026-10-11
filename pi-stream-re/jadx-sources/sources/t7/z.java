package t7;

import p7.t1;
import r6.h0;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final w4.o f10093a = new w4.o("NO_THREAD_ELEMENTS", 3);

    /* renamed from: b, reason: collision with root package name */
    public static final z6.c f10094b = z6.c.f12073f;

    /* renamed from: c, reason: collision with root package name */
    public static final z6.c f10095c = z6.c.f12074x;

    /* renamed from: d, reason: collision with root package name */
    public static final z6.c f10096d = z6.c.f12075y;

    public static final void a(z6.i iVar, Object obj) {
        if (obj == f10093a) {
            return;
        }
        if (obj instanceof b0) {
            t1[] t1VarArr = ((b0) obj).f10053b;
            int length = t1VarArr.length - 1;
            if (length < 0) {
                return;
            }
            t1 t1Var = t1VarArr[length];
            h0.q(null);
            throw null;
        }
        Object x9 = iVar.x(null, f10095c);
        h0.r(x9, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        a3.g.z(x9);
        throw null;
    }

    public static final Object b(z6.i iVar, Object obj) {
        if (obj == null) {
            obj = iVar.x(0, f10094b);
            h0.q(obj);
        }
        if (obj == 0) {
            return f10093a;
        }
        if (obj instanceof Integer) {
            return iVar.x(new b0(iVar, ((Number) obj).intValue()), f10096d);
        }
        a3.g.z(obj);
        throw null;
    }
}
