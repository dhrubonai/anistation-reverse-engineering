package j3;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c1.c1;
import c1.d1;
import c1.e1;
import c1.l1;
import c1.m1;
import c1.z0;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import msr.pistream.app.R;
import r6.n1;

/* loaded from: classes.dex */
public final class x extends FrameLayout {
    public static final float[] P0;
    public final g A;
    public boolean A0;
    public final PopupWindow B;
    public boolean B0;
    public final int C;
    public boolean C0;
    public final View D;
    public boolean D0;
    public final View E;
    public boolean E0;
    public final View F;
    public boolean F0;
    public final View G;
    public int G0;
    public final View H;
    public int H0;
    public final TextView I;
    public int I0;
    public final TextView J;
    public long[] J0;
    public final ImageView K;
    public boolean[] K0;
    public final ImageView L;
    public final long[] L0;
    public final View M;
    public final boolean[] M0;
    public final ImageView N;
    public long N0;
    public final ImageView O;
    public boolean O0;
    public final ImageView P;
    public final View Q;
    public final View R;
    public final View S;
    public final TextView T;
    public final TextView U;
    public final p0 V;
    public final StringBuilder W;

    /* renamed from: a, reason: collision with root package name */
    public final d0 f6104a;

    /* renamed from: a0, reason: collision with root package name */
    public final Formatter f6105a0;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f6106b;

    /* renamed from: b0, reason: collision with root package name */
    public final c1 f6107b0;

    /* renamed from: c, reason: collision with root package name */
    public final l f6108c;

    /* renamed from: c0, reason: collision with root package name */
    public final d1 f6109c0;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f6110d;

    /* renamed from: d0, reason: collision with root package name */
    public final androidx.activity.b f6111d0;

    /* renamed from: e, reason: collision with root package name */
    public final RecyclerView f6112e;

    /* renamed from: e0, reason: collision with root package name */
    public final Drawable f6113e0;

    /* renamed from: f, reason: collision with root package name */
    public final r f6114f;

    /* renamed from: f0, reason: collision with root package name */
    public final Drawable f6115f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Drawable f6116g0;

    /* renamed from: h0, reason: collision with root package name */
    public final String f6117h0;

    /* renamed from: i0, reason: collision with root package name */
    public final String f6118i0;

    /* renamed from: j0, reason: collision with root package name */
    public final String f6119j0;

    /* renamed from: k0, reason: collision with root package name */
    public final Drawable f6120k0;

    /* renamed from: l0, reason: collision with root package name */
    public final Drawable f6121l0;

    /* renamed from: m0, reason: collision with root package name */
    public final float f6122m0;

    /* renamed from: n0, reason: collision with root package name */
    public final float f6123n0;

    /* renamed from: o0, reason: collision with root package name */
    public final String f6124o0;

    /* renamed from: p0, reason: collision with root package name */
    public final String f6125p0;

    /* renamed from: q0, reason: collision with root package name */
    public final Drawable f6126q0;

    /* renamed from: r0, reason: collision with root package name */
    public final Drawable f6127r0;

    /* renamed from: s0, reason: collision with root package name */
    public final String f6128s0;

    /* renamed from: t0, reason: collision with root package name */
    public final String f6129t0;

    /* renamed from: u0, reason: collision with root package name */
    public final Drawable f6130u0;

    /* renamed from: v0, reason: collision with root package name */
    public final Drawable f6131v0;

    /* renamed from: w0, reason: collision with root package name */
    public final String f6132w0;

    /* renamed from: x, reason: collision with root package name */
    public final o f6133x;

    /* renamed from: x0, reason: collision with root package name */
    public final String f6134x0;

    /* renamed from: y, reason: collision with root package name */
    public final k f6135y;

    /* renamed from: y0, reason: collision with root package name */
    public z0 f6136y0;

    /* renamed from: z, reason: collision with root package name */
    public final k f6137z;

    /* renamed from: z0, reason: collision with root package name */
    public m f6138z0;

