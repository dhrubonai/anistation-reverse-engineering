package w8;

import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11061a = Color.rgb(24, 26, 32);

    /* renamed from: b, reason: collision with root package name */
    public static final int f11062b = Color.rgb(10, 10, 13);

    /* renamed from: c, reason: collision with root package name */
    public static final int f11063c = Color.rgb(31, 34, 42);

    /* renamed from: d, reason: collision with root package name */
    public static final int f11064d = Color.rgb(43, 45, 55);

    /* renamed from: e, reason: collision with root package name */
    public static final int f11065e = Color.rgb(14, 165, 233);

    /* renamed from: f, reason: collision with root package name */
    public static final int f11066f = Color.rgb(14, 165, 233);

    /* renamed from: g, reason: collision with root package name */
    public static final int f11067g = Color.rgb(212, 211, 220);

    /* renamed from: h, reason: collision with root package name */
    public static final int f11068h = Color.rgb(137, 142, 154);

    /* renamed from: i, reason: collision with root package name */
    public static final int f11069i = Color.argb(70, 14, 165, 233);

    /* renamed from: j, reason: collision with root package name */
    public static final int f11070j = Color.argb(38, 14, 165, 233);

    public static void a(FrameLayout frameLayout) {
        frameLayout.setDefaultFocusHighlightEnabled(false);
        frameLayout.setFocusable(true);
        frameLayout.setFocusableInTouchMode(false);
        frameLayout.setOnFocusChangeListener(new g());
    }

    public static void b(final TextView textView) {
        textView.setDefaultFocusHighlightEnabled(false);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(false);
        final int currentTextColor = textView.getCurrentTextColor();
        textView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: w8.h
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z9) {
                int i10;
                if (z9) {
                    i10 = i.f11065e;
                } else {
                    i10 = currentTextColor;
                }
                textView.setTextColor(i10);
            }
        });
    }

    public static void c(ImageView imageView) {
        imageView.setDefaultFocusHighlightEnabled(false);
        imageView.setFocusable(true);
        imageView.setFocusableInTouchMode(false);
        imageView.setOnFocusChangeListener(new m6.b(imageView, 3));
    }

    public static void d(View view) {
        view.setDefaultFocusHighlightEnabled(false);
        view.setFocusable(true);
        view.setFocusableInTouchMode(false);
        Context context = view.getContext();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(e(context, 100));
        gradientDrawable.setStroke(e(context, 2), -1);
        view.setOnFocusChangeListener(new m6.b(gradientDrawable, 2));
    }

    public static int e(Context context, int i10) {
        return Math.round(i10 * context.getResources().getDisplayMetrics().density);
    }

    public static boolean f(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return true;
        }
        return false;
    }

    public static View g(Context context) {
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, e(context, 3)));
        view.setBackground(j(f11065e, 0.0f));
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.2f, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new e(view, 1));
        view.addOnAttachStateChangeListener(new f(ofFloat, 1));
        if (view.isAttachedToWindow()) {
            ofFloat.start();
        }
        return view;
    }

    public static g8.c h(Context context, int i10) {
        int e10 = e(context, i10);
        g8.c cVar = new g8.c(context);
        cVar.setLayoutParams(new ViewGroup.LayoutParams(e10, e10));
        return cVar;
    }

    public static TextView i(Context context, String str, boolean z9) {
        int i10;
        if (z9) {
            i10 = -1;
        } else {
            i10 = f11067g;
        }
        TextView l10 = l(context, str, 14, i10, 1);
        l10.setGravity(17);
        l10.setPadding(e(context, 16), 0, e(context, 16), 0);
        l10.setMinHeight(e(context, 38));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(e(context, 100));
        if (z9) {
            gradientDrawable.setColor(f11065e);
        } else {
            gradientDrawable.setColor(f11064d);
            gradientDrawable.setStroke(e(context, 1), f11069i);
        }
        l10.setBackground(gradientDrawable);
        return l10;
    }

    public static GradientDrawable j(int i10, float f10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i10);
        gradientDrawable.setCornerRadius(f10);
        return gradientDrawable;
    }

    public static void k(Context context, AlertDialog alertDialog, boolean z9) {
        Window window = alertDialog.getWindow();
        if (window == null) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(f11063c);
        if (z9) {
            gradientDrawable.setCornerRadius(0.0f);
            window.setBackgroundDrawable(gradientDrawable);
            window.setGravity(80);
            window.setWindowAnimations(R.style.DialogSlideUpAnimation);
            window.setLayout(-1, -2);
            return;
        }
        gradientDrawable.setCornerRadius(e(context, 18));
        window.setBackgroundDrawable(gradientDrawable);
        window.setWindowAnimations(R.style.DialogFadeScaleAnimation);
    }

    public static TextView l(Context context, String str, int i10, int i11, int i12) {
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(i10);
        textView.setTextColor(i11);
        textView.setTypeface(Typeface.DEFAULT, i12);
        textView.setIncludeFontPadding(true);
        return textView;
    }
}
