package defpackage;

import android.content.res.Resources;
import com.anistation.model.Info;
import com.anistation.model.Resource;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ja extends uc2 implements jc2 {
    public final /* synthetic */ byte x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja(v27 v27Var) {
        super(3, v27Var, v27.class, "toggleSaveToList", "toggleSaveToList(Ljava/lang/Integer;II)V", 0);
        this.x = (byte) 4;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Resource.Success success;
        Info info;
        Resource.Success success2;
        Info info2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                if (obj == null) {
                    oa oaVar = (oa) this.receiver;
                    Resources resources = oaVar.getContext().getResources();
                    return Boolean.valueOf(xa.a.a(oaVar, null, new et0(new xd1(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((uq5) obj2).a, (ub2) obj3)));
                }
                ov3.d();
                return null;
            case 1:
                ub2 ub2Var = ((za0) this.receiver).y;
                ub2Var.getClass();
                o80.n(ub2Var, obj2, (l11) obj3);
                return pn6Var;
            case 2:
                Object obj4 = ((dk0) obj2).a;
                ub2 ub2Var2 = ((za0) this.receiver).y;
                ub2Var2.getClass();
                Object a = dk0.a(obj4);
                a.getClass();
                o80.n(ub2Var2, a, (l11) obj3);
                return pn6Var;
            case 3:
                Integer num = (Integer) obj;
                int intValue = ((Number) obj2).intValue();
                int intValue2 = ((Number) obj3).intValue();
                pf1 pf1Var = (pf1) this.receiver;
                Resource resource = ((zm6) pf1Var.f.getValue()).a;
                if (resource instanceof Resource.Success) {
                    success = (Resource.Success) resource;
                } else {
                    success = null;
                }
                if (success != null && (info = (Info) success.getData()) != null) {
                    tl7.z(zz.J(pf1Var), null, null, new nf1(pf1Var, info, num, intValue, intValue2, null, (byte) 0), 3);
                }
                return pn6Var;
            default:
                Integer num2 = (Integer) obj;
                int intValue3 = ((Number) obj2).intValue();
                int intValue4 = ((Number) obj3).intValue();
                v27 v27Var = (v27) this.receiver;
                Resource resource2 = ((ym6) v27Var.n.getValue()).u;
                if (resource2 instanceof Resource.Success) {
                    success2 = (Resource.Success) resource2;
                } else {
                    success2 = null;
                }
                if (success2 != null && (info2 = (Info) success2.getData()) != null) {
                    tl7.z(zz.J(v27Var), null, null, new nf1(v27Var, info2, num2, intValue3, intValue4, null, (byte) 1), 3);
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.x = b;
    }
}
