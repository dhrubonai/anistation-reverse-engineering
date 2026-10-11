package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pf6 {
    public final long a;
    public final sb2 b;
    public final ub2 c;
    public final bx5 d;
    volatile /* synthetic */ int isStarted;
    volatile /* synthetic */ long lastActivityTime;

    public pf6(String str, long j, sb2 sb2Var, v11 v11Var, ub2 ub2Var) {
        v11Var.getClass();
        this.a = j;
        this.b = sb2Var;
        this.c = ub2Var;
        this.lastActivityTime = 0L;
        byte b = 0;
        this.isStarted = 0;
        this.d = j != Long.MAX_VALUE ? tl7.z(v11Var, v11Var.getCoroutineContext().plus(new r11("Timeout ".concat(str))), null, new nf6(this, null, b), 2) : null;
    }

    public final void a() {
        this.lastActivityTime = ((Number) this.b.invoke()).longValue();
        this.isStarted = 1;
    }

    public final void b() {
        this.isStarted = 0;
    }
}
