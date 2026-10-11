package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.widget.a0;
import androidx.fragment.app.b0;
import b1.b;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzacg;
import com.google.android.gms.internal.p002firebaseauthapi.zzaci;
import com.google.android.gms.internal.p002firebaseauthapi.zzacl;
import com.google.android.gms.internal.p002firebaseauthapi.zzaec;
import com.google.android.gms.internal.p002firebaseauthapi.zzags;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.AppCheckTokenResult;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.inject.Provider;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import m.a;
import org.json.JSONException;
import org.json.JSONObject;
import x.j;

@KeepName
/* loaded from: classes.dex */
public class GenericIdpActivity extends b0 implements zzaci {
    private static long zzb;
    private static final zzce zzc = zzce.zzc();
    private boolean zzd = false;

    private final void zzb() {
        zzb = 0L;
        this.zzd = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!zza(intent)) {
            zzbl.zza(this, zzao.zza("WEB_CONTEXT_CANCELED"));
        } else {
            zzc.zza(this);
        }
        finish();
    }

    @Override // androidx.fragment.app.b0, androidx.activity.j, w.n, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            zzb();
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - zzb < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        zzb = currentTimeMillis;
        if (bundle != null) {
            this.zzd = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // androidx.activity.j, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.b0, android.app.Activity
    public void onResume() {
        super.onResume();
        if ("android.intent.action.VIEW".equals(getIntent().getAction())) {
            Intent intent = getIntent();
            if (intent.hasExtra("firebaseError")) {
                zza(zzcf.zza(intent.getStringExtra("firebaseError")));
                return;
            }
            if (intent.hasExtra("link") && intent.hasExtra("eventId")) {
                String stringExtra = intent.getStringExtra("link");
                String stringExtra2 = intent.getStringExtra("eventId");
                String packageName = getPackageName();
                boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
                zzr zza = zzo.zza().zza(this, packageName, stringExtra2);
                if (zza == null) {
                    zzb();
                }
                if (booleanExtra) {
                    stringExtra = zzq.zza(getApplicationContext(), FirebaseApp.getInstance(zza.zza()).getPersistenceKey()).zza(stringExtra);
                }
                zzags zzagsVar = new zzags(zza, stringExtra);
                String zze = zza.zze();
                String zzb2 = zza.zzb();
                zzagsVar.zzb(zze);
                if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(zzb2) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(zzb2) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(zzb2)) {
                    Log.e("GenericIdpActivity", "unsupported operation: " + zzb2);
                    zzb();
                    return;
                }
                zzb = 0L;
                this.zzd = false;
                Intent intent2 = new Intent();
                Parcel obtain = Parcel.obtain();
                zzagsVar.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", marshall);
                intent2.putExtra("com.google.firebase.auth.internal.OPERATION", zzb2);
                intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
                if (!zza(intent2)) {
                    zzbl.zza(getApplicationContext(), zzagsVar, zzb2, zze);
                } else {
                    zzc.zza(this);
                }
                finish();
                return;
            }
            zzb();
            return;
        }
        if (!this.zzd) {
            String packageName2 = getPackageName();
            try {
                String lowerCase = d.h(c.x(this, packageName2)).toLowerCase(Locale.US);
                FirebaseApp firebaseApp = FirebaseApp.getInstance(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(firebaseApp);
                if (!zzaec.zza(firebaseApp)) {
                    new zzacg(packageName2, lowerCase, getIntent(), firebaseApp, this).executeOnExecutor(firebaseAuth.zze(), new Void[0]);
                } else {
                    zza(zza(Uri.parse(zzaec.zza(firebaseApp.getOptions().getApiKey())).buildUpon(), getIntent(), packageName2, lowerCase).build(), packageName2, firebaseAuth.zzc());
                }
            } catch (PackageManager.NameNotFoundException e10) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName2 + " " + String.valueOf(e10));
                zzacl.zzb(this, packageName2);
            }
            this.zzd = true;
            return;
        }
        zzb();
    }

    @Override // androidx.activity.j, w.n, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.zzd);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaci
    public final Context zza() {
        return getApplicationContext();
    }

    private final Uri.Builder zza(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        String zza = zza(intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS"));
        String uuid = UUID.randomUUID().toString();
        String zza2 = zzacl.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str3 = join;
        zzo.zza().zza(getApplicationContext(), str, uuid, zza2, action, stringExtra2, stringExtra3, stringExtra4);
        String zza3 = zzq.zza(getApplicationContext(), FirebaseApp.getInstance(stringExtra4).getPersistenceKey()).zza();
        if (TextUtils.isEmpty(zza3)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            zza(zzao.zza("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (zza2 == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", zza2).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", zza3);
        if (!TextUtils.isEmpty(str3)) {
            builder.appendQueryParameter("scopes", str3);
        }
        if (!TextUtils.isEmpty(zza)) {
            builder.appendQueryParameter("customParameters", zza);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaci
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return zza(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    public static /* synthetic */ Uri zza(Uri uri, Task task) {
        Uri.Builder buildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            AppCheckTokenResult appCheckTokenResult = (AppCheckTokenResult) task.getResult();
            if (appCheckTokenResult.getError() != null) {
                Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: ".concat(String.valueOf(appCheckTokenResult.getError())));
            }
            buildUpon.fragment("fac=" + appCheckTokenResult.getToken());
        } else {
            Log.e("GenericIdpActivity", "Unexpected error getting App Check token: " + task.getException().getMessage());
        }
        return buildUpon.build();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaci
    public final String zza(String str) {
        return zzaec.zzb(str);
    }

    private static String zza(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(str, string);
                }
            }
        } catch (JSONException unused) {
            Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
        }
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaci
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) com.google.android.gms.internal.p002firebaseauthapi.zzb.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    private final void zza(Status status) {
        zzb = 0L;
        this.zzd = false;
        Intent intent = new Intent();
        zzcf.zza(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (!zza(intent)) {
            zzbl.zza(getApplicationContext(), status);
        } else {
            zzc.zza(this);
        }
        finish();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaci
    public final void zza(String str, Status status) {
        if (status == null) {
            zzb();
        } else {
            zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaci
    public final void zza(final Uri uri, final String str, Provider<InteropAppCheckTokenProvider> provider) {
        Task forResult;
        InteropAppCheckTokenProvider interopAppCheckTokenProvider = provider.get();
        if (interopAppCheckTokenProvider != null) {
            forResult = interopAppCheckTokenProvider.getToken(false).continueWith(new Continuation() { // from class: com.google.firebase.auth.internal.zzbf
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return GenericIdpActivity.zza(uri, task);
                }
            });
        } else {
            forResult = Tasks.forResult(uri);
        }
        forResult.addOnCompleteListener(new OnCompleteListener() { // from class: com.google.firebase.auth.internal.zzbg
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                boolean z9;
                GenericIdpActivity genericIdpActivity = GenericIdpActivity.this;
                String str2 = str;
                boolean z10 = false;
                if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                        z10 = true;
                    }
                    if (z10) {
                        a0 a10 = new a().a();
                        Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
                        ((Intent) a10.f403b).setData((Uri) task.getResult());
                        j.startActivity(genericIdpActivity, (Intent) a10.f403b, (Bundle) a10.f404c);
                        return;
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
                    intent.putExtra("com.android.browser.application_id", str2);
                    Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
                    intent.addFlags(1073741824);
                    intent.addFlags(268435456);
                    genericIdpActivity.startActivity(intent);
                    return;
                }
                Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
                zzacl.zzb(genericIdpActivity, str2);
            }
        });
    }

    private final boolean zza(Intent intent) {
        return b.a(this).b(intent);
    }
}
