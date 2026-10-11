package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zd5 extends t36 implements ic2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ byte x;
    public /* synthetic */ Object y;
    public final /* synthetic */ ee5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zd5(ee5 ee5Var, String str, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = ee5Var;
        this.A = str;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        String str = this.A;
        ee5 ee5Var = this.z;
        switch (b) {
            case 0:
                zd5 zd5Var = new zd5(ee5Var, str, vz0Var, (byte) 0);
                zd5Var.y = obj;
                return zd5Var;
            default:
                zd5 zd5Var2 = new zd5(ee5Var, str, vz0Var, (byte) 1);
                zd5Var2.y = obj;
                return zd5Var2;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        j44 j44Var = (j44) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                ((zd5) create(j44Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((zd5) create(j44Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        String str = this.A;
        j44 j44Var = (j44) this.y;
        switch (b) {
            case 0:
                m37.N(obj);
                List c = ee5.c((String) j44Var.c(ee5.c));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : c) {
                    if (!b06.C((String) obj2, str, true)) {
                        arrayList.add(obj2);
                    }
                }
                j44Var.e(ee5.c, new JSONArray((Collection) yo0.D0(yo0.u0(arrayList, te4.H(str)), 20)).toString());
                return pn6Var;
            default:
                m37.N(obj);
                List c2 = ee5.c((String) j44Var.c(ee5.c));
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : c2) {
                    if (!b06.C((String) obj3, uz5.w0(str).toString(), true)) {
                        arrayList2.add(obj3);
                    }
                }
                j44Var.e(ee5.c, new JSONArray((Collection) arrayList2).toString());
                return pn6Var;
        }
    }
}
