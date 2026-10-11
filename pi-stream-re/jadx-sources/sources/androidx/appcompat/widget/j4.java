package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class j4 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static j4 B;
    public static j4 C;
    public boolean A;

    /* renamed from: a, reason: collision with root package name */
    public final View f542a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f543b;

    /* renamed from: c, reason: collision with root package name */
    public final int f544c;

    /* renamed from: d, reason: collision with root package name */
    public final i4 f545d;

    /* renamed from: e, reason: collision with root package name */
    public final i4 f546e;

    /* renamed from: f, reason: collision with root package name */
    public int f547f;

    /* renamed from: x, reason: collision with root package name */
    public int f548x;

    /* renamed from: y, reason: collision with root package name */
    public k4 f549y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f550z;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.i4] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.i4] */
    public j4(View view, CharSequence charSequence) {
        int scaledTouchSlop;
        final int i10 = 0;
        this.f545d = new Runnable(this) { // from class: androidx.appcompat.widget.i4

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j4 f535b;

            {
                this.f535b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                j4 j4Var = this.f535b;
                switch (i11) {
                    case 0:
                        j4Var.c(false);
                        return;
                    default:
                        j4Var.a();
                        return;
                }
            }
        };
        final int i11 = 1;
        this.f546e = new Runnable(this) { // from class: androidx.appcompat.widget.i4

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j4 f535b;

            {
                this.f535b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i11;
                j4 j4Var = this.f535b;
                switch (i112) {
                    case 0:
                        j4Var.c(false);
                        return;
                    default:
                        j4Var.a();
                        return;
                }
            }
        };
        this.f542a = view;
        this.f543b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = g0.b1.f4169a;
        if (Build.VERSION.SDK_INT >= 28) {
            scaledTouchSlop = g0.a1.a(viewConfiguration);
        } else {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop() / 2;
        }
        this.f544c = scaledTouchSlop;
        this.A = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(j4 j4Var) {
        j4 j4Var2 = B;
        if (j4Var2 != null) {
            j4Var2.f542a.removeCallbacks(j4Var2.f545d);
        }
        B = j4Var;
        if (j4Var != null) {
            j4Var.f542a.postDelayed(j4Var.f545d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        boolean z9;
        j4 j4Var = C;
        View view = this.f542a;
        if (j4Var == this) {
            C = null;
            k4 k4Var = this.f549y;
            if (k4Var != null) {
                if (((View) k4Var.f552b).getParent() != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    ((WindowManager) ((Context) k4Var.f551a).getSystemService("window")).removeView((View) k4Var.f552b);
                }
                this.f549y = null;
                this.A = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (B == this) {
            b(null);
        }
        view.removeCallbacks(this.f546e);
    }

    public final void c(boolean z9) {
        boolean z10;
        int height;
        int i10;
        int i11;
        int i12;
        long longPressTimeout;
        long j4;
        long j10;
        boolean z11;
        WeakHashMap weakHashMap = g0.y0.f4277a;
        View view = this.f542a;
        if (!g0.k0.b(view)) {
            return;
        }
        b(null);
        j4 j4Var = C;
        if (j4Var != null) {
            j4Var.a();
        }
        C = this;
        this.f550z = z9;
        k4 k4Var = new k4(view.getContext());
        this.f549y = k4Var;
        int i13 = this.f547f;
        int i14 = this.f548x;
        boolean z12 = this.f550z;
        if (((View) k4Var.f552b).getParent() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (((View) k4Var.f552b).getParent() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                ((WindowManager) ((Context) k4Var.f551a).getSystemService("window")).removeView((View) k4Var.f552b);
            }
        }
        ((TextView) k4Var.f553c).setText(this.f543b);
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) k4Var.f554d;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = ((Context) k4Var.f551a).getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i13 = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = ((Context) k4Var.f551a).getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
            height = i14 + dimensionPixelOffset2;
            i10 = i14 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i10 = 0;
        }
        layoutParams.gravity = 49;
        Resources resources = ((Context) k4Var.f551a).getResources();
        if (z12) {
            i11 = R.dimen.tooltip_y_offset_touch;
        } else {
            i11 = R.dimen.tooltip_y_offset_non_touch;
        }
        int dimensionPixelOffset3 = resources.getDimensionPixelOffset(i11);
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
        if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
            Context context = view.getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof Activity) {
                    rootView = ((Activity) context).getWindow().getDecorView();
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (rootView == null) {
            Log.e("TooltipPopup", "Cannot find app view");
        } else {
            rootView.getWindowVisibleDisplayFrame((Rect) k4Var.f555e);
            Rect rect = (Rect) k4Var.f555e;
            if (rect.left < 0 && rect.top < 0) {
                Resources resources2 = ((Context) k4Var.f551a).getResources();
                int identifier = resources2.getIdentifier("status_bar_height", "dimen", "android");
                if (identifier != 0) {
                    i12 = resources2.getDimensionPixelSize(identifier);
                } else {
                    i12 = 0;
                }
                DisplayMetrics displayMetrics = resources2.getDisplayMetrics();
                ((Rect) k4Var.f555e).set(0, i12, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            rootView.getLocationOnScreen((int[]) k4Var.f557g);
            view.getLocationOnScreen((int[]) k4Var.f556f);
            int[] iArr = (int[]) k4Var.f556f;
            int i15 = iArr[0];
            int[] iArr2 = (int[]) k4Var.f557g;
            int i16 = i15 - iArr2[0];
            iArr[0] = i16;
            iArr[1] = iArr[1] - iArr2[1];
            layoutParams.x = (i16 + i13) - (rootView.getWidth() / 2);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            ((View) k4Var.f552b).measure(makeMeasureSpec, makeMeasureSpec);
            int measuredHeight = ((View) k4Var.f552b).getMeasuredHeight();
            int i17 = ((int[]) k4Var.f556f)[1];
            int i18 = ((i10 + i17) - dimensionPixelOffset3) - measuredHeight;
            int i19 = i17 + height + dimensionPixelOffset3;
            if (z12) {
                if (i18 >= 0) {
                    layoutParams.y = i18;
                } else {
                    layoutParams.y = i19;
                }
            } else if (measuredHeight + i19 <= ((Rect) k4Var.f555e).height()) {
                layoutParams.y = i19;
            } else {
                layoutParams.y = i18;
            }
        }
        ((WindowManager) ((Context) k4Var.f551a).getSystemService("window")).addView((View) k4Var.f552b, (WindowManager.LayoutParams) k4Var.f554d);
        view.addOnAttachStateChangeListener(this);
        if (this.f550z) {
            j10 = 2500;
        } else {
            if ((g0.h0.g(view) & 1) == 1) {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j4 = 3000;
            } else {
                longPressTimeout = ViewConfiguration.getLongPressTimeout();
                j4 = 15000;
            }
            j10 = j4 - longPressTimeout;
        }
        i4 i4Var = this.f546e;
        view.removeCallbacks(i4Var);
        view.postDelayed(i4Var, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r5, android.view.MotionEvent r6) {
        /*
            r4 = this;
            androidx.appcompat.widget.k4 r5 = r4.f549y
            r0 = 0
            if (r5 == 0) goto La
            boolean r5 = r4.f550z
            if (r5 == 0) goto La
            return r0
        La:
            android.view.View r5 = r4.f542a
            android.content.Context r1 = r5.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r6.getAction()
            r2 = 7
            r3 = 1
            if (r1 == r2) goto L38
            r5 = 10
            if (r1 == r5) goto L32
            goto L74
        L32:
            r4.A = r3
            r4.a()
            goto L74
        L38:
            boolean r5 = r5.isEnabled()
            if (r5 == 0) goto L74
            androidx.appcompat.widget.k4 r5 = r4.f549y
            if (r5 != 0) goto L74
            float r5 = r6.getX()
            int r5 = (int) r5
            float r6 = r6.getY()
            int r6 = (int) r6
            boolean r1 = r4.A
            if (r1 != 0) goto L69
            int r1 = r4.f547f
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r4.f544c
            if (r1 > r2) goto L69
            int r1 = r4.f548x
            int r1 = r6 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L67
            goto L69
        L67:
            r3 = r0
            goto L6f
        L69:
            r4.f547f = r5
            r4.f548x = r6
            r4.A = r0
        L6f:
            if (r3 == 0) goto L74
            b(r4)
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j4.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.f547f = view.getWidth() / 2;
        this.f548x = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }
}
