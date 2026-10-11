package k4;

import androidx.lifecycle.q0;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import n.e;
import p4.k;
import x3.c0;
import x3.m;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f6469c = new c0(Object.class, Object.class, Object.class, Collections.singletonList(new m(Object.class, Object.class, Object.class, Collections.emptyList(), new q0(), null)), null);

    /* renamed from: a, reason: collision with root package name */
    public final e f6470a = new e();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f6471b = new AtomicReference();

    public final void a(Class cls, Class cls2, Class cls3, c0 c0Var) {
        synchronized (this.f6470a) {
            e eVar = this.f6470a;
            k kVar = new k(cls, cls2, cls3);
            if (c0Var == null) {
                c0Var = f6469c;
            }
            eVar.put(kVar, c0Var);
        }
    }
}
