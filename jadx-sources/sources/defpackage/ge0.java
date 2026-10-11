package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class ge0 {
    public static final ArrayList a;

    static {
        bf5 bf5Var = bf5.RSA;
        vj2 vj2Var = vj2.C;
        oo5 oo5Var = oo5.z;
        cm0 cm0Var = new cm0((short) 156, "TLS_RSA_WITH_AES_128_GCM_SHA256", "AES128-GCM-SHA256", bf5Var, 128, vj2Var, oo5Var);
        bf5 bf5Var2 = bf5.ECDHE;
        vj2 vj2Var2 = vj2.D;
        oo5 oo5Var2 = oo5.A;
        cm0 cm0Var2 = new cm0((short) -16340, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "ECDHE-ECDSA-AES256-GCM-SHA384", bf5Var2, 256, vj2Var2, oo5Var2);
        int i = 128;
        cm0 cm0Var3 = new cm0((short) -16341, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "ECDHE-ECDSA-AES128-GCM-SHA256", bf5Var2, i, vj2Var, oo5Var2);
        cm0 cm0Var4 = new cm0((short) -16336, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "ECDHE-RSA-AES256-GCM-SHA384", bf5Var2, 256, vj2Var2, oo5Var);
        cm0 cm0Var5 = new cm0((short) -16337, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "ECDHE-RSA-AES128-GCM-SHA256", bf5Var2, i, vj2Var, oo5Var);
        dm0 dm0Var = dm0.y;
        List I = te4.I(cm0Var2, cm0Var4, cm0Var3, cm0Var5, cm0Var, new cm0((short) 53, "TLS_RSA_WITH_AES_256_CBC_SHA", "AES-256-CBC-SHA", bf5Var, "AES/CBC/NoPadding", 256, 16, 48, 20, "HmacSHA1", 160, vj2Var, oo5Var, dm0Var), new cm0((short) 47, "TLS_RSA_WITH_AES_128_CBC_SHA", "AES-128-CBC-SHA", bf5Var, "AES/CBC/NoPadding", 128, 16, 48, 20, "HmacSHA1", 160, vj2Var, oo5Var, dm0Var));
        ArrayList arrayList = new ArrayList();
        for (Object obj : I) {
            cm0 cm0Var6 = (cm0) obj;
            cm0Var6.getClass();
            short s = cm0Var6.f;
            d46 d46Var = on4.a;
            String str = ((nn4) d46Var.getValue()).a;
            int hashCode = str.hashCode();
            if (hashCode != 46676283) {
                if (hashCode != 46677244) {
                    if (hashCode == 46678205 && str.equals("1.8.0") && ((nn4) d46Var.getValue()).b < 161 && s > 128) {
                    }
                    arrayList.add(obj);
                } else {
                    if (str.equals("1.7.0") && ((nn4) d46Var.getValue()).b < 171 && s > 128) {
                    }
                    arrayList.add(obj);
                }
            } else {
                if (str.equals("1.6.0") && ((nn4) d46Var.getValue()).b < 181 && s > 128) {
                }
                arrayList.add(obj);
            }
        }
        a = arrayList;
    }
}
