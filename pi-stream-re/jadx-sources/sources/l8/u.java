package l8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.a1;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import msr.pistream.app.ui.home.screens.MainActivity;
import msr.pistream.app.viewmodel.HomeViewModel;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class u extends g8.b implements GeneratedComponentManagerHolder {
    public static final /* synthetic */ int A0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public ContextWrapper f7016n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f7017o0;

    /* renamed from: p0, reason: collision with root package name */
    public volatile FragmentComponentManager f7018p0;

    /* renamed from: s0, reason: collision with root package name */
    public HomeViewModel f7021s0;

    /* renamed from: t0, reason: collision with root package name */
    public t f7022t0;

    /* renamed from: w0, reason: collision with root package name */
    public LinearLayout f7025w0;

    /* renamed from: y0, reason: collision with root package name */
    public final m3.q0 f7027y0;

    /* renamed from: z0, reason: collision with root package name */
    public final s f7028z0;

    /* renamed from: q0, reason: collision with root package name */
    public final Object f7019q0 = new Object();

    /* renamed from: r0, reason: collision with root package name */
    public boolean f7020r0 = false;

    /* renamed from: u0, reason: collision with root package name */
    public final ExecutorService f7023u0 = Executors.newFixedThreadPool(2);

    /* renamed from: v0, reason: collision with root package name */
    public final Handler f7024v0 = new Handler(Looper.getMainLooper());

    /* renamed from: x0, reason: collision with root package name */
    public boolean f7026x0 = true;

    public u() {
        new HashMap();
        this.f7027y0 = new m3.q0();
        this.f7028z0 = new s(this);
    }

    @Override // androidx.fragment.app.y
    public final LayoutInflater C(Bundle bundle) {
        LayoutInflater C = super.C(bundle);
        return C.cloneInContext(FragmentComponentManager.createContextWrapper(C, this));
    }

    @Override // g8.b
    public final View W() {
        LinearLayout linearLayout = new LinearLayout(this.f4484m0);
        this.f7025w0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f7025w0.setPadding(0, 0, 0, U(40));
        Y();
        return this.f7025w0;
    }

    public final void X(int i10, List list) {
        boolean z9;
        List list2;
        k8.a aVar;
        t tVar;
        List list3 = list;
        if (V() && this.f7025w0 != null) {
            int min = Math.min(i10 + 2, list.size());
            int i11 = i10;
            while (i11 < min) {
                a8.f fVar = (a8.f) list3.get(i11);
                if (i11 == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (fVar != null && (list2 = fVar.f194d) != null && !list2.isEmpty()) {
                    Context context = this.f4484m0;
                    LinearLayout linearLayout = this.f7025w0;
                    int i12 = fVar.f192b;
                    String str = fVar.f193c;
                    y.c cVar = new y.c(this, i12, str);
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setGravity(16);
                    linearLayout2.setPadding(w8.i.e(context, 24), w8.i.e(context, 30), w8.i.e(context, 24), 0);
                    a3.g.w(-1, -2, linearLayout, linearLayout2);
                    String str2 = fVar.f191a;
                    a3.g.v(0, -2, 1.0f, linearLayout2, w8.i.l(context, str2, 24, -1, 1));
                    TextView l10 = w8.i.l(context, "See all", 16, w8.i.f11065e, 1);
                    l10.setPadding(w8.i.e(context, 8), w8.i.e(context, 8), w8.i.e(context, 8), w8.i.e(context, 8));
                    l10.setGravity(17);
                    l10.setOnClickListener(new h8.r(7, cVar, str2));
                    linearLayout2.addView(l10, new LinearLayout.LayoutParams(-2, -2));
                    k8.a aVar2 = null;
                    RecyclerView recyclerView = new RecyclerView(context, null);
                    recyclerView.setLayoutManager(new LinearLayoutManager(0));
                    recyclerView.setPadding(w8.i.e(context, 24), w8.i.e(context, 22), w8.i.e(context, 24), 0);
                    recyclerView.setClipToPadding(false);
                    recyclerView.setClipChildren(false);
                    recyclerView.setSaveEnabled(false);
                    recyclerView.setNestedScrollingEnabled(false);
                    linearLayout.addView(recyclerView, new LinearLayout.LayoutParams(-1, w8.i.e(context, 254)));
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setRecycledViewPool(this.f7027y0);
                    recyclerView.setItemViewCacheSize(4);
                    recyclerView.setTag("row_rail_" + str);
                    i8.d dVar = new i8.d(this.f4484m0, new s(this), true, false);
                    recyclerView.setAdapter(dVar);
                    dVar.e(list2.subList(0, Math.min(16, list2.size())));
                    if (z9 && (tVar = this.f7022t0) != null) {
                        z zVar = (z) tVar;
                        int i13 = zVar.f7035a;
                        MainActivity mainActivity = zVar.f7036b;
                        switch (i13) {
                            case 20:
                                MainActivity.u(mainActivity, list2);
                                break;
                            default:
                                MainActivity.u(mainActivity, list2);
                                break;
                        }
                    }
                    t tVar2 = this.f7022t0;
                    if (tVar2 != null) {
                        z zVar2 = (z) tVar2;
                        int i14 = zVar2.f7035a;
                        MainActivity mainActivity2 = zVar2.f7036b;
                        switch (i14) {
                            case 20:
                                aVar = mainActivity2.F;
                                break;
                            case 21:
                                aVar = mainActivity2.F;
                                break;
                            default:
                                aVar = mainActivity2.F;
                                break;
                        }
                        aVar2 = aVar;
                    }
                    if (aVar2 != null) {
                        aVar2.f6492m.put(str, list2);
                        aVar2.f6493n.put(r.f.d("rail:", str), Long.valueOf(System.currentTimeMillis()));
                    }
                }
                i11++;
                list3 = list;
            }
            if (min < list.size()) {
                this.f7024v0.post(new f1.k(this, list, min, 7));
            } else {
                Z();
            }
        }
    }

    public final void Y() {
        LinearLayout linearLayout = this.f7025w0;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        ArrayList arrayList = new ArrayList();
        String[][] strArr = c8.b.f2081b;
        for (int i10 = 0; i10 < 11; i10++) {
            arrayList.add(strArr[i10][0]);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            LinearLayout linearLayout2 = new LinearLayout(this.f4484m0);
            linearLayout2.setGravity(16);
            linearLayout2.setPadding(U(24), U(30), U(24), 0);
            a3.g.w(-1, -2, this.f7025w0, linearLayout2);
            a3.g.v(0, -2, 1.0f, linearLayout2, w8.i.l(this.f4484m0, str, 24, -1, 1));
            Context context = this.f4484m0;
            this.f7025w0.addView(r6.h0.z0(context, w8.i.e(context, 24), w8.i.e(context, 22), w8.i.e(context, 24)), new LinearLayout.LayoutParams(-1, U(254)));
        }
        androidx.lifecycle.c0 c0Var = this.f7021s0.f7822r;
        s sVar = this.f7028z0;
        c0Var.i(sVar);
        this.f7021s0.f7822r.e(n(), sVar);
        this.f7021s0.c();
    }

    public final void Z() {
        t tVar = this.f7022t0;
        if (tVar != null) {
            ((z) tVar).n();
            if (this.f7026x0) {
                this.f7026x0 = false;
                z zVar = (z) this.f7022t0;
                int i10 = zVar.f7035a;
                MainActivity mainActivity = zVar.f7036b;
                switch (i10) {
                    case 20:
                        int i11 = MainActivity.f7741b0;
                        mainActivity.H();
                        return;
                    default:
                        int i12 = MainActivity.f7741b0;
                        mainActivity.H();
                        return;
                }
            }
        }
    }

    public final void a0() {
        if (this.f7016n0 == null) {
            this.f7016n0 = FragmentComponentManager.createContextWrapper(super.k(), this);
            this.f7017o0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.k());
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final GeneratedComponentManager componentManager() {
        if (this.f7018p0 == null) {
            synchronized (this.f7019q0) {
                if (this.f7018p0 == null) {
                    this.f7018p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f7018p0;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        if (this.f7018p0 == null) {
            synchronized (this.f7019q0) {
                if (this.f7018p0 == null) {
                    this.f7018p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f7018p0.generatedComponent();
    }

    @Override // androidx.fragment.app.y, androidx.lifecycle.j
    public final y0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.y
    public final Context k() {
        if (super.k() == null && !this.f7017o0) {
            return null;
        }
        a0();
        return this.f7016n0;
    }

    @Override // androidx.fragment.app.y
    public final void v(Activity activity) {
        boolean z9;
        this.T = true;
        ContextWrapper contextWrapper = this.f7016n0;
        if (contextWrapper != null && FragmentComponentManager.findActivity(contextWrapper) != activity) {
            z9 = false;
        } else {
            z9 = true;
        }
        Preconditions.checkState(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        a0();
        if (!this.f7020r0) {
            this.f7020r0 = true;
            v vVar = (v) generatedComponent();
            vVar.getClass();
        }
    }

    @Override // g8.b, androidx.fragment.app.y
    public final void w(Context context) {
        super.w(context);
        a0();
        if (!this.f7020r0) {
            this.f7020r0 = true;
            v vVar = (v) generatedComponent();
            vVar.getClass();
        }
    }

    @Override // androidx.fragment.app.y
    public final void x(Bundle bundle) {
        super.x(bundle);
        this.f7021s0 = (HomeViewModel) new a1(N()).a(HomeViewModel.class);
    }

    @Override // androidx.fragment.app.y
    public final void z() {
        this.T = true;
        this.f7023u0.shutdownNow();
    }
}
