package msr.pistream.app.ui.home.screens;

import a8.h;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.s0;
import androidx.fragment.app.y;
import androidx.lifecycle.a1;
import c8.b;
import com.google.android.gms.common.api.internal.i0;
import com.google.firebase.auth.FirebaseAuth;
import dagger.hilt.android.AndroidEntryPoint;
import f.m0;
import f1.k;
import f8.g;
import h8.v;
import i8.c;
import i8.f;
import i8.l;
import i8.m;
import i8.n;
import j3.j;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k8.a;
import l8.a0;
import l8.b0;
import l8.n0;
import l8.u;
import l8.w;
import l8.x;
import l8.z;
import m8.d0;
import m8.k0;
import m8.l0;
import m8.r;
import m8.v0;
import msr.pistream.app.R;
import msr.pistream.app.ui.auth.WelcomeActivity;
import msr.pistream.app.ui.detail.DetailActivity;
import msr.pistream.app.ui.home.screens.MainActivity;
import msr.pistream.app.ui.player.PlayerActivity;
import msr.pistream.app.viewmodel.FilterViewModel;
import msr.pistream.app.viewmodel.HomeViewModel;
import org.json.JSONObject;
import r6.h0;
import w8.i;
import z3.e;
import z7.d;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class MainActivity extends g implements c {

    /* renamed from: b0, reason: collision with root package name */
    public static final int f7741b0 = View.generateViewId();

    /* renamed from: c0, reason: collision with root package name */
    public static final int f7742c0 = View.generateViewId();

    /* renamed from: d0, reason: collision with root package name */
    public static final int f7743d0 = View.generateViewId();

    /* renamed from: e0, reason: collision with root package name */
    public static final int f7744e0 = View.generateViewId();

    /* renamed from: f0, reason: collision with root package name */
    public static final int f7745f0 = View.generateViewId();
    public i0 A;
    public boolean B;
    public e C;
    public final ExecutorService D;
    public final Handler E;
    public final a F;
    public n G;
    public LinearLayout H;
    public a0 I;
    public FrameLayout J;
    public FrameLayout K;
    public g8.c L;
    public boolean M;
    public g8.c N;
    public f O;
    public String P;
    public String Q;
    public k8.f R;
    public int S;
    public final ArrayDeque T;
    public LinearLayout U;
    public final HashMap V;
    public i.g W;
    public e X;
    public Dialog Y;
    public Consumer Z;

    /* renamed from: a0, reason: collision with root package name */
    public Consumer f7746a0;

    /* renamed from: x, reason: collision with root package name */
    public HomeViewModel f7747x;

    /* renamed from: y, reason: collision with root package name */
    public FilterViewModel f7748y;

    /* renamed from: z, reason: collision with root package name */
    public y7.a f7749z;

    public MainActivity() {
        super(2);
        this.D = Executors.newFixedThreadPool(4);
        this.E = new Handler(Looper.getMainLooper());
        this.F = new a();
        this.P = "home";
        this.Q = "Filter";
        this.S = 0;
        this.T = new ArrayDeque();
        this.V = new HashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, l4.a, com.bumptech.glide.l] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void u(msr.pistream.app.ui.home.screens.MainActivity r6, java.util.List r7) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: msr.pistream.app.ui.home.screens.MainActivity.u(msr.pistream.app.ui.home.screens.MainActivity, java.util.List):void");
    }

    public static boolean v(MainActivity mainActivity) {
        ConnectivityManager connectivityManager = (ConnectivityManager) mainActivity.getSystemService("connectivity");
        if (connectivityManager == null) {
            return true;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null && (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(4))) {
            return true;
        }
        return false;
    }

    public static EditText w(MainActivity mainActivity, String str, String str2) {
        mainActivity.getClass();
        EditText editText = new EditText(mainActivity);
        editText.setSingleLine(true);
        editText.setHint(str);
        editText.setText(str2);
        editText.setTextColor(-1);
        editText.setHintTextColor(i.f11068h);
        editText.setTextSize(14.0f);
        editText.setPadding(i.e(mainActivity, 20), 0, i.e(mainActivity, 20), 0);
        editText.setBackgroundResource(R.drawable.bg_search);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i.e(mainActivity, 60));
        layoutParams.setMargins(0, i.e(mainActivity, 16), 0, 0);
        editText.setLayoutParams(layoutParams);
        return editText;
    }

    public static void x(final MainActivity mainActivity) {
        mainActivity.P = "profile_sub";
        mainActivity.H.removeAllViews();
        mainActivity.z("General settings");
        LinearLayout linearLayout = mainActivity.H;
        final z zVar = new z(mainActivity, 7);
        LinearLayout w02 = h0.w0(linearLayout, mainActivity);
        w02.addView(h0.G0(mainActivity, "Search"), h0.H0(mainActivity));
        LinearLayout E0 = h0.E0(mainActivity);
        final int i10 = 1;
        final int i11 = 0;
        h0.c(mainActivity, E0, h0.Z0(mainActivity, R.drawable.ic_search, "Search history", "Save what you search so it shows up as Recent Searches", com.bumptech.glide.c.b0(mainActivity).getBoolean("search_history_enabled", true), new Consumer() { // from class: m8.t
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Context context = mainActivity;
                l8.z zVar2 = zVar;
                com.bumptech.glide.c.b0(context).edit().putBoolean("search_history_enabled", ((Boolean) obj).booleanValue()).apply();
                zVar2.f();
            }
        }, new d0() { // from class: m8.u
            @Override // m8.d0
            public final ImageView d(int i12, int i13, int i14, int i15) {
                int i16 = i11;
                l8.z zVar2 = zVar;
                switch (i16) {
                    case 0:
                        return zVar2.b(i12, i13, i14, i15);
                    default:
                        return zVar2.b(i12, i13, i14, i15);
                }
            }
        }), false);
        int i12 = com.bumptech.glide.c.b0(mainActivity).getInt("search_history_limit", 10);
        LinearLayout v02 = h0.v0(mainActivity, R.drawable.ic_search, "History limit", i12 + " searches", new d0() { // from class: m8.u
            @Override // m8.d0
            public final ImageView d(int i122, int i13, int i14, int i15) {
                int i16 = i10;
                l8.z zVar2 = zVar;
                switch (i16) {
                    case 0:
                        return zVar2.b(i122, i13, i14, i15);
                    default:
                        return zVar2.b(i122, i13, i14, i15);
                }
            }
        });
        v02.setOnClickListener(new v(zVar, i12, mainActivity, 3));
        h0.c(mainActivity, E0, v02, true);
        w02.addView(E0, h0.F0());
    }

    public static void y(MainActivity mainActivity) {
        mainActivity.P = "profile_sub";
        mainActivity.H.removeAllViews();
        mainActivity.z("Player Settings");
        LinearLayout linearLayout = mainActivity.H;
        final z zVar = new z(mainActivity, 10);
        LinearLayout w02 = h0.w0(linearLayout, mainActivity);
        w02.addView(h0.G0(mainActivity, "Playback behavior"), h0.H0(mainActivity));
        LinearLayout E0 = h0.E0(mainActivity);
        final int i10 = 1;
        final int i11 = 2;
        final int i12 = 0;
        h0.c(mainActivity, E0, h0.Z0(mainActivity, R.drawable.ic_player_settings, "Auto rotate player", "Follow device rotation while watching", com.bumptech.glide.c.b0(mainActivity).getBoolean("player_auto_rotate", true), new r(mainActivity, i11), new d0() { // from class: m8.z
            @Override // m8.d0
            public final ImageView d(int i13, int i14, int i15, int i16) {
                int i17 = i12;
                l8.z zVar2 = zVar;
                switch (i17) {
                    case 0:
                        return zVar2.b(i13, i14, i15, i16);
                    case 1:
                        return zVar2.b(i13, i14, i15, i16);
                    default:
                        return zVar2.b(i13, i14, i15, i16);
                }
            }
        }), false);
        h0.c(mainActivity, E0, h0.Z0(mainActivity, R.drawable.ic_player_settings, "Remember last episode", "Resume where you left off next time", com.bumptech.glide.c.b0(mainActivity).getBoolean("player_remember_last_episode", true), new r(mainActivity, 3), new d0() { // from class: m8.z
            @Override // m8.d0
            public final ImageView d(int i13, int i14, int i15, int i16) {
                int i17 = i10;
                l8.z zVar2 = zVar;
                switch (i17) {
                    case 0:
                        return zVar2.b(i13, i14, i15, i16);
                    case 1:
                        return zVar2.b(i13, i14, i15, i16);
                    default:
                        return zVar2.b(i13, i14, i15, i16);
                }
            }
        }), true);
        w02.addView(E0, h0.F0());
        w02.addView(h0.G0(mainActivity, "Seek"), h0.H0(mainActivity));
        LinearLayout E02 = h0.E0(mainActivity);
        int y9 = com.bumptech.glide.c.y(mainActivity) / 1000;
        LinearLayout v02 = h0.v0(mainActivity, R.drawable.ic_player_settings, "Skip duration", y9 + " seconds", new d0() { // from class: m8.z
            @Override // m8.d0
            public final ImageView d(int i13, int i14, int i15, int i16) {
                int i17 = i11;
                l8.z zVar2 = zVar;
                switch (i17) {
                    case 0:
                        return zVar2.b(i13, i14, i15, i16);
                    case 1:
                        return zVar2.b(i13, i14, i15, i16);
                    default:
                        return zVar2.b(i13, i14, i15, i16);
                }
            }
        });
        v02.setOnClickListener(new v(zVar, y9, mainActivity, 4));
        h0.c(mainActivity, E02, v02, true);
        w02.addView(E02, h0.F0());
        TextView l10 = i.l(mainActivity, "Used by the forward/rewind buttons and double-tap seek in the player", 13, i.f11068h, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(i.e(mainActivity, 6), i.e(mainActivity, 10), 0, 0);
        w02.addView(l10, layoutParams);
    }

    public final void A(LinearLayout linearLayout, int i10, int i11, boolean z9, w wVar) {
        int i12;
        if (z9) {
            i12 = -1;
        } else {
            i12 = 0;
        }
        ImageView E = E(i10, 48, 48, i12);
        if (!z9) {
            E.clearColorFilter();
        }
        int e10 = i.e(this, 4);
        E.setPadding(e10, e10, e10, e10);
        E.setOnClickListener(wVar);
        i.c(E);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i.e(this, 48), i.e(this, 48));
        layoutParams.setMargins(i.e(this, i11), 0, 0, 0);
        linearLayout.addView(E, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(boolean r7) {
        /*
            r6 = this;
            java.lang.String r0 = "pistream_update"
            if (r7 != 0) goto L3d
            r1 = 0
            android.content.Context r2 = r6.getApplicationContext()     // Catch: java.lang.Exception -> L29
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Exception -> L29
            java.lang.String r3 = "last_check_ms"
            r4 = 0
            long r2 = r2.getLong(r3, r4)     // Catch: java.lang.Exception -> L29
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 > 0) goto L1a
            goto L29
        L1a:
            long r4 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L29
            long r4 = r4 - r2
            r2 = 1800000(0x1b7740, double:8.89318E-318)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto L27
            goto L29
        L27:
            r2 = r1
            goto L2a
        L29:
            r2 = 1
        L2a:
            if (r2 != 0) goto L3d
            android.content.Context r2 = r6.getApplicationContext()     // Catch: java.lang.Exception -> L3a
            android.content.SharedPreferences r0 = r2.getSharedPreferences(r0, r1)     // Catch: java.lang.Exception -> L3a
            java.lang.String r2 = "force_pending"
            boolean r1 = r0.getBoolean(r2, r1)     // Catch: java.lang.Exception -> L3a
        L3a:
            if (r1 != 0) goto L3d
            return
        L3d:
            java.util.concurrent.ExecutorService r0 = r6.D     // Catch: java.lang.Exception -> L49
            l1.p r1 = new l1.p     // Catch: java.lang.Exception -> L49
            r2 = 2
            r1.<init>(r2, r6, r7)     // Catch: java.lang.Exception -> L49
            r0.execute(r1)     // Catch: java.lang.Exception -> L49
            goto L51
        L49:
            r7 = move-exception
            java.lang.String r0 = "MainActivity"
            java.lang.String r1 = "update gate"
            android.util.Log.e(r0, r1, r7)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: msr.pistream.app.ui.home.screens.MainActivity.B(boolean):void");
    }

    public final void C() {
        FrameLayout frameLayout = this.J;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            this.J.setVisibility(8);
        }
        FrameLayout frameLayout2 = this.K;
        if (frameLayout2 != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams.topMargin = 0;
            this.K.setLayoutParams(layoutParams);
        }
    }

    public final void D() {
        y C = getSupportFragmentManager().C("filter_fragment");
        if (C != null) {
            s0 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.i(C);
            aVar.f();
        }
        y C2 = getSupportFragmentManager().C("schedule_fragment");
        if (C2 != null) {
            s0 supportFragmentManager2 = getSupportFragmentManager();
            supportFragmentManager2.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
            aVar2.i(C2);
            aVar2.f();
        }
        y C3 = getSupportFragmentManager().C("grid_fragment");
        if (C3 != null) {
            s0 supportFragmentManager3 = getSupportFragmentManager();
            supportFragmentManager3.getClass();
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager3);
            aVar3.i(C3);
            aVar3.f();
        }
        y C4 = getSupportFragmentManager().C("search_fragment");
        if (C4 != null) {
            s0 supportFragmentManager4 = getSupportFragmentManager();
            supportFragmentManager4.getClass();
            androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(supportFragmentManager4);
            aVar4.i(C4);
            aVar4.f();
        }
        y C5 = getSupportFragmentManager().C("my_list_fragment");
        if (C5 != null) {
            s0 supportFragmentManager5 = getSupportFragmentManager();
            supportFragmentManager5.getClass();
            androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(supportFragmentManager5);
            aVar5.i(C5);
            aVar5.f();
        }
        y C6 = getSupportFragmentManager().C("profile_fragment");
        if (C6 != null) {
            s0 supportFragmentManager6 = getSupportFragmentManager();
            supportFragmentManager6.getClass();
            androidx.fragment.app.a aVar6 = new androidx.fragment.app.a(supportFragmentManager6);
            aVar6.i(C6);
            aVar6.f();
        }
        y C7 = getSupportFragmentManager().C("downloads_fragment");
        if (C7 != null) {
            s0 supportFragmentManager7 = getSupportFragmentManager();
            supportFragmentManager7.getClass();
            androidx.fragment.app.a aVar7 = new androidx.fragment.app.a(supportFragmentManager7);
            aVar7.i(C7);
            aVar7.f();
        }
        y C8 = getSupportFragmentManager().C("upcoming_fragment");
        if (C8 != null) {
            s0 supportFragmentManager8 = getSupportFragmentManager();
            supportFragmentManager8.getClass();
            androidx.fragment.app.a aVar8 = new androidx.fragment.app.a(supportFragmentManager8);
            aVar8.i(C8);
            aVar8.f();
        }
        ArrayDeque arrayDeque = this.T;
        if (!arrayDeque.isEmpty()) {
            ((Runnable) arrayDeque.pop()).run();
            return;
        }
        if ("profile_sub".equals(this.P)) {
            S();
            return;
        }
        if (!"search".equals(this.P) && !"grid".equals(this.P) && !"filter".equals(this.P)) {
            if (!"home".equals(this.P)) {
                Q();
                return;
            } else {
                moveTaskToBack(true);
                return;
            }
        }
        Q();
    }

    public final ImageView E(int i10, int i11, int i12, int i13) {
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(i10);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (i13 != 0) {
            imageView.setColorFilter(i13);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i.e(this, i11), i.e(this, i12));
        layoutParams.setMargins(0, 0, 0, 0);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    public final void F() {
        y C = getSupportFragmentManager().C("filter_fragment");
        if (C != null) {
            s0 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.i(C);
            aVar.f();
        }
        y C2 = getSupportFragmentManager().C("schedule_fragment");
        if (C2 != null) {
            s0 supportFragmentManager2 = getSupportFragmentManager();
            supportFragmentManager2.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
            aVar2.i(C2);
            aVar2.f();
        }
        y C3 = getSupportFragmentManager().C("grid_fragment");
        if (C3 != null) {
            s0 supportFragmentManager3 = getSupportFragmentManager();
            supportFragmentManager3.getClass();
            androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager3);
            aVar3.i(C3);
            aVar3.f();
        }
        y C4 = getSupportFragmentManager().C("search_fragment");
        if (C4 != null) {
            s0 supportFragmentManager4 = getSupportFragmentManager();
            supportFragmentManager4.getClass();
            androidx.fragment.app.a aVar4 = new androidx.fragment.app.a(supportFragmentManager4);
            aVar4.i(C4);
            aVar4.f();
        }
        y C5 = getSupportFragmentManager().C("my_list_fragment");
        if (C5 != null) {
            s0 supportFragmentManager5 = getSupportFragmentManager();
            supportFragmentManager5.getClass();
            androidx.fragment.app.a aVar5 = new androidx.fragment.app.a(supportFragmentManager5);
            aVar5.i(C5);
            aVar5.f();
        }
        y C6 = getSupportFragmentManager().C("profile_fragment");
        if (C6 != null) {
            s0 supportFragmentManager6 = getSupportFragmentManager();
            supportFragmentManager6.getClass();
            androidx.fragment.app.a aVar6 = new androidx.fragment.app.a(supportFragmentManager6);
            aVar6.i(C6);
            aVar6.f();
        }
        y C7 = getSupportFragmentManager().C("downloads_fragment");
        if (C7 != null) {
            s0 supportFragmentManager7 = getSupportFragmentManager();
            supportFragmentManager7.getClass();
            androidx.fragment.app.a aVar7 = new androidx.fragment.app.a(supportFragmentManager7);
            aVar7.i(C7);
            aVar7.f();
        }
        y C8 = getSupportFragmentManager().C("upcoming_fragment");
        if (C8 != null) {
            s0 supportFragmentManager8 = getSupportFragmentManager();
            supportFragmentManager8.getClass();
            androidx.fragment.app.a aVar8 = new androidx.fragment.app.a(supportFragmentManager8);
            aVar8.i(C8);
            aVar8.f();
        }
        a0 a0Var = this.I;
        if (a0Var != null) {
            a0Var.setOnScrollChangeListener(null);
        }
        g8.c cVar = this.N;
        if (cVar != null) {
            cVar.setVisibility(8);
        }
        V();
        this.S++;
    }

    public final void G(Intent intent) {
        if (intent != null && intent.getBooleanExtra("open_storage_settings", false)) {
            O();
            return;
        }
        if (intent != null && intent.getBooleanExtra("open_download_settings", false)) {
            intent.removeExtra("open_download_settings");
            K();
        } else if (intent != null && "pistream.show_downloads".equals(intent.getAction())) {
            L();
        } else {
            Q();
        }
    }

    public final void H() {
        Object orDefault;
        if (this.I != null) {
            orDefault = this.V.getOrDefault(this.P, 0);
            int intValue = ((Integer) orDefault).intValue();
            this.I.scrollTo(0, intValue);
            if (intValue > 0) {
                this.I.getViewTreeObserver().addOnPreDrawListener(new b0(this, intValue));
            }
        }
    }

    public final ArrayList I(int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        FilterViewModel filterViewModel = this.f7748y;
        HomeViewModel homeViewModel = this.f7747x;
        String str6 = (String) filterViewModel.f7800a.d();
        String str7 = (String) filterViewModel.f7801b.d();
        String str8 = (String) filterViewModel.f7802c.d();
        String str9 = (String) filterViewModel.f7803d.d();
        String str10 = (String) filterViewModel.f7804e.d();
        b bVar = homeViewModel.f7809d.f11637a.f3594a;
        bVar.getClass();
        if (str6 != null && !str6.trim().isEmpty()) {
            str = str6.trim();
        } else {
            str = "1";
        }
        String str11 = str;
        if (str8 == null) {
            str8 = "All";
        }
        if (str7 == null) {
            str7 = "All";
        }
        if (str9 == null) {
            str9 = "All";
        }
        if (str10 == null) {
            str10 = "All";
        }
        if (str8.trim().isEmpty()) {
            str2 = "All";
        } else {
            str2 = str8;
        }
        if (str7.trim().isEmpty()) {
            str3 = "All";
        } else {
            str3 = str7;
        }
        if (str9.trim().isEmpty()) {
            str4 = "All";
        } else {
            str4 = str9;
        }
        if (str10.trim().isEmpty()) {
            str5 = "All";
        } else {
            str5 = str10;
        }
        JSONObject b10 = bVar.f2082a.b(str11, i10, str2, str3, str4, str5, "ForYou");
        if (b10 != null) {
            return h0.Q0(b10);
        }
        throw new IOException("Filter returned nothing");
    }

    public final void J() {
        a0 a0Var;
        String str = this.P;
        if (str != null && !str.isEmpty() && (a0Var = this.I) != null) {
            this.V.put(this.P, Integer.valueOf(a0Var.getScrollY()));
        }
    }

    public final void K() {
        int i10;
        this.O.a(3);
        this.P = "profile_sub";
        this.H.removeAllViews();
        z("Downloads");
        LinearLayout linearLayout = this.H;
        final z zVar = new z(this, 12);
        LinearLayout w02 = h0.w0(linearLayout, this);
        w02.addView(h0.G0(this, "Save location"), h0.H0(this));
        String o = com.bumptech.glide.c.o(com.bumptech.glide.c.p(this));
        int i11 = i.f11068h;
        final int i12 = 1;
        View l10 = i.l(this, o, 15, i11, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        final int i13 = 0;
        layoutParams.setMargins(i.e(this, 6), 0, 0, i.e(this, 12));
        w02.addView(l10, layoutParams);
        int i14 = i.f11067g;
        TextView l11 = i.l(this, "Downloaded episodes will be saved to the Pi Stream Downloads folder inside your selected folder.", 14, i14, 0);
        l11.setLineSpacing(i.e(this, 3), 1.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, i.e(this, 24), 0, 0);
        w02.addView(l11, layoutParams2);
        TextView i15 = i.i(this, "Choose download folder", true);
        i15.setTextSize(16.0f);
        i15.setOnClickListener(new j(zVar, 9));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, i.e(this, 56));
        layoutParams3.setMargins(0, i.e(this, 20), 0, 0);
        w02.addView(i15, layoutParams3);
        w02.addView(h0.G0(this, "Quality"), h0.H0(this));
        final int v9 = com.bumptech.glide.c.v(this);
        TextView l12 = i.l(this, a3.g.o("Preferred: ", v9, "p (tap to change)"), 15, i14, 1);
        int i16 = 8;
        l12.setPadding(0, i.e(this, 8), 0, i.e(this, 8));
        w02.addView(l12, new LinearLayout.LayoutParams(-1, -2));
        l12.setOnClickListener(new View.OnClickListener() { // from class: m8.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i17 = i13;
                int i18 = v9;
                final l8.z zVar2 = zVar;
                final Context context = this;
                int i19 = 0;
                switch (i17) {
                    case 0:
                        String[] strArr = {"1080p", "720p", "480p", "360p"};
                        final int[] iArr = {1080, 720, 480, 360};
                        int i20 = 1;
                        int i21 = 1;
                        while (i19 < 4) {
                            if (iArr[i19] == i18) {
                                i21 = i19;
                            }
                            i19++;
                        }
                        final int[] iArr2 = {i21};
                        new AlertDialog.Builder(context).setTitle("Download quality").setSingleChoiceItems(strArr, i21, new n(iArr2, i20)).setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: m8.q
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i22) {
                                com.bumptech.glide.c.b0(context).edit().putInt("download_quality", iArr[iArr2[0]]).apply();
                                zVar2.f();
                            }
                        }).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).show();
                        return;
                    default:
                        int max = Math.max(0, Math.min(2, i18 - 1));
                        final int[] iArr3 = {max};
                        new AlertDialog.Builder(context).setTitle("Parallel downloads").setSingleChoiceItems(new String[]{"1", "2", "3"}, max, new n(iArr3, i19)).setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: m8.o
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i22) {
                                int i23 = 1;
                                int i24 = iArr3[0] + 1;
                                if (i24 >= 1) {
                                    i23 = i24;
                                }
                                if (i23 > 3) {
                                    i23 = 3;
                                }
                                com.bumptech.glide.c.b0(context).edit().putInt("download_parallel", i23).apply();
                                zVar2.f();
                            }
                        }).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).show();
                        return;
                }
            }
        });
        w02.addView(h0.G0(this, "Network"), h0.H0(this));
        LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setOrientation(0);
        linearLayout2.addView(i.l(this, "Wi-Fi only", 15, i14, 1), new LinearLayout.LayoutParams(0, -2, 1.0f));
        Switch r42 = new Switch(this);
        r42.setChecked(com.bumptech.glide.c.b0(this).getBoolean("download_wifi_only", false));
        linearLayout2.addView(r42, new LinearLayout.LayoutParams(-2, -2));
        w02.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        r42.setOnCheckedChangeListener(new a6.b(this, i12));
        final int u9 = com.bumptech.glide.c.u(this);
        TextView l13 = i.l(this, a3.g.o("Parallel downloads: ", u9, " (tap to change)"), 15, i14, 1);
        int i17 = 10;
        l13.setPadding(0, i.e(this, 10), 0, 0);
        r.f.i(-1, -2, w02, l13);
        w02.addView(i.l(this, "1 = one by one (recommended), up to 3 at once.", 13, i11, 0), new LinearLayout.LayoutParams(-1, -2));
        l13.setOnClickListener(new View.OnClickListener() { // from class: m8.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i172 = i12;
                int i18 = u9;
                final l8.z zVar2 = zVar;
                final Context context = this;
                int i19 = 0;
                switch (i172) {
                    case 0:
                        String[] strArr = {"1080p", "720p", "480p", "360p"};
                        final int[] iArr = {1080, 720, 480, 360};
                        int i20 = 1;
                        int i21 = 1;
                        while (i19 < 4) {
                            if (iArr[i19] == i18) {
                                i21 = i19;
                            }
                            i19++;
                        }
                        final int[] iArr2 = {i21};
                        new AlertDialog.Builder(context).setTitle("Download quality").setSingleChoiceItems(strArr, i21, new n(iArr2, i20)).setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: m8.q
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i22) {
                                com.bumptech.glide.c.b0(context).edit().putInt("download_quality", iArr[iArr2[0]]).apply();
                                zVar2.f();
                            }
                        }).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).show();
                        return;
                    default:
                        int max = Math.max(0, Math.min(2, i18 - 1));
                        final int[] iArr3 = {max};
                        new AlertDialog.Builder(context).setTitle("Parallel downloads").setSingleChoiceItems(new String[]{"1", "2", "3"}, max, new n(iArr3, i19)).setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: m8.o
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i22) {
                                int i23 = 1;
                                int i24 = iArr3[0] + 1;
                                if (i24 >= 1) {
                                    i23 = i24;
                                }
                                if (i23 > 3) {
                                    i23 = 3;
                                }
                                com.bumptech.glide.c.b0(context).edit().putInt("download_parallel", i23).apply();
                                zVar2.f();
                            }
                        }).setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).show();
                        return;
                }
            }
        });
        w02.addView(h0.G0(this, "Storage"), h0.H0(this));
        try {
            i10 = d.a(this).size();
        } catch (Exception unused) {
            i10 = 0;
        }
        View l14 = i.l(this, a3.g.o("Saved entries: ", i10, "  •  disk used: calculating…"), 14, i.f11068h, 0);
        w02.addView(l14, new LinearLayout.LayoutParams(-1, -2));
        new Thread(new k(this, l14, i10, i16)).start();
        TextView i18 = i.i(this, "Retry failed", false);
        i18.setGravity(17);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, i.e(this, 50));
        layoutParams4.setMargins(0, i.e(this, 14), 0, 0);
        w02.addView(i18, layoutParams4);
        i18.setOnClickListener(new j(this, i17));
        TextView i19 = i.i(this, "Clear finished / failed (+ files)", false);
        i19.setGravity(17);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, i.e(this, 50));
        layoutParams5.setMargins(0, i.e(this, 10), 0, i.e(this, 20));
        w02.addView(i19, layoutParams5);
        i19.setOnClickListener(new h8.r(23, this, zVar));
    }

    public final void L() {
        F();
        this.O.a(2);
        J();
        this.P = "downloads";
        C();
        this.H.removeAllViews();
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(View.generateViewId());
        this.H.addView(frameLayout, new LinearLayout.LayoutParams(-1, -2));
        l8.d dVar = new l8.d();
        s0 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.g(frameLayout.getId(), dVar, "downloads_fragment", 1);
        aVar.e();
        V();
        H();
    }

    public final void M() {
        F();
        this.P = "filter";
        C();
        this.H.removeAllViews();
        FrameLayout frameLayout = new FrameLayout(this);
        int i10 = f7741b0;
        frameLayout.setId(i10);
        this.H.addView(frameLayout, new LinearLayout.LayoutParams(-1, -2));
        l8.g gVar = new l8.g();
        gVar.f6929t0 = new z(this, 4);
        s0 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.g(i10, gVar, "filter_fragment", 1);
        aVar.e();
        V();
    }

    public final void N() {
        FrameLayout frameLayout = this.J;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        FrameLayout frameLayout2 = this.K;
        if (frameLayout2 != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams.topMargin = i.e(this, 120);
            this.K.setLayoutParams(layoutParams);
        }
    }

    public final void O() {
        this.O.a(3);
        this.P = "profile_sub";
        this.H.removeAllViews();
        z("Frame Capture");
        LinearLayout linearLayout = this.H;
        int i10 = 11;
        final z zVar = new z(this, i10);
        LinearLayout w02 = h0.w0(linearLayout, this);
        w02.addView(h0.G0(this, "Capture"), h0.H0(this));
        LinearLayout E0 = h0.E0(this);
        final int i11 = 0;
        h0.c(this, E0, h0.Z0(this, R.drawable.ic_screenshot, "Frame capture", "Enable saving frames while watching", com.bumptech.glide.c.H(this), new r(this, i11), new d0() { // from class: m8.s
            @Override // m8.d0
            public final ImageView d(int i12, int i13, int i14, int i15) {
                int i16 = i11;
                l8.z zVar2 = zVar;
                switch (i16) {
                    case 0:
                        return zVar2.b(i12, i13, i14, i15);
                    default:
                        return zVar2.b(i12, i13, i14, i15);
                }
            }
        }), false);
        final int i12 = 1;
        h0.c(this, E0, h0.Z0(this, R.drawable.ic_screenshot, "Always show capture button", "Keep the button visible even when controls are hidden", com.bumptech.glide.c.G(this), new r(this, i12), new d0() { // from class: m8.s
            @Override // m8.d0
            public final ImageView d(int i122, int i13, int i14, int i15) {
                int i16 = i12;
                l8.z zVar2 = zVar;
                switch (i16) {
                    case 0:
                        return zVar2.b(i122, i13, i14, i15);
                    default:
                        return zVar2.b(i122, i13, i14, i15);
                }
            }
        }), true);
        w02.addView(E0, h0.F0());
        w02.addView(h0.G0(this, "Save location"), h0.H0(this));
        TextView l10 = i.l(this, com.bumptech.glide.c.o(com.bumptech.glide.c.s(this)), 15, i.f11068h, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(i.e(this, 6), 0, 0, i.e(this, 12));
        w02.addView(l10, layoutParams);
        TextView l11 = i.l(this, "Screenshots from the player will be saved to this selected folder. Android will grant Pi Stream access only to the folder you choose.", 14, i.f11067g, 0);
        l11.setLineSpacing(i.e(this, 3), 1.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, i.e(this, 24), 0, 0);
        w02.addView(l11, layoutParams2);
        TextView i13 = i.i(this, "Choose folder", true);
        i13.setTextSize(16.0f);
        i13.setOnClickListener(new j(zVar, i10));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, i.e(this, 56));
        layoutParams3.setMargins(0, i.e(this, 20), 0, 0);
        w02.addView(i13, layoutParams3);
    }

    public final void P(String str, k8.f fVar, boolean z9) {
        this.P = "grid";
        this.Q = str;
        this.R = fVar;
        this.H.removeAllViews();
        FrameLayout frameLayout = new FrameLayout(this);
        int i10 = f7743d0;
        frameLayout.setId(i10);
        this.H.addView(frameLayout, new LinearLayout.LayoutParams(-1, -2));
        l8.n nVar = new l8.n();
        Bundle bundle = new Bundle();
        bundle.putString("title", str);
        bundle.putBoolean("continue_mode", z9);
        nVar.S(bundle);
        nVar.f6973t0 = new z(this, 3);
        x8.e eVar = nVar.f6972s0;
        if (eVar != null) {
            eVar.f11406g = fVar;
        } else {
            nVar.f6976w0 = fVar;
        }
        s0 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.g(i10, nVar, "grid_fragment", 1);
        aVar.e();
    }

    public final void Q() {
        a8.b bVar;
        F();
        final int i10 = 0;
        this.O.a(0);
        J();
        this.P = "home";
        C();
        this.H.removeAllViews();
        n nVar = this.G;
        if (nVar != null) {
            nVar.f5454d.removeCallbacks(nVar.f5455e);
        }
        LinearLayout linearLayout = this.U;
        int i11 = f7745f0;
        final int i12 = 1;
        if (linearLayout != null) {
            a3.g.w(-1, -2, this.H, linearLayout);
            this.W.M();
            n nVar2 = this.G;
            if (nVar2 != null && (bVar = nVar2.f5460j) != null) {
                nVar2.a(bVar);
            }
            n nVar3 = this.G;
            if (nVar3 != null) {
                Handler handler = nVar3.f5454d;
                g.f fVar = nVar3.f5455e;
                handler.removeCallbacks(fVar);
                handler.postDelayed(fVar, 6500L);
            }
            if (getSupportFragmentManager().C("home_fragment") == null) {
                u uVar = new u();
                uVar.f7022t0 = new z(this, 20);
                s0 supportFragmentManager = getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.g(i11, uVar, "home_fragment", 1);
                aVar.e();
            }
            V();
            H();
            return;
        }
        LinearLayout linearLayout2 = new LinearLayout(this);
        this.U = linearLayout2;
        linearLayout2.setOrientation(1);
        a3.g.w(-1, -2, this.H, this.U);
        final n nVar4 = this.G;
        nVar4.getClass();
        Context context = nVar4.f5451a;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: i8.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i10;
                n nVar5 = nVar4;
                switch (i13) {
                    case 0:
                        a8.b bVar2 = nVar5.f5460j;
                        if (bVar2 != null) {
                            nVar5.f5452b.f7036b.e(bVar2);
                            return;
                        }
                        return;
                    case 1:
                        a8.b bVar3 = nVar5.f5460j;
                        if (bVar3 != null) {
                            nVar5.f5452b.f7036b.e(bVar3);
                            return;
                        }
                        return;
                    default:
                        a8.b bVar4 = nVar5.f5460j;
                        if (bVar4 != null) {
                            z zVar = nVar5.f5452b;
                            zVar.getClass();
                            int i14 = MainActivity.f7741b0;
                            MainActivity mainActivity = zVar.f7036b;
                            mainActivity.getClass();
                            new h8.h(new z3.e(mainActivity, bVar4, 22)).b();
                            return;
                        }
                        return;
                }
            }
        });
        frameLayout.setOnTouchListener(new l(nVar4, new float[1], new float[1], i10));
        frameLayout.setFocusable(true);
        frameLayout.setFocusableInTouchMode(false);
        frameLayout.setDefaultFocusHighlightEnabled(false);
        frameLayout.setOnKeyListener(new m(nVar4, i10));
        ImageView imageView = new ImageView(context);
        nVar4.f5456f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        frameLayout.addView(nVar4.f5456f, new FrameLayout.LayoutParams(-1, -1));
        View view = new View(context);
        view.setBackgroundResource(R.drawable.background_gradient_home_1);
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, i.e(context, 200), 48));
        View view2 = new View(context);
        view2.setBackgroundResource(R.drawable.background_gradient_home_2);
        frameLayout.addView(view2, new FrameLayout.LayoutParams(-1, i.e(context, 200), 80));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(i.e(context, 24), 0, i.e(context, 24), i.e(context, 24));
        frameLayout.addView(linearLayout3, new FrameLayout.LayoutParams(-1, -2, 80));
        TextView l10 = i.l(context, "Pi Stream", 28, -1, 1);
        nVar4.f5457g = l10;
        l10.setMaxLines(1);
        nVar4.f5457g.setSingleLine(true);
        nVar4.f5457g.setEllipsize(TextUtils.TruncateAt.END);
        nVar4.f5457g.setIncludeFontPadding(false);
        linearLayout3.addView(nVar4.f5457g, new LinearLayout.LayoutParams(i.e(context, 340), -2));
        TextView l11 = i.l(context, "", 14, -1, 0);
        nVar4.f5458h = l11;
        l11.setMaxLines(1);
        nVar4.f5458h.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i.e(context, 340), -2);
        layoutParams.setMargins(0, i.e(context, 18), 0, i.e(context, 22));
        linearLayout3.addView(nVar4.f5458h, layoutParams);
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setGravity(16);
        linearLayout3.addView(linearLayout4, new LinearLayout.LayoutParams(-1, i.e(context, 42)));
        TextView i13 = i.i(context, "  Play", true);
        i13.setTextSize(16.0f);
        i13.setMinHeight(0);
        SpannableString spannableString = new SpannableString("  Play");
        Drawable drawable = x.j.getDrawable(context, R.drawable.ic_play_home);
        if (drawable != null) {
            drawable.setBounds(0, 0, i.e(context, 18), i.e(context, 18));
            spannableString.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
        }
        i13.setText(spannableString);
        i13.setOnClickListener(new View.OnClickListener() { // from class: i8.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i132 = i12;
                n nVar5 = nVar4;
                switch (i132) {
                    case 0:
                        a8.b bVar2 = nVar5.f5460j;
                        if (bVar2 != null) {
                            nVar5.f5452b.f7036b.e(bVar2);
                            return;
                        }
                        return;
                    case 1:
                        a8.b bVar3 = nVar5.f5460j;
                        if (bVar3 != null) {
                            nVar5.f5452b.f7036b.e(bVar3);
                            return;
                        }
                        return;
                    default:
                        a8.b bVar4 = nVar5.f5460j;
                        if (bVar4 != null) {
                            z zVar = nVar5.f5452b;
                            zVar.getClass();
                            int i14 = MainActivity.f7741b0;
                            MainActivity mainActivity = zVar.f7036b;
                            mainActivity.getClass();
                            new h8.h(new z3.e(mainActivity, bVar4, 22)).b();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout4.addView(i13, new LinearLayout.LayoutParams(i.e(context, 136), i.e(context, 42)));
        TextView l12 = i.l(context, "  My List", 14, -1, 1);
        l12.setGravity(17);
        l12.setPadding(i.e(context, 16), 0, i.e(context, 16), 0);
        l12.setMinHeight(i.e(context, 38));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(i.e(context, 100));
        gradientDrawable.setColor(0);
        gradientDrawable.setStroke(i.e(context, 2), Color.argb(210, 255, 255, 255));
        l12.setBackground(gradientDrawable);
        nVar4.f5459i = l12;
        l12.setTextSize(16.0f);
        nVar4.f5459i.setMinHeight(0);
        SpannableString spannableString2 = new SpannableString("  My List");
        Drawable drawable2 = x.j.getDrawable(context, R.drawable.ic_add);
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, i.e(context, 17), i.e(context, 17));
            spannableString2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        }
        nVar4.f5459i.setText(spannableString2);
        final int i14 = 2;
        nVar4.f5459i.setOnClickListener(new View.OnClickListener() { // from class: i8.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                int i132 = i14;
                n nVar5 = nVar4;
                switch (i132) {
                    case 0:
                        a8.b bVar2 = nVar5.f5460j;
                        if (bVar2 != null) {
                            nVar5.f5452b.f7036b.e(bVar2);
                            return;
                        }
                        return;
                    case 1:
                        a8.b bVar3 = nVar5.f5460j;
                        if (bVar3 != null) {
                            nVar5.f5452b.f7036b.e(bVar3);
                            return;
                        }
                        return;
                    default:
                        a8.b bVar4 = nVar5.f5460j;
                        if (bVar4 != null) {
                            z zVar = nVar5.f5452b;
                            zVar.getClass();
                            int i142 = MainActivity.f7741b0;
                            MainActivity mainActivity = zVar.f7036b;
                            mainActivity.getClass();
                            new h8.h(new z3.e(mainActivity, bVar4, 22)).b();
                            return;
                        }
                        return;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i.e(context, 136), i.e(context, 42));
        layoutParams2.setMargins(i.e(context, 18), 0, 0, 0);
        linearLayout4.addView(nVar4.f5459i, layoutParams2);
        if (frameLayout.getParent() instanceof ViewGroup) {
            ((ViewGroup) frameLayout.getParent()).removeView(frameLayout);
        }
        this.U.addView(frameLayout, new LinearLayout.LayoutParams(-1, i.e(this, 432)));
        LinearLayout linearLayout5 = new LinearLayout(this);
        linearLayout5.setGravity(16);
        linearLayout5.setPadding(i.e(this, 24), i.e(this, 54), i.e(this, 24), 0);
        frameLayout.addView(linearLayout5, new FrameLayout.LayoutParams(-1, i.e(this, 112), 48));
        ImageView E = E(R.drawable.ic_app_header_mark, 52, 52, 0);
        E.clearColorFilter();
        E.setPadding(0, 0, 0, 0);
        linearLayout5.addView(E, new LinearLayout.LayoutParams(i.e(this, 52), i.e(this, 52)));
        linearLayout5.addView(new TextView(this), new LinearLayout.LayoutParams(0, 1, 1.0f));
        A(linearLayout5, R.drawable.ic_search, 0, true, new w(this, i10));
        A(linearLayout5, R.drawable.ic_notification, 10, false, new w(this, i12));
        n nVar5 = this.G;
        a8.b bVar2 = nVar5.f5460j;
        if (bVar2 != null) {
            nVar5.a(bVar2);
        } else if (!nVar5.f5453c.isEmpty()) {
            n nVar6 = this.G;
            nVar6.f5461k = Math.min(nVar6.f5461k, nVar6.f5453c.size() - 1);
            n nVar7 = this.G;
            nVar7.a((a8.b) nVar7.f5453c.get(nVar7.f5461k));
        }
        n nVar8 = this.G;
        if (nVar8 != null) {
            Handler handler2 = nVar8.f5454d;
            g.f fVar2 = nVar8.f5455e;
            handler2.removeCallbacks(fVar2);
            handler2.postDelayed(fVar2, 6500L);
        }
        i.g gVar = this.W;
        LinearLayout linearLayout6 = this.U;
        gVar.getClass();
        LinearLayout linearLayout7 = new LinearLayout((Context) gVar.f5197c);
        gVar.f5199e = linearLayout7;
        linearLayout7.setOrientation(1);
        linearLayout6.addView((LinearLayout) gVar.f5199e, new LinearLayout.LayoutParams(-1, -2));
        gVar.M();
        FrameLayout frameLayout2 = new FrameLayout(this);
        frameLayout2.setId(i11);
        this.U.addView(frameLayout2, new LinearLayout.LayoutParams(-1, -2));
        y C = getSupportFragmentManager().C("home_fragment");
        if (C != null) {
            s0 supportFragmentManager2 = getSupportFragmentManager();
            supportFragmentManager2.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
            aVar2.i(C);
            aVar2.f();
        }
        u uVar2 = new u();
        uVar2.f7022t0 = new z(this, 21);
        s0 supportFragmentManager3 = getSupportFragmentManager();
        supportFragmentManager3.getClass();
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager3);
        aVar3.g(i11, uVar2, "home_fragment", 1);
        aVar3.e();
        V();
        H();
    }

    public final void R() {
        F();
        this.O.a(1);
        J();
        this.P = "mylist";
        C();
        this.H.removeAllViews();
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(View.generateViewId());
        this.H.addView(frameLayout, new LinearLayout.LayoutParams(-1, -2));
        l8.d0 d0Var = new l8.d0();
        d0Var.f6914s0 = new z(this, 0);
        s0 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.g(frameLayout.getId(), d0Var, "my_list_fragment", 1);
        aVar.e();
        V();
        H();
    }

    public final void S() {
        ViewGroup viewGroup;
        this.O.a(3);
        J();
        this.P = "profile";
        w8.d.f11048d = "Profile";
        f fVar = this.O;
        Context context = fVar.f5431a;
        int i10 = 0;
        boolean z9 = context.getSharedPreferences("crash_logger", 0).getBoolean("has_new_crash", false);
        View view = fVar.f5435e;
        if (view != null) {
            if (!z9) {
                i10 = 8;
            }
            view.setVisibility(i10);
        } else if (z9 && (viewGroup = (ViewGroup) fVar.f5436f.getChildAt(4)) != null) {
            View childAt = viewGroup.getChildAt(0);
            viewGroup.removeView(childAt);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(childAt, new FrameLayout.LayoutParams(i.e(context, 27), i.e(context, 27), 17));
            View view2 = new View(context);
            fVar.f5435e = view2;
            view2.setBackground(i.j(i.f11065e, i.e(context, 4)));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i.e(context, 8), i.e(context, 8));
            layoutParams.gravity = 53;
            frameLayout.addView(fVar.f5435e, layoutParams);
            viewGroup.addView(frameLayout, 0, new LinearLayout.LayoutParams(i.e(context, 27), i.e(context, 27)));
        }
        this.H.removeAllViews();
        FrameLayout frameLayout2 = new FrameLayout(this);
        frameLayout2.setId(View.generateViewId());
        this.H.addView(frameLayout2, new LinearLayout.LayoutParams(-1, -1));
        m8.b0 b0Var = new m8.b0();
        b0Var.f7575s0 = new z(this, 5);
        s0 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.g(frameLayout2.getId(), b0Var, "profile_fragment", 1);
        aVar.e();
        V();
        H();
    }

    public final void T() {
        F();
        this.O.a(-1);
        J();
        this.P = "search";
        C();
        this.H.removeAllViews();
        FrameLayout frameLayout = new FrameLayout(this);
        int i10 = f7744e0;
        frameLayout.setId(i10);
        this.H.addView(frameLayout, new LinearLayout.LayoutParams(-1, -2));
        n0 n0Var = new n0();
        n0Var.f6987u0 = new z(this, 22);
        s0 supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.g(i10, n0Var, "search_fragment", 1);
        aVar.e();
        V();
        H();
    }

    /* JADX WARN: Type inference failed for: r5v19, types: [m8.m0] */
    /* JADX WARN: Type inference failed for: r5v20, types: [m8.m0] */
    /* JADX WARN: Type inference failed for: r5v21, types: [m8.m0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [m8.i0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [m8.m0] */
    public final void U() {
        boolean z9;
        String str;
        int i10;
        int i11;
        boolean z10;
        float f10;
        String substring;
        int i12;
        int i13;
        int e10;
        this.P = "profile_sub";
        this.H.removeAllViews();
        z("Subtitle settings");
        final LinearLayout linearLayout = this.H;
        final z zVar = new z(this, 14);
        int[] iArr = v0.f7722a;
        LinearLayout w02 = h0.w0(linearLayout, this);
        final int e11 = i.e(this, 200);
        final int e12 = i.e(this, 62);
        final FrameLayout frameLayout = new FrameLayout(this);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{i.f11064d, i.f11063c});
        gradientDrawable.setCornerRadius(i.e(this, 20));
        frameLayout.setBackground(gradientDrawable);
        frameLayout.setClipToOutline(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, e11);
        layoutParams.setMargins(0, i.e(this, 12), 0, 0);
        w02.addView(frameLayout, layoutParams);
        frameLayout.setElevation(i.e(this, 6));
        View b10 = zVar.b(R.drawable.ic_player_play_modern, 46, 46, Color.argb(35, 255, 255, 255));
        frameLayout.addView(b10, new FrameLayout.LayoutParams(i.e(this, 46), i.e(this, 46), 17));
        TextView l10 = i.l(this, "LIVE PREVIEW", 10, -1, 1);
        int i14 = i.f11065e;
        l10.setBackground(i.j(i14, i.e(this, 20)));
        l10.setPadding(i.e(this, 10), i.e(this, 4), i.e(this, 10), i.e(this, 4));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 53);
        layoutParams2.setMargins(0, i.e(this, 14), i.e(this, 14), 0);
        frameLayout.addView(l10, layoutParams2);
        View l11 = i.l(this, "Subtitles: " + com.bumptech.glide.c.A(this), 11, Color.argb(180, 255, 255, 255), 1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2, 51);
        layoutParams3.setMargins(i.e(this, 14), i.e(this, 14), 0, 0);
        frameLayout.addView(l11, layoutParams3);
        View view = new View(this);
        view.setBackgroundColor(Color.argb(70, 0, 0, 0));
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, i.e(this, 8), 48));
        View view2 = new View(this);
        view2.setBackgroundColor(Color.argb(70, 0, 0, 0));
        frameLayout.addView(view2, new FrameLayout.LayoutParams(-1, i.e(this, 8), 80));
        TextView l12 = i.l(this, "Lorem ipsum is simply dummy text.", 20, -1, 0);
        l12.setGravity(17);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2, 81);
        layoutParams4.setMargins(i.e(this, 28), 0, i.e(this, 28), i.e(this, 26));
        frameLayout.addView(l12, layoutParams4);
        final LinearLayout linearLayout2 = new LinearLayout(this);
        linearLayout2.setGravity(16);
        linearLayout2.setAlpha(0.0f);
        linearLayout2.setVisibility(8);
        frameLayout.addView(linearLayout2, new FrameLayout.LayoutParams(-1, -1));
        View textView = new TextView(this);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(i14);
        textView.setBackground(gradientDrawable2);
        linearLayout2.addView(textView, new LinearLayout.LayoutParams(i.e(this, 8), i.e(this, 8)));
        TextView l13 = i.l(this, "  Preview  •  tap to expand", 12, Color.argb(200, 255, 255, 255), 1);
        linearLayout2.setPadding(i.e(this, 14), 0, i.e(this, 14), 0);
        r.f.i(-2, -2, linearLayout2, l13);
        TextView l14 = i.l(this, "Lorem ipsum is simply dummy text.", 13, -1, 0);
        l14.setMaxLines(1);
        l14.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams5.setMargins(i.e(this, 12), 0, 0, 0);
        l14.setGravity(21);
        linearLayout2.addView(l14, layoutParams5);
        final boolean[] zArr = {false};
        final boolean[] zArr2 = {false};
        final View[] viewArr = {b10, l10, l11, view, view2, l12};
        final androidx.appcompat.widget.j jVar = new androidx.appcompat.widget.j(l14, l12, 7);
        int i15 = 0;
        final ?? r52 = new Consumer() { // from class: m8.i0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                final int i16;
                final int i17;
                boolean[] zArr3 = zArr2;
                boolean[] zArr4 = zArr;
                int i18 = e11;
                int i19 = e12;
                final LinearLayout linearLayout3 = linearLayout2;
                final FrameLayout frameLayout2 = frameLayout;
                final View[] viewArr2 = viewArr;
                Runnable runnable = jVar;
                final Boolean bool = (Boolean) obj;
                if (!zArr3[0] && zArr4[0] != bool.booleanValue()) {
                    zArr3[0] = true;
                    zArr4[0] = bool.booleanValue();
                    if (bool.booleanValue()) {
                        i16 = i18;
                    } else {
                        i16 = i19;
                    }
                    if (bool.booleanValue()) {
                        i17 = i19;
                    } else {
                        i17 = i18;
                    }
                    if (bool.booleanValue()) {
                        linearLayout3.setVisibility(0);
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(i16, i17);
                    ofInt.setDuration(260L);
                    ofInt.setInterpolator(new DecelerateInterpolator());
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m8.r0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                            FrameLayout frameLayout3 = frameLayout2;
                            LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) frameLayout3.getLayoutParams();
                            layoutParams6.height = intValue;
                            frameLayout3.setLayoutParams(layoutParams6);
                            int i20 = i16;
                            float abs = Math.abs(intValue - i20) / Math.abs(i17 - i20);
                            if (bool.booleanValue()) {
                                abs = 1.0f - abs;
                            }
                            for (View view3 : viewArr2) {
                                view3.setAlpha(abs);
                            }
                            linearLayout3.setAlpha(1.0f - abs);
                        }
                    });
                    ofInt.addListener(new t0(zArr3, bool, linearLayout3, runnable, viewArr2));
                    ofInt.start();
                }
            }
        };
        frameLayout.setOnClickListener(new h8.r(27, r52, zArr));
        w02.setClipChildren(false);
        w02.setClipToPadding(false);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        frameLayout.post(new Runnable() { // from class: m8.n0
            @Override // java.lang.Runnable
            public final void run() {
                final FrameLayout frameLayout2 = frameLayout;
                final Context context = this;
                final boolean[] zArr3 = zArr2;
                final boolean[] zArr4 = zArr;
                final Consumer consumer = r52;
                ViewParent parent = linearLayout.getParent();
                if (parent instanceof ScrollView) {
                    ScrollView scrollView = (ScrollView) parent;
                    scrollView.setClipChildren(false);
                    scrollView.setClipToPadding(false);
                    scrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: m8.s0
                        @Override // android.view.View.OnScrollChangeListener
                        public final void onScrollChange(View view3, int i16, int i17, int i18, int i19) {
                            float f11;
                            int e13;
                            FrameLayout frameLayout3 = frameLayout2;
                            frameLayout3.setTranslationY(i17);
                            if (i17 > 0) {
                                f11 = 12.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            frameLayout3.setTranslationZ(f11);
                            Context context2 = context;
                            if (i17 > 0) {
                                e13 = w8.i.e(context2, 8);
                            } else {
                                e13 = w8.i.e(context2, 6);
                            }
                            frameLayout3.setElevation(e13);
                            if (!zArr3[0]) {
                                int e14 = w8.i.e(context2, 36);
                                boolean[] zArr5 = zArr4;
                                Consumer consumer2 = consumer;
                                if (i17 > e14 && !zArr5[0]) {
                                    consumer2.accept(Boolean.TRUE);
                                } else if (i17 < w8.i.e(context2, 8) && zArr5[0]) {
                                    consumer2.accept(Boolean.FALSE);
                                }
                            }
                        }
                    });
                    int scrollY = scrollView.getScrollY();
                    frameLayout2.setTranslationY(scrollY);
                    if (scrollY > 0) {
                        frameLayout2.setTranslationZ(12.0f);
                        frameLayout2.setElevation(w8.i.e(context, 8));
                    } else {
                        frameLayout2.setTranslationZ(0.0f);
                    }
                }
            }
        });
        final v1.z zVar2 = new v1.z(this, l12, l11, l14, 5);
        View a10 = v0.a(this, "Default Subtitle Language", com.bumptech.glide.c.A(this), new f8.d(this, new String[]{"English", "Japanese", "Bengali", "Hindi", "Spanish", "French", "Arabic", "Indonesian", "Portuguese", "Russian"}, zVar, 9));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, i.e(this, 60));
        layoutParams6.setMargins(0, i.e(this, 24), 0, 0);
        w02.addView(a10, layoutParams6);
        int i16 = 12;
        View l15 = i.l(this, "Falls back to English if not found.", 12, i.f11068h, 0);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.setMargins(i.e(this, 4), i.e(this, 6), 0, 0);
        w02.addView(l15, layoutParams7);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams8.setMargins(0, i.e(this, 26), 0, 0);
        w02.addView(v0.d(this, "Text Size"), layoutParams8);
        int round = Math.round(com.bumptech.glide.c.b0(this).getFloat("subtitle_font_size", 1.0f) * 100.0f);
        final int i17 = 3;
        w02.addView(v0.e(this, round + "%", 50, 300, round, new IntConsumer() { // from class: m8.m0
            @Override // java.util.function.IntConsumer
            public final void accept(int i18) {
                switch (i17) {
                    case 0:
                        Context context = this;
                        Runnable runnable = zVar2;
                        com.bumptech.glide.c.b0(context).edit().putInt("subtitle_bottom_padding", i18).apply();
                        runnable.run();
                        return;
                    case 1:
                        Context context2 = this;
                        Runnable runnable2 = zVar2;
                        com.bumptech.glide.c.b0(context2).edit().putInt("subtitle_shadow", i18).apply();
                        runnable2.run();
                        return;
                    case 2:
                        Context context3 = this;
                        Runnable runnable3 = zVar2;
                        com.bumptech.glide.c.b0(context3).edit().putInt("subtitle_bg_opacity", i18).apply();
                        runnable3.run();
                        return;
                    default:
                        Context context4 = this;
                        Runnable runnable4 = zVar2;
                        com.bumptech.glide.c.b0(context4).edit().putFloat("subtitle_font_size", i18 / 100.0f).apply();
                        runnable4.run();
                        return;
                }
            }
        }, "%"));
        LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams9.setMargins(0, i.e(this, 22), 0, 0);
        w02.addView(v0.d(this, "Text Style"), layoutParams9);
        m0 m0Var = new m0(zVar2, zVar);
        String[] strArr = {"Normal", "Bold", "Italic", "Bold+Italic"};
        int i18 = com.bumptech.glide.c.b0(this).getInt("subtitle_font_style", 0);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setOrientation(0);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(-1, i.e(this, 42));
        layoutParams10.setMargins(0, i.e(this, 10), 0, 0);
        linearLayout3.setLayoutParams(layoutParams10);
        int i19 = 4;
        boolean z11 = false;
        while (i15 < i19) {
            if (i15 == i18) {
                z11 = true;
            }
            String str2 = strArr[i15];
            if (z11) {
                i12 = -1;
            } else {
                i12 = i.f11068h;
            }
            TextView l16 = i.l(this, str2, i16, i12, 1);
            l16.setGravity(17);
            if (z11) {
                i13 = i.f11065e;
            } else {
                i13 = i.f11063c;
            }
            l16.setBackground(i.j(i13, i.e(this, 10)));
            LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, -1, 1.0f);
            if (i15 == 0) {
                e10 = 0;
            } else {
                e10 = i.e(this, 6);
            }
            layoutParams11.setMargins(e10, 0, 0, 0);
            i.d(l16);
            l16.setOnClickListener(new v(this, i15, m0Var, 5));
            linearLayout3.addView(l16, layoutParams11);
            i15++;
            i19 = 4;
            z11 = false;
            i16 = 12;
        }
        final int i20 = 1;
        w02.addView(linearLayout3);
        int i21 = com.bumptech.glide.c.b0(this).getInt("subtitle_font_color", -1);
        int[] iArr2 = v0.f7722a;
        int length = iArr2.length;
        int i22 = 0;
        while (true) {
            if (i22 < length) {
                if (iArr2[i22] == i21) {
                    z9 = true;
                    break;
                }
                i22++;
            } else {
                z9 = false;
                break;
            }
        }
        w02.addView(v0.b(this, "Text Color", iArr2, i21, !z9, String.format("Custom: #%06X", Integer.valueOf(16777215 & i21)), new k0(this, zVar2, zVar, 1), new l0(zVar, i21, this, zVar2, 1)));
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams12.setMargins(0, i.e(this, 26), 0, 0);
        w02.addView(v0.d(this, "Background Color"), layoutParams12);
        final boolean z12 = com.bumptech.glide.c.b0(this).getBoolean("subtitle_bg_none", false);
        if (z12) {
            str = "✓  No background";
        } else {
            str = "No background";
        }
        if (z12) {
            i10 = -1;
        } else {
            i10 = i.f11068h;
        }
        TextView l17 = i.l(this, str, 13, i10, 1);
        l17.setGravity(17);
        if (z12) {
            i11 = i.f11065e;
        } else {
            i11 = i.f11063c;
        }
        l17.setBackground(i.j(i11, i.e(this, 20)));
        l17.setPadding(i.e(this, 16), 0, i.e(this, 16), 0);
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(-2, i.e(this, 38));
        layoutParams13.setMargins(0, i.e(this, 10), 0, 0);
        l17.setOnClickListener(new View.OnClickListener() { // from class: m8.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                com.bumptech.glide.c.g0(this, !z12);
                zVar2.run();
                zVar.f();
            }
        });
        w02.addView(l17, layoutParams13);
        int i23 = com.bumptech.glide.c.b0(this).getInt("subtitle_bg_color", -16777216);
        int[] iArr3 = v0.f7723b;
        int length2 = iArr3.length;
        int i24 = 0;
        while (true) {
            if (i24 < length2) {
                if (iArr3[i24] == i23) {
                    z10 = true;
                    break;
                }
                i24++;
            } else {
                z10 = false;
                break;
            }
        }
        View b11 = v0.b(this, "", iArr3, i23, !z10, String.format("Custom: #%06X", Integer.valueOf(16777215 & i23)), new k0(this, zVar2, zVar, 0), new l0(zVar, i23, this, zVar2, 0));
        if (z12) {
            f10 = 0.35f;
        } else {
            f10 = 1.0f;
        }
        b11.setAlpha(f10);
        w02.addView(b11);
        LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -2);
        final int i25 = 0;
        layoutParams14.setMargins(0, i.e(this, 26), 0, 0);
        w02.addView(v0.d(this, "Bottom Position"), layoutParams14);
        int i26 = com.bumptech.glide.c.b0(this).getInt("subtitle_bottom_padding", 0);
        w02.addView(v0.e(this, i26 + "px", 0, 100, i26, new IntConsumer() { // from class: m8.m0
            @Override // java.util.function.IntConsumer
            public final void accept(int i182) {
                switch (i25) {
                    case 0:
                        Context context = this;
                        Runnable runnable = zVar2;
                        com.bumptech.glide.c.b0(context).edit().putInt("subtitle_bottom_padding", i182).apply();
                        runnable.run();
                        return;
                    case 1:
                        Context context2 = this;
                        Runnable runnable2 = zVar2;
                        com.bumptech.glide.c.b0(context2).edit().putInt("subtitle_shadow", i182).apply();
                        runnable2.run();
                        return;
                    case 2:
                        Context context3 = this;
                        Runnable runnable3 = zVar2;
                        com.bumptech.glide.c.b0(context3).edit().putInt("subtitle_bg_opacity", i182).apply();
                        runnable3.run();
                        return;
                    default:
                        Context context4 = this;
                        Runnable runnable4 = zVar2;
                        com.bumptech.glide.c.b0(context4).edit().putFloat("subtitle_font_size", i182 / 100.0f).apply();
                        runnable4.run();
                        return;
                }
            }
        }, "px"));
        LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams15.setMargins(0, i.e(this, 22), 0, 0);
        w02.addView(v0.d(this, "Text Shadow"), layoutParams15);
        int i27 = com.bumptech.glide.c.b0(this).getInt("subtitle_shadow", 0);
        w02.addView(v0.e(this, i27 + "%", 0, 100, i27, new IntConsumer() { // from class: m8.m0
            @Override // java.util.function.IntConsumer
            public final void accept(int i182) {
                switch (i20) {
                    case 0:
                        Context context = this;
                        Runnable runnable = zVar2;
                        com.bumptech.glide.c.b0(context).edit().putInt("subtitle_bottom_padding", i182).apply();
                        runnable.run();
                        return;
                    case 1:
                        Context context2 = this;
                        Runnable runnable2 = zVar2;
                        com.bumptech.glide.c.b0(context2).edit().putInt("subtitle_shadow", i182).apply();
                        runnable2.run();
                        return;
                    case 2:
                        Context context3 = this;
                        Runnable runnable3 = zVar2;
                        com.bumptech.glide.c.b0(context3).edit().putInt("subtitle_bg_opacity", i182).apply();
                        runnable3.run();
                        return;
                    default:
                        Context context4 = this;
                        Runnable runnable4 = zVar2;
                        com.bumptech.glide.c.b0(context4).edit().putFloat("subtitle_font_size", i182 / 100.0f).apply();
                        runnable4.run();
                        return;
                }
            }
        }, "%"));
        LinearLayout.LayoutParams layoutParams16 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams16.setMargins(0, i.e(this, 22), 0, 0);
        w02.addView(v0.d(this, "Background Opacity"), layoutParams16);
        int i28 = com.bumptech.glide.c.b0(this).getInt("subtitle_bg_opacity", 0);
        final int i29 = 2;
        w02.addView(v0.e(this, i28 + "%", 0, 100, i28, new IntConsumer() { // from class: m8.m0
            @Override // java.util.function.IntConsumer
            public final void accept(int i182) {
                switch (i29) {
                    case 0:
                        Context context = this;
                        Runnable runnable = zVar2;
                        com.bumptech.glide.c.b0(context).edit().putInt("subtitle_bottom_padding", i182).apply();
                        runnable.run();
                        return;
                    case 1:
                        Context context2 = this;
                        Runnable runnable2 = zVar2;
                        com.bumptech.glide.c.b0(context2).edit().putInt("subtitle_shadow", i182).apply();
                        runnable2.run();
                        return;
                    case 2:
                        Context context3 = this;
                        Runnable runnable3 = zVar2;
                        com.bumptech.glide.c.b0(context3).edit().putInt("subtitle_bg_opacity", i182).apply();
                        runnable3.run();
                        return;
                    default:
                        Context context4 = this;
                        Runnable runnable4 = zVar2;
                        com.bumptech.glide.c.b0(context4).edit().putFloat("subtitle_font_size", i182 / 100.0f).apply();
                        runnable4.run();
                        return;
                }
            }
        }, "%"));
        String string = com.bumptech.glide.c.b0(this).getString("subtitle_custom_font_path", "");
        if (string.isEmpty()) {
            substring = "None";
        } else {
            substring = string.substring(string.lastIndexOf(47) + 1);
        }
        View a11 = v0.a(this, "Custom font", substring, new f8.d(zVar, this, zVar2, 8));
        LinearLayout.LayoutParams layoutParams17 = new LinearLayout.LayoutParams(-1, i.e(this, 60));
        layoutParams17.setMargins(0, i.e(this, 26), 0, 0);
        w02.addView(a11, layoutParams17);
        TextView i30 = i.i(this, "Save Options", true);
        i30.setTextSize(16.0f);
        i30.setMinHeight(0);
        i30.setGravity(17);
        LinearLayout.LayoutParams layoutParams18 = new LinearLayout.LayoutParams(-1, i.e(this, 54));
        layoutParams18.setMargins(0, i.e(this, 34), 0, 0);
        i30.setOnClickListener(new h8.r(25, zVar2, this));
        w02.addView(i30, layoutParams18);
        int i31 = i.f11068h;
        TextView l18 = i.l(this, "Reset to Default", 14, i31, 1);
        l18.setGravity(17);
        LinearLayout.LayoutParams layoutParams19 = new LinearLayout.LayoutParams(-1, i.e(this, 46));
        layoutParams19.setMargins(0, i.e(this, 12), 0, 0);
        l18.setOnClickListener(new h8.r(26, this, zVar));
        w02.addView(l18, layoutParams19);
        TextView l19 = i.l(this, "Changes apply automatically to video playback", 13, i31, 0);
        LinearLayout.LayoutParams c6 = r.f.c(l19, 17, -1, -2);
        c6.setMargins(0, i.e(this, 10), 0, 0);
        w02.addView(l19, c6);
    }

    public final void V() {
        this.M = false;
        g8.c cVar = this.L;
        if (cVar != null) {
            cVar.animate().translationY(0.0f).setDuration(200L).withEndAction(new l8.y(this, 2)).start();
        }
    }

    public final void W(a8.b bVar) {
        int i10;
        if (this.G != null && bVar != null) {
            boolean b10 = w7.c.b(this, bVar);
            SpannableString spannableString = new SpannableString("  My List");
            if (b10) {
                i10 = R.drawable.ic_bookmark;
            } else {
                i10 = R.drawable.ic_add;
            }
            Drawable drawable = x.j.getDrawable(this, i10);
            if (drawable != null) {
                drawable.setBounds(0, 0, i.e(this, 17), i.e(this, 17));
                spannableString.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
            }
            TextView textView = this.G.f5459i;
            if (textView != null) {
                textView.setText(spannableString);
            }
        }
    }

    @Override // i8.c
    public final void e(a8.b bVar) {
        String str;
        String str2;
        float f10;
        String str3 = bVar.F;
        if (str3 != null && !str3.trim().isEmpty()) {
            String str4 = bVar.G;
            if (str4 != null && !str4.isEmpty()) {
                str = bVar.G;
            } else {
                str = bVar.f174x;
            }
            String str5 = bVar.F;
            String str6 = bVar.f170c;
            String str7 = bVar.G;
            if (str7 != null && !str7.isEmpty()) {
                str2 = bVar.G;
            } else {
                str2 = bVar.f174x;
            }
            if (str2 != null) {
                Matcher matcher = Pattern.compile("(\\d+(?:\\.\\d+)?)").matcher(str2);
                if (matcher.find()) {
                    try {
                        f10 = Float.parseFloat(matcher.group(1));
                    } catch (Exception e10) {
                        Log.e("DataUtils", "parse episode number", e10);
                    }
                    a8.e eVar = new a8.e(str, str5, str6, f10);
                    eVar.f187e = bVar.f168a;
                    eVar.f188f = bVar.D;
                    Intent putExtra = new Intent(this, (Class<?>) PlayerActivity.class).putExtra("episode", eVar);
                    putExtra.putExtra("resume_position_ms", bVar.H);
                    startActivity(putExtra);
                    overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
                    return;
                }
            }
            f10 = 1.0f;
            a8.e eVar2 = new a8.e(str, str5, str6, f10);
            eVar2.f187e = bVar.f168a;
            eVar2.f188f = bVar.D;
            Intent putExtra2 = new Intent(this, (Class<?>) PlayerActivity.class).putExtra("episode", eVar2);
            putExtra2.putExtra("resume_position_ms", bVar.H);
            startActivity(putExtra2);
            overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
            return;
        }
        Intent intent = new Intent(this, (Class<?>) DetailActivity.class);
        intent.putExtra("anime", bVar);
        startActivity(intent);
        overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
    }

    @Override // androidx.fragment.app.b0, androidx.activity.j, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        String str = "";
        if (i10 == 7104 && i11 == -1 && intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            try {
                getContentResolver().takePersistableUriPermission(data, intent.getFlags() & 3);
            } catch (Exception e10) {
                Log.e("MainActivity", "exception", e10);
            }
            SharedPreferences.Editor edit = com.bumptech.glide.c.b0(this).edit();
            if (data != null) {
                str = data.toString();
            }
            edit.putString("frame_dir_uri", str).apply();
            O();
            return;
        }
        boolean z9 = true;
        String str2 = null;
        if (i10 == 7105 && i11 == -1 && intent != null && intent.getData() != null) {
            Uri data2 = intent.getData();
            try {
                getContentResolver().takePersistableUriPermission(data2, intent.getFlags() & 3);
            } catch (Exception e11) {
                Log.e("MainActivity", "exception", e11);
            }
            SharedPreferences.Editor edit2 = com.bumptech.glide.c.b0(this).edit();
            if (data2 != null) {
                str = data2.toString();
            }
            edit2.putString("download_dir_uri", str).apply();
            if (z7.f.o().f12129g == null) {
                z9 = false;
            }
            if (z9) {
                z7.f o = z7.f.o();
                androidx.appcompat.widget.w wVar = o.f12129g;
                o.f12129g = null;
                if (wVar != null) {
                    str2 = o.m(this, (a8.b) wVar.f682c, (a8.e) wVar.f683d, (h) wVar.f684e, (List) wVar.f685f, (String) wVar.f686g);
                }
                if (str2 != null && !"FOLDER_REQUIRED".equals(str2)) {
                    Toast.makeText(this, "Download started", 0).show();
                    L();
                    return;
                }
            }
            K();
            return;
        }
        e eVar = this.C;
        eVar.getClass();
        if (i10 == 7106 && i11 == -1 && intent != null && intent.getData() != null) {
            Uri data3 = intent.getData();
            try {
                ((Activity) eVar.f12044b).getContentResolver().takePersistableUriPermission(data3, 1);
            } catch (Exception e12) {
                Log.e("PickerDialog", "font uri permission", e12);
            }
            try {
                InputStream openInputStream = ((Activity) eVar.f12044b).getContentResolver().openInputStream(data3);
                if (openInputStream != null) {
                    File file = new File(((Activity) eVar.f12044b).getFilesDir(), "custom_subtitle_font.ttf");
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = openInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, read);
                        }
                    }
                    fileOutputStream.close();
                    openInputStream.close();
                    com.bumptech.glide.c.b0((Activity) eVar.f12044b).edit().putString("subtitle_custom_font_path", file.getAbsolutePath()).apply();
                }
            } catch (Exception e13) {
                Log.e("PickerDialog", "font copy", e13);
            }
        } else {
            z9 = false;
        }
        if (z9) {
            U();
            return;
        }
        if (i10 == 7107) {
            Consumer consumer = this.Z;
            this.Z = null;
            if (consumer != null && i11 == -1 && intent != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    if (intent.getClipData() != null) {
                        int min = Math.min(intent.getClipData().getItemCount(), 10);
                        for (int i12 = 0; i12 < min; i12++) {
                            Uri uri = intent.getClipData().getItemAt(i12).getUri();
                            if (uri != null) {
                                arrayList.add(uri);
                            }
                        }
                    } else if (intent.getData() != null) {
                        arrayList.add(intent.getData());
                    }
                    consumer.accept(arrayList);
                    return;
                } catch (Exception e14) {
                    Log.e("MainActivity", "bug images", e14);
                    return;
                }
            }
            return;
        }
        if (i10 == 7108) {
            Consumer consumer2 = this.f7746a0;
            this.f7746a0 = null;
            if (consumer2 != null && i11 == -1 && intent != null && intent.getData() != null) {
                try {
                    consumer2.accept(intent.getData());
                } catch (Exception e15) {
                    Log.e("MainActivity", "bug log", e15);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x001d A[RETURN] */
    @Override // androidx.activity.j, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBackPressed() {
        /*
            r2 = this;
            boolean r0 = r2.B
            if (r0 == 0) goto L5
            return
        L5:
            com.google.android.gms.common.api.internal.i0 r0 = r2.A
            if (r0 == 0) goto L1e
            java.lang.Object r0 = r0.f2432b     // Catch: java.lang.Exception -> L1a
            r1 = r0
            android.app.Dialog r1 = (android.app.Dialog) r1     // Catch: java.lang.Exception -> L1a
            if (r1 == 0) goto L1a
            android.app.Dialog r0 = (android.app.Dialog) r0     // Catch: java.lang.Exception -> L1a
            boolean r0 = r0.isShowing()     // Catch: java.lang.Exception -> L1a
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 == 0) goto L1e
            return
        L1e:
            android.app.Dialog r0 = r2.Y
            if (r0 == 0) goto L29
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L29
            return
        L29:
            r2.D()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: msr.pistream.app.ui.home.screens.MainActivity.onBackPressed():void");
    }

    @Override // f8.g, androidx.fragment.app.b0, androidx.activity.j, w.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ViewGroup viewGroup;
        setTheme(R.style.Theme_PiStream);
        super.onCreate(bundle);
        try {
            if (FirebaseAuth.getInstance().getCurrentUser() == null) {
                startActivity(new Intent(this, (Class<?>) WelcomeActivity.class));
                finish();
                return;
            }
        } catch (Exception e10) {
            Log.e("MainActivity", "auth gate", e10);
        }
        this.f7747x = (HomeViewModel) new a1(this).a(HomeViewModel.class);
        this.f7748y = (FilterViewModel) new a1(this).a(FilterViewModel.class);
        HomeViewModel homeViewModel = this.f7747x;
        homeViewModel.f7811f.h(b8.a.c());
        homeViewModel.f7812g.h(b8.a.c());
        homeViewModel.f7813h.h(b8.a.c());
        homeViewModel.f7814i.h(b8.a.c());
        homeViewModel.f7815j.h(b8.a.c());
        homeViewModel.f7816k.h(b8.a.c());
        homeViewModel.f7817l.h(b8.a.c());
        homeViewModel.f7818m.h(b8.a.c());
        homeViewModel.f7819n.h(b8.a.c());
        homeViewModel.o.h(b8.a.c());
        homeViewModel.f7820p.h(b8.a.c());
        homeViewModel.f7821q.h(b8.a.c());
        int i10 = 1;
        homeViewModel.f7806a.execute(new x8.d(homeViewModel, i10));
        boolean z9 = false;
        this.f7747x.f7811f.e(this, new x(this, 0));
        this.f7747x.f7812g.e(this, new x(this, 2));
        this.f7747x.f7813h.e(this, new x(this, 3));
        int i11 = 4;
        this.f7747x.f7814i.e(this, new x(this, 4));
        this.f7747x.f7815j.e(this, new x(this, 5));
        int i12 = 6;
        this.f7747x.f7816k.e(this, new x(this, 6));
        this.f7747x.f7817l.e(this, new x(this, 7));
        this.f7747x.f7821q.e(this, new x(this, 8));
        this.f7747x.f7818m.e(this, new x(this, 9));
        this.f7747x.f7819n.e(this, new x(this, 10));
        this.f7747x.o.e(this, new x(this, 1));
        Window window = getWindow();
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(1280);
        ViewGroup frameLayout = new FrameLayout(this);
        int i13 = i.f11061a;
        frameLayout.setBackgroundColor(i13);
        frameLayout.setClipChildren(false);
        FrameLayout frameLayout2 = new FrameLayout(this);
        frameLayout2.setId(View.generateViewId());
        frameLayout2.setBackgroundColor(i13);
        frameLayout2.setElevation(i.e(this, 6));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, i.e(this, 120), 48));
        this.J = frameLayout2;
        this.K = new FrameLayout(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.topMargin = i.e(this, 120);
        frameLayout.addView(this.K, layoutParams);
        a0 a0Var = new a0(this, this);
        this.I = a0Var;
        a0Var.setFocusable(false);
        this.I.setFillViewport(true);
        this.I.setPadding(0, 0, 0, i.e(this, 82));
        this.I.setClipChildren(false);
        this.I.setClipToPadding(false);
        this.K.addView(this.I, new FrameLayout.LayoutParams(-1, -1));
        this.K.setClipChildren(false);
        this.K.setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(this);
        this.H = linearLayout;
        linearLayout.setOrientation(1);
        this.H.setClipChildren(false);
        this.H.setClipToPadding(false);
        this.I.addView(this.H, new FrameLayout.LayoutParams(-1, -2));
        this.I.setVerticalScrollBarEnabled(false);
        g8.c h10 = i.h(this, 56);
        this.N = h10;
        h10.setVisibility(8);
        int i14 = 17;
        frameLayout.addView(this.N, new FrameLayout.LayoutParams(i.e(this, 56), i.e(this, 56), 17));
        g8.c h11 = i.h(this, 56);
        this.L = h11;
        h11.setVisibility(8);
        int e11 = i.e(this, 56);
        frameLayout.addView(this.L, new FrameLayout.LayoutParams(e11, e11, 49));
        this.O = new f(this);
        this.C = new e(20, this, new x(this, 15));
        this.G = new n(this, new z(this, i14));
        this.X = new e(23, this, new z(this, 18));
        this.W = new i.g(this, this.F, new z(this, 19));
        final f fVar = this.O;
        x xVar = new x(this, 16);
        ArrayList arrayList = fVar.f5432b;
        arrayList.clear();
        ArrayList arrayList2 = fVar.f5433c;
        arrayList2.clear();
        Context context = fVar.f5431a;
        LinearLayout linearLayout2 = new LinearLayout(context);
        fVar.f5436f = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setBackgroundResource(R.drawable.bg_bottom_nav);
        final int i15 = 0;
        while (i15 < i11) {
            int i16 = f.f5430h[i15];
            String str = f.f5429g[i15];
            k kVar = new k(fVar, i15, xVar, i12);
            LinearLayout linearLayout3 = new LinearLayout(context);
            linearLayout3.setOrientation(i10);
            linearLayout3.setGravity(i14);
            linearLayout3.setPadding(0, i.e(context, i12), 0, i.e(context, 4));
            int i17 = i.f11068h;
            final ImageView imageView = new ImageView(context);
            imageView.setImageResource(i16);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setColorFilter(i17);
            x xVar2 = xVar;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i.e(context, 23), i.e(context, 23));
            layoutParams2.setMargins(0, 0, 0, 0);
            imageView.setLayoutParams(layoutParams2);
            linearLayout3.addView(imageView, new LinearLayout.LayoutParams(i.e(context, 27), i.e(context, 27)));
            final TextView l10 = i.l(context, str, 11, i17, 1);
            l10.setGravity(17);
            l10.setIncludeFontPadding(false);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams3.setMargins(0, i.e(context, 8), 0, 0);
            linearLayout3.addView(l10, layoutParams3);
            arrayList.add(imageView);
            arrayList2.add(l10);
            linearLayout3.setFocusable(true);
            linearLayout3.setFocusableInTouchMode(false);
            linearLayout3.setDefaultFocusHighlightEnabled(false);
            linearLayout3.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: i8.e
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z10) {
                    int i18;
                    f fVar2 = f.this;
                    if (z10) {
                        fVar2.getClass();
                    } else {
                        if (i15 != fVar2.f5434d) {
                            i18 = w8.i.f11068h;
                            imageView.setColorFilter(i18);
                            l10.setTextColor(i18);
                        }
                    }
                    i18 = w8.i.f11065e;
                    imageView.setColorFilter(i18);
                    l10.setTextColor(i18);
                }
            });
            linearLayout3.setOnClickListener(new v(fVar, i15, kVar, 1));
            linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(0, -1, 1.0f));
            i15++;
            z9 = false;
            i10 = 1;
            xVar = xVar2;
            frameLayout = frameLayout;
            i11 = 4;
            i12 = 6;
            i14 = 17;
        }
        ViewGroup viewGroup2 = frameLayout;
        boolean z10 = z9;
        if (context.getSharedPreferences("crash_logger", z10 ? 1 : 0).getBoolean("has_new_crash", z10) && (viewGroup = (ViewGroup) linearLayout2.getChildAt(4)) != null) {
            View childAt = viewGroup.getChildAt(z10 ? 1 : 0);
            viewGroup.removeView(childAt);
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.addView(childAt, new FrameLayout.LayoutParams(i.e(context, 27), i.e(context, 27), 17));
            View view = new View(context);
            fVar.f5435e = view;
            view.setBackground(i.j(i.f11065e, i.e(context, 4)));
            FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i.e(context, 8), i.e(context, 8));
            layoutParams4.gravity = 53;
            frameLayout3.addView(fVar.f5435e, layoutParams4);
            viewGroup.addView(frameLayout3, 0, new LinearLayout.LayoutParams(i.e(context, 27), i.e(context, 27)));
        }
        viewGroup2.addView(linearLayout2, new FrameLayout.LayoutParams(-1, i.e(this, 82), 80));
        setContentView(viewGroup2);
        G(getIntent());
        B(false);
    }

    @Override // f8.g, androidx.appcompat.app.a, androidx.fragment.app.b0, android.app.Activity
    public final void onDestroy() {
        n nVar = this.G;
        if (nVar != null) {
            Handler handler = nVar.f5454d;
            handler.removeCallbacks(nVar.f5455e);
            handler.removeCallbacksAndMessages(null);
        }
        this.D.shutdownNow();
        super.onDestroy();
    }

    @Override // androidx.activity.j, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        G(intent);
    }

    @Override // androidx.fragment.app.b0, android.app.Activity
    public final void onResume() {
        n nVar;
        a8.b bVar;
        super.onResume();
        int i10 = this.O.f5434d;
        if (i10 == 1) {
            R();
            return;
        }
        if (i10 == 2) {
            L();
        } else if (i10 == 0 && (nVar = this.G) != null && (bVar = nVar.f5460j) != null) {
            W(bVar);
            this.W.M();
        }
    }

    public final void z(String str) {
        FrameLayout frameLayout = this.J;
        int i10 = 0;
        int i11 = 1;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            N();
            FrameLayout frameLayout2 = this.J;
            l8.y yVar = new l8.y(this, i10);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setGravity(16);
            linearLayout.setPadding(i.e(this, 16), i.e(this, 56), i.e(this, 16), 0);
            linearLayout.setBackgroundColor(i.f11061a);
            frameLayout2.removeAllViews();
            frameLayout2.addView(linearLayout, new FrameLayout.LayoutParams(-1, i.e(this, 112)));
            ImageView E = E(R.drawable.ic_back, 44, 44, -1);
            E.setPadding(i.e(this, 8), i.e(this, 8), i.e(this, 8), i.e(this, 8));
            E.setOnClickListener(new j8.c(yVar, 0));
            linearLayout.addView(E, new LinearLayout.LayoutParams(i.e(this, 44), i.e(this, 44)));
            TextView l10 = i.l(this, str, 24, -1, 1);
            l10.setIncludeFontPadding(false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams.setMargins(i.e(this, 8), 0, 0, 0);
            linearLayout.addView(l10, layoutParams);
            return;
        }
        LinearLayout linearLayout2 = this.H;
        l8.y yVar2 = new l8.y(this, i11);
        LinearLayout linearLayout3 = new LinearLayout(this);
        linearLayout3.setGravity(16);
        linearLayout3.setPadding(i.e(this, 16), i.e(this, 56), i.e(this, 16), 0);
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(-1, i.e(this, 120)));
        ImageView E2 = E(R.drawable.ic_back, 44, 44, -1);
        E2.setPadding(i.e(this, 8), i.e(this, 8), i.e(this, 8), i.e(this, 8));
        E2.setOnClickListener(new j8.c(yVar2, 1));
        linearLayout3.addView(E2, new LinearLayout.LayoutParams(i.e(this, 44), i.e(this, 44)));
        TextView l11 = i.l(this, str, 24, -1, 1);
        l11.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.setMargins(i.e(this, 8), 0, 0, 0);
        linearLayout3.addView(l11, layoutParams2);
    }
}
