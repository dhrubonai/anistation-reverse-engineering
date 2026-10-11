package f;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallerInitializer;
import c1.c1;
import c1.e1;
import c1.p1;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import j1.b1;
import j1.d1;
import j1.f1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import m8.v0;
import msr.pistream.app.ui.home.screens.MainActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3752a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3753b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3754c;

    public /* synthetic */ m0(int i10, Object obj, Object obj2) {
        this.f3752a = i10;
        this.f3753b = obj;
        this.f3754c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j4;
        boolean z9;
        boolean z10;
        d2.b0 uVar;
        Handler handler;
        List a10;
        String str = null;
        long j10 = -9223372036854775807L;
        boolean z11 = true;
        boolean z12 = true;
        int i10 = 1;
        z11 = true;
        boolean z13 = false;
        z13 = false;
        switch (this.f3752a) {
            case 0:
                n0 n0Var = (n0) this.f3753b;
                Runnable runnable = (Runnable) this.f3754c;
                n0Var.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    n0Var.a();
                }
            case 1:
                ((z7.c) this.f3753b).r((Typeface) this.f3754c);
                return;
            case 2:
            default:
                v8.b bVar = (v8.b) this.f3753b;
                PopupWindow popupWindow = (PopupWindow) this.f3754c;
                j1.p f10 = bVar.f10696a.f();
                if (f10 != null) {
                    try {
                        j1.d0 d0Var = (j1.d0) f10;
                        d0Var.h0();
                        if (d0Var.f5678h instanceof y1.p) {
                            j1.d0 d0Var2 = (j1.d0) f10;
                            d0Var2.h0();
                            y1.p pVar = (y1.p) d0Var2.f5678h;
                            y1.i d10 = pVar.d();
                            d10.j(true);
                            pVar.o(new y1.j(d10));
                        }
                    } catch (Exception e10) {
                        Log.e("PlayerActivity", "exception", e10);
                    }
                }
                popupWindow.dismiss();
                return;
            case 3:
                String str2 = (String) this.f3753b;
                v0.e eVar = (v0.e) this.f3754c;
                v0.b bVar2 = v0.c.f10351a;
                r6.h0.u(eVar, "$violation");
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str2, eVar);
                throw eVar;
            case 4:
                ((z1.e) this.f3754c).a(((f1.r) this.f3753b).c());
                return;
            case 5:
                j1.d0 d0Var3 = (j1.d0) this.f3753b;
                j1.g0 g0Var = (j1.g0) this.f3754c;
                int i11 = d0Var3.F - g0Var.f5752c;
                d0Var3.F = i11;
                if (g0Var.f5753d) {
                    d0Var3.G = g0Var.f5754e;
                    d0Var3.H = true;
                }
                if (g0Var.f5755f) {
                    d0Var3.I = g0Var.f5756g;
                }
                if (i11 == 0) {
                    e1 e1Var = g0Var.f5751b.f5636a;
                    if (!d0Var3.f5675f0.f5636a.q() && e1Var.q()) {
                        d0Var3.f5677g0 = -1;
                        d0Var3.f5679h0 = 0L;
                    }
                    if (!e1Var.q()) {
                        List asList = Arrays.asList(((f1) e1Var).f5742h);
                        if (asList.size() == d0Var3.o.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        w7.b.u(z10);
                        for (int i12 = 0; i12 < asList.size(); i12++) {
                            ((j1.b0) d0Var3.o.get(i12)).f5634b = (e1) asList.get(i12);
                        }
                    }
                    if (d0Var3.H) {
                        if (g0Var.f5751b.f5637b.equals(d0Var3.f5675f0.f5637b) && g0Var.f5751b.f5639d == d0Var3.f5675f0.f5652r) {
                            z11 = false;
                        }
                        if (z11) {
                            if (!e1Var.q() && !g0Var.f5751b.f5637b.b()) {
                                b1 b1Var = g0Var.f5751b;
                                v1.w wVar = b1Var.f5637b;
                                long j11 = b1Var.f5639d;
                                Object obj = wVar.f10559a;
                                c1 c1Var = d0Var3.f5685n;
                                e1Var.h(obj, c1Var);
                                j10 = j11 + c1Var.f1645e;
                            } else {
                                j10 = g0Var.f5751b.f5639d;
                            }
                        }
                        j4 = j10;
                        z9 = z11;
                    } else {
                        j4 = -9223372036854775807L;
                        z9 = false;
                    }
                    d0Var3.H = false;
                    d0Var3.e0(g0Var.f5751b, 1, d0Var3.I, z9, d0Var3.G, j4, -1, false);
                    return;
                }
                return;
            case 6:
                j1.j0 j0Var = (j1.j0) this.f3753b;
                d1 d1Var = (d1) this.f3754c;
                j0Var.getClass();
                try {
                    synchronized (d1Var) {
                    }
                    try {
                        d1Var.f5697a.e(d1Var.f5700d, d1Var.f5701e);
                        return;
                    } finally {
                        d1Var.b(true);
                    }
                } catch (j1.m e11) {
                    f1.o.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e11);
                    throw new RuntimeException(e11);
                }
            case zzaja.zze.zzg /* 7 */:
                androidx.appcompat.widget.a0 a0Var = (androidx.appcompat.widget.a0) this.f3753b;
                final String str3 = (String) this.f3754c;
                l1.s sVar = (l1.s) a0Var.f404c;
                int i13 = f1.b0.f3799a;
                k1.a0 a0Var2 = (k1.a0) ((j1.z) sVar).f5932a.f5687q;
                final k1.b V = a0Var2.V();
                final int i14 = z13 ? 1 : 0;
                a0Var2.W(V, 1012, new f1.l(V, str3, i14) { // from class: k1.t

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f6400a;

                    {
                        this.f6400a = i14;
                    }

                    @Override // f1.l
                    public final void invoke(Object obj2) {
                        switch (this.f6400a) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                ((c) obj2).getClass();
                                return;
                        }
                    }
                });
                return;
            case 8:
                o1.h hVar = (o1.h) this.f3753b;
                c1.v vVar = (c1.v) this.f3754c;
                o1.i iVar = hVar.f8146d;
                if (iVar.F != 0 && !hVar.f8145c) {
                    Looper looper = iVar.J;
                    looper.getClass();
                    hVar.f8144b = iVar.b(looper, hVar.f8143a, vVar, false);
                    iVar.D.add(hVar);
                    return;
                }
                return;
            case 9:
                q1.b bVar3 = (q1.b) this.f3753b;
                Uri uri = (Uri) this.f3754c;
                bVar3.f8981z = false;
                bVar3.b(uri);
                return;
            case 10:
                v1.m0 m0Var = (v1.m0) this.f3753b;
                d2.b0 b0Var = (d2.b0) this.f3754c;
                if (m0Var.J == null) {
                    uVar = b0Var;
                } else {
                    uVar = new d2.u(-9223372036854775807L);
                }
                m0Var.Q = uVar;
                if (b0Var.l() == -9223372036854775807L && m0Var.R != -9223372036854775807L) {
                    m0Var.Q = new v1.h0(m0Var, m0Var.Q);
                }
                m0Var.R = m0Var.Q.l();
                if (!m0Var.X && b0Var.l() == -9223372036854775807L) {
                    z13 = true;
                }
                m0Var.S = z13;
                if (z13) {
                    i10 = 7;
                }
                m0Var.T = i10;
                m0Var.f10475x.u(m0Var.R, b0Var.g(), m0Var.S);
                if (!m0Var.N) {
                    m0Var.z();
                    return;
                }
                return;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                ((b2.g0) this.f3753b).d();
                return;
            case 12:
                b2.d dVar = (b2.d) this.f3753b;
                b2.g0 g0Var2 = (b2.g0) this.f3754c;
                dVar.getClass();
                w7.b.w(null);
                g0Var2.e();
                return;
            case 13:
                b2.e0 e0Var = (b2.e0) this.f3753b;
                Exception exc = (Exception) this.f3754c;
                e0Var.getClass();
                int i15 = f1.b0.f3799a;
                k1.a0 a0Var3 = (k1.a0) ((j1.z) e0Var.f1337b).f5932a.f5687q;
                k1.b V2 = a0Var3.V();
                a0Var3.W(V2, 1030, new k1.y(V2, exc, 0));
                return;
            case 14:
                b2.e0 e0Var2 = (b2.e0) this.f3753b;
                p1 p1Var = (p1) this.f3754c;
                e0Var2.getClass();
                int i16 = f1.b0.f3799a;
                j1.d0 d0Var4 = ((j1.z) e0Var2.f1337b).f5932a;
                d0Var4.f5671d0 = p1Var;
                d0Var4.f5683l.l(25, new w.f(p1Var, 9));
                return;
            case 15:
                b2.e0 e0Var3 = (b2.e0) this.f3753b;
                final String str4 = (String) this.f3754c;
                e0Var3.getClass();
                int i17 = f1.b0.f3799a;
                k1.a0 a0Var4 = (k1.a0) ((j1.z) e0Var3.f1337b).f5932a.f5687q;
                final k1.b V3 = a0Var4.V();
                final int i18 = z11 ? 1 : 0;
                a0Var4.W(V3, 1019, new f1.l(V3, str4, i18) { // from class: k1.t

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f6400a;

                    {
                        this.f6400a = i18;
                    }

                    @Override // f1.l
                    public final void invoke(Object obj2) {
                        switch (this.f6400a) {
                            case 0:
                                ((c) obj2).getClass();
                                return;
                            default:
                                ((c) obj2).getClass();
                                return;
                        }
                    }
                });
                return;
            case 16:
                c2.k kVar = (c2.k) this.f3753b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.f3754c;
                SurfaceTexture surfaceTexture2 = kVar.f2021x;
                Surface surface = kVar.f2022y;
                Surface surface2 = new Surface(surfaceTexture);
                kVar.f2021x = surfaceTexture;
                kVar.f2022y = surface2;
                Iterator it = kVar.f2015a.iterator();
                while (it.hasNext()) {
                    ((j1.z) it.next()).f5932a.Z(surface2);
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                if (surface != null) {
                    surface.release();
                    return;
                }
                return;
            case 17:
                ProfileInstallerInitializer profileInstallerInitializer = (ProfileInstallerInitializer) this.f3753b;
                Context context = (Context) this.f3754c;
                profileInstallerInitializer.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = k3.i.a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new k3.f(context, z13 ? 1 : 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            case 18:
                h8.x xVar = (h8.x) this.f3753b;
                a8.b bVar4 = (a8.b) this.f3754c;
                xVar.getClass();
                ArrayList arrayList = new ArrayList();
                if (bVar4 != null) {
                    try {
                        str = r6.h0.N0(bVar4);
                    } catch (Exception unused) {
                    }
                }
                e8.a aVar = xVar.f5120a.f5044b.f5051t0;
                if (str != null && !str.isEmpty() && aVar != null && (a10 = aVar.a(str)) != null) {
                    arrayList.addAll(a10);
                }
                androidx.fragment.app.b0 b0Var2 = xVar.f5122c;
                if (b0Var2 != null) {
                    b0Var2.runOnUiThread(new m0(19, xVar, arrayList));
                    return;
                }
                return;
            case 19:
                h8.x xVar2 = (h8.x) this.f3753b;
                List list = (List) this.f3754c;
                AlertDialog alertDialog = xVar2.f5142x;
                if (alertDialog != null && alertDialog.isShowing()) {
                    xVar2.f5129j = list;
                    xVar2.f();
                    return;
                }
                return;
            case 20:
                com.google.android.gms.common.api.internal.i0 i0Var = (com.google.android.gms.common.api.internal.i0) this.f3753b;
                String str5 = (String) this.f3754c;
                i0Var.getClass();
                try {
                    TextView textView = (TextView) i0Var.f2433c;
                    if (str5 == null) {
                        str5 = "";
                    }
                    textView.setText(str5);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 21:
                MainActivity mainActivity = (MainActivity) this.f3753b;
                c8.c cVar = (c8.c) this.f3754c;
                int i19 = MainActivity.f7741b0;
                mainActivity.getClass();
                try {
                    if (!mainActivity.isFinishing() && !mainActivity.isDestroyed()) {
                        try {
                            Dialog dialog = mainActivity.Y;
                            if (dialog != null && dialog.isShowing()) {
                                mainActivity.Y.dismiss();
                            }
                        } catch (Exception unused3) {
                        }
                        mainActivity.Y = null;
                        boolean z14 = cVar.f2088f;
                        if (z14) {
                            mainActivity.B = true;
                        }
                        if (z14) {
                            z12 = false;
                        }
                        mainActivity.A = q6.g.j0(mainActivity, cVar, z12, new k1.x(15, mainActivity, cVar));
                        return;
                    }
                    return;
                } catch (Exception e12) {
                    Log.e("MainActivity", "update dialog", e12);
                    return;
                }
            case 22:
                MainActivity mainActivity2 = (MainActivity) this.f3753b;
                String str6 = (String) this.f3754c;
                int i20 = MainActivity.f7741b0;
                mainActivity2.getClass();
                try {
                    Toast.makeText(mainActivity2, str6, 0).show();
                    return;
                } catch (Exception unused4) {
                    return;
                }
            case 23:
                l8.h0 h0Var = (l8.h0) this.f3753b;
                View view = (View) this.f3754c;
                int i21 = l8.h0.C0;
                if (h0Var.V()) {
                    int indexOfChild = h0Var.f6947x0.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        h0Var.f6947x0.removeViewAt(indexOfChild);
                    }
                    h0Var.d0("Could not load schedule. Pull down to retry.");
                    return;
                }
                return;
            case 24:
                l8.n0 n0Var2 = (l8.n0) this.f3753b;
                LinearLayout linearLayout = (LinearLayout) this.f3754c;
                int i22 = l8.n0.L0;
                if (n0Var2.V()) {
                    linearLayout.removeAllViews();
                    l8.z zVar = n0Var2.f6987u0;
                    if (zVar != null) {
                        linearLayout.addView(zVar.o("Not Found", "Top search could not be loaded."));
                        return;
                    }
                    return;
                }
                return;
            case 25:
                l8.r0 r0Var = (l8.r0) this.f3753b;
                List list2 = (List) this.f3754c;
                int i23 = l8.r0.D0;
                if (r0Var.q() && r0Var.V != null) {
                    r0Var.Z(list2);
                    return;
                }
                return;
            case 26:
                Runnable runnable2 = (Runnable) this.f3754c;
                l8.z zVar2 = (l8.z) this.f3753b;
                int[] iArr = v0.f7722a;
                runnable2.run();
                zVar2.f();
                return;
            case 27:
                z3.e eVar2 = (z3.e) this.f3753b;
                FrameLayout frameLayout = (FrameLayout) this.f3754c;
                if (((n8.a) eVar2.f12044b).n() && frameLayout != null) {
                    frameLayout.setVisibility(8);
                    return;
                }
                return;
            case 28:
                s8.a aVar2 = (s8.a) this.f3753b;
                Integer num = (Integer) this.f3754c;
                aVar2.getClass();
                int intValue = num.intValue();
                s8.b bVar5 = aVar2.f9932b;
                bVar5.i(intValue, true, false);
                bVar5.f9948q = false;
                return;
        }
    }

    public /* synthetic */ m0(v1.z zVar, l8.z zVar2) {
        this.f3752a = 26;
        this.f3754c = zVar;
        this.f3753b = zVar2;
    }
}
