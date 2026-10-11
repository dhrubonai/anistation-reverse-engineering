package defpackage;

import com.anistation.model.Info;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class xe1 implements ub2 {
    public final /* synthetic */ zm6 A;
    public final /* synthetic */ List B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ Info z;

    public /* synthetic */ xe1(ub2 ub2Var, Info info, zm6 zm6Var, List list, byte b) {
        this.x = b;
        this.y = ub2Var;
        this.z = info;
        this.A = zm6Var;
        this.B = list;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        List list = this.B;
        zm6 zm6Var = this.A;
        Info info = this.z;
        ub2 ub2Var = this.y;
        int intValue = ((Integer) obj).intValue();
        switch (b) {
            case 0:
                if1.b(ub2Var, info, zm6Var, list, intValue);
                return pn6Var;
            default:
                if1.b(ub2Var, info, zm6Var, list, intValue);
                return pn6Var;
        }
    }
}
