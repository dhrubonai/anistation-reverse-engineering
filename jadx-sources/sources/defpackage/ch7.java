package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ch7 extends am7 {
    public final /* synthetic */ int o;
    public final /* synthetic */ s25 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch7(s25 s25Var, int i) {
        super(s25Var, false);
        this.o = i;
        Objects.requireNonNull(s25Var);
        this.p = s25Var;
    }

    @Override // defpackage.am7
    public final void i() {
        this.p.c.a(j(), 0, -1L, 0, Integer.valueOf(this.o));
    }
}
