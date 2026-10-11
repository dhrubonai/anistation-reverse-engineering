package m6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.i1;
import com.google.android.material.textfield.TextInputLayout;
import g0.i0;
import g0.k0;
import g0.y0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import msr.pistream.app.R;
import p7.a0;

/* loaded from: classes.dex */
public final class r {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f7506a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7507b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7508c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f7509d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f7510e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f7511f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f7512g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f7513h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f7514i;

    /* renamed from: j, reason: collision with root package name */
    public int f7515j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f7516k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f7517l;

    /* renamed from: m, reason: collision with root package name */
    public final float f7518m;

    /* renamed from: n, reason: collision with root package name */
    public int f7519n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f7520p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7521q;

    /* renamed from: r, reason: collision with root package name */
    public i1 f7522r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f7523s;

    /* renamed from: t, reason: collision with root package name */
    public int f7524t;

    /* renamed from: u, reason: collision with root package name */
    public int f7525u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f7526v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f7527w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f7528x;

    /* renamed from: y, reason: collision with root package name */
    public i1 f7529y;

    /* renamed from: z, reason: collision with root package name */
    public int f7530z;

    public r(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f7512g = context;
        this.f7513h = textInputLayout;
        this.f7518m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f7506a = j5.a.a0(context, R.attr.motionDurationShort4, 217);
        this.f7507b = j5.a.a0(context, R.attr.motionDurationMedium4, 167);
        this.f7508c = j5.a.a0(context, R.attr.motionDurationShort4, 167);
        this.f7509d = j5.a.b0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, t5.a.f10037d);
        LinearInterpolator linearInterpolator = t5.a.f10034a;
        this.f7510e = j5.a.b0(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f7511f = j5.a.b0(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i10) {
        boolean z9;
        if (this.f7514i == null && this.f7516k == null) {
            Context context = this.f7512g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f7514i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f7514i;
            TextInputLayout textInputLayout = this.f7513h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f7516k = new FrameLayout(context);
            this.f7514i.addView(this.f7516k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i10 != 0 && i10 != 1) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            this.f7516k.setVisibility(0);
            this.f7516k.addView(textView);
        } else {
            this.f7514i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f7514i.setVisibility(0);
        this.f7515j++;
    }

    public final void b() {
        boolean z9;
        LinearLayout linearLayout = this.f7514i;
        TextInputLayout textInputLayout = this.f7513h;
        if (linearLayout != null && textInputLayout.getEditText() != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f7512g;
            boolean I = a0.I(context);
            LinearLayout linearLayout2 = this.f7514i;
            WeakHashMap weakHashMap = y0.f4277a;
            int f10 = i0.f(editText);
            if (I) {
                f10 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (I) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int e10 = i0.e(editText);
            if (I) {
                e10 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            i0.k(linearLayout2, f10, dimensionPixelSize, e10, 0);
        }
    }

    public final void c() {
        Animator animator = this.f7517l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z9, TextView textView, int i10, int i11, int i12) {
        boolean z10;
        boolean z11;
        float f10;
        int i13;
        TimeInterpolator timeInterpolator;
        boolean z12;
        if (textView != null && z9) {
            if (i10 != i12 && i10 != i11) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (i12 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, f10);
                int i14 = this.f7508c;
                if (z11) {
                    i13 = this.f7507b;
                } else {
                    i13 = i14;
                }
                ofFloat.setDuration(i13);
                if (z11) {
                    timeInterpolator = this.f7510e;
                } else {
                    timeInterpolator = this.f7511f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i10 == i12 && i11 != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    ofFloat.setStartDelay(i14);
                }
                arrayList.add(ofFloat);
                if (i12 == i10 && i11 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f7518m, 0.0f);
                    ofFloat2.setDuration(this.f7506a);
                    ofFloat2.setInterpolator(this.f7509d);
                    ofFloat2.setStartDelay(i14);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                return null;
            }
            return this.f7529y;
        }
        return this.f7522r;
    }

    public final void f() {
        this.f7520p = null;
        c();
        if (this.f7519n == 1) {
            if (this.f7528x && !TextUtils.isEmpty(this.f7527w)) {
                this.o = 2;
            } else {
                this.o = 0;
            }
        }
        i(this.f7519n, this.o, h(this.f7522r, ""));
    }

    public final void g(TextView textView, int i10) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f7514i;
        if (linearLayout == null) {
            return;
        }
        boolean z9 = true;
        if (i10 != 0 && i10 != 1) {
            z9 = false;
        }
        if (z9 && (frameLayout = this.f7516k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i11 = this.f7515j - 1;
        this.f7515j = i11;
        LinearLayout linearLayout2 = this.f7514i;
        if (i11 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = y0.f4277a;
        TextInputLayout textInputLayout = this.f7513h;
        if (k0.c(textInputLayout) && textInputLayout.isEnabled() && (this.o != this.f7519n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void i(int i10, int i11, boolean z9) {
        TextView e10;
        TextView e11;
        if (i10 == i11) {
            return;
        }
        if (z9) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f7517l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f7528x, this.f7529y, 2, i10, i11);
            d(arrayList, this.f7521q, this.f7522r, 1, i10, i11);
            a0.R(animatorSet, arrayList);
            animatorSet.addListener(new p(this, i11, e(i10), i10, e(i11)));
            animatorSet.start();
        } else if (i10 != i11) {
            if (i11 != 0 && (e11 = e(i11)) != null) {
                e11.setVisibility(0);
                e11.setAlpha(1.0f);
            }
            if (i10 != 0 && (e10 = e(i10)) != null) {
                e10.setVisibility(4);
                if (i10 == 1) {
                    e10.setText((CharSequence) null);
                }
            }
            this.f7519n = i11;
        }
        TextInputLayout textInputLayout = this.f7513h;
        textInputLayout.q();
        textInputLayout.t(z9, false);
        textInputLayout.w();
    }
}
