package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class si7 extends am7 {
    public final /* synthetic */ int o;
    public final /* synthetic */ long p;
    public final /* synthetic */ s25 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si7(s25 s25Var, int i, long j) {
        super(s25Var, false);
        this.o = i;
        this.p = j;
        Objects.requireNonNull(s25Var);
        this.q = s25Var;
    }

    @Override // defpackage.am7
    public final void i() {
        this.q.c.a(j(), this.o, this.p, 0, null);
    }
}
