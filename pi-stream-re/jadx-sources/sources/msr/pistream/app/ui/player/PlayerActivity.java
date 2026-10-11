package msr.pistream.app.ui.player;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.c3;
import androidx.appcompat.widget.o3;
import androidx.lifecycle.a1;
import androidx.lifecycle.q0;
import c1.l0;
import dagger.hilt.android.AndroidEntryPoint;
import e8.a;
import f1.b0;
import f1.o;
import f1.x;
import f8.g;
import f8.h;
import h8.r;
import i8.l;
import i8.m;
import j1.b1;
import j3.i0;
import j3.j;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import k1.a0;
import l1.g0;
import msr.pistream.app.R;
import msr.pistream.app.ui.player.PlayerActivity;
import msr.pistream.app.viewmodel.PlayerViewModel;
import n8.d;
import n8.s;
import n8.t;
import o1.d0;
import o8.c;
import r.f;
import r6.h0;
import v8.b;
import w8.i;
import z3.e;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class PlayerActivity extends g {
    public static final /* synthetic */ int T0 = 0;
    public e A;
    public String A0;
    public c B;
    public String B0;
    public b C;
    public boolean C0;
    public h D;
    public final ArrayList D0;
    public h E;
    public long E0;
    public h F;
    public boolean F0;
    public d0 G;
    public boolean G0;
    public h H;
    public boolean H0;
    public e I;
    public LinearLayout I0;
    public t J;
    public boolean J0;
    public o3 K;
    public boolean K0;
    public d2.t L;
    public final boolean L0;
    public q0 M;
    public boolean M0;
    public a N;
    public boolean N0;
    public final ExecutorService O;
    public boolean O0;
    public final Handler P;
    public long P0;
    public final ArrayList Q;
    public final d Q0;
    public final ArrayList R;
    public final n8.e R0;
    public a8.e S;
    public final d S0;
    public j1.d0 T;
    public i0 U;
    public g8.c V;
    public FrameLayout W;
    public TextView X;
    public GridLayout Y;
    public LinearLayout Z;

    /* renamed from: a0, reason: collision with root package name */
    public int f7750a0;

    /* renamed from: b0, reason: collision with root package name */
    public LinearLayout f7751b0;

    /* renamed from: c0, reason: collision with root package name */
    public TextView f7752c0;

    /* renamed from: d0, reason: collision with root package name */
    public TextView f7753d0;

    /* renamed from: e0, reason: collision with root package name */
    public TextView f7754e0;

    /* renamed from: f0, reason: collision with root package name */
    public TextView f7755f0;

    /* renamed from: g0, reason: collision with root package name */
    public TextView f7756g0;

    /* renamed from: h0, reason: collision with root package name */
    public ImageView f7757h0;

    /* renamed from: i0, reason: collision with root package name */
    public ImageView f7758i0;

    /* renamed from: j0, reason: collision with root package name */
    public ImageView f7759j0;

    /* renamed from: k0, reason: collision with root package name */
    public TextView f7760k0;

    /* renamed from: l0, reason: collision with root package name */
    public TextView f7761l0;

    /* renamed from: m0, reason: collision with root package name */
    public TextView f7762m0;

    /* renamed from: n0, reason: collision with root package name */
    public q8.c f7763n0;

    /* renamed from: o0, reason: collision with root package name */
    public u8.a f7764o0;

    /* renamed from: p0, reason: collision with root package name */
    public SeekBar f7765p0;

    /* renamed from: q0, reason: collision with root package name */
    public AudioManager f7766q0;

    /* renamed from: r0, reason: collision with root package name */
    public ImageView f7767r0;

    /* renamed from: s0, reason: collision with root package name */
    public ImageView f7768s0;

    /* renamed from: t0, reason: collision with root package name */
    public ImageView f7769t0;

    /* renamed from: u0, reason: collision with root package name */
    public ImageView f7770u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f7771v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f7772w0;

    /* renamed from: x, reason: collision with root package name */
    public PlayerViewModel f7773x;

    /* renamed from: x0, reason: collision with root package name */
    public int f7774x0;

    /* renamed from: y, reason: collision with root package name */
    public s8.b f7775y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f7776y0;

    /* renamed from: z, reason: collision with root package name */
    public q8.b f7777z;

    /* renamed from: z0, reason: collision with root package name */
    public TextView f7778z0;

    public PlayerActivity() {
        super(3);
        this.O = Executors.newSingleThreadExecutor();
        this.P = new Handler(Looper.getMainLooper());
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.f7750a0 = -1;
        this.f7772w0 = 1;
        this.f7774x0 = -1;
        this.f7776y0 = false;
        this.B0 = "AUTO";
        this.D0 = new ArrayList();
        this.E0 = -1L;
        this.L0 = true;
        this.N0 = true;
        this.Q0 = new d(this, 1);
        this.R0 = new n8.e(this);
        this.S0 = new d(this, 2);
    }

    public final void A(String str, boolean z9) {
        if (this.X == null) {
            return;
        }
        Handler handler = this.P;
        d dVar = this.S0;
        handler.removeCallbacks(dVar);
        this.X.animate().cancel();
        this.X.setText(str);
        this.X.setVisibility(0);
        this.X.setAlpha(0.0f);
        this.X.animate().alpha(1.0f).setDuration(120L).start();
        if (z9) {
            handler.postDelayed(dVar, 1400L);
        }
    }

    public final void B() {
        s8.b bVar = this.f7775y;
        this.T = bVar.f9937e;
        this.f7774x0 = bVar.f9940h;
        this.A0 = null;
        this.B0 = bVar.f9942j;
        this.J0 = bVar.f9944l;
        this.C0 = bVar.f9943k;
    }

    public final void C() {
        TextView textView = this.f7753d0;
        if (textView != null) {
            textView.setText(com.bumptech.glide.d.R(this.S));
        }
        TextView textView2 = this.f7754e0;
        if (textView2 != null) {
            textView2.setText(com.bumptech.glide.d.h0(this.S));
        }
        this.A.C();
    }

    public final void D() {
        long s9;
        String str;
        j1.d0 d0Var = this.T;
        if (d0Var == null) {
            return;
        }
        long max = Math.max(0L, d0Var.y());
        long max2 = Math.max(0L, this.T.D());
        j1.d0 d0Var2 = this.T;
        d0Var2.h0();
        if (d0Var2.L()) {
            b1 b1Var = d0Var2.f5675f0;
            if (b1Var.f5646k.equals(b1Var.f5637b)) {
                s9 = b0.c0(d0Var2.f5675f0.f5650p);
            } else {
                s9 = d0Var2.D();
            }
        } else {
            s9 = d0Var2.s();
        }
        long max3 = Math.max(max, s9);
        boolean z9 = false;
        this.G.f8137a = false;
        FrameLayout frameLayout = this.W;
        if (frameLayout != null && frameLayout.getVisibility() == 0 && this.W.getAlpha() > 0.5f) {
            this.G.k();
        } else {
            TextView textView = this.f7762m0;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        TextView textView2 = this.f7760k0;
        if (textView2 != null) {
            textView2.setText(com.bumptech.glide.d.v(max));
        }
        TextView textView3 = this.f7761l0;
        if (textView3 != null) {
            if (max2 > 0) {
                str = com.bumptech.glide.d.v(max2);
            } else {
                str = "--:--";
            }
            textView3.setText(str);
        }
        SeekBar seekBar = this.f7765p0;
        if (seekBar != null && max2 > 0 && !this.F0) {
            seekBar.setProgress((int) Math.min(1000L, (max * 1000) / max2));
            this.f7765p0.setSecondaryProgress((int) Math.min(1000L, (max3 * 1000) / max2));
        }
        this.G.l();
        this.A.K();
        d2.t tVar = this.L;
        tVar.getClass();
        if (System.currentTimeMillis() - tVar.f3191a > 5000) {
            z9 = true;
        }
        if (z9) {
            this.L.a(this, this.T, this.S);
        }
    }

    public final FrameLayout E(int i10, final boolean z9) {
        int i11;
        int i12;
        int e10;
        int i13;
        int i14;
        int i15;
        final FrameLayout frameLayout;
        int i16;
        int i17;
        int i18;
        final t tVar = this.J;
        tVar.getClass();
        Context context = tVar.f8068t;
        final FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackgroundColor(-16777216);
        q8.b bVar = tVar.f8069u;
        if (bVar.f9234c == null) {
            bVar.f9234c = new GestureDetector(bVar.f9232a, new q8.a(bVar));
        }
        i0 i0Var = new i0(context);
        tVar.f8050a = i0Var;
        tVar.f8070v.f9938f = i0Var;
        final int i19 = 0;
        i0Var.setUseController(false);
        final int i20 = 1;
        tVar.f8050a.setKeepScreenOn(true);
        tVar.f8050a.setResizeMode(0);
        i0 i0Var2 = tVar.f8050a;
        int i21 = i10;
        if (i21 == -1) {
            i21 = -1;
        }
        frameLayout2.addView(i0Var2, new FrameLayout.LayoutParams(-1, i21));
        final n8.a aVar = tVar.f8072x;
        aVar.f8024b.f7775y.a();
        FrameLayout frameLayout3 = new FrameLayout(context);
        tVar.f8051b = frameLayout3;
        frameLayout3.setBackgroundColor(0);
        frameLayout2.addView(tVar.f8051b, new FrameLayout.LayoutParams(-1, -1));
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: n8.o
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
            
                if (r5 != 3) goto L61;
             */
            @Override // android.view.View.OnTouchListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onTouch(android.view.View r17, android.view.MotionEvent r18) {
                /*
                    Method dump skipped, instructions count: 526
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.o.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }
        };
        frameLayout2.setOnTouchListener(onTouchListener);
        tVar.f8051b.setOnTouchListener(onTouchListener);
        final int i22 = 6;
        ImageView Z = com.bumptech.glide.c.Z(R.drawable.ic_unlock, context, new Runnable() { // from class: n8.p
            /* JADX WARN: Removed duplicated region for block: B:226:0x073f  */
            /* JADX WARN: Removed duplicated region for block: B:233:0x0771  */
            /* JADX WARN: Removed duplicated region for block: B:238:0x07ee  */
            /* JADX WARN: Removed duplicated region for block: B:263:0x0841  */
            /* JADX WARN: Removed duplicated region for block: B:266:0x0863  */
            /* JADX WARN: Removed duplicated region for block: B:268:0x084c  */
            /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:271:0x07c8  */
            /* JADX WARN: Removed duplicated region for block: B:274:0x074f  */
            /* JADX WARN: Type inference failed for: r6v10, types: [o8.b] */
            /* JADX WARN: Type inference failed for: r7v16, types: [o8.b] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2424
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.p.run():void");
            }
        });
        tVar.f8052c = Z;
        Z.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i.e(context, 44), i.e(context, 44), 51);
        int e11 = i.e(context, 48);
        if (z9) {
            i11 = 92;
        } else {
            i11 = 138;
        }
        layoutParams.setMargins(e11, i.e(context, i11), 0, 0);
        frameLayout2.addView(tVar.f8052c, layoutParams);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-872415232, 1711276032, 0}));
        linearLayout.setGravity(16);
        if (z9) {
            i12 = 24;
        } else {
            i12 = 30;
        }
        int e12 = i.e(context, i12);
        if (z9) {
            e10 = i.e(context, 22);
        } else {
            e10 = i.e(context, 42);
        }
        if (z9) {
            i13 = 24;
        } else {
            i13 = 33;
        }
        linearLayout.setPadding(e12, e10, i.e(context, i13), 0);
        FrameLayout frameLayout4 = tVar.f8051b;
        if (z9) {
            i14 = 86;
        } else {
            i14 = 102;
        }
        frameLayout4.addView(linearLayout, new FrameLayout.LayoutParams(-1, i.e(context, i14), 48));
        tVar.f8053d = linearLayout;
        final int i23 = 7;
        linearLayout.addView(com.bumptech.glide.c.Z(R.drawable.ic_back, context, new Runnable() { // from class: n8.p
            @Override // java.lang.Runnable
            public final void run() {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instructions count: 2424
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.p.run():void");
            }
        }), new LinearLayout.LayoutParams(i.e(context, 42), i.e(context, 42)));
        String R = com.bumptech.glide.d.R(aVar.d());
        if (z9) {
            i15 = 20;
        } else {
            i15 = 26;
        }
        TextView l10 = i.l(context, R, i15, -1, 1);
        tVar.f8054e = l10;
        l10.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, i.e(context, 44), 1.0f);
        layoutParams2.setMargins(i.e(context, 18), 0, i.e(context, 8), 0);
        linearLayout.addView(tVar.f8054e, layoutParams2);
        int i24 = 2;
        if (z9) {
            List k10 = aVar.k();
            int j4 = aVar.j();
            aVar.F();
            TextView i25 = i.i(context, com.bumptech.glide.d.q(k10, j4), false);
            tVar.f8055f = i25;
            i25.setTextSize(14.0f);
            tVar.f8055f.setMinHeight(0);
            tVar.f8055f.setGravity(17);
            tVar.f8055f.setSingleLine(true);
            tVar.f8055f.setMaxLines(1);
            tVar.f8055f.setEllipsize(TextUtils.TruncateAt.END);
            tVar.f8055f.setMaxWidth(i.e(context, 220));
            i.d(tVar.f8055f);
            tVar.f8055f.setOnClickListener(new n8.i(tVar, i24));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, i.e(context, 40));
            final int i26 = 8;
            layoutParams3.setMargins(0, 0, i.e(context, 8), 0);
            linearLayout.addView(tVar.f8055f, layoutParams3);
            linearLayout.addView(com.bumptech.glide.c.Z(R.drawable.exo_ic_speed, context, new Runnable() { // from class: n8.p
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    */
                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 2424
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: n8.p.run():void");
                }
            }), com.bumptech.glide.c.m0(context));
        }
        final int i27 = 9;
        linearLayout.addView(com.bumptech.glide.c.Z(R.drawable.ic_player_audio_modern, context, new Runnable() { // from class: n8.p
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2424
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.p.run():void");
            }
        }), com.bumptech.glide.c.m0(context));
        final int i28 = 10;
        linearLayout.addView(com.bumptech.glide.c.Z(R.drawable.ic_subtitle, context, new Runnable() { // from class: n8.p
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2424
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.p.run():void");
            }
        }), com.bumptech.glide.c.m0(context));
        final int i29 = 11;
        linearLayout.addView(com.bumptech.glide.c.Z(R.drawable.ic_cast_button_static, context, new Runnable() { // from class: n8.p
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2424
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.p.run():void");
            }
        }), com.bumptech.glide.c.m0(context));
        PlayerActivity playerActivity = aVar.f8024b;
        if (z9) {
            final int i30 = 12;
            linearLayout.addView(com.bumptech.glide.c.Z(R.drawable.ic_episode, context, new Runnable() { // from class: n8.p
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    */
                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 2424
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: n8.p.run():void");
                }
            }), com.bumptech.glide.c.m0(context));
            e eVar = playerActivity.I;
            eVar.f12045c = null;
            LinearLayout linearLayout2 = new LinearLayout(playerActivity);
            linearLayout2.setGravity(17);
            linearLayout2.setPadding(i.e(playerActivity, 10), 0, i.e(playerActivity, 10), 0);
            linearLayout2.setBackgroundResource(R.drawable.ripple_circle);
            TextView l11 = i.l(playerActivity, com.bumptech.glide.d.S(((n8.a) eVar.f12044b).i()), 12, -1, 1);
            eVar.f12045c = l11;
            l11.setGravity(17);
            linearLayout2.addView((TextView) eVar.f12045c, new LinearLayout.LayoutParams(-2, -2));
            i.d(linearLayout2);
            linearLayout2.setOnClickListener(new j(eVar, i30));
            playerActivity.I.getClass();
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i.e(playerActivity, 54), i.e(playerActivity, 42));
            layoutParams4.setMargins(0, 0, i.e(playerActivity, 8), 0);
            linearLayout.addView(linearLayout2, layoutParams4);
            final int i31 = 13;
            linearLayout.addView(com.bumptech.glide.c.Z(R.drawable.ic_settings, context, new Runnable() { // from class: n8.p
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    */
                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 2424
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: n8.p.run():void");
                }
            }), com.bumptech.glide.c.m0(context));
        }
        boolean H = com.bumptech.glide.c.H(context);
        if (com.bumptech.glide.c.G(context)) {
            frameLayout = frameLayout2;
        } else {
            frameLayout = tVar.f8051b;
        }
        if (H && z9) {
            final ImageView a02 = com.bumptech.glide.c.a0(context, R.drawable.ic_screenshot, new Runnable() { // from class: n8.p
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    */
                @Override // java.lang.Runnable
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 2424
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: n8.p.run():void");
                }
            }, 7);
            final c cVar = playerActivity.B;
            PlayerActivity playerActivity2 = cVar.f8339a.f8024b;
            frameLayout.addView(a02, new FrameLayout.LayoutParams(i.e(playerActivity2, 44), i.e(playerActivity2, 44), 51));
            frameLayout.post(new Runnable() { // from class: o8.a
                @Override // java.lang.Runnable
                public final void run() {
                    int i32;
                    int i33;
                    PlayerActivity playerActivity3 = c.this.f8339a.f8024b;
                    float f10 = com.bumptech.glide.c.b0(playerActivity3).getFloat("frame_capture_pos_x", -1.0f);
                    float f11 = com.bumptech.glide.c.b0(playerActivity3).getFloat("frame_capture_pos_y", -1.0f);
                    FrameLayout frameLayout5 = frameLayout;
                    int width = frameLayout5.getWidth();
                    ImageView imageView = a02;
                    int max = Math.max(0, width - imageView.getWidth());
                    int max2 = Math.max(0, frameLayout5.getHeight() - imageView.getHeight());
                    if (f10 >= 0.0f && f11 >= 0.0f) {
                        c.b(frameLayout5, imageView, f10 * max, f11 * max2);
                        return;
                    }
                    int width2 = frameLayout5.getWidth() - imageView.getWidth();
                    boolean z10 = z9;
                    if (z10) {
                        i32 = 24;
                    } else {
                        i32 = 33;
                    }
                    float e13 = width2 - i.e(playerActivity3, i32);
                    if (z10) {
                        i33 = 86;
                    } else {
                        i33 = 130;
                    }
                    c.b(frameLayout5, imageView, e13, i.e(playerActivity3, i33));
                }
            });
            a02.setOnTouchListener(new l(cVar, playerActivity2, frameLayout, i20));
        }
        TextView l12 = i.l(context, "", 14, -1, 1);
        tVar.f8067s = l12;
        l12.setGravity(17);
        tVar.f8067s.setAlpha(0.0f);
        tVar.f8067s.setVisibility(8);
        tVar.f8067s.setPadding(0, 0, 0, 0);
        tVar.f8067s.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, i.e(context, 36), 53);
        if (z9) {
            i16 = 138;
        } else {
            i16 = 182;
        }
        int e13 = i.e(context, i16);
        if (z9) {
            i17 = 24;
        } else {
            i17 = 33;
        }
        layoutParams5.setMargins(0, e13, i.e(context, i17), 0);
        frameLayout.addView(tVar.f8067s, layoutParams5);
        FrameLayout frameLayout5 = new FrameLayout(context);
        frameLayout5.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-872415232, 1711276032, 0}));
        frameLayout5.setPadding(0, 0, 0, i.e(context, 14));
        tVar.f8051b.addView(frameLayout5, new FrameLayout.LayoutParams(-1, i.e(context, 112), 80));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setGravity(16);
        linearLayout3.setPadding(i.e(context, 30), 0, i.e(context, 30), 0);
        frameLayout5.addView(linearLayout3, new FrameLayout.LayoutParams(-1, i.e(context, 38), 48));
        TextView l13 = i.l(context, "00:00", 14, -1, 1);
        tVar.f8057h = l13;
        linearLayout3.addView(l13, new LinearLayout.LayoutParams(-2, -2));
        FrameLayout frameLayout6 = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, i.e(context, 32), 1.0f);
        layoutParams6.setMargins(i.e(context, 10), 0, i.e(context, 10), 0);
        linearLayout3.addView(frameLayout6, layoutParams6);
        SeekBar seekBar = new SeekBar(context);
        tVar.f8056g = seekBar;
        seekBar.setMax(1000);
        SeekBar seekBar2 = tVar.f8056g;
        GradientDrawable f02 = com.bumptech.glide.c.f0(context, 1717528178);
        ClipDrawable clipDrawable = new ClipDrawable(com.bumptech.glide.c.f0(context, -1711276033), 3, 1);
        int i32 = i.f11065e;
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{f02, clipDrawable, new ClipDrawable(com.bumptech.glide.c.f0(context, i32), 3, 1)});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        int e14 = i.e(context, 14);
        layerDrawable.setLayerInset(0, 0, e14, 0, e14);
        layerDrawable.setLayerInset(1, 0, e14, 0, e14);
        layerDrawable.setLayerInset(2, 0, e14, 0, e14);
        seekBar2.setProgressDrawable(layerDrawable);
        SeekBar seekBar3 = tVar.f8056g;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i32);
        gradientDrawable.setSize(i.e(context, 12), i.e(context, 12));
        seekBar3.setThumb(gradientDrawable);
        tVar.f8056g.setThumbOffset(i.e(context, 6));
        tVar.f8056g.setSplitTrack(false);
        tVar.f8056g.setFocusable(true);
        tVar.f8056g.setFocusableInTouchMode(false);
        tVar.f8056g.setOnKeyListener(new View.OnKeyListener() { // from class: n8.q
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i33, KeyEvent keyEvent) {
                t tVar2 = t.this;
                tVar2.getClass();
                if (keyEvent.getAction() == 0) {
                    Context context2 = tVar2.f8068t;
                    a aVar2 = tVar2.f8072x;
                    if (i33 == 22) {
                        aVar2.f8024b.z(com.bumptech.glide.c.y(context2));
                    } else if (i33 == 21) {
                        aVar2.f8024b.z(-com.bumptech.glide.c.y(context2));
                    }
                    return true;
                }
                return false;
            }
        });
        tVar.f8056g.setOnSeekBarChangeListener(new s(tVar));
        u8.a aVar2 = new u8.a(context);
        tVar.f8059j = aVar2;
        aVar2.setVisibility(8);
        frameLayout6.addView(tVar.f8059j, new FrameLayout.LayoutParams(-1, i.e(context, 16), 17));
        frameLayout6.addView(tVar.f8056g, new FrameLayout.LayoutParams(-1, i.e(context, 32), 17));
        TextView l14 = i.l(context, "00:00", 14, -1, 1);
        tVar.f8058i = l14;
        linearLayout3.addView(l14, new LinearLayout.LayoutParams(-2, -2));
        FrameLayout frameLayout7 = new FrameLayout(context);
        frameLayout5.addView(frameLayout7, new FrameLayout.LayoutParams(-1, i.e(context, 58), 80));
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(i.e(context, 44), i.e(context, 44), 19);
        layoutParams7.setMargins(i.e(context, 24), 0, 0, 0);
        ImageView Z2 = com.bumptech.glide.c.Z(R.drawable.ic_unlock, context, new Runnable() { // from class: n8.p
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2424
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.p.run():void");
            }
        });
        tVar.f8060k = Z2;
        frameLayout7.addView(Z2, layoutParams7);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(i.e(context, 44), i.e(context, 44), 19);
        final int i33 = 0;
        layoutParams8.setMargins(i.e(context, 76), 0, 0, 0);
        final int i34 = 2;
        ImageView Z3 = com.bumptech.glide.c.Z(R.drawable.ic_volume_up, context, new Runnable() { // from class: n8.p
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2424
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.p.run():void");
            }
        });
        tVar.f8061l = Z3;
        frameLayout7.addView(Z3, layoutParams8);
        if (z9) {
            frameLayout7.addView(com.bumptech.glide.c.g(context, R.drawable.ic_player_rewind_modern, -140, new Runnable() { // from class: n8.r
                @Override // java.lang.Runnable
                public final void run() {
                    int i35 = i33;
                    t tVar2 = tVar;
                    switch (i35) {
                        case 0:
                            tVar2.f8072x.f8024b.z(-com.bumptech.glide.c.y(tVar2.f8068t));
                            return;
                        default:
                            tVar2.f8072x.f8024b.z(com.bumptech.glide.c.y(tVar2.f8068t));
                            return;
                    }
                }
            }));
        }
        final int i35 = 3;
        ImageView g10 = com.bumptech.glide.c.g(context, R.drawable.ic_player_previous_modern, -70, new Runnable() { // from class: n8.p
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2424
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.p.run():void");
            }
        });
        tVar.f8062m = g10;
        frameLayout7.addView(g10);
        playerActivity.getClass();
        d dVar = new d(playerActivity, 4);
        int i36 = R.drawable.ic_player_play_modern;
        ImageView a03 = com.bumptech.glide.c.a0(playerActivity, R.drawable.ic_player_play_modern, dVar, 0);
        a03.setBackgroundResource(R.drawable.ripple_borderless);
        Object f10 = ((n8.a) playerActivity.A.f12044b).f();
        if (f10 != null && ((c1.i) f10).h()) {
            i36 = R.drawable.exo_icon_pause;
        }
        a03.setImageResource(i36);
        a03.clearColorFilter();
        a03.setPadding(0, 0, 0, 0);
        tVar.f8063n = a03;
        frameLayout7.addView(tVar.f8063n, new FrameLayout.LayoutParams(i.e(context, 44), i.e(context, 44), 17));
        final int i37 = 4;
        ImageView g11 = com.bumptech.glide.c.g(context, R.drawable.ic_player_next_modern, 70, new Runnable() { // from class: n8.p
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2424
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.p.run():void");
            }
        });
        tVar.o = g11;
        frameLayout7.addView(g11);
        if (z9) {
            frameLayout7.addView(com.bumptech.glide.c.g(context, R.drawable.ic_player_forward_modern, 140, new Runnable() { // from class: n8.r
                @Override // java.lang.Runnable
                public final void run() {
                    int i352 = i20;
                    t tVar2 = tVar;
                    switch (i352) {
                        case 0:
                            tVar2.f8072x.f8024b.z(-com.bumptech.glide.c.y(tVar2.f8068t));
                            return;
                        default:
                            tVar2.f8072x.f8024b.z(com.bumptech.glide.c.y(tVar2.f8068t));
                            return;
                    }
                }
            }));
        }
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(i.e(context, 44), i.e(context, 44), 21);
        layoutParams9.setMargins(0, 0, i.e(context, 24), 0);
        final int i38 = 5;
        ImageView Z4 = com.bumptech.glide.c.Z(playerActivity.A.s(), context, new Runnable() { // from class: n8.p
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    Method dump skipped, instructions count: 2424
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: n8.p.run():void");
            }
        });
        tVar.f8064p = Z4;
        frameLayout7.addView(Z4, layoutParams9);
        playerActivity.A.g(false);
        tVar.f8071w.L();
        e eVar2 = playerActivity.A;
        ImageView imageView = ((n8.a) eVar2.f12044b).f8024b.f7770u0;
        if (imageView != null) {
            imageView.setImageResource(eVar2.s());
            imageView.clearColorFilter();
        }
        tVar.f8071w.J(playerActivity.f7771v0, ((ArrayList) aVar.e()).size());
        TextView l15 = i.l(context, "Skip intro", 16, -16777216, 1);
        tVar.f8065q = l15;
        l15.setGravity(17);
        tVar.f8065q.setBackground(i.j(-1, i.e(context, 7)));
        i.d(tVar.f8065q);
        tVar.f8065q.setPadding(i.e(context, 18), 0, i.e(context, 18), 0);
        tVar.f8065q.setVisibility(8);
        FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(i.e(context, 144), i.e(context, 54), 21);
        if (z9) {
            i18 = 40;
        } else {
            i18 = 38;
        }
        layoutParams10.setMargins(0, 0, i.e(context, i18), 0);
        frameLayout2.addView(tVar.f8065q, layoutParams10);
        q8.c cVar2 = new q8.c(context);
        tVar.f8066r = cVar2;
        cVar2.setVisibility(8);
        frameLayout2.addView(tVar.f8066r, new FrameLayout.LayoutParams(i.e(context, 82), i.e(context, 138), 19));
        t tVar2 = this.J;
        this.U = tVar2.f8050a;
        this.W = tVar2.f8051b;
        this.f7768s0 = tVar2.f8052c;
        this.I0 = tVar2.f8053d;
        this.f7753d0 = tVar2.f8054e;
        this.f7752c0 = tVar2.f8055f;
        if (!this.M0) {
            this.M0 = true;
            this.f7773x.f7831g.e(this, new n8.c(this, 0));
        }
        t tVar3 = this.J;
        this.X = tVar3.f8067s;
        this.f7765p0 = tVar3.f8056g;
        this.f7760k0 = tVar3.f8057h;
        this.f7761l0 = tVar3.f8058i;
        this.f7764o0 = tVar3.f8059j;
        this.f7767r0 = tVar3.f8060k;
        this.f7769t0 = tVar3.f8061l;
        this.f7758i0 = tVar3.f8062m;
        this.f7757h0 = tVar3.f8063n;
        this.f7759j0 = tVar3.o;
        this.f7770u0 = tVar3.f8064p;
        this.f7762m0 = tVar3.f8065q;
        this.f7763n0 = tVar3.f8066r;
        this.N0 = com.bumptech.glide.c.H(this);
        this.O0 = com.bumptech.glide.c.G(this);
        return frameLayout2;
    }

    @Override // androidx.appcompat.app.a, w.n, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z9;
        FrameLayout frameLayout;
        j1.d0 d0Var;
        j1.d0 d0Var2;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 85) {
                this.f7775y.j();
                return true;
            }
            if (keyCode == 126 && (d0Var2 = this.T) != null && !d0Var2.h()) {
                this.f7775y.j();
                return true;
            }
            if (keyCode == 127 && (d0Var = this.T) != null && d0Var.h()) {
                this.f7775y.j();
                return true;
            }
            if (keyCode == 90) {
                z(com.bumptech.glide.c.y(this));
                return true;
            }
            if (keyCode == 89) {
                z(-com.bumptech.glide.c.y(this));
                return true;
            }
            if (keyCode != 19 && keyCode != 20 && keyCode != 21 && keyCode != 22 && keyCode != 23 && keyCode != 66) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9 && !this.G0 && (frameLayout = this.W) != null && frameLayout.getVisibility() != 0) {
                this.A.H();
                ImageView imageView = this.f7757h0;
                if (imageView != null) {
                    imageView.requestFocus();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.pop_left_in, R.anim.pop_right_out);
    }

    @Override // androidx.fragment.app.b0, androidx.activity.j, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
    }

    @Override // androidx.activity.j, android.app.Activity
    public final void onBackPressed() {
        this.A.z();
    }

    @Override // androidx.appcompat.app.a, androidx.activity.j, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        B();
        u();
        this.f7775y.a();
        this.C.b();
        this.A.C();
        this.A.D();
        y();
        D();
    }

    @Override // f8.g, androidx.fragment.app.b0, androidx.activity.j, w.n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i10;
        String str;
        super.onCreate(bundle);
        FrameLayout frameLayout = new FrameLayout(this);
        View progressBar = new ProgressBar(this, null, android.R.attr.progressBarStyleLarge);
        int i11 = 0;
        progressBar.setVisibility(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        frameLayout.addView(progressBar, layoutParams);
        setContentView(frameLayout);
        this.f7773x = (PlayerViewModel) new a1(this).a(PlayerViewModel.class);
        this.S = (a8.e) getIntent().getParcelableExtra("episode");
        this.P0 = Math.max(0L, getIntent().getLongExtra("resume_position_ms", 0L));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("episodes");
        ArrayList arrayList = this.Q;
        if (parcelableArrayListExtra != null) {
            arrayList.addAll(parcelableArrayListExtra);
        }
        if (this.S == null) {
            finish();
            return;
        }
        boolean z9 = true;
        this.H = new h(new n8.a(this, 1 == true ? 1 : 0));
        if (arrayList.isEmpty()) {
            arrayList.add(this.S);
        }
        int c6 = this.H.c(this.S);
        this.f7771v0 = c6;
        a8.e eVar = (a8.e) arrayList.get(c6);
        this.S = eVar;
        this.f7772w0 = com.bumptech.glide.d.T(eVar);
        if (com.bumptech.glide.c.b0(this).getBoolean("player_auto_rotate", true)) {
            i10 = -1;
        } else {
            i10 = 7;
        }
        setRequestedOrientation(i10);
        if (arrayList.size() > 1 || (str = this.S.f188f) == null || str.trim().isEmpty()) {
            z9 = false;
        }
        this.K0 = z9;
        this.P.post(new d(this, i11));
    }

    @Override // f8.g, androidx.appcompat.app.a, androidx.fragment.app.b0, android.app.Activity
    public final void onDestroy() {
        String str;
        AudioTrack audioTrack;
        this.L.a(this, this.T, this.S);
        this.P.removeCallbacks(this.R0);
        this.P.removeCallbacks(this.Q0);
        this.P.removeCallbacks(this.f7777z.f9243l);
        this.P.removeCallbacks(this.S0);
        j1.d0 d0Var = this.T;
        if (d0Var != null) {
            StringBuilder sb = new StringBuilder("Release ");
            sb.append(Integer.toHexString(System.identityHashCode(d0Var)));
            sb.append(" [AndroidXMedia3/1.3.1] [");
            sb.append(b0.f3803e);
            sb.append("] [");
            HashSet hashSet = l0.f1799a;
            synchronized (l0.class) {
                str = l0.f1800b;
            }
            sb.append(str);
            sb.append("]");
            o.e("ExoPlayerImpl", sb.toString());
            d0Var.h0();
            if (b0.f3799a < 21 && (audioTrack = d0Var.N) != null) {
                audioTrack.release();
                d0Var.N = null;
            }
            d0Var.f5695y.i(false);
            d0Var.A.f(false);
            d0Var.B.f(false);
            j1.d dVar = d0Var.f5696z;
            dVar.f5658c = null;
            dVar.a();
            int i10 = 1;
            if (!d0Var.f5682k.z()) {
                d0Var.f5683l.l(10, new j1.l(i10));
            }
            d0Var.f5683l.k();
            d0Var.f5680i.f3866a.removeCallbacksAndMessages(null);
            ((z1.g) d0Var.f5689s).f11912b.H(d0Var.f5687q);
            b1 b1Var = d0Var.f5675f0;
            if (b1Var.o) {
                d0Var.f5675f0 = b1Var.a();
            }
            b1 g10 = d0Var.f5675f0.g(1);
            d0Var.f5675f0 = g10;
            b1 b10 = g10.b(g10.f5637b);
            d0Var.f5675f0 = b10;
            b10.f5650p = b10.f5652r;
            d0Var.f5675f0.f5651q = 0L;
            a0 a0Var = (a0) d0Var.f5687q;
            x xVar = a0Var.f6320y;
            w7.b.w(xVar);
            xVar.c(new androidx.activity.b(a0Var, 6));
            d0Var.f5678h.a();
            d0Var.R();
            Surface surface = d0Var.P;
            if (surface != null) {
                surface.release();
                d0Var.P = null;
            }
            d0Var.f5665a0 = e1.c.f3363b;
            this.T = null;
        }
        this.O.shutdownNow();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.b0, android.app.Activity
    public final void onResume() {
        super.onResume();
        boolean H = com.bumptech.glide.c.H(this);
        boolean G = com.bumptech.glide.c.G(this);
        if (this.U != null) {
            if (this.N0 != H || this.O0 != G) {
                B();
                u();
                this.f7775y.a();
                this.C.b();
                this.A.C();
                this.A.D();
                y();
                D();
            }
        }
    }

    @Override // androidx.appcompat.app.a, androidx.fragment.app.b0, android.app.Activity
    public final void onStop() {
        super.onStop();
        this.L.a(this, this.T, this.S);
        j1.d0 d0Var = this.T;
        if (d0Var != null) {
            d0Var.V(false);
        }
    }

    public final void u() {
        int i10;
        FrameLayout frameLayout;
        TextView textView;
        String p3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z9;
        e eVar = this.A;
        PlayerActivity playerActivity = ((n8.a) eVar.f12044b).f8024b;
        if (playerActivity != null) {
            if (playerActivity.getResources().getConfiguration().orientation == 2) {
                z9 = true;
            } else {
                z9 = false;
            }
            Window y9 = eVar.y();
            if (y9 != null) {
                if (z9) {
                    y9.getDecorView().setSystemUiVisibility(5894);
                } else {
                    y9.getDecorView().setSystemUiVisibility(256);
                }
            }
        }
        if (getResources().getConfiguration().orientation == 2) {
            FrameLayout E = E(-1, true);
            q0 q0Var = this.M;
            boolean z10 = this.J0;
            q0Var.getClass();
            FrameLayout frameLayout2 = new FrameLayout(this);
            frameLayout2.setBackgroundColor(i.f11062b);
            frameLayout2.addView(E, new FrameLayout.LayoutParams(-1, -1));
            g8.c h10 = i.h(this, 58);
            frameLayout2.addView(h10, new FrameLayout.LayoutParams(i.e(this, 58), i.e(this, 58), 17));
            if (z10) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            h10.setVisibility(i15);
            TextView l10 = i.l(this, "", 14, i.f11065e, 1);
            l10.setGravity(17);
            l10.setPadding(i.e(this, 16), i.e(this, 12), i.e(this, 16), i.e(this, 12));
            l10.setVisibility(8);
            frameLayout2.addView(l10, new FrameLayout.LayoutParams(-1, -2, 17));
            this.f7778z0 = l10;
            this.V = h10;
            setContentView(frameLayout2);
        } else {
            int i16 = 460;
            if (((n8.a) this.A.f12044b).f8024b != null) {
                i16 = Math.max(460, Math.round(r1.getResources().getDisplayMetrics().heightPixels * 0.3f));
            }
            FrameLayout E2 = E(i16, false);
            q0 q0Var2 = this.M;
            final e eVar2 = this.A;
            a8.e eVar3 = this.S;
            boolean z11 = this.J0;
            q0Var2.getClass();
            FrameLayout frameLayout3 = new FrameLayout(this);
            frameLayout3.setBackgroundColor(i.f11062b);
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            frameLayout3.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout frameLayout4 = new FrameLayout(this);
            frameLayout4.addView(E2, new FrameLayout.LayoutParams(-1, i16));
            linearLayout.addView(frameLayout4, new LinearLayout.LayoutParams(-1, i16));
            TextView l11 = i.l(this, com.bumptech.glide.d.h0(eVar3), 18, -1, 1);
            l11.setGravity(17);
            l11.setBackgroundColor(i.f11063c);
            linearLayout.addView(l11, new LinearLayout.LayoutParams(-1, i.e(this, 72)));
            ScrollView scrollView = new ScrollView(this);
            scrollView.setVerticalScrollBarEnabled(false);
            scrollView.setFocusable(false);
            linearLayout.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
            LinearLayout linearLayout2 = new LinearLayout(this);
            linearLayout2.setOrientation(1);
            int e10 = i.e(this, 37);
            if (i.f(this)) {
                i10 = i.e(this, 32);
            } else {
                i10 = 0;
            }
            int i17 = e10 + i10;
            linearLayout2.setPadding(i17, i.e(this, 28), i17, i.e(this, 28));
            scrollView.addView(linearLayout2, new FrameLayout.LayoutParams(-1, -2));
            Object obj = eVar2.f12044b;
            PlayerActivity playerActivity2 = ((n8.a) obj).f8024b;
            if (playerActivity2 != null) {
                boolean z12 = ((n8.a) obj).f8024b.f7775y.f9943k;
                LinearLayout linearLayout3 = new LinearLayout(playerActivity2);
                linearLayout3.setGravity(17);
                linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(-1, i.e(playerActivity2, 46)));
                if (z12) {
                    i12 = i.f11068h;
                } else {
                    i12 = i.f11065e;
                }
                TextView l12 = i.l(playerActivity2, "Sub", 18, i12, 1);
                l12.setGravity(17);
                i.b(l12);
                final int i18 = 0;
                l12.setOnClickListener(new View.OnClickListener() { // from class: p8.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i19 = i18;
                        z3.e eVar4 = eVar2;
                        switch (i19) {
                            case 0:
                                ((n8.a) eVar4.f12044b).x(false);
                                return;
                            default:
                                ((n8.a) eVar4.f12044b).x(true);
                                return;
                        }
                    }
                });
                a3.g.v(0, -1, 1.0f, linearLayout3, l12);
                ((n8.a) eVar2.f12044b).f8024b.f7755f0 = l12;
                if (z12) {
                    i13 = i.f11065e;
                } else {
                    i13 = i.f11068h;
                }
                final int i19 = 1;
                TextView l13 = i.l(playerActivity2, "Dub", 18, i13, 1);
                l13.setGravity(17);
                i.b(l13);
                l13.setOnClickListener(new View.OnClickListener() { // from class: p8.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i192 = i19;
                        z3.e eVar4 = eVar2;
                        switch (i192) {
                            case 0:
                                ((n8.a) eVar4.f12044b).x(false);
                                return;
                            default:
                                ((n8.a) eVar4.f12044b).x(true);
                                return;
                        }
                    }
                });
                a3.g.v(0, -1, 1.0f, linearLayout3, l13);
                ((n8.a) eVar2.f12044b).f8024b.f7756g0 = l13;
                FrameLayout frameLayout5 = new FrameLayout(playerActivity2);
                linearLayout2.addView(frameLayout5, new LinearLayout.LayoutParams(-1, i.e(playerActivity2, 4)));
                View view = new View(playerActivity2);
                view.setBackgroundColor(i.f11064d);
                frameLayout5.addView(view, new FrameLayout.LayoutParams(-1, i.e(playerActivity2, 2), 80));
                View view2 = new View(playerActivity2);
                view2.setBackgroundColor(i.f11065e);
                int e11 = (playerActivity2.getResources().getDisplayMetrics().widthPixels / 2) - i.e(playerActivity2, 36);
                int e12 = i.e(playerActivity2, 4);
                if (z12) {
                    i14 = 5;
                } else {
                    i14 = 3;
                }
                frameLayout5.addView(view2, new FrameLayout.LayoutParams(e11, e12, i14 | 80));
            }
            PlayerActivity playerActivity3 = ((n8.a) eVar2.f12044b).f8024b;
            if (playerActivity3 == null) {
                textView = l11;
                frameLayout = frameLayout3;
            } else {
                LinearLayout linearLayout4 = new LinearLayout(playerActivity3);
                linearLayout4.setGravity(16);
                ((n8.a) eVar2.f12044b).f8024b.f7751b0 = linearLayout4;
                HorizontalScrollView horizontalScrollView = new HorizontalScrollView(playerActivity3);
                horizontalScrollView.setHorizontalScrollBarEnabled(false);
                horizontalScrollView.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -1));
                FrameLayout frameLayout6 = new FrameLayout(playerActivity3);
                frameLayout6.addView(horizontalScrollView, new FrameLayout.LayoutParams(-1, -1));
                View view3 = new View(playerActivity3);
                frameLayout = frameLayout3;
                view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, Color.argb(170, 0, 0, 0)}));
                view3.setVisibility(8);
                frameLayout6.addView(view3, new FrameLayout.LayoutParams(i.e(playerActivity3, 34), -1, 5));
                ImageView imageView = new ImageView(playerActivity3);
                imageView.setImageResource(R.drawable.ic_arrow_down);
                imageView.setRotation(-90.0f);
                imageView.setColorFilter(-1);
                imageView.setAlpha(0.95f);
                textView = l11;
                imageView.setPadding(i.e(playerActivity3, 6), i.e(playerActivity3, 6), i.e(playerActivity3, 6), i.e(playerActivity3, 6));
                imageView.setVisibility(8);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i.e(playerActivity3, 24), i.e(playerActivity3, 24), 21);
                layoutParams.rightMargin = i.e(playerActivity3, 4);
                frameLayout6.addView(imageView, layoutParams);
                final g0 g0Var = new g0(linearLayout4, horizontalScrollView, playerActivity3, view3, imageView, 1);
                final int i20 = 0;
                horizontalScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: p8.g
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        int i21 = i20;
                        Runnable runnable = g0Var;
                        switch (i21) {
                            case 0:
                                runnable.run();
                                return;
                            default:
                                runnable.run();
                                return;
                        }
                    }
                });
                horizontalScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: p8.h
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view4, int i21, int i22, int i23, int i24) {
                        g0Var.run();
                    }
                });
                final int i21 = 1;
                linearLayout4.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: p8.g
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public final void onGlobalLayout() {
                        int i212 = i21;
                        Runnable runnable = g0Var;
                        switch (i212) {
                            case 0:
                                runnable.run();
                                return;
                            default:
                                runnable.run();
                                return;
                        }
                    }
                });
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i.e(playerActivity3, 58));
                layoutParams2.setMargins(0, i.e(playerActivity3, 8), 0, 0);
                linearLayout2.addView(frameLayout6, layoutParams2);
                ((n8.a) eVar2.f12044b).v();
            }
            int i22 = i.f11065e;
            TextView l14 = i.l(this, "", 14, i22, 1);
            l14.setGravity(17);
            l14.setPadding(i.e(this, 16), i.e(this, 12), i.e(this, 16), i.e(this, 12));
            l14.setVisibility(8);
            f.i(-1, -2, linearLayout2, l14);
            PlayerActivity playerActivity4 = ((n8.a) eVar2.f12044b).f8024b;
            if (playerActivity4 == null) {
                i11 = 0;
            } else {
                View l15 = i.l(playerActivity4, "List of episodes", 22, -1, 1);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(0, i.e(playerActivity4, 26), 0, i.e(playerActivity4, 18));
                linearLayout2.addView(l15, layoutParams3);
                LinearLayout linearLayout5 = new LinearLayout(playerActivity4);
                linearLayout5.setGravity(16);
                linearLayout2.addView(linearLayout5, new LinearLayout.LayoutParams(-1, i.e(playerActivity4, 54)));
                linearLayout5.addView(com.bumptech.glide.c.l(R.drawable.ic_list_episode, playerActivity4, new androidx.activity.b(eVar2, 21)), new LinearLayout.LayoutParams(i.e(playerActivity4, 32), i.e(playerActivity4, 32)));
                n8.a aVar = (n8.a) eVar2.f12044b;
                boolean z13 = aVar.f8024b.K0;
                int h11 = aVar.h();
                ((n8.a) eVar2.f12044b).getClass();
                List e13 = ((n8.a) eVar2.f12044b).e();
                if (z13) {
                    p3 = "Loading episodes…";
                } else {
                    p3 = a3.g.p("EPS: ", h11, "-", Math.min((h11 + 100) - 1, com.bumptech.glide.d.I(e13)));
                }
                View l16 = i.l(playerActivity4, p3, 18, i22, 1);
                i.d(l16);
                l16.setOnClickListener(new r(28, eVar2, l16));
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                layoutParams4.setMargins(i.e(playerActivity4, 18), 0, 0, 0);
                linearLayout5.addView(l16, layoutParams4);
                ImageView imageView2 = new ImageView(playerActivity4);
                imageView2.setImageResource(R.drawable.ic_arrow_down);
                imageView2.setColorFilter(i22);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                i.d(imageView2);
                imageView2.setOnClickListener(new p8.i(eVar2, imageView2, 1));
                linearLayout5.addView(imageView2, new LinearLayout.LayoutParams(i.e(playerActivity4, 34), i.e(playerActivity4, 34)));
                FrameLayout frameLayout7 = new FrameLayout(playerActivity4);
                frameLayout7.setBackgroundResource(R.drawable.bg_search);
                linearLayout5.addView(frameLayout7, new LinearLayout.LayoutParams(0, i.e(playerActivity4, 54), 1.6f));
                n8.a aVar2 = (n8.a) eVar2.f12044b;
                Objects.requireNonNull(aVar2);
                ImageView l17 = com.bumptech.glide.c.l(R.drawable.ic_search, playerActivity4, new p8.e(aVar2, 0));
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(i.e(playerActivity4, 36), i.e(playerActivity4, 36), 19);
                layoutParams5.setMargins(i.e(playerActivity4, 12), 0, 0, 0);
                frameLayout7.addView(l17, layoutParams5);
                EditText editText = new EditText(playerActivity4);
                editText.setSingleLine(true);
                editText.setHint("Number of Ep");
                editText.setTextColor(-1);
                editText.setHintTextColor(i.f11068h);
                editText.setTextSize(18.0f);
                editText.setBackgroundColor(0);
                editText.setInputType(2);
                editText.setImeOptions(3);
                editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: p8.f
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView2, int i23, KeyEvent keyEvent) {
                        n8.a aVar3 = (n8.a) z3.e.this.f12044b;
                        aVar3.f8024b.F.d(textView2.getText().toString());
                        return true;
                    }
                });
                editText.addTextChangedListener(new c3(eVar2, 4));
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams6.setMargins(i.e(playerActivity4, 60), 0, i.e(playerActivity4, 10), 0);
                frameLayout7.addView(editText, layoutParams6);
                editText.setOnKeyListener(new m(editText, 1));
                i11 = 0;
            }
            LinearLayout linearLayout6 = new LinearLayout(this);
            linearLayout6.setOrientation(i11);
            linearLayout6.setGravity(16);
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams7.setMargins(i11, i.e(this, 14), i11, i11);
            linearLayout6.setVisibility(8);
            linearLayout2.addView(linearLayout6, layoutParams7);
            GridLayout gridLayout = new GridLayout(this);
            gridLayout.setColumnCount(5);
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams8.setMargins(i11, i.e(this, 18), i11, i11);
            linearLayout2.addView(gridLayout, layoutParams8);
            g8.c h12 = i.h(this, 58);
            frameLayout4.addView(h12, new FrameLayout.LayoutParams(i.e(this, 58), i.e(this, 58), 17));
            if (!z11) {
                i11 = 8;
            }
            h12.setVisibility(i11);
            this.f7754e0 = textView;
            this.f7778z0 = l14;
            this.Y = gridLayout;
            this.Z = linearLayout6;
            this.A.C();
            this.V = h12;
            setContentView(frameLayout);
        }
        Handler handler = this.P;
        n8.e eVar4 = this.R0;
        handler.removeCallbacks(eVar4);
        handler.post(eVar4);
    }

    public final int v() {
        int[] iArr;
        s8.b bVar;
        ArrayList L0 = h0.L0(this.Q);
        if (L0.isEmpty()) {
            return 0;
        }
        if (L0.contains(Integer.valueOf(this.f7750a0))) {
            return this.f7750a0;
        }
        a8.e eVar = this.S;
        if (eVar == null && (bVar = this.f7775y) != null) {
            eVar = bVar.o;
        }
        if (eVar != null) {
            iArr = h0.D0(eVar);
        } else {
            iArr = null;
        }
        if (iArr != null && L0.contains(Integer.valueOf(iArr[0]))) {
            return iArr[0];
        }
        return ((Integer) L0.get(0)).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[Catch: Exception -> 0x0057, TryCatch #4 {Exception -> 0x0057, blocks: (B:11:0x0024, B:13:0x002a, B:15:0x0036, B:16:0x003a, B:18:0x0040, B:21:0x0048), top: B:10:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            r8 = this;
            android.content.Intent r0 = r8.getIntent()
            r1 = 0
            if (r0 == 0) goto L12
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r2 = "offline_uri"
            java.lang.String r0 = r0.getStringExtra(r2)
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 == 0) goto Ld2
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto Ld2
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> Lc9
            r2.<init>()     // Catch: java.lang.Exception -> Lc9
            android.content.Intent r3 = r8.getIntent()     // Catch: java.lang.Exception -> L57
            if (r3 == 0) goto L34
            android.content.Intent r1 = r8.getIntent()     // Catch: java.lang.Exception -> L57
            java.lang.String r3 = "offline_subs"
            java.util.ArrayList r1 = r1.getStringArrayListExtra(r3)     // Catch: java.lang.Exception -> L57
        L34:
            if (r1 == 0) goto L57
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L57
        L3a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Exception -> L57
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Exception -> L57
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L57
            if (r3 == 0) goto L3a
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Exception -> L57
            if (r4 == 0) goto L4f
            goto L3a
        L4f:
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> L3a
            r2.add(r3)     // Catch: java.lang.Exception -> L3a
            goto L3a
        L57:
            boolean r1 = r2.isEmpty()     // Catch: java.lang.Exception -> Lc9
            if (r1 == 0) goto Lc0
            java.lang.String r1 = r0.toString()     // Catch: java.lang.Exception -> Lc9
            r3 = 46
            int r3 = r1.lastIndexOf(r3)     // Catch: java.lang.Exception -> Lc9
            r4 = 0
            if (r3 <= 0) goto L6e
            java.lang.String r1 = r1.substring(r4, r3)     // Catch: java.lang.Exception -> Lc9
        L6e:
            r3 = 2
            java.lang.String[] r5 = new java.lang.String[r3]     // Catch: java.lang.Exception -> Lc9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc9
            r6.<init>()     // Catch: java.lang.Exception -> Lc9
            r6.append(r1)     // Catch: java.lang.Exception -> Lc9
            java.lang.String r7 = ".vtt"
            r6.append(r7)     // Catch: java.lang.Exception -> Lc9
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Exception -> Lc9
            r5[r4] = r6     // Catch: java.lang.Exception -> Lc9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lc9
            r6.<init>()     // Catch: java.lang.Exception -> Lc9
            r6.append(r1)     // Catch: java.lang.Exception -> Lc9
            java.lang.String r1 = ".srt"
            r6.append(r1)     // Catch: java.lang.Exception -> Lc9
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Exception -> Lc9
            r6 = 1
            r5[r6] = r1     // Catch: java.lang.Exception -> Lc9
        L98:
            if (r4 >= r3) goto Lc0
            r1 = r5[r4]     // Catch: java.lang.Exception -> Lc9
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch: java.lang.Exception -> Lbd
            android.content.ContentResolver r6 = r8.getContentResolver()     // Catch: java.lang.Exception -> Lbd
            java.io.InputStream r6 = r6.openInputStream(r1)     // Catch: java.lang.Exception -> Lbd
            if (r6 == 0) goto Lb8
            r2.add(r1)     // Catch: java.lang.Throwable -> Lae
            goto Lb8
        Lae:
            r1 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> Lb3
            goto Lb7
        Lb3:
            r6 = move-exception
            r1.addSuppressed(r6)     // Catch: java.lang.Exception -> Lbd
        Lb7:
            throw r1     // Catch: java.lang.Exception -> Lbd
        Lb8:
            if (r6 == 0) goto Lbd
            r6.close()     // Catch: java.lang.Exception -> Lbd
        Lbd:
            int r4 = r4 + 1
            goto L98
        Lc0:
            s8.b r1 = r8.f7775y     // Catch: java.lang.Exception -> Lc9
            r1.e(r0, r2)     // Catch: java.lang.Exception -> Lc9
            r8.B()     // Catch: java.lang.Exception -> Lc9
            goto Ld1
        Lc9:
            r0 = move-exception
            java.lang.String r1 = "PlayerActivity"
            java.lang.String r2 = "offline play"
            android.util.Log.e(r1, r2, r0)
        Ld1:
            return
        Ld2:
            s8.b r0 = r8.f7775y
            r0.c()
            msr.pistream.app.viewmodel.PlayerViewModel r0 = r8.f7773x
            s8.b r1 = r8.f7775y
            a8.e r1 = r1.o
            r0.d(r1)
            r8.B()
            z3.e r0 = r8.A
            r0.C()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: msr.pistream.app.ui.player.PlayerActivity.w():void");
    }

    public final TextView x(String str, boolean z9, Runnable runnable) {
        int i10;
        this.I.getClass();
        TextView l10 = i.l(this, str, 18, -1, 1);
        l10.setGravity(17);
        if (z9) {
            i10 = i.f11065e;
        } else {
            i10 = i.f11064d;
        }
        l10.setBackground(i.j(i10, i.e(this, 8)));
        i.d(l10);
        l10.setOnClickListener(new j8.c(runnable, 8));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, i.e(this, 66));
        layoutParams.setMargins(0, i.e(this, 8), 0, i.e(this, 8));
        l10.setLayoutParams(layoutParams);
        return l10;
    }

    public final void y() {
        s8.b bVar;
        ArrayList arrayList;
        try {
            TextView textView = this.f7752c0;
            if (textView != null && (bVar = this.f7775y) != null && (arrayList = bVar.f9935c) != null) {
                int i10 = bVar.f9940h;
                bVar.h();
                textView.setText(com.bumptech.glide.d.q(arrayList, i10));
            }
            e eVar = this.A;
            if (eVar != null) {
                eVar.D();
            }
        } catch (Exception e10) {
            Log.e("PlayerActivity", "refreshServerUi", e10);
        }
    }

    public final void z(long j4) {
        j1.d0 d0Var = this.T;
        if (d0Var == null) {
            return;
        }
        d0Var.j(5, Math.max(0L, d0Var.y() + j4));
    }
}
