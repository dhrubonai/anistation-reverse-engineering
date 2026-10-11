package defpackage;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.unity3d.ads.InitializationConfiguration;
import com.unity3d.ads.InitializationListener;
import com.unity3d.ads.LoadConfiguration;
import com.unity3d.ads.LogLevel;
import com.unity3d.ads.RewardedAd;
import com.unity3d.ads.ShowConfiguration;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsError;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zn6 implements t55 {
    public final tn6 a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public RewardedAd i;
    public yn6 j;

    public zn6(tn6 tn6Var) {
        this.a = tn6Var;
    }

    public static void d(String str, UnityAdsError unityAdsError) {
        int code = unityAdsError.getCode();
        String message = unityAdsError.getMessage();
        StringBuilder m = h11.m(code, "Unity Ads ", str, " failed (", "): ");
        m.append(message);
        Log.e("UnityRewardedAds", m.toString());
    }

    public final void a(u55 u55Var) {
        yn6 yn6Var = this.j;
        if (yn6Var != null) {
            f05 f05Var = yn6Var.c;
            this.j = null;
            f05Var.invoke(u55Var);
        }
    }

    public final void b() {
        if (b06.L("800363057") != null && !uz5.V("Rewarded_Android") && !uz5.M("Rewarded_Android", "REPLACE_WITH", true)) {
            if (UnityAds.isInitialized()) {
                this.c = true;
                c();
                return;
            } else {
                if (this.d) {
                    return;
                }
                this.d = true;
                UnityAds.initialize(new InitializationConfiguration.Builder("800363057").withTestMode(false).withLogLevel(LogLevel.ERROR).build(), new InitializationListener() { // from class: vn6
                    @Override // com.unity3d.ads.InitializationListener
                    public final void onInitializationComplete(UnityAdsError unityAdsError) {
                        zn6 zn6Var = zn6.this;
                        zn6Var.e(new xn6(zn6Var, unityAdsError, (byte) 0));
                    }
                });
                return;
            }
        }
        Log.w("UnityRewardedAds", "Unity Ads is disabled because placeholder IDs are still configured.");
        a(u55.B);
    }

    public final void c() {
        if (this.c && !this.e && this.i == null && !this.f) {
            this.e = true;
            RewardedAd.Companion.load(new LoadConfiguration.Builder("Rewarded_Android").build(), new wn6(this));
        }
    }

    public final void e(sb2 sb2Var) {
        if (a34.i(Looper.myLooper(), Looper.getMainLooper())) {
            sb2Var.invoke();
        } else {
            this.b.post(new ca(sb2Var, (byte) 6));
        }
    }

    public final void f() {
        yn6 yn6Var = this.j;
        if (yn6Var == null) {
            return;
        }
        Activity activity = (Activity) yn6Var.a.get();
        RewardedAd rewardedAd = this.i;
        if (activity != null && !activity.isFinishing() && !activity.isDestroyed() && rewardedAd != null) {
            this.i = null;
            this.f = true;
            this.g = false;
            this.h = false;
            rewardedAd.show(activity, new ShowConfiguration.Builder().withCustomRewardString("highest_quality_download").build(), new eo3((Object) this, (byte) 23));
            return;
        }
        this.i = null;
        a(u55.z);
        c();
    }
}
