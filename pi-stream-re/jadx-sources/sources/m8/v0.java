package m8;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f7722a;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f7723b;

    static {
        int i10 = w8.i.f11065e;
        f7722a = new int[]{-1, -5317, -8978685, -15138817, -44462, -12285185, -21696, -45149, -5552196, -16777216, -6381922, i10};
        f7723b = new int[]{-16777216, -15066598, -15916736, -12776436, -15975142, -13759427, -13154481, i10};
    }

    public static LinearLayout a(Context context, String str, String str2, f8.d dVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, w8.i.e(context, 60));
        layoutParams.setMargins(0, w8.i.e(context, 4), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setPadding(w8.i.e(context, 4), 0, w8.i.e(context, 4), 0);
        linearLayout.setBackgroundResource(R.drawable.bg_search);
        linearLayout.setClickable(true);
        w8.i.d(linearLayout);
        a3.g.v(0, -2, 1.0f, linearLayout, w8.i.l(context, str, 16, -1, 1));
        TextView l10 = w8.i.l(context, str2, 15, w8.i.f11068h, 0);
        l10.setGravity(21);
        l10.setPadding(w8.i.e(context, 8), w8.i.e(context, 4), w8.i.e(context, 8), w8.i.e(context, 4));
        linearLayout.addView(l10, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.setOnClickListener(dVar);
        return linearLayout;
    }

    public static LinearLayout b(Context context, String str, int[] iArr, int i10, boolean z9, String str2, k0 k0Var, l0 l0Var) {
        String str3;
        int i11;
        int i12;
        int argb;
        int i13;
        int i14;
        int argb2;
        boolean z10;
        int i15;
        int[] iArr2 = iArr;
        LinearLayout linearLayout = new LinearLayout(context);
        int i16 = 1;
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i17 = 0;
        if (!str.isEmpty()) {
            layoutParams.setMargins(0, w8.i.e(context, 26), 0, 0);
        }
        linearLayout.setLayoutParams(layoutParams);
        if (!str.isEmpty()) {
            r.f.i(-1, -2, linearLayout, d(context, str));
        }
        GridLayout gridLayout = new GridLayout(context);
        gridLayout.setColumnCount(6);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, w8.i.e(context, 10), 0, 0);
        gridLayout.setLayoutParams(layoutParams2);
        linearLayout.addView(gridLayout);
        int length = iArr2.length;
        while (true) {
            str3 = "✓";
            if (i17 >= length) {
                break;
            }
            int i18 = iArr2[i17];
            if (!z9 && i18 == i10) {
                i14 = i16;
            } else {
                i14 = 0;
            }
            y.m mVar = new y.m(k0Var, i18, 5);
            FrameLayout frameLayout = new FrameLayout(context);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(i16);
            gradientDrawable.setColor(i18);
            if (i14 != 0) {
                i16 = 3;
            }
            int e10 = w8.i.e(context, i16);
            if (i14 != 0) {
                argb2 = w8.i.f11065e;
            } else {
                argb2 = Color.argb(70, 255, 255, 255);
            }
            gradientDrawable.setStroke(e10, argb2);
            frameLayout.setBackground(gradientDrawable);
            if (i14 != 0) {
                if (c(i18)) {
                    i15 = -1;
                } else {
                    i15 = -16777216;
                }
                z10 = true;
                TextView l10 = w8.i.l(context, "✓", 16, i15, 1);
                l10.setGravity(17);
                frameLayout.addView(l10, new FrameLayout.LayoutParams(-1, -1));
            } else {
                z10 = true;
            }
            frameLayout.setClickable(z10);
            w8.i.d(frameLayout);
            frameLayout.setOnClickListener(new j8.c(mVar, 5));
            GridLayout.LayoutParams layoutParams3 = new GridLayout.LayoutParams();
            layoutParams3.width = w8.i.e(context, 40);
            layoutParams3.height = w8.i.e(context, 40);
            layoutParams3.setMargins(w8.i.e(context, 6), w8.i.e(context, 6), w8.i.e(context, 6), w8.i.e(context, 6));
            gridLayout.addView(frameLayout, layoutParams3);
            i17++;
            i16 = 1;
            iArr2 = iArr;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        if (z9) {
            i11 = i10;
        } else {
            i11 = w8.i.f11064d;
        }
        gradientDrawable2.setColor(i11);
        if (z9) {
            i12 = 3;
        } else {
            i12 = 1;
        }
        int e11 = w8.i.e(context, i12);
        if (z9) {
            argb = w8.i.f11065e;
        } else {
            argb = Color.argb(90, 255, 255, 255);
        }
        gradientDrawable2.setStroke(e11, argb);
        frameLayout2.setBackground(gradientDrawable2);
        if (!z9) {
            str3 = "+";
        }
        if (z9) {
            if (c(i10)) {
                i13 = -1;
            } else {
                i13 = -16777216;
            }
        } else {
            i13 = w8.i.f11068h;
        }
        TextView l11 = w8.i.l(context, str3, 16, i13, 1);
        l11.setGravity(17);
        frameLayout2.addView(l11, new FrameLayout.LayoutParams(-1, -1));
        frameLayout2.setClickable(true);
        frameLayout2.setOnClickListener(new j8.c(l0Var, 4));
        GridLayout.LayoutParams layoutParams4 = new GridLayout.LayoutParams();
        layoutParams4.width = w8.i.e(context, 40);
        layoutParams4.height = w8.i.e(context, 40);
        layoutParams4.setMargins(w8.i.e(context, 6), w8.i.e(context, 6), w8.i.e(context, 6), w8.i.e(context, 6));
        gridLayout.addView(frameLayout2, layoutParams4);
        if (z9) {
            View l12 = w8.i.l(context, str2, 12, w8.i.f11068h, 0);
            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams5.setMargins(w8.i.e(context, 4), w8.i.e(context, 8), 0, 0);
            linearLayout.addView(l12, layoutParams5);
        }
        return linearLayout;
    }

    public static boolean c(int i10) {
        if ((Color.blue(i10) * 0.114d) + (Color.green(i10) * 0.587d) + (Color.red(i10) * 0.299d) < 140.0d) {
            return true;
        }
        return false;
    }

    public static TextView d(Context context, String str) {
        return w8.i.l(context, str, 16, -1, 1);
    }

    public static LinearLayout e(Context context, String str, int i10, int i11, int i12, m0 m0Var, String str2) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, w8.i.e(context, 4), 0, 0);
        linearLayout.setLayoutParams(layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, w8.i.e(context, 26)));
        TextView l10 = w8.i.l(context, str, 15, w8.i.f11065e, 1);
        linearLayout2.addView(l10, r.f.c(l10, 21, -1, -2));
        SeekBar seekBar = new SeekBar(context);
        seekBar.setFocusable(true);
        seekBar.setFocusableInTouchMode(false);
        seekBar.setMax(i11 - i10);
        seekBar.setProgress(i12 - i10);
        seekBar.setOnSeekBarChangeListener(new u0(i10, l10, str2, m0Var));
        linearLayout.addView(seekBar, new LinearLayout.LayoutParams(-1, w8.i.e(context, 40)));
        return linearLayout;
    }
}
