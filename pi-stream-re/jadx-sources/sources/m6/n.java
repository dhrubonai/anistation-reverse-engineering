package m6;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.o3;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import g0.h0;
import g0.i0;
import g0.k0;
import g0.y0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import msr.pistream.app.R;
import p7.a0;

/* loaded from: classes.dex */
public final class n extends LinearLayout {
    public static final /* synthetic */ int N = 0;
    public final LinkedHashSet A;
    public ColorStateList B;
    public PorterDuff.Mode C;
    public int D;
    public ImageView.ScaleType E;
    public View.OnLongClickListener F;
    public CharSequence G;
    public final i1 H;
    public boolean I;
    public EditText J;
    public final AccessibilityManager K;
    public h0.d L;
    public final l M;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f7487a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f7488b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f7489c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f7490d;

    /* renamed from: e, reason: collision with root package name */
    public PorterDuff.Mode f7491e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f7492f;

    /* renamed from: x, reason: collision with root package name */
    public final CheckableImageButton f7493x;

    /* renamed from: y, reason: collision with root package name */
    public final c.j f7494y;

    /* renamed from: z, reason: collision with root package name */
    public int f7495z;

    public n(TextInputLayout textInputLayout, o3 o3Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        this.f7495z = 0;
        this.A = new LinkedHashSet();
        this.M = new l(this);
        m mVar = new m(this);
        this.K = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f7487a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f7488b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a10 = a(this, from, R.id.text_input_error_icon);
        this.f7489c = a10;
        CheckableImageButton a11 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f7493x = a11;
        this.f7494y = new c.j(this, o3Var);
        i1 i1Var = new i1(getContext(), null);
        this.H = i1Var;
        if (o3Var.l(36)) {
            this.f7490d = a0.v(getContext(), o3Var, 36);
        }
        if (o3Var.l(37)) {
            this.f7491e = a0.Q(o3Var.h(37, -1), null);
        }
        if (o3Var.l(35)) {
            h(o3Var.e(35));
        }
        a10.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = y0.f4277a;
        h0.s(a10, 2);
        a10.setClickable(false);
        a10.setPressable(false);
        a10.setFocusable(false);
        if (!o3Var.l(51)) {
            if (o3Var.l(30)) {
                this.B = a0.v(getContext(), o3Var, 30);
            }
            if (o3Var.l(31)) {
                this.C = a0.Q(o3Var.h(31, -1), null);
            }
        }
        if (o3Var.l(28)) {
            f(o3Var.h(28, 0));
            if (o3Var.l(25) && a11.getContentDescription() != (k10 = o3Var.k(25))) {
                a11.setContentDescription(k10);
            }
            a11.setCheckable(o3Var.a(24, true));
        } else if (o3Var.l(51)) {
            if (o3Var.l(52)) {
                this.B = a0.v(getContext(), o3Var, 52);
            }
            if (o3Var.l(53)) {
                this.C = a0.Q(o3Var.h(53, -1), null);
            }
            f(o3Var.a(51, false) ? 1 : 0);
            CharSequence k11 = o3Var.k(49);
            if (a11.getContentDescription() != k11) {
                a11.setContentDescription(k11);
            }
        }
        int d10 = o3Var.d(27, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.D) {
                this.D = d10;
                a11.setMinimumWidth(d10);
                a11.setMinimumHeight(d10);
                a10.setMinimumWidth(d10);
                a10.setMinimumHeight(d10);
            }
            if (o3Var.l(29)) {
                ImageView.ScaleType i10 = a0.i(o3Var.h(29, -1));
                this.E = i10;
                a11.setScaleType(i10);
                a10.setScaleType(i10);
            }
            i1Var.setVisibility(8);
            i1Var.setId(R.id.textinput_suffix_text);
            i1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            k0.f(i1Var, 1);
            i1Var.setTextAppearance(o3Var.i(70, 0));
            if (o3Var.l(71)) {
                i1Var.setTextColor(o3Var.b(71));
            }
            CharSequence k12 = o3Var.k(69);
            this.G = TextUtils.isEmpty(k12) ? null : k12;
            i1Var.setText(k12);
            m();
            frameLayout.addView(a11);
            addView(i1Var);
            addView(frameLayout);
            addView(a10);
            textInputLayout.f2826t0.add(mVar);
            if (textInputLayout.f2807d != null) {
                mVar.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new j.f(this, 2));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i10);
        if (a0.I(getContext())) {
            g0.m.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final o b() {
        int i10 = this.f7495z;
        c.j jVar = this.f7494y;
        o oVar = (o) ((SparseArray) jVar.f1596c).get(i10);
        if (oVar == null) {
            if (i10 != -1) {
                int i11 = 1;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                oVar = new k((n) jVar.f1597d);
                            } else {
                                throw new IllegalArgumentException(a3.g.n("Invalid end icon mode: ", i10));
                            }
                        } else {
                            oVar = new d((n) jVar.f1597d);
                        }
                    } else {
                        oVar = new u((n) jVar.f1597d, jVar.f1595b);
                    }
                } else {
                    oVar = new e((n) jVar.f1597d, i11);
                }
            } else {
                oVar = new e((n) jVar.f1597d, 0);
            }
            ((SparseArray) jVar.f1596c).append(i10, oVar);
        }
        return oVar;
    }

    public final boolean c() {
        if (this.f7488b.getVisibility() == 0 && this.f7493x.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.f7489c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void e(boolean z9) {
        boolean z10;
        boolean isActivated;
        boolean isChecked;
        o b10 = b();
        boolean k10 = b10.k();
        CheckableImageButton checkableImageButton = this.f7493x;
        boolean z11 = true;
        if (k10 && (isChecked = checkableImageButton.isChecked()) != b10.l()) {
            checkableImageButton.setChecked(!isChecked);
            z10 = true;
        } else {
            z10 = false;
        }
        if ((b10 instanceof k) && (isActivated = checkableImageButton.isActivated()) != b10.j()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z11 = z10;
        }
        if (z9 || z11) {
            a0.T(this.f7487a, checkableImageButton, this.B);
        }
    }

    public final void f(int i10) {
        boolean z9;
        Drawable drawable;
        if (this.f7495z == i10) {
            return;
        }
        o b10 = b();
        h0.d dVar = this.L;
        AccessibilityManager accessibilityManager = this.K;
        if (dVar != null && accessibilityManager != null) {
            h0.c.b(accessibilityManager, dVar);
        }
        CharSequence charSequence = null;
        this.L = null;
        b10.s();
        this.f7495z = i10;
        Iterator it = this.A.iterator();
        if (!it.hasNext()) {
            if (i10 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            g(z9);
            o b11 = b();
            int i11 = this.f7494y.f1594a;
            if (i11 == 0) {
                i11 = b11.d();
            }
            if (i11 != 0) {
                drawable = w7.b.G(getContext(), i11);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.f7493x;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.f7487a;
            if (drawable != null) {
                a0.b(textInputLayout, checkableImageButton, this.B, this.C);
                a0.T(textInputLayout, checkableImageButton, this.B);
            }
            int c6 = b11.c();
            if (c6 != 0) {
                charSequence = getResources().getText(c6);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(b11.k());
            if (b11.i(textInputLayout.getBoxBackgroundMode())) {
                b11.r();
                h0.d h10 = b11.h();
                this.L = h10;
                if (h10 != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = y0.f4277a;
                    if (k0.b(this)) {
                        h0.c.a(accessibilityManager, this.L);
                    }
                }
                View.OnClickListener f10 = b11.f();
                View.OnLongClickListener onLongClickListener = this.F;
                checkableImageButton.setOnClickListener(f10);
                a0.U(checkableImageButton, onLongClickListener);
                EditText editText = this.J;
                if (editText != null) {
                    b11.m(editText);
                    i(b11);
                }
                a0.b(textInputLayout, checkableImageButton, this.B, this.C);
                e(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        a3.g.z(it.next());
        throw null;
    }

    public final void g(boolean z9) {
        int i10;
        if (c() != z9) {
            if (z9) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.f7493x.setVisibility(i10);
            j();
            l();
            this.f7487a.p();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f7489c;
        checkableImageButton.setImageDrawable(drawable);
        k();
        a0.b(this.f7487a, checkableImageButton, this.f7490d, this.f7491e);
    }

    public final void i(o oVar) {
        if (this.J == null) {
            return;
        }
        if (oVar.e() != null) {
            this.J.setOnFocusChangeListener(oVar.e());
        }
        if (oVar.g() != null) {
            this.f7493x.setOnFocusChangeListener(oVar.g());
        }
    }

    public final void j() {
        int i10;
        boolean z9;
        boolean z10;
        int i11 = 8;
        if (this.f7493x.getVisibility() == 0 && !d()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f7488b.setVisibility(i10);
        if (this.G != null && !this.I) {
            z9 = false;
        } else {
            z9 = 8;
        }
        if (!c() && !d() && z9) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            i11 = 0;
        }
        setVisibility(i11);
    }

    public final void k() {
        boolean z9;
        int i10;
        CheckableImageButton checkableImageButton = this.f7489c;
        Drawable drawable = checkableImageButton.getDrawable();
        boolean z10 = true;
        TextInputLayout textInputLayout = this.f7487a;
        if (drawable != null && textInputLayout.A.f7521q && textInputLayout.m()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        checkableImageButton.setVisibility(i10);
        j();
        l();
        if (this.f7495z == 0) {
            z10 = false;
        }
        if (!z10) {
            textInputLayout.p();
        }
    }

    public final void l() {
        int i10;
        TextInputLayout textInputLayout = this.f7487a;
        if (textInputLayout.f2807d == null) {
            return;
        }
        if (!c() && !d()) {
            EditText editText = textInputLayout.f2807d;
            WeakHashMap weakHashMap = y0.f4277a;
            i10 = i0.e(editText);
        } else {
            i10 = 0;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f2807d.getPaddingTop();
        int paddingBottom = textInputLayout.f2807d.getPaddingBottom();
        WeakHashMap weakHashMap2 = y0.f4277a;
        i0.k(this.H, dimensionPixelSize, paddingTop, i10, paddingBottom);
    }

    public final void m() {
        int i10;
        i1 i1Var = this.H;
        int visibility = i1Var.getVisibility();
        boolean z9 = false;
        if (this.G != null && !this.I) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (visibility != i10) {
            o b10 = b();
            if (i10 == 0) {
                z9 = true;
            }
            b10.p(z9);
        }
        j();
        i1Var.setVisibility(i10);
        this.f7487a.p();
    }
}
