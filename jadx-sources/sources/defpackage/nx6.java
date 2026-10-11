package defpackage;

import com.anistation.model.Info;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class nx6 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ Info z;

    public /* synthetic */ nx6(ub2 ub2Var, Info info, byte b) {
        this.x = b;
        this.y = ub2Var;
        this.z = info;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        String valueOf;
        String valueOf2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Integer num = null;
        Info info = this.z;
        ub2 ub2Var = this.y;
        switch (b) {
            case 0:
                if (info == null || (valueOf = info.getId()) == null) {
                    if (info != null) {
                        num = Integer.valueOf(info.getAnilistId());
                    }
                    valueOf = String.valueOf(num);
                }
                ub2Var.invoke(valueOf);
                return pn6Var;
            default:
                if (info == null || (valueOf2 = info.getId()) == null) {
                    if (info != null) {
                        num = Integer.valueOf(info.getAnilistId());
                    }
                    valueOf2 = String.valueOf(num);
                }
                ub2Var.invoke(valueOf2);
                return pn6Var;
        }
    }
}