    static {
        c1.l0.a("media3.ui");
        P0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Context context) {
        super(context, null, 0);
        Typeface b10;
        TextView textView;
        TextView textView2;
        boolean z9;
        final int i10 = 0;
        final int i11 = 1;
        this.D0 = true;
        this.G0 = 5000;
        this.I0 = 0;
        this.H0 = 200;
        LayoutInflater.from(context).inflate(R.layout.exo_player_control_view, this);
        setDescendantFocusability(262144);
        l lVar = new l(this);
        this.f6108c = lVar;
        this.f6110d = new CopyOnWriteArrayList();
        this.f6107b0 = new c1();
        this.f6109c0 = new d1();
        StringBuilder sb = new StringBuilder();
        this.W = sb;
        this.f6105a0 = new Formatter(sb, Locale.getDefault());
        this.J0 = new long[0];
        this.K0 = new boolean[0];
        this.L0 = new long[0];
        this.M0 = new boolean[0];
        this.f6111d0 = new androidx.activity.b(this, 14);
        this.T = (TextView) findViewById(R.id.exo_duration);
        this.U = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.N = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(lVar);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.O = imageView2;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: j3.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f6014b;

            {
                this.f6014b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i10;
                x xVar = this.f6014b;
                switch (i12) {
                    case 0:
                        x.a(xVar);
                        return;
                    default:
                        x.a(xVar);
                        return;
                }
            }
        };
        if (imageView2 != null) {
            imageView2.setVisibility(8);
            imageView2.setOnClickListener(onClickListener);
        }
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.P = imageView3;
        View.OnClickListener onClickListener2 = new View.OnClickListener(this) { // from class: j3.h

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f6014b;

            {
                this.f6014b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                x xVar = this.f6014b;
                switch (i12) {
                    case 0:
                        x.a(xVar);
                        return;
                    default:
                        x.a(xVar);
                        return;
                }
            }
        };
        if (imageView3 != null) {
            imageView3.setVisibility(8);
            imageView3.setOnClickListener(onClickListener2);
        }
        View findViewById = findViewById(R.id.exo_settings);
        this.Q = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(lVar);
        }
        View findViewById2 = findViewById(R.id.exo_playback_speed);
        this.R = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(lVar);
        }
        View findViewById3 = findViewById(R.id.exo_audio_track);
        this.S = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(lVar);
        }
        p0 p0Var = (p0) findViewById(R.id.exo_progress);
        View findViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (p0Var != null) {
            this.V = p0Var;
        } else if (findViewById4 != null) {
            f fVar = new f(context);
            fVar.setId(R.id.exo_progress);
            fVar.setLayoutParams(findViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById4.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById4);
            viewGroup.removeView(findViewById4);
            viewGroup.addView(fVar, indexOfChild);
            this.V = fVar;
        } else {
            this.V = null;
        }
        p0 p0Var2 = this.V;
        if (p0Var2 != null) {
            ((f) p0Var2).O.add(lVar);
        }
        View findViewById5 = findViewById(R.id.exo_play_pause);
        this.F = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(lVar);
        }
        View findViewById6 = findViewById(R.id.exo_prev);
        this.D = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(lVar);
        }
        View findViewById7 = findViewById(R.id.exo_next);
        this.E = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(lVar);
        }
        ThreadLocal threadLocal = y.p.f11448a;
        if (context.isRestricted()) {
            b10 = null;
        } else {
            b10 = y.p.b(context, R.font.roboto_medium_numbers, new TypedValue(), 0, null, false, false);
        }
        View findViewById8 = findViewById(R.id.exo_rew);
        if (findViewById8 == null) {
            textView = (TextView) findViewById(R.id.exo_rew_with_amount);
        } else {
            textView = null;
        }
        this.J = textView;
        if (textView != null) {
            textView.setTypeface(b10);
        }
        findViewById8 = findViewById8 == null ? textView : findViewById8;
        this.H = findViewById8;
        if (findViewById8 != null) {
            findViewById8.setOnClickListener(lVar);
        }
        View findViewById9 = findViewById(R.id.exo_ffwd);
        if (findViewById9 == null) {
            textView2 = (TextView) findViewById(R.id.exo_ffwd_with_amount);
        } else {
            textView2 = null;
        }
        this.I = textView2;
        if (textView2 != null) {
            textView2.setTypeface(b10);
        }
        findViewById9 = findViewById9 == null ? textView2 : findViewById9;
        this.G = findViewById9;
        if (findViewById9 != null) {
            findViewById9.setOnClickListener(lVar);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.K = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(lVar);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_shuffle);
        this.L = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(lVar);
        }
        Resources resources = context.getResources();
        this.f6106b = resources;
        this.f6122m0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.f6123n0 = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View findViewById10 = findViewById(R.id.exo_vr);
        this.M = findViewById10;
        if (findViewById10 != null) {
            k(findViewById10, false);
        }
        d0 d0Var = new d0(this);
        this.f6104a = d0Var;
        d0Var.C = true;
        r rVar = new r(this, new String[]{resources.getString(R.string.exo_controls_playback_speed), resources.getString(R.string.exo_track_selection_title_audio)}, new Drawable[]{f1.b0.t(context, resources, R.drawable.exo_styled_controls_speed), f1.b0.t(context, resources, R.drawable.exo_styled_controls_audiotrack)});
        this.f6114f = rVar;
        this.C = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, (ViewGroup) null);
        this.f6112e = recyclerView;
        recyclerView.setAdapter(rVar);
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.B = popupWindow;
        if (f1.b0.f3799a < 23) {
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        }
        popupWindow.setOnDismissListener(lVar);
        this.O0 = true;
        this.A = new g(getResources());
        this.f6126q0 = f1.b0.t(context, resources, R.drawable.exo_styled_controls_subtitle_on);
        this.f6127r0 = f1.b0.t(context, resources, R.drawable.exo_styled_controls_subtitle_off);
        this.f6128s0 = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.f6129t0 = resources.getString(R.string.exo_controls_cc_disabled_description);
        int i12 = 0;
        this.f6135y = new k(this, 1, i12);
        this.f6137z = new k(this, i12, i12);
        this.f6133x = new o(this, resources.getStringArray(R.array.exo_controls_playback_speeds), P0);
        this.f6130u0 = f1.b0.t(context, resources, R.drawable.exo_styled_controls_fullscreen_exit);
        this.f6131v0 = f1.b0.t(context, resources, R.drawable.exo_styled_controls_fullscreen_enter);
        this.f6113e0 = f1.b0.t(context, resources, R.drawable.exo_styled_controls_repeat_off);
        this.f6115f0 = f1.b0.t(context, resources, R.drawable.exo_styled_controls_repeat_one);
        this.f6116g0 = f1.b0.t(context, resources, R.drawable.exo_styled_controls_repeat_all);
        this.f6120k0 = f1.b0.t(context, resources, R.drawable.exo_styled_controls_shuffle_on);
        this.f6121l0 = f1.b0.t(context, resources, R.drawable.exo_styled_controls_shuffle_off);
        this.f6132w0 = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.f6134x0 = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.f6117h0 = resources.getString(R.string.exo_controls_repeat_off_description);
        this.f6118i0 = resources.getString(R.string.exo_controls_repeat_one_description);
        this.f6119j0 = resources.getString(R.string.exo_controls_repeat_all_description);
        this.f6124o0 = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.f6125p0 = resources.getString(R.string.exo_controls_shuffle_off_description);
        d0Var.h((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        d0Var.h(findViewById9, true);
        d0Var.h(findViewById8, true);
        d0Var.h(findViewById6, true);
        d0Var.h(findViewById7, true);
        int i13 = 0;
        d0Var.h(imageView5, false);
        d0Var.h(imageView, false);
        d0Var.h(findViewById10, false);
        if (this.I0 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        d0Var.h(imageView4, z9);
        addOnLayoutChangeListener(new i(this, i13));
    }

    public static void a(x xVar) {
        if (xVar.f6138z0 != null) {
            boolean z9 = !xVar.A0;
            xVar.A0 = z9;
            String str = xVar.f6132w0;
            Drawable drawable = xVar.f6130u0;
            String str2 = xVar.f6134x0;
            Drawable drawable2 = xVar.f6131v0;
            ImageView imageView = xVar.O;
            if (imageView != null) {
                if (z9) {
                    imageView.setImageDrawable(drawable);
                    imageView.setContentDescription(str);
                } else {
                    imageView.setImageDrawable(drawable2);
                    imageView.setContentDescription(str2);
                }
            }
            boolean z10 = xVar.A0;
            ImageView imageView2 = xVar.P;
            if (imageView2 != null) {
                if (z10) {
                    imageView2.setImageDrawable(drawable);
                    imageView2.setContentDescription(str);
                } else {
                    imageView2.setImageDrawable(drawable2);
                    imageView2.setContentDescription(str2);
                }
            }
            m mVar = xVar.f6138z0;
            if (mVar != null) {
                ((f0) mVar).f6011c.getClass();
            }
        }
    }

    public static boolean c(z0 z0Var, d1 d1Var) {
        e1 A;
        int p3;
        c1.i iVar = (c1.i) z0Var;
        if (!iVar.d(17) || (p3 = (A = ((j1.d0) iVar).A()).p()) <= 1 || p3 > 100) {
            return false;
        }
        for (int i10 = 0; i10 < p3; i10++) {
            if (A.n(i10, d1Var).f1668n == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        z0 z0Var = this.f6136y0;
        if (z0Var != null && ((c1.i) z0Var).d(13)) {
            j1.d0 d0Var = (j1.d0) this.f6136y0;
            d0Var.W(new c1.t0(f10, d0Var.F().f1895b));
        }
    }

    public final boolean d(KeyEvent keyEvent) {
        boolean z9;
        int keyCode = keyEvent.getKeyCode();
        z0 z0Var = this.f6136y0;
        if (z0Var != null) {
            if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (((j1.d0) z0Var).G() != 4) {
                            c1.i iVar = (c1.i) z0Var;
                            if (iVar.d(12)) {
                                j1.d0 d0Var = (j1.d0) iVar;
                                d0Var.h0();
                                iVar.m(12, d0Var.f5691u);
                            }
                        }
                    } else {
                        if (keyCode == 89) {
                            c1.i iVar2 = (c1.i) z0Var;
                            if (iVar2.d(11)) {
                                j1.d0 d0Var2 = (j1.d0) iVar2;
                                d0Var2.h0();
                                iVar2.m(11, -d0Var2.f5690t);
                            }
                        }
                        if (keyEvent.getRepeatCount() == 0) {
                            if (keyCode != 79 && keyCode != 85) {
                                if (keyCode != 87) {
                                    if (keyCode != 88) {
                                        if (keyCode != 126) {
                                            if (keyCode == 127) {
                                                int i10 = f1.b0.f3799a;
                                                c1.i iVar3 = (c1.i) z0Var;
                                                if (iVar3.d(1)) {
                                                    ((j1.d0) iVar3).V(false);
                                                }
                                            }
                                        } else {
                                            f1.b0.H(z0Var);
                                        }
                                    } else {
                                        c1.i iVar4 = (c1.i) z0Var;
                                        if (iVar4.d(7)) {
                                            iVar4.n();
                                        }
                                    }
                                } else {
                                    c1.i iVar5 = (c1.i) z0Var;
                                    if (iVar5.d(9)) {
                                        iVar5.l();
                                    }
                                }
                            } else if (f1.b0.Z(z0Var, this.D0)) {
                                f1.b0.H(z0Var);
                            } else {
                                c1.i iVar6 = (c1.i) z0Var;
                                if (iVar6.d(1)) {
                                    ((j1.d0) iVar6).V(false);
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!d(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public final void e(m3.d0 d0Var, View view) {
        this.f6112e.setAdapter(d0Var);
        q();
        this.O0 = false;
        PopupWindow popupWindow = this.B;
        popupWindow.dismiss();
        this.O0 = true;
        int width = getWidth() - popupWindow.getWidth();
        int i10 = this.C;
        popupWindow.showAsDropDown(view, width - i10, (-popupWindow.getHeight()) - i10);
    }

    public final n1 f(m1 m1Var, int i10) {
        r6.h0.p(4, "initialCapacity");
        Object[] objArr = new Object[4];
        r6.o0 o0Var = m1Var.f1836a;
        int i11 = 0;
        for (int i12 = 0; i12 < o0Var.size(); i12++) {
            l1 l1Var = (l1) o0Var.get(i12);
            if (l1Var.f1802b.f1692c == i10) {
                for (int i13 = 0; i13 < l1Var.f1801a; i13++) {
                    if (l1Var.g(i13)) {
                        c1.v b10 = l1Var.b(i13);
                        if ((b10.f1927e & 2) == 0) {
                            t tVar = new t(m1Var, i12, i13, this.A.d(b10));
                            int i14 = i11 + 1;
                            if (objArr.length < i14) {
                                objArr = Arrays.copyOf(objArr, q6.g.y(objArr.length, i14));
                            }
                            objArr[i11] = tVar;
                            i11 = i14;
                        }
                    }
                }
            }
        }
        return r6.o0.h(i11, objArr);
    }

    public final void g() {
        d0 d0Var = this.f6104a;
        int i10 = d0Var.f5987z;
        if (i10 != 3 && i10 != 2) {
            d0Var.f();
            if (!d0Var.C) {
                d0Var.i(2);
            } else if (d0Var.f5987z == 1) {
                d0Var.f5975m.start();
            } else {
                d0Var.f5976n.start();
            }
        }
    }

    public z0 getPlayer() {
        return this.f6136y0;
    }

    public int getRepeatToggleModes() {
        return this.I0;
    }

    public boolean getShowShuffleButton() {
        return this.f6104a.c(this.L);
    }

    public boolean getShowSubtitleButton() {
        return this.f6104a.c(this.N);
    }

    public int getShowTimeoutMs() {
        return this.G0;
    }

    public boolean getShowVrButton() {
        return this.f6104a.c(this.M);
    }

    public final boolean h() {
        d0 d0Var = this.f6104a;
        if (d0Var.f5987z == 0 && d0Var.f5963a.i()) {
            return true;
        }
        return false;
    }

    public final boolean i() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void j() {
        m();
        l();
        p();
        r();
        t();
        n();
        s();
    }

    public final void k(View view, boolean z9) {
        float f10;
        if (view == null) {
            return;
        }
        view.setEnabled(z9);
        if (z9) {
            f10 = this.f6122m0;
        } else {
            f10 = this.f6123n0;
        }
        view.setAlpha(f10);
    }

    public final void l() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j4;
        long j10;
        if (i() && this.B0) {
            z0 z0Var = this.f6136y0;
            if (z0Var != null) {
                if (this.C0 && c(z0Var, this.f6109c0)) {
                    z10 = ((c1.i) z0Var).d(10);
                } else {
                    z10 = ((c1.i) z0Var).d(5);
                }
                c1.i iVar = (c1.i) z0Var;
                z11 = iVar.d(7);
                z12 = iVar.d(11);
                z13 = iVar.d(12);
                z9 = iVar.d(9);
            } else {
                z9 = false;
                z10 = false;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            Resources resources = this.f6106b;
            View view = this.H;
            if (z12) {
                z0 z0Var2 = this.f6136y0;
                if (z0Var2 != null) {
                    j1.d0 d0Var = (j1.d0) z0Var2;
                    d0Var.h0();
                    j10 = d0Var.f5690t;
                } else {
                    j10 = 5000;
                }
                int i10 = (int) (j10 / 1000);
                TextView textView = this.J;
                if (textView != null) {
                    textView.setText(String.valueOf(i10));
                }
                if (view != null) {
                    view.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, i10, Integer.valueOf(i10)));
                }
            }
            View view2 = this.G;
            if (z13) {
                z0 z0Var3 = this.f6136y0;
                if (z0Var3 != null) {
                    j1.d0 d0Var2 = (j1.d0) z0Var3;
                    d0Var2.h0();
                    j4 = d0Var2.f5691u;
                } else {
                    j4 = 15000;
                }
                int i11 = (int) (j4 / 1000);
                TextView textView2 = this.I;
                if (textView2 != null) {
                    textView2.setText(String.valueOf(i11));
                }
                if (view2 != null) {
                    view2.setContentDescription(resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, i11, Integer.valueOf(i11)));
                }
            }
            k(this.D, z11);
            k(view, z12);
            k(view2, z13);
            k(this.E, z9);
            p0 p0Var = this.V;
            if (p0Var != null) {
                ((f) p0Var).setEnabled(z10);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (((j1.d0) r6.f6136y0).A().q() == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r6 = this;
            boolean r0 = r6.i()
            if (r0 == 0) goto L6c
            boolean r0 = r6.B0
            if (r0 != 0) goto Lb
            goto L6c
        Lb:
            android.view.View r0 = r6.F
            if (r0 == 0) goto L6c
            c1.z0 r1 = r6.f6136y0
            boolean r2 = r6.D0
            boolean r1 = f1.b0.Z(r1, r2)
            if (r1 == 0) goto L1d
            r2 = 2131230971(0x7f0800fb, float:1.807801E38)
            goto L20
        L1d:
            r2 = 2131230970(0x7f0800fa, float:1.8078008E38)
        L20:
            if (r1 == 0) goto L26
            r1 = 2131886153(0x7f120049, float:1.9406877E38)
            goto L29
        L26:
            r1 = 2131886152(0x7f120048, float:1.9406875E38)
        L29:
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.content.Context r4 = r6.getContext()
            android.content.res.Resources r5 = r6.f6106b
            android.graphics.drawable.Drawable r2 = f1.b0.t(r4, r5, r2)
            r3.setImageDrawable(r2)
            java.lang.String r1 = r5.getString(r1)
            r0.setContentDescription(r1)
            c1.z0 r1 = r6.f6136y0
            if (r1 == 0) goto L68
            c1.i r1 = (c1.i) r1
            r2 = 1
            boolean r1 = r1.d(r2)
            if (r1 == 0) goto L68
            c1.z0 r1 = r6.f6136y0
            r3 = 17
            c1.i r1 = (c1.i) r1
            boolean r1 = r1.d(r3)
            if (r1 == 0) goto L69
            c1.z0 r1 = r6.f6136y0
            j1.d0 r1 = (j1.d0) r1
            c1.e1 r1 = r1.A()
            boolean r1 = r1.q()
            if (r1 != 0) goto L68
            goto L69
        L68:
            r2 = 0
        L69:
            r6.k(r0, r2)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.x.m():void");
    }

    public final void n() {
        o oVar;
        z0 z0Var = this.f6136y0;
        if (z0Var == null) {
            return;
        }
        float f10 = ((j1.d0) z0Var).F().f1894a;
        boolean z9 = false;
        float f11 = Float.MAX_VALUE;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            oVar = this.f6133x;
            float[] fArr = oVar.f6070e;
            if (i10 >= fArr.length) {
                break;
            }
            float abs = Math.abs(f10 - fArr[i10]);
            if (abs < f11) {
                i11 = i10;
                f11 = abs;
            }
            i10++;
        }
        oVar.f6071f = i11;
        String str = oVar.f6069d[i11];
        r rVar = this.f6114f;
        rVar.f6079e[0] = str;
        if (rVar.e(1) || rVar.e(0)) {
            z9 = true;
        }
        k(this.Q, z9);
    }

    public final void o() {
        long j4;
        long j10;
        int G;
        long j11;
        if (i() && this.B0) {
            z0 z0Var = this.f6136y0;
            if (z0Var != null && ((c1.i) z0Var).d(16)) {
                long j12 = this.N0;
                j1.d0 d0Var = (j1.d0) z0Var;
                d0Var.h0();
                j4 = d0Var.t(d0Var.f5675f0) + j12;
                j10 = d0Var.s() + this.N0;
            } else {
                j4 = 0;
                j10 = 0;
            }
            TextView textView = this.U;
            if (textView != null && !this.F0) {
                textView.setText(f1.b0.C(this.W, this.f6105a0, j4));
            }
            p0 p0Var = this.V;
            if (p0Var != null) {
                f fVar = (f) p0Var;
                fVar.setPosition(j4);
                fVar.setBufferedPosition(j10);
            }
            androidx.activity.b bVar = this.f6111d0;
            removeCallbacks(bVar);
            if (z0Var == null) {
                G = 1;
            } else {
                G = ((j1.d0) z0Var).G();
            }
            long j13 = 1000;
            if (z0Var != null && ((c1.i) z0Var).h()) {
                if (p0Var != null) {
                    j11 = ((f) p0Var).getPreferredUpdateDelay();
                } else {
                    j11 = 1000;
                }
                long min = Math.min(j11, 1000 - (j4 % 1000));
                float f10 = ((j1.d0) z0Var).F().f1894a;
                if (f10 > 0.0f) {
                    j13 = ((float) min) / f10;
                }
                postDelayed(bVar, f1.b0.i(j13, this.H0, 1000L));
                return;
            }
            if (G != 4 && G != 1) {
                postDelayed(bVar, 1000L);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d0 d0Var = this.f6104a;
        d0Var.f5963a.addOnLayoutChangeListener(d0Var.f5985x);
        this.B0 = true;
        if (h()) {
            d0Var.g();
        }
        j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d0 d0Var = this.f6104a;
        d0Var.f5963a.removeOnLayoutChangeListener(d0Var.f5985x);
        this.B0 = false;
        removeCallbacks(this.f6111d0);
        d0Var.f();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
        View view = this.f6104a.f5964b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public final void p() {
        ImageView imageView;
        if (i() && this.B0 && (imageView = this.K) != null) {
            if (this.I0 == 0) {
                k(imageView, false);
                return;
            }
            z0 z0Var = this.f6136y0;
            String str = this.f6117h0;
            Drawable drawable = this.f6113e0;
            if (z0Var != null && ((c1.i) z0Var).d(15)) {
                k(imageView, true);
                j1.d0 d0Var = (j1.d0) z0Var;
                d0Var.h0();
                int i10 = d0Var.D;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            imageView.setImageDrawable(this.f6116g0);
                            imageView.setContentDescription(this.f6119j0);
                            return;
                        }
                        return;
                    }
                    imageView.setImageDrawable(this.f6115f0);
                    imageView.setContentDescription(this.f6118i0);
                    return;
                }
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
                return;
            }
            k(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void q() {
        RecyclerView recyclerView = this.f6112e;
        recyclerView.measure(0, 0);
        int width = getWidth();
        int i10 = this.C;
        int min = Math.min(recyclerView.getMeasuredWidth(), width - (i10 * 2));
        PopupWindow popupWindow = this.B;
        popupWindow.setWidth(min);
        popupWindow.setHeight(Math.min(getHeight() - (i10 * 2), recyclerView.getMeasuredHeight()));
    }

    public final void r() {
        ImageView imageView;
        if (i() && this.B0 && (imageView = this.L) != null) {
            z0 z0Var = this.f6136y0;
            if (!this.f6104a.c(imageView)) {
                k(imageView, false);
                return;
            }
            String str = this.f6125p0;
            Drawable drawable = this.f6121l0;
            if (z0Var != null && ((c1.i) z0Var).d(14)) {
                k(imageView, true);
                j1.d0 d0Var = (j1.d0) z0Var;
                d0Var.h0();
                if (d0Var.E) {
                    drawable = this.f6120k0;
                }
                imageView.setImageDrawable(drawable);
                d0Var.h0();
                if (d0Var.E) {
                    str = this.f6124o0;
                }
                imageView.setContentDescription(str);
                return;
            }
            k(imageView, false);
            imageView.setImageDrawable(drawable);
            imageView.setContentDescription(str);
        }
    }

    public final void s() {
        boolean z9;
        e1 e1Var;
        boolean z10;
        long j4;
        long j10;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        int length;
        z0 z0Var = this.f6136y0;
        if (z0Var == null) {
            return;
        }
        boolean z13 = this.C0;
        boolean z14 = true;
        d1 d1Var = this.f6109c0;
        if (z13 && c(z0Var, d1Var)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.E0 = z9;
        this.N0 = 0L;
        c1.i iVar = (c1.i) z0Var;
        if (iVar.d(17)) {
            e1Var = ((j1.d0) z0Var).A();
        } else {
            e1Var = e1.f1676a;
        }
        long j11 = -9223372036854775807L;
        if (!e1Var.q()) {
            int w9 = ((j1.d0) z0Var).w();
            boolean z15 = this.E0;
            if (z15) {
                i11 = 0;
            } else {
                i11 = w9;
            }
            if (z15) {
                i12 = e1Var.p() - 1;
            } else {
                i12 = w9;
            }
            j10 = 0;
            i10 = 0;
            while (true) {
                if (i11 > i12) {
                    break;
                }
                if (i11 == w9) {
                    this.N0 = f1.b0.c0(j10);
                }
                e1Var.n(i11, d1Var);
                if (d1Var.f1668n == j11) {
                    w7.b.u(this.E0 ^ z14);
                    break;
                }
                int i14 = d1Var.o;
                while (i14 <= d1Var.f1669p) {
                    c1 c1Var = this.f6107b0;
                    e1Var.f(i14, c1Var);
                    c1Var.f1647g.getClass();
                    int i15 = c1Var.f1647g.f1628a;
                    int i16 = 0;
                    while (i16 < i15) {
                        long d10 = c1Var.d(i16);
                        d1 d1Var2 = d1Var;
                        if (d10 == Long.MIN_VALUE) {
                            long j12 = c1Var.f1644d;
                            if (j12 != j11) {
                                d10 = j12;
                            }
                            i13 = w9;
                            z11 = true;
                            i16++;
                            z14 = z11;
                            d1Var = d1Var2;
                            w9 = i13;
                            j11 = -9223372036854775807L;
                        }
                        long j13 = d10 + c1Var.f1645e;
                        if (j13 >= 0) {
                            long[] jArr = this.J0;
                            if (i10 == jArr.length) {
                                if (jArr.length == 0) {
                                    length = 1;
                                } else {
                                    length = jArr.length * 2;
                                }
                                this.J0 = Arrays.copyOf(jArr, length);
                                this.K0 = Arrays.copyOf(this.K0, length);
                            }
                            this.J0[i10] = f1.b0.c0(j10 + j13);
                            boolean[] zArr = this.K0;
                            c1.a a10 = c1Var.f1647g.a(i16);
                            int i17 = a10.f1615b;
                            if (i17 == -1) {
                                i13 = w9;
                            } else {
                                int i18 = 0;
                                while (true) {
                                    i13 = w9;
                                    if (i18 < i17) {
                                        int i19 = a10.f1619f[i18];
                                        if (i19 == 0) {
                                            break;
                                        }
                                        c1.a aVar = a10;
                                        z11 = true;
                                        if (i19 == 1) {
                                            break;
                                        }
                                        i18++;
                                        w9 = i13;
                                        a10 = aVar;
                                    } else {
                                        z11 = true;
                                        z12 = false;
                                        break;
                                    }
                                }
                                z12 = z11;
                                zArr[i10] = z12 ^ z11;
                                i10++;
                                i16++;
                                z14 = z11;
                                d1Var = d1Var2;
                                w9 = i13;
                                j11 = -9223372036854775807L;
                            }
                            z11 = true;
                            z12 = z11;
                            zArr[i10] = z12 ^ z11;
                            i10++;
                            i16++;
                            z14 = z11;
                            d1Var = d1Var2;
                            w9 = i13;
                            j11 = -9223372036854775807L;
                        }
                        i13 = w9;
                        z11 = true;
                        i16++;
                        z14 = z11;
                        d1Var = d1Var2;
                        w9 = i13;
                        j11 = -9223372036854775807L;
                    }
                    i14++;
                    d1Var = d1Var;
                    j11 = -9223372036854775807L;
                }
                int i20 = w9;
                d1 d1Var3 = d1Var;
                j10 += d1Var3.f1668n;
                i11++;
                z14 = z14;
                j11 = -9223372036854775807L;
                d1Var = d1Var3;
                w9 = i20;
            }
            z10 = z14;
        } else {
            z10 = true;
            if (iVar.d(16)) {
                long a11 = iVar.a();
                if (a11 != -9223372036854775807L) {
                    j4 = f1.b0.O(a11);
                    j10 = j4;
                    i10 = 0;
                }
            }
            j4 = 0;
            j10 = j4;
            i10 = 0;
        }
        long c02 = f1.b0.c0(j10);
        TextView textView = this.T;
        if (textView != null) {
            textView.setText(f1.b0.C(this.W, this.f6105a0, c02));
        }
        p0 p0Var = this.V;
        if (p0Var != null) {
            f fVar = (f) p0Var;
            fVar.setDuration(c02);
            long[] jArr2 = this.L0;
            int length2 = jArr2.length;
            int i21 = i10 + length2;
            long[] jArr3 = this.J0;
            if (i21 > jArr3.length) {
                this.J0 = Arrays.copyOf(jArr3, i21);
                this.K0 = Arrays.copyOf(this.K0, i21);
            }
            System.arraycopy(jArr2, 0, this.J0, i10, length2);
            System.arraycopy(this.M0, 0, this.K0, i10, length2);
            long[] jArr4 = this.J0;
            boolean[] zArr2 = this.K0;
            if (i21 != 0 && (jArr4 == null || zArr2 == null)) {
                z10 = false;
            }
            w7.b.g(z10);
            fVar.f6003g0 = i21;
            fVar.f6004h0 = jArr4;
            fVar.f6005i0 = zArr2;
            fVar.e();
        }
        o();
    }

    public void setAnimationEnabled(boolean z9) {
        this.f6104a.C = z9;
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(m mVar) {
        boolean z9;
        this.f6138z0 = mVar;
        boolean z10 = true;
        if (mVar != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        ImageView imageView = this.O;
        if (imageView != null) {
            if (z9) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
        if (mVar == null) {
            z10 = false;
        }
        ImageView imageView2 = this.P;
        if (imageView2 != null) {
            if (z10) {
                imageView2.setVisibility(0);
            } else {
                imageView2.setVisibility(8);
            }
        }
    }

    public void setPlayer(z0 z0Var) {
        boolean z9;
        boolean z10 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        if (z0Var != null) {
            if (((j1.d0) z0Var).f5688r != Looper.getMainLooper()) {
                z10 = false;
            }
        }
        w7.b.g(z10);
        z0 z0Var2 = this.f6136y0;
        if (z0Var2 == z0Var) {
            return;
        }
        l lVar = this.f6108c;
        if (z0Var2 != null) {
            ((j1.d0) z0Var2).Q(lVar);
        }
        this.f6136y0 = z0Var;
        if (z0Var != null) {
            lVar.getClass();
            ((j1.d0) z0Var).f5683l.a(lVar);
        }
        j();
    }

    public void setProgressUpdateListener(p pVar) {
    }

    public void setRepeatToggleModes(int i10) {
        this.I0 = i10;
        z0 z0Var = this.f6136y0;
        boolean z9 = false;
        if (z0Var != null && ((c1.i) z0Var).d(15)) {
            j1.d0 d0Var = (j1.d0) this.f6136y0;
            d0Var.h0();
            int i11 = d0Var.D;
            if (i10 == 0 && i11 != 0) {
                ((j1.d0) this.f6136y0).X(0);
            } else if (i10 == 1 && i11 == 2) {
                ((j1.d0) this.f6136y0).X(1);
            } else if (i10 == 2 && i11 == 1) {
                ((j1.d0) this.f6136y0).X(2);
            }
        }
        if (i10 != 0) {
            z9 = true;
        }
        this.f6104a.h(this.K, z9);
        p();
    }

    public void setShowFastForwardButton(boolean z9) {
        this.f6104a.h(this.G, z9);
        l();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z9) {
        this.C0 = z9;
        s();
    }

    public void setShowNextButton(boolean z9) {
        this.f6104a.h(this.E, z9);
        l();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z9) {
        this.D0 = z9;
        m();
    }

    public void setShowPreviousButton(boolean z9) {
        this.f6104a.h(this.D, z9);
        l();
    }

    public void setShowRewindButton(boolean z9) {
        this.f6104a.h(this.H, z9);
        l();
    }

    public void setShowShuffleButton(boolean z9) {
        this.f6104a.h(this.L, z9);
        r();
    }

    public void setShowSubtitleButton(boolean z9) {
        this.f6104a.h(this.N, z9);
    }

    public void setShowTimeoutMs(int i10) {
        this.G0 = i10;
        if (h()) {
            this.f6104a.g();
        }
    }

    public void setShowVrButton(boolean z9) {
        this.f6104a.h(this.M, z9);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.H0 = f1.b0.h(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        boolean z9;
        View view = this.M;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            if (onClickListener != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            k(view, z9);
        }
    }

    public final void t() {
        boolean z9;
        k kVar = this.f6135y;
        kVar.getClass();
        kVar.f6102d = Collections.emptyList();
        k kVar2 = this.f6137z;
        kVar2.getClass();
        kVar2.f6102d = Collections.emptyList();
        z0 z0Var = this.f6136y0;
        boolean z10 = true;
        ImageView imageView = this.N;
        if (z0Var != null && ((c1.i) z0Var).d(30) && ((c1.i) this.f6136y0).d(29)) {
            m1 B = ((j1.d0) this.f6136y0).B();
            kVar2.g(f(B, 1));
            if (this.f6104a.c(imageView)) {
                kVar.g(f(B, 3));
            } else {
                kVar.g(n1.f9497e);
            }
        }
        if (kVar.a() > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        k(imageView, z9);
        r rVar = this.f6114f;
        if (!rVar.e(1) && !rVar.e(0)) {
            z10 = false;
        }
        k(this.Q, z10);
    }
}
