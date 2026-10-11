package androidx.lifecycle;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f1069a;

    /* renamed from: b, reason: collision with root package name */
    public final y0 f1070b;

    /* renamed from: c, reason: collision with root package name */
    public final y0.c f1071c;

    public a1(b1 b1Var, y0 y0Var, y0.c cVar) {
        r6.h0.u(b1Var, "store");
        r6.h0.u(y0Var, "factory");
        r6.h0.u(cVar, "defaultCreationExtras");
        this.f1069a = b1Var;
        this.f1070b = y0Var;
        this.f1071c = cVar;
    }

    public final w0 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b(cls, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final w0 b(Class cls, String str) {
        w0 create;
        u0 u0Var;
        r6.h0.u(str, "key");
        b1 b1Var = this.f1069a;
        b1Var.getClass();
        w0 w0Var = (w0) b1Var.f1075a.get(str);
        boolean isInstance = cls.isInstance(w0Var);
        y0 y0Var = this.f1070b;
        if (isInstance) {
            if (y0Var instanceof u0) {
                u0Var = (u0) y0Var;
            } else {
                u0Var = null;
            }
            if (u0Var != null) {
                r6.h0.q(w0Var);
                p pVar = u0Var.f1148d;
                if (pVar != null) {
                    n3.e eVar = u0Var.f1149e;
                    r6.h0.q(eVar);
                    com.bumptech.glide.c.c(w0Var, eVar, pVar);
                }
            }
            r6.h0.r(w0Var, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return w0Var;
        }
        y0.d dVar = new y0.d(this.f1071c);
        dVar.f11463a.put(q0.f1129b, str);
        try {
            create = y0Var.create(cls, dVar);
        } catch (AbstractMethodError unused) {
            create = y0Var.create(cls);
        }
        r6.h0.u(create, "viewModel");
        w0 w0Var2 = (w0) b1Var.f1075a.put(str, create);
        if (w0Var2 != null) {
            w0Var2.onCleared();
        }
        return create;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a1(b1 b1Var, androidx.fragment.app.v0 v0Var) {
        this(b1Var, v0Var, y0.a.f11462b);
        r6.h0.u(b1Var, "store");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a1(androidx.lifecycle.c1 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "owner"
            r6.h0.u(r4, r0)
            androidx.lifecycle.b1 r0 = r4.getViewModelStore()
            boolean r1 = r4 instanceof androidx.lifecycle.j
            if (r1 == 0) goto L15
            r2 = r4
            androidx.lifecycle.j r2 = (androidx.lifecycle.j) r2
            androidx.lifecycle.y0 r2 = r2.getDefaultViewModelProviderFactory()
            goto L25
        L15:
            androidx.lifecycle.z0 r2 = androidx.lifecycle.z0.f1169a
            if (r2 != 0) goto L20
            androidx.lifecycle.z0 r2 = new androidx.lifecycle.z0
            r2.<init>()
            androidx.lifecycle.z0.f1169a = r2
        L20:
            androidx.lifecycle.z0 r2 = androidx.lifecycle.z0.f1169a
            r6.h0.q(r2)
        L25:
            if (r1 == 0) goto L2e
            androidx.lifecycle.j r4 = (androidx.lifecycle.j) r4
            y0.c r4 = r4.getDefaultViewModelCreationExtras()
            goto L30
        L2e:
            y0.a r4 = y0.a.f11462b
        L30:
            r3.<init>(r0, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.a1.<init>(androidx.lifecycle.c1):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a1(androidx.lifecycle.c1 r3, androidx.lifecycle.y0 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            r6.h0.u(r3, r0)
            androidx.lifecycle.b1 r0 = r3.getViewModelStore()
            boolean r1 = r3 instanceof androidx.lifecycle.j
            if (r1 == 0) goto L14
            androidx.lifecycle.j r3 = (androidx.lifecycle.j) r3
            y0.c r3 = r3.getDefaultViewModelCreationExtras()
            goto L16
        L14:
            y0.a r3 = y0.a.f11462b
        L16:
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.a1.<init>(androidx.lifecycle.c1, androidx.lifecycle.y0):void");
    }
}
