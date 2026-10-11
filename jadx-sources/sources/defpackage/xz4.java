package defpackage;

import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class xz4 implements jc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ float y;

    public /* synthetic */ xz4(float f, byte b) {
        this.x = b;
        this.y = f;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz3 vz3Var = vz3.x;
        boolean z = false;
        float f = this.y;
        zc3 zc3Var = (zc3) obj;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                zc3Var.getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    ov5.a(kd2Var, ar5.e(vz3Var, f));
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                kd2 kd2Var2 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                zc3Var.getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                if (kd2Var2.V(intValue2 & 1, z)) {
                    ov5.a(kd2Var2, ar5.e(vz3Var, f));
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                kd2 kd2Var3 = (kd2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                zc3Var.getClass();
                if ((intValue3 & 17) != 16) {
                    z = true;
                }
                if (kd2Var3.V(intValue3 & 1, z)) {
                    ov5.a(kd2Var3, ar5.e(vz3Var, f));
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var4 = (kd2) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                zc3Var.getClass();
                if ((intValue4 & 17) != 16) {
                    z = true;
                }
                if (kd2Var4.V(intValue4 & 1, z)) {
                    h98.d(lz5.f(R.string.no_episodes_found, kd2Var4), lz5.f(R.string.episodes_not_available, kd2Var4), ar5.g(ar5.c(vz3Var, 1.0f), f, 0.0f, 2), kd2Var4, 0, 0);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
        }
    }
}
