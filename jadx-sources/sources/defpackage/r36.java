package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class r36 implements vz0, x11 {
    public int x = Integer.MIN_VALUE;
    public final /* synthetic */ s36 y;

    public r36(s36 s36Var) {
        this.y = s36Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [vz0[]] */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // defpackage.x11
    public final x11 getCallerFrame() {
        ax5 ax5Var = ax5.x;
        int i = this.x;
        s36 s36Var = this.y;
        if (i == Integer.MIN_VALUE) {
            i = s36Var.C;
            this.x = i;
        }
        if (i < 0) {
            this.x = Integer.MIN_VALUE;
            ax5Var = null;
        } else {
            try {
                ?? r2 = s36Var.B[i];
                if (r2 != 0) {
                    this.x = i - 1;
                    ax5Var = r2;
                }
            } catch (Throwable unused) {
            }
        }
        if (!(ax5Var instanceof x11)) {
            return null;
        }
        return ax5Var;
    }

    @Override // defpackage.vz0
    public final l11 getContext() {
        s36 s36Var = this.y;
        for (int i = s36Var.C; -1 < i; i--) {
            vz0 vz0Var = s36Var.B[i];
            if (vz0Var != this && vz0Var != null) {
                return vz0Var.getContext();
            }
        }
        ze0.m("Not started");
        return null;
    }

    @Override // defpackage.vz0
    public final void resumeWith(Object obj) {
        Throwable b = z45.b(obj);
        s36 s36Var = this.y;
        if (b != null) {
            s36Var.f(new y45(b));
        } else {
            s36Var.e(false);
        }
    }
}
