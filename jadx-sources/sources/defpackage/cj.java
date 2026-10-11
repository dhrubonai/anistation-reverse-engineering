package defpackage;

import com.anistation.model.watch.Track;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class cj implements ub2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ ub2 z;

    public /* synthetic */ cj(ub2 ub2Var, ub2 ub2Var2, byte b) {
        this.x = b;
        this.y = ub2Var;
        this.z = ub2Var2;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ub2 ub2Var = this.z;
        ub2 ub2Var2 = this.y;
        switch (b) {
            case 0:
                Long l = (Long) obj;
                l.longValue();
                ub2Var2.invoke(Boolean.TRUE);
                ub2Var.invoke(l);
                return pn6Var;
            case 1:
                Long l2 = (Long) obj;
                l2.longValue();
                ub2Var2.invoke(l2);
                ub2Var.invoke(Boolean.FALSE);
                return pn6Var;
            case 2:
                obj.getClass();
                if (ub2Var2 != null) {
                    ub2Var2.invoke(obj);
                }
                ub2Var.invoke(obj);
                return pn6Var;
            case 3:
                ub2Var2.invoke(obj);
                ub2Var.invoke(obj);
                return pn6Var;
            case 4:
                ub2Var2.invoke(obj);
                ub2Var.invoke(obj);
                return pn6Var;
            case 5:
                String str = (String) obj;
                str.getClass();
                ub2Var2.invoke(new eh(ub2Var, str, (byte) 6));
                return pn6Var;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                ub2Var2.invoke(new eh(ub2Var, str2, (byte) 2));
                return pn6Var;
            case 7:
                String str3 = (String) obj;
                str3.getClass();
                ub2Var2.invoke(new eh(ub2Var, str3, (byte) 3));
                return pn6Var;
            case 8:
                String str4 = (String) obj;
                str4.getClass();
                ub2Var2.invoke(new eh(ub2Var, str4, (byte) 4));
                return pn6Var;
            case 9:
                zw zwVar = (zw) obj;
                zwVar.getClass();
                ub2Var2.invoke(new w07(ub2Var, zwVar, (byte) 0));
                return pn6Var;
            default:
                ub2Var2.invoke(new x07(ub2Var, (Track) obj, (byte) 0));
                return pn6Var;
        }
    }
}
