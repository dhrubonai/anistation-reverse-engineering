package m6;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import g0.h0;
import g0.y0;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class k extends o {

    /* renamed from: e, reason: collision with root package name */
    public final int f7472e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7473f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f7474g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f7475h;

    /* renamed from: i, reason: collision with root package name */
    public final j3.j f7476i;

    /* renamed from: j, reason: collision with root package name */
    public final b f7477j;

    /* renamed from: k, reason: collision with root package name */
    public final w.f f7478k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7479l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7480m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f7481n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f7482p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f7483q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f7484r;

    public k(n nVar) {
        super(nVar);
        this.f7476i = new j3.j(this, 4);
        this.f7477j = new b(this, 1);
        this.f7478k = new w.f(this, 20);
        this.o = Long.MAX_VALUE;
        this.f7473f = j5.a.a0(nVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f7472e = j5.a.a0(nVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f7474g = j5.a.b0(nVar.getContext(), R.attr.motionEasingLinearInterpolator, t5.a.f10034a);
    }

    @Override // m6.o
    public final void a() {
        boolean z9;
        if (this.f7482p.isTouchExplorationEnabled()) {
            if (this.f7475h.getInputType() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9 && !this.f7499d.hasFocus()) {
                this.f7475h.dismissDropDown();
            }
        }
        this.f7475h.post(new androidx.activity.b(this, 18));
    }

    @Override // m6.o
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // m6.o
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // m6.o
    public final View.OnFocusChangeListener e() {
        return this.f7477j;
    }

    @Override // m6.o
    public final View.OnClickListener f() {
        return this.f7476i;
    }

    @Override // m6.o
    public final h0.d h() {
        return this.f7478k;
    }

    @Override // m6.o
    public final boolean i(int i10) {
        return i10 != 0;
    }

    @Override // m6.o
    public final boolean j() {
        return this.f7479l;
    }

    @Override // m6.o
    public final boolean l() {
        return this.f7481n;
    }

    @Override // m6.o
    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f7475h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: m6.i
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z9;
                    k kVar = k.this;
                    kVar.getClass();
                    if (motionEvent.getAction() == 1) {
                        long currentTimeMillis = System.currentTimeMillis() - kVar.o;
                        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (z9) {
                            kVar.f7480m = false;
                        }
                        kVar.u();
                        kVar.f7480m = true;
                        kVar.o = System.currentTimeMillis();
                    }
                    return false;
                }
            });
            this.f7475h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: m6.j
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    k kVar = k.this;
                    kVar.f7480m = true;
                    kVar.o = System.currentTimeMillis();
                    kVar.t(false);
                }
            });
            boolean z9 = false;
            this.f7475h.setThreshold(0);
            TextInputLayout textInputLayout = this.f7496a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() != 0) {
                z9 = true;
            }
            if (!z9 && this.f7482p.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = y0.f4277a;
                h0.s(this.f7499d, 2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // m6.o
    public final void n(h0.h hVar) {
        boolean z9;
        boolean z10 = true;
        if (this.f7475h.getInputType() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f4539a;
        if (!z9) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            z10 = accessibilityNodeInfo.isShowingHintText();
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras == null || (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                z10 = false;
            }
        }
        if (z10) {
            hVar.g(null);
        }
    }

    @Override // m6.o
    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z9;
        if (this.f7482p.isEnabled()) {
            boolean z10 = false;
            if (this.f7475h.getInputType() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                if (accessibilityEvent.getEventType() == 32768 && this.f7481n && !this.f7475h.isPopupShowing()) {
                    z10 = true;
                }
                if (accessibilityEvent.getEventType() == 1 || z10) {
                    u();
                    this.f7480m = true;
                    this.o = System.currentTimeMillis();
                }
            }
        }
    }

    @Override // m6.o
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f7474g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f7473f);
        int i10 = 1;
        ofFloat.addUpdateListener(new j3.e(this, i10));
        this.f7484r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f7472e);
        ofFloat2.addUpdateListener(new j3.e(this, i10));
        this.f7483q = ofFloat2;
        ofFloat2.addListener(new androidx.appcompat.widget.d(this, 6));
        this.f7482p = (AccessibilityManager) this.f7498c.getSystemService("accessibility");
    }

    @Override // m6.o
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f7475h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f7475h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z9) {
        if (this.f7481n != z9) {
            this.f7481n = z9;
            this.f7484r.cancel();
            this.f7483q.start();
        }
    }

    public final void u() {
        boolean z9;
        if (this.f7475h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            this.f7480m = false;
        }
        if (!this.f7480m) {
            t(!this.f7481n);
            if (this.f7481n) {
                this.f7475h.requestFocus();
                this.f7475h.showDropDown();
                return;
            } else {
                this.f7475h.dismissDropDown();
                return;
            }
        }
        this.f7480m = false;
    }
}
