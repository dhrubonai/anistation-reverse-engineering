package f;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.g4;
import androidx.appcompat.widget.n4;
import androidx.appcompat.widget.t1;
import g0.k2;
import g0.l1;
import g0.y0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class g0 extends q implements j.m, LayoutInflater.Factory2 {
    public final Object A;
    public final Context B;
    public Window C;
    public a0 D;
    public final m E;
    public u0 F;
    public i.k G;
    public CharSequence H;
    public t1 I;
    public s J;
    public s K;
    public i.b L;
    public ActionBarContextView M;
    public PopupWindow N;
    public r O;
    public boolean R;
    public ViewGroup S;
    public TextView T;
    public View U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3679a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3680b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f3681c0;

    /* renamed from: d0, reason: collision with root package name */
    public f0[] f3682d0;

    /* renamed from: e0, reason: collision with root package name */
    public f0 f3683e0;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f3684f0;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f3685g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f3686h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f3687i0;

    /* renamed from: j0, reason: collision with root package name */
    public Configuration f3688j0;

    /* renamed from: k0, reason: collision with root package name */
    public final int f3689k0;

    /* renamed from: l0, reason: collision with root package name */
    public int f3690l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f3691m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f3692n0;

    /* renamed from: o0, reason: collision with root package name */
    public b0 f3693o0;

    /* renamed from: p0, reason: collision with root package name */
    public b0 f3694p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f3695q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f3696r0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f3698t0;

    /* renamed from: u0, reason: collision with root package name */
    public Rect f3699u0;

    /* renamed from: v0, reason: collision with root package name */
    public Rect f3700v0;

    /* renamed from: w0, reason: collision with root package name */
    public j0 f3701w0;

    /* renamed from: x0, reason: collision with root package name */
    public OnBackInvokedDispatcher f3702x0;

    /* renamed from: y0, reason: collision with root package name */
    public OnBackInvokedCallback f3703y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final n.k f3678z0 = new n.k();
    public static final int[] A0 = {R.attr.windowBackground};
    public static final boolean B0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean C0 = true;
    public l1 P = null;
    public final boolean Q = true;

    /* renamed from: s0, reason: collision with root package name */
    public final r f3697s0 = new r(this, 0);

    public g0(Context context, Window window, m mVar, Object obj) {
        androidx.appcompat.app.a aVar;
        this.f3689k0 = -100;
        this.B = context;
        this.E = mVar;
        this.A = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (context instanceof androidx.appcompat.app.a) {
                    aVar = (androidx.appcompat.app.a) context;
                    break;
                } else if (!(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            aVar = null;
            if (aVar != null) {
                this.f3689k0 = ((g0) aVar.k()).f3689k0;
            }
        }
        if (this.f3689k0 == -100) {
            n.k kVar = f3678z0;
            Integer num = (Integer) kVar.getOrDefault(this.A.getClass().getName(), null);
            if (num != null) {
                this.f3689k0 = num.intValue();
                kVar.remove(this.A.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        androidx.appcompat.widget.x.d();
    }

    public static c0.i A(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return x.b(configuration);
        }
        return c0.i.b(w.a(configuration.locale));
    }

    public static c0.i o(Context context) {
        c0.i iVar;
        c0.i b10;
        Locale c6;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (iVar = q.f3765c) == null) {
            return null;
        }
        c0.i A = A(context.getApplicationContext().getResources().getConfiguration());
        c0.k kVar = iVar.f1608a;
        if (i10 >= 24) {
            if (kVar.isEmpty()) {
                b10 = c0.i.f1607b;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i11 = 0; i11 < A.f1608a.size() + kVar.size(); i11++) {
                    if (i11 < kVar.size()) {
                        c6 = iVar.c(i11);
                    } else {
                        c6 = A.c(i11 - kVar.size());
                    }
                    if (c6 != null) {
                        linkedHashSet.add(c6);
                    }
                }
                b10 = c0.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (kVar.isEmpty()) {
            b10 = c0.i.f1607b;
        } else {
            b10 = c0.i.b(iVar.c(0).toString());
        }
        if (!b10.f1608a.isEmpty()) {
            return b10;
        }
        return A;
    }

    public static Configuration u(Context context, int i10, c0.i iVar, Configuration configuration, boolean z9) {
        int i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (z9) {
                    i11 = 0;
                } else {
                    i11 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i11 = 32;
            }
        } else {
            i11 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                x.d(configuration2, iVar);
            } else {
                v.b(configuration2, iVar.c(0));
                v.a(configuration2, iVar.c(0));
            }
        }
        return configuration2;
    }

    public final f0 B(int i10) {
        f0[] f0VarArr = this.f3682d0;
        if (f0VarArr == null || f0VarArr.length <= i10) {
            f0[] f0VarArr2 = new f0[i10 + 1];
            if (f0VarArr != null) {
                System.arraycopy(f0VarArr, 0, f0VarArr2, 0, f0VarArr.length);
            }
            this.f3682d0 = f0VarArr2;
            f0VarArr = f0VarArr2;
        }
        f0 f0Var = f0VarArr[i10];
        if (f0Var == null) {
            f0 f0Var2 = new f0(i10);
            f0VarArr[i10] = f0Var2;
            return f0Var2;
        }
        return f0Var;
    }

    public final Window.Callback C() {
        return this.C.getCallback();
    }

    public final void D() {
        x();
        if (this.X && this.F == null) {
            Object obj = this.A;
            if (obj instanceof Activity) {
                this.F = new u0((Activity) obj, this.Y);
            } else if (obj instanceof Dialog) {
                this.F = new u0((Dialog) obj);
            }
            u0 u0Var = this.F;
            if (u0Var != null) {
                u0Var.r0(this.f3698t0);
            }
        }
    }

    public final int E(Context context, int i10) {
        if (i10 == -100) {
            return -1;
        }
        if (i10 != -1) {
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        if (this.f3694p0 == null) {
                            this.f3694p0 = new b0(this, context);
                        }
                        return this.f3694p0.d();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return z(context).d();
            }
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean F() {
        /*
            r5 = this;
            boolean r0 = r5.f3684f0
            r1 = 0
            r5.f3684f0 = r1
            f.f0 r2 = r5.B(r1)
            boolean r3 = r2.f3675m
            r4 = 1
            if (r3 == 0) goto L14
            if (r0 != 0) goto L13
            r5.t(r2, r4)
        L13:
            return r4
        L14:
            i.b r0 = r5.L
            if (r0 == 0) goto L1c
            r0.a()
            return r4
        L1c:
            r5.D()
            f.u0 r0 = r5.F
            if (r0 == 0) goto L50
            androidx.appcompat.widget.u1 r0 = r0.G
            if (r0 == 0) goto L4c
            r2 = r0
            androidx.appcompat.widget.g4 r2 = (androidx.appcompat.widget.g4) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f496a
            androidx.appcompat.widget.c4 r2 = r2.f386f0
            if (r2 == 0) goto L36
            j.q r2 = r2.f436b
            if (r2 == 0) goto L36
            r2 = r4
            goto L37
        L36:
            r2 = r1
        L37:
            if (r2 == 0) goto L4c
            androidx.appcompat.widget.g4 r0 = (androidx.appcompat.widget.g4) r0
            androidx.appcompat.widget.Toolbar r0 = r0.f496a
            androidx.appcompat.widget.c4 r0 = r0.f386f0
            if (r0 != 0) goto L43
            r0 = 0
            goto L45
        L43:
            j.q r0 = r0.f436b
        L45:
            if (r0 == 0) goto L4a
            r0.collapseActionView()
        L4a:
            r0 = r4
            goto L4d
        L4c:
            r0 = r1
        L4d:
            if (r0 == 0) goto L50
            return r4
        L50:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f.g0.F():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0178, code lost:
    
        if (r2.f5538f.getCount() > 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0154, code lost:
    
        if (r2 != null) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(f.f0 r19, android.view.KeyEvent r20) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.g0.G(f.f0, android.view.KeyEvent):void");
    }

    public final boolean H(f0 f0Var, int i10, KeyEvent keyEvent) {
        j.o oVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!f0Var.f3673k && !I(f0Var, keyEvent)) || (oVar = f0Var.f3670h) == null) {
            return false;
        }
        return oVar.performShortcut(i10, keyEvent, 1);
    }

    public final boolean I(f0 f0Var, KeyEvent keyEvent) {
        boolean z9;
        t1 t1Var;
        t1 t1Var2;
        Resources.Theme theme;
        int i10;
        boolean z10;
        t1 t1Var3;
        t1 t1Var4;
        if (this.f3687i0) {
            return false;
        }
        if (f0Var.f3673k) {
            return true;
        }
        f0 f0Var2 = this.f3683e0;
        if (f0Var2 != null && f0Var2 != f0Var) {
            t(f0Var2, false);
        }
        Window.Callback C = C();
        int i11 = f0Var.f3663a;
        if (C != null) {
            f0Var.f3669g = C.onCreatePanelView(i11);
        }
        if (i11 != 0 && i11 != 108) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9 && (t1Var4 = this.I) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) t1Var4;
            actionBarOverlayLayout.l();
            ((g4) actionBarOverlayLayout.f328e).f507l = true;
        }
        if (f0Var.f3669g == null) {
            j.o oVar = f0Var.f3670h;
            if (oVar == null || f0Var.o) {
                if (oVar == null) {
                    Context context = this.B;
                    if ((i11 == 0 || i11 == 108) && this.I != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(msr.pistream.app.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(msr.pistream.app.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(msr.pistream.app.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            i.e eVar = new i.e(context, 0);
                            eVar.getTheme().setTo(theme);
                            context = eVar;
                        }
                    }
                    j.o oVar2 = new j.o(context);
                    oVar2.f5550e = this;
                    j.o oVar3 = f0Var.f3670h;
                    if (oVar2 != oVar3) {
                        if (oVar3 != null) {
                            oVar3.r(f0Var.f3671i);
                        }
                        f0Var.f3670h = oVar2;
                        j.k kVar = f0Var.f3671i;
                        if (kVar != null) {
                            oVar2.b(kVar, oVar2.f5546a);
                        }
                    }
                    if (f0Var.f3670h == null) {
                        return false;
                    }
                }
                if (z9 && (t1Var2 = this.I) != null) {
                    if (this.J == null) {
                        this.J = new s(this, 3);
                    }
                    ((ActionBarOverlayLayout) t1Var2).m(f0Var.f3670h, this.J);
                }
                f0Var.f3670h.w();
                if (!C.onCreatePanelMenu(i11, f0Var.f3670h)) {
                    j.o oVar4 = f0Var.f3670h;
                    if (oVar4 != null) {
                        if (oVar4 != null) {
                            oVar4.r(f0Var.f3671i);
                        }
                        f0Var.f3670h = null;
                    }
                    if (z9 && (t1Var = this.I) != null) {
                        ((ActionBarOverlayLayout) t1Var).m(null, this.J);
                    }
                    return false;
                }
                f0Var.o = false;
            }
            f0Var.f3670h.w();
            Bundle bundle = f0Var.f3677p;
            if (bundle != null) {
                f0Var.f3670h.s(bundle);
                f0Var.f3677p = null;
            }
            if (!C.onPreparePanel(0, f0Var.f3669g, f0Var.f3670h)) {
                if (z9 && (t1Var3 = this.I) != null) {
                    ((ActionBarOverlayLayout) t1Var3).m(null, this.J);
                }
                f0Var.f3670h.v();
                return false;
            }
            if (keyEvent != null) {
                i10 = keyEvent.getDeviceId();
            } else {
                i10 = -1;
            }
            if (KeyCharacterMap.load(i10).getKeyboardType() != 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            f0Var.f3670h.setQwertyMode(z10);
            f0Var.f3670h.v();
        }
        f0Var.f3673k = true;
        f0Var.f3674l = false;
        this.f3683e0 = f0Var;
        return true;
    }

    public final void J() {
        if (!this.R) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z9 = false;
            if (this.f3702x0 != null && (B(0).f3675m || this.L != null)) {
                z9 = true;
            }
            if (z9 && this.f3703y0 == null) {
                this.f3703y0 = z.b(this.f3702x0, this);
            } else if (!z9 && (onBackInvokedCallback = this.f3703y0) != null) {
                z.c(this.f3702x0, onBackInvokedCallback);
            }
        }
    }

    public final int L(k2 k2Var, Rect rect) {
        int i10;
        boolean z9;
        int c6;
        int d10;
        boolean z10;
        int color;
        int i11 = 0;
        if (k2Var != null) {
            i10 = k2Var.e();
        } else if (rect != null) {
            i10 = rect.top;
        } else {
            i10 = 0;
        }
        ActionBarContextView actionBarContextView = this.M;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.M.getLayoutParams();
            boolean z11 = true;
            if (this.M.isShown()) {
                if (this.f3699u0 == null) {
                    this.f3699u0 = new Rect();
                    this.f3700v0 = new Rect();
                }
                Rect rect2 = this.f3699u0;
                Rect rect3 = this.f3700v0;
                if (k2Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(k2Var.c(), k2Var.e(), k2Var.d(), k2Var.b());
                }
                ViewGroup viewGroup = this.S;
                Method method = n4.f580a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect2, rect3);
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i12 = rect2.top;
                int i13 = rect2.left;
                int i14 = rect2.right;
                ViewGroup viewGroup2 = this.S;
                WeakHashMap weakHashMap = y0.f4277a;
                k2 a10 = g0.o0.a(viewGroup2);
                if (a10 == null) {
                    c6 = 0;
                } else {
                    c6 = a10.c();
                }
                if (a10 == null) {
                    d10 = 0;
                } else {
                    d10 = a10.d();
                }
                if (marginLayoutParams.topMargin == i12 && marginLayoutParams.leftMargin == i13 && marginLayoutParams.rightMargin == i14) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i12;
                    marginLayoutParams.leftMargin = i13;
                    marginLayoutParams.rightMargin = i14;
                    z10 = true;
                }
                Context context = this.B;
                if (i12 > 0 && this.U == null) {
                    View view = new View(context);
                    this.U = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = c6;
                    layoutParams.rightMargin = d10;
                    this.S.addView(this.U, -1, layoutParams);
                } else {
                    View view2 = this.U;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i15 = marginLayoutParams2.height;
                        int i16 = marginLayoutParams.topMargin;
                        if (i15 != i16 || marginLayoutParams2.leftMargin != c6 || marginLayoutParams2.rightMargin != d10) {
                            marginLayoutParams2.height = i16;
                            marginLayoutParams2.leftMargin = c6;
                            marginLayoutParams2.rightMargin = d10;
                            this.U.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.U;
                if (view3 != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 && view3.getVisibility() != 0) {
                    View view4 = this.U;
                    if ((g0.h0.g(view4) & 8192) == 0) {
                        z11 = false;
                    }
                    if (z11) {
                        color = x.j.getColor(context, msr.pistream.app.R.color.abc_decor_view_status_guard_light);
                    } else {
                        color = x.j.getColor(context, msr.pistream.app.R.color.abc_decor_view_status_guard);
                    }
                    view4.setBackgroundColor(color);
                }
                if (!this.Z && z9) {
                    i10 = 0;
                }
                z11 = z10;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z9 = false;
            } else {
                z11 = false;
                z9 = false;
            }
            if (z11) {
                this.M.setLayoutParams(marginLayoutParams);
            }
        } else {
            z9 = false;
        }
        View view5 = this.U;
        if (view5 != null) {
            if (!z9) {
                i11 = 8;
            }
            view5.setVisibility(i11);
        }
        return i10;
    }

    @Override // f.q
    public final void a(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ((ViewGroup) this.S.findViewById(R.id.content)).addView(view, layoutParams);
        this.D.a(this.C.getCallback());
    }

    @Override // f.q
    public final void b() {
        LayoutInflater from = LayoutInflater.from(this.B);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof g0)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // f.q
    public final void c() {
        if (this.F != null) {
            D();
            this.F.getClass();
            this.f3696r0 |= 1;
            if (!this.f3695q0) {
                View decorView = this.C.getDecorView();
                WeakHashMap weakHashMap = y0.f4277a;
                g0.h0.m(decorView, this.f3697s0);
                this.f3695q0 = true;
            }
        }
    }

    @Override // f.q
    public final void e(Bundle bundle) {
        String str;
        this.f3685g0 = true;
        m(false, true);
        y();
        Object obj = this.A;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = j5.a.B(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                u0 u0Var = this.F;
                if (u0Var == null) {
                    this.f3698t0 = true;
                } else {
                    u0Var.r0(true);
                }
            }
            synchronized (q.f3770y) {
                q.g(this);
                q.f3769x.add(new WeakReference(this));
            }
        }
        this.f3688j0 = new Configuration(this.B.getResources().getConfiguration());
        this.f3686h0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // f.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.A
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = f.q.f3770y
            monitor-enter(r0)
            f.q.g(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.f3695q0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.C
            android.view.View r0 = r0.getDecorView()
            f.r r1 = r3.f3697s0
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.f3687i0 = r0
            int r0 = r3.f3689k0
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.A
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            n.k r0 = f.g0.f3678z0
            java.lang.Object r1 = r3.A
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f3689k0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            n.k r0 = f.g0.f3678z0
            java.lang.Object r1 = r3.A
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            f.b0 r0 = r3.f3693o0
            if (r0 == 0) goto L63
            r0.a()
        L63:
            f.b0 r0 = r3.f3694p0
            if (r0 == 0) goto L6a
            r0.a()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.g0.f():void");
    }

    @Override // f.q
    public final boolean h(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.f3680b0 && i10 == 108) {
            return false;
        }
        if (this.X && i10 == 1) {
            this.X = false;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 5) {
                    if (i10 != 10) {
                        if (i10 != 108) {
                            if (i10 != 109) {
                                return this.C.requestFeature(i10);
                            }
                            J();
                            this.Y = true;
                            return true;
                        }
                        J();
                        this.X = true;
                        return true;
                    }
                    J();
                    this.Z = true;
                    return true;
                }
                J();
                this.W = true;
                return true;
            }
            J();
            this.V = true;
            return true;
        }
        J();
        this.f3680b0 = true;
        return true;
    }

    @Override // f.q
    public final void i(int i10) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.S.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.B).inflate(i10, viewGroup);
        this.D.a(this.C.getCallback());
    }

    @Override // f.q
    public final void j(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.S.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.D.a(this.C.getCallback());
    }

    @Override // f.q
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.S.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.D.a(this.C.getCallback());
    }

    @Override // f.q
    public final void l(CharSequence charSequence) {
        this.H = charSequence;
        t1 t1Var = this.I;
        if (t1Var != null) {
            t1Var.setWindowTitle(charSequence);
            return;
        }
        u0 u0Var = this.F;
        if (u0Var != null) {
            u0Var.t0(charSequence);
            return;
        }
        TextView textView = this.T;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0235 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.g0.m(boolean, boolean):boolean");
    }

    public final void n(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.C == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof a0)) {
                a0 a0Var = new a0(this, callback);
                this.D = a0Var;
                window.setCallback(a0Var);
                int[] iArr = A0;
                Context context = this.B;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    androidx.appcompat.widget.x a10 = androidx.appcompat.widget.x.a();
                    synchronized (a10) {
                        drawable = a10.f699a.g(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.C = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.f3702x0) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f3703y0) != null) {
                        z.c(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.f3703y0 = null;
                    }
                    Object obj = this.A;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.f3702x0 = z.a(activity);
                            K();
                            return;
                        }
                    }
                    this.f3702x0 = null;
                    K();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0112, code lost:
    
        if (r10.equals("ImageButton") == false) goto L80;
     */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.g0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005d, code lost:
    
        if (r6 == false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009f  */
    @Override // j.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(j.o r6) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.g0.p(j.o):void");
    }

    @Override // j.m
    public final boolean q(j.o oVar, MenuItem menuItem) {
        int i10;
        int i11;
        f0 f0Var;
        Window.Callback C = C();
        if (C != null && !this.f3687i0) {
            j.o k10 = oVar.k();
            f0[] f0VarArr = this.f3682d0;
            if (f0VarArr != null) {
                i10 = f0VarArr.length;
                i11 = 0;
            } else {
                i10 = 0;
                i11 = 0;
            }
            while (true) {
                if (i11 < i10) {
                    f0Var = f0VarArr[i11];
                    if (f0Var != null && f0Var.f3670h == k10) {
                        break;
                    }
                    i11++;
                } else {
                    f0Var = null;
                    break;
                }
            }
            if (f0Var != null) {
                return C.onMenuItemSelected(f0Var.f3663a, menuItem);
            }
        }
        return false;
    }

    public final void r(int i10, f0 f0Var, j.o oVar) {
        if (oVar == null) {
            if (f0Var == null && i10 >= 0) {
                f0[] f0VarArr = this.f3682d0;
                if (i10 < f0VarArr.length) {
                    f0Var = f0VarArr[i10];
                }
            }
            if (f0Var != null) {
                oVar = f0Var.f3670h;
            }
        }
        if ((f0Var == null || f0Var.f3675m) && !this.f3687i0) {
            a0 a0Var = this.D;
            Window.Callback callback = this.C.getCallback();
            a0Var.getClass();
            try {
                a0Var.f3626d = true;
                callback.onPanelClosed(i10, oVar);
            } finally {
                a0Var.f3626d = false;
            }
        }
    }

    public final void s(j.o oVar) {
        androidx.appcompat.widget.m mVar;
        if (this.f3681c0) {
            return;
        }
        this.f3681c0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.I;
        actionBarOverlayLayout.l();
        ActionMenuView actionMenuView = ((g4) actionBarOverlayLayout.f328e).f496a.f375a;
        if (actionMenuView != null && (mVar = actionMenuView.K) != null) {
            mVar.d();
            androidx.appcompat.widget.h hVar = mVar.K;
            if (hVar != null && hVar.b()) {
                hVar.f5496j.dismiss();
            }
        }
        Window.Callback C = C();
        if (C != null && !this.f3687i0) {
            C.onPanelClosed(108, oVar);
        }
        this.f3681c0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(f.f0 r6, boolean r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L35
            int r2 = r6.f3663a
            if (r2 != 0) goto L35
            androidx.appcompat.widget.t1 r2 = r5.I
            if (r2 == 0) goto L35
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            r2.l()
            androidx.appcompat.widget.u1 r2 = r2.f328e
            androidx.appcompat.widget.g4 r2 = (androidx.appcompat.widget.g4) r2
            androidx.appcompat.widget.Toolbar r2 = r2.f496a
            androidx.appcompat.widget.ActionMenuView r2 = r2.f375a
            if (r2 == 0) goto L2c
            androidx.appcompat.widget.m r2 = r2.K
            if (r2 == 0) goto L27
            boolean r2 = r2.f()
            if (r2 == 0) goto L27
            r2 = r0
            goto L28
        L27:
            r2 = r1
        L28:
            if (r2 == 0) goto L2c
            r2 = r0
            goto L2d
        L2c:
            r2 = r1
        L2d:
            if (r2 == 0) goto L35
            j.o r6 = r6.f3670h
            r5.s(r6)
            return
        L35:
            android.content.Context r2 = r5.B
            java.lang.String r3 = "window"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            r3 = 0
            if (r2 == 0) goto L54
            boolean r4 = r6.f3675m
            if (r4 == 0) goto L54
            f.e0 r4 = r6.f3667e
            if (r4 == 0) goto L54
            r2.removeView(r4)
            if (r7 == 0) goto L54
            int r7 = r6.f3663a
            r5.r(r7, r6, r3)
        L54:
            r6.f3673k = r1
            r6.f3674l = r1
            r6.f3675m = r1
            r6.f3668f = r3
            r6.f3676n = r0
            f.f0 r7 = r5.f3683e0
            if (r7 != r6) goto L64
            r5.f3683e0 = r3
        L64:
            int r6 = r6.f3663a
            if (r6 != 0) goto L6b
            r5.K()
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.g0.t(f.f0, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ff, code lost:
    
        if (r7 != false) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean v(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f.g0.v(android.view.KeyEvent):boolean");
    }

    public final void w(int i10) {
        f0 B = B(i10);
        if (B.f3670h != null) {
            Bundle bundle = new Bundle();
            B.f3670h.t(bundle);
            if (bundle.size() > 0) {
                B.f3677p = bundle;
            }
            B.f3670h.w();
            B.f3670h.clear();
        }
        B.o = true;
        B.f3676n = true;
        if ((i10 == 108 || i10 == 0) && this.I != null) {
            f0 B2 = B(0);
            B2.f3673k = false;
            I(B2, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.R) {
            int[] iArr = e.a.f3279j;
            Context context2 = this.B;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                int i10 = 0;
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    h(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    h(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    h(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    h(10);
                }
                this.f3679a0 = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                y();
                this.C.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                int i11 = 2;
                if (!this.f3680b0) {
                    if (this.f3679a0) {
                        viewGroup = (ViewGroup) from.inflate(msr.pistream.app.R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.Y = false;
                        this.X = false;
                    } else if (this.X) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(msr.pistream.app.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new i.e(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(msr.pistream.app.R.layout.abc_screen_toolbar, (ViewGroup) null);
                        t1 t1Var = (t1) viewGroup.findViewById(msr.pistream.app.R.id.decor_content_parent);
                        this.I = t1Var;
                        t1Var.setWindowCallback(C());
                        if (this.Y) {
                            ((ActionBarOverlayLayout) this.I).k(109);
                        }
                        if (this.V) {
                            ((ActionBarOverlayLayout) this.I).k(2);
                        }
                        if (this.W) {
                            ((ActionBarOverlayLayout) this.I).k(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.Z ? (ViewGroup) from.inflate(msr.pistream.app.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(msr.pistream.app.R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    s sVar = new s(this, i10);
                    WeakHashMap weakHashMap = y0.f4277a;
                    g0.n0.u(viewGroup, sVar);
                    if (this.I == null) {
                        this.T = (TextView) viewGroup.findViewById(msr.pistream.app.R.id.title);
                    }
                    Method method = n4.f580a;
                    try {
                        Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
                        if (!method2.isAccessible()) {
                            method2.setAccessible(true);
                        }
                        method2.invoke(viewGroup, new Object[0]);
                    } catch (IllegalAccessException e10) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
                    } catch (NoSuchMethodException unused) {
                        Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
                    } catch (InvocationTargetException e11) {
                        Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e11);
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(msr.pistream.app.R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.C.findViewById(R.id.content);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(R.id.content);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.C.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new s(this, i11));
                    this.S = viewGroup;
                    Object obj = this.A;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.H;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        t1 t1Var2 = this.I;
                        if (t1Var2 != null) {
                            t1Var2.setWindowTitle(charSequence);
                        } else {
                            u0 u0Var = this.F;
                            if (u0Var != null) {
                                u0Var.t0(charSequence);
                            } else {
                                TextView textView = this.T;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.S.findViewById(R.id.content);
                    View decorView = this.C.getDecorView();
                    contentFrameLayout2.f343x.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    WeakHashMap weakHashMap2 = y0.f4277a;
                    if (g0.k0.c(contentFrameLayout2)) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.R = true;
                    f0 B = B(0);
                    if (!this.f3687i0 && B.f3670h == null) {
                        this.f3696r0 |= 4096;
                        if (!this.f3695q0) {
                            g0.h0.m(this.C.getDecorView(), this.f3697s0);
                            this.f3695q0 = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.X + ", windowActionBarOverlay: " + this.Y + ", android:windowIsFloating: " + this.f3679a0 + ", windowActionModeOverlay: " + this.Z + ", windowNoTitle: " + this.f3680b0 + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void y() {
        if (this.C == null) {
            Object obj = this.A;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.C != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final d0 z(Context context) {
        if (this.f3693o0 == null) {
            if (c.f3633e == null) {
                Context applicationContext = context.getApplicationContext();
                c.f3633e = new c(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f3693o0 = new b0(this, c.f3633e);
        }
        return this.f3693o0;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
