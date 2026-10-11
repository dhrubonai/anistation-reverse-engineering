package defpackage;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.telephony.TelephonyManager;
import com.discord.socialsdk.AuthenticationClientCallback;
import com.discord.socialsdk.NativeCalls;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.InitializationListener;
import com.unity3d.services.core.properties.SdkProperties;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class f32 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ f32(bu3 bu3Var, dt3 dt3Var, Runnable runnable) {
        this.x = (byte) 13;
        this.y = bu3Var;
        this.z = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jr3 jr3Var;
        float f;
        ru ruVar;
        c31 c31Var;
        qh6 qh6Var;
        tk5 tk5Var;
        ArrayList arrayList;
        byte b = 4;
        int i = 0;
        switch (this.x) {
            case 0:
                ((h32) this.y).j.a(ns6.a((ze2) this.z, -9223372036854775807L));
                return;
            case 1:
                ((h32) this.y).j.a((ns6) this.z);
                return;
            case 2:
                h32 h32Var = (h32) this.y;
                sq5 sq5Var = (sq5) this.z;
                h32Var.j.c(sq5Var.a, sq5Var.b);
                return;
            case 3:
                ((h32) this.y).j.a(ns6.a((InterruptedException) this.z, -9223372036854775807L));
                return;
            case 4:
                ((qg0) this.y).C((jj2) this.z);
                return;
            case 5:
                ol2 ol2Var = (ol2) this.y;
                String str = (String) this.z;
                io3.B(ol2Var.k);
                ol2Var.i.remove(str);
                if (ol2Var.m != null) {
                    ol2Var.e(-9223372036854775807L);
                    return;
                }
                return;
            case 6:
                tm2 tm2Var = (tm2) this.y;
                rl2 rl2Var = (rl2) this.z;
                i75 i75Var = tm2Var.z;
                Uri uri = rl2Var.m;
                a91 a91Var = (a91) ((sl2) i75Var.y).y.A.get(uri);
                if (a91Var != null) {
                    a91Var.e(true, uri);
                    return;
                }
                return;
            case 7:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.y;
                JobParameters jobParameters = (JobParameters) this.z;
                int i2 = JobInfoSchedulerService.x;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 8:
                ((mr3) this.y).d.reportTrackChangeEvent((TrackChangeEvent) this.z);
                return;
            case 9:
                ((mr3) this.y).d.reportNetworkEvent((NetworkEvent) this.z);
                return;
            case 10:
                ((mr3) this.y).d.reportPlaybackErrorEvent((PlaybackErrorEvent) this.z);
                return;
            case 11:
                ((mr3) this.y).d.reportPlaybackMetrics((PlaybackMetrics) this.z);
                return;
            case 12:
                ((mr3) this.y).d.reportPlaybackStateEvent((PlaybackStateEvent) this.z);
                return;
            case 13:
                bu3 bu3Var = (bu3) this.y;
                Runnable runnable = (Runnable) this.z;
                bu3Var.getClass();
                runnable.run();
                return;
            case 14:
                bu3 bu3Var2 = (bu3) this.y;
                fq4 fq4Var = (fq4) this.z;
                wu3 wu3Var = bu3Var2.h;
                bu3Var2.t = fq4Var;
                zt3 zt3Var = new zt3(bu3Var2, fq4Var);
                fq4Var.v(zt3Var);
                bu3Var2.v = zt3Var;
                try {
                    wu3Var.k.k(0, fq4Var);
                } catch (RemoteException e) {
                    kb0.t("MediaSessionImpl", "Exception in using media1 API", e);
                }
                ((mt3) wu3Var.o.y).a.setActive(true);
                yx1 X = fq4Var.X();
                sk5 d1 = fq4Var.d1();
                jo4 c1 = fq4Var.c1();
                jo4 c12 = fq4Var.c1();
                rn4 e2 = fq4Var.e();
                int F0 = fq4Var.F0();
                boolean O0 = fq4Var.O0();
                hv6 z = fq4Var.z();
                kf6 f1 = fq4Var.f1();
                if (fq4Var.t0(18)) {
                    jr3Var = fq4Var.k0();
                } else {
                    jr3Var = jr3.M;
                }
                jr3 jr3Var2 = jr3Var;
                if (fq4Var.t0(22)) {
                    f = fq4Var.getVolume();
                } else {
                    f = 1.0f;
                }
                float f2 = f;
                if (fq4Var.t0(21)) {
                    ruVar = fq4Var.C();
                } else {
                    ruVar = ru.i;
                }
                ru ruVar2 = ruVar;
                if (fq4Var.t0(28)) {
                    c31Var = fq4Var.m0();
                } else {
                    c31Var = c31.d;
                }
                c31 c31Var2 = c31Var;
                rf1 deviceInfo = fq4Var.getDeviceInfo();
                if (fq4Var.t0(23)) {
                    i = fq4Var.f();
                }
                int i3 = i;
                boolean h1 = fq4Var.h1();
                boolean n = fq4Var.n();
                int D0 = fq4Var.D0();
                int h0 = fq4Var.h0();
                boolean l0 = fq4Var.l0();
                boolean d = fq4Var.d();
                jr3 g1 = fq4Var.g1();
                long a1 = fq4Var.a1();
                long a0 = fq4Var.a0();
                long u = fq4Var.u();
                if (fq4Var.t0(30)) {
                    qh6Var = fq4Var.j0();
                } else {
                    qh6Var = qh6.b;
                }
                bu3Var2.s = new ep4(X, 0, d1, c1, c12, 0, e2, F0, O0, z, f1, 0, jr3Var2, f2, 1.0f, ruVar2, 0, c31Var2, deviceInfo, i3, h1, n, 1, D0, h0, l0, d, g1, a1, a0, u, qh6Var, fq4Var.P0());
                bu3Var2.f(fq4Var.l());
                return;
            case 15:
                aw2 aw2Var = (aw2) this.y;
                ResultReceiver resultReceiver = (ResultReceiver) this.z;
                try {
                    tk5Var = (tk5) aw2Var.x;
                    io3.w(tk5Var, "SessionResult must not be null");
                } catch (InterruptedException | ExecutionException e3) {
                    kb0.P("MediaSessionLegacyStub", "Custom command failed", e3);
                    tk5Var = new tk5(-1);
                } catch (CancellationException e4) {
                    kb0.P("MediaSessionLegacyStub", "Custom command cancelled", e4);
                    tk5Var = new tk5(1);
                }
                resultReceiver.send(tk5Var.a, tk5Var.b);
                return;
            case 16:
                ((ay0) this.y).accept((qw3) this.z);
                return;
            case 17:
                ((l34) this.y).d.a((ns6) this.z);
                return;
            case 18:
                NativeCalls.lambda$authorize$2((String) this.y, (AuthenticationClientCallback) this.z);
                return;
            case 19:
                n94 n94Var = (n94) this.y;
                Context context = (Context) this.z;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new o9(n94Var, b), intentFilter);
                return;
            case 20:
                o9 o9Var = (o9) this.y;
                Context context2 = (Context) this.z;
                n94 n94Var2 = (n94) o9Var.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            int type = activeNetworkInfo.getType();
                            if (type != 0) {
                                if (type != 1) {
                                    if (type != 4 && type != 5) {
                                        if (type != 6) {
                                            if (type != 9) {
                                                b = 8;
                                            } else {
                                                b = 7;
                                            }
                                        }
                                        b = 5;
                                    }
                                }
                                b = 2;
                            }
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    b = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    break;
                                case 13:
                                    b = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    b = 6;
                                    break;
                                case 18:
                                    b = 2;
                                    break;
                                case 20:
                                    b = 9;
                                    break;
                            }
                        } else {
                            b = 1;
                        }
                    } catch (SecurityException unused) {
                    }
                    if (Build.VERSION.SDK_INT < 31 && b == 5) {
                        try {
                            TelephonyManager telephonyManager = (TelephonyManager) context2.getSystemService("phone");
                            telephonyManager.getClass();
                            l94 l94Var = new l94(n94Var2);
                            telephonyManager.registerTelephonyCallback(n94Var2.a, l94Var);
                            telephonyManager.unregisterTelephonyCallback(l94Var);
                            return;
                        } catch (RuntimeException unused2) {
                            n94Var2.c(5);
                            return;
                        }
                    }
                    n94Var2.c(b);
                    return;
                }
                b = 0;
                if (Build.VERSION.SDK_INT < 31) {
                }
                n94Var2.c(b);
                return;
            case 21:
                ((ng5) this.y).h((me4) this.z, pn6.a);
                return;
            case 22:
                ((dv6) this.y).a((hv6) this.z);
                return;
            case 23:
                pu4 pu4Var = (pu4) this.y;
                i77 i77Var = (i77) this.z;
                synchronized (pu4Var.k) {
                    arrayList = new ArrayList(pu4Var.j);
                }
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((bx1) obj).b(i77Var, false);
                }
                return;
            case 24:
                ((nv4) this.y).F((hf5) this.z);
                return;
            case 25:
                ((wp) this.y).p((Typeface) this.z);
                return;
            case 26:
                SdkProperties.lambda$notifyInitializationFailed$1((InitializationListener) this.y, (String) this.z);
                return;
            case 27:
                SdkProperties.lambda$notifyInitializationFailed$2((IUnityAdsInitializationListener) this.y, (String) this.z);
                return;
            case 28:
                ((qi5) this.y).i((Bitmap) this.z);
                return;
            default:
                fi0 fi0Var = (fi0) this.y;
                ii3 ii3Var = (ii3) this.z;
                fi0Var.getClass();
                String str2 = eq6.a;
                Set set = fi0Var.e;
                set.remove(ii3Var);
                if (set.isEmpty() && !fi0Var.h) {
                    fi0Var.F1(fi0Var.r1(), false, false);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ f32(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }
}
