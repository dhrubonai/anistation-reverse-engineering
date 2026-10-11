package l8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import msr.pistream.app.R;
import msr.pistream.app.ui.home.screens.MainActivity;
import msr.pistream.app.viewmodel.HomeViewModel;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class r0 extends g8.b implements GeneratedComponentManagerHolder {
    public static final /* synthetic */ int D0 = 0;
    public i8.p A0;
    public LinearLayout B0;
    public LinearLayout C0;

    /* renamed from: n0, reason: collision with root package name */
    public ContextWrapper f7002n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f7003o0;

    /* renamed from: p0, reason: collision with root package name */
    public volatile FragmentComponentManager f7004p0;

    /* renamed from: s0, reason: collision with root package name */
    public HomeViewModel f7007s0;

    /* renamed from: t0, reason: collision with root package name */
    public z f7008t0;

    /* renamed from: x0, reason: collision with root package name */
    public LinearLayout f7012x0;

    /* renamed from: y0, reason: collision with root package name */
    public LinearLayout f7013y0;

    /* renamed from: z0, reason: collision with root package name */
    public RecyclerView f7014z0;

    /* renamed from: q0, reason: collision with root package name */
    public final Object f7005q0 = new Object();

    /* renamed from: r0, reason: collision with root package name */
    public boolean f7006r0 = false;

    /* renamed from: u0, reason: collision with root package name */
    public final ExecutorService f7009u0 = Executors.newFixedThreadPool(2);

    /* renamed from: v0, reason: collision with root package name */
    public final Handler f7010v0 = new Handler(Looper.getMainLooper());

    /* renamed from: w0, reason: collision with root package name */
    public final k8.a f7011w0 = new k8.a();

    public static void X(RecyclerView recyclerView, int i10) {
        int width = recyclerView.getWidth() / 2;
        for (int i11 = 0; i11 < recyclerView.getChildCount(); i11++) {
            View childAt = recyclerView.getChildAt(i11);
            float min = Math.min(1.0f, Math.abs(width - ((childAt.getRight() + childAt.getLeft()) / 2)) / i10);
            float f10 = 1.0f - (0.18f * min);
            childAt.setScaleX(f10);
            childAt.setScaleY(f10);
            childAt.setAlpha(Math.max(0.45f, 1.0f - (min * 0.55f)));
        }
    }

    @Override // androidx.fragment.app.y
    public final void A() {
        this.T = true;
        this.f7014z0 = null;
        this.B0 = null;
        this.f7012x0 = null;
        this.f7013y0 = null;
    }

    @Override // androidx.fragment.app.y
    public final LayoutInflater C(Bundle bundle) {
        LayoutInflater C = super.C(bundle);
        return C.cloneInContext(FragmentComponentManager.createContextWrapper(C, this));
    }

    @Override // g8.b
    public final View W() {
        boolean z9;
        boolean v9;
        MainActivity mainActivity;
        FrameLayout frameLayout;
        LinearLayout linearLayout = new LinearLayout(this.f4484m0);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(this.f4484m0);
        linearLayout2.setGravity(16);
        int i10 = 0;
        linearLayout2.setPadding(U(16), U(56), U(24), 0);
        if ((d() instanceof MainActivity) && (frameLayout = (mainActivity = (MainActivity) d()).J) != null) {
            linearLayout2.setBackgroundColor(w8.i.f11061a);
            frameLayout.removeAllViews();
            frameLayout.addView(linearLayout2, new FrameLayout.LayoutParams(-1, U(120)));
            mainActivity.N();
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, U(120)));
        }
        ImageView imageView = new ImageView(this.f4484m0);
        imageView.setImageResource(R.drawable.ic_back);
        imageView.setColorFilter(-1);
        imageView.setPadding(U(8), U(8), U(8), U(8));
        imageView.setOnClickListener(new r(this, 2));
        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(U(44), U(44)));
        TextView l10 = w8.i.l(this.f4484m0, "Upcoming Next Season", 24, -1, 1);
        l10.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(U(16), 0, 0, 0);
        linearLayout2.addView(l10, layoutParams);
        LinearLayout linearLayout3 = new LinearLayout(this.f4484m0);
        this.f7012x0 = linearLayout3;
        linearLayout3.setOrientation(1);
        a3.g.w(-1, -2, linearLayout, this.f7012x0);
        z zVar = this.f7008t0;
        if (zVar != null) {
            int i11 = zVar.f7035a;
            MainActivity mainActivity2 = zVar.f7036b;
            switch (i11) {
                case 2:
                    v9 = MainActivity.v(mainActivity2);
                    break;
                default:
                    v9 = MainActivity.v(mainActivity2);
                    break;
            }
            if (!v9) {
                TextView l11 = w8.i.l(this.f4484m0, "No Internet\nInternet connection is required to load this section.", 16, w8.i.f11068h, 0);
                l11.setGravity(17);
                l11.setPadding(U(24), U(120), U(24), U(24));
                r.f.i(-1, -2, this.f7012x0, l11);
                return linearLayout;
            }
        }
        RecyclerView recyclerView = new RecyclerView(this.f4484m0, null);
        this.f7014z0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        this.f7014z0.setPadding(U(24), U(18), U(24), 0);
        this.f7014z0.setClipToPadding(false);
        i8.p pVar = new i8.p(this.f4484m0);
        this.A0 = pVar;
        this.f7014z0.setAdapter(pVar);
        this.f7014z0.setClipChildren(false);
        new m3.x(0).a(this.f7014z0);
        int U = U(300);
        this.f7014z0.j(new q0(this, U));
        this.f7014z0.post(new y.m(this, U, 4));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, U(250));
        layoutParams2.topMargin = U(8);
        this.f7012x0.addView(this.f7014z0, layoutParams2);
        LinearLayout linearLayout4 = new LinearLayout(this.f4484m0);
        this.B0 = linearLayout4;
        linearLayout4.setGravity(17);
        this.B0.setVisibility(8);
        this.f7012x0.addView(this.B0, new LinearLayout.LayoutParams(-1, U(20)));
        LinearLayout linearLayout5 = new LinearLayout(this.f4484m0);
        this.f7013y0 = linearLayout5;
        linearLayout5.setOrientation(1);
        this.f7013y0.setPadding(U(20), U(16), U(20), U(40));
        a3.g.w(-1, -2, this.f7012x0, this.f7013y0);
        LinearLayout linearLayout6 = this.C0;
        if (linearLayout6 != null && linearLayout6.getParent() != null) {
            ((ViewGroup) this.C0.getParent()).removeView(this.C0);
        }
        LinearLayout l02 = r6.h0.l0(this.f4484m0, 6, U(96), U(10));
        this.C0 = l02;
        a3.g.w(-1, -2, this.f7013y0, l02);
        this.C0.setVisibility(0);
        List a10 = this.f7011w0.a("upcomingSeason");
        if (a10 != null) {
            Z(a10);
        } else {
            this.f7009u0.execute(new p0(this, i10));
        }
        linearLayout.addView(new View(this.f4484m0), new LinearLayout.LayoutParams(-1, U(96)));
        return linearLayout;
    }

    public final void Y() {
        if (this.f7002n0 == null) {
            this.f7002n0 = FragmentComponentManager.createContextWrapper(super.k(), this);
            this.f7003o0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.k());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Z(java.util.List r17) {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.r0.Z(java.util.List):void");
    }

    public final void a0() {
        int i10;
        int i11;
        LinearLayout linearLayout = this.B0;
        if (linearLayout != null && this.A0 != null) {
            linearLayout.removeAllViews();
            int a10 = this.A0.a();
            if (a10 == 0) {
                i10 = 0;
            } else {
                i10 = a10 / 200;
            }
            if (i10 == 0) {
                return;
            }
            int J0 = ((LinearLayoutManager) this.f7014z0.getLayoutManager()).J0() % i10;
            for (int i12 = 0; i12 < i10; i12++) {
                View view = new View(this.f4484m0);
                int U = U(8);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(U, U);
                if (i12 > 0) {
                    layoutParams.setMargins(U(6), 0, 0, 0);
                }
                view.setLayoutParams(layoutParams);
                if (i12 == J0) {
                    i11 = w8.i.f11065e;
                } else {
                    i11 = w8.i.f11064d;
                }
                view.setBackground(w8.i.j(i11, U / 2));
                this.B0.addView(view);
            }
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final GeneratedComponentManager componentManager() {
        if (this.f7004p0 == null) {
            synchronized (this.f7005q0) {
                if (this.f7004p0 == null) {
                    this.f7004p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f7004p0;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        if (this.f7004p0 == null) {
            synchronized (this.f7005q0) {
                if (this.f7004p0 == null) {
                    this.f7004p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f7004p0.generatedComponent();
    }

    @Override // androidx.fragment.app.y, androidx.lifecycle.j
    public final y0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.y
    public final Context k() {
        if (super.k() == null && !this.f7003o0) {
            return null;
        }
        Y();
        return this.f7002n0;
    }

    @Override // androidx.fragment.app.y
    public final void v(Activity activity) {
        boolean z9;
        this.T = true;
        ContextWrapper contextWrapper = this.f7002n0;
        if (contextWrapper != null && FragmentComponentManager.findActivity(contextWrapper) != activity) {
            z9 = false;
        } else {
            z9 = true;
        }
        Preconditions.checkState(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Y();
        if (!this.f7006r0) {
            this.f7006r0 = true;
            s0 s0Var = (s0) generatedComponent();
            s0Var.getClass();
        }
    }

    @Override // g8.b, androidx.fragment.app.y
    public final void w(Context context) {
        super.w(context);
        Y();
        if (!this.f7006r0) {
            this.f7006r0 = true;
            s0 s0Var = (s0) generatedComponent();
            s0Var.getClass();
        }
    }

    @Override // androidx.fragment.app.y
    public final void x(Bundle bundle) {
        super.x(bundle);
        this.f7007s0 = (HomeViewModel) new a1(N()).a(HomeViewModel.class);
    }

    @Override // androidx.fragment.app.y
    public final void z() {
        this.T = true;
        this.f7009u0.shutdownNow();
    }
}
