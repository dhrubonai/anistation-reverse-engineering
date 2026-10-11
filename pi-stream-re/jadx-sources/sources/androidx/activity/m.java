package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.b0;
import androidx.lifecycle.u;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class m implements androidx.lifecycle.s {

    /* renamed from: b, reason: collision with root package name */
    public static int f271b;

    /* renamed from: c, reason: collision with root package name */
    public static Field f272c;

    /* renamed from: d, reason: collision with root package name */
    public static Field f273d;

    /* renamed from: e, reason: collision with root package name */
    public static Field f274e;

    /* renamed from: a, reason: collision with root package name */
    public final Activity f275a;

    public m(b0 b0Var) {
        this.f275a = b0Var;
    }

    @Override // androidx.lifecycle.s
    public final void onStateChanged(u uVar, androidx.lifecycle.n nVar) {
        if (nVar != androidx.lifecycle.n.ON_DESTROY) {
            return;
        }
        if (f271b == 0) {
            try {
                f271b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f273d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f274e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f272c = declaredField3;
                declaredField3.setAccessible(true);
                f271b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f271b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f275a.getSystemService("input_method");
            try {
                Object obj = f272c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f273d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f274e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
