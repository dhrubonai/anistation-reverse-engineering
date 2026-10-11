package defpackage;

import com.anistation.model.Info;
import com.anistation.model.animelist.WatchStatus;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nn extends xz0 {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ on D;
    public int E;
    public Info x;
    public Integer y;
    public WatchStatus z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn(on onVar, xz0 xz0Var) {
        super(xz0Var);
        this.D = onVar;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.g(null, null, 0, 0, null, this);
    }
}
