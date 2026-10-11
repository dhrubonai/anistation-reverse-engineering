package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qa7 extends te4 {
    public final /* synthetic */ byte s;

    public /* synthetic */ qa7(byte b) {
        this.s = b;
    }

    @Override // defpackage.te4
    public nh2 t(Context context, Looper looper, tp tpVar, Object obj, sh2 sh2Var, th2 th2Var) {
        switch (this.s) {
            case 0:
                Object obj2 = tpVar.C;
                Integer num = (Integer) tpVar.D;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new mo5(context, looper, tpVar, bundle, sh2Var, th2Var);
            case 1:
                throw h11.f(obj);
            case 2:
            default:
                return super.t(context, looper, tpVar, obj, sh2Var, th2Var);
            case 3:
                ih0 ih0Var = (ih0) obj;
                a34.y(ih0Var, "Setting the API options is required.");
                return new t98(context, looper, tpVar, ih0Var.b, ih0Var.d, ih0Var.e, (wa7) sh2Var, (wa7) th2Var);
            case 4:
                return new nh2(context, looper, 161, tpVar, sh2Var, th2Var);
            case 5:
                ih0 ih0Var2 = (ih0) obj;
                a34.y(ih0Var2, "Setting the API options is required.");
                return new y88(context, looper, tpVar, ih0Var2.b, ih0Var2.c, ih0Var2.d, (wa7) sh2Var, (wa7) th2Var);
            case 6:
                return new ur7(context, looper, tpVar, (wa7) sh2Var, (wa7) th2Var);
            case 7:
                return new nh2(context, looper, 51, tpVar, sh2Var, th2Var);
        }
    }

    @Override // defpackage.te4
    public /* synthetic */ nh2 u(Context context, Looper looper, tp tpVar, Object obj, wa7 wa7Var, wa7 wa7Var2) {
        switch (this.s) {
            case 2:
                return new xb7(context, looper, tpVar, (y76) obj, wa7Var, wa7Var2);
            default:
                return super.u(context, looper, tpVar, obj, wa7Var, wa7Var2);
        }
    }
}
