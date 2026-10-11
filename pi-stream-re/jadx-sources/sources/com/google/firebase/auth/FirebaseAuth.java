package com.google.firebase.auth;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.internal.p002firebaseauthapi.zzack;
import com.google.android.gms.internal.p002firebaseauthapi.zzacu;
import com.google.android.gms.internal.p002firebaseauthapi.zzads;
import com.google.android.gms.internal.p002firebaseauthapi.zzaec;
import com.google.android.gms.internal.p002firebaseauthapi.zzafi;
import com.google.android.gms.internal.p002firebaseauthapi.zzafj;
import com.google.android.gms.internal.p002firebaseauthapi.zzafm;
import com.google.android.gms.internal.p002firebaseauthapi.zzafz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseError;
import com.google.firebase.FirebaseException;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.auth.internal.zzbi;
import com.google.firebase.auth.internal.zzbl;
import com.google.firebase.auth.internal.zzbx;
import com.google.firebase.auth.internal.zzby;
import com.google.firebase.auth.internal.zzcb;
import com.google.firebase.auth.internal.zzcc;
import com.google.firebase.auth.internal.zzce;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.InternalTokenResult;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import w7.b;

/* loaded from: classes.dex */
public class FirebaseAuth implements InternalAuthProvider {
    private final FirebaseApp zza;
    private final Executor zzaa;
    private String zzab;
    private final List<IdTokenListener> zzb;
    private final List<com.google.firebase.auth.internal.IdTokenListener> zzc;
    private final List<AuthStateListener> zzd;
    private final zzaag zze;
    private FirebaseUser zzf;
    private final com.google.firebase.auth.internal.zzac zzg;
    private final Object zzh;
    private String zzi;
    private final Object zzj;
    private String zzk;
    private zzbx zzl;
    private final RecaptchaAction zzm;
    private final RecaptchaAction zzn;
    private final RecaptchaAction zzo;
    private final RecaptchaAction zzp;
    private final RecaptchaAction zzq;
    private final RecaptchaAction zzr;
    private final zzby zzs;
    private final zzce zzt;
    private final com.google.firebase.auth.internal.zzb zzu;
    private final Provider<InteropAppCheckTokenProvider> zzv;
    private final Provider<HeartBeatController> zzw;
    private zzcb zzx;
    private final Executor zzy;
    private final Executor zzz;

    /* loaded from: classes.dex */
    public interface AuthStateListener {
        void onAuthStateChanged(FirebaseAuth firebaseAuth);
    }

    /* loaded from: classes.dex */
    public interface IdTokenListener {
        void onIdTokenChanged(FirebaseAuth firebaseAuth);
    }

    /* loaded from: classes.dex */
    public class zzb implements com.google.firebase.auth.internal.zzl {
        public zzb() {
        }

        @Override // com.google.firebase.auth.internal.zzl
        public final void zza(zzafm zzafmVar, FirebaseUser firebaseUser) {
            b.s(zzafmVar);
            b.s(firebaseUser);
            firebaseUser.zza(zzafmVar);
            FirebaseAuth.this.zza(firebaseUser, zzafmVar, true);
        }
    }

    /* loaded from: classes.dex */
    public class zzc extends zzb implements com.google.firebase.auth.internal.zzau {
        public zzc(FirebaseAuth firebaseAuth) {
            super();
        }

        @Override // com.google.firebase.auth.internal.zzau
        public final void zza(Status status) {
        }
    }

    public FirebaseAuth(FirebaseApp firebaseApp, Provider<InteropAppCheckTokenProvider> provider, Provider<HeartBeatController> provider2, @Background Executor executor, @Blocking Executor executor2, @Lightweight Executor executor3, @Lightweight ScheduledExecutorService scheduledExecutorService, @UiThread Executor executor4) {
        this(firebaseApp, new zzaag(firebaseApp, executor2, scheduledExecutorService), new zzby(firebaseApp.getApplicationContext(), firebaseApp.getPersistenceKey()), zzce.zzc(), com.google.firebase.auth.internal.zzb.zza(), provider, provider2, executor, executor2, executor3, executor4);
    }

