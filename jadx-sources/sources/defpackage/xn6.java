package defpackage;

import com.unity3d.ads.UnityAdsError;
import com.unity3d.ads.core.data.model.exception.GatewayException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class xn6 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ zn6 y;
    public final /* synthetic */ UnityAdsError z;

    public /* synthetic */ xn6(zn6 zn6Var, UnityAdsError unityAdsError, byte b) {
        this.x = b;
        this.y = zn6Var;
        this.z = unityAdsError;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        u55 u55Var = u55.z;
        UnityAdsError unityAdsError = this.z;
        zn6 zn6Var = this.y;
        switch (b) {
            case 0:
                zn6Var.d = false;
                if (unityAdsError == null) {
                    zn6Var.c = true;
                    zn6Var.c();
                } else {
                    zn6Var.c = false;
                    zn6.d(GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION, unityAdsError);
                    zn6Var.a(u55Var);
                }
                return pn6Var;
            default:
                zn6.d("show", unityAdsError);
                if (zn6Var.f) {
                    zn6Var.f = false;
                    zn6Var.g = false;
                    zn6Var.h = false;
                    zn6Var.a(u55Var);
                    zn6Var.c();
                }
                return pn6Var;
        }
    }
}
