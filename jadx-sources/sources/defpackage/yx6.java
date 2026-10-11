package defpackage;

import com.anistation.local.dao.WatchProgressDao_Impl;
import com.anistation.local.entity.WatchProgress;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yx6 extends xz0 {
    public Iterator A;
    public WatchProgress B;
    public String C;
    public WatchProgress D;
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ WatchProgressDao_Impl G;
    public int H;
    public zx6 x;
    public String y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yx6(WatchProgressDao_Impl watchProgressDao_Impl, vz0 vz0Var) {
        super(vz0Var);
        this.G = watchProgressDao_Impl;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return zx6.a(this.G, null, 0, this);
    }
}
