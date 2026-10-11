package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l51 extends xz0 {
    public Serializable A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ p51 D;
    public int E;
    public boolean x;
    public Object y;
    public w05 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l51(p51 p51Var, xz0 xz0Var) {
        super(xz0Var);
        this.D = p51Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.h(false, this);
    }
}
