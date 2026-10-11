package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l55 implements c25 {
    public m55 A;
    public final i55 x;
    public final Object y;
    public boolean z;

    public l55(i55 i55Var, Object obj, m55 m55Var, boolean z) {
        this.x = i55Var;
        this.y = obj;
        this.z = z;
        this.A = m55Var;
        if (!(obj instanceof c25) || (obj instanceof j55)) {
            return;
        }
        p65.i("Retained a value that implements RememberObserver but not RetainObserver. To receive the correct callbacks, the retained value '", obj, "' must also implement RetainObserver.");
        throw null;
    }

    @Override // defpackage.c25
    public final void a() {
        Object obj = this.y;
        if (obj instanceof j55) {
            ((j55) obj).getClass();
        }
    }

    @Override // defpackage.c25
    public final void b() {
        this.A.b(this.x, this.y);
    }

    @Override // defpackage.c25
    public final void c() {
        Object obj = this.y;
        if ((obj instanceof j55) && this.z) {
            this.z = false;
            j55 j55Var = (j55) obj;
            j55Var.b = (pj) j55Var.a.invoke(bb4.L);
        }
    }
}
