package j3;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class d0 {
    public boolean A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final x f5963a;

    /* renamed from: b, reason: collision with root package name */
    public final View f5964b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f5965c;

    /* renamed from: d, reason: collision with root package name */
    public final ViewGroup f5966d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f5967e;

    /* renamed from: f, reason: collision with root package name */
    public final ViewGroup f5968f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f5969g;

    /* renamed from: h, reason: collision with root package name */
    public final ViewGroup f5970h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewGroup f5971i;

    /* renamed from: j, reason: collision with root package name */
    public final View f5972j;

    /* renamed from: k, reason: collision with root package name */
    public final View f5973k;

    /* renamed from: l, reason: collision with root package name */
    public final AnimatorSet f5974l;

    /* renamed from: m, reason: collision with root package name */
    public final AnimatorSet f5975m;

    /* renamed from: n, reason: collision with root package name */
    public final AnimatorSet f5976n;
    public final AnimatorSet o;

    /* renamed from: p, reason: collision with root package name */
    public final AnimatorSet f5977p;

    /* renamed from: q, reason: collision with root package name */
    public final ValueAnimator f5978q;

    /* renamed from: r, reason: collision with root package name */
    public final ValueAnimator f5979r;

    /* renamed from: s, reason: collision with root package name */
    public final y f5980s = new y(this, 0);

    /* renamed from: t, reason: collision with root package name */
    public final y f5981t = new y(this, 1);

    /* renamed from: u, reason: collision with root package name */
    public final y f5982u = new y(this, 2);

    /* renamed from: v, reason: collision with root package name */
    public final y f5983v = new y(this, 3);

    /* renamed from: w, reason: collision with root package name */
    public final y f5984w = new y(this, 4);

    /* renamed from: x, reason: collision with root package name */
    public final i f5985x = new i(this, 1);
    public boolean C = true;

    /* renamed from: z, reason: collision with root package name */
    public int f5987z = 0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f5986y = new ArrayList();

    public d0(x xVar) {
        this.f5963a = xVar;
        final int i10 = 0;
        final int i11 = 1;
        final int i12 = 2;
        final int i13 = 3;
        this.f5964b = xVar.findViewById(R.id.exo_controls_background);
        this.f5965c = (ViewGroup) xVar.findViewById(R.id.exo_center_controls);
        this.f5967e = (ViewGroup) xVar.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) xVar.findViewById(R.id.exo_bottom_bar);
        this.f5966d = viewGroup;
        this.f5971i = (ViewGroup) xVar.findViewById(R.id.exo_time);
        View findViewById = xVar.findViewById(R.id.exo_progress);
        this.f5972j = findViewById;
        this.f5968f = (ViewGroup) xVar.findViewById(R.id.exo_basic_controls);
        this.f5969g = (ViewGroup) xVar.findViewById(R.id.exo_extra_controls);
        this.f5970h = (ViewGroup) xVar.findViewById(R.id.exo_extra_controls_scroll_view);
        View findViewById2 = xVar.findViewById(R.id.exo_overflow_show);
        this.f5973k = findViewById2;
        View findViewById3 = xVar.findViewById(R.id.exo_overflow_hide);
        if (findViewById2 != null && findViewById3 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: j3.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d0 f5942b;

                {
                    this.f5942b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i14 = i10;
                    d0 d0Var = this.f5942b;
                    switch (i14) {
                        case 0:
                            d0.a(d0Var, view);
                            return;
                        default:
                            d0.a(d0Var, view);
                            return;
                    }
                }
            });
            findViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: j3.a0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d0 f5942b;

                {
                    this.f5942b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i14 = i11;
                    d0 d0Var = this.f5942b;
                    switch (i14) {
                        case 0:
                            d0.a(d0Var, view);
                            return;
                        default:
                            d0.a(d0Var, view);
                            return;
                    }
                }
            });
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: j3.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f6142b;

            {
                this.f6142b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i14 = i12;
                d0 d0Var = this.f6142b;
                switch (i14) {
                    case 0:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 1:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        d0Var.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = d0Var.f5964b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = d0Var.f5965c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = d0Var.f5967e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    default:
                        d0Var.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = d0Var.f5964b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = d0Var.f5965c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = d0Var.f5967e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat.addListener(new b0(this, i10));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: j3.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f6142b;

            {
                this.f6142b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i14 = i13;
                d0 d0Var = this.f6142b;
                switch (i14) {
                    case 0:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 1:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        d0Var.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = d0Var.f5964b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = d0Var.f5965c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = d0Var.f5967e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    default:
                        d0Var.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = d0Var.f5964b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = d0Var.f5965c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = d0Var.f5967e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat2.addListener(new b0(this, i11));
        Resources resources = xVar.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5974l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c0(this, xVar, i10));
        animatorSet.play(ofFloat).with(e(findViewById, 0.0f, dimension)).with(e(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f5975m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new c0(this, xVar, i11));
        animatorSet2.play(e(findViewById, dimension, dimension2)).with(e(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f5976n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new c0(this, xVar, i12));
        animatorSet3.play(ofFloat).with(e(findViewById, 0.0f, dimension2)).with(e(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new b0(this, i12));
        animatorSet4.play(ofFloat2).with(e(findViewById, dimension, 0.0f)).with(e(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f5977p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new b0(this, i13));
        animatorSet5.play(ofFloat2).with(e(findViewById, dimension2, 0.0f)).with(e(viewGroup, dimension2, 0.0f));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5978q = ofFloat3;
        ofFloat3.setDuration(250L);
        final int i14 = 0;
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: j3.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f6142b;

            {
                this.f6142b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i142 = i14;
                d0 d0Var = this.f6142b;
                switch (i142) {
                    case 0:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 1:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        d0Var.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = d0Var.f5964b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = d0Var.f5965c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = d0Var.f5967e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    default:
                        d0Var.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = d0Var.f5964b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = d0Var.f5965c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = d0Var.f5967e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat3.addListener(new b0(this, 4));
        ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f5979r = ofFloat4;
        ofFloat4.setDuration(250L);
        ofFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: j3.z

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d0 f6142b;

            {
                this.f6142b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i142 = i11;
                d0 d0Var = this.f6142b;
                switch (i142) {
                    case 0:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 1:
                        d0Var.getClass();
                        d0Var.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                    case 2:
                        d0Var.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = d0Var.f5964b;
                        if (view != null) {
                            view.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup2 = d0Var.f5965c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(floatValue);
                        }
                        ViewGroup viewGroup3 = d0Var.f5967e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(floatValue);
                            return;
                        }
                        return;
                    default:
                        d0Var.getClass();
                        float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = d0Var.f5964b;
                        if (view2 != null) {
                            view2.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup4 = d0Var.f5965c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(floatValue2);
                        }
                        ViewGroup viewGroup5 = d0Var.f5967e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(floatValue2);
                            return;
                        }
                        return;
                }
            }
        });
        ofFloat4.addListener(new b0(this, 5));
    }

    public static void a(d0 d0Var, View view) {
        d0Var.g();
        if (view.getId() == R.id.exo_overflow_show) {
            d0Var.f5978q.start();
        } else if (view.getId() == R.id.exo_overflow_hide) {
            d0Var.f5979r.start();
        }
    }

    public static int d(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return width;
    }

    public static ObjectAnimator e(View view, float f10, float f11) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    public static boolean j(View view) {
        int id = view.getId();
        if (id != R.id.exo_bottom_bar && id != R.id.exo_prev && id != R.id.exo_next && id != R.id.exo_rew && id != R.id.exo_rew_with_amount && id != R.id.exo_ffwd && id != R.id.exo_ffwd_with_amount) {
            return false;
        }
        return true;
    }

    public final void b(float f10) {
        ViewGroup viewGroup = this.f5970h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f10) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f5971i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup3 = this.f5968f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f10);
        }
    }

    public final boolean c(View view) {
        if (view != null && this.f5986y.contains(view)) {
            return true;
        }
        return false;
    }

    public final void f() {
        x xVar = this.f5963a;
        xVar.removeCallbacks(this.f5984w);
        xVar.removeCallbacks(this.f5981t);
        xVar.removeCallbacks(this.f5983v);
        xVar.removeCallbacks(this.f5982u);
    }

    public final void g() {
        if (this.f5987z == 3) {
            return;
        }
        f();
        x xVar = this.f5963a;
        int showTimeoutMs = xVar.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                long j4 = showTimeoutMs;
                if (j4 >= 0) {
                    xVar.postDelayed(this.f5984w, j4);
                    return;
                }
                return;
            }
            if (this.f5987z == 1) {
                xVar.postDelayed(this.f5982u, 2000L);
                return;
            }
            long j10 = showTimeoutMs;
            if (j10 >= 0) {
                xVar.postDelayed(this.f5983v, j10);
            }
        }
    }

    public final void h(View view, boolean z9) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f5986y;
        if (!z9) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.A && j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    public final void i(int i10) {
        int i11 = this.f5987z;
        this.f5987z = i10;
        x xVar = this.f5963a;
        if (i10 == 2) {
            xVar.setVisibility(8);
        } else if (i11 == 2) {
            xVar.setVisibility(0);
        }
        if (i11 != i10) {
            Iterator it = xVar.f6110d.iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                xVar.getVisibility();
                ((f0) wVar).f6011c.j();
            }
        }
    }

    public final void k() {
        if (!this.C) {
            i(0);
            g();
            return;
        }
        int i10 = this.f5987z;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 == 4) {
                        return;
                    }
                } else {
                    this.B = true;
                }
            } else {
                this.f5977p.start();
            }
        } else {
            this.o.start();
        }
        g();
    }
}
