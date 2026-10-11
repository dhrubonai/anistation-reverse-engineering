package defpackage;

import com.anistation.local.dao.WatchProgressDao_Impl;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ay6 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ WatchProgressDao_Impl y;
    public final /* synthetic */ List z;

    public /* synthetic */ ay6(WatchProgressDao_Impl watchProgressDao_Impl, List list, byte b) {
        this.x = b;
        this.y = watchProgressDao_Impl;
        this.z = list;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        List list = this.z;
        WatchProgressDao_Impl watchProgressDao_Impl = this.y;
        g85 g85Var = (g85) obj;
        switch (b) {
            case 0:
                return WatchProgressDao_Impl.o(watchProgressDao_Impl, list, g85Var);
            default:
                return WatchProgressDao_Impl.e(watchProgressDao_Impl, list, g85Var);
        }
    }
}
