package a5;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.n;
import com.google.android.gms.internal.p000authapi.zbbj;
import java.util.Arrays;
import java.util.Set;
import l1.m0;

/* loaded from: classes.dex */
public final class f extends com.google.android.gms.common.internal.k {

    /* renamed from: a, reason: collision with root package name */
    public final GoogleSignInOptions f103a;

    public f(Context context, Looper looper, com.google.android.gms.common.internal.h hVar, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.m mVar, n nVar) {
        super(context, looper, 91, hVar, mVar, nVar);
        m0 m0Var;
        if (googleSignInOptions != null) {
            m0Var = new m0(googleSignInOptions);
        } else {
            m0Var = new m0();
        }
        m0Var.f6697i = zbbj.zba();
        Set<Scope> set = hVar.f2523c;
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                Set set2 = (Set) m0Var.f6692d;
                set2.add(scope);
                set2.addAll(Arrays.asList(new Scope[0]));
            }
        }
        this.f103a = m0Var.a();
    }

    @Override // com.google.android.gms.common.internal.f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        if (queryLocalInterface instanceof l) {
            return (l) queryLocalInterface;
        }
        return new l(iBinder);
    }

    @Override // com.google.android.gms.common.internal.f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.f
    public final Intent getSignInIntent() {
        return j.a(getContext(), this.f103a);
    }

    @Override // com.google.android.gms.common.internal.f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.f
    public final boolean providesSignIn() {
        return true;
    }
}
