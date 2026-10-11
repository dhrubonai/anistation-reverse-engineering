package s4;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.internal.auth.zzam;
import com.google.android.gms.internal.auth.zzbe;
import com.google.android.gms.internal.p000authapi.zbo;
import com.google.android.gms.internal.p001authapiphone.zzw;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends com.google.android.gms.common.api.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9899a;

    public /* synthetic */ g(int i10) {
        this.f9899a = i10;
    }

    @Override // com.google.android.gms.common.api.a
    public final com.google.android.gms.common.api.g buildClient(Context context, Looper looper, h hVar, Object obj, m mVar, n nVar) {
        switch (this.f9899a) {
            case 0:
                return new zzam(context, looper, hVar, mVar, nVar);
            case 1:
            case 4:
            case 5:
            default:
                return super.buildClient(context, looper, hVar, obj, mVar, nVar);
            case 2:
                return new zbo(context, looper, hVar, (t4.a) obj, mVar, nVar);
            case 3:
                return new a5.f(context, looper, hVar, (GoogleSignInOptions) obj, mVar, nVar);
            case 6:
                hVar.getClass();
                Integer num = hVar.f2528h;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", hVar.f2521a);
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
                return new r5.a(context, looper, hVar, bundle, mVar, nVar);
            case zzaja.zze.zzg /* 7 */:
                a3.g.z(obj);
                throw null;
        }
    }

    @Override // com.google.android.gms.common.api.f
    public final List getImpliedScopes(Object obj) {
        switch (this.f9899a) {
            case 3:
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                if (googleSignInOptions == null) {
                    return Collections.emptyList();
                }
                return new ArrayList(googleSignInOptions.f2333b);
            default:
                return super.getImpliedScopes(obj);
        }
    }

    @Override // com.google.android.gms.common.api.a
    public final /* synthetic */ com.google.android.gms.common.api.g buildClient(Context context, Looper looper, h hVar, Object obj, com.google.android.gms.common.api.internal.g gVar, p pVar) {
        switch (this.f9899a) {
            case 1:
                return new zzw(context, looper, hVar, gVar, pVar);
            case 2:
            case 3:
            default:
                return super.buildClient(context, looper, hVar, obj, gVar, pVar);
            case 4:
                return new zzbe(context, looper, hVar, (t4.d) obj, gVar, pVar);
            case 5:
                return new d5.c(context, looper, hVar, (v) obj, gVar, pVar);
        }
    }
}
