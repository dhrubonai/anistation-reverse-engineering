package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hd extends li4 {
    public final o34 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public hd(defpackage.sb2 r2, defpackage.o34 r3) {
        /*
            r1 = this;
            if (r2 == 0) goto L12
            java.lang.Object r2 = r2.invoke()
            li4 r2 = (defpackage.li4) r2
            if (r2 == 0) goto L12
            java.util.List r2 = r2.a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            goto L17
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L17:
            r2 = 2
            r1.<init>(r2, r0)
            r1.c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd.<init>(sb2, o34):void");
    }

    @Override // defpackage.li4
    public final Object a(im0 im0Var) {
        if (im0Var.equals(z05.a(v95.class))) {
            try {
                return w65.u(this.c);
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException("Koin could not create a SavedStateHandle: the ViewModel's CreationExtras has no SavedStateRegistryOwner. Resolve the ViewModel via koinViewModel()/koinNavViewModel() with a proper owner (e.g. a NavBackStackEntry), and inject SavedStateHandle directly in the ViewModel constructor (not lazily/outside construction).", e);
            }
        }
        return super.a(im0Var);
    }

    @Override // defpackage.li4
    public final Object b(e73 e73Var) {
        e73Var.getClass();
        if (e73Var.equals(z05.a(v95.class))) {
            try {
                return w65.u(this.c);
            } catch (IllegalArgumentException e) {
                throw new IllegalStateException("Koin could not create a SavedStateHandle: the ViewModel's CreationExtras has no SavedStateRegistryOwner. Resolve the ViewModel via koinViewModel()/koinNavViewModel() with a proper owner (e.g. a NavBackStackEntry), and inject SavedStateHandle directly in the ViewModel constructor (not lazily/outside construction).", e);
            }
        }
        return super.b(e73Var);
    }
}
