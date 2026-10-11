package defpackage;

import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class dw1 implements jc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ vm1 y;

    public /* synthetic */ dw1(vm1 vm1Var, byte b) {
        this.x = b;
        this.y = vm1Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz3 vz3Var = vz3.x;
        int i = 4;
        boolean z = false;
        vm1 vm1Var = this.y;
        switch (b) {
            case 0:
                zc3 zc3Var = (zc3) obj;
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                zc3Var.getClass();
                if ((intValue & 6) == 0) {
                    if (!kd2Var.f(zc3Var)) {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    h98.d(lz5.f(R.string.no_episodes_found, kd2Var), lz5.f(R.string.episodes_not_available, kd2Var), ar5.c(vz3Var, 1.0f).w(ar5.g(vz3Var, vm1Var.x, 0.0f, 2)), kd2Var, 0, 0);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                zc3 zc3Var2 = (zc3) obj;
                kd2 kd2Var2 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                zc3Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    if (!kd2Var2.f(zc3Var2)) {
                        i = 2;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) != 18) {
                    z = true;
                }
                if (kd2Var2.V(intValue2 & 1, z)) {
                    io3.a(ar5.c(vz3Var, 1.0f).w(ar5.g(vz3Var, vm1Var.x, 0.0f, 2)), 0, 0.0f, kd2Var2, 0, 6);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                zc3 zc3Var3 = (zc3) obj;
                kd2 kd2Var3 = (kd2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                zc3Var3.getClass();
                if ((intValue3 & 6) == 0) {
                    if (!kd2Var3.f(zc3Var3)) {
                        i = 2;
                    }
                    intValue3 |= i;
                }
                if ((intValue3 & 19) != 18) {
                    z = true;
                }
                if (kd2Var3.V(intValue3 & 1, z)) {
                    h98.d(lz5.f(R.string.no_items_found, kd2Var3), lz5.f(R.string.nothing_available, kd2Var3), ar5.c(vz3Var, 1.0f).w(ar5.g(vz3Var, vm1Var.x, 0.0f, 2)), kd2Var3, 0, 0);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 3:
                zc3 zc3Var4 = (zc3) obj;
                kd2 kd2Var4 = (kd2) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                zc3Var4.getClass();
                if ((intValue4 & 6) == 0) {
                    if (!kd2Var4.f(zc3Var4)) {
                        i = 2;
                    }
                    intValue4 |= i;
                }
                if ((intValue4 & 19) != 18) {
                    z = true;
                }
                if (kd2Var4.V(intValue4 & 1, z)) {
                    h98.d(lz5.f(R.string.no_items_found, kd2Var4), lz5.f(R.string.nothing_available, kd2Var4), ar5.c(vz3Var, 1.0f).w(ar5.g(vz3Var, vm1Var.x, 0.0f, 2)), kd2Var4, 0, 0);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            default:
                zc3 zc3Var5 = (zc3) obj;
                kd2 kd2Var5 = (kd2) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                zc3Var5.getClass();
                if ((intValue5 & 6) == 0) {
                    if (!kd2Var5.f(zc3Var5)) {
                        i = 2;
                    }
                    intValue5 |= i;
                }
                if ((intValue5 & 19) != 18) {
                    z = true;
                }
                if (kd2Var5.V(intValue5 & 1, z)) {
                    h98.d(lz5.f(R.string.no_watch_order_found, kd2Var5), lz5.f(R.string.watch_order_not_available, kd2Var5), ar5.c(vz3Var, 1.0f).w(ar5.g(vz3Var, vm1Var.x, 0.0f, 2)), kd2Var5, 0, 0);
                } else {
                    kd2Var5.Y();
                }
                return pn6Var;
        }
    }
}
