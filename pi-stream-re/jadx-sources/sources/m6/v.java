package m6;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.i1;
import androidx.appcompat.widget.o3;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import g0.i0;
import g0.k0;
import g0.y0;
import java.util.WeakHashMap;
import msr.pistream.app.R;
import p7.a0;

/* loaded from: classes.dex */
public final class v extends LinearLayout {
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f7542a;

    /* renamed from: b, reason: collision with root package name */
    public final i1 f7543b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f7544c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f7545d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f7546e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f7547f;

    /* renamed from: x, reason: collision with root package name */
    public int f7548x;

    /* renamed from: y, reason: collision with root package name */
    public ImageView.ScaleType f7549y;

    /* renamed from: z, reason: collision with root package name */
    public View.OnLongClickListener f7550z;

    public v(TextInputLayout textInputLayout, o3 o3Var) {
        super(textInputLayout.getContext());
        CharSequence k10;
        this.f7542a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f7545d = checkableImageButton;
        i1 i1Var = new i1(getContext(), null);
        this.f7543b = i1Var;
        if (a0.I(getContext())) {
            g0.m.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f7550z;
        checkableImageButton.setOnClickListener(null);
        a0.U(checkableImageButton, onLongClickListener);
        this.f7550z = null;
        checkableImageButton.setOnLongClickListener(null);
        a0.U(checkableImageButton, null);
        if (o3Var.l(67)) {
            this.f7546e = a0.v(getContext(), o3Var, 67);
        }
        if (o3Var.l(68)) {
            this.f7547f = a0.Q(o3Var.h(68, -1), null);
        }
        if (o3Var.l(64)) {
            a(o3Var.e(64));
            if (o3Var.l(63) && checkableImageButton.getContentDescription() != (k10 = o3Var.k(63))) {
                checkableImageButton.setContentDescription(k10);
            }
            checkableImageButton.setCheckable(o3Var.a(62, true));
        }
        int d10 = o3Var.d(65, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (d10 >= 0) {
            if (d10 != this.f7548x) {
                this.f7548x = d10;
                checkableImageButton.setMinimumWidth(d10);
                checkableImageButton.setMinimumHeight(d10);
            }
            if (o3Var.l(66)) {
                ImageView.ScaleType i10 = a0.i(o3Var.h(66, -1));
                this.f7549y = i10;
                checkableImageButton.setScaleType(i10);
            }
            i1Var.setVisibility(8);
            i1Var.setId(R.id.textinput_prefix_text);
            i1Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = y0.f4277a;
            k0.f(i1Var, 1);
            i1Var.setTextAppearance(o3Var.i(58, 0));
            if (o3Var.l(59)) {
                i1Var.setTextColor(o3Var.b(59));
            }
            CharSequence k11 = o3Var.k(57);
            this.f7544c = TextUtils.isEmpty(k11) ? null : k11;
            i1Var.setText(k11);
            d();
            addView(checkableImageButton);
            addView(i1Var);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final void a(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f7545d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f7546e;
            PorterDuff.Mode mode = this.f7547f;
            TextInputLayout textInputLayout = this.f7542a;
            a0.b(textInputLayout, checkableImageButton, colorStateList, mode);
            b(true);
            a0.T(textInputLayout, checkableImageButton, this.f7546e);
            return;
        }
        b(false);
        View.OnLongClickListener onLongClickListener = this.f7550z;
        checkableImageButton.setOnClickListener(null);
        a0.U(checkableImageButton, onLongClickListener);
        this.f7550z = null;
        checkableImageButton.setOnLongClickListener(null);
        a0.U(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void b(boolean z9) {
        boolean z10;
        CheckableImageButton checkableImageButton = this.f7545d;
        int i10 = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != z9) {
            if (!z9) {
                i10 = 8;
            }
            checkableImageButton.setVisibility(i10);
            c();
            d();
        }
    }

    public final void c() {
        boolean z9;
        EditText editText = this.f7542a.f2807d;
        if (editText == null) {
            return;
        }
        int i10 = 0;
        if (this.f7545d.getVisibility() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            WeakHashMap weakHashMap = y0.f4277a;
            i10 = i0.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = y0.f4277a;
        i0.k(this.f7543b, i10, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void d() {
        int i10;
        boolean z9;
        int i11 = 8;
        if (this.f7544c != null && !this.A) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        if (this.f7545d.getVisibility() != 0 && i10 != 0) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            i11 = 0;
        }
        setVisibility(i11);
        this.f7543b.setVisibility(i10);
        this.f7542a.p();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        c();
    }
}
