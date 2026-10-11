package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class LifecycleCallback {
    protected final l mLifecycleFragment;

    public LifecycleCallback(l lVar) {
        this.mLifecycleFragment = lVar;
    }

    @Keep
    private static l getChimeraLifecycleFragmentImpl(k kVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static l getFragment(Activity activity) {
        return getFragment(new k(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity d10 = this.mLifecycleFragment.d();
        w7.b.s(d10);
        return d10;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static l getFragment(k kVar) {
        f1 f1Var;
        g1 g1Var;
        Activity activity = kVar.f2438a;
        if (activity instanceof androidx.fragment.app.b0) {
            androidx.fragment.app.b0 b0Var = (androidx.fragment.app.b0) activity;
            WeakHashMap weakHashMap = g1.f2416p0;
            WeakReference weakReference = (WeakReference) weakHashMap.get(b0Var);
            if (weakReference == null || (g1Var = (g1) weakReference.get()) == null) {
                try {
                    g1Var = (g1) b0Var.getSupportFragmentManager().C("SupportLifecycleFragmentImpl");
                    if (g1Var == null || g1Var.C) {
                        g1Var = new g1();
                        androidx.fragment.app.s0 supportFragmentManager = b0Var.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                        aVar.g(0, g1Var, "SupportLifecycleFragmentImpl", 1);
                        aVar.d(true);
                    }
                    weakHashMap.put(b0Var, new WeakReference(g1Var));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
                }
            }
            return g1Var;
        }
        if (activity instanceof Activity) {
            WeakHashMap weakHashMap2 = f1.f2399d;
            WeakReference weakReference2 = (WeakReference) weakHashMap2.get(activity);
            if (weakReference2 == null || (f1Var = (f1) weakReference2.get()) == null) {
                try {
                    f1Var = (f1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (f1Var == null || f1Var.isRemoving()) {
                        f1Var = new f1();
                        activity.getFragmentManager().beginTransaction().add(f1Var, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap2.put(activity, new WeakReference(f1Var));
                } catch (ClassCastException e11) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e11);
                }
            }
            return f1Var;
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public static l getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
