package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import g0.k0;
import g0.m2;
import g0.n0;
import g0.n2;
import g0.o1;
import g0.p1;
import g0.p2;
import g0.y0;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class n<S> extends androidx.fragment.app.q {
    public final LinkedHashSet C0;
    public final LinkedHashSet D0;
    public int E0;
    public u F0;
    public c G0;
    public k H0;
    public int I0;
    public CharSequence J0;
    public boolean K0;
    public int L0;
    public int M0;
    public CharSequence N0;
    public int O0;
    public CharSequence P0;
    public TextView Q0;
    public CheckableImageButton R0;
    public j6.g S0;
    public Button T0;
    public boolean U0;
    public CharSequence V0;
    public CharSequence W0;

    public n() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.C0 = new LinkedHashSet();
        this.D0 = new LinkedHashSet();
    }

    public static int Y(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar c6 = w.c();
        c6.set(5, 1);
        Calendar b10 = w.b(c6);
        b10.get(2);
        b10.get(1);
        int maximum = b10.getMaximum(7);
        b10.getActualMaximum(5);
        b10.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean Z(Context context) {
        return a0(context, android.R.attr.windowFullscreen);
    }

    public static boolean a0(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(q6.g.e0(context, k.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i10});
        boolean z9 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z9;
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.y
    public final void F(Bundle bundle) {
        p pVar;
        p e10;
        super.F(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.E0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        a aVar = new a(this.G0);
        k kVar = this.H0;
        if (kVar == null) {
            pVar = null;
        } else {
            pVar = kVar.f2733p0;
        }
        if (pVar != null) {
            aVar.f2706c = Long.valueOf(pVar.f2751f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", aVar.f2708e);
        p e11 = p.e(aVar.f2704a);
        p e12 = p.e(aVar.f2705b);
        b bVar = (b) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l10 = aVar.f2706c;
        if (l10 == null) {
            e10 = null;
        } else {
            e10 = p.e(l10.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new c(e11, e12, bVar, e10, aVar.f2707d));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.I0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.J0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.M0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.N0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.O0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.P0);
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.y
    public final void G() {
        u uVar;
        CharSequence charSequence;
        Integer num;
        boolean z9;
        int i10;
        boolean z10;
        j6.e m2Var;
        boolean z11;
        j6.e m2Var2;
        super.G();
        Window window = W().getWindow();
        boolean z12 = true;
        if (this.K0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.S0);
            if (!this.U0) {
                View findViewById = P().findViewById(R.id.fullscreen_header);
                if (findViewById.getBackground() instanceof ColorDrawable) {
                    num = Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor());
                } else {
                    num = null;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (num != null && num.intValue() != 0) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                int A = q6.g.A(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z9) {
                    num = Integer.valueOf(A);
                }
                Integer valueOf = Integer.valueOf(A);
                if (i11 >= 30) {
                    p1.a(window, false);
                } else {
                    o1.a(window, false);
                }
                window.getContext();
                Context context = window.getContext();
                if (i11 < 27) {
                    i10 = z.a.c(q6.g.A(context, android.R.attr.navigationBarColor, -16777216), 128);
                } else {
                    i10 = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i10);
                boolean E = q6.g.E(num.intValue());
                if (!q6.g.E(0) && !E) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                window.getDecorView();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    m2Var = new p2(window);
                } else if (i12 >= 26) {
                    m2Var = new n2(window);
                } else {
                    m2Var = new m2(window);
                }
                m2Var.y(z10);
                boolean E2 = q6.g.E(valueOf.intValue());
                if (!q6.g.E(i10) && (i10 != 0 || !E2)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                window.getDecorView();
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 30) {
                    m2Var2 = new p2(window);
                } else if (i13 >= 26) {
                    m2Var2 = new n2(window);
                } else {
                    m2Var2 = new m2(window);
                }
                m2Var2.x(z11);
                c.j jVar = new c.j(this, findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = y0.f4277a;
                n0.u(findViewById, jVar);
                this.U0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = O().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.S0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new b6.a(W(), rect));
        }
        O();
        int i14 = this.E0;
        if (i14 != 0) {
            X();
            c cVar = this.G0;
            k kVar = new k();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", i14);
            bundle.putParcelable("GRID_SELECTOR_KEY", null);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
            bundle.putParcelable("CURRENT_MONTH_KEY", cVar.f2712d);
            kVar.S(bundle);
            this.H0 = kVar;
            boolean isChecked = this.R0.isChecked();
            if (isChecked) {
                X();
                c cVar2 = this.G0;
                uVar = new o();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i14);
                bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", cVar2);
                uVar.S(bundle2);
            } else {
                uVar = this.H0;
            }
            this.F0 = uVar;
            TextView textView = this.Q0;
            if (isChecked) {
                if (O().getResources().getConfiguration().orientation != 2) {
                    z12 = false;
                }
                if (z12) {
                    charSequence = this.W0;
                    textView.setText(charSequence);
                    X();
                    k();
                    throw null;
                }
            }
            charSequence = this.V0;
            textView.setText(charSequence);
            X();
            k();
            throw null;
        }
        X();
        throw null;
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.y
    public final void H() {
        this.F0.f2765m0.clear();
        super.H();
    }

    @Override // androidx.fragment.app.q
    public final Dialog V() {
        Context O = O();
        O();
        int i10 = this.E0;
        if (i10 != 0) {
            Dialog dialog = new Dialog(O, i10);
            Context context = dialog.getContext();
            this.K0 = Z(context);
            int i11 = q6.g.e0(context, n.class.getCanonicalName(), R.attr.colorSurface).data;
            j6.g gVar = new j6.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
            this.S0 = gVar;
            gVar.h(context);
            this.S0.j(ColorStateList.valueOf(i11));
            j6.g gVar2 = this.S0;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = y0.f4277a;
            gVar2.i(n0.i(decorView));
            return dialog;
        }
        X();
        throw null;
    }

    public final void X() {
        a3.g.y(this.f1039f.getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // androidx.fragment.app.q, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.C0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.q, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.D0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.V;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.y
    public final void x(Bundle bundle) {
        super.x(bundle);
        if (bundle == null) {
            bundle = this.f1039f;
        }
        this.E0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        a3.g.y(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.G0 = (c) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        a3.g.y(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.I0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.J0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.L0 = bundle.getInt("INPUT_MODE_KEY");
        this.M0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.N0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.O0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.P0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.J0;
        if (charSequence == null) {
            charSequence = O().getResources().getText(this.I0);
        }
        this.V0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.W0 = charSequence;
    }

    @Override // androidx.fragment.app.y
    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i10;
        String string;
        if (this.K0) {
            i10 = R.layout.mtrl_picker_fullscreen;
        } else {
            i10 = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup);
        Context context = inflate.getContext();
        if (this.K0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(Y(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(Y(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = y0.f4277a;
        boolean z9 = true;
        k0.f(textView, 1);
        this.R0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.Q0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.R0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.R0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, w7.b.G(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], w7.b.G(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.R0;
        if (this.L0 == 0) {
            z9 = false;
        }
        checkableImageButton2.setChecked(z9);
        y0.l(this.R0, null);
        CheckableImageButton checkableImageButton3 = this.R0;
        if (checkableImageButton3.isChecked()) {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            string = checkableImageButton3.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.R0.setContentDescription(string);
        this.R0.setOnClickListener(new m(this));
        this.T0 = (Button) inflate.findViewById(R.id.confirm_button);
        X();
        throw null;
    }
}
