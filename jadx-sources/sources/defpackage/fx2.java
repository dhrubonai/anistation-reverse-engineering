package defpackage;

import com.anistation.model.animelist.WatchStatus;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fx2 implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ WatchStatus z;

    public /* synthetic */ fx2(ub2 ub2Var, WatchStatus watchStatus, byte b) {
        this.x = b;
        this.y = ub2Var;
        this.z = watchStatus;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        WatchStatus watchStatus = this.z;
        ub2 ub2Var = this.y;
        switch (b) {
            case 0:
                ((Boolean) obj).booleanValue();
                ub2Var.invoke(watchStatus);
                return pn6Var;
            default:
                ((String) obj).getClass();
                ub2Var.invoke(watchStatus);
                return pn6Var;
        }
    }
}
