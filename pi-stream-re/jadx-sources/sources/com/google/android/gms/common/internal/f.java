package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class f {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private b5.a zzB;
    private boolean zzC;
    private volatile m0 zzD;
    r0 zza;
    final Handler zzb;
    protected d zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final l zzn;
    private final b5.e zzo;
    private final Object zzp;
    private final Object zzq;
    private o zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private j0 zzu;
    private int zzv;
    private final b zzw;
    private final c zzx;
    private final int zzy;
    private final String zzz;
    private static final b5.c[] zze = new b5.c[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    public f(Context context, Looper looper, q0 q0Var, int i10, k3.d dVar, k3.d dVar2, String str) {
        b5.d dVar3 = b5.d.f1517d;
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        if (context != null) {
            this.zzl = context;
            if (looper != null) {
                this.zzm = looper;
                if (q0Var != null) {
                    this.zzn = q0Var;
                    this.zzo = dVar3;
                    this.zzb = new h0(this, looper);
                    this.zzy = i10;
                    this.zzw = dVar;
                    this.zzx = dVar2;
                    this.zzz = str;
                    return;
                }
                throw new NullPointerException("Supervisor must not be null");
            }
            throw new NullPointerException("Looper must not be null");
        }
        throw new NullPointerException("Context must not be null");
    }

    public static /* bridge */ /* synthetic */ c zzc(f fVar) {
        return fVar.zzx;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
    
        if (r0.f2595a >= r2.f2595a) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zzj(com.google.android.gms.common.internal.f r2, com.google.android.gms.common.internal.m0 r3) {
        /*
            r2.zzD = r3
            boolean r2 = r2.usesClientTelemetry()
            if (r2 == 0) goto L2c
            com.google.android.gms.common.internal.i r2 = r3.f2558d
            com.google.android.gms.common.internal.s r3 = com.google.android.gms.common.internal.s.a()
            if (r2 != 0) goto L12
            r2 = 0
            goto L14
        L12:
            com.google.android.gms.common.internal.t r2 = r2.f2530a
        L14:
            monitor-enter(r3)
            if (r2 != 0) goto L1d
            com.google.android.gms.common.internal.t r2 = com.google.android.gms.common.internal.s.f2593c     // Catch: java.lang.Throwable -> L29
        L19:
            r3.f2594a = r2     // Catch: java.lang.Throwable -> L29
        L1b:
            monitor-exit(r3)
            goto L28
        L1d:
            com.google.android.gms.common.internal.t r0 = r3.f2594a     // Catch: java.lang.Throwable -> L29
            if (r0 == 0) goto L19
            int r0 = r0.f2595a     // Catch: java.lang.Throwable -> L29
            int r1 = r2.f2595a     // Catch: java.lang.Throwable -> L29
            if (r0 >= r1) goto L1b
            goto L19
        L28:
            return
        L29:
            r2 = move-exception
            monitor-exit(r3)
            throw r2
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.f.zzj(com.google.android.gms.common.internal.f, com.google.android.gms.common.internal.m0):void");
    }

    public static /* bridge */ /* synthetic */ void zzk(f fVar, int i10) {
        int i11;
        int i12;
        synchronized (fVar.zzp) {
            i11 = fVar.zzv;
        }
        if (i11 == 3) {
            fVar.zzC = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = fVar.zzb;
        handler.sendMessage(handler.obtainMessage(i12, fVar.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(f fVar, int i10, int i11, IInterface iInterface) {
        synchronized (fVar.zzp) {
            if (fVar.zzv != i10) {
                return false;
            }
            fVar.c(i11, iInterface);
            return true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException: Cannot read field "wordsInUse" because "set" is null
        	at java.base/java.util.BitSet.or(BitSet.java:943)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:759)
        	at jadx.core.utils.BlockUtils.getPathCross(BlockUtils.java:838)
        	at jadx.core.dex.visitors.regions.IfMakerHelper.restructureIf(IfMakerHelper.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:711)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:735)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:152)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:91)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public static /* bridge */ /* synthetic */ boolean zzo(com.google.android.gms.common.internal.f r2) {
        /*
            boolean r0 = r2.zzC
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.getServiceDescriptor()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.getLocalStartServiceAction()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.getServiceDescriptor()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.f.zzo(com.google.android.gms.common.internal.f):boolean");
    }

    public final void c(int i10, IInterface iInterface) {
        boolean z9;
        boolean z10;
        boolean z11;
        r0 r0Var;
        r0 r0Var2;
        if (i10 != 4) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (iInterface == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z9 == z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        w7.b.j(z11);
        synchronized (this.zzp) {
            try {
                this.zzv = i10;
                this.zzs = iInterface;
                if (i10 != 1) {
                    if (i10 != 2 && i10 != 3) {
                        if (i10 == 4) {
                            w7.b.s(iInterface);
                            onConnectedLocked(iInterface);
                        }
                    } else {
                        j0 j0Var = this.zzu;
                        if (j0Var != null && (r0Var2 = this.zza) != null) {
                            Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + r0Var2.f2589a + " on " + r0Var2.f2590b);
                            l lVar = this.zzn;
                            String str = this.zza.f2589a;
                            w7.b.s(str);
                            String str2 = this.zza.f2590b;
                            zze();
                            lVar.b(str, str2, j0Var, this.zza.f2591c);
                            this.zzd.incrementAndGet();
                        }
                        j0 j0Var2 = new j0(this, this.zzd.get());
                        this.zzu = j0Var2;
                        if (this.zzv == 3 && getLocalStartServiceAction() != null) {
                            r0Var = new r0(getContext().getPackageName(), getLocalStartServiceAction(), false);
                        } else {
                            r0Var = new r0(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup());
                        }
                        this.zza = r0Var;
                        if (r0Var.f2591c && getMinApkVersion() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f2589a)));
                        }
                        l lVar2 = this.zzn;
                        String str3 = this.zza.f2589a;
                        w7.b.s(str3);
                        if (!lVar2.c(new n0(str3, this.zza.f2590b, this.zza.f2591c), j0Var2, zze(), getBindServiceExecutor())) {
                            r0 r0Var3 = this.zza;
                            Log.w("GmsClient", "unable to connect to service: " + r0Var3.f2589a + " on " + r0Var3.f2590b);
                            zzl(16, null, this.zzd.get());
                        }
                    }
                } else {
                    j0 j0Var3 = this.zzu;
                    if (j0Var3 != null) {
                        l lVar3 = this.zzn;
                        String str4 = this.zza.f2589a;
                        w7.b.s(str4);
                        String str5 = this.zza.f2590b;
                        zze();
                        lVar3.b(str4, str5, j0Var3, this.zza.f2591c);
                        this.zzu = null;
                    }
                }
            } finally {
            }
        }
    }

    public void checkAvailabilityAndConnect() {
        int c6 = this.zzo.c(this.zzl, getMinApkVersion());
        int i10 = 16;
        if (c6 != 0) {
            c(1, null);
            triggerNotAvailable(new k3.d(this, i10), c6, null);
        } else {
            connect(new k3.d(this, i10));
        }
    }

    public final void checkConnected() {
        if (isConnected()) {
        } else {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(d dVar) {
        if (dVar != null) {
            this.zzc = dVar;
            c(2, null);
            return;
        }
        throw new NullPointerException("Connection progress callbacks cannot be null.");
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            int size = this.zzt.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((d0) this.zzt.get(i10)).d();
            }
            this.zzt.clear();
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        c(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i10;
        IInterface iInterface;
        o oVar;
        synchronized (this.zzp) {
            i10 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            oVar = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            printWriter.print("UNKNOWN");
                        } else {
                            printWriter.print("DISCONNECTING");
                        }
                    } else {
                        printWriter.print("CONNECTED");
                    }
                } else {
                    printWriter.print("LOCAL_CONNECTING");
                }
            } else {
                printWriter.print("REMOTE_CONNECTING");
            }
        } else {
            printWriter.print("DISCONNECTED");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (oVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((f0) oVar).f2513a)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j4 = this.zzh;
            append.println(j4 + " " + simpleDateFormat.format(new Date(j4)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i11 = this.zzf;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        printWriter.append((CharSequence) String.valueOf(i11));
                    } else {
                        printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                    }
                } else {
                    printWriter.append("CAUSE_NETWORK_LOST");
                }
            } else {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j10 = this.zzg;
            append2.println(j10 + " " + simpleDateFormat.format(new Date(j10)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) p7.a0.D(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j11 = this.zzj;
            append3.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public abstract Account getAccount();

    public b5.c[] getApiFeatures() {
        return zze;
    }

    public final b5.c[] getAvailableFeatures() {
        m0 m0Var = this.zzD;
        if (m0Var == null) {
            return null;
        }
        return m0Var.f2556b;
    }

    public abstract Executor getBindServiceExecutor();

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        r0 r0Var;
        if (isConnected() && (r0Var = this.zza) != null) {
            return r0Var.f2590b;
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    public Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    public String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public abstract int getMinApkVersion();

    public void getRemoteService(m mVar, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        int i10 = this.zzy;
        String str = this.zzA;
        int i11 = b5.e.f1518a;
        Scope[] scopeArr = j.F;
        Bundle bundle = new Bundle();
        b5.c[] cVarArr = j.G;
        j jVar = new j(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        jVar.f2541d = this.zzl.getPackageName();
        jVar.f2544x = getServiceRequestExtraArgs;
        if (set != null) {
            jVar.f2543f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            jVar.f2545y = account;
            if (mVar != null) {
                jVar.f2542e = mVar.asBinder();
            }
        } else if (requiresAccount()) {
            jVar.f2545y = getAccount();
        }
        jVar.f2546z = zze;
        jVar.A = getApiFeatures();
        if (usesClientTelemetry()) {
            jVar.D = true;
        }
        try {
            synchronized (this.zzq) {
                try {
                    o oVar = this.zzr;
                    if (oVar != null) {
                        ((f0) oVar).a(new i0(this, this.zzd.get()), jVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            triggerConnectionSuspended(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    public abstract Set getScopes();

    public final IInterface getService() {
        IInterface iInterface;
        synchronized (this.zzp) {
            if (this.zzv != 5) {
                checkConnected();
                iInterface = this.zzs;
                w7.b.r(iInterface, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            o oVar = this.zzr;
            if (oVar == null) {
                return null;
            }
            return ((f0) oVar).f2513a;
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public abstract String getStartServiceAction();

    public String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public i getTelemetryConfiguration() {
        m0 m0Var = this.zzD;
        if (m0Var == null) {
            return null;
        }
        return m0Var.f2558d;
    }

    public boolean getUseDynamicLookup() {
        if (getMinApkVersion() >= 211700000) {
            return true;
        }
        return false;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z9;
        synchronized (this.zzp) {
            if (this.zzv == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    public boolean isConnecting() {
        boolean z9;
        synchronized (this.zzp) {
            int i10 = this.zzv;
            z9 = true;
            if (i10 != 2 && i10 != 3) {
                z9 = false;
            }
        }
        return z9;
    }

    public void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(b5.a aVar) {
        this.zzi = aVar.f1507b;
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i10) {
        this.zzf = i10;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i10, IBinder iBinder, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i11, -1, new k0(this, i10, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        com.google.android.gms.common.api.internal.f0 f0Var = (com.google.android.gms.common.api.internal.f0) eVar;
        f0Var.f2398a.f2415m.E.post(new com.google.android.gms.common.api.internal.q0(f0Var, 2));
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i10) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.zzd.get(), i10));
    }

    public void triggerNotAvailable(d dVar, int i10, PendingIntent pendingIntent) {
        if (dVar != null) {
            this.zzc = dVar;
            Handler handler = this.zzb;
            handler.sendMessage(handler.obtainMessage(3, this.zzd.get(), i10, pendingIntent));
            return;
        }
        throw new NullPointerException("Connection progress callbacks cannot be null.");
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    public final String zze() {
        String str = this.zzz;
        if (str == null) {
            return this.zzl.getClass().getName();
        }
        return str;
    }

    public final void zzl(int i10, Bundle bundle, int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i11, -1, new l0(this, i10)));
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
