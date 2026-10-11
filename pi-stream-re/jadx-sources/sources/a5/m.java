package a5;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Parcel;
import android.util.Log;
import androidx.lifecycle.q0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.x;
import com.google.android.gms.common.internal.a0;
import com.google.android.gms.internal.p000authapi.zbb;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public final class m extends zbb {

    /* renamed from: a, reason: collision with root package name */
    public final Context f110a;

    public m(Context context) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        this.f110a = context;
    }

    public final void a() {
        boolean z9;
        boolean z10;
        AppOpsManager appOpsManager;
        int callingUid = Binder.getCallingUid();
        Context context = this.f110a;
        b5.h a10 = j5.b.a(context);
        a10.getClass();
        boolean z11 = true;
        boolean z12 = false;
        try {
            appOpsManager = (AppOpsManager) a10.f1527b.getSystemService("appops");
        } catch (SecurityException unused) {
            z9 = false;
        }
        if (appOpsManager != null) {
            appOpsManager.checkPackage(callingUid, "com.google.android.gms");
            z9 = true;
            if (z9) {
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                    b5.h b10 = b5.h.b(context);
                    b10.getClass();
                    if (packageInfo != null) {
                        if (!b5.h.g(packageInfo, false)) {
                            if (b5.h.g(packageInfo, true)) {
                                Context context2 = b10.f1527b;
                                try {
                                    if (!b5.g.f1523c) {
                                        PackageInfo c6 = j5.b.a(context2).c(64, "com.google.android.gms");
                                        b5.h.b(context2);
                                        if (c6 != null && !b5.h.g(c6, false) && b5.h.g(c6, true)) {
                                            b5.g.f1522b = true;
                                        } else {
                                            b5.g.f1522b = false;
                                        }
                                    }
                                } catch (PackageManager.NameNotFoundException e10) {
                                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                                } finally {
                                    b5.g.f1523c = true;
                                }
                                if (!b5.g.f1522b && "user".equals(Build.TYPE)) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10) {
                                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                }
                            }
                        }
                        z12 = z11;
                    }
                    z11 = false;
                    z12 = z11;
                } catch (PackageManager.NameNotFoundException unused2) {
                    if (Log.isLoggable("UidVerifier", 3)) {
                        Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                    }
                }
            }
            if (z12) {
                return;
            } else {
                throw new SecurityException(a3.g.o("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
            }
        }
        throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        boolean z9;
        BasePendingResult a10;
        boolean z10;
        BasePendingResult a11;
        int i12 = 0;
        Context context = this.f110a;
        int i13 = 1;
        if (i10 != 1) {
            if (i10 != 2) {
                return false;
            }
            a();
            k.a(context).b();
        } else {
            a();
            b a12 = b.a(context);
            GoogleSignInAccount b10 = a12.b();
            GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.B;
            if (b10 != null) {
                googleSignInOptions = a12.c();
            }
            w7.b.s(googleSignInOptions);
            d5.b bVar = new d5.b(context, googleSignInOptions);
            if (b10 != null) {
                o asGoogleApiClient = bVar.asGoogleApiClient();
                Context applicationContext = bVar.getApplicationContext();
                if (bVar.d() == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j.f107a.a("Revoking access", new Object[0]);
                String e10 = b.a(applicationContext).e("refreshToken");
                j.b(applicationContext);
                if (z10) {
                    if (e10 == null) {
                        e5.a aVar = d.f98c;
                        Status status = new Status(4, null);
                        w7.b.i("Status code must not be SUCCESS", !status.d());
                        a11 = new x(status);
                        a11.setResult(status);
                    } else {
                        d dVar = new d(e10);
                        new Thread(dVar).start();
                        a11 = dVar.f100b;
                    }
                } else {
                    a11 = asGoogleApiClient.a(new h(asGoogleApiClient, i13));
                }
                q0 q0Var = new q0();
                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                a11.addStatusListener(new a0(a11, taskCompletionSource, q0Var));
                taskCompletionSource.getTask();
            } else {
                o asGoogleApiClient2 = bVar.asGoogleApiClient();
                Context applicationContext2 = bVar.getApplicationContext();
                if (bVar.d() == 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                j.f107a.a("Signing out", new Object[0]);
                j.b(applicationContext2);
                if (z9) {
                    Status status2 = Status.f2356f;
                    a10 = new u(asGoogleApiClient2);
                    a10.setResult(status2);
                } else {
                    a10 = asGoogleApiClient2.a(new h(asGoogleApiClient2, i12));
                }
                q0 q0Var2 = new q0();
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                a10.addStatusListener(new a0(a10, taskCompletionSource2, q0Var2));
                taskCompletionSource2.getTask();
            }
        }
        return true;
    }
}
