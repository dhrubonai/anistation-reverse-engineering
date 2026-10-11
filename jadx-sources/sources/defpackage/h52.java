package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class h52 extends xz0 {
    public x42 A;
    public Serializable B;
    public int C;
    public /* synthetic */ Object x;
    public int y;
    public final /* synthetic */ i52 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h52(i52 i52Var, vz0 vz0Var) {
        super(vz0Var);
        this.z = i52Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.collect(null, this);
    }
}
