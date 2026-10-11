package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ml implements px5 {
    public long A;
    public long B;
    public boolean C;
    public final tk6 x;
    public final ti4 y;
    public rl z;

    public ml(tk6 tk6Var, Object obj, rl rlVar, long j, long j2, boolean z) {
        rl rlVar2;
        this.x = tk6Var;
        this.y = xt5.g(obj);
        if (rlVar != null) {
            rlVar2 = q23.t(rlVar);
        } else {
            rlVar2 = (rl) tk6Var.a.invoke(obj);
            rlVar2.d();
        }
        this.z = rlVar2;
        this.A = j;
        this.B = j2;
        this.C = z;
    }

    public final Object b() {
        return this.x.b.invoke(this.z);
    }

    @Override // defpackage.px5
    public final Object getValue() {
        return this.y.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.y.getValue() + ", velocity=" + b() + ", isRunning=" + this.C + ", lastFrameTimeNanos=" + this.A + ", finishedTimeNanos=" + this.B + ")";
    }

    public /* synthetic */ ml(tk6 tk6Var, Object obj, rl rlVar, int i) {
        this(tk6Var, obj, (i & 4) != 0 ? null : rlVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
