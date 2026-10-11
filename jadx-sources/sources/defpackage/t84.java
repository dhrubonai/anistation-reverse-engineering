package defpackage;

import com.anistation.model.connectivity.NetworkState;
import com.unity3d.ads.core.domain.WebViewScreenCapture;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t84 extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x = 1;
    public boolean y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t84(v65 v65Var, boolean z, String[] strArr, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = v65Var;
        this.z = z;
        this.B = strArr;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.B;
        boolean z = this.z;
        Object obj3 = this.A;
        switch (b) {
            case 0:
                return new t84(z, (NetworkState) obj3, (w44) obj2, vz0Var);
            default:
                return new t84((v65) obj3, z, (String[]) obj2, vz0Var);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((t84) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((t84) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        o65 o65Var;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.B;
        boolean z = this.z;
        w11 w11Var = w11.x;
        Object obj3 = this.A;
        switch (b) {
            case 0:
                NetworkState networkState = (NetworkState) obj3;
                w44 w44Var = (w44) obj2;
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    if (z && networkState != NetworkState.Hidden) {
                        w44Var.setValue(new vm1(24.0f));
                        m18 m18Var = fq1.y;
                        long W = w65.W(WebViewScreenCapture.CACHE_TTL_MS, jq1.MILLISECONDS);
                        this.y = true;
                        if (x97.v(W, this) == w11Var) {
                            return w11Var;
                        }
                    } else {
                        if (!z && networkState != NetworkState.Hidden) {
                            w44Var.setValue(new vm1(24.0f));
                            return pn6Var;
                        }
                        w44Var.setValue(new vm1(0.0f));
                        return pn6Var;
                    }
                }
                w44Var.setValue(new vm1(0.0f));
                return pn6Var;
            default:
                v65 v65Var = (v65) obj3;
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                o65Var = v65Var.connectionManager;
                if (o65Var != null) {
                    u65 u65Var = new u65(v65Var, z, (String[]) obj2, null);
                    this.y = true;
                    if (o65Var.f.Y(false, u65Var, this) == w11Var) {
                        return w11Var;
                    }
                    return pn6Var;
                }
                a34.s0("connectionManager");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t84(boolean z, NetworkState networkState, w44 w44Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = z;
        this.A = networkState;
        this.B = w44Var;
    }
}
