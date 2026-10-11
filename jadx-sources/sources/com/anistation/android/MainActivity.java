package com.anistation.android;

import android.R;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.anistation.android.MainActivity;
import com.anistation.model.settings.ThemeMode;
import com.discord.socialsdk.DiscordSocialSdkInit;
import defpackage.a34;
import defpackage.bx7;
import defpackage.ch1;
import defpackage.e46;
import defpackage.fr1;
import defpackage.gr1;
import defpackage.hr1;
import defpackage.ir1;
import defpackage.iw5;
import defpackage.jf3;
import defpackage.kr1;
import defpackage.nm3;
import defpackage.om3;
import defpackage.os0;
import defpackage.pm3;
import defpackage.qs5;
import defpackage.rb3;
import defpackage.rz5;
import defpackage.sn3;
import defpackage.ss5;
import defpackage.sx5;
import defpackage.ti4;
import defpackage.u64;
import defpackage.ub2;
import defpackage.ut0;
import defpackage.xt5;
import defpackage.y45;
import defpackage.yo0;
import defpackage.yr0;
import defpackage.ze0;
import defpackage.zr0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MainActivity extends yr0 {
    public static final /* synthetic */ int B = 0;
    public ThemeMode A;
    public final ti4 x = xt5.g(null);
    public final rb3 y;
    public final rb3 z;

    public MainActivity() {
        pm3 pm3Var = new pm3(this, (byte) 0);
        jf3 jf3Var = jf3.x;
        this.y = bx7.B(jf3Var, pm3Var);
        this.z = bx7.B(jf3Var, new pm3(this, (byte) 1));
        this.A = ThemeMode.DARK;
    }

    public static String g(Intent intent) {
        Uri data;
        if (intent != null && (data = intent.getData()) != null) {
            if (a34.i(data.getHost(), "anistation.top") || a34.i(data.getHost(), "www.anistation.top")) {
                List<String> pathSegments = data.getPathSegments();
                pathSegments.getClass();
                if (!a34.i(yo0.n0(0, pathSegments), "anime")) {
                    List<String> pathSegments2 = data.getPathSegments();
                    pathSegments2.getClass();
                    if (!a34.i(yo0.n0(0, pathSegments2), "details")) {
                        return null;
                    }
                }
                List<String> pathSegments3 = data.getPathSegments();
                pathSegments3.getClass();
                return (String) yo0.n0(1, pathSegments3);
            }
            return null;
        }
        return null;
    }

    public final boolean f(Resources resources) {
        int i = om3.a[this.A.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ze0.l();
                    return false;
                }
                return true;
            }
            return false;
        }
        if ((resources.getConfiguration().uiMode & 48) != 32) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yr0, defpackage.xr0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        sn3 sn3Var;
        Object y45Var;
        boolean z;
        Method[] methods;
        int i;
        Object obj;
        ut0 ut0Var;
        kr1 kr1Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            sn3Var = new iw5(this);
        } else {
            sn3Var = new sn3((Object) this, (byte) 17);
        }
        sn3Var.J();
        final byte b = 0;
        e46 e46Var = new e46(new ub2(this) { // from class: mm3
            public final /* synthetic */ MainActivity y;

            {
                this.y = this;
            }

            @Override // defpackage.ub2
            public final Object invoke(Object obj2) {
                boolean f;
                byte b2 = b;
                MainActivity mainActivity = this.y;
                Resources resources = (Resources) obj2;
                switch (b2) {
                    case 0:
                        int i3 = MainActivity.B;
                        resources.getClass();
                        f = mainActivity.f(resources);
                        break;
                    default:
                        int i4 = MainActivity.B;
                        resources.getClass();
                        f = mainActivity.f(resources);
                        break;
                }
                return Boolean.valueOf(f);
            }
        });
        final byte b2 = 1;
        e46 e46Var2 = new e46(new ub2(this) { // from class: mm3
            public final /* synthetic */ MainActivity y;

            {
                this.y = this;
            }

            @Override // defpackage.ub2
            public final Object invoke(Object obj2) {
                boolean f;
                byte b22 = b2;
                MainActivity mainActivity = this.y;
                Resources resources = (Resources) obj2;
                switch (b22) {
                    case 0:
                        int i3 = MainActivity.B;
                        resources.getClass();
                        f = mainActivity.f(resources);
                        break;
                    default:
                        int i4 = MainActivity.B;
                        resources.getClass();
                        f = mainActivity.f(resources);
                        break;
                }
                return Boolean.valueOf(f);
            }
        });
        kr1 kr1Var2 = hr1.a;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        kr1 kr1Var3 = hr1.a;
        if (kr1Var3 == null) {
            if (i2 >= 35) {
                kr1Var = new Object();
            } else if (i2 >= 30) {
                kr1Var = new Object();
            } else {
                kr1Var = new Object();
            }
            kr1Var3 = kr1Var;
            hr1.a = kr1Var3;
        }
        kr1 kr1Var4 = kr1Var3;
        fr1 fr1Var = new fr1(kr1Var4, e46Var, e46Var2, this, decorView, (byte) 0);
        ViewGroup viewGroup = (ViewGroup) decorView;
        int i3 = 0;
        while (true) {
            if (i3 < viewGroup.getChildCount()) {
                int i4 = i3 + 1;
                View childAt = viewGroup.getChildAt(i3);
                if (childAt != null) {
                    if (childAt.getTag() instanceof ir1) {
                        break;
                    } else {
                        i3 = i4;
                    }
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                gr1 gr1Var = new gr1(fr1Var, viewGroup.getContext());
                gr1Var.setTag(kr1Var4);
                gr1Var.setVisibility(8);
                gr1Var.setWillNotDraw(true);
                viewGroup.addView(gr1Var);
                break;
            }
        }
        fr1Var.run();
        Window window = getWindow();
        window.getClass();
        kr1Var4.a(window);
        super.onCreate(bundle);
        ch1 ch1Var = (ch1) this.z.getValue();
        ch1Var.getClass();
        sx5 sx5Var = ch1Var.d;
        u64 u64Var = ch1Var.b;
        u64Var.getClass();
        if (!u64Var.f) {
            z = false;
        } else {
            try {
                int i5 = DiscordSocialSdkInit.a;
                methods = DiscordSocialSdkInit.class.getMethods();
                methods.getClass();
            } catch (Throwable th) {
                y45Var = new y45(th);
            }
            for (Method method : methods) {
                if (a34.i(method.getName(), "setEngineActivity") && method.getParameterCount() == 1) {
                    if (Modifier.isStatic(method.getModifiers())) {
                        obj = null;
                    } else {
                        obj = DiscordSocialSdkInit.class.getField("INSTANCE").get(null);
                    }
                    y45Var = method.invoke(obj, this);
                    u64Var.e = !(y45Var instanceof y45);
                    z = u64Var.e;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        Boolean valueOf = Boolean.valueOf(z);
        sx5Var.getClass();
        sx5Var.l(null, valueOf);
        this.x.setValue(g(getIntent()));
        os0 os0Var = new os0(168424188, true, new nm3(this, b));
        ViewGroup.LayoutParams layoutParams = zr0.a;
        View childAt2 = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        if (childAt2 instanceof ut0) {
            ut0Var = (ut0) childAt2;
        } else {
            ut0Var = null;
        }
        if (ut0Var != null) {
            ut0Var.setParentCompositionContext(null);
            ut0Var.setContent(os0Var);
            return;
        }
        ut0 ut0Var2 = new ut0(this);
        ut0Var2.setParentCompositionContext(null);
        ut0Var2.setContent(os0Var);
        View decorView2 = getWindow().getDecorView();
        if (rz5.c(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_lifecycle_owner, this);
        }
        if (ss5.d(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (qs5.f(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(ut0Var2, zr0.a);
    }

    @Override // defpackage.yr0, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        String g = g(intent);
        if (g != null) {
            this.x.setValue(g);
        }
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        sx5 sx5Var = ((ch1) this.z.getValue()).c;
        Boolean bool = Boolean.TRUE;
        sx5Var.getClass();
        sx5Var.l(null, bool);
    }

    @Override // android.app.Activity
    public final void onStop() {
        sx5 sx5Var = ((ch1) this.z.getValue()).c;
        Boolean bool = Boolean.FALSE;
        sx5Var.getClass();
        sx5Var.l(null, bool);
        super.onStop();
    }
}
