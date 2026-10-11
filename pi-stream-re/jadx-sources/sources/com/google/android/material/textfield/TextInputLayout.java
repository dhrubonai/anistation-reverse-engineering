package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.c3;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.o3;
import androidx.appcompat.widget.v1;
import androidx.appcompat.widget.y2;
import com.google.android.material.internal.CheckableImageButton;
import e0.c;
import e6.b;
import g0.h0;
import g0.i0;
import g0.k0;
import g0.p0;
import g0.y0;
import g6.d;
import h3.e;
import j6.f;
import j6.g;
import j6.j;
import j6.k;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m6.h;
import m6.m;
import m6.n;
import m6.q;
import m6.r;
import m6.t;
import m6.v;
import m6.w;
import m6.x;
import m6.y;
import m6.z;
import p7.a0;
import q3.i;
import t5.a;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public static final int[][] P0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public final r A;
    public int A0;
    public boolean B;
    public int B0;
    public int C;
    public ColorStateList C0;
    public boolean D;
    public int D0;
    public y E;
    public int E0;
    public i1 F;
    public int F0;
    public int G;
    public int G0;
    public int H;
    public int H0;
    public CharSequence I;
    public boolean I0;
    public boolean J;
    public final b J0;
    public i1 K;
    public boolean K0;
    public ColorStateList L;
    public boolean L0;
    public int M;
    public ValueAnimator M0;
    public i N;
    public boolean N0;
    public i O;
    public boolean O0;
    public ColorStateList P;
    public ColorStateList Q;
    public boolean R;
    public CharSequence S;
    public boolean T;
    public g U;
    public g V;
    public StateListDrawable W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2801a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f2802a0;

    /* renamed from: b, reason: collision with root package name */
    public final v f2803b;

    /* renamed from: b0, reason: collision with root package name */
    public g f2804b0;

    /* renamed from: c, reason: collision with root package name */
    public final n f2805c;

    /* renamed from: c0, reason: collision with root package name */
    public g f2806c0;

    /* renamed from: d, reason: collision with root package name */
    public EditText f2807d;

    /* renamed from: d0, reason: collision with root package name */
    public k f2808d0;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2809e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f2810e0;

    /* renamed from: f, reason: collision with root package name */
    public int f2811f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f2812f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f2813g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f2814h0;

    /* renamed from: i0, reason: collision with root package name */
    public int f2815i0;

    /* renamed from: j0, reason: collision with root package name */
    public int f2816j0;

    /* renamed from: k0, reason: collision with root package name */
    public int f2817k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f2818l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f2819m0;

    /* renamed from: n0, reason: collision with root package name */
    public final Rect f2820n0;

    /* renamed from: o0, reason: collision with root package name */
    public final Rect f2821o0;

    /* renamed from: p0, reason: collision with root package name */
    public final RectF f2822p0;

    /* renamed from: q0, reason: collision with root package name */
    public Typeface f2823q0;

    /* renamed from: r0, reason: collision with root package name */
    public ColorDrawable f2824r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f2825s0;

    /* renamed from: t0, reason: collision with root package name */
    public final LinkedHashSet f2826t0;

    /* renamed from: u0, reason: collision with root package name */
    public ColorDrawable f2827u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f2828v0;

    /* renamed from: w0, reason: collision with root package name */
    public Drawable f2829w0;

    /* renamed from: x, reason: collision with root package name */
    public int f2830x;

    /* renamed from: x0, reason: collision with root package name */
    public ColorStateList f2831x0;

    /* renamed from: y, reason: collision with root package name */
    public int f2832y;

    /* renamed from: y0, reason: collision with root package name */
    public ColorStateList f2833y0;

    /* renamed from: z, reason: collision with root package name */
    public int f2834z;

    /* renamed from: z0, reason: collision with root package name */
    public int f2835z0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v58 */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(w7.b.Z(context, attributeSet, msr.pistream.app.R.attr.textInputStyle, msr.pistream.app.R.style.Widget_Design_TextInputLayout), attributeSet, msr.pistream.app.R.attr.textInputStyle);
        ?? r42;
        this.f2811f = -1;
        this.f2830x = -1;
        this.f2832y = -1;
        this.f2834z = -1;
        this.A = new r(this);
        this.E = new e(4);
        this.f2820n0 = new Rect();
        this.f2821o0 = new Rect();
        this.f2822p0 = new RectF();
        this.f2826t0 = new LinkedHashSet();
        b bVar = new b(this);
        this.J0 = bVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2801a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = a.f10034a;
        bVar.Q = linearInterpolator;
        bVar.h(false);
        bVar.P = linearInterpolator;
        bVar.h(false);
        if (bVar.f3554g != 8388659) {
            bVar.f3554g = 8388659;
            bVar.h(false);
        }
        int[] iArr = s5.a.f9924z;
        w7.b.k(context2, attributeSet, msr.pistream.app.R.attr.textInputStyle, msr.pistream.app.R.style.Widget_Design_TextInputLayout);
        w7.b.y(context2, attributeSet, iArr, msr.pistream.app.R.attr.textInputStyle, msr.pistream.app.R.style.Widget_Design_TextInputLayout, 22, 20, 38, 43, 47);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, msr.pistream.app.R.attr.textInputStyle, msr.pistream.app.R.style.Widget_Design_TextInputLayout);
        o3 o3Var = new o3(context2, obtainStyledAttributes);
        v vVar = new v(this, o3Var);
        this.f2803b = vVar;
        this.R = o3Var.a(46, true);
        setHint(o3Var.k(4));
        this.L0 = o3Var.a(45, true);
        this.K0 = o3Var.a(40, true);
        if (o3Var.l(6)) {
            setMinEms(o3Var.h(6, -1));
        } else if (o3Var.l(3)) {
            setMinWidth(o3Var.d(3, -1));
        }
        if (o3Var.l(5)) {
            setMaxEms(o3Var.h(5, -1));
        } else if (o3Var.l(2)) {
            setMaxWidth(o3Var.d(2, -1));
        }
        this.f2808d0 = new k(k.b(context2, attributeSet, msr.pistream.app.R.attr.textInputStyle, msr.pistream.app.R.style.Widget_Design_TextInputLayout));
        this.f2812f0 = context2.getResources().getDimensionPixelOffset(msr.pistream.app.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2814h0 = o3Var.c(9, 0);
        this.f2816j0 = o3Var.d(16, context2.getResources().getDimensionPixelSize(msr.pistream.app.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2817k0 = o3Var.d(17, context2.getResources().getDimensionPixelSize(msr.pistream.app.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2815i0 = this.f2816j0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        k kVar = this.f2808d0;
        kVar.getClass();
        j jVar = new j(kVar);
        if (dimension >= 0.0f) {
            jVar.f6208e = new j6.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            jVar.f6209f = new j6.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            jVar.f6210g = new j6.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            jVar.f6211h = new j6.a(dimension4);
        }
        this.f2808d0 = new k(jVar);
        ColorStateList v9 = a0.v(context2, o3Var, 7);
        if (v9 != null) {
            int defaultColor = v9.getDefaultColor();
            this.D0 = defaultColor;
            this.f2819m0 = defaultColor;
            if (v9.isStateful()) {
                this.E0 = v9.getColorForState(new int[]{-16842910}, -1);
                this.F0 = v9.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.G0 = v9.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.F0 = this.D0;
                ColorStateList colorStateList = x.j.getColorStateList(context2, msr.pistream.app.R.color.mtrl_filled_background_color);
                this.E0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.G0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2819m0 = 0;
            this.D0 = 0;
            this.E0 = 0;
            this.F0 = 0;
            this.G0 = 0;
        }
        if (o3Var.l(1)) {
            ColorStateList b10 = o3Var.b(1);
            this.f2833y0 = b10;
            this.f2831x0 = b10;
        }
        ColorStateList v10 = a0.v(context2, o3Var, 14);
        this.B0 = obtainStyledAttributes.getColor(14, 0);
        this.f2835z0 = x.j.getColor(context2, msr.pistream.app.R.color.mtrl_textinput_default_box_stroke_color);
        this.H0 = x.j.getColor(context2, msr.pistream.app.R.color.mtrl_textinput_disabled_color);
        this.A0 = x.j.getColor(context2, msr.pistream.app.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (v10 != null) {
            setBoxStrokeColorStateList(v10);
        }
        if (o3Var.l(15)) {
            setBoxStrokeErrorColor(a0.v(context2, o3Var, 15));
        }
        if (o3Var.i(47, -1) != -1) {
            r42 = 0;
            setHintTextAppearance(o3Var.i(47, 0));
        } else {
            r42 = 0;
        }
        int i10 = o3Var.i(38, r42);
        CharSequence k10 = o3Var.k(33);
        int h10 = o3Var.h(32, 1);
        boolean a10 = o3Var.a(34, r42);
        int i11 = o3Var.i(43, r42);
        boolean a11 = o3Var.a(42, r42);
        CharSequence k11 = o3Var.k(41);
        int i12 = o3Var.i(55, r42);
        CharSequence k12 = o3Var.k(54);
        boolean a12 = o3Var.a(18, r42);
        setCounterMaxLength(o3Var.h(19, -1));
        this.H = o3Var.i(22, 0);
        this.G = o3Var.i(20, 0);
        setBoxBackgroundMode(o3Var.h(8, 0));
        setErrorContentDescription(k10);
        setErrorAccessibilityLiveRegion(h10);
        setCounterOverflowTextAppearance(this.G);
        setHelperTextTextAppearance(i11);
        setErrorTextAppearance(i10);
        setCounterTextAppearance(this.H);
        setPlaceholderText(k12);
        setPlaceholderTextAppearance(i12);
        if (o3Var.l(39)) {
            setErrorTextColor(o3Var.b(39));
        }
        if (o3Var.l(44)) {
            setHelperTextColor(o3Var.b(44));
        }
        if (o3Var.l(48)) {
            setHintTextColor(o3Var.b(48));
        }
        if (o3Var.l(23)) {
            setCounterTextColor(o3Var.b(23));
        }
        if (o3Var.l(21)) {
            setCounterOverflowTextColor(o3Var.b(21));
        }
        if (o3Var.l(56)) {
            setPlaceholderTextColor(o3Var.b(56));
        }
        n nVar = new n(this, o3Var);
        this.f2805c = nVar;
        boolean a13 = o3Var.a(0, true);
        o3Var.p();
        h0.s(this, 2);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 26 && i13 >= 26) {
            p0.l(this, 1);
        }
        frameLayout.addView(vVar);
        frameLayout.addView(nVar);
        addView(frameLayout);
        setEnabled(a13);
        setHelperTextEnabled(a11);
        setErrorEnabled(a10);
        setCounterEnabled(a12);
        setHelperText(k11);
    }

    private Drawable getEditTextBoxBackground() {
        boolean z9;
        int i10;
        EditText editText = this.f2807d;
        if (editText instanceof AutoCompleteTextView) {
            if (editText.getInputType() != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                int B = q6.g.B(this.f2807d, msr.pistream.app.R.attr.colorControlHighlight);
                int i11 = this.f2813g0;
                int[][] iArr = P0;
                if (i11 == 2) {
                    Context context = getContext();
                    g gVar = this.U;
                    TypedValue e02 = q6.g.e0(context, "TextInputLayout", msr.pistream.app.R.attr.colorSurface);
                    int i12 = e02.resourceId;
                    if (i12 != 0) {
                        i10 = x.j.getColor(context, i12);
                    } else {
                        i10 = e02.data;
                    }
                    g gVar2 = new g(gVar.f6194a.f6174a);
                    int F = q6.g.F(0.1f, B, i10);
                    gVar2.j(new ColorStateList(iArr, new int[]{F, 0}));
                    gVar2.setTint(i10);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{F, i10});
                    g gVar3 = new g(gVar.f6194a.f6174a);
                    gVar3.setTint(-1);
                    return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
                }
                if (i11 == 1) {
                    g gVar4 = this.U;
                    int i13 = this.f2819m0;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{q6.g.F(0.1f, B, i13), i13}), gVar4, gVar4);
                }
                return null;
            }
        }
        return this.U;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.W == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.W = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.W.addState(new int[0], f(false));
        }
        return this.W;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.V == null) {
            this.V = f(true);
        }
        return this.V;
    }

    public static void k(ViewGroup viewGroup, boolean z9) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z9);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z9);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f2807d == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f2807d = editText;
            int i10 = this.f2811f;
            if (i10 != -1) {
                setMinEms(i10);
            } else {
                setMinWidth(this.f2832y);
            }
            int i11 = this.f2830x;
            if (i11 != -1) {
                setMaxEms(i11);
            } else {
                setMaxWidth(this.f2834z);
            }
            this.f2802a0 = false;
            i();
            setTextInputAccessibilityDelegate(new x(this));
            Typeface typeface = this.f2807d.getTypeface();
            b bVar = this.J0;
            bVar.m(typeface);
            float textSize = this.f2807d.getTextSize();
            if (bVar.f3555h != textSize) {
                bVar.f3555h = textSize;
                bVar.h(false);
            }
            float letterSpacing = this.f2807d.getLetterSpacing();
            if (bVar.W != letterSpacing) {
                bVar.W = letterSpacing;
                bVar.h(false);
            }
            int gravity = this.f2807d.getGravity();
            int i12 = (gravity & (-113)) | 48;
            if (bVar.f3554g != i12) {
                bVar.f3554g = i12;
                bVar.h(false);
            }
            if (bVar.f3552f != gravity) {
                bVar.f3552f = gravity;
                bVar.h(false);
            }
            this.f2807d.addTextChangedListener(new c3(this, 1));
            if (this.f2831x0 == null) {
                this.f2831x0 = this.f2807d.getHintTextColors();
            }
            if (this.R) {
                if (TextUtils.isEmpty(this.S)) {
                    CharSequence hint = this.f2807d.getHint();
                    this.f2809e = hint;
                    setHint(hint);
                    this.f2807d.setHint((CharSequence) null);
                }
                this.T = true;
            }
            if (this.F != null) {
                n(this.f2807d.getText());
            }
            q();
            this.A.b();
            this.f2803b.bringToFront();
            n nVar = this.f2805c;
            nVar.bringToFront();
            Iterator it = this.f2826t0.iterator();
            while (it.hasNext()) {
                ((m) it.next()).a(this);
            }
            nVar.l();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            t(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.S)) {
            this.S = charSequence;
            b bVar = this.J0;
            if (charSequence == null || !TextUtils.equals(bVar.A, charSequence)) {
                bVar.A = charSequence;
                bVar.B = null;
                Bitmap bitmap = bVar.E;
                if (bitmap != null) {
                    bitmap.recycle();
                    bVar.E = null;
                }
                bVar.h(false);
            }
            if (!this.I0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z9) {
        if (this.J == z9) {
            return;
        }
        if (z9) {
            i1 i1Var = this.K;
            if (i1Var != null) {
                this.f2801a.addView(i1Var);
                this.K.setVisibility(0);
            }
        } else {
            i1 i1Var2 = this.K;
            if (i1Var2 != null) {
                i1Var2.setVisibility(8);
            }
            this.K = null;
        }
        this.J = z9;
    }

    public final void a(float f10) {
        b bVar = this.J0;
        if (bVar.f3544b == f10) {
            return;
        }
        int i10 = 1;
        if (this.M0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.M0 = valueAnimator;
            valueAnimator.setInterpolator(j5.a.b0(getContext(), msr.pistream.app.R.attr.motionEasingEmphasizedInterpolator, a.f10035b));
            this.M0.setDuration(j5.a.a0(getContext(), msr.pistream.app.R.attr.motionDurationMedium4, 167));
            this.M0.addUpdateListener(new w5.a(this, i10));
        }
        this.M0.setFloatValues(bVar.f3544b, f10);
        this.M0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.f2801a;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            s();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r7 = this;
            j6.g r0 = r7.U
            if (r0 != 0) goto L5
            return
        L5:
            j6.f r1 = r0.f6194a
            j6.k r1 = r1.f6174a
            j6.k r2 = r7.f2808d0
            if (r1 == r2) goto L10
            r0.setShapeAppearanceModel(r2)
        L10:
            int r0 = r7.f2813g0
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L27
            int r0 = r7.f2815i0
            if (r0 <= r2) goto L22
            int r0 = r7.f2818l0
            if (r0 == 0) goto L22
            r0 = r4
            goto L23
        L22:
            r0 = r3
        L23:
            if (r0 == 0) goto L27
            r0 = r4
            goto L28
        L27:
            r0 = r3
        L28:
            if (r0 == 0) goto L4b
            j6.g r0 = r7.U
            int r1 = r7.f2815i0
            float r1 = (float) r1
            int r5 = r7.f2818l0
            j6.f r6 = r0.f6194a
            r6.f6184k = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            j6.f r5 = r0.f6194a
            android.content.res.ColorStateList r6 = r5.f6177d
            if (r6 == r1) goto L4b
            r5.f6177d = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L4b:
            int r0 = r7.f2819m0
            int r1 = r7.f2813g0
            if (r1 != r4) goto L62
            android.content.Context r0 = r7.getContext()
            r1 = 2130968852(0x7f040114, float:1.754637E38)
            int r0 = q6.g.A(r0, r1, r3)
            int r1 = r7.f2819m0
            int r0 = z.a.b(r1, r0)
        L62:
            r7.f2819m0 = r0
            j6.g r1 = r7.U
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.j(r0)
            j6.g r0 = r7.f2804b0
            if (r0 == 0) goto La7
            j6.g r1 = r7.f2806c0
            if (r1 != 0) goto L76
            goto La7
        L76:
            int r1 = r7.f2815i0
            if (r1 <= r2) goto L7f
            int r1 = r7.f2818l0
            if (r1 == 0) goto L7f
            r3 = r4
        L7f:
            if (r3 == 0) goto La4
            android.widget.EditText r1 = r7.f2807d
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L90
            int r1 = r7.f2835z0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L96
        L90:
            int r1 = r7.f2818l0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L96:
            r0.j(r1)
            j6.g r0 = r7.f2806c0
            int r1 = r7.f2818l0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.j(r1)
        La4:
            r7.invalidate()
        La7:
            r7.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.b():void");
    }

    public final int c() {
        float d10;
        if (!this.R) {
            return 0;
        }
        int i10 = this.f2813g0;
        b bVar = this.J0;
        if (i10 != 0) {
            if (i10 != 2) {
                return 0;
            }
            d10 = bVar.d() / 2.0f;
        } else {
            d10 = bVar.d();
        }
        return (int) d10;
    }

    public final i d() {
        i iVar = new i();
        iVar.f9180c = j5.a.a0(getContext(), msr.pistream.app.R.attr.motionDurationShort2, 87);
        iVar.f9181d = j5.a.b0(getContext(), msr.pistream.app.R.attr.motionEasingLinearInterpolator, a.f10034a);
        return iVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.f2807d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.f2809e != null) {
            boolean z9 = this.T;
            this.T = false;
            CharSequence hint = editText.getHint();
            this.f2807d.setHint(this.f2809e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.f2807d.setHint(hint);
                this.T = z9;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        FrameLayout frameLayout = this.f2801a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i11 = 0; i11 < frameLayout.getChildCount(); i11++) {
            View childAt = frameLayout.getChildAt(i11);
            ViewStructure newChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(newChild, i10);
            if (childAt == this.f2807d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.O0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.O0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        super.draw(canvas);
        boolean z9 = this.R;
        b bVar = this.J0;
        if (z9) {
            bVar.getClass();
            int save = canvas.save();
            if (bVar.B != null) {
                RectF rectF = bVar.f3550e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = bVar.N;
                    textPaint.setTextSize(bVar.G);
                    float f10 = bVar.f3562p;
                    float f11 = bVar.f3563q;
                    float f12 = bVar.F;
                    if (f12 != 1.0f) {
                        canvas.scale(f12, f12, f10, f11);
                    }
                    boolean z10 = true;
                    if (bVar.f3549d0 <= 1 || bVar.C) {
                        z10 = false;
                    }
                    if (z10) {
                        float lineStart = bVar.f3562p - bVar.Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f11);
                        float f13 = alpha;
                        textPaint.setAlpha((int) (bVar.f3545b0 * f13));
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 31) {
                            float f14 = bVar.H;
                            float f15 = bVar.I;
                            float f16 = bVar.J;
                            int i11 = bVar.K;
                            textPaint.setShadowLayer(f14, f15, f16, z.a.c(i11, (Color.alpha(i11) * textPaint.getAlpha()) / 255));
                        }
                        bVar.Y.draw(canvas);
                        textPaint.setAlpha((int) (bVar.f3543a0 * f13));
                        if (i10 >= 31) {
                            float f17 = bVar.H;
                            float f18 = bVar.I;
                            float f19 = bVar.J;
                            int i12 = bVar.K;
                            textPaint.setShadowLayer(f17, f18, f19, z.a.c(i12, (Color.alpha(i12) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f3547c0;
                        float f20 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f20, textPaint);
                        if (i10 >= 31) {
                            textPaint.setShadowLayer(bVar.H, bVar.I, bVar.J, bVar.K);
                        }
                        String trim = bVar.f3547c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.Y.getLineEnd(0), str.length()), 0.0f, f20, (Paint) textPaint);
                    } else {
                        canvas.translate(f10, f11);
                        bVar.Y.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f2806c0 != null && (gVar = this.f2804b0) != null) {
            gVar.draw(canvas);
            if (this.f2807d.isFocused()) {
                Rect bounds = this.f2806c0.getBounds();
                Rect bounds2 = this.f2804b0.getBounds();
                float f21 = bVar.f3544b;
                int centerX = bounds2.centerX();
                int i13 = bounds2.left;
                LinearInterpolator linearInterpolator = a.f10034a;
                bounds.left = Math.round((i13 - centerX) * f21) + centerX;
                bounds.right = Math.round(f21 * (bounds2.right - centerX)) + centerX;
                this.f2806c0.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z9;
        ColorStateList colorStateList;
        boolean z10;
        boolean z11;
        if (this.N0) {
            return;
        }
        boolean z12 = true;
        this.N0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.J0;
        if (bVar != null) {
            bVar.L = drawableState;
            ColorStateList colorStateList2 = bVar.f3558k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.f3557j) != null && colorStateList.isStateful())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                bVar.h(false);
                z11 = true;
            } else {
                z11 = false;
            }
            z9 = z11 | false;
        } else {
            z9 = false;
        }
        if (this.f2807d != null) {
            WeakHashMap weakHashMap = y0.f4277a;
            if (!k0.c(this) || !isEnabled()) {
                z12 = false;
            }
            t(z12, false);
        }
        q();
        w();
        if (z9) {
            invalidate();
        }
        this.N0 = false;
    }

    public final boolean e() {
        if (this.R && !TextUtils.isEmpty(this.S) && (this.U instanceof h)) {
            return true;
        }
        return false;
    }

    public final g f(boolean z9) {
        float f10;
        float dimensionPixelOffset;
        int i10;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(msr.pistream.app.R.dimen.mtrl_shape_corner_size_small_component);
        if (z9) {
            f10 = dimensionPixelOffset2;
        } else {
            f10 = 0.0f;
        }
        EditText editText = this.f2807d;
        if (editText instanceof t) {
            dimensionPixelOffset = ((t) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(msr.pistream.app.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(msr.pistream.app.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        j jVar = new j();
        jVar.f6208e = new j6.a(f10);
        jVar.f6209f = new j6.a(f10);
        jVar.f6211h = new j6.a(dimensionPixelOffset2);
        jVar.f6210g = new j6.a(dimensionPixelOffset2);
        k kVar = new k(jVar);
        Context context = getContext();
        Paint paint = g.N;
        TypedValue e02 = q6.g.e0(context, g.class.getSimpleName(), msr.pistream.app.R.attr.colorSurface);
        int i11 = e02.resourceId;
        if (i11 != 0) {
            i10 = x.j.getColor(context, i11);
        } else {
            i10 = e02.data;
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(ColorStateList.valueOf(i10));
        gVar.i(dimensionPixelOffset);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f6194a;
        if (fVar.f6181h == null) {
            fVar.f6181h = new Rect();
        }
        gVar.f6194a.f6181h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i10, boolean z9) {
        int compoundPaddingLeft = this.f2807d.getCompoundPaddingLeft() + i10;
        if (getPrefixText() != null && !z9) {
            return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f2807d;
        if (editText != null) {
            return c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public g getBoxBackground() {
        int i10 = this.f2813g0;
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException();
        }
        return this.U;
    }

    public int getBoxBackgroundColor() {
        return this.f2819m0;
    }

    public int getBoxBackgroundMode() {
        return this.f2813g0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2814h0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean J = a0.J(this);
        RectF rectF = this.f2822p0;
        if (J) {
            return this.f2808d0.f6223h.a(rectF);
        }
        return this.f2808d0.f6222g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean J = a0.J(this);
        RectF rectF = this.f2822p0;
        if (J) {
            return this.f2808d0.f6222g.a(rectF);
        }
        return this.f2808d0.f6223h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean J = a0.J(this);
        RectF rectF = this.f2822p0;
        if (J) {
            return this.f2808d0.f6220e.a(rectF);
        }
        return this.f2808d0.f6221f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean J = a0.J(this);
        RectF rectF = this.f2822p0;
        if (J) {
            return this.f2808d0.f6221f.a(rectF);
        }
        return this.f2808d0.f6220e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.B0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.C0;
    }

    public int getBoxStrokeWidth() {
        return this.f2816j0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2817k0;
    }

    public int getCounterMaxLength() {
        return this.C;
    }

    public CharSequence getCounterOverflowDescription() {
        i1 i1Var;
        if (this.B && this.D && (i1Var = this.F) != null) {
            return i1Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.Q;
    }

    public ColorStateList getCounterTextColor() {
        return this.P;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2831x0;
    }

    public EditText getEditText() {
        return this.f2807d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2805c.f7493x.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2805c.f7493x.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2805c.D;
    }

    public int getEndIconMode() {
        return this.f2805c.f7495z;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2805c.E;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2805c.f7493x;
    }

    public CharSequence getError() {
        r rVar = this.A;
        if (rVar.f7521q) {
            return rVar.f7520p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.A.f7524t;
    }

    public CharSequence getErrorContentDescription() {
        return this.A.f7523s;
    }

    public int getErrorCurrentTextColors() {
        i1 i1Var = this.A.f7522r;
        if (i1Var != null) {
            return i1Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2805c.f7489c.getDrawable();
    }

    public CharSequence getHelperText() {
        r rVar = this.A;
        if (rVar.f7528x) {
            return rVar.f7527w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        i1 i1Var = this.A.f7529y;
        if (i1Var != null) {
            return i1Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.R) {
            return this.S;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.J0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.J0;
        return bVar.e(bVar.f3558k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2833y0;
    }

    public y getLengthCounter() {
        return this.E;
    }

    public int getMaxEms() {
        return this.f2830x;
    }

    public int getMaxWidth() {
        return this.f2834z;
    }

    public int getMinEms() {
        return this.f2811f;
    }

    public int getMinWidth() {
        return this.f2832y;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2805c.f7493x.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2805c.f7493x.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.J) {
            return this.I;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.M;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.L;
    }

    public CharSequence getPrefixText() {
        return this.f2803b.f7544c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2803b.f7543b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2803b.f7543b;
    }

    public k getShapeAppearanceModel() {
        return this.f2808d0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2803b.f7545d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2803b.f7545d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2803b.f7548x;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2803b.f7549y;
    }

    public CharSequence getSuffixText() {
        return this.f2805c.G;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2805c.H.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2805c.H;
    }

    public Typeface getTypeface() {
        return this.f2823q0;
    }

    public final int h(int i10, boolean z9) {
        int compoundPaddingRight = i10 - this.f2807d.getCompoundPaddingRight();
        if (getPrefixText() != null && z9) {
            return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
        }
        return compoundPaddingRight;
    }

    public final void i() {
        boolean z9;
        int i10 = this.f2813g0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    if (this.R && !(this.U instanceof h)) {
                        k kVar = this.f2808d0;
                        int i11 = h.P;
                        if (kVar == null) {
                            kVar = new k();
                        }
                        this.U = new m6.g(new m6.f(kVar, new RectF()));
                    } else {
                        this.U = new g(this.f2808d0);
                    }
                    this.f2804b0 = null;
                    this.f2806c0 = null;
                } else {
                    throw new IllegalArgumentException(this.f2813g0 + " is illegal; only @BoxBackgroundMode constants are supported.");
                }
            } else {
                this.U = new g(this.f2808d0);
                this.f2804b0 = new g();
                this.f2806c0 = new g();
            }
        } else {
            this.U = null;
            this.f2804b0 = null;
            this.f2806c0 = null;
        }
        r();
        w();
        boolean z10 = false;
        if (this.f2813g0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                this.f2814h0 = getResources().getDimensionPixelSize(msr.pistream.app.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (a0.I(getContext())) {
                this.f2814h0 = getResources().getDimensionPixelSize(msr.pistream.app.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f2807d != null && this.f2813g0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z10 = true;
            }
            if (z10) {
                EditText editText = this.f2807d;
                WeakHashMap weakHashMap = y0.f4277a;
                i0.k(editText, i0.f(editText), getResources().getDimensionPixelSize(msr.pistream.app.R.dimen.material_filled_edittext_font_2_0_padding_top), i0.e(this.f2807d), getResources().getDimensionPixelSize(msr.pistream.app.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (a0.I(getContext())) {
                EditText editText2 = this.f2807d;
                WeakHashMap weakHashMap2 = y0.f4277a;
                i0.k(editText2, i0.f(editText2), getResources().getDimensionPixelSize(msr.pistream.app.R.dimen.material_filled_edittext_font_1_3_padding_top), i0.e(this.f2807d), getResources().getDimensionPixelSize(msr.pistream.app.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f2813g0 != 0) {
            s();
        }
        EditText editText3 = this.f2807d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i12 = this.f2813g0;
                if (i12 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i12 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f10;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        int i10;
        int i11;
        if (!e()) {
            return;
        }
        int width = this.f2807d.getWidth();
        int gravity = this.f2807d.getGravity();
        b bVar = this.J0;
        boolean b10 = bVar.b(bVar.A);
        bVar.C = b10;
        Rect rect = bVar.f3548d;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                if (b10) {
                    f10 = rect.right;
                    f11 = bVar.Z;
                } else {
                    i11 = rect.left;
                    f12 = i11;
                }
            } else if (b10) {
                i11 = rect.left;
                f12 = i11;
            } else {
                f10 = rect.right;
                f11 = bVar.Z;
            }
            float max = Math.max(f12, rect.left);
            rectF = this.f2822p0;
            rectF.left = max;
            rectF.top = rect.top;
            if (gravity == 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                    if (bVar.C) {
                        i10 = rect.right;
                        f13 = i10;
                    } else {
                        f13 = bVar.Z + max;
                    }
                } else if (bVar.C) {
                    f13 = bVar.Z + max;
                } else {
                    i10 = rect.right;
                    f13 = i10;
                }
            } else {
                f13 = (width / 2.0f) + (bVar.Z / 2.0f);
            }
            rectF.right = Math.min(f13, rect.right);
            rectF.bottom = bVar.d() + rect.top;
            if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                float f14 = rectF.left;
                float f15 = this.f2812f0;
                rectF.left = f14 - f15;
                rectF.right += f15;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f2815i0);
                h hVar = (h) this.U;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
        }
        f10 = width / 2.0f;
        f11 = bVar.Z / 2.0f;
        f12 = f10 - f11;
        float max2 = Math.max(f12, rect.left);
        rectF = this.f2822p0;
        rectF.left = max2;
        rectF.top = rect.top;
        if (gravity == 17) {
        }
        f13 = (width / 2.0f) + (bVar.Z / 2.0f);
        rectF.right = Math.min(f13, rect.right);
        rectF.bottom = bVar.d() + rect.top;
        if (rectF.width() <= 0.0f) {
        }
    }

    public final void l(TextView textView, int i10) {
        boolean z9 = true;
        try {
            textView.setTextAppearance(i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z9 = false;
            }
        } catch (Exception unused) {
        }
        if (z9) {
            textView.setTextAppearance(msr.pistream.app.R.style.TextAppearance_AppCompat_Caption);
            textView.setTextColor(x.j.getColor(getContext(), msr.pistream.app.R.color.design_error));
        }
    }

    public final boolean m() {
        r rVar = this.A;
        if (rVar.o == 1 && rVar.f7522r != null && !TextUtils.isEmpty(rVar.f7520p)) {
            return true;
        }
        return false;
    }

    public final void n(Editable editable) {
        int i10;
        boolean z9;
        int i11;
        boolean z10;
        c cVar;
        ((e) this.E).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        boolean z11 = this.D;
        int i12 = this.C;
        String str = null;
        if (i12 == -1) {
            this.F.setText(String.valueOf(i10));
            this.F.setContentDescription(null);
            this.D = false;
        } else {
            if (i10 > i12) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.D = z9;
            Context context = getContext();
            i1 i1Var = this.F;
            int i13 = this.C;
            if (this.D) {
                i11 = msr.pistream.app.R.string.character_counter_overflowed_content_description;
            } else {
                i11 = msr.pistream.app.R.string.character_counter_content_description;
            }
            i1Var.setContentDescription(context.getString(i11, Integer.valueOf(i10), Integer.valueOf(i13)));
            if (z11 != this.D) {
                o();
            }
            String str2 = c.f3303d;
            Locale locale = Locale.getDefault();
            int i14 = e0.n.f3321a;
            if (e0.m.a(locale) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                cVar = c.f3306g;
            } else {
                cVar = c.f3305f;
            }
            i1 i1Var2 = this.F;
            String string = getContext().getString(msr.pistream.app.R.string.character_counter_pattern, Integer.valueOf(i10), Integer.valueOf(this.C));
            if (string == null) {
                cVar.getClass();
            } else {
                str = cVar.c(string, cVar.f3309c).toString();
            }
            i1Var2.setText(str);
        }
        if (this.f2807d != null && z11 != this.D) {
            t(false, false);
            w();
            q();
        }
    }

    public final void o() {
        int i10;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        i1 i1Var = this.F;
        if (i1Var != null) {
            if (this.D) {
                i10 = this.G;
            } else {
                i10 = this.H;
            }
            l(i1Var, i10);
            if (!this.D && (colorStateList2 = this.P) != null) {
                this.F.setTextColor(colorStateList2);
            }
            if (this.D && (colorStateList = this.Q) != null) {
                this.F.setTextColor(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.J0.g(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        int compoundPaddingTop;
        boolean z12;
        int compoundPaddingBottom;
        boolean z13;
        super.onLayout(z9, i10, i11, i12, i13);
        EditText editText = this.f2807d;
        if (editText != null) {
            ThreadLocal threadLocal = e6.c.f3573a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2820n0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = e6.c.f3573a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            e6.c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = e6.c.f3574b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f2804b0;
            if (gVar != null) {
                int i14 = rect.bottom;
                gVar.setBounds(rect.left, i14 - this.f2816j0, rect.right, i14);
            }
            g gVar2 = this.f2806c0;
            if (gVar2 != null) {
                int i15 = rect.bottom;
                gVar2.setBounds(rect.left, i15 - this.f2817k0, rect.right, i15);
            }
            if (this.R) {
                float textSize = this.f2807d.getTextSize();
                b bVar = this.J0;
                if (bVar.f3555h != textSize) {
                    bVar.f3555h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f2807d.getGravity();
                int i16 = (gravity & (-113)) | 48;
                if (bVar.f3554g != i16) {
                    bVar.f3554g = i16;
                    bVar.h(false);
                }
                if (bVar.f3552f != gravity) {
                    bVar.f3552f = gravity;
                    bVar.h(false);
                }
                if (this.f2807d != null) {
                    boolean J = a0.J(this);
                    int i17 = rect.bottom;
                    Rect rect2 = this.f2821o0;
                    rect2.bottom = i17;
                    int i18 = this.f2813g0;
                    if (i18 != 1) {
                        if (i18 != 2) {
                            rect2.left = g(rect.left, J);
                            rect2.top = getPaddingTop();
                            rect2.right = h(rect.right, J);
                        } else {
                            rect2.left = this.f2807d.getPaddingLeft() + rect.left;
                            rect2.top = rect.top - c();
                            rect2.right = rect.right - this.f2807d.getPaddingRight();
                        }
                    } else {
                        rect2.left = g(rect.left, J);
                        rect2.top = rect.top + this.f2814h0;
                        rect2.right = h(rect.right, J);
                    }
                    int i19 = rect2.left;
                    int i20 = rect2.top;
                    int i21 = rect2.right;
                    int i22 = rect2.bottom;
                    Rect rect3 = bVar.f3548d;
                    if (rect3.left == i19 && rect3.top == i20 && rect3.right == i21 && rect3.bottom == i22) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        rect3.set(i19, i20, i21, i22);
                        bVar.M = true;
                    }
                    if (this.f2807d != null) {
                        TextPaint textPaint = bVar.O;
                        textPaint.setTextSize(bVar.f3555h);
                        textPaint.setTypeface(bVar.f3567u);
                        textPaint.setLetterSpacing(bVar.W);
                        float f10 = -textPaint.ascent();
                        rect2.left = this.f2807d.getCompoundPaddingLeft() + rect.left;
                        if (this.f2813g0 == 1 && this.f2807d.getMinLines() <= 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            compoundPaddingTop = (int) (rect.centerY() - (f10 / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.f2807d.getCompoundPaddingTop();
                        }
                        rect2.top = compoundPaddingTop;
                        rect2.right = rect.right - this.f2807d.getCompoundPaddingRight();
                        if (this.f2813g0 == 1 && this.f2807d.getMinLines() <= 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            compoundPaddingBottom = (int) (rect2.top + f10);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.f2807d.getCompoundPaddingBottom();
                        }
                        rect2.bottom = compoundPaddingBottom;
                        int i23 = rect2.left;
                        int i24 = rect2.top;
                        int i25 = rect2.right;
                        Rect rect4 = bVar.f3546c;
                        if (rect4.left == i23 && rect4.top == i24 && rect4.right == i25 && rect4.bottom == compoundPaddingBottom) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (!z13) {
                            rect4.set(i23, i24, i25, compoundPaddingBottom);
                            bVar.M = true;
                        }
                        bVar.h(false);
                        if (e() && !this.I0) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z9;
        EditText editText;
        int max;
        super.onMeasure(i10, i11);
        EditText editText2 = this.f2807d;
        int i12 = 1;
        n nVar = this.f2805c;
        if (editText2 != null && this.f2807d.getMeasuredHeight() < (max = Math.max(nVar.getMeasuredHeight(), this.f2803b.getMeasuredHeight()))) {
            this.f2807d.setMinimumHeight(max);
            z9 = true;
        } else {
            z9 = false;
        }
        boolean p3 = p();
        if (z9 || p3) {
            this.f2807d.post(new w(this, i12));
        }
        if (this.K != null && (editText = this.f2807d) != null) {
            this.K.setGravity(editText.getGravity());
            this.K.setPadding(this.f2807d.getCompoundPaddingLeft(), this.f2807d.getCompoundPaddingTop(), this.f2807d.getCompoundPaddingRight(), this.f2807d.getCompoundPaddingBottom());
        }
        nVar.l();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        super.onRestoreInstanceState(zVar.f7897a);
        setError(zVar.f7554c);
        if (zVar.f7555d) {
            post(new w(this, 0));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z9 = true;
        if (i10 != 1) {
            z9 = false;
        }
        if (z9 != this.f2810e0) {
            j6.c cVar = this.f2808d0.f6220e;
            RectF rectF = this.f2822p0;
            float a10 = cVar.a(rectF);
            float a11 = this.f2808d0.f6221f.a(rectF);
            float a12 = this.f2808d0.f6223h.a(rectF);
            float a13 = this.f2808d0.f6222g.a(rectF);
            k kVar = this.f2808d0;
            r6.h0 h0Var = kVar.f6216a;
            j jVar = new j();
            r6.h0 h0Var2 = kVar.f6217b;
            jVar.f6204a = h0Var2;
            j.b(h0Var2);
            jVar.f6205b = h0Var;
            j.b(h0Var);
            r6.h0 h0Var3 = kVar.f6218c;
            jVar.f6207d = h0Var3;
            j.b(h0Var3);
            r6.h0 h0Var4 = kVar.f6219d;
            jVar.f6206c = h0Var4;
            j.b(h0Var4);
            jVar.f6208e = new j6.a(a11);
            jVar.f6209f = new j6.a(a10);
            jVar.f6211h = new j6.a(a13);
            jVar.f6210g = new j6.a(a12);
            k kVar2 = new k(jVar);
            this.f2810e0 = z9;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z9;
        z zVar = new z(super.onSaveInstanceState());
        if (m()) {
            zVar.f7554c = getError();
        }
        n nVar = this.f2805c;
        boolean z10 = true;
        if (nVar.f7495z != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9 || !nVar.f7493x.isChecked()) {
            z10 = false;
        }
        zVar.f7555d = z10;
        return zVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (r3.c() != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:
    
        if (r3.G != null) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.p():boolean");
    }

    public final void q() {
        Drawable background;
        i1 i1Var;
        PorterDuffColorFilter h10;
        EditText editText = this.f2807d;
        if (editText == null || this.f2813g0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = v1.f670a;
        Drawable mutate = background.mutate();
        if (m()) {
            int errorCurrentTextColors = getErrorCurrentTextColors();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = androidx.appcompat.widget.x.f697b;
            synchronized (androidx.appcompat.widget.x.class) {
                h10 = y2.h(errorCurrentTextColors, mode);
            }
            mutate.setColorFilter(h10);
            return;
        }
        if (this.D && (i1Var = this.F) != null) {
            mutate.setColorFilter(androidx.appcompat.widget.x.c(i1Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f2807d.refreshDrawableState();
        }
    }

    public final void r() {
        EditText editText = this.f2807d;
        if (editText != null && this.U != null) {
            if ((this.f2802a0 || editText.getBackground() == null) && this.f2813g0 != 0) {
                EditText editText2 = this.f2807d;
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                WeakHashMap weakHashMap = y0.f4277a;
                h0.q(editText2, editTextBoxBackground);
                this.f2802a0 = true;
            }
        }
    }

    public final void s() {
        if (this.f2813g0 != 1) {
            FrameLayout frameLayout = this.f2801a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c6 = c();
            if (c6 != layoutParams.topMargin) {
                layoutParams.topMargin = c6;
                frameLayout.requestLayout();
            }
        }
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.f2819m0 != i10) {
            this.f2819m0 = i10;
            this.D0 = i10;
            this.F0 = i10;
            this.G0 = i10;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        setBoxBackgroundColor(x.j.getColor(getContext(), i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.D0 = defaultColor;
        this.f2819m0 = defaultColor;
        this.E0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.F0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.G0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.f2813g0) {
            return;
        }
        this.f2813g0 = i10;
        if (this.f2807d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.f2814h0 = i10;
    }

    public void setBoxCornerFamily(int i10) {
        k kVar = this.f2808d0;
        kVar.getClass();
        j jVar = new j(kVar);
        j6.c cVar = this.f2808d0.f6220e;
        r6.h0 m5 = a0.m(i10);
        jVar.f6204a = m5;
        j.b(m5);
        jVar.f6208e = cVar;
        j6.c cVar2 = this.f2808d0.f6221f;
        r6.h0 m9 = a0.m(i10);
        jVar.f6205b = m9;
        j.b(m9);
        jVar.f6209f = cVar2;
        j6.c cVar3 = this.f2808d0.f6223h;
        r6.h0 m10 = a0.m(i10);
        jVar.f6207d = m10;
        j.b(m10);
        jVar.f6211h = cVar3;
        j6.c cVar4 = this.f2808d0.f6222g;
        r6.h0 m11 = a0.m(i10);
        jVar.f6206c = m11;
        j.b(m11);
        jVar.f6210g = cVar4;
        this.f2808d0 = new k(jVar);
        b();
    }

    public void setBoxStrokeColor(int i10) {
        if (this.B0 != i10) {
            this.B0 = i10;
            w();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2835z0 = colorStateList.getDefaultColor();
            this.H0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.A0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.B0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.B0 != colorStateList.getDefaultColor()) {
            this.B0 = colorStateList.getDefaultColor();
        }
        w();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.C0 != colorStateList) {
            this.C0 = colorStateList;
            w();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.f2816j0 = i10;
        w();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.f2817k0 = i10;
        w();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z9) {
        if (this.B != z9) {
            Editable editable = null;
            r rVar = this.A;
            if (z9) {
                i1 i1Var = new i1(getContext(), null);
                this.F = i1Var;
                i1Var.setId(msr.pistream.app.R.id.textinput_counter);
                Typeface typeface = this.f2823q0;
                if (typeface != null) {
                    this.F.setTypeface(typeface);
                }
                this.F.setMaxLines(1);
                rVar.a(this.F, 2);
                g0.m.h((ViewGroup.MarginLayoutParams) this.F.getLayoutParams(), getResources().getDimensionPixelOffset(msr.pistream.app.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.F != null) {
                    EditText editText = this.f2807d;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                rVar.g(this.F, 2);
                this.F = null;
            }
            this.B = z9;
        }
    }

    public void setCounterMaxLength(int i10) {
        Editable text;
        if (this.C != i10) {
            if (i10 > 0) {
                this.C = i10;
            } else {
                this.C = -1;
            }
            if (this.B && this.F != null) {
                EditText editText = this.f2807d;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                n(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.G != i10) {
            this.G = i10;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.Q != colorStateList) {
            this.Q = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.H != i10) {
            this.H = i10;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            o();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2831x0 = colorStateList;
        this.f2833y0 = colorStateList;
        if (this.f2807d != null) {
            t(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        k(this, z9);
        super.setEnabled(z9);
    }

    public void setEndIconActivated(boolean z9) {
        this.f2805c.f7493x.setActivated(z9);
    }

    public void setEndIconCheckable(boolean z9) {
        this.f2805c.f7493x.setCheckable(z9);
    }

    public void setEndIconContentDescription(int i10) {
        n nVar = this.f2805c;
        CharSequence text = i10 != 0 ? nVar.getResources().getText(i10) : null;
        CheckableImageButton checkableImageButton = nVar.f7493x;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i10) {
        n nVar = this.f2805c;
        Drawable G = i10 != 0 ? w7.b.G(nVar.getContext(), i10) : null;
        CheckableImageButton checkableImageButton = nVar.f7493x;
        checkableImageButton.setImageDrawable(G);
        if (G != null) {
            ColorStateList colorStateList = nVar.B;
            PorterDuff.Mode mode = nVar.C;
            TextInputLayout textInputLayout = nVar.f7487a;
            a0.b(textInputLayout, checkableImageButton, colorStateList, mode);
            a0.T(textInputLayout, checkableImageButton, nVar.B);
        }
    }

    public void setEndIconMinSize(int i10) {
        n nVar = this.f2805c;
        if (i10 >= 0) {
            if (i10 != nVar.D) {
                nVar.D = i10;
                CheckableImageButton checkableImageButton = nVar.f7493x;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                CheckableImageButton checkableImageButton2 = nVar.f7489c;
                checkableImageButton2.setMinimumWidth(i10);
                checkableImageButton2.setMinimumHeight(i10);
                return;
            }
            return;
        }
        nVar.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i10) {
        this.f2805c.f(i10);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        n nVar = this.f2805c;
        View.OnLongClickListener onLongClickListener = nVar.F;
        CheckableImageButton checkableImageButton = nVar.f7493x;
        checkableImageButton.setOnClickListener(onClickListener);
        a0.U(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n nVar = this.f2805c;
        nVar.F = onLongClickListener;
        CheckableImageButton checkableImageButton = nVar.f7493x;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0.U(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        n nVar = this.f2805c;
        nVar.E = scaleType;
        nVar.f7493x.setScaleType(scaleType);
        nVar.f7489c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        n nVar = this.f2805c;
        if (nVar.B != colorStateList) {
            nVar.B = colorStateList;
            a0.b(nVar.f7487a, nVar.f7493x, colorStateList, nVar.C);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        n nVar = this.f2805c;
        if (nVar.C != mode) {
            nVar.C = mode;
            a0.b(nVar.f7487a, nVar.f7493x, nVar.B, mode);
        }
    }

    public void setEndIconVisible(boolean z9) {
        this.f2805c.g(z9);
    }

    public void setError(CharSequence charSequence) {
        r rVar = this.A;
        if (!rVar.f7521q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            rVar.c();
            rVar.f7520p = charSequence;
            rVar.f7522r.setText(charSequence);
            int i10 = rVar.f7519n;
            if (i10 != 1) {
                rVar.o = 1;
            }
            rVar.i(i10, rVar.o, rVar.h(rVar.f7522r, charSequence));
            return;
        }
        rVar.f();
    }

    public void setErrorAccessibilityLiveRegion(int i10) {
        r rVar = this.A;
        rVar.f7524t = i10;
        i1 i1Var = rVar.f7522r;
        if (i1Var != null) {
            WeakHashMap weakHashMap = y0.f4277a;
            k0.f(i1Var, i10);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        r rVar = this.A;
        rVar.f7523s = charSequence;
        i1 i1Var = rVar.f7522r;
        if (i1Var != null) {
            i1Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z9) {
        r rVar = this.A;
        if (rVar.f7521q != z9) {
            rVar.c();
            TextInputLayout textInputLayout = rVar.f7513h;
            if (z9) {
                i1 i1Var = new i1(rVar.f7512g, null);
                rVar.f7522r = i1Var;
                i1Var.setId(msr.pistream.app.R.id.textinput_error);
                rVar.f7522r.setTextAlignment(5);
                Typeface typeface = rVar.B;
                if (typeface != null) {
                    rVar.f7522r.setTypeface(typeface);
                }
                int i10 = rVar.f7525u;
                rVar.f7525u = i10;
                i1 i1Var2 = rVar.f7522r;
                if (i1Var2 != null) {
                    textInputLayout.l(i1Var2, i10);
                }
                ColorStateList colorStateList = rVar.f7526v;
                rVar.f7526v = colorStateList;
                i1 i1Var3 = rVar.f7522r;
                if (i1Var3 != null && colorStateList != null) {
                    i1Var3.setTextColor(colorStateList);
                }
                CharSequence charSequence = rVar.f7523s;
                rVar.f7523s = charSequence;
                i1 i1Var4 = rVar.f7522r;
                if (i1Var4 != null) {
                    i1Var4.setContentDescription(charSequence);
                }
                int i11 = rVar.f7524t;
                rVar.f7524t = i11;
                i1 i1Var5 = rVar.f7522r;
                if (i1Var5 != null) {
                    WeakHashMap weakHashMap = y0.f4277a;
                    k0.f(i1Var5, i11);
                }
                rVar.f7522r.setVisibility(4);
                rVar.a(rVar.f7522r, 0);
            } else {
                rVar.f();
                rVar.g(rVar.f7522r, 0);
                rVar.f7522r = null;
                textInputLayout.q();
                textInputLayout.w();
            }
            rVar.f7521q = z9;
        }
    }

    public void setErrorIconDrawable(int i10) {
        n nVar = this.f2805c;
        nVar.h(i10 != 0 ? w7.b.G(nVar.getContext(), i10) : null);
        a0.T(nVar.f7487a, nVar.f7489c, nVar.f7490d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        n nVar = this.f2805c;
        CheckableImageButton checkableImageButton = nVar.f7489c;
        View.OnLongClickListener onLongClickListener = nVar.f7492f;
        checkableImageButton.setOnClickListener(onClickListener);
        a0.U(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        n nVar = this.f2805c;
        nVar.f7492f = onLongClickListener;
        CheckableImageButton checkableImageButton = nVar.f7489c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0.U(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        n nVar = this.f2805c;
        if (nVar.f7490d != colorStateList) {
            nVar.f7490d = colorStateList;
            a0.b(nVar.f7487a, nVar.f7489c, colorStateList, nVar.f7491e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        n nVar = this.f2805c;
        if (nVar.f7491e != mode) {
            nVar.f7491e = mode;
            a0.b(nVar.f7487a, nVar.f7489c, nVar.f7490d, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        r rVar = this.A;
        rVar.f7525u = i10;
        i1 i1Var = rVar.f7522r;
        if (i1Var != null) {
            rVar.f7513h.l(i1Var, i10);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        r rVar = this.A;
        rVar.f7526v = colorStateList;
        i1 i1Var = rVar.f7522r;
        if (i1Var != null && colorStateList != null) {
            i1Var.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z9) {
        if (this.K0 != z9) {
            this.K0 = z9;
            t(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        r rVar = this.A;
        if (isEmpty) {
            if (rVar.f7528x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!rVar.f7528x) {
            setHelperTextEnabled(true);
        }
        rVar.c();
        rVar.f7527w = charSequence;
        rVar.f7529y.setText(charSequence);
        int i10 = rVar.f7519n;
        if (i10 != 2) {
            rVar.o = 2;
        }
        rVar.i(i10, rVar.o, rVar.h(rVar.f7529y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        r rVar = this.A;
        rVar.A = colorStateList;
        i1 i1Var = rVar.f7529y;
        if (i1Var != null && colorStateList != null) {
            i1Var.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z9) {
        r rVar = this.A;
        if (rVar.f7528x != z9) {
            rVar.c();
            if (z9) {
                i1 i1Var = new i1(rVar.f7512g, null);
                rVar.f7529y = i1Var;
                i1Var.setId(msr.pistream.app.R.id.textinput_helper_text);
                rVar.f7529y.setTextAlignment(5);
                Typeface typeface = rVar.B;
                if (typeface != null) {
                    rVar.f7529y.setTypeface(typeface);
                }
                rVar.f7529y.setVisibility(4);
                k0.f(rVar.f7529y, 1);
                int i10 = rVar.f7530z;
                rVar.f7530z = i10;
                i1 i1Var2 = rVar.f7529y;
                if (i1Var2 != null) {
                    i1Var2.setTextAppearance(i10);
                }
                ColorStateList colorStateList = rVar.A;
                rVar.A = colorStateList;
                i1 i1Var3 = rVar.f7529y;
                if (i1Var3 != null && colorStateList != null) {
                    i1Var3.setTextColor(colorStateList);
                }
                rVar.a(rVar.f7529y, 1);
                rVar.f7529y.setAccessibilityDelegate(new q(rVar));
            } else {
                rVar.c();
                int i11 = rVar.f7519n;
                if (i11 == 2) {
                    rVar.o = 0;
                }
                rVar.i(i11, rVar.o, rVar.h(rVar.f7529y, ""));
                rVar.g(rVar.f7529y, 1);
                rVar.f7529y = null;
                TextInputLayout textInputLayout = rVar.f7513h;
                textInputLayout.q();
                textInputLayout.w();
            }
            rVar.f7528x = z9;
        }
    }

    public void setHelperTextTextAppearance(int i10) {
        r rVar = this.A;
        rVar.f7530z = i10;
        i1 i1Var = rVar.f7529y;
        if (i1Var != null) {
            i1Var.setTextAppearance(i10);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.R) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z9) {
        this.L0 = z9;
    }

    public void setHintEnabled(boolean z9) {
        if (z9 != this.R) {
            this.R = z9;
            if (!z9) {
                this.T = false;
                if (!TextUtils.isEmpty(this.S) && TextUtils.isEmpty(this.f2807d.getHint())) {
                    this.f2807d.setHint(this.S);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f2807d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.S)) {
                        setHint(hint);
                    }
                    this.f2807d.setHint((CharSequence) null);
                }
                this.T = true;
            }
            if (this.f2807d != null) {
                s();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        b bVar = this.J0;
        View view = bVar.f3542a;
        d dVar = new d(view.getContext(), i10);
        ColorStateList colorStateList = dVar.f4479j;
        if (colorStateList != null) {
            bVar.f3558k = colorStateList;
        }
        float f10 = dVar.f4480k;
        if (f10 != 0.0f) {
            bVar.f3556i = f10;
        }
        ColorStateList colorStateList2 = dVar.f4470a;
        if (colorStateList2 != null) {
            bVar.U = colorStateList2;
        }
        bVar.S = dVar.f4474e;
        bVar.T = dVar.f4475f;
        bVar.R = dVar.f4476g;
        bVar.V = dVar.f4478i;
        g6.a aVar = bVar.f3571y;
        if (aVar != null) {
            aVar.f4463w = true;
        }
        k3.d dVar2 = new k3.d(bVar, 23);
        dVar.a();
        bVar.f3571y = new g6.a(dVar2, dVar.f4483n);
        dVar.c(view.getContext(), bVar.f3571y);
        bVar.h(false);
        this.f2833y0 = bVar.f3558k;
        if (this.f2807d != null) {
            t(false, false);
            s();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2833y0 != colorStateList) {
            if (this.f2831x0 == null) {
                b bVar = this.J0;
                if (bVar.f3558k != colorStateList) {
                    bVar.f3558k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f2833y0 = colorStateList;
            if (this.f2807d != null) {
                t(false, false);
            }
        }
    }

    public void setLengthCounter(y yVar) {
        this.E = yVar;
    }

    public void setMaxEms(int i10) {
        this.f2830x = i10;
        EditText editText = this.f2807d;
        if (editText != null && i10 != -1) {
            editText.setMaxEms(i10);
        }
    }

    public void setMaxWidth(int i10) {
        this.f2834z = i10;
        EditText editText = this.f2807d;
        if (editText != null && i10 != -1) {
            editText.setMaxWidth(i10);
        }
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.f2811f = i10;
        EditText editText = this.f2807d;
        if (editText != null && i10 != -1) {
            editText.setMinEms(i10);
        }
    }

    public void setMinWidth(int i10) {
        this.f2832y = i10;
        EditText editText = this.f2807d;
        if (editText != null && i10 != -1) {
            editText.setMinWidth(i10);
        }
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        n nVar = this.f2805c;
        nVar.f7493x.setContentDescription(i10 != 0 ? nVar.getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        n nVar = this.f2805c;
        nVar.f7493x.setImageDrawable(i10 != 0 ? w7.b.G(nVar.getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z9) {
        n nVar = this.f2805c;
        if (z9 && nVar.f7495z != 1) {
            nVar.f(1);
        } else if (!z9) {
            nVar.f(0);
        } else {
            nVar.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        n nVar = this.f2805c;
        nVar.B = colorStateList;
        a0.b(nVar.f7487a, nVar.f7493x, colorStateList, nVar.C);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        n nVar = this.f2805c;
        nVar.C = mode;
        a0.b(nVar.f7487a, nVar.f7493x, nVar.B, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.K == null) {
            i1 i1Var = new i1(getContext(), null);
            this.K = i1Var;
            i1Var.setId(msr.pistream.app.R.id.textinput_placeholder);
            h0.s(this.K, 2);
            i d10 = d();
            this.N = d10;
            d10.f9179b = 67L;
            this.O = d();
            setPlaceholderTextAppearance(this.M);
            setPlaceholderTextColor(this.L);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.J) {
                setPlaceholderTextEnabled(true);
            }
            this.I = charSequence;
        }
        EditText editText = this.f2807d;
        if (editText != null) {
            editable = editText.getText();
        }
        u(editable);
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.M = i10;
        i1 i1Var = this.K;
        if (i1Var != null) {
            i1Var.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            i1 i1Var = this.K;
            if (i1Var != null && colorStateList != null) {
                i1Var.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        v vVar = this.f2803b;
        vVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        vVar.f7544c = charSequence2;
        vVar.f7543b.setText(charSequence);
        vVar.d();
    }

    public void setPrefixTextAppearance(int i10) {
        this.f2803b.f7543b.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2803b.f7543b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.U;
        if (gVar != null && gVar.f6194a.f6174a != kVar) {
            this.f2808d0 = kVar;
            b();
        }
    }

    public void setStartIconCheckable(boolean z9) {
        this.f2803b.f7545d.setCheckable(z9);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2803b.f7545d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? w7.b.G(getContext(), i10) : null);
    }

    public void setStartIconMinSize(int i10) {
        v vVar = this.f2803b;
        if (i10 >= 0) {
            if (i10 != vVar.f7548x) {
                vVar.f7548x = i10;
                CheckableImageButton checkableImageButton = vVar.f7545d;
                checkableImageButton.setMinimumWidth(i10);
                checkableImageButton.setMinimumHeight(i10);
                return;
            }
            return;
        }
        vVar.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        v vVar = this.f2803b;
        View.OnLongClickListener onLongClickListener = vVar.f7550z;
        CheckableImageButton checkableImageButton = vVar.f7545d;
        checkableImageButton.setOnClickListener(onClickListener);
        a0.U(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        v vVar = this.f2803b;
        vVar.f7550z = onLongClickListener;
        CheckableImageButton checkableImageButton = vVar.f7545d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a0.U(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        v vVar = this.f2803b;
        vVar.f7549y = scaleType;
        vVar.f7545d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        v vVar = this.f2803b;
        if (vVar.f7546e != colorStateList) {
            vVar.f7546e = colorStateList;
            a0.b(vVar.f7542a, vVar.f7545d, colorStateList, vVar.f7547f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        v vVar = this.f2803b;
        if (vVar.f7547f != mode) {
            vVar.f7547f = mode;
            a0.b(vVar.f7542a, vVar.f7545d, vVar.f7546e, mode);
        }
    }

    public void setStartIconVisible(boolean z9) {
        this.f2803b.b(z9);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        n nVar = this.f2805c;
        nVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        nVar.G = charSequence2;
        nVar.H.setText(charSequence);
        nVar.m();
    }

    public void setSuffixTextAppearance(int i10) {
        this.f2805c.H.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2805c.H.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(x xVar) {
        EditText editText = this.f2807d;
        if (editText != null) {
            y0.l(editText, xVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2823q0) {
            this.f2823q0 = typeface;
            this.J0.m(typeface);
            r rVar = this.A;
            if (typeface != rVar.B) {
                rVar.B = typeface;
                i1 i1Var = rVar.f7522r;
                if (i1Var != null) {
                    i1Var.setTypeface(typeface);
                }
                i1 i1Var2 = rVar.f7529y;
                if (i1Var2 != null) {
                    i1Var2.setTypeface(typeface);
                }
            }
            i1 i1Var3 = this.F;
            if (i1Var3 != null) {
                i1Var3.setTypeface(typeface);
            }
        }
    }

    public final void t(boolean z9, boolean z10) {
        boolean z11;
        boolean z12;
        ColorStateList colorStateList;
        i1 i1Var;
        ColorStateList colorStateList2;
        int i10;
        boolean isEnabled = isEnabled();
        EditText editText = this.f2807d;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z11 = true;
        } else {
            z11 = false;
        }
        EditText editText2 = this.f2807d;
        if (editText2 != null && editText2.hasFocus()) {
            z12 = true;
        } else {
            z12 = false;
        }
        ColorStateList colorStateList3 = this.f2831x0;
        b bVar = this.J0;
        if (colorStateList3 != null) {
            bVar.i(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f2831x0;
            if (colorStateList4 != null) {
                i10 = colorStateList4.getColorForState(new int[]{-16842910}, this.H0);
            } else {
                i10 = this.H0;
            }
            bVar.i(ColorStateList.valueOf(i10));
        } else if (m()) {
            i1 i1Var2 = this.A.f7522r;
            if (i1Var2 != null) {
                colorStateList2 = i1Var2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            bVar.i(colorStateList2);
        } else if (this.D && (i1Var = this.F) != null) {
            bVar.i(i1Var.getTextColors());
        } else if (z12 && (colorStateList = this.f2833y0) != null && bVar.f3558k != colorStateList) {
            bVar.f3558k = colorStateList;
            bVar.h(false);
        }
        n nVar = this.f2805c;
        v vVar = this.f2803b;
        if (!z11 && this.K0 && (!isEnabled() || !z12)) {
            if (z10 || !this.I0) {
                ValueAnimator valueAnimator = this.M0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.M0.cancel();
                }
                if (z9 && this.L0) {
                    a(0.0f);
                } else {
                    bVar.k(0.0f);
                }
                if (e() && (!((h) this.U).O.f7469v.isEmpty()) && e()) {
                    ((h) this.U).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.I0 = true;
                i1 i1Var3 = this.K;
                if (i1Var3 != null && this.J) {
                    i1Var3.setText((CharSequence) null);
                    q3.v.a(this.f2801a, this.O);
                    this.K.setVisibility(4);
                }
                vVar.A = true;
                vVar.d();
                nVar.I = true;
                nVar.m();
                return;
            }
            return;
        }
        if (z10 || this.I0) {
            ValueAnimator valueAnimator2 = this.M0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.M0.cancel();
            }
            if (z9 && this.L0) {
                a(1.0f);
            } else {
                bVar.k(1.0f);
            }
            this.I0 = false;
            if (e()) {
                j();
            }
            EditText editText3 = this.f2807d;
            if (editText3 != null) {
                editable = editText3.getText();
            }
            u(editable);
            vVar.A = false;
            vVar.d();
            nVar.I = false;
            nVar.m();
        }
    }

    public final void u(Editable editable) {
        int i10;
        ((e) this.E).getClass();
        if (editable != null) {
            i10 = editable.length();
        } else {
            i10 = 0;
        }
        FrameLayout frameLayout = this.f2801a;
        if (i10 == 0 && !this.I0) {
            if (this.K != null && this.J && !TextUtils.isEmpty(this.I)) {
                this.K.setText(this.I);
                q3.v.a(frameLayout, this.N);
                this.K.setVisibility(0);
                this.K.bringToFront();
                announceForAccessibility(this.I);
                return;
            }
            return;
        }
        i1 i1Var = this.K;
        if (i1Var != null && this.J) {
            i1Var.setText((CharSequence) null);
            q3.v.a(frameLayout, this.O);
            this.K.setVisibility(4);
        }
    }

    public final void v(boolean z9, boolean z10) {
        int defaultColor = this.C0.getDefaultColor();
        int colorForState = this.C0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.C0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z9) {
            this.f2818l0 = colorForState2;
        } else if (z10) {
            this.f2818l0 = colorForState;
        } else {
            this.f2818l0 = defaultColor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.w():void");
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2803b.a(drawable);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2805c.f7493x.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2805c.f7493x.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2805c.h(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2805c.f7493x;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        n nVar = this.f2805c;
        CheckableImageButton checkableImageButton = nVar.f7493x;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = nVar.B;
            PorterDuff.Mode mode = nVar.C;
            TextInputLayout textInputLayout = nVar.f7487a;
            a0.b(textInputLayout, checkableImageButton, colorStateList, mode);
            a0.T(textInputLayout, checkableImageButton, nVar.B);
        }
    }
}
