package m6;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class d extends o {

    /* renamed from: e, reason: collision with root package name */
    public final int f7459e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7460f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f7461g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f7462h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f7463i;

    /* renamed from: j, reason: collision with root package name */
    public final j3.j f7464j;

    /* renamed from: k, reason: collision with root package name */
    public final b f7465k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f7466l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f7467m;

    public d(n nVar) {
        super(nVar);
        this.f7464j = new j3.j(this, 3);
        this.f7465k = new b(this, 0);
        this.f7459e = j5.a.a0(nVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f7460f = j5.a.a0(nVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f7461g = j5.a.b0(nVar.getContext(), R.attr.motionEasingLinearInterpolator, t5.a.f10034a);
        this.f7462h = j5.a.b0(nVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, t5.a.f10037d);
    }

    @Override // m6.o
    public final void a() {
        if (this.f7497b.G != null) {
            return;
        }
        t(u());
    }

    @Override // m6.o
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // m6.o
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // m6.o
    public final View.OnFocusChangeListener e() {
        return this.f7465k;
    }

    @Override // m6.o
    public final View.OnClickListener f() {
        return this.f7464j;
    }

    @Override // m6.o
    public final View.OnFocusChangeListener g() {
        return this.f7465k;
    }

    @Override // m6.o
    public final void m(EditText editText) {
        this.f7463i = editText;
        this.f7496a.setEndIconVisible(u());
    }

    @Override // m6.o
    public final void p(boolean z9) {
        if (this.f7497b.G == null) {
            return;
        }
        t(z9);
    }

    @Override // m6.o
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f7462h);
        ofFloat.setDuration(this.f7460f);
        final int i10 = 0;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: m6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f7454b;

            {
                this.f7454b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i11 = i10;
                d dVar = this.f7454b;
                switch (i11) {
                    case 0:
                        dVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar.f7499d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        dVar.getClass();
                        dVar.f7499d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f7461g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i11 = this.f7459e;
        ofFloat2.setDuration(i11);
        final int i12 = 1;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: m6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f7454b;

            {
                this.f7454b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i112 = i12;
                d dVar = this.f7454b;
                switch (i112) {
                    case 0:
                        dVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar.f7499d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        dVar.getClass();
                        dVar.f7499d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f7466l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f7466l.addListener(new c(this, i10));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i11);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: m6.a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f7454b;

            {
                this.f7454b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i112 = i12;
                d dVar = this.f7454b;
                switch (i112) {
                    case 0:
                        dVar.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar.f7499d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        return;
                    default:
                        dVar.getClass();
                        dVar.f7499d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        return;
                }
            }
        });
        this.f7467m = ofFloat3;
        ofFloat3.addListener(new c(this, i12));
    }

    @Override // m6.o
    public final void s() {
        EditText editText = this.f7463i;
        if (editText != null) {
            editText.post(new androidx.activity.b(this, 17));
        }
    }

    public final void t(boolean z9) {
        boolean z10;
        if (this.f7497b.c() == z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 && !this.f7466l.isRunning()) {
            this.f7467m.cancel();
            this.f7466l.start();
            if (z10) {
                this.f7466l.end();
                return;
            }
            return;
        }
        if (!z9) {
            this.f7466l.cancel();
            this.f7467m.start();
            if (z10) {
                this.f7467m.end();
            }
        }
    }

    public final boolean u() {
        EditText editText = this.f7463i;
        if (editText != null && ((editText.hasFocus() || this.f7499d.hasFocus()) && this.f7463i.getText().length() > 0)) {
            return true;
        }
        return false;
    }
}
