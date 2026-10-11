package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
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
import androidx.fragment.app.b0;
import androidx.fragment.app.l0;
import androidx.lifecycle.b1;
import androidx.lifecycle.c1;
import androidx.lifecycle.m0;
import androidx.lifecycle.q0;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.y0;
import g0.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import msr.pistream.app.R;
import r6.h0;
import w.v;
import w.w;
import w.x;

/* loaded from: classes.dex */
public abstract class j extends w.n implements c1, androidx.lifecycle.j, n3.g, s, c.i, x.n, x.o, v, w, g0.n {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final c.h mActivityResultRegistry;
    private int mContentLayoutId;
    private y0 mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    private final g0.r mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final r mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<f0.a> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<f0.a> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<f0.a> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<f0.a> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<f0.a> mOnTrimMemoryListeners;
    final n3.f mSavedStateRegistryController;
    private b1 mViewModelStore;
    final b.a mContextAwareHelper = new b.a();
    private final androidx.lifecycle.w mLifecycleRegistry = new androidx.lifecycle.w(this);

    public j() {
        int i10 = 0;
        this.mMenuHostHelper = new g0.r(new b(this, i10));
        n3.f fVar = new n3.f(this);
        this.mSavedStateRegistryController = fVar;
        b0 b0Var = (b0) this;
        this.mOnBackPressedDispatcher = new r(new e(b0Var));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new f(b0Var);
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            int i11 = Build.VERSION.SDK_INT;
            getLifecycle().a(new g(b0Var, 1));
            getLifecycle().a(new g(b0Var, i10));
            getLifecycle().a(new g(b0Var, 2));
            fVar.a();
            com.bumptech.glide.d.r(this);
            if (i11 <= 23) {
                getLifecycle().a(new m(b0Var));
            }
            getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new c(this, 0));
            addOnContextAvailableListener(new d(b0Var, 0));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public static void d(j jVar) {
        Bundle a10 = jVar.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a10 != null) {
            c.h hVar = jVar.mActivityResultRegistry;
            hVar.getClass();
            ArrayList<Integer> integerArrayList = a10.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                hVar.f1590e = a10.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                hVar.f1586a = (Random) a10.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                Bundle bundle = a10.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                Bundle bundle2 = hVar.f1593h;
                bundle2.putAll(bundle);
                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                    String str = stringArrayList.get(i10);
                    HashMap hashMap = hVar.f1588c;
                    boolean containsKey = hashMap.containsKey(str);
                    HashMap hashMap2 = hVar.f1587b;
                    if (containsKey) {
                        Integer num = (Integer) hashMap.remove(str);
                        if (!bundle2.containsKey(str)) {
                            hashMap2.remove(num);
                        }
                    }
                    int intValue = integerArrayList.get(i10).intValue();
                    String str2 = stringArrayList.get(i10);
                    hashMap2.put(Integer.valueOf(intValue), str2);
                    hashMap.put(str2, Integer.valueOf(intValue));
                }
            }
        }
    }

    public static Bundle f(j jVar) {
        jVar.getClass();
        Bundle bundle = new Bundle();
        c.h hVar = jVar.mActivityResultRegistry;
        hVar.getClass();
        HashMap hashMap = hVar.f1588c;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.f1590e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) hVar.f1593h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", hVar.f1586a);
        return bundle;
    }

    private void g() {
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
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        g();
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(t tVar) {
        g0.r rVar = this.mMenuHostHelper;
        rVar.f4248b.add(tVar);
        rVar.f4247a.run();
    }

    public final void addOnConfigurationChangedListener(f0.a aVar) {
        this.mOnConfigurationChangedListeners.add(aVar);
    }

    public final void addOnContextAvailableListener(b.b bVar) {
        b.a aVar = this.mContextAwareHelper;
        if (aVar.f1276b != null) {
            bVar.a(aVar.f1276b);
        }
        aVar.f1275a.add(bVar);
    }

    public final void addOnMultiWindowModeChangedListener(f0.a aVar) {
        this.mOnMultiWindowModeChangedListeners.add(aVar);
    }

    public final void addOnNewIntentListener(f0.a aVar) {
        this.mOnNewIntentListeners.add(aVar);
    }

    public final void addOnPictureInPictureModeChangedListener(f0.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.add(aVar);
    }

    public final void addOnTrimMemoryListener(f0.a aVar) {
        this.mOnTrimMemoryListeners.add(aVar);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            i iVar = (i) getLastNonConfigurationInstance();
            if (iVar != null) {
                this.mViewModelStore = iVar.f268b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new b1();
            }
        }
    }

    public final c.h getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.j
    public y0.c getDefaultViewModelCreationExtras() {
        y0.d dVar = new y0.d();
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f11463a;
        if (application != null) {
            linkedHashMap.put(q0.f1128a, getApplication());
        }
        linkedHashMap.put(com.bumptech.glide.d.f2186a, this);
        linkedHashMap.put(com.bumptech.glide.d.f2187b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(com.bumptech.glide.d.f2188c, getIntent().getExtras());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.j
    public y0 getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new u0(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        i iVar = (i) getLastNonConfigurationInstance();
        if (iVar != null) {
            return iVar.f267a;
        }
        return null;
    }

    @Override // androidx.lifecycle.u
    public androidx.lifecycle.p getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public final r getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // n3.g
    public final n3.e getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f8004b;
    }

    @Override // androidx.lifecycle.c1
    public b1 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (!this.mActivityResultRegistry.a(i10, i11, intent)) {
            super.onActivityResult(i10, i11, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<f0.a> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // w.n, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.b(bundle);
        b.a aVar = this.mContextAwareHelper;
        aVar.f1276b = this;
        Iterator it = aVar.f1275a.iterator();
        while (it.hasNext()) {
            ((b.b) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i10 = m0.f1109b;
        j6.e.s(this);
        if (com.bumptech.glide.d.G()) {
            r rVar = this.mOnBackPressedDispatcher;
            rVar.f288e = h.a(this);
            rVar.b();
        }
        int i11 = this.mContentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 == 0) {
            super.onCreatePanelMenu(i10, menu);
            g0.r rVar = this.mMenuHostHelper;
            getMenuInflater();
            Iterator it = rVar.f4248b.iterator();
            while (it.hasNext()) {
                ((l0) ((t) it.next())).f925a.j();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mMenuHostHelper.a();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z9) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<f0.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new w.o(z9));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<f0.a> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, Menu menu) {
        Iterator it = this.mMenuHostHelper.f4248b.iterator();
        while (it.hasNext()) {
            ((l0) ((t) it.next())).f925a.p();
        }
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z9) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<f0.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new x(z9));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, View view, Menu menu) {
        if (i10 == 0) {
            super.onPreparePanel(i10, view, menu);
            Iterator it = this.mMenuHostHelper.f4248b.iterator();
            while (it.hasNext()) {
                ((l0) ((t) it.next())).f925a.s();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.a(i10, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i10, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        i iVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        b1 b1Var = this.mViewModelStore;
        if (b1Var == null && (iVar = (i) getLastNonConfigurationInstance()) != null) {
            b1Var = iVar.f268b;
        }
        if (b1Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        i iVar2 = new i();
        iVar2.f267a = onRetainCustomNonConfigurationInstance;
        iVar2.f268b = b1Var;
        return iVar2;
    }

    @Override // w.n, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.p lifecycle = getLifecycle();
        if (lifecycle instanceof androidx.lifecycle.w) {
            ((androidx.lifecycle.w) lifecycle).g();
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<f0.a> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.f1276b;
    }

    public final <I, O> c.c registerForActivityResult(d.a aVar, c.h hVar, c.b bVar) {
        return hVar.c("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    public void removeMenuProvider(t tVar) {
        this.mMenuHostHelper.b(tVar);
    }

    public final void removeOnConfigurationChangedListener(f0.a aVar) {
        this.mOnConfigurationChangedListeners.remove(aVar);
    }

    public final void removeOnContextAvailableListener(b.b bVar) {
        this.mContextAwareHelper.f1275a.remove(bVar);
    }

    public final void removeOnMultiWindowModeChangedListener(f0.a aVar) {
        this.mOnMultiWindowModeChangedListeners.remove(aVar);
    }

    public final void removeOnNewIntentListener(f0.a aVar) {
        this.mOnNewIntentListeners.remove(aVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(f0.a aVar) {
        this.mOnPictureInPictureModeChangedListeners.remove(aVar);
    }

    public final void removeOnTrimMemoryListener(f0.a aVar) {
        this.mOnTrimMemoryListeners.remove(aVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (j5.a.I()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i10) {
        g();
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i10, Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        g();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z9, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z9, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<f0.a> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new w.o(z9, 0));
            }
        } catch (Throwable th) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z9, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z9, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<f0.a> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new x(z9, 0));
            }
        } catch (Throwable th) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    public final <I, O> c.c registerForActivityResult(d.a aVar, c.b bVar) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, bVar);
    }

    public void addMenuProvider(final t tVar, u uVar) {
        final g0.r rVar = this.mMenuHostHelper;
        rVar.f4248b.add(tVar);
        rVar.f4247a.run();
        androidx.lifecycle.p lifecycle = uVar.getLifecycle();
        HashMap hashMap = rVar.f4249c;
        g0.q qVar = (g0.q) hashMap.remove(tVar);
        if (qVar != null) {
            qVar.f4240a.b(qVar.f4241b);
            qVar.f4241b = null;
        }
        hashMap.put(tVar, new g0.q(lifecycle, new androidx.lifecycle.s() { // from class: g0.o
            @Override // androidx.lifecycle.s
            public final void onStateChanged(androidx.lifecycle.u uVar2, androidx.lifecycle.n nVar) {
                androidx.lifecycle.n nVar2 = androidx.lifecycle.n.ON_DESTROY;
                r rVar2 = r.this;
                if (nVar == nVar2) {
                    rVar2.b(tVar);
                } else {
                    rVar2.getClass();
                }
            }
        }));
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        g();
        super.setContentView(view, layoutParams);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(final t tVar, u uVar, final androidx.lifecycle.o oVar) {
        final g0.r rVar = this.mMenuHostHelper;
        rVar.getClass();
        androidx.lifecycle.p lifecycle = uVar.getLifecycle();
        HashMap hashMap = rVar.f4249c;
        g0.q qVar = (g0.q) hashMap.remove(tVar);
        if (qVar != null) {
            qVar.f4240a.b(qVar.f4241b);
            qVar.f4241b = null;
        }
        hashMap.put(tVar, new g0.q(lifecycle, new androidx.lifecycle.s() { // from class: g0.p
            @Override // androidx.lifecycle.s
            public final void onStateChanged(androidx.lifecycle.u uVar2, androidx.lifecycle.n nVar) {
                androidx.lifecycle.n nVar2;
                r rVar2 = r.this;
                rVar2.getClass();
                androidx.lifecycle.n.Companion.getClass();
                androidx.lifecycle.o oVar2 = oVar;
                r6.h0.u(oVar2, "state");
                int ordinal = oVar2.ordinal();
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            nVar2 = null;
                        } else {
                            nVar2 = androidx.lifecycle.n.ON_RESUME;
                        }
                    } else {
                        nVar2 = androidx.lifecycle.n.ON_START;
                    }
                } else {
                    nVar2 = androidx.lifecycle.n.ON_CREATE;
                }
                Runnable runnable = rVar2.f4247a;
                CopyOnWriteArrayList copyOnWriteArrayList = rVar2.f4248b;
                t tVar2 = tVar;
                if (nVar == nVar2) {
                    copyOnWriteArrayList.add(tVar2);
                    runnable.run();
                } else if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                    rVar2.b(tVar2);
                } else if (nVar == androidx.lifecycle.l.a(oVar2)) {
                    copyOnWriteArrayList.remove(tVar2);
                    runnable.run();
                }
            }
        }));
    }
}
