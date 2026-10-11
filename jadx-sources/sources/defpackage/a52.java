package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class a52 extends xz0 {
    public x42 A;
    public Iterator B;
    public int C;
    public int D;
    public /* synthetic */ Object x;
    public int y;
    public final /* synthetic */ mx0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a52(mx0 mx0Var, vz0 vz0Var) {
        super(vz0Var);
        this.z = mx0Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.collect(null, this);
    }
}
