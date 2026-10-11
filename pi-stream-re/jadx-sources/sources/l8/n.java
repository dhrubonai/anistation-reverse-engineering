package l8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.a1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import java.util.ArrayList;
import msr.pistream.app.R;
import msr.pistream.app.ui.home.screens.MainActivity;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class n extends g8.b implements GeneratedComponentManagerHolder {
    public static final /* synthetic */ int E0 = 0;
    public i8.d A0;
    public ScrollView D0;

    /* renamed from: n0, reason: collision with root package name */
    public ContextWrapper f6967n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f6968o0;

    /* renamed from: p0, reason: collision with root package name */
    public volatile FragmentComponentManager f6969p0;

    /* renamed from: s0, reason: collision with root package name */
    public x8.e f6972s0;

    /* renamed from: t0, reason: collision with root package name */
    public z f6973t0;

    /* renamed from: u0, reason: collision with root package name */
    public String f6974u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f6975v0;

    /* renamed from: w0, reason: collision with root package name */
    public k8.f f6976w0;

    /* renamed from: x0, reason: collision with root package name */
    public RecyclerView f6977x0;

    /* renamed from: y0, reason: collision with root package name */
    public View f6978y0;

    /* renamed from: z0, reason: collision with root package name */
    public LinearLayout f6979z0;

    /* renamed from: q0, reason: collision with root package name */
    public final Object f6970q0 = new Object();

    /* renamed from: r0, reason: collision with root package name */
    public boolean f6971r0 = false;
    public final ArrayList B0 = new ArrayList();
    public boolean C0 = false;

    @Override // androidx.fragment.app.y
    public final void A() {
        ScrollView scrollView = this.D0;
        if (scrollView != null) {
            scrollView.setOnScrollChangeListener(null);
            this.D0 = null;
        }
        this.T = true;
    }

    @Override // androidx.fragment.app.y
    public final LayoutInflater C(Bundle bundle) {
        LayoutInflater C = super.C(bundle);
        return C.cloneInContext(FragmentComponentManager.createContextWrapper(C, this));
    }

    @Override // androidx.fragment.app.y
    public final void E() {
        this.T = true;
        View view = this.V;
        if (view != null) {
            view.post(new i(this, 0));
        }
    }

    @Override // g8.b
    public final View W() {
        boolean z9;
        MainActivity mainActivity;
        FrameLayout frameLayout;
        LinearLayout linearLayout = new LinearLayout(this.f4484m0);
        final int i10 = 1;
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(this.f4484m0);
        linearLayout2.setGravity(16);
        final int i11 = 0;
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
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: l8.k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f6957b;

            {
                this.f6957b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = i11;
                n nVar = this.f6957b;
                switch (i12) {
                    case 0:
                        z zVar = nVar.f6973t0;
                        if (zVar != null) {
                            zVar.a();
                            return;
                        }
                        return;
                    default:
                        z zVar2 = nVar.f6973t0;
                        if (zVar2 != null) {
                            zVar2.i();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(U(44), U(44)));
        TextView l10 = w8.i.l(this.f4484m0, this.f6974u0, 24, -1, 1);
        l10.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(U(16), 0, 0, 0);
        linearLayout2.addView(l10, layoutParams);
        if ("Filter".equals(this.f6974u0)) {
            ImageView imageView2 = new ImageView(this.f4484m0);
            imageView2.setImageResource(R.drawable.ic_filter);
            imageView2.clearColorFilter();
            imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: l8.k

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n f6957b;

                {
                    this.f6957b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i12 = i10;
                    n nVar = this.f6957b;
                    switch (i12) {
                        case 0:
                            z zVar = nVar.f6973t0;
                            if (zVar != null) {
                                zVar.a();
                                return;
                            }
                            return;
                        default:
                            z zVar2 = nVar.f6973t0;
                            if (zVar2 != null) {
                                zVar2.i();
                                return;
                            }
                            return;
                    }
                }
            });
            linearLayout2.addView(imageView2, new LinearLayout.LayoutParams(U(56), U(56)));
        }
        RecyclerView recyclerView = new RecyclerView(this.f4484m0, null);
        this.f6977x0 = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        this.f6977x0.setPadding(U(16), U(20), U(16), U(16));
        this.f6977x0.setLayoutManager(new GridLayoutManager());
        i8.d dVar = new i8.d(this.f4484m0, new m(this, i11), false, this.f6975v0);
        this.A0 = dVar;
        this.f6977x0.setAdapter(dVar);
        this.f6977x0.setClipChildren(false);
        this.f6977x0.setClipToPadding(false);
        linearLayout.addView(this.f6977x0, new LinearLayout.LayoutParams(-1, -2));
        View g10 = w8.i.g(this.f4484m0);
        this.f6978y0 = g10;
        g10.setVisibility(4);
        linearLayout.addView(this.f6978y0, new LinearLayout.LayoutParams(-1, U(3)));
        this.f6972s0.f11402c.e(n(), new k1.x(14, this, linearLayout));
        this.f6972s0.f11403d.e(n(), new androidx.lifecycle.d0(this) { // from class: l8.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f6953b;

            {
                this.f6953b = this;
            }

            @Override // androidx.lifecycle.d0
            public final void f(Object obj) {
                LinearLayout linearLayout3;
                int i12 = i11;
                n nVar = this.f6953b;
                switch (i12) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        int i13 = n.E0;
                        nVar.getClass();
                        if (bool.booleanValue() && !nVar.C0 && (linearLayout3 = nVar.f6979z0) == null && linearLayout3 == null && nVar.f6977x0.getParent() != null) {
                            ViewGroup viewGroup = (ViewGroup) nVar.f6977x0.getParent();
                            Context context = nVar.f4484m0;
                            int e10 = ((context.getResources().getDisplayMetrics().widthPixels - w8.i.e(context, 32)) - w8.i.e(context, 24)) / 2;
                            int i14 = (int) ((e10 * 230.0f) / 168.0f);
                            LinearLayout linearLayout4 = new LinearLayout(context);
                            linearLayout4.setOrientation(1);
                            linearLayout4.setPadding(0, w8.i.e(context, 20), 0, 0);
                            int e11 = w8.i.e(context, 12);
                            for (int i15 = 0; i15 < 3; i15++) {
                                LinearLayout linearLayout5 = new LinearLayout(context);
                                linearLayout5.setOrientation(0);
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i14);
                                layoutParams2.bottomMargin = e11;
                                linearLayout4.addView(linearLayout5, layoutParams2);
                                FrameLayout u02 = r6.h0.u0(context, e10, i14);
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(e10, i14);
                                int i16 = e11 / 2;
                                layoutParams3.leftMargin = i16;
                                layoutParams3.rightMargin = e11;
                                linearLayout5.addView(u02, layoutParams3);
                                FrameLayout u03 = r6.h0.u0(context, e10, i14);
                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(e10, i14);
                                layoutParams4.rightMargin = i16;
                                linearLayout5.addView(u03, layoutParams4);
                            }
                            nVar.f6979z0 = linearLayout4;
                            linearLayout4.setPadding(nVar.U(16), nVar.U(20), nVar.U(16), nVar.U(40));
                            int indexOfChild = viewGroup.indexOfChild(nVar.f6977x0);
                            if (indexOfChild >= 0) {
                                viewGroup.addView(nVar.f6979z0, indexOfChild, new LinearLayout.LayoutParams(-1, -2));
                            }
                            nVar.f6977x0.setVisibility(8);
                        }
                        if (!bool.booleanValue()) {
                            nVar.f6978y0.setVisibility(4);
                            if (!nVar.C0 && nVar.f6979z0 != null) {
                                nVar.Y();
                                nVar.f6977x0.setVisibility(0);
                                nVar.C0 = true;
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        if (((String) obj) != null) {
                            if (!nVar.C0) {
                                nVar.Y();
                                nVar.f6977x0.setVisibility(0);
                                nVar.C0 = true;
                                return;
                            }
                            return;
                        }
                        int i17 = n.E0;
                        nVar.getClass();
                        return;
                }
            }
        });
        this.f6972s0.f11405f.e(n(), new androidx.lifecycle.d0(this) { // from class: l8.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n f6953b;

            {
                this.f6953b = this;
            }

            @Override // androidx.lifecycle.d0
            public final void f(Object obj) {
                LinearLayout linearLayout3;
                int i12 = i10;
                n nVar = this.f6953b;
                switch (i12) {
                    case 0:
                        Boolean bool = (Boolean) obj;
                        int i13 = n.E0;
                        nVar.getClass();
                        if (bool.booleanValue() && !nVar.C0 && (linearLayout3 = nVar.f6979z0) == null && linearLayout3 == null && nVar.f6977x0.getParent() != null) {
                            ViewGroup viewGroup = (ViewGroup) nVar.f6977x0.getParent();
                            Context context = nVar.f4484m0;
                            int e10 = ((context.getResources().getDisplayMetrics().widthPixels - w8.i.e(context, 32)) - w8.i.e(context, 24)) / 2;
                            int i14 = (int) ((e10 * 230.0f) / 168.0f);
                            LinearLayout linearLayout4 = new LinearLayout(context);
                            linearLayout4.setOrientation(1);
                            linearLayout4.setPadding(0, w8.i.e(context, 20), 0, 0);
                            int e11 = w8.i.e(context, 12);
                            for (int i15 = 0; i15 < 3; i15++) {
                                LinearLayout linearLayout5 = new LinearLayout(context);
                                linearLayout5.setOrientation(0);
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, i14);
                                layoutParams2.bottomMargin = e11;
                                linearLayout4.addView(linearLayout5, layoutParams2);
                                FrameLayout u02 = r6.h0.u0(context, e10, i14);
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(e10, i14);
                                int i16 = e11 / 2;
                                layoutParams3.leftMargin = i16;
                                layoutParams3.rightMargin = e11;
                                linearLayout5.addView(u02, layoutParams3);
                                FrameLayout u03 = r6.h0.u0(context, e10, i14);
                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(e10, i14);
                                layoutParams4.rightMargin = i16;
                                linearLayout5.addView(u03, layoutParams4);
                            }
                            nVar.f6979z0 = linearLayout4;
                            linearLayout4.setPadding(nVar.U(16), nVar.U(20), nVar.U(16), nVar.U(40));
                            int indexOfChild = viewGroup.indexOfChild(nVar.f6977x0);
                            if (indexOfChild >= 0) {
                                viewGroup.addView(nVar.f6979z0, indexOfChild, new LinearLayout.LayoutParams(-1, -2));
                            }
                            nVar.f6977x0.setVisibility(8);
                        }
                        if (!bool.booleanValue()) {
                            nVar.f6978y0.setVisibility(4);
                            if (!nVar.C0 && nVar.f6979z0 != null) {
                                nVar.Y();
                                nVar.f6977x0.setVisibility(0);
                                nVar.C0 = true;
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        if (((String) obj) != null) {
                            if (!nVar.C0) {
                                nVar.Y();
                                nVar.f6977x0.setVisibility(0);
                                nVar.C0 = true;
                                return;
                            }
                            return;
                        }
                        int i17 = n.E0;
                        nVar.getClass();
                        return;
                }
            }
        });
        z zVar = this.f6973t0;
        if (zVar != null) {
            zVar.n();
        }
        this.f6972s0.c();
        return linearLayout;
    }

    public final void X() {
        View view;
        Boolean bool;
        if (V() && !this.B0.isEmpty() && this.D0 != null && (view = this.V) != null) {
            if (view.getBottom() - (this.D0.getScrollY() + this.D0.getHeight()) < U(420) && (bool = (Boolean) this.f6972s0.f11404e.d()) != null && bool.booleanValue()) {
                this.f6978y0.setVisibility(0);
                this.f6972s0.c();
            }
        }
    }

    public final void Y() {
        LinearLayout linearLayout = this.f6979z0;
        if (linearLayout != null && linearLayout.getParent() != null) {
            ((ViewGroup) this.f6979z0.getParent()).removeView(this.f6979z0);
        }
        this.f6979z0 = null;
    }

    public final void Z() {
        if (this.f6967n0 == null) {
            this.f6967n0 = FragmentComponentManager.createContextWrapper(super.k(), this);
            this.f6968o0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.k());
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final GeneratedComponentManager componentManager() {
        if (this.f6969p0 == null) {
            synchronized (this.f6970q0) {
                if (this.f6969p0 == null) {
                    this.f6969p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f6969p0;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        if (this.f6969p0 == null) {
            synchronized (this.f6970q0) {
                if (this.f6969p0 == null) {
                    this.f6969p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f6969p0.generatedComponent();
    }

    @Override // androidx.fragment.app.y, androidx.lifecycle.j
    public final y0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.y
    public final Context k() {
        if (super.k() == null && !this.f6968o0) {
            return null;
        }
        Z();
        return this.f6967n0;
    }

    @Override // androidx.fragment.app.y
    public final void v(Activity activity) {
        boolean z9;
        this.T = true;
        ContextWrapper contextWrapper = this.f6967n0;
        if (contextWrapper != null && FragmentComponentManager.findActivity(contextWrapper) != activity) {
            z9 = false;
        } else {
            z9 = true;
        }
        Preconditions.checkState(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z();
        if (!this.f6971r0) {
            this.f6971r0 = true;
            o oVar = (o) generatedComponent();
            oVar.getClass();
        }
    }

    @Override // g8.b, androidx.fragment.app.y
    public final void w(Context context) {
        super.w(context);
        Z();
        if (!this.f6971r0) {
            this.f6971r0 = true;
            o oVar = (o) generatedComponent();
            oVar.getClass();
        }
    }

    @Override // androidx.fragment.app.y
    public final void x(Bundle bundle) {
        super.x(bundle);
        x8.e eVar = (x8.e) new a1(this, new z0()).a(x8.e.class);
        this.f6972s0 = eVar;
        k8.f fVar = this.f6976w0;
        if (fVar != null) {
            eVar.f11406g = fVar;
            this.f6976w0 = null;
        }
        Bundle bundle2 = this.f1039f;
        if (bundle2 != null) {
            this.f6974u0 = bundle2.getString("title", "");
            this.f6975v0 = bundle2.getBoolean("continue_mode", false);
        }
    }
}