    @Keep
    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) FirebaseApp.getInstance().get(FirebaseAuth.class);
    }

    private final synchronized zzcb zzj() {
        return zzj(this);
    }

    public void addAuthStateListener(AuthStateListener authStateListener) {
        this.zzd.add(authStateListener);
        this.zzaa.execute(new zzt(this, authStateListener));
    }

    public void addIdTokenListener(IdTokenListener idTokenListener) {
        this.zzb.add(idTokenListener);
        this.zzaa.execute(new zzk(this, idTokenListener));
    }

    public Task<Void> applyActionCode(String str) {
        b.o(str);
        return this.zze.zza(this.zza, str, this.zzk);
    }

    public Task<ActionCodeResult> checkActionCode(String str) {
        b.o(str);
        return this.zze.zzb(this.zza, str, this.zzk);
    }

    public Task<Void> confirmPasswordReset(String str, String str2) {
        b.o(str);
        b.o(str2);
        return this.zze.zza(this.zza, str, str2, this.zzk);
    }

    public Task<AuthResult> createUserWithEmailAndPassword(String str, String str2) {
        b.o(str);
        b.o(str2);
        return new zzq(this, str, str2).zza(this, this.zzk, this.zzo, "EMAIL_PASSWORD_PROVIDER");
    }

    @Deprecated
    public Task<SignInMethodQueryResult> fetchSignInMethodsForEmail(String str) {
        b.o(str);
        return this.zze.zzc(this.zza, str, this.zzk);
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider, com.google.firebase.internal.InternalTokenProvider
    public Task<GetTokenResult> getAccessToken(boolean z9) {
        return zza(this.zzf, z9);
    }

    public FirebaseApp getApp() {
        return this.zza;
    }

    public FirebaseUser getCurrentUser() {
        return this.zzf;
    }

    public String getCustomAuthDomain() {
        return this.zzab;
    }

    public FirebaseAuthSettings getFirebaseAuthSettings() {
        return this.zzg;
    }

    public String getLanguageCode() {
        String str;
        synchronized (this.zzh) {
            str = this.zzi;
        }
        return str;
    }

    public Task<AuthResult> getPendingAuthResult() {
        return this.zzt.zza();
    }

    public String getTenantId() {
        String str;
        synchronized (this.zzj) {
            str = this.zzk;
        }
        return str;
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider, com.google.firebase.internal.InternalTokenProvider
    public String getUid() {
        FirebaseUser firebaseUser = this.zzf;
        if (firebaseUser == null) {
            return null;
        }
        return firebaseUser.getUid();
    }

    public Task<Void> initializeRecaptchaConfig() {
        if (this.zzl == null) {
            this.zzl = new zzbx(this.zza, this);
        }
        return this.zzl.zza(this.zzk, Boolean.FALSE).continueWithTask(new zzz(this));
    }

    public boolean isSignInWithEmailLink(String str) {
        return EmailAuthCredential.zza(str);
    }

    public void removeAuthStateListener(AuthStateListener authStateListener) {
        this.zzd.remove(authStateListener);
    }

    public void removeIdTokenListener(IdTokenListener idTokenListener) {
        this.zzb.remove(idTokenListener);
    }

    public Task<Void> revokeAccessToken(String str) {
        b.o(str);
        FirebaseUser currentUser = getCurrentUser();
        b.s(currentUser);
        return currentUser.getIdToken(false).continueWithTask(new zzv(this, str));
    }

    public Task<Void> sendPasswordResetEmail(String str) {
        b.o(str);
        return sendPasswordResetEmail(str, null);
    }

    public Task<Void> sendSignInLinkToEmail(String str, ActionCodeSettings actionCodeSettings) {
        b.o(str);
        b.s(actionCodeSettings);
        if (actionCodeSettings.canHandleCodeInApp()) {
            String str2 = this.zzi;
            if (str2 != null) {
                actionCodeSettings.zza(str2);
            }
            return new zzs(this, str, actionCodeSettings).zza(this, this.zzk, this.zzm, "EMAIL_PASSWORD_PROVIDER");
        }
        throw new IllegalArgumentException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
    }

    public void setCustomAuthDomain(String str) {
        String concat;
        b.o(str);
        if (str.startsWith("chrome-extension://")) {
            this.zzab = str;
            return;
        }
        if (str.contains("://")) {
            concat = str;
        } else {
            concat = "http://".concat(str);
        }
        try {
            String host = new URI(concat).getHost();
            b.s(host);
            this.zzab = host;
        } catch (URISyntaxException e10) {
            if (Log.isLoggable("FirebaseAuth", 4)) {
                Log.i("FirebaseAuth", "Error parsing URL: '" + str + "', " + e10.getMessage());
            }
            this.zzab = str;
        }
    }

    public Task<Void> setFirebaseUIVersion(String str) {
        return this.zze.zza(str);
    }

    public void setLanguageCode(String str) {
        b.o(str);
        synchronized (this.zzh) {
            this.zzi = str;
        }
    }

    public void setTenantId(String str) {
        b.o(str);
        synchronized (this.zzj) {
            this.zzk = str;
        }
    }

    public Task<AuthResult> signInAnonymously() {
        FirebaseUser firebaseUser = this.zzf;
        if (firebaseUser != null && firebaseUser.isAnonymous()) {
            com.google.firebase.auth.internal.zzaf zzafVar = (com.google.firebase.auth.internal.zzaf) this.zzf;
            zzafVar.zza(false);
            return Tasks.forResult(new com.google.firebase.auth.internal.zzz(zzafVar));
        }
        return this.zze.zza(this.zza, new zzb(), this.zzk);
    }

    public Task<AuthResult> signInWithCredential(AuthCredential authCredential) {
        b.s(authCredential);
        AuthCredential zza2 = authCredential.zza();
        if (zza2 instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) zza2;
            if (!emailAuthCredential.zzf()) {
                String zzc2 = emailAuthCredential.zzc();
                String zzd = emailAuthCredential.zzd();
                b.s(zzd);
                return zza(zzc2, zzd, this.zzk, (FirebaseUser) null, false);
            }
            String zze = emailAuthCredential.zze();
            b.o(zze);
            if (zzb(zze)) {
                return Tasks.forException(zzach.zza(new Status(17072, null)));
            }
            return zza(emailAuthCredential, (FirebaseUser) null, false);
        }
        if (zza2 instanceof PhoneAuthCredential) {
            return this.zze.zza(this.zza, (PhoneAuthCredential) zza2, this.zzk, (com.google.firebase.auth.internal.zzl) new zzb());
        }
        return this.zze.zza(this.zza, zza2, this.zzk, new zzb());
    }

    public Task<AuthResult> signInWithCustomToken(String str) {
        b.o(str);
        return this.zze.zza(this.zza, str, this.zzk, new zzb());
    }

    public Task<AuthResult> signInWithEmailAndPassword(String str, String str2) {
        b.o(str);
        b.o(str2);
        return zza(str, str2, this.zzk, (FirebaseUser) null, false);
    }

    public Task<AuthResult> signInWithEmailLink(String str, String str2) {
        return signInWithCredential(EmailAuthProvider.getCredentialWithLink(str, str2));
    }

    public void signOut() {
        zzh();
        zzcb zzcbVar = this.zzx;
        if (zzcbVar != null) {
            zzcbVar.zza();
        }
    }

    public Task<AuthResult> startActivityForSignInWithProvider(Activity activity, FederatedAuthProvider federatedAuthProvider) {
        b.s(federatedAuthProvider);
        b.s(activity);
        TaskCompletionSource<AuthResult> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.zzt.zza(activity, taskCompletionSource, this)) {
            return Tasks.forException(zzach.zza(new Status(17057, null)));
        }
        zzbl.zza(activity.getApplicationContext(), this);
        federatedAuthProvider.zzc(activity);
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zzc] */
    public Task<Void> updateCurrentUser(FirebaseUser firebaseUser) {
        String str;
        if (firebaseUser != null) {
            String tenantId = firebaseUser.getTenantId();
            if ((tenantId != null && !tenantId.equals(this.zzk)) || ((str = this.zzk) != null && !str.equals(tenantId))) {
                return Tasks.forException(zzach.zza(new Status(17072, null)));
            }
            String apiKey = firebaseUser.zza().getOptions().getApiKey();
            String apiKey2 = this.zza.getOptions().getApiKey();
            if (firebaseUser.zzc().zzg() && apiKey2.equals(apiKey)) {
                zza(com.google.firebase.auth.internal.zzaf.zza(this.zza, firebaseUser), firebaseUser.zzc(), true);
                return Tasks.forResult(null);
            }
            return zza(firebaseUser, (zzcc) new zzc(this));
        }
        throw new IllegalArgumentException("Cannot update current user with null user!");
    }

    public void useAppLanguage() {
        synchronized (this.zzh) {
            this.zzi = zzacu.zza();
        }
    }

    public void useEmulator(String str, int i10) {
        boolean z9;
        b.o(str);
        if (i10 >= 0 && i10 <= 65535) {
            z9 = true;
        } else {
            z9 = false;
        }
        b.i("Port number must be in the range 0-65535", z9);
        zzaec.zza(this.zza, str, i10);
    }

    public Task<String> verifyPasswordResetCode(String str) {
        b.o(str);
        return this.zze.zzd(this.zza, str, this.zzk);
    }

    /* loaded from: classes.dex */
    public class zza implements com.google.firebase.auth.internal.zzau, com.google.firebase.auth.internal.zzl {
        public zza() {
        }

        @Override // com.google.firebase.auth.internal.zzau
        public final void zza(Status status) {
            int i10 = status.f2361b;
            if (i10 == 17011 || i10 == 17021 || i10 == 17005 || i10 == 17091) {
                FirebaseAuth.this.signOut();
            }
        }

        @Override // com.google.firebase.auth.internal.zzl
        public final void zza(zzafm zzafmVar, FirebaseUser firebaseUser) {
            b.s(zzafmVar);
            b.s(firebaseUser);
            firebaseUser.zza(zzafmVar);
            FirebaseAuth.this.zza(firebaseUser, zzafmVar, true, true);
        }
    }

    private static zzcb zzj(FirebaseAuth firebaseAuth) {
        if (firebaseAuth.zzx == null) {
            FirebaseApp firebaseApp = firebaseAuth.zza;
            b.s(firebaseApp);
            firebaseAuth.zzx = new zzcb(firebaseApp);
        }
        return firebaseAuth.zzx;
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public void removeIdTokenListener(com.google.firebase.auth.internal.IdTokenListener idTokenListener) {
        b.s(idTokenListener);
        this.zzc.remove(idTokenListener);
        zzj().zza(this.zzc.size());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zza] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zza] */
    public final Task<Void> zzb(FirebaseUser firebaseUser, AuthCredential authCredential) {
        b.s(firebaseUser);
        b.s(authCredential);
        AuthCredential zza2 = authCredential.zza();
        if (zza2 instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) zza2;
            if ("password".equals(emailAuthCredential.getSignInMethod())) {
                return zza(firebaseUser, emailAuthCredential, false);
            }
            String zze = emailAuthCredential.zze();
            b.o(zze);
            if (zzb(zze)) {
                return Tasks.forException(zzach.zza(new Status(17072, null)));
            }
            return zza(firebaseUser, emailAuthCredential, true);
        }
        if (zza2 instanceof PhoneAuthCredential) {
            return this.zze.zza(this.zza, firebaseUser, (PhoneAuthCredential) zza2, this.zzk, (zzcc) new zza());
        }
        return this.zze.zzb(this.zza, firebaseUser, zza2, firebaseUser.getTenantId(), (zzcc) new zza());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zza] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zza] */
    public final Task<AuthResult> zzc(FirebaseUser firebaseUser, AuthCredential authCredential) {
        b.s(firebaseUser);
        b.s(authCredential);
        AuthCredential zza2 = authCredential.zza();
        if (zza2 instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) zza2;
            if ("password".equals(emailAuthCredential.getSignInMethod())) {
                String zzc2 = emailAuthCredential.zzc();
                String zzd = emailAuthCredential.zzd();
                b.o(zzd);
                return zza(zzc2, zzd, firebaseUser.getTenantId(), firebaseUser, true);
            }
            String zze = emailAuthCredential.zze();
            b.o(zze);
            if (zzb(zze)) {
                return Tasks.forException(zzach.zza(new Status(17072, null)));
            }
            return zza(emailAuthCredential, firebaseUser, true);
        }
        if (zza2 instanceof PhoneAuthCredential) {
            return this.zze.zzb(this.zza, firebaseUser, (PhoneAuthCredential) zza2, this.zzk, (zzcc) new zza());
        }
        return this.zze.zzc(this.zza, firebaseUser, zza2, firebaseUser.getTenantId(), new zza());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zza] */
    public final Task<Void> zzd(FirebaseUser firebaseUser, String str) {
        b.s(firebaseUser);
        b.o(str);
        return this.zze.zzd(this.zza, firebaseUser, str, new zza());
    }

    public final Executor zze() {
        return this.zzy;
    }

    public final Executor zzf() {
        return this.zzz;
    }

    public final Executor zzg() {
        return this.zzaa;
    }

    public final void zzh() {
        b.s(this.zzs);
        FirebaseUser firebaseUser = this.zzf;
        if (firebaseUser != null) {
            this.zzs.zza(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", firebaseUser.getUid()));
            this.zzf = null;
        }
        this.zzs.zza("com.google.firebase.auth.FIREBASE_USER");
        zzb(this, (FirebaseUser) null);
        zza(this, (FirebaseUser) null);
    }

    public final boolean zzi() {
        return zzack.zza(getApp().getApplicationContext());
    }

    @Keep
    public static FirebaseAuth getInstance(FirebaseApp firebaseApp) {
        return (FirebaseAuth) firebaseApp.get(FirebaseAuth.class);
    }

    @Override // com.google.firebase.auth.internal.InternalAuthProvider
    public void addIdTokenListener(com.google.firebase.auth.internal.IdTokenListener idTokenListener) {
        b.s(idTokenListener);
        this.zzc.add(idTokenListener);
        zzj().zza(this.zzc.size());
    }

    public Task<Void> sendPasswordResetEmail(String str, ActionCodeSettings actionCodeSettings) {
        b.o(str);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.zzb();
        }
        String str2 = this.zzi;
        if (str2 != null) {
            actionCodeSettings.zza(str2);
        }
        actionCodeSettings.zza(1);
        return new zzp(this, str, actionCodeSettings).zza(this, this.zzk, this.zzm, "EMAIL_PASSWORD_PROVIDER");
    }

    public final Task<Void> zza(FirebaseUser firebaseUser) {
        b.s(firebaseUser);
        return this.zze.zza(firebaseUser, new zzu(this, firebaseUser));
    }

    public final Task<Void> zza(FirebaseUser firebaseUser, MultiFactorAssertion multiFactorAssertion, String str) {
        b.s(firebaseUser);
        b.s(multiFactorAssertion);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            return this.zze.zza(this.zza, (PhoneMultiFactorAssertion) multiFactorAssertion, firebaseUser, str, new zzb());
        }
        if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            return this.zze.zza(this.zza, (TotpMultiFactorAssertion) multiFactorAssertion, firebaseUser, str, this.zzk, new zzb());
        }
        return Tasks.forException(zzach.zza(new Status(FirebaseError.ERROR_INTERNAL_ERROR, null)));
    }

    public final Provider<HeartBeatController> zzd() {
        return this.zzw;
    }

    private FirebaseAuth(FirebaseApp firebaseApp, zzaag zzaagVar, zzby zzbyVar, zzce zzceVar, com.google.firebase.auth.internal.zzb zzbVar, Provider<InteropAppCheckTokenProvider> provider, Provider<HeartBeatController> provider2, @Background Executor executor, @Blocking Executor executor2, @Lightweight Executor executor3, @UiThread Executor executor4) {
        zzafm zza2;
        this.zzb = new CopyOnWriteArrayList();
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new CopyOnWriteArrayList();
        this.zzh = new Object();
        this.zzj = new Object();
        this.zzm = RecaptchaAction.custom("getOobCode");
        this.zzn = RecaptchaAction.custom("signInWithPassword");
        this.zzo = RecaptchaAction.custom("signUpPassword");
        this.zzp = RecaptchaAction.custom("sendVerificationCode");
        this.zzq = RecaptchaAction.custom("mfaSmsEnrollment");
        this.zzr = RecaptchaAction.custom("mfaSmsSignIn");
        b.s(firebaseApp);
        this.zza = firebaseApp;
        b.s(zzaagVar);
        this.zze = zzaagVar;
        b.s(zzbyVar);
        this.zzs = zzbyVar;
        this.zzg = new com.google.firebase.auth.internal.zzac();
        b.s(zzceVar);
        this.zzt = zzceVar;
        b.s(zzbVar);
        this.zzu = zzbVar;
        this.zzv = provider;
        this.zzw = provider2;
        this.zzy = executor2;
        this.zzz = executor3;
        this.zzaa = executor4;
        FirebaseUser zza3 = zzbyVar.zza();
        this.zzf = zza3;
        if (zza3 != null && (zza2 = zzbyVar.zza(zza3)) != null) {
            zza(this, this.zzf, zza2, false, false);
        }
        zzceVar.zza(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.zzaa] */
    public final Task<GetTokenResult> zza(FirebaseUser firebaseUser, boolean z9) {
        if (firebaseUser == null) {
            return Tasks.forException(zzach.zza(new Status(FirebaseError.ERROR_NO_SIGNED_IN_USER, null)));
        }
        zzafm zzc2 = firebaseUser.zzc();
        if (zzc2.zzg() && !z9) {
            return Tasks.forResult(zzbi.zza(zzc2.zzc()));
        }
        return this.zze.zza(this.zza, firebaseUser, zzc2.zzd(), (zzcc) new zzaa(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zza] */
    public final Task<Void> zzb(FirebaseUser firebaseUser) {
        return zza(firebaseUser, (zzcc) new zza());
    }

    public final Task<AuthResult> zzb(Activity activity, FederatedAuthProvider federatedAuthProvider, FirebaseUser firebaseUser) {
        b.s(activity);
        b.s(federatedAuthProvider);
        b.s(firebaseUser);
        TaskCompletionSource<AuthResult> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.zzt.zza(activity, taskCompletionSource, this, firebaseUser)) {
            return Tasks.forException(zzach.zza(new Status(17057, null)));
        }
        zzbl.zza(activity.getApplicationContext(), this, firebaseUser);
        federatedAuthProvider.zzb(activity);
        return taskCompletionSource.getTask();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zza] */
    public final Task<Void> zzc(FirebaseUser firebaseUser, String str) {
        b.s(firebaseUser);
        b.o(str);
        return this.zze.zzc(this.zza, firebaseUser, str, new zza());
    }

    public final Task<zzafi> zza() {
        return this.zze.zza();
    }

    public final Provider<InteropAppCheckTokenProvider> zzc() {
        return this.zzv;
    }

    public final Task<zzafj> zza(String str) {
        return this.zze.zza(this.zzk, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zza] */
    public final Task<AuthResult> zza(FirebaseUser firebaseUser, AuthCredential authCredential) {
        b.s(authCredential);
        b.s(firebaseUser);
        if (authCredential instanceof EmailAuthCredential) {
            return new zzn(this, firebaseUser, (EmailAuthCredential) authCredential.zza()).zza(this, firebaseUser.getTenantId(), this.zzo, "EMAIL_PASSWORD_PROVIDER");
        }
        return this.zze.zza(this.zza, firebaseUser, authCredential.zza(), (String) null, (zzcc) new zza());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zza] */
    public final Task<AuthResult> zzb(FirebaseUser firebaseUser, String str) {
        b.o(str);
        b.s(firebaseUser);
        return this.zze.zzb(this.zza, firebaseUser, str, new zza());
    }

    private final Task<Void> zza(FirebaseUser firebaseUser, zzcc zzccVar) {
        b.s(firebaseUser);
        return this.zze.zza(this.zza, firebaseUser, zzccVar);
    }

    public final synchronized zzbx zzb() {
        return this.zzl;
    }

    private static void zzb(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + firebaseUser.getUid() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        firebaseAuth.zzaa.execute(new zzy(firebaseAuth, new InternalTokenResult(firebaseUser != null ? firebaseUser.zzd() : null)));
    }

    public final Task<AuthResult> zza(MultiFactorAssertion multiFactorAssertion, com.google.firebase.auth.internal.zzam zzamVar, FirebaseUser firebaseUser) {
        b.s(multiFactorAssertion);
        b.s(zzamVar);
        if (multiFactorAssertion instanceof PhoneMultiFactorAssertion) {
            String zzc2 = zzamVar.zzc();
            b.o(zzc2);
            return this.zze.zza(this.zza, firebaseUser, (PhoneMultiFactorAssertion) multiFactorAssertion, zzc2, new zzb());
        }
        if (multiFactorAssertion instanceof TotpMultiFactorAssertion) {
            String zzc3 = zzamVar.zzc();
            b.o(zzc3);
            return this.zze.zza(this.zza, firebaseUser, (TotpMultiFactorAssertion) multiFactorAssertion, zzc3, this.zzk, new zzb());
        }
        throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
    }

    private final boolean zzb(String str) {
        ActionCodeUrl parseLink = ActionCodeUrl.parseLink(str);
        return (parseLink == null || TextUtils.equals(this.zzk, parseLink.zza())) ? false : true;
    }

    public final Task<Void> zza(ActionCodeSettings actionCodeSettings, String str) {
        b.o(str);
        if (this.zzi != null) {
            if (actionCodeSettings == null) {
                actionCodeSettings = ActionCodeSettings.zzb();
            }
            actionCodeSettings.zza(this.zzi);
        }
        return this.zze.zza(this.zza, actionCodeSettings, str);
    }

    public final Task<AuthResult> zza(Activity activity, FederatedAuthProvider federatedAuthProvider, FirebaseUser firebaseUser) {
        b.s(activity);
        b.s(federatedAuthProvider);
        b.s(firebaseUser);
        TaskCompletionSource<AuthResult> taskCompletionSource = new TaskCompletionSource<>();
        if (!this.zzt.zza(activity, taskCompletionSource, this, firebaseUser)) {
            return Tasks.forException(zzach.zza(new Status(17057, null)));
        }
        zzbl.zza(activity.getApplicationContext(), this, firebaseUser);
        federatedAuthProvider.zza(activity);
        return taskCompletionSource.getTask();
    }

    public final Task<TotpSecret> zza(com.google.firebase.auth.internal.zzam zzamVar) {
        b.s(zzamVar);
        return this.zze.zza(zzamVar, this.zzk).continueWithTask(new zzw(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zza] */
    public final Task<Void> zza(FirebaseUser firebaseUser, String str) {
        b.s(firebaseUser);
        b.o(str);
        return this.zze.zza(this.zza, firebaseUser, str, this.zzk, (zzcc) new zza()).continueWithTask(new zzr(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zza] */
    public final Task<Void> zza(FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential) {
        b.s(firebaseUser);
        b.s(phoneAuthCredential);
        return this.zze.zza(this.zza, firebaseUser, (PhoneAuthCredential) phoneAuthCredential.zza(), (zzcc) new zza());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.firebase.auth.internal.zzcc, com.google.firebase.auth.FirebaseAuth$zza] */
    public final Task<Void> zza(FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest) {
        b.s(firebaseUser);
        b.s(userProfileChangeRequest);
        return this.zze.zza(this.zza, firebaseUser, userProfileChangeRequest, (zzcc) new zza());
    }

    public final Task<Void> zza(String str, String str2, ActionCodeSettings actionCodeSettings) {
        b.o(str);
        b.o(str2);
        if (actionCodeSettings == null) {
            actionCodeSettings = ActionCodeSettings.zzb();
        }
        String str3 = this.zzi;
        if (str3 != null) {
            actionCodeSettings.zza(str3);
        }
        return this.zze.zza(str, str2, actionCodeSettings);
    }

    private final Task<Void> zza(FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, boolean z9) {
        return new zzad(this, z9, firebaseUser, emailAuthCredential).zza(this, this.zzk, z9 ? this.zzm : this.zzn, "EMAIL_PASSWORD_PROVIDER");
    }

    private final Task<AuthResult> zza(String str, String str2, String str3, FirebaseUser firebaseUser, boolean z9) {
        return new zzac(this, str, z9, firebaseUser, str2, str3).zza(this, str3, this.zzn, "EMAIL_PASSWORD_PROVIDER");
    }

    private final Task<AuthResult> zza(EmailAuthCredential emailAuthCredential, FirebaseUser firebaseUser, boolean z9) {
        return new zzab(this, z9, firebaseUser, emailAuthCredential).zza(this, this.zzk, this.zzm, "EMAIL_PASSWORD_PROVIDER");
    }

    public final PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(PhoneAuthOptions phoneAuthOptions, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        return phoneAuthOptions.zzj() ? onVerificationStateChangedCallbacks : new zzo(this, phoneAuthOptions, onVerificationStateChangedCallbacks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks) {
        return (this.zzg.zzd() && str != null && str.equals(this.zzg.zza())) ? new zzl(this, onVerificationStateChangedCallbacks) : onVerificationStateChangedCallbacks;
    }

    public static void zza(final FirebaseException firebaseException, PhoneAuthOptions phoneAuthOptions, String str) {
        Log.e("FirebaseAuth", "Invoking verification failure callback for phone number/uid - " + str);
        final PhoneAuthProvider.OnVerificationStateChangedCallbacks zza2 = zzads.zza(str, phoneAuthOptions.zze(), null);
        phoneAuthOptions.zzi().execute(new Runnable() { // from class: com.google.firebase.auth.zzi
            @Override // java.lang.Runnable
            public final void run() {
                PhoneAuthProvider.OnVerificationStateChangedCallbacks.this.onVerificationFailed(firebaseException);
            }
        });
    }

    public final synchronized void zza(zzbx zzbxVar) {
        this.zzl = zzbxVar;
    }

    public final void zza(FirebaseUser firebaseUser, zzafm zzafmVar, boolean z9) {
        zza(firebaseUser, zzafmVar, true, false);
    }

    public final void zza(FirebaseUser firebaseUser, zzafm zzafmVar, boolean z9, boolean z10) {
        zza(this, firebaseUser, zzafmVar, true, z10);
    }

    private static void zza(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser) {
        if (firebaseUser != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + firebaseUser.getUid() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.zzaa.execute(new zzx(firebaseAuth));
    }

    private static void zza(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, zzafm zzafmVar, boolean z9, boolean z10) {
        boolean z11;
        b.s(firebaseUser);
        b.s(zzafmVar);
        boolean z12 = true;
        boolean z13 = firebaseAuth.zzf != null && firebaseUser.getUid().equals(firebaseAuth.zzf.getUid());
        if (z13 || !z10) {
            FirebaseUser firebaseUser2 = firebaseAuth.zzf;
            if (firebaseUser2 == null) {
                z11 = true;
            } else {
                boolean z14 = !z13 || (firebaseUser2.zzc().zzc().equals(zzafmVar.zzc()) ^ true);
                z11 = true ^ z13;
                z12 = z14;
            }
            if (firebaseAuth.zzf != null && firebaseUser.getUid().equals(firebaseAuth.getUid())) {
                firebaseAuth.zzf.zza(firebaseUser.getProviderData());
                if (!firebaseUser.isAnonymous()) {
                    firebaseAuth.zzf.zzb();
                }
                firebaseAuth.zzf.zzb(firebaseUser.getMultiFactor().getEnrolledFactors());
            } else {
                firebaseAuth.zzf = firebaseUser;
            }
            if (z9) {
                firebaseAuth.zzs.zzb(firebaseAuth.zzf);
            }
            if (z12) {
                FirebaseUser firebaseUser3 = firebaseAuth.zzf;
                if (firebaseUser3 != null) {
                    firebaseUser3.zza(zzafmVar);
                }
                zzb(firebaseAuth, firebaseAuth.zzf);
            }
            if (z11) {
                zza(firebaseAuth, firebaseAuth.zzf);
            }
            if (z9) {
                firebaseAuth.zzs.zza(firebaseUser, zzafmVar);
            }
            FirebaseUser firebaseUser4 = firebaseAuth.zzf;
            if (firebaseUser4 != null) {
                zzj(firebaseAuth).zza(firebaseUser4.zzc());
            }
        }
    }

    public static void zza(PhoneAuthOptions phoneAuthOptions) {
        String str;
        String phoneNumber;
        if (phoneAuthOptions.zzl()) {
            FirebaseAuth zzb2 = phoneAuthOptions.zzb();
            MultiFactorSession zzc2 = phoneAuthOptions.zzc();
            b.s(zzc2);
            com.google.firebase.auth.internal.zzam zzamVar = (com.google.firebase.auth.internal.zzam) zzc2;
            if (zzamVar.zzd()) {
                String zzh = phoneAuthOptions.zzh();
                b.o(zzh);
                phoneNumber = zzh;
                str = phoneNumber;
            } else {
                PhoneMultiFactorInfo zzf = phoneAuthOptions.zzf();
                b.s(zzf);
                String uid = zzf.getUid();
                b.o(uid);
                str = uid;
                phoneNumber = zzf.getPhoneNumber();
            }
            if (phoneAuthOptions.zzd() == null || !zzads.zza(str, phoneAuthOptions.zze(), phoneAuthOptions.zza(), phoneAuthOptions.zzi())) {
                zzb2.zzu.zza(zzb2, phoneNumber, phoneAuthOptions.zza(), zzb2.zzi(), phoneAuthOptions.zzj(), false, zzamVar.zzd() ? zzb2.zzq : zzb2.zzr).addOnCompleteListener(new zzm(zzb2, phoneAuthOptions, str));
                return;
            }
            return;
        }
        FirebaseAuth zzb3 = phoneAuthOptions.zzb();
        String zzh2 = phoneAuthOptions.zzh();
        b.o(zzh2);
        if ((phoneAuthOptions.zzd() != null) || !zzads.zza(zzh2, phoneAuthOptions.zze(), phoneAuthOptions.zza(), phoneAuthOptions.zzi())) {
            zzb3.zzu.zza(zzb3, zzh2, phoneAuthOptions.zza(), zzb3.zzi(), phoneAuthOptions.zzj(), false, zzb3.zzp).addOnCompleteListener(new zzj(zzb3, phoneAuthOptions, zzh2));
        }
    }

    public final void zza(PhoneAuthOptions phoneAuthOptions, String str, String str2) {
        long longValue = phoneAuthOptions.zzg().longValue();
        if (longValue >= 0 && longValue <= 120) {
            String zzh = phoneAuthOptions.zzh();
            b.o(zzh);
            zzafz zzafzVar = new zzafz(zzh, longValue, phoneAuthOptions.zzd() != null, this.zzi, this.zzk, str, str2, zzi());
            PhoneAuthProvider.OnVerificationStateChangedCallbacks zza2 = zza(zzh, phoneAuthOptions.zze());
            this.zze.zza(this.zza, zzafzVar, TextUtils.isEmpty(str) ? zza(phoneAuthOptions, zza2) : zza2, phoneAuthOptions.zza(), phoneAuthOptions.zzi());
            return;
        }
        throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
    }
}
