package com.google.android.gms.auth.api.signin.internal;

import a5.e;
import a5.k;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.b0;
import androidx.lifecycle.u;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import i4.v;
import java.lang.reflect.Modifier;
import java.util.Set;
import k3.d;
import n.l;
import z0.a;
import z0.b;
import z0.c;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends b0 {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f2346f = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2347a = false;

    /* renamed from: b, reason: collision with root package name */
    public SignInConfiguration f2348b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2349c;

    /* renamed from: d, reason: collision with root package name */
    public int f2350d;

    /* renamed from: e, reason: collision with root package name */
    public Intent f2351e;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void k() {
        a supportLoaderManager = getSupportLoaderManager();
        d dVar = new d(this);
        z0.d dVar2 = (z0.d) supportLoaderManager;
        c cVar = dVar2.f11887b;
        if (!cVar.f11885b) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                l lVar = cVar.f11884a;
                b bVar = (b) lVar.c(0, null);
                u uVar = dVar2.f11886a;
                if (bVar == null) {
                    try {
                        cVar.f11885b = true;
                        SignInHubActivity signInHubActivity = (SignInHubActivity) dVar.f6453b;
                        Set set = o.f2490a;
                        synchronized (set) {
                        }
                        e eVar = new e(signInHubActivity, set);
                        if (e.class.isMemberClass() && !Modifier.isStatic(e.class.getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + eVar);
                        }
                        b bVar2 = new b(eVar);
                        lVar.d(0, bVar2);
                        cVar.f11885b = false;
                        v vVar = new v(bVar2.f11880n, dVar);
                        bVar2.e(uVar, vVar);
                        v vVar2 = bVar2.f11881p;
                        if (vVar2 != null) {
                            bVar2.i(vVar2);
                        }
                        bVar2.o = uVar;
                        bVar2.f11881p = vVar;
                    } catch (Throwable th) {
                        cVar.f11885b = false;
                        throw th;
                    }
                } else {
                    v vVar3 = new v(bVar.f11880n, dVar);
                    bVar.e(uVar, vVar3);
                    v vVar4 = bVar.f11881p;
                    if (vVar4 != null) {
                        bVar.i(vVar4);
                    }
                    bVar.o = uVar;
                    bVar.f11881p = vVar3;
                }
                f2346f = false;
                return;
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public final void l(int i10) {
        Status status = new Status(i10, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f2346f = false;
    }

    @Override // androidx.fragment.app.b0, androidx.activity.j, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f2347a) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f2342b) != null) {
                k a10 = k.a(this);
                GoogleSignInOptions googleSignInOptions = this.f2348b.f2345b;
                googleSignInAccount.getClass();
                synchronized (a10) {
                    a10.f109a.d(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f2349c = true;
                this.f2350d = i11;
                this.f2351e = intent;
                k();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                l(intExtra);
                return;
            }
        }
        l(8);
    }

    @Override // androidx.fragment.app.b0, androidx.activity.j, w.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            l(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f2348b = signInConfiguration;
        if (bundle == null) {
            if (f2346f) {
                setResult(0);
                l(12502);
                return;
            }
            f2346f = true;
            Intent intent2 = new Intent(action);
            if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                intent2.setPackage("com.google.android.gms");
            } else {
                intent2.setPackage(getPackageName());
            }
            intent2.putExtra("config", this.f2348b);
            try {
                startActivityForResult(intent2, 40962);
                return;
            } catch (ActivityNotFoundException unused) {
                this.f2347a = true;
                Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
                l(17);
                return;
            }
        }
        boolean z9 = bundle.getBoolean("signingInGoogleApiClients");
        this.f2349c = z9;
        if (z9) {
            this.f2350d = bundle.getInt("signInResultCode");
            Intent intent3 = (Intent) bundle.getParcelable("signInResultData");
            intent3.getClass();
            this.f2351e = intent3;
            k();
        }
    }

    @Override // androidx.fragment.app.b0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f2346f = false;
    }

    @Override // androidx.activity.j, w.n, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f2349c);
        if (this.f2349c) {
            bundle.putInt("signInResultCode", this.f2350d);
            bundle.putParcelable("signInResultData", this.f2351e);
        }
    }
}
