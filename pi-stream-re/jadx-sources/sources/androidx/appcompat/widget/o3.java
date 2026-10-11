package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.Switch;
import androidx.appcompat.widget.o3;
import java.lang.reflect.Method;
import java.util.Objects;
import msr.pistream.app.ui.player.PlayerActivity;

/* loaded from: classes.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public Object f597a;

    /* renamed from: b, reason: collision with root package name */
    public Object f598b;

    /* renamed from: c, reason: collision with root package name */
    public Object f599c;

    public o3(PlayerActivity playerActivity, Handler handler, n8.a aVar) {
        this.f597a = playerActivity;
        this.f598b = handler;
        this.f599c = aVar;
    }

    public static o3 m(Context context, AttributeSet attributeSet, int[] iArr, int i10) {
        return new o3(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
    }

    public static void o() {
        if (Build.VERSION.SDK_INT < 29) {
        } else {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    public boolean a(int i10, boolean z9) {
        return ((TypedArray) this.f598b).getBoolean(i10, z9);
    }

    public ColorStateList b(int i10) {
        int resourceId;
        ColorStateList colorStateList;
        Object obj = this.f598b;
        if (((TypedArray) obj).hasValue(i10) && (resourceId = ((TypedArray) obj).getResourceId(i10, 0)) != 0 && (colorStateList = x.j.getColorStateList((Context) this.f597a, resourceId)) != null) {
            return colorStateList;
        }
        return ((TypedArray) obj).getColorStateList(i10);
    }

    public int c(int i10, int i11) {
        return ((TypedArray) this.f598b).getDimensionPixelOffset(i10, i11);
    }

    public int d(int i10, int i11) {
        return ((TypedArray) this.f598b).getDimensionPixelSize(i10, i11);
    }

    public Drawable e(int i10) {
        int resourceId;
        Object obj = this.f598b;
        if (((TypedArray) obj).hasValue(i10) && (resourceId = ((TypedArray) obj).getResourceId(i10, 0)) != 0) {
            return w7.b.G((Context) this.f597a, resourceId);
        }
        return ((TypedArray) obj).getDrawable(i10);
    }

    public Drawable f(int i10) {
        int resourceId;
        Drawable g10;
        if (((TypedArray) this.f598b).hasValue(i10) && (resourceId = ((TypedArray) this.f598b).getResourceId(i10, 0)) != 0) {
            x a10 = x.a();
            Context context = (Context) this.f597a;
            synchronized (a10) {
                g10 = a10.f699a.g(context, resourceId, true);
            }
            return g10;
        }
        return null;
    }

    public Typeface g(int i10, int i11, y0 y0Var) {
        int resourceId = ((TypedArray) this.f598b).getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f599c) == null) {
            this.f599c = new TypedValue();
        }
        Context context = (Context) this.f597a;
        TypedValue typedValue = (TypedValue) this.f599c;
        ThreadLocal threadLocal = y.p.f11448a;
        if (context.isRestricted()) {
            return null;
        }
        return y.p.b(context, resourceId, typedValue, i11, y0Var, true, false);
    }

    public int h(int i10, int i11) {
        return ((TypedArray) this.f598b).getInt(i10, i11);
    }

    public int i(int i10, int i11) {
        return ((TypedArray) this.f598b).getResourceId(i10, i11);
    }

    public String j(int i10) {
        return ((TypedArray) this.f598b).getString(i10);
    }

    public CharSequence k(int i10) {
        return ((TypedArray) this.f598b).getText(i10);
    }

    public boolean l(int i10) {
        return ((TypedArray) this.f598b).hasValue(i10);
    }

    public LinearLayout n(String str, boolean z9, final n8.h hVar) {
        LinearLayout linearLayout = new LinearLayout((Context) this.f597a);
        linearLayout.setGravity(16);
        linearLayout.setPadding(0, 0, 0, 0);
        linearLayout.addView(w8.i.l((Context) this.f597a, str, 18, -1, 1), new LinearLayout.LayoutParams(0, -2, 1.0f));
        Switch r8 = new Switch((Context) this.f597a);
        r8.setChecked(z9);
        linearLayout.addView(r8, new LinearLayout.LayoutParams(-2, -2));
        r8.setFocusable(false);
        w8.i.d(linearLayout);
        linearLayout.setOnClickListener(new n8.i(r8, 1));
        r8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: n8.k
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                h hVar2 = (h) hVar;
                int i10 = hVar2.f8034a;
                o3 o3Var = hVar2.f8035b;
                switch (i10) {
                    case 0:
                        com.bumptech.glide.c.b0((Context) o3Var.f597a).edit().putBoolean("frame_capture_enabled", z10).apply();
                        ((a) o3Var.f599c).b();
                        ((a) o3Var.f599c).f8024b.f7775y.a();
                        ((a) o3Var.f599c).u();
                        ((a) o3Var.f599c).v();
                        ((a) o3Var.f599c).f8024b.D();
                        return;
                    default:
                        com.bumptech.glide.c.b0((Context) o3Var.f597a).edit().putBoolean("frame_capture_always_visible", z10).apply();
                        ((a) o3Var.f599c).b();
                        ((a) o3Var.f599c).f8024b.f7775y.a();
                        ((a) o3Var.f599c).u();
                        ((a) o3Var.f599c).v();
                        ((a) o3Var.f599c).f8024b.D();
                        return;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, w8.i.e((Context) this.f597a, 66));
        layoutParams.setMargins(0, w8.i.e((Context) this.f597a, 8), 0, w8.i.e((Context) this.f597a, 8));
        linearLayout.setLayoutParams(layoutParams);
        return linearLayout;
    }

    public void p() {
        ((TypedArray) this.f598b).recycle();
    }

    public void q(PopupWindow popupWindow, LinearLayout linearLayout) {
        Log.d("PlayerUI", "showPopup children=" + linearLayout.getChildCount());
        View contentView = popupWindow.getContentView();
        if (contentView != null) {
            contentView.setAlpha(0.0f);
        }
        ((n8.a) this.f599c).a();
        int i10 = 0;
        popupWindow.showAtLocation(((Activity) ((Context) this.f597a)).getWindow().getDecorView(), 5, 0, 0);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: n8.l
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                o3 o3Var = o3.this;
                ((a) o3Var.f599c).a();
                LinearLayout linearLayout2 = ((a) o3Var.f599c).f8024b.I0;
                if (linearLayout2 != null) {
                    linearLayout2.post(new m(linearLayout2, 1));
                }
            }
        });
        if (contentView != null) {
            n8.a aVar = (n8.a) this.f599c;
            int i11 = aVar.f8023a;
            PlayerActivity playerActivity = aVar.f8024b;
            switch (i11) {
                case 2:
                    playerActivity.A.getClass();
                    break;
                default:
                    playerActivity.A.getClass();
                    break;
            }
            contentView.setSystemUiVisibility(5894);
        }
        if (contentView != null) {
            contentView.animate().alpha(1.0f).setDuration(120L).start();
            if (contentView instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) contentView;
                if (frameLayout.getChildCount() > 0) {
                    frameLayout.getChildAt(0).animate().translationX(0.0f).setDuration(210L).start();
                }
            }
        }
        Handler handler = (Handler) this.f598b;
        n8.a aVar2 = (n8.a) this.f599c;
        Objects.requireNonNull(aVar2);
        handler.postDelayed(new n8.m(aVar2, 2), 80L);
        linearLayout.post(new n8.m(linearLayout, i10));
    }

    public LinearLayout r(PopupWindow popupWindow, int i10) {
        FrameLayout frameLayout = new FrameLayout((Context) this.f597a);
        frameLayout.setBackgroundColor(1711276032);
        frameLayout.setFitsSystemWindows(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new n8.i(popupWindow, 0));
        ScrollView scrollView = new ScrollView((Context) this.f597a);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setFocusable(false);
        scrollView.setClipToPadding(false);
        scrollView.setPadding(0, 0, 0, w8.i.e((Context) this.f597a, 20));
        scrollView.setBackgroundColor(w8.i.f11063c);
        LinearLayout linearLayout = new LinearLayout((Context) this.f597a);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(w8.i.e((Context) this.f597a, 28), w8.i.e((Context) this.f597a, 34), w8.i.e((Context) this.f597a, 28), w8.i.e((Context) this.f597a, 20));
        linearLayout.setOnClickListener(new n8.j(0));
        scrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        frameLayout.addView(scrollView, new FrameLayout.LayoutParams(w8.i.e((Context) this.f597a, i10), -1, 5));
        scrollView.setTranslationX(w8.i.e((Context) this.f597a, i10));
        popupWindow.setContentView(frameLayout);
        popupWindow.setWidth(-1);
        popupWindow.setHeight(-1);
        popupWindow.setFocusable(true);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setClippingEnabled(false);
        popupWindow.setInputMethodMode(2);
        popupWindow.setSoftInputMode(48);
        return linearLayout;
    }

    public o3(Context context, TypedArray typedArray) {
        this.f597a = context;
        this.f598b = typedArray;
    }

    public o3() {
        this.f597a = null;
        this.f598b = null;
        this.f599c = null;
        o();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.f597a = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.f598b = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.f599c = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }
}
