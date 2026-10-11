package f6;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.i0;
import p7.a0;
import q6.g;
import w7.b;

/* loaded from: classes.dex */
public final class a extends i0 {

    /* renamed from: x, reason: collision with root package name */
    public static final int[][] f3931x = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f3932e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3933f;

    public a(Context context, AttributeSet attributeSet) {
        super(b.Z(context, attributeSet, msr.pistream.app.R.attr.radioButtonStyle, msr.pistream.app.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray N = b.N(context2, attributeSet, s5.a.f9913n, msr.pistream.app.R.attr.radioButtonStyle, msr.pistream.app.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (N.hasValue(0)) {
            k0.b.c(this, a0.u(context2, N, 0));
        }
        this.f3933f = N.getBoolean(1, false);
        N.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3932e == null) {
            int B = g.B(this, msr.pistream.app.R.attr.colorControlActivated);
            int B2 = g.B(this, msr.pistream.app.R.attr.colorOnSurface);
            int B3 = g.B(this, msr.pistream.app.R.attr.colorSurface);
            this.f3932e = new ColorStateList(f3931x, new int[]{g.F(1.0f, B3, B), g.F(0.54f, B3, B2), g.F(0.38f, B3, B2), g.F(0.38f, B3, B2)});
        }
        return this.f3932e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3933f && k0.b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.f3933f = z9;
        if (z9) {
            k0.b.c(this, getMaterialThemeColorsTintList());
        } else {
            k0.b.c(this, null);
        }
    }
}
