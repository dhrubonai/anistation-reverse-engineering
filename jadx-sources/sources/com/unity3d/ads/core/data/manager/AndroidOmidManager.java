package com.unity3d.ads.core.data.manager;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import android.webkit.WebView;
import defpackage.ba7;
import defpackage.da7;
import defpackage.f38;
import defpackage.g6;
import defpackage.h6;
import defpackage.ha7;
import defpackage.hj4;
import defpackage.i6;
import defpackage.j6;
import defpackage.jh4;
import defpackage.k21;
import defpackage.k6;
import defpackage.ka7;
import defpackage.kx2;
import defpackage.ma7;
import defpackage.nz5;
import defpackage.oa7;
import defpackage.pa7;
import defpackage.qs5;
import defpackage.qx2;
import defpackage.v5;
import defpackage.w65;
import defpackage.z95;
import defpackage.z97;
import defpackage.ze0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AndroidOmidManager implements OmidManager {
    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public void activate(Context context) {
        boolean z;
        context.getClass();
        qx2 qx2Var = w65.j;
        Context applicationContext = context.getApplicationContext();
        qs5.c(applicationContext, "Application Context cannot be null");
        if (!qx2Var.y) {
            qx2Var.y = true;
            pa7 b = pa7.b();
            b.b = new ma7(new Handler(), applicationContext, new z95((byte) 9), b);
            boolean z2 = applicationContext instanceof Application;
            if (z2) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(da7.A);
            }
            nz5.a = (UiModeManager) applicationContext.getSystemService("uimode");
            WindowManager windowManager = ha7.a;
            ha7.c = applicationContext.getResources().getDisplayMetrics().density;
            ha7.a = (WindowManager) applicationContext.getSystemService("window");
            applicationContext.registerReceiver(new f38((byte) 1), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
            oa7.b.a = applicationContext.getApplicationContext();
            z97 z97Var = z97.f;
            ka7 ka7Var = z97Var.d;
            if (!z97Var.c) {
                ka7Var.getClass();
                if (z2) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(ka7Var);
                }
                ka7Var.z = z97Var;
                ka7Var.x = true;
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                if (runningAppProcessInfo.importance == 100) {
                    z = true;
                } else {
                    z = false;
                }
                ka7Var.y = z;
                z97Var.e = ka7Var.y;
                z97Var.c = true;
            }
        }
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public v5 createAdEvents(g6 g6Var) {
        g6Var.getClass();
        ba7 ba7Var = (ba7) g6Var;
        k6 k6Var = ba7Var.e;
        if (k6Var.c == null) {
            if (!ba7Var.g) {
                v5 v5Var = new v5(ba7Var);
                k6Var.c = v5Var;
                return v5Var;
            }
            ze0.m("AdSession is finished");
            return null;
        }
        ze0.m("AdEvents already exists for AdSession");
        return null;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public g6 createAdSession(h6 h6Var, i6 i6Var) {
        h6Var.getClass();
        i6Var.getClass();
        if (w65.j.y) {
            return new ba7(h6Var, i6Var);
        }
        ze0.m("Method called before OM SDK activation");
        return null;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public h6 createAdSessionConfiguration(k21 k21Var, kx2 kx2Var, jh4 jh4Var, jh4 jh4Var2, boolean z) {
        k21Var.getClass();
        kx2Var.getClass();
        jh4Var.getClass();
        jh4Var2.getClass();
        if (jh4Var != jh4.NONE) {
            k21 k21Var2 = k21.DEFINED_BY_JAVASCRIPT;
            jh4 jh4Var3 = jh4.NATIVE;
            if (k21Var == k21Var2 && jh4Var == jh4Var3) {
                ze0.k("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
                return null;
            }
            if (kx2Var == kx2.DEFINED_BY_JAVASCRIPT && jh4Var == jh4Var3) {
                ze0.k("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
                return null;
            }
            return new h6(k21Var, kx2Var, jh4Var, jh4Var2, z);
        }
        ze0.k("Impression owner is none");
        return null;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public i6 createHtmlAdSessionContext(hj4 hj4Var, WebView webView, String str, String str2) {
        qs5.c(hj4Var, "Partner is null");
        qs5.c(webView, "WebView is null");
        if (str2 != null && str2.length() > 256) {
            ze0.k("CustomReferenceData is greater than 256 characters");
            return null;
        }
        return new i6(hj4Var, webView, str, str2, j6.HTML);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public i6 createJavaScriptAdSessionContext(hj4 hj4Var, WebView webView, String str, String str2) {
        qs5.c(hj4Var, "Partner is null");
        qs5.c(webView, "WebView is null");
        if (str2 != null && str2.length() > 256) {
            ze0.k("CustomReferenceData is greater than 256 characters");
            return null;
        }
        return new i6(hj4Var, webView, str, str2, j6.JAVASCRIPT);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public String getVersion() {
        return "1.4.9-Unity3d";
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public boolean isActive() {
        return w65.j.y;
    }
}
