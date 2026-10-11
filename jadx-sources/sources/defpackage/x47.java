package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import com.anistation.android.R;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x47 implements View.OnApplyWindowInsetsListener {
    public final po0 a;
    public v57 b;

    public x47(View view, po0 po0Var) {
        v57 v57Var;
        j57 d57Var;
        this.a = po0Var;
        int i = pv6.a;
        v57 a = lv6.a(view);
        if (a != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 36) {
                d57Var = new i57(a);
            } else if (i2 >= 35) {
                d57Var = new h57(a);
            } else if (i2 >= 34) {
                d57Var = new g57(a);
            } else if (i2 >= 31) {
                d57Var = new f57(a);
            } else if (i2 >= 30) {
                d57Var = new e57(a);
            } else {
                d57Var = new d57(a);
            }
            v57Var = d57Var.b();
        } else {
            v57Var = null;
        }
        this.b = v57Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        long j;
        int[] iArr;
        boolean z;
        boolean z2;
        if (!view.isLaidOut()) {
            this.b = v57.c(windowInsets, view);
            if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        v57 c = v57.c(windowInsets, view);
        s57 s57Var = c.a;
        v57 v57Var = this.b;
        if (v57Var == null) {
            int i = pv6.a;
            v57Var = lv6.a(view);
            this.b = v57Var;
        }
        if (v57Var == null) {
            this.b = c;
            if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                return view.onApplyWindowInsets(windowInsets);
            }
        } else {
            po0 j2 = y47.j(view);
            if (j2 != null && Objects.equals((v57) j2.y, c)) {
                if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                    return view.onApplyWindowInsets(windowInsets);
                }
            } else {
                int[] iArr2 = new int[1];
                int[] iArr3 = new int[1];
                v57 v57Var2 = this.b;
                int i2 = 1;
                while (i2 <= 512) {
                    yz2 i3 = s57Var.i(i2);
                    yz2 i4 = v57Var2.a.i(i2);
                    int i5 = i3.a;
                    int i6 = i3.d;
                    int i7 = i3.c;
                    int i8 = i3.b;
                    int i9 = i4.a;
                    int i10 = i4.d;
                    int[] iArr4 = iArr2;
                    int i11 = i4.c;
                    int i12 = i4.b;
                    if (i5 <= i9 && i8 <= i12 && i7 <= i11 && i6 <= i10) {
                        iArr = iArr3;
                        z = false;
                    } else {
                        iArr = iArr3;
                        z = true;
                    }
                    if (i5 >= i9 && i8 >= i12 && i7 >= i11 && i6 >= i10) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z != z2) {
                        if (z) {
                            iArr4[0] = iArr4[0] | i2;
                        } else {
                            iArr[0] = iArr[0] | i2;
                        }
                    }
                    i2 <<= 1;
                    iArr2 = iArr4;
                    iArr3 = iArr;
                }
                int i13 = iArr2[0];
                int i14 = iArr3[0];
                int i15 = i13 | i14;
                if (i15 == 0) {
                    this.b = c;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                } else {
                    v57 v57Var3 = this.b;
                    if ((i13 & 8) != 0) {
                        interpolator = y47.e;
                    } else if ((i14 & 8) != 0) {
                        interpolator = y47.f;
                    } else if ((i13 & 519) != 0) {
                        interpolator = y47.g;
                    } else if ((i14 & 519) != 0) {
                        interpolator = y47.h;
                    } else {
                        interpolator = null;
                    }
                    if ((i15 & 8) != 0) {
                        j = 160;
                    } else {
                        j = 250;
                    }
                    c57 c57Var = new c57(i15, interpolator, j);
                    c57Var.a.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c57Var.a.b());
                    yz2 i16 = s57Var.i(i15);
                    yz2 i17 = v57Var3.a.i(i15);
                    int min = Math.min(i16.a, i17.a);
                    int i18 = i16.b;
                    int i19 = i17.b;
                    int min2 = Math.min(i18, i19);
                    int i20 = i16.c;
                    int i21 = i17.c;
                    int min3 = Math.min(i20, i21);
                    int i22 = i16.d;
                    int i23 = i17.d;
                    l33 l33Var = new l33((Object) yz2.b(min, min2, min3, Math.min(i22, i23)), (Object) yz2.b(Math.max(i16.a, i17.a), Math.max(i18, i19), Math.max(i20, i21), Math.max(i22, i23)), (byte) 25);
                    y47.g(view, c57Var, c, false);
                    duration.addUpdateListener(new u47(c57Var, c, v57Var3, i15, view));
                    duration.addListener(new v47(c57Var, view));
                    w47 w47Var = new w47(view, c57Var, l33Var, duration, (byte) 0);
                    if (view != null) {
                        oe4 oe4Var = new oe4(view, w47Var);
                        view.getViewTreeObserver().addOnPreDrawListener(oe4Var);
                        view.addOnAttachStateChangeListener(oe4Var);
                    } else {
                        qi2.m("view == null");
                    }
                    this.b = c;
                    if (view.getTag(R.id.tag_on_apply_window_listener) == null) {
                        return view.onApplyWindowInsets(windowInsets);
                    }
                }
            }
        }
        return windowInsets;
    }
}
