package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class et extends xz0 {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ ft C;
    public int D;
    public List x;
    public e45 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(ft ftVar, xz0 xz0Var) {
        super(xz0Var);
        this.C = ftVar;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(this);
    }
}
