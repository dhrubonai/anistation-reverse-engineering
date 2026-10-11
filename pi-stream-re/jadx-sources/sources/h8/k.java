package h8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import androidx.lifecycle.a1;
import androidx.lifecycle.y0;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import dagger.hilt.internal.UnsafeCasts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import msr.pistream.app.R;
import msr.pistream.app.ui.detail.DetailActivity;
import msr.pistream.app.ui.player.PlayerActivity;
import msr.pistream.app.viewmodel.DetailViewModel;
import r6.h0;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class k extends g8.b implements i8.i, i8.c, GeneratedComponentManagerHolder {
    public static final /* synthetic */ int J0 = 0;
    public h A0;
    public a8.b B0;
    public final ArrayList C0;
    public final j D0;
    public final j E0;
    public final j F0;
    public final j G0;
    public final j H0;
    public final j I0;

    /* renamed from: n0, reason: collision with root package name */
    public ContextWrapper f5045n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f5046o0;

    /* renamed from: p0, reason: collision with root package name */
    public volatile FragmentComponentManager f5047p0;

    /* renamed from: s0, reason: collision with root package name */
    public DetailViewModel f5050s0;

    /* renamed from: t0, reason: collision with root package name */
    public e8.a f5051t0;

    /* renamed from: v0, reason: collision with root package name */
    public o f5053v0;

    /* renamed from: w0, reason: collision with root package name */
    public y f5054w0;

    /* renamed from: x0, reason: collision with root package name */
    public q f5055x0;

    /* renamed from: y0, reason: collision with root package name */
    public h f5056y0;

    /* renamed from: z0, reason: collision with root package name */
    public x f5057z0;

    /* renamed from: q0, reason: collision with root package name */
    public final Object f5048q0 = new Object();

    /* renamed from: r0, reason: collision with root package name */
    public boolean f5049r0 = false;

    /* renamed from: u0, reason: collision with root package name */
    public final ExecutorService f5052u0 = Executors.newFixedThreadPool(2);

    public k() {
        new Handler(Looper.getMainLooper());
        this.C0 = new ArrayList();
        this.D0 = new j(this, 0);
        this.E0 = new j(this, 1);
        this.F0 = new j(this, 2);
        this.G0 = new j(this, 3);
        this.H0 = new j(this, 4);
        this.I0 = new j(this, 5);
    }

    @Override // androidx.fragment.app.y
    public final LayoutInflater C(Bundle bundle) {
        LayoutInflater C = super.C(bundle);
        return C.cloneInContext(FragmentComponentManager.createContextWrapper(C, this));
    }

    @Override // androidx.fragment.app.y
    public final void D(int i10, String[] strArr, int[] iArr) {
        if (i10 == 5002 && iArr.length > 0 && iArr[0] == 0 && !this.C0.isEmpty()) {
            this.f5057z0.k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0b9f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x093f A[LOOP:4: B:98:0x093d->B:99:0x093f, LOOP_END] */
    @Override // g8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View W() {
        /*
            Method dump skipped, instructions count: 3066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h8.k.W():android.view.View");
    }

    public final a8.b X(Context context) {
        String j02 = h0.j0(this.B0);
        if (!h0.h0(j02)) {
            Iterator it = h0.d(context).iterator();
            while (it.hasNext()) {
                a8.b bVar = (a8.b) it.next();
                if (j02.equals(h0.j0(bVar))) {
                    return bVar;
                }
            }
        }
        return null;
    }

    public final void Y() {
        if (this.f5045n0 == null) {
            this.f5045n0 = FragmentComponentManager.createContextWrapper(super.k(), this);
            this.f5046o0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.k());
        }
    }

    public final void Z() {
        if (!this.f5049r0) {
            this.f5049r0 = true;
            l lVar = (l) generatedComponent();
            ((k) UnsafeCasts.unsafeCast(this)).f5051t0 = (e8.a) ((x7.d) lVar).f11349a.f11362h.get();
        }
    }

    public final void a0(a8.e eVar, long j4) {
        Context context = this.f4484m0;
        if (context == null) {
            return;
        }
        Intent putExtra = new Intent(context, (Class<?>) PlayerActivity.class).putExtra("episode", eVar).putExtra("episodes", new ArrayList(this.C0));
        if (j4 > 0) {
            putExtra.putExtra("resume_position_ms", j4);
        }
        context.startActivity(putExtra);
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
        }
    }

    @Override // i8.i
    public final void b(a8.e eVar) {
        String str;
        long j4;
        a8.b X;
        String str2;
        boolean z9;
        StringBuilder sb = new StringBuilder("Play:");
        if (eVar != null) {
            str = eVar.f183a;
        } else {
            str = "?";
        }
        sb.append(str);
        w8.d.f11049e = sb.toString();
        Context context = this.f4484m0;
        if (context != null && (X = X(context)) != null && eVar != null) {
            String str3 = X.F;
            if ((str3 != null && str3.equals(eVar.f184b)) || ((str2 = X.f174x) != null && str2.equals(eVar.f183a))) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                j4 = X.H;
                a0(eVar, j4);
            }
        }
        j4 = 0;
        a0(eVar, j4);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final GeneratedComponentManager componentManager() {
        if (this.f5047p0 == null) {
            synchronized (this.f5048q0) {
                if (this.f5047p0 == null) {
                    this.f5047p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f5047p0;
    }

    @Override // i8.c
    public final void e(a8.b bVar) {
        Context context;
        if (bVar == null || bVar.D == null || (context = this.f4484m0) == null) {
            return;
        }
        context.startActivity(new Intent(context, (Class<?>) DetailActivity.class).putExtra("anime", bVar));
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        if (this.f5047p0 == null) {
            synchronized (this.f5048q0) {
                if (this.f5047p0 == null) {
                    this.f5047p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f5047p0.generatedComponent();
    }

    @Override // androidx.fragment.app.y, androidx.lifecycle.j
    public final y0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.y
    public final Context k() {
        if (super.k() == null && !this.f5046o0) {
            return null;
        }
        Y();
        return this.f5045n0;
    }

    @Override // androidx.fragment.app.y
    public final void v(Activity activity) {
        boolean z9 = true;
        this.T = true;
        ContextWrapper contextWrapper = this.f5045n0;
        if (contextWrapper != null && FragmentComponentManager.findActivity(contextWrapper) != activity) {
            z9 = false;
        }
        Preconditions.checkState(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Y();
        Z();
    }

    @Override // g8.b, androidx.fragment.app.y
    public final void w(Context context) {
        super.w(context);
        Y();
        Z();
    }

    @Override // androidx.fragment.app.y
    public final void x(Bundle bundle) {
        super.x(bundle);
        this.f5050s0 = (DetailViewModel) new a1(N()).a(DetailViewModel.class);
        Bundle bundle2 = this.f1039f;
        if (bundle2 == null) {
            N().finish();
            return;
        }
        a8.b bVar = (a8.b) bundle2.getParcelable("anime");
        this.B0 = bVar;
        if (bVar == null) {
            N().finish();
        } else {
            w8.d.f11048d = "Detail";
            w8.d.f11049e = "Viewing detail";
        }
    }

    @Override // androidx.fragment.app.y
    public final void z() {
        this.T = true;
        this.f5052u0.shutdownNow();
    }
}
