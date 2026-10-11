package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class v63 extends xz0 {
    public String A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ yq6 D;
    public int E;
    public v61 x;
    public yq6 y;
    public LinkedHashMap z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v63(yq6 yq6Var, h30 h30Var) {
        super(h30Var);
        this.D = yq6Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.e(null, this);
    }
}
