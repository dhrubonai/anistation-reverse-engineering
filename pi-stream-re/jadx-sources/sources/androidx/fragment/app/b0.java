package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class b0 extends androidx.activity.j implements w.d, w.e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final e0 mFragments = new e0(new a0(this));
    final androidx.lifecycle.w mFragmentLifecycleRegistry = new androidx.lifecycle.w(this);
    boolean mStopped = true;

    public b0() {
        getSavedStateRegistry().c(LIFECYCLE_TAG, new androidx.activity.c(this, 1));
        addOnConfigurationChangedListener(new z(this, 0));
        addOnNewIntentListener(new z(this, 1));
        addOnContextAvailableListener(new androidx.activity.d(this, 1));
    }

    public static void h(b0 b0Var) {
        a0 a0Var = b0Var.mFragments.f869a;
        a0Var.F.b(a0Var, a0Var, null);
    }

    public static /* synthetic */ Bundle i(b0 b0Var) {
        b0Var.markFragmentsCreated();
        b0Var.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_STOP);
        return new Bundle();
    }

    public static boolean j(s0 s0Var) {
        b0 b0Var;
        boolean z9;
        boolean z10;
        boolean z11 = false;
        for (y yVar : s0Var.f970c.C()) {
            if (yVar != null) {
                a0 a0Var = yVar.J;
                if (a0Var == null) {
                    b0Var = null;
                } else {
                    b0Var = a0Var.G;
                }
                if (b0Var != null) {
                    z11 |= j(yVar.j());
                }
                j1 j1Var = yVar.f1038e0;
                androidx.lifecycle.o oVar = androidx.lifecycle.o.STARTED;
                if (j1Var != null) {
                    j1Var.b();
                    if (j1Var.f914d.f1156c.compareTo(oVar) >= 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        yVar.f1038e0.f914d.g();
                        z11 = true;
                    }
                }
                if (yVar.f1036d0.f1156c.compareTo(oVar) >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    yVar.f1036d0.g();
                    z11 = true;
                }
            }
        }
        return z11;
    }

    public final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.f869a.F.f973f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (!shouldDumpInternalState(strArr)) {
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            z0.a.a(this).b(str2, printWriter);
        }
        this.mFragments.f869a.F.u(str, fileDescriptor, printWriter, strArr);
    }

    public s0 getSupportFragmentManager() {
        return this.mFragments.f869a.F;
    }

    @Deprecated
    public z0.a getSupportLoaderManager() {
        return z0.a.a(this);
    }

    public void markFragmentsCreated() {
        do {
        } while (j(getSupportFragmentManager()));
    }

    @Override // androidx.activity.j, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i10, i11, intent);
    }

    @Deprecated
    public void onAttachFragment(y yVar) {
    }

    @Override // androidx.activity.j, w.n, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_CREATE);
        t0 t0Var = this.mFragments.f869a.F;
        t0Var.E = false;
        t0Var.F = false;
        t0Var.L.f1027f = false;
        t0Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f869a.F.k();
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_DESTROY);
    }

    @Override // androidx.activity.j, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return this.mFragments.f869a.F.i();
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f869a.F.t(5);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.j, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f869a.F.x(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_RESUME);
        t0 t0Var = this.mFragments.f869a.F;
        t0Var.E = false;
        t0Var.F = false;
        t0Var.L.f1027f = false;
        t0Var.t(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            t0 t0Var = this.mFragments.f869a.F;
            t0Var.E = false;
            t0Var.F = false;
            t0Var.L.f1027f = false;
            t0Var.t(4);
        }
        this.mFragments.f869a.F.x(true);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_START);
        t0 t0Var2 = this.mFragments.f869a.F;
        t0Var2.E = false;
        t0Var2.F = false;
        t0Var2.L.f1027f = false;
        t0Var2.t(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        t0 t0Var = this.mFragments.f869a.F;
        t0Var.F = true;
        t0Var.L.f1027f = true;
        t0Var.t(4);
        this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_STOP);
    }

    public void setEnterSharedElementCallback(w.y yVar) {
        int i10 = w.g.f10699a;
        w.b.c(this, null);
    }

    public void setExitSharedElementCallback(w.y yVar) {
        int i10 = w.g.f10699a;
        w.b.d(this, null);
    }

    public void startActivityFromFragment(y yVar, @SuppressLint({"UnknownNullness"}) Intent intent, int i10) {
        startActivityFromFragment(yVar, intent, i10, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(y yVar, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i10, Intent intent, int i11, int i12, int i13, Bundle bundle) {
        Intent intent2 = intent;
        if (i10 == -1) {
            int i14 = w.g.f10699a;
            w.a.c(this, intentSender, i10, intent, i11, i12, i13, bundle);
            return;
        }
        if (yVar.J != null) {
            if (s0.H(2)) {
                Log.v("FragmentManager", "Fragment " + yVar + " received the following in startIntentSenderForResult() requestCode: " + i10 + " IntentSender: " + intentSender + " fillInIntent: " + intent2 + " options: " + bundle);
            }
            s0 m5 = yVar.m();
            if (m5.A != null) {
                if (bundle != null) {
                    if (intent2 == null) {
                        intent2 = new Intent();
                        intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    }
                    if (s0.H(2)) {
                        Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + yVar);
                    }
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                c.k kVar = new c.k(intentSender, intent2, i11, i12);
                m5.C.addLast(new p0(yVar.f1037e, i10));
                if (s0.H(2)) {
                    Log.v("FragmentManager", "Fragment " + yVar + "is launching an IntentSender for result ");
                }
                m5.A.a(kVar);
                return;
            }
            a0 a0Var = m5.f986t;
            if (i10 == -1) {
                Activity activity = a0Var.C;
                int i15 = w.g.f10699a;
                w.a.c(activity, intentSender, i10, intent, i11, i12, i13, bundle);
                return;
            }
            a0Var.getClass();
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        throw new IllegalStateException(a3.g.r("Fragment ", yVar, " not attached to Activity"));
    }

    public void supportFinishAfterTransition() {
        int i10 = w.g.f10699a;
        w.b.a(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        int i10 = w.g.f10699a;
        w.b.b(this);
    }

    public void supportStartPostponedEnterTransition() {
        int i10 = w.g.f10699a;
        w.b.e(this);
    }

    @Override // w.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i10) {
    }

    public void startActivityFromFragment(y yVar, @SuppressLint({"UnknownNullness"}) Intent intent, int i10, Bundle bundle) {
        if (i10 == -1) {
            int i11 = w.g.f10699a;
            w.a.b(this, intent, -1, bundle);
        } else {
            yVar.T(intent, i10, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }
}
