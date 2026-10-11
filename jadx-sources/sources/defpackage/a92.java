package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Surface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.anistation.model.settings.SubtitleArgbColor;
import com.discord.org.webrtc.ScreenCapturerAndroid;
import com.discord.org.webrtc.VideoFileRenderer;
import com.discord.org.webrtc.VideoFrame;
import com.discord.socialsdk.NativeCalls;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.unity3d.ads.InitializationListener;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.ads.UnityAdsImplementation;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class a92 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ a92(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    private final void a() {
        int i;
        String V;
        TelephonyManager telephonyManager;
        m94 m94Var = (m94) this.y;
        m71 m71Var = (m71) m94Var.a.get();
        if (m71Var != null) {
            int b = m94Var.c.b();
            n71 n71Var = m71Var.a;
            synchronized (n71Var) {
                int i2 = n71Var.K;
                if (i2 != 0 && !n71Var.B) {
                    return;
                }
                if (i2 == b && n71Var.L != null) {
                    return;
                }
                n71Var.K = b;
                if (b != 1 && b != 0 && b != 8) {
                    if (n71Var.L == null) {
                        Context context = n71Var.x;
                        String str = eq6.a;
                        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                            String networkCountryIso = telephonyManager.getNetworkCountryIso();
                            if (!TextUtils.isEmpty(networkCountryIso)) {
                                V = wc7.V(networkCountryIso);
                                n71Var.L = V;
                            }
                        }
                        V = wc7.V(Locale.getDefault().getCountry());
                        n71Var.L = V;
                    }
                    n71Var.I = n71Var.a(b);
                    n71Var.A.getClass();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (n71Var.D > 0) {
                        i = (int) (elapsedRealtime - n71Var.E);
                    } else {
                        i = 0;
                    }
                    n71Var.b(n71Var.F, i, n71Var.I);
                    n71Var.E = elapsedRealtime;
                    n71Var.F = 0L;
                    n71Var.H = 0L;
                    n71Var.G = 0L;
                    vr5 vr5Var = n71Var.C;
                    vr5Var.a.clear();
                    vr5Var.c = -1;
                    vr5Var.d = 0;
                    vr5Var.e = 0;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr;
        boolean z;
        View findFocus;
        Boolean bool = null;
        Object[] objArr2 = 0;
        int i = 0;
        switch (this.x) {
            case 0:
                b92 b92Var = (b92) this.y;
                synchronized (b92Var.c) {
                    try {
                        if (b92Var.g != null) {
                            try {
                                v92 c = b92Var.c();
                                int i2 = c.f;
                                if (i2 == 2) {
                                    synchronized (b92Var.c) {
                                    }
                                }
                                if (i2 == 0) {
                                    try {
                                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                        Typeface a = dl6.a(b92Var.a, new v92[]{c}, 0);
                                        MappedByteBuffer n = gy5.n(b92Var.a, c.a);
                                        if (n != null && a != null) {
                                            try {
                                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                zp2 zp2Var = new zp2(a, jf7.D(n));
                                                Trace.endSection();
                                                synchronized (b92Var.c) {
                                                    try {
                                                        tl7 tl7Var = b92Var.g;
                                                        if (tl7Var != null) {
                                                            tl7Var.D(zp2Var);
                                                        }
                                                    } finally {
                                                    }
                                                }
                                                b92Var.b();
                                                return;
                                            } finally {
                                                Trace.endSection();
                                            }
                                        }
                                        throw new RuntimeException("Unable to open file.");
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            } catch (Throwable th2) {
                                synchronized (b92Var.c) {
                                    try {
                                        tl7 tl7Var2 = b92Var.g;
                                        if (tl7Var2 != null) {
                                            tl7Var2.C(th2);
                                        }
                                        b92Var.b();
                                        return;
                                    } finally {
                                    }
                                }
                            }
                        }
                        return;
                    } finally {
                    }
                }
            case 1:
                Iterator it = ((ArrayList) ((ra2) this.y).e).iterator();
                if (!it.hasNext()) {
                    return;
                } else {
                    throw qx1.f(it);
                }
            case 2:
                ((ff2) this.y).l();
                return;
            case 3:
                ((i75) this.y).q();
                return;
            case 4:
                ((VideoFrame.I420Buffer) this.y).release();
                return;
            case 5:
                h43 h43Var = (h43) this.y;
                if (h43Var != null) {
                    h43Var.l(null);
                    return;
                }
                return;
            case 6:
                ((xr3) this.y).n = -1;
                return;
            case 7:
                ((os3) this.y).b();
                return;
            case 8:
                try {
                    ((l34) this.y).c.P(a34.Y());
                    return;
                } catch (Exception e) {
                    kb0.t("MultiInputVG", "Error releasing GlObjectsProvider", e);
                    return;
                }
            case 9:
                l34 l34Var = (l34) ((sn3) this.y).y;
                l34Var.d.b(l34Var.s);
                return;
            case 10:
                NativeCalls.lambda$openUrl$5((String) this.y);
                return;
            case 11:
                a();
                return;
            case 12:
                ((eo4) this.y).u--;
                return;
            case 13:
                ku4 ku4Var = (ku4) this.y;
                rg3 rg3Var = ku4Var.C;
                if (ku4Var.y == 0) {
                    ku4Var.z = true;
                    rg3Var.e(dg3.ON_PAUSE);
                }
                if (ku4Var.x == 0 && ku4Var.z) {
                    rg3Var.e(dg3.ON_STOP);
                    ku4Var.A = true;
                    return;
                }
                return;
            case 14:
                i65.a((i65) this.y);
                return;
            case 15:
                x65 x65Var = (x65) this.y;
                if (x65Var.c > 0) {
                    objArr = true;
                } else {
                    objArr = false;
                }
                if (x65Var.n.compareAndSet(false, true) && objArr != false) {
                    tl7.z(x65Var.k.getCoroutineScope(), x65Var.q, null, new hu1(x65Var, objArr2 == true ? 1 : 0, (byte) 21), 2);
                    return;
                }
                return;
            case 16:
                ((ScreenCapturerAndroid) this.y).updateVirtualDisplay();
                return;
            case 17:
                ((InitializationListener) this.y).onInitializationComplete(null);
                return;
            case 18:
                qi5 qi5Var = (qi5) this.y;
                Bitmap createBitmap = Bitmap.createBitmap(16, 16, Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(SubtitleArgbColor.BLACK);
                qi5Var.i(createBitmap);
                return;
            case 19:
                ((oi5) this.y).b();
                return;
            case 20:
                pi5 pi5Var = (pi5) this.y;
                try {
                    if (!pi5Var.d.v) {
                        pi5Var.d.h();
                        pi5Var.c += pi5Var.d.x;
                        pi5Var.d.n.release();
                        qi5 qi5Var2 = pi5Var.d;
                        qi5Var2.l = false;
                        int i3 = qi5Var2.m + 1;
                        qi5Var2.m = i3;
                        o15 o15Var = qi5Var2.a;
                        if (i3 == o15Var.A) {
                            qi5Var2.m = 0;
                            qi5Var2.r++;
                        } else {
                            i = i3;
                        }
                        qr1 qr1Var = (qr1) o15Var.get(i);
                        qi5 qi5Var3 = pi5Var.d;
                        l33 l33Var = qi5Var3.c;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        qi5 qi5Var4 = pi5Var.d;
                        qi5Var3.n = l33Var.i(qr1Var, myLooper, qi5Var4, qi5Var4.d);
                        pi5Var.d.n.start();
                        return;
                    }
                    return;
                } catch (RuntimeException e2) {
                    pi5Var.d.b(oz1.a(e2, UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT));
                    return;
                }
            case 21:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) ((sn3) this.y).y;
                byte b = sideSheetBehavior.x;
                if (b == 2 && b != 0) {
                    sideSheetBehavior.x = (byte) 0;
                    return;
                }
                return;
            case 22:
                ok2 ok2Var = (ok2) this.y;
                ((up5) ok2Var.z).d.b(ok2Var.y);
                return;
            case 23:
                View view = (View) this.y;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 24:
                gw5 gw5Var = (gw5) this.y;
                int i4 = gw5.I;
                Surface surface = gw5Var.E;
                if (surface != null) {
                    Iterator it2 = gw5Var.x.iterator();
                    while (it2.hasNext()) {
                        ((py1) it2.next()).x.y1(null);
                    }
                }
                SurfaceTexture surfaceTexture = gw5Var.D;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                gw5Var.D = null;
                gw5Var.E = null;
                return;
            case 25:
                ((CountDownLatch) this.y).countDown();
                return;
            case 26:
                uc6 uc6Var = (uc6) this.y;
                dn0 dn0Var = uc6Var.b;
                uc6Var.n = null;
                z44 z44Var = uc6Var.m;
                View view2 = uc6Var.a;
                if (!view2.isFocused() && (findFocus = view2.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    z44Var.h();
                    return;
                }
                Object[] objArr3 = z44Var.x;
                int i5 = z44Var.z;
                Boolean bool2 = null;
                for (int i6 = 0; i6 < i5; i6++) {
                    tc6 tc6Var = (tc6) objArr3[i6];
                    int ordinal = tc6Var.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2 && ordinal != 3) {
                                ze0.l();
                                return;
                            }
                            if (!a34.i(bool, Boolean.FALSE)) {
                                if (tc6Var == tc6.z) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                bool2 = Boolean.valueOf(z);
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    bool2 = bool;
                }
                z44Var.h();
                if (a34.i(bool, Boolean.TRUE)) {
                    ((InputMethodManager) ((rb3) dn0Var.z).getValue()).restartInput((View) dn0Var.y);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        ((sn3) ((fq3) dn0Var.A).y).Q();
                    } else {
                        ((sn3) ((fq3) dn0Var.A).y).I();
                    }
                }
                if (a34.i(bool, Boolean.FALSE)) {
                    ((InputMethodManager) ((rb3) dn0Var.z).getValue()).restartInput((View) dn0Var.y);
                    return;
                }
                return;
            case 27:
                ((HandlerThread) this.y).quitSafely();
                return;
            case 28:
                UnityAdsImplementation.lambda$load$2((InternalLoadListener) this.y);
                return;
            default:
                VideoFileRenderer.c((VideoFileRenderer) this.y);
                return;
        }
    }
}
