package defpackage;

import androidx.work.impl.model.WorkSpecDao_Impl;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class d87 implements ub2 {
    public final /* synthetic */ WorkSpecDao_Impl A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;
    public final /* synthetic */ List z;

    public /* synthetic */ d87(String str, List list, WorkSpecDao_Impl workSpecDao_Impl, byte b) {
        this.x = b;
        this.y = str;
        this.z = list;
        this.A = workSpecDao_Impl;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        WorkSpecDao_Impl workSpecDao_Impl = this.A;
        List list = this.z;
        String str = this.y;
        g85 g85Var = (g85) obj;
        switch (b) {
            case 0:
                return WorkSpecDao_Impl.n(str, list, workSpecDao_Impl, g85Var);
            case 1:
                return WorkSpecDao_Impl.Q(str, list, workSpecDao_Impl, g85Var);
            default:
                return WorkSpecDao_Impl.E(str, list, workSpecDao_Impl, g85Var);
        }
    }
}
