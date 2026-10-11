package r5;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.internal.r0;
import com.google.android.gms.common.api.internal.t0;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.k;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes.dex */
public final class a extends k implements q5.c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9413a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.common.internal.h f9414b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f9415c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f9416d;

    public a(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, Bundle bundle, m mVar, n nVar) {
        super(context, looper, 44, hVar, mVar, nVar);
        this.f9413a = true;
        this.f9414b = hVar;
        this.f9415c = bundle;
        this.f9416d = hVar.f2528h;
    }

    @Override // q5.c
    public final void a(d dVar) {
        GoogleSignInAccount googleSignInAccount;
        if (dVar != null) {
            try {
                Account account = this.f9414b.f2521a;
                if (account == null) {
                    account = new Account(com.google.android.gms.common.internal.f.DEFAULT_ACCOUNT, "com.google");
                }
                if (com.google.android.gms.common.internal.f.DEFAULT_ACCOUNT.equals(account.name)) {
                    googleSignInAccount = a5.b.a(getContext()).b();
                } else {
                    googleSignInAccount = null;
                }
                Integer num = this.f9416d;
                w7.b.s(num);
                b0 b0Var = new b0(2, account, num.intValue(), googleSignInAccount);
                e eVar = (e) getService();
                g gVar = new g(1, b0Var);
                Parcel zaa = eVar.zaa();
                zac.zac(zaa, gVar);
                zac.zad(zaa, dVar);
                eVar.zac(12, zaa);
                return;
            } catch (RemoteException e10) {
                Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                try {
                    r0 r0Var = (r0) dVar;
                    r0Var.f2458b.post(new t0(3, r0Var, new h(1, new b5.a(8, null), null)));
                    return;
                } catch (RemoteException unused) {
                    Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
                    return;
                }
            }
        }
        throw new NullPointerException("Expecting a valid ISignInCallbacks");
    }

    @Override // q5.c
    public final void b() {
        connect(new k3.d(this, 16));
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof e) {
            return (e) queryLocalInterface;
        }
        return new e(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f
    public final Bundle getGetServiceRequestExtraArgs() {
        com.google.android.gms.common.internal.h hVar = this.f9414b;
        boolean equals = getContext().getPackageName().equals(hVar.f2525e);
        Bundle bundle = this.f9415c;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", hVar.f2525e);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        return this.f9413a;
    }
}
