package androidx.fragment.app;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public abstract class y implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.u, androidx.lifecycle.c1, androidx.lifecycle.j, n3.g {

    /* renamed from: l0, reason: collision with root package name */
    public static final Object f1028l0 = new Object();
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public s0 I;
    public a0 J;
    public y L;
    public int M;
    public int N;
    public String O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean T;
    public ViewGroup U;
    public View V;
    public boolean W;
    public v Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f1030a0;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1031b;

    /* renamed from: b0, reason: collision with root package name */
    public String f1032b0;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f1033c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f1035d;

    /* renamed from: d0, reason: collision with root package name */
    public androidx.lifecycle.w f1036d0;

    /* renamed from: e0, reason: collision with root package name */
    public j1 f1038e0;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f1039f;

    /* renamed from: g0, reason: collision with root package name */
    public androidx.lifecycle.u0 f1041g0;

    /* renamed from: h0, reason: collision with root package name */
    public n3.f f1042h0;

    /* renamed from: x, reason: collision with root package name */
    public y f1046x;

    /* renamed from: z, reason: collision with root package name */
    public int f1048z;

    /* renamed from: a, reason: collision with root package name */
    public int f1029a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f1037e = UUID.randomUUID().toString();

    /* renamed from: y, reason: collision with root package name */
    public String f1047y = null;
    public Boolean A = null;
    public t0 K = new t0();
    public final boolean S = true;
    public boolean X = true;

    /* renamed from: c0, reason: collision with root package name */
    public androidx.lifecycle.o f1034c0 = androidx.lifecycle.o.RESUMED;

    /* renamed from: f0, reason: collision with root package name */
    public final androidx.lifecycle.c0 f1040f0 = new androidx.lifecycle.c0();

    /* renamed from: i0, reason: collision with root package name */
    public final AtomicInteger f1043i0 = new AtomicInteger();

    /* renamed from: j0, reason: collision with root package name */
    public final ArrayList f1044j0 = new ArrayList();

    /* renamed from: k0, reason: collision with root package name */
    public final r f1045k0 = new r(this);

    public y() {
        o();
    }

    public void A() {
        this.T = true;
    }

    public void B() {
        this.T = true;
    }

    public LayoutInflater C(Bundle bundle) {
        a0 a0Var = this.J;
        if (a0Var != null) {
            b0 b0Var = a0Var.G;
            LayoutInflater cloneInContext = b0Var.getLayoutInflater().cloneInContext(b0Var);
            cloneInContext.setFactory2(this.K.f973f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void D(int i10, String[] strArr, int[] iArr) {
    }

    public void E() {
        this.T = true;
    }

    public void F(Bundle bundle) {
    }

    public void G() {
        this.T = true;
    }

    public void H() {
        this.T = true;
    }

    public void I() {
    }

    public void J(Bundle bundle) {
        this.T = true;
    }

    public final boolean K() {
        if (!this.P) {
            return this.K.i();
        }
        return false;
    }

    public void L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.K.M();
        boolean z9 = true;
        this.G = true;
        this.f1038e0 = new j1(this, getViewModelStore());
        View y9 = y(layoutInflater, viewGroup);
        this.V = y9;
        if (y9 != null) {
            this.f1038e0.b();
            j5.a.e0(this.V, this.f1038e0);
            View view = this.V;
            j1 j1Var = this.f1038e0;
            r6.h0.u(view, "<this>");
            view.setTag(R.id.view_tree_view_model_store_owner, j1Var);
            View view2 = this.V;
            j1 j1Var2 = this.f1038e0;
            r6.h0.u(view2, "<this>");
            view2.setTag(R.id.view_tree_saved_state_registry_owner, j1Var2);
            this.f1040f0.j(this.f1038e0);
            return;
        }
        if (this.f1038e0.f914d == null) {
            z9 = false;
        }
        if (!z9) {
            this.f1038e0 = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final void M(String[] strArr) {
        if (this.J != null) {
            s0 m5 = m();
            if (m5.B != null) {
                m5.C.addLast(new p0(this.f1037e, 5002));
                m5.B.a(strArr);
                return;
            }
            m5.f986t.getClass();
            return;
        }
        throw new IllegalStateException(a3.g.r("Fragment ", this, " not attached to Activity"));
    }

    public final b0 N() {
        b0 d10 = d();
        if (d10 != null) {
            return d10;
        }
        throw new IllegalStateException(a3.g.r("Fragment ", this, " not attached to an activity."));
    }

    public final Context O() {
        Context k10 = k();
        if (k10 != null) {
            return k10;
        }
        throw new IllegalStateException(a3.g.r("Fragment ", this, " not attached to a context."));
    }

    public final View P() {
        View view = this.V;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(a3.g.r("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void Q(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.K.S(parcelable);
            t0 t0Var = this.K;
            t0Var.E = false;
            t0Var.F = false;
            t0Var.L.f1027f = false;
            t0Var.t(1);
        }
    }

    public final void R(int i10, int i11, int i12, int i13) {
        if (this.Y == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        h().f1008b = i10;
        h().f1009c = i11;
        h().f1010d = i12;
        h().f1011e = i13;
    }

    public final void S(Bundle bundle) {
        boolean z9;
        s0 s0Var = this.I;
        if (s0Var != null) {
            if (!s0Var.E && !s0Var.F) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f1039f = bundle;
    }

    public final void T(Intent intent, int i10, Bundle bundle) {
        if (this.J != null) {
            s0 m5 = m();
            if (m5.f992z != null) {
                m5.C.addLast(new p0(this.f1037e, i10));
                if (intent != null && bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                m5.f992z.a(intent);
                return;
            }
            a0 a0Var = m5.f986t;
            if (i10 == -1) {
                x.j.startActivity(a0Var.D, intent, bundle);
                return;
            } else {
                a0Var.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
        throw new IllegalStateException(a3.g.r("Fragment ", this, " not attached to Activity"));
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public com.bumptech.glide.c f() {
        return new s(this);
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.M));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.N));
        printWriter.print(" mTag=");
        printWriter.println(this.O);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1029a);
        printWriter.print(" mWho=");
        printWriter.print(this.f1037e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.H);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.B);
        printWriter.print(" mRemoving=");
        printWriter.print(this.C);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.D);
        printWriter.print(" mInLayout=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.P);
        printWriter.print(" mDetached=");
        printWriter.print(this.Q);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.S);
        printWriter.print(" mHasMenu=");
        int i17 = 0;
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.R);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.X);
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.J);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.L);
        }
        if (this.f1039f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1039f);
        }
        if (this.f1031b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1031b);
        }
        if (this.f1033c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1033c);
        }
        if (this.f1035d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f1035d);
        }
        y yVar = this.f1046x;
        if (yVar == null) {
            s0 s0Var = this.I;
            if (s0Var != null && (str2 = this.f1047y) != null) {
                yVar = s0Var.A(str2);
            } else {
                yVar = null;
            }
        }
        if (yVar != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(yVar);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1048z);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        v vVar = this.Y;
        if (vVar == null) {
            z9 = false;
        } else {
            z9 = vVar.f1007a;
        }
        printWriter.println(z9);
        v vVar2 = this.Y;
        if (vVar2 == null) {
            i10 = 0;
        } else {
            i10 = vVar2.f1008b;
        }
        if (i10 != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            v vVar3 = this.Y;
            if (vVar3 == null) {
                i16 = 0;
            } else {
                i16 = vVar3.f1008b;
            }
            printWriter.println(i16);
        }
        v vVar4 = this.Y;
        if (vVar4 == null) {
            i11 = 0;
        } else {
            i11 = vVar4.f1009c;
        }
        if (i11 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            v vVar5 = this.Y;
            if (vVar5 == null) {
                i15 = 0;
            } else {
                i15 = vVar5.f1009c;
            }
            printWriter.println(i15);
        }
        v vVar6 = this.Y;
        if (vVar6 == null) {
            i12 = 0;
        } else {
            i12 = vVar6.f1010d;
        }
        if (i12 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            v vVar7 = this.Y;
            if (vVar7 == null) {
                i14 = 0;
            } else {
                i14 = vVar7.f1010d;
            }
            printWriter.println(i14);
        }
        v vVar8 = this.Y;
        if (vVar8 == null) {
            i13 = 0;
        } else {
            i13 = vVar8.f1011e;
        }
        if (i13 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            v vVar9 = this.Y;
            if (vVar9 != null) {
                i17 = vVar9.f1011e;
            }
            printWriter.println(i17);
        }
        if (this.U != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.U);
        }
        if (this.V != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.V);
        }
        if (k() != null) {
            z0.a.a(this).b(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.K + ":");
        this.K.u(a3.g.s(str, "  "), fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.lifecycle.j
    public final y0.c getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = O().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        if (application == null && s0.H(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + O().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        y0.d dVar = new y0.d();
        LinkedHashMap linkedHashMap = dVar.f11463a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.q0.f1128a, application);
        }
        linkedHashMap.put(com.bumptech.glide.d.f2186a, this);
        linkedHashMap.put(com.bumptech.glide.d.f2187b, this);
        Bundle bundle = this.f1039f;
        if (bundle != null) {
            linkedHashMap.put(com.bumptech.glide.d.f2188c, bundle);
        }
        return dVar;
    }

    @Override // androidx.lifecycle.j
    public androidx.lifecycle.y0 getDefaultViewModelProviderFactory() {
        Application application;
        if (this.I != null) {
            if (this.f1041g0 == null) {
                Context applicationContext = O().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && s0.H(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + O().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.f1041g0 = new androidx.lifecycle.u0(application, this, this.f1039f);
            }
            return this.f1041g0;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.u
    public final androidx.lifecycle.p getLifecycle() {
        return this.f1036d0;
    }

    @Override // n3.g
    public final n3.e getSavedStateRegistry() {
        return this.f1042h0.f8004b;
    }

    @Override // androidx.lifecycle.c1
    public final androidx.lifecycle.b1 getViewModelStore() {
        if (this.I != null) {
            if (l() != 1) {
                HashMap hashMap = this.I.L.f1024c;
                androidx.lifecycle.b1 b1Var = (androidx.lifecycle.b1) hashMap.get(this.f1037e);
                if (b1Var == null) {
                    androidx.lifecycle.b1 b1Var2 = new androidx.lifecycle.b1();
                    hashMap.put(this.f1037e, b1Var2);
                    return b1Var2;
                }
                return b1Var;
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final v h() {
        if (this.Y == null) {
            this.Y = new v();
        }
        return this.Y;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final b0 d() {
        a0 a0Var = this.J;
        if (a0Var == null) {
            return null;
        }
        return (b0) a0Var.C;
    }

    public final s0 j() {
        if (this.J != null) {
            return this.K;
        }
        throw new IllegalStateException(a3.g.r("Fragment ", this, " has not been attached yet."));
    }

    public Context k() {
        a0 a0Var = this.J;
        if (a0Var == null) {
            return null;
        }
        return a0Var.D;
    }

    public final int l() {
        androidx.lifecycle.o oVar = this.f1034c0;
        if (oVar != androidx.lifecycle.o.INITIALIZED && this.L != null) {
            return Math.min(oVar.ordinal(), this.L.l());
        }
        return oVar.ordinal();
    }

    public final s0 m() {
        s0 s0Var = this.I;
        if (s0Var != null) {
            return s0Var;
        }
        throw new IllegalStateException(a3.g.r("Fragment ", this, " not associated with a fragment manager."));
    }

    public final j1 n() {
        j1 j1Var = this.f1038e0;
        if (j1Var != null) {
            return j1Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public final void o() {
        this.f1036d0 = new androidx.lifecycle.w(this);
        this.f1042h0 = new n3.f(this);
        this.f1041g0 = null;
        ArrayList arrayList = this.f1044j0;
        r rVar = this.f1045k0;
        if (!arrayList.contains(rVar)) {
            if (this.f1029a >= 0) {
                rVar.a();
            } else {
                arrayList.add(rVar);
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.T = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        N().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.T = true;
    }

    public final void p() {
        o();
        this.f1032b0 = this.f1037e;
        this.f1037e = UUID.randomUUID().toString();
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.H = 0;
        this.I = null;
        this.K = new t0();
        this.J = null;
        this.M = 0;
        this.N = 0;
        this.O = null;
        this.P = false;
        this.Q = false;
    }

    public final boolean q() {
        if (this.J != null && this.B) {
            return true;
        }
        return false;
    }

    public final boolean r() {
        boolean r8;
        if (!this.P) {
            s0 s0Var = this.I;
            if (s0Var == null) {
                return false;
            }
            y yVar = this.L;
            s0Var.getClass();
            if (yVar == null) {
                r8 = false;
            } else {
                r8 = yVar.r();
            }
            if (!r8) {
                return false;
            }
        }
        return true;
    }

    public final boolean s() {
        if (this.H > 0) {
            return true;
        }
        return false;
    }

    public final void startActivityForResult(Intent intent, int i10) {
        T(intent, i10, null);
    }

    public void t() {
        this.T = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1037e);
        if (this.M != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.M));
        }
        if (this.O != null) {
            sb.append(" tag=");
            sb.append(this.O);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u(int i10, int i11, Intent intent) {
        if (s0.H(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void v(Activity activity) {
        this.T = true;
    }

    public void w(Context context) {
        Activity activity;
        this.T = true;
        a0 a0Var = this.J;
        if (a0Var == null) {
            activity = null;
        } else {
            activity = a0Var.C;
        }
        if (activity != null) {
            this.T = false;
            v(activity);
        }
    }

    public void x(Bundle bundle) {
        boolean z9;
        this.T = true;
        Q(bundle);
        t0 t0Var = this.K;
        if (t0Var.f985s >= 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            t0Var.E = false;
            t0Var.F = false;
            t0Var.L.f1027f = false;
            t0Var.t(1);
        }
    }

    public View y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void z() {
        this.T = true;
    }
}
