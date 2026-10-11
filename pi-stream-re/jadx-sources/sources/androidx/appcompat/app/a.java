package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.g4;
import androidx.appcompat.widget.l4;
import androidx.fragment.app.b0;
import c0.i;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import f.g0;
import f.k;
import f.l;
import f.m;
import f.n0;
import f.q;
import f.u0;
import f.x;
import f0.b;
import i.e;
import java.util.ArrayList;
import msr.pistream.app.R;
import r6.h0;
import w.g;
import w.p;
import x.j;

/* loaded from: classes.dex */
public abstract class a extends b0 implements m {

    /* renamed from: a, reason: collision with root package name */
    public g0 f292a;

    public a() {
        getSavedStateRegistry().c("androidx:appcompat", new k((g8.a) this));
        addOnContextAvailableListener(new l(this, 0));
    }

    @Override // f.m
    public final void a() {
    }

    @Override // androidx.activity.j, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        k().a(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(final Context context) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        g0 g0Var = (g0) k();
        boolean z9 = true;
        g0Var.f3685g0 = true;
        int i18 = g0Var.f3689k0;
        if (i18 == -100) {
            i18 = q.f3764b;
        }
        int E = g0Var.E(context, i18);
        if (q.d(context) && q.d(context)) {
            if (d.G()) {
                if (!q.f3768f) {
                    q.f3763a.execute(new Runnable() { // from class: f.n
                        /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
                        
                            if (r5 != null) goto L23;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                r7 = this;
                                int r0 = android.os.Build.VERSION.SDK_INT
                                r1 = 33
                                r2 = 1
                                if (r0 < r1) goto L84
                                android.content.ComponentName r0 = new android.content.ComponentName
                                android.content.Context r1 = r1
                                java.lang.String r3 = "androidx.appcompat.app.AppLocalesMetadataHolderService"
                                r0.<init>(r1, r3)
                                android.content.pm.PackageManager r3 = r1.getPackageManager()
                                int r3 = r3.getComponentEnabledSetting(r0)
                                if (r3 == r2) goto L84
                                boolean r3 = com.bumptech.glide.d.G()
                                java.lang.String r4 = "locale"
                                if (r3 == 0) goto L5d
                                n.f r3 = f.q.f3769x
                                r3.getClass()
                                n.a r5 = new n.a
                                r5.<init>(r3)
                            L2c:
                                boolean r3 = r5.hasNext()
                                if (r3 == 0) goto L4b
                                java.lang.Object r3 = r5.next()
                                java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
                                java.lang.Object r3 = r3.get()
                                f.q r3 = (f.q) r3
                                if (r3 == 0) goto L2c
                                f.g0 r3 = (f.g0) r3
                                android.content.Context r3 = r3.B
                                if (r3 == 0) goto L2c
                                java.lang.Object r3 = r3.getSystemService(r4)
                                goto L4c
                            L4b:
                                r3 = 0
                            L4c:
                                if (r3 == 0) goto L62
                                android.os.LocaleList r3 = f.p.a(r3)
                                c0.i r5 = new c0.i
                                c0.l r6 = new c0.l
                                r6.<init>(r3)
                                r5.<init>(r6)
                                goto L64
                            L5d:
                                c0.i r5 = f.q.f3765c
                                if (r5 == 0) goto L62
                                goto L64
                            L62:
                                c0.i r5 = c0.i.f1607b
                            L64:
                                c0.k r3 = r5.f1608a
                                boolean r3 = r3.isEmpty()
                                if (r3 == 0) goto L7d
                                java.lang.String r3 = com.bumptech.glide.d.V(r1)
                                java.lang.Object r4 = r1.getSystemService(r4)
                                if (r4 == 0) goto L7d
                                android.os.LocaleList r3 = f.o.a(r3)
                                f.p.b(r4, r3)
                            L7d:
                                android.content.pm.PackageManager r1 = r1.getPackageManager()
                                r1.setComponentEnabledSetting(r0, r2, r2)
                            L84:
                                f.q.f3768f = r2
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: f.n.run():void");
                        }
                    });
                }
            } else {
                synchronized (q.f3771z) {
                    i iVar = q.f3765c;
                    if (iVar == null) {
                        if (q.f3766d == null) {
                            q.f3766d = i.b(d.V(context));
                        }
                        if (!q.f3766d.f1608a.isEmpty()) {
                            q.f3765c = q.f3766d;
                        }
                    } else if (!iVar.equals(q.f3766d)) {
                        i iVar2 = q.f3765c;
                        q.f3766d = iVar2;
                        d.Q(context, iVar2.f1608a.a());
                    }
                }
            }
        }
        i o = g0.o(context);
        boolean z10 = false;
        Configuration configuration = null;
        if (g0.C0 && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(g0.u(context, E, o, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof e) {
            try {
                ((e) context).a(g0.u(context, E, o, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (g0.B0) {
            int i19 = Build.VERSION.SDK_INT;
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f10 = configuration3.fontScale;
                    float f11 = configuration4.fontScale;
                    if (f10 != f11) {
                        configuration.fontScale = f11;
                    }
                    int i20 = configuration3.mcc;
                    int i21 = configuration4.mcc;
                    if (i20 != i21) {
                        configuration.mcc = i21;
                    }
                    int i22 = configuration3.mnc;
                    int i23 = configuration4.mnc;
                    if (i22 != i23) {
                        configuration.mnc = i23;
                    }
                    if (i19 >= 24) {
                        x.a(configuration3, configuration4, configuration);
                    } else if (!b.a(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i24 = configuration3.touchscreen;
                    int i25 = configuration4.touchscreen;
                    if (i24 != i25) {
                        configuration.touchscreen = i25;
                    }
                    int i26 = configuration3.keyboard;
                    int i27 = configuration4.keyboard;
                    if (i26 != i27) {
                        configuration.keyboard = i27;
                    }
                    int i28 = configuration3.keyboardHidden;
                    int i29 = configuration4.keyboardHidden;
                    if (i28 != i29) {
                        configuration.keyboardHidden = i29;
                    }
                    int i30 = configuration3.navigation;
                    int i31 = configuration4.navigation;
                    if (i30 != i31) {
                        configuration.navigation = i31;
                    }
                    int i32 = configuration3.navigationHidden;
                    int i33 = configuration4.navigationHidden;
                    if (i32 != i33) {
                        configuration.navigationHidden = i33;
                    }
                    int i34 = configuration3.orientation;
                    int i35 = configuration4.orientation;
                    if (i34 != i35) {
                        configuration.orientation = i35;
                    }
                    int i36 = configuration3.screenLayout & 15;
                    int i37 = configuration4.screenLayout & 15;
                    if (i36 != i37) {
                        configuration.screenLayout |= i37;
                    }
                    int i38 = configuration3.screenLayout & 192;
                    int i39 = configuration4.screenLayout & 192;
                    if (i38 != i39) {
                        configuration.screenLayout |= i39;
                    }
                    int i40 = configuration3.screenLayout & 48;
                    int i41 = configuration4.screenLayout & 48;
                    if (i40 != i41) {
                        configuration.screenLayout |= i41;
                    }
                    int i42 = configuration3.screenLayout & 768;
                    int i43 = configuration4.screenLayout & 768;
                    if (i42 != i43) {
                        configuration.screenLayout |= i43;
                    }
                    if (i19 >= 26) {
                        i10 = configuration3.colorMode;
                        int i44 = i10 & 3;
                        i11 = configuration4.colorMode;
                        if (i44 != (i11 & 3)) {
                            i16 = configuration.colorMode;
                            i17 = configuration4.colorMode;
                            configuration.colorMode = i16 | (i17 & 3);
                        }
                        i12 = configuration3.colorMode;
                        int i45 = i12 & 12;
                        i13 = configuration4.colorMode;
                        if (i45 != (i13 & 12)) {
                            i14 = configuration.colorMode;
                            i15 = configuration4.colorMode;
                            configuration.colorMode = i14 | (i15 & 12);
                        }
                    }
                    int i46 = configuration3.uiMode & 15;
                    int i47 = configuration4.uiMode & 15;
                    if (i46 != i47) {
                        configuration.uiMode |= i47;
                    }
                    int i48 = configuration3.uiMode & 48;
                    int i49 = configuration4.uiMode & 48;
                    if (i48 != i49) {
                        configuration.uiMode |= i49;
                    }
                    int i50 = configuration3.screenWidthDp;
                    int i51 = configuration4.screenWidthDp;
                    if (i50 != i51) {
                        configuration.screenWidthDp = i51;
                    }
                    int i52 = configuration3.screenHeightDp;
                    int i53 = configuration4.screenHeightDp;
                    if (i52 != i53) {
                        configuration.screenHeightDp = i53;
                    }
                    int i54 = configuration3.smallestScreenWidthDp;
                    int i55 = configuration4.smallestScreenWidthDp;
                    if (i54 != i55) {
                        configuration.smallestScreenWidthDp = i55;
                    }
                    int i56 = configuration3.densityDpi;
                    int i57 = configuration4.densityDpi;
                    if (i56 != i57) {
                        configuration.densityDpi = i57;
                    }
                }
            }
            Configuration u9 = g0.u(context, E, o, configuration, true);
            e eVar = new e(context, R.style.Theme_AppCompat_Empty);
            eVar.a(u9);
            try {
                if (context.getTheme() == null) {
                    z9 = false;
                }
                z10 = z9;
            } catch (NullPointerException unused3) {
            }
            if (z10) {
                c.c0(eVar.getTheme());
            }
            context = eVar;
        }
        super.attachBaseContext(context);
    }

    @Override // f.m
    public final void b() {
    }

    @Override // f.m
    public final void c() {
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((g0) k()).D();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // w.n, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((g0) k()).D();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i10) {
        g0 g0Var = (g0) k();
        g0Var.x();
        return g0Var.C.findViewById(i10);
    }

    public final void g() {
        j5.a.e0(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        h0.u(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView2 = getWindow().getDecorView();
        h0.u(decorView2, "<this>");
        decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        j5.a.d0(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        g0 g0Var = (g0) k();
        if (g0Var.G == null) {
            g0Var.D();
            u0 u0Var = g0Var.F;
            if (u0Var != null) {
                context = u0Var.p0();
            } else {
                context = g0Var.B;
            }
            g0Var.G = new i.k(context);
        }
        return g0Var.G;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i10 = l4.f562a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        k().c();
    }

    public final q k() {
        if (this.f292a == null) {
            n0 n0Var = q.f3763a;
            this.f292a = new g0(this, null, this, this);
        }
        return this.f292a;
    }

    @Override // androidx.activity.j, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g0 g0Var = (g0) k();
        if (g0Var.X && g0Var.R) {
            g0Var.D();
            u0 u0Var = g0Var.F;
            if (u0Var != null) {
                u0Var.s0(u0Var.C.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        androidx.appcompat.widget.x a10 = androidx.appcompat.widget.x.a();
        Context context = g0Var.B;
        synchronized (a10) {
            a10.f699a.k(context);
        }
        g0Var.f3688j0 = new Configuration(g0Var.B.getResources().getConfiguration());
        g0Var.m(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // androidx.fragment.app.b0, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        k().f();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i10, KeyEvent keyEvent) {
        boolean z9;
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // androidx.fragment.app.b0, androidx.activity.j, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Intent z9;
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        g0 g0Var = (g0) k();
        g0Var.D();
        u0 u0Var = g0Var.F;
        if (menuItem.getItemId() == 16908332 && u0Var != null && (((g4) u0Var.G).f497b & 4) != 0 && (z9 = j5.a.z(this)) != null) {
            if (p.c(this, z9)) {
                ArrayList arrayList = new ArrayList();
                Intent z10 = j5.a.z(this);
                if (z10 == null) {
                    z10 = j5.a.z(this);
                }
                if (z10 != null) {
                    ComponentName component = z10.getComponent();
                    if (component == null) {
                        component = z10.resolveActivity(getPackageManager());
                    }
                    int size = arrayList.size();
                    try {
                        Intent A = j5.a.A(this, component);
                        while (A != null) {
                            arrayList.add(size, A);
                            A = j5.a.A(this, A.getComponent());
                        }
                        arrayList.add(z10);
                    } catch (PackageManager.NameNotFoundException e10) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e10);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    if (!j.startActivities(this, intentArr, null)) {
                        Intent intent = new Intent(intentArr[intentArr.length - 1]);
                        intent.addFlags(268435456);
                        startActivity(intent);
                    }
                    try {
                        int i11 = g.f10699a;
                        w.a.a(this);
                        return true;
                    } catch (IllegalStateException unused) {
                        finish();
                        return true;
                    }
                }
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            p.b(this, z9);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    @Override // androidx.activity.j, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((g0) k()).x();
    }

    @Override // androidx.fragment.app.b0, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        g0 g0Var = (g0) k();
        g0Var.D();
        u0 u0Var = g0Var.F;
        if (u0Var != null) {
            u0Var.V = true;
        }
    }

    @Override // androidx.fragment.app.b0, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((g0) k()).m(true, false);
    }

    @Override // androidx.fragment.app.b0, android.app.Activity
    public void onStop() {
        super.onStop();
        g0 g0Var = (g0) k();
        g0Var.D();
        u0 u0Var = g0Var.F;
        if (u0Var != null) {
            u0Var.V = false;
            i.m mVar = u0Var.U;
            if (mVar != null) {
                mVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        k().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((g0) k()).D();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.j, android.app.Activity
    public final void setContentView(int i10) {
        g();
        k().i(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        super.setTheme(i10);
        ((g0) k()).f3690l0 = i10;
    }

    @Override // androidx.fragment.app.b0
    public final void supportInvalidateOptionsMenu() {
        k().c();
    }

    @Override // androidx.activity.j, android.app.Activity
    public void setContentView(View view) {
        g();
        k().j(view);
    }

    @Override // androidx.activity.j, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g();
        k().k(view, layoutParams);
    }
}
