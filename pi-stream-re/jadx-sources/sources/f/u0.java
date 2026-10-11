package f;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.g4;
import androidx.appcompat.widget.u1;
import g0.k1;
import g0.l1;
import g0.y0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u0 extends com.bumptech.glide.c implements androidx.appcompat.widget.f {

    /* renamed from: a0, reason: collision with root package name */
    public static final AccelerateInterpolator f3790a0 = new AccelerateInterpolator();

    /* renamed from: b0, reason: collision with root package name */
    public static final DecelerateInterpolator f3791b0 = new DecelerateInterpolator();
    public Context C;
    public Context D;
    public ActionBarOverlayLayout E;
    public ActionBarContainer F;
    public u1 G;
    public ActionBarContextView H;
    public final View I;
    public boolean J;
    public t0 K;
    public t0 L;
    public i.a M;
    public boolean N;
    public final ArrayList O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public i.m U;
    public boolean V;
    public boolean W;
    public final s0 X;
    public final s0 Y;
    public final p0 Z;

    public u0(Activity activity, boolean z9) {
        new ArrayList();
        this.O = new ArrayList();
        this.P = 0;
        int i10 = 1;
        this.Q = true;
        this.T = true;
        this.X = new s0(this, 0);
        this.Y = new s0(this, i10);
        this.Z = new p0(this, i10);
        View decorView = activity.getWindow().getDecorView();
        q0(decorView);
        if (z9) {
            return;
        }
        this.I = decorView.findViewById(R.id.content);
    }

    public final void o0(boolean z9) {
        l1 l10;
        l1 l1Var;
        long j4;
        if (z9) {
            if (!this.S) {
                this.S = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.E;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                u0(false);
            }
        } else if (this.S) {
            this.S = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.E;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            u0(false);
        }
        ActionBarContainer actionBarContainer = this.F;
        WeakHashMap weakHashMap = y0.f4277a;
        if (g0.k0.c(actionBarContainer)) {
            if (z9) {
                g4 g4Var = (g4) this.G;
                l10 = y0.a(g4Var.f496a);
                l10.a(0.0f);
                l10.c(100L);
                l10.d(new i.l(g4Var, 4));
                l1Var = this.H.l(0, 200L);
            } else {
                g4 g4Var2 = (g4) this.G;
                l1 a10 = y0.a(g4Var2.f496a);
                a10.a(1.0f);
                a10.c(200L);
                a10.d(new i.l(g4Var2, 0));
                l10 = this.H.l(8, 100L);
                l1Var = a10;
            }
            i.m mVar = new i.m();
            ArrayList arrayList = mVar.f5240a;
            arrayList.add(l10);
            View view = (View) l10.f4228a.get();
            if (view != null) {
                j4 = view.animate().getDuration();
            } else {
                j4 = 0;
            }
            View view2 = (View) l1Var.f4228a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j4);
            }
            arrayList.add(l1Var);
            mVar.b();
            return;
        }
        if (z9) {
            ((g4) this.G).f496a.setVisibility(4);
            this.H.setVisibility(0);
        } else {
            ((g4) this.G).f496a.setVisibility(0);
            this.H.setVisibility(8);
        }
    }

    public final Context p0() {
        if (this.D == null) {
            TypedValue typedValue = new TypedValue();
            this.C.getTheme().resolveAttribute(msr.pistream.app.R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.D = new ContextThemeWrapper(this.C, i10);
            } else {
                this.D = this.C;
            }
        }
        return this.D;
    }

    public final void q0(View view) {
        String str;
        u1 wrapper;
        boolean z9;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(msr.pistream.app.R.id.decor_content_parent);
        this.E = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(msr.pistream.app.R.id.action_bar);
        if (findViewById instanceof u1) {
            wrapper = (u1) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.G = wrapper;
        this.H = (ActionBarContextView) view.findViewById(msr.pistream.app.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(msr.pistream.app.R.id.action_bar_container);
        this.F = actionBarContainer;
        u1 u1Var = this.G;
        if (u1Var != null && this.H != null && actionBarContainer != null) {
            Context context = ((g4) u1Var).f496a.getContext();
            this.C = context;
            if ((((g4) this.G).f497b & 4) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                this.J = true;
            }
            int i10 = context.getApplicationInfo().targetSdkVersion;
            this.G.getClass();
            s0(context.getResources().getBoolean(msr.pistream.app.R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.C.obtainStyledAttributes(null, e.a.f3270a, msr.pistream.app.R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.E;
                if (actionBarOverlayLayout2.f331y) {
                    this.W = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.F;
                WeakHashMap weakHashMap = y0.f4277a;
                g0.n0.s(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(u0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void r0(boolean z9) {
        int i10;
        if (!this.J) {
            if (z9) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            g4 g4Var = (g4) this.G;
            int i11 = g4Var.f497b;
            this.J = true;
            g4Var.a((i10 & 4) | (i11 & (-5)));
        }
    }

    public final void s0(boolean z9) {
        if (!z9) {
            ((g4) this.G).getClass();
            this.F.setTabContainer(null);
        } else {
            this.F.setTabContainer(null);
            ((g4) this.G).getClass();
        }
        this.G.getClass();
        ((g4) this.G).f496a.setCollapsible(false);
        this.E.setHasNonEmbeddedTabs(false);
    }

    public final void t0(CharSequence charSequence) {
        g4 g4Var = (g4) this.G;
        if (!g4Var.f502g) {
            g4Var.f503h = charSequence;
            if ((g4Var.f497b & 8) != 0) {
                Toolbar toolbar = g4Var.f496a;
                toolbar.setTitle(charSequence);
                if (g4Var.f502g) {
                    y0.m(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    public final void u0(boolean z9) {
        boolean z10;
        boolean z11 = this.R;
        if (this.S || !z11) {
            z10 = true;
        } else {
            z10 = false;
        }
        final p0 p0Var = this.Z;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
        View view = this.I;
        if (z10) {
            if (!this.T) {
                this.T = true;
                i.m mVar = this.U;
                if (mVar != null) {
                    mVar.a();
                }
                this.F.setVisibility(0);
                int i10 = this.P;
                s0 s0Var = this.Y;
                if (i10 == 0 && (this.V || z9)) {
                    this.F.setTranslationY(0.0f);
                    float f10 = -this.F.getHeight();
                    if (z9) {
                        this.F.getLocationInWindow(new int[]{0, 0});
                        f10 -= r12[1];
                    }
                    this.F.setTranslationY(f10);
                    i.m mVar2 = new i.m();
                    l1 a10 = y0.a(this.F);
                    a10.e(0.0f);
                    final View view2 = (View) a10.f4228a.get();
                    if (view2 != null) {
                        if (p0Var != null) {
                            animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(view2) { // from class: g0.i1
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    ((View) ((f.u0) f.p0.this.f3762b).F.getParent()).invalidate();
                                }
                            };
                        }
                        k1.a(view2.animate(), animatorUpdateListener);
                    }
                    boolean z12 = mVar2.f5244e;
                    ArrayList arrayList = mVar2.f5240a;
                    if (!z12) {
                        arrayList.add(a10);
                    }
                    if (this.Q && view != null) {
                        view.setTranslationY(f10);
                        l1 a11 = y0.a(view);
                        a11.e(0.0f);
                        if (!mVar2.f5244e) {
                            arrayList.add(a11);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = f3791b0;
                    boolean z13 = mVar2.f5244e;
                    if (!z13) {
                        mVar2.f5242c = decelerateInterpolator;
                    }
                    if (!z13) {
                        mVar2.f5241b = 250L;
                    }
                    if (!z13) {
                        mVar2.f5243d = s0Var;
                    }
                    this.U = mVar2;
                    mVar2.b();
                } else {
                    this.F.setAlpha(1.0f);
                    this.F.setTranslationY(0.0f);
                    if (this.Q && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    s0Var.a();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.E;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = y0.f4277a;
                    g0.l0.c(actionBarOverlayLayout);
                    return;
                }
                return;
            }
            return;
        }
        if (this.T) {
            this.T = false;
            i.m mVar3 = this.U;
            if (mVar3 != null) {
                mVar3.a();
            }
            int i11 = this.P;
            s0 s0Var2 = this.X;
            if (i11 == 0 && (this.V || z9)) {
                this.F.setAlpha(1.0f);
                this.F.setTransitioning(true);
                i.m mVar4 = new i.m();
                float f11 = -this.F.getHeight();
                if (z9) {
                    this.F.getLocationInWindow(new int[]{0, 0});
                    f11 -= r12[1];
                }
                l1 a12 = y0.a(this.F);
                a12.e(f11);
                final View view3 = (View) a12.f4228a.get();
                if (view3 != null) {
                    if (p0Var != null) {
                        animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(view3) { // from class: g0.i1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                ((View) ((f.u0) f.p0.this.f3762b).F.getParent()).invalidate();
                            }
                        };
                    }
                    k1.a(view3.animate(), animatorUpdateListener);
                }
                boolean z14 = mVar4.f5244e;
                ArrayList arrayList2 = mVar4.f5240a;
                if (!z14) {
                    arrayList2.add(a12);
                }
                if (this.Q && view != null) {
                    l1 a13 = y0.a(view);
                    a13.e(f11);
                    if (!mVar4.f5244e) {
                        arrayList2.add(a13);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f3790a0;
                boolean z15 = mVar4.f5244e;
                if (!z15) {
                    mVar4.f5242c = accelerateInterpolator;
                }
                if (!z15) {
                    mVar4.f5241b = 250L;
                }
                if (!z15) {
                    mVar4.f5243d = s0Var2;
                }
                this.U = mVar4;
                mVar4.b();
                return;
            }
            s0Var2.a();
        }
    }

    public u0(Dialog dialog) {
        new ArrayList();
        this.O = new ArrayList();
        this.P = 0;
        int i10 = 1;
        this.Q = true;
        this.T = true;
        this.X = new s0(this, 0);
        this.Y = new s0(this, i10);
        this.Z = new p0(this, i10);
        q0(dialog.getWindow().getDecorView());
    }
}
