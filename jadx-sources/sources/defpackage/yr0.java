package defpackage;

import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.anistation.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class yr0 extends xr0 implements ew6, uj2, ga5, xd4, n74, j5 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final qr0 Companion = new Object();
    private cw6 _viewModelStore;
    private final f5 activityResultRegistry;
    private int contentLayoutId;
    private final rb3 defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final rb3 fullyDrawnReporter$delegate;
    private boolean hasPictureInPictureSystemFeature;
    private final AtomicInteger nextLocalRequestCode;
    private final rb3 onBackPressedDispatcher$delegate;
    private final rb3 onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<by0> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<by0> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<by0> onNewIntentListeners;
    private final CopyOnWriteArrayList<by0> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<by0> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<by0> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final tr0 reportFullyDrawnExecutor;
    private final fa5 savedStateRegistryController;
    private final nz0 contextAwareHelper = new nz0();
    private final kx3 menuHostHelper = new kx3(new lr0(this, (byte) 1));

    public yr0() {
        rq3 rq3Var = new rq3(this, new nj4(this, (byte) 12));
        this.savedStateRegistryController = new fa5(rq3Var);
        this.reportFullyDrawnExecutor = new ur0(this);
        this.fullyDrawnReporter$delegate = new d46(new mr0(this, (byte) 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new wr0(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = new d46(new mr0(this, (byte) 2));
        if (getLifecycle() != null) {
            final byte b = 0;
            getLifecycle().a(new lg3(this) { // from class: nr0
                public final /* synthetic */ yr0 y;

                {
                    this.y = this;
                }

                @Override // defpackage.lg3
                public final void onStateChanged(og3 og3Var, dg3 dg3Var) {
                    Window window;
                    View peekDecorView;
                    byte b2 = b;
                    yr0 yr0Var = this.y;
                    switch (b2) {
                        case 0:
                            if (dg3Var == dg3.ON_STOP && (window = yr0Var.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            yr0.a(yr0Var, og3Var, dg3Var);
                            return;
                    }
                }
            });
            final byte b2 = 1;
            getLifecycle().a(new lg3(this) { // from class: nr0
                public final /* synthetic */ yr0 y;

                {
                    this.y = this;
                }

                @Override // defpackage.lg3
                public final void onStateChanged(og3 og3Var, dg3 dg3Var) {
                    Window window;
                    View peekDecorView;
                    byte b22 = b2;
                    yr0 yr0Var = this.y;
                    switch (b22) {
                        case 0:
                            if (dg3Var == dg3.ON_STOP && (window = yr0Var.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            yr0.a(yr0Var, og3Var, dg3Var);
                            return;
                    }
                }
            });
            getLifecycle().a(new m05(this, b2));
            rq3Var.a();
            w65.z(this);
            getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new or0(this, (byte) 0));
            addOnContextAvailableListener(new pr0(this));
            this.defaultViewModelProviderFactory$delegate = new d46(new mr0(this, (byte) 3));
            this.onBackPressedDispatcher$delegate = new d46(new mr0(this, (byte) 4));
            return;
        }
        ze0.m("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        throw null;
    }

    public static final void a(yr0 yr0Var, og3 og3Var, dg3 dg3Var) {
        if (dg3Var == dg3.ON_DESTROY) {
            yr0Var.contextAwareHelper.b = null;
            if (!yr0Var.isChangingConfigurations()) {
                yr0Var.getViewModelStore().a();
            }
            ur0 ur0Var = (ur0) yr0Var.reportFullyDrawnExecutor;
            yr0 yr0Var2 = ur0Var.A;
            yr0Var2.getWindow().getDecorView().removeCallbacks(ur0Var);
            yr0Var2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(ur0Var);
        }
    }

    public static final void access$ensureViewModelStore(yr0 yr0Var) {
        if (yr0Var._viewModelStore == null) {
            sr0 sr0Var = (sr0) yr0Var.getLastNonConfigurationInstance();
            if (sr0Var != null) {
                yr0Var._viewModelStore = sr0Var.b;
            }
            if (yr0Var._viewModelStore == null) {
                yr0Var._viewModelStore = new cw6();
            }
        }
    }

    public static final Bundle b(yr0 yr0Var) {
        Bundle bundle = new Bundle();
        f5 f5Var = yr0Var.activityResultRegistry;
        f5Var.getClass();
        LinkedHashMap linkedHashMap = f5Var.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(f5Var.d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(f5Var.g));
        return bundle;
    }

    public static final void c(yr0 yr0Var, yr0 yr0Var2) {
        yr0Var2.getClass();
        Bundle a = yr0Var.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a != null) {
            f5 f5Var = yr0Var.activityResultRegistry;
            LinkedHashMap linkedHashMap = f5Var.b;
            LinkedHashMap linkedHashMap2 = f5Var.a;
            Bundle bundle = f5Var.g;
            ArrayList<Integer> integerArrayList = a.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                ArrayList<String> stringArrayList2 = a.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                if (stringArrayList2 != null) {
                    f5Var.d.addAll(stringArrayList2);
                }
                Bundle bundle2 = a.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                int size = stringArrayList.size();
                for (int i = 0; i < size; i++) {
                    String str = stringArrayList.get(i);
                    if (linkedHashMap.containsKey(str)) {
                        Integer num = (Integer) linkedHashMap.remove(str);
                        if (!bundle.containsKey(str)) {
                            wk6.i(linkedHashMap2).remove(num);
                        }
                    }
                    Integer num2 = integerArrayList.get(i);
                    num2.getClass();
                    int intValue = num2.intValue();
                    String str2 = stringArrayList.get(i);
                    str2.getClass();
                    String str3 = str2;
                    linkedHashMap2.put(Integer.valueOf(intValue), str3);
                    f5Var.b.put(str3, Integer.valueOf(intValue));
                }
            }
        }
    }

    public static final rb2 d(yr0 yr0Var) {
        return new rb2(yr0Var.reportFullyDrawnExecutor, new mr0(yr0Var, (byte) 0));
    }

    public static final void e(yr0 yr0Var) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (a34.i(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
            } else {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!a34.i(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        tr0 tr0Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ur0) tr0Var).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(qx3 qx3Var, og3 og3Var) {
        qx3Var.getClass();
        og3Var.getClass();
        kx3 kx3Var = this.menuHostHelper;
        kx3Var.b.add(qx3Var);
        kx3Var.a.run();
        fg3 lifecycle = og3Var.getLifecycle();
        HashMap hashMap = kx3Var.c;
        jx3 jx3Var = (jx3) hashMap.remove(qx3Var);
        if (jx3Var != null) {
            jx3Var.a.b(jx3Var.b);
            jx3Var.b = null;
        }
        hashMap.put(qx3Var, new jx3(lifecycle, new bj(kx3Var, qx3Var, (byte) 2)));
    }

    public final void addOnConfigurationChangedListener(by0 by0Var) {
        by0Var.getClass();
        this.onConfigurationChangedListeners.add(by0Var);
    }

    public final void addOnContextAvailableListener(be4 be4Var) {
        be4Var.getClass();
        nz0 nz0Var = this.contextAwareHelper;
        nz0Var.getClass();
        yr0 yr0Var = nz0Var.b;
        if (yr0Var != null) {
            c(((pr0) be4Var).a, yr0Var);
        }
        nz0Var.a.add(be4Var);
    }

    public final void addOnMultiWindowModeChangedListener(by0 by0Var) {
        by0Var.getClass();
        this.onMultiWindowModeChangedListeners.add(by0Var);
    }

    public final void addOnNewIntentListener(by0 by0Var) {
        by0Var.getClass();
        this.onNewIntentListeners.add(by0Var);
    }

    public final void addOnPictureInPictureModeChangedListener(by0 by0Var) {
        by0Var.getClass();
        this.onPictureInPictureModeChangedListeners.add(by0Var);
    }

    public final void addOnPictureInPictureUiStateChangedListener(by0 by0Var) {
        by0Var.getClass();
        this.onPictureInPictureUiStateChangedListeners.add(by0Var);
    }

    public final void addOnTrimMemoryListener(by0 by0Var) {
        by0Var.getClass();
        this.onTrimMemoryListeners.add(by0Var);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final void enterPictureInPictureMode(ul4 ul4Var) {
        throw null;
    }

    @Override // defpackage.j5
    public final f5 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // defpackage.uj2
    public j21 getDefaultViewModelCreationExtras() {
        Bundle bundle;
        o34 o34Var = new o34(i21.b);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = o34Var.a;
        if (application != null) {
            linkedHashMap.put(xv6.d, getApplication());
        }
        linkedHashMap.put(w65.k, this);
        linkedHashMap.put(w65.l, this);
        Intent intent = getIntent();
        if (intent != null) {
            bundle = intent.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            linkedHashMap.put(w65.m, bundle);
        }
        return o34Var;
    }

    @Override // defpackage.uj2
    public yv6 getDefaultViewModelProviderFactory() {
        return (yv6) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public rb2 getFullyDrawnReporter() {
        return (rb2) this.fullyDrawnReporter$delegate.getValue();
    }

    @de1
    public Object getLastCustomNonConfigurationInstance() {
        sr0 sr0Var = (sr0) getLastNonConfigurationInstance();
        if (sr0Var != null) {
            return sr0Var.a;
        }
        return null;
    }

    @Override // defpackage.xr0, defpackage.og3
    public fg3 getLifecycle() {
        return super.getLifecycle();
    }

    @Override // defpackage.n74
    public m74 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().b().c;
    }

    @Override // defpackage.xd4
    public final wd4 getOnBackPressedDispatcher() {
        return (wd4) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // defpackage.ga5
    public final ea5 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.ew6
    public cw6 getViewModelStore() {
        if (getApplication() != null) {
            cw6 cw6Var = this._viewModelStore;
            if (cw6Var == null) {
                sr0 sr0Var = (sr0) getLastNonConfigurationInstance();
                if (sr0Var != null) {
                    this._viewModelStore = sr0Var.b;
                }
                cw6Var = this._viewModelStore;
                if (cw6Var == null) {
                    cw6Var = new cw6();
                    this._viewModelStore = cw6Var;
                }
            }
            cw6Var.getClass();
            return cw6Var;
        }
        ze0.m("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        return null;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @de1
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.activityResultRegistry.a(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    @de1
    public void onBackPressed() {
        ((sg1) this.onBackPressedInput$delegate.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<by0> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // defpackage.xr0, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        nz0 nz0Var = this.contextAwareHelper;
        nz0Var.getClass();
        nz0Var.b = this;
        Iterator it = nz0Var.a.iterator();
        while (it.hasNext()) {
            c(((pr0) ((be4) it.next())).a, this);
        }
        super.onCreate(bundle);
        int i = h35.x;
        f35.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            kx3 kx3Var = this.menuHostHelper;
            getMenuInflater();
            Iterator it = kx3Var.b.iterator();
            while (it.hasNext()) {
                ((pa2) ((qx3) it.next())).a.c();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (!super.onMenuItemSelected(i, menuItem)) {
            if (i == 0) {
                Iterator it = this.menuHostHelper.b.iterator();
                while (it.hasNext()) {
                    if (((pa2) ((qx3) it.next())).a.f()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<by0> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new w24(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<by0> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.b.iterator();
        while (it.hasNext()) {
            ((pa2) ((qx3) it.next())).a.g();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<by0> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new tl4(z));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        i18 i18Var;
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i = Build.VERSION.SDK_INT;
        byte b = 27;
        if (i >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            i18Var = new i18(b);
        } else if (i >= 31) {
            pictureInPictureUiState.isStashed();
            i18Var = new i18(b);
        } else {
            i18Var = new i18(b);
        }
        Iterator<by0> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(i18Var);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            Iterator it = this.menuHostHelper.b.iterator();
            while (it.hasNext()) {
                ((pa2) ((qx3) it.next())).a.i();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @de1
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (!this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @de1
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [sr0, java.lang.Object] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        sr0 sr0Var;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        cw6 cw6Var = this._viewModelStore;
        if (cw6Var == null && (sr0Var = (sr0) getLastNonConfigurationInstance()) != null) {
            cw6Var = sr0Var.b;
        }
        if (cw6Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        ?? obj = new Object();
        obj.a = onRetainCustomNonConfigurationInstance;
        obj.b = cw6Var;
        return obj;
    }

    @Override // defpackage.xr0, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof rg3) {
            fg3 lifecycle = getLifecycle();
            lifecycle.getClass();
            rg3 rg3Var = (rg3) lifecycle;
            rg3Var.d("setCurrentState");
            rg3Var.f(eg3.z);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.b(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<by0> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> z4 registerForActivityResult(final x4 x4Var, final f5 f5Var, final v4 v4Var) {
        x4Var.getClass();
        f5Var.getClass();
        v4Var.getClass();
        final String str = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        LinkedHashMap linkedHashMap = f5Var.c;
        fg3 lifecycle = getLifecycle();
        if (((rg3) lifecycle).i.compareTo(eg3.A) < 0) {
            f5Var.c(str);
            d5 d5Var = (d5) linkedHashMap.get(str);
            if (d5Var == null) {
                d5Var = new d5(lifecycle);
            }
            lg3 lg3Var = new lg3() { // from class: b5
                @Override // defpackage.lg3
                public final void onStateChanged(og3 og3Var, dg3 dg3Var) {
                    f5 f5Var2 = f5.this;
                    LinkedHashMap linkedHashMap2 = f5Var2.e;
                    dg3 dg3Var2 = dg3.ON_START;
                    String str2 = str;
                    if (dg3Var2 == dg3Var) {
                        Bundle bundle = f5Var2.g;
                        LinkedHashMap linkedHashMap3 = f5Var2.f;
                        x4 x4Var2 = x4Var;
                        v4 v4Var2 = v4Var;
                        linkedHashMap2.put(str2, new c5(x4Var2, v4Var2));
                        if (linkedHashMap3.containsKey(str2)) {
                            Object obj = linkedHashMap3.get(str2);
                            linkedHashMap3.remove(str2);
                            v4Var2.c(obj);
                        }
                        u4 u4Var = (u4) nx7.G(bundle, str2);
                        if (u4Var != null) {
                            bundle.remove(str2);
                            v4Var2.c(x4Var2.c(u4Var.x, u4Var.y));
                            return;
                        }
                        return;
                    }
                    if (dg3.ON_STOP == dg3Var) {
                        linkedHashMap2.remove(str2);
                    } else if (dg3.ON_DESTROY == dg3Var) {
                        f5Var2.d(str2);
                    }
                }
            };
            d5Var.a.a(lg3Var);
            d5Var.b.add(lg3Var);
            linkedHashMap.put(str, d5Var);
            return new e5(f5Var, str, x4Var, (byte) 0);
        }
        StringBuilder sb = new StringBuilder("LifecycleOwner ");
        sb.append(this);
        eg3 eg3Var = ((rg3) lifecycle).i;
        sb.append(" is attempting to register while current state is ");
        sb.append(eg3Var);
        sb.append(". LifecycleOwners must call register before they are STARTED.");
        throw new IllegalStateException(sb.toString().toString());
    }

    public void removeMenuProvider(qx3 qx3Var) {
        qx3Var.getClass();
        this.menuHostHelper.a(qx3Var);
    }

    public final void removeOnConfigurationChangedListener(by0 by0Var) {
        by0Var.getClass();
        this.onConfigurationChangedListeners.remove(by0Var);
    }

    public final void removeOnContextAvailableListener(be4 be4Var) {
        be4Var.getClass();
        nz0 nz0Var = this.contextAwareHelper;
        nz0Var.getClass();
        nz0Var.a.remove(be4Var);
    }

    public final void removeOnMultiWindowModeChangedListener(by0 by0Var) {
        by0Var.getClass();
        this.onMultiWindowModeChangedListeners.remove(by0Var);
    }

    public final void removeOnNewIntentListener(by0 by0Var) {
        by0Var.getClass();
        this.onNewIntentListeners.remove(by0Var);
    }

    public final void removeOnPictureInPictureModeChangedListener(by0 by0Var) {
        by0Var.getClass();
        this.onPictureInPictureModeChangedListeners.remove(by0Var);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(by0 by0Var) {
        by0Var.getClass();
        this.onPictureInPictureUiStateChangedListeners.remove(by0Var);
    }

    public final void removeOnTrimMemoryListener(by0 by0Var) {
        by0Var.getClass();
        this.onTrimMemoryListeners.remove(by0Var);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (qg6.a()) {
                Trace.beginSection(it5.f("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            rb2 fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.a) {
                try {
                    fullyDrawnReporter.b = true;
                    ArrayList arrayList = fullyDrawnReporter.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((sb2) obj).invoke();
                    }
                    fullyDrawnReporter.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        tr0 tr0Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ur0) tr0Var).a(decorView);
        super.setContentView(i);
    }

    public final void setPictureInPictureParams(ul4 ul4Var) {
        throw null;
    }

    @Override // android.app.Activity
    @de1
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @de1
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @de1
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @de1
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        tr0 tr0Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ur0) tr0Var).a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        tr0 tr0Var = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((ur0) tr0Var).a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @de1
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<by0> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new w24(z));
        }
    }

    @Override // android.app.Activity
    @de1
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<by0> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new tl4(z));
        }
    }

    public void addMenuProvider(qx3 qx3Var) {
        qx3Var.getClass();
        kx3 kx3Var = this.menuHostHelper;
        kx3Var.b.add(qx3Var);
        kx3Var.a.run();
    }

    public void addMenuProvider(qx3 qx3Var, og3 og3Var, eg3 eg3Var) {
        qx3Var.getClass();
        og3Var.getClass();
        eg3Var.getClass();
        kx3 kx3Var = this.menuHostHelper;
        kx3Var.getClass();
        fg3 lifecycle = og3Var.getLifecycle();
        HashMap hashMap = kx3Var.c;
        jx3 jx3Var = (jx3) hashMap.remove(qx3Var);
        if (jx3Var != null) {
            jx3Var.a.b(jx3Var.b);
            jx3Var.b = null;
        }
        hashMap.put(qx3Var, new jx3(lifecycle, new jg3(kx3Var, eg3Var, qx3Var, (byte) 1)));
    }

    public final <I, O> z4 registerForActivityResult(x4 x4Var, v4 v4Var) {
        x4Var.getClass();
        v4Var.getClass();
        return registerForActivityResult(x4Var, this.activityResultRegistry, v4Var);
    }
}
