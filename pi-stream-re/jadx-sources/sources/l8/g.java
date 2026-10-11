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
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import java.util.Collections;
import java.util.Set;
import java.util.function.Consumer;
import msr.pistream.app.R;
import msr.pistream.app.ui.home.screens.MainActivity;
import msr.pistream.app.viewmodel.FilterViewModel;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class g extends g8.b implements GeneratedComponentManagerHolder {
    public static final /* synthetic */ int A0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public ContextWrapper f6923n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f6924o0;

    /* renamed from: p0, reason: collision with root package name */
    public volatile FragmentComponentManager f6925p0;

    /* renamed from: s0, reason: collision with root package name */
    public FilterViewModel f6928s0;

    /* renamed from: t0, reason: collision with root package name */
    public z f6929t0;

    /* renamed from: u0, reason: collision with root package name */
    public LinearLayout f6930u0;

    /* renamed from: q0, reason: collision with root package name */
    public final Object f6926q0 = new Object();

    /* renamed from: r0, reason: collision with root package name */
    public boolean f6927r0 = false;

    /* renamed from: v0, reason: collision with root package name */
    public String f6931v0 = "";

    /* renamed from: w0, reason: collision with root package name */
    public String f6932w0 = "";

    /* renamed from: x0, reason: collision with root package name */
    public String f6933x0 = "";

    /* renamed from: y0, reason: collision with root package name */
    public String f6934y0 = "";

    /* renamed from: z0, reason: collision with root package name */
    public String f6935z0 = "";

    @Override // androidx.fragment.app.y
    public final LayoutInflater C(Bundle bundle) {
        LayoutInflater C = super.C(bundle);
        return C.cloneInContext(FragmentComponentManager.createContextWrapper(C, this));
    }

    @Override // g8.b
    public final View W() {
        boolean z9;
        if ((d() instanceof MainActivity) && ((MainActivity) d()).J != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            LinearLayout linearLayout = new LinearLayout(this.f4484m0);
            linearLayout.setOrientation(1);
            LinearLayout linearLayout2 = new LinearLayout(this.f4484m0);
            this.f6930u0 = linearLayout2;
            linearLayout2.setOrientation(1);
            linearLayout.addView(this.f6930u0, new ViewGroup.LayoutParams(-1, -2));
            Y();
            return linearLayout;
        }
        ScrollView scrollView = new ScrollView(this.f4484m0);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setFillViewport(true);
        LinearLayout linearLayout3 = new LinearLayout(this.f4484m0);
        this.f6930u0 = linearLayout3;
        linearLayout3.setOrientation(1);
        scrollView.addView(this.f6930u0, new ViewGroup.LayoutParams(-1, -2));
        Y();
        return scrollView;
    }

    public final void X(LinearLayout linearLayout, String str, String[] strArr, String[] strArr2, Set set, e eVar) {
        int i10;
        int U;
        int i11;
        g gVar = this;
        String[] strArr3 = strArr;
        LinearLayout linearLayout2 = new LinearLayout(gVar.f4484m0);
        boolean z9 = true;
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(gVar.U(16), gVar.U(16), gVar.U(16), gVar.U(16));
        linearLayout2.setBackground(w8.i.j(w8.i.f11063c, gVar.U(16)));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i12 = 0;
        layoutParams.setMargins(0, 0, 0, gVar.U(14));
        linearLayout.addView(linearLayout2, layoutParams);
        TextView l10 = w8.i.l(gVar.f4484m0, str, 16, -1, 1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, 0, gVar.U(12));
        linearLayout2.addView(l10, layoutParams2);
        LinearLayout linearLayout3 = new LinearLayout(gVar.f4484m0);
        linearLayout3.setOrientation(1);
        int U2 = gVar.f4484m0.getResources().getDisplayMetrics().widthPixels - gVar.U(72);
        int U3 = gVar.U(10);
        LinearLayout linearLayout4 = null;
        int i13 = 0;
        int i14 = 0;
        while (i12 < strArr3.length) {
            String str2 = strArr2[i12];
            TextView i15 = w8.i.i(gVar.f4484m0, strArr3[i12], set.contains(str2));
            i15.setTextSize(14.0f);
            i15.setMinHeight(i13);
            i15.setPadding(gVar.U(16), gVar.U(9), gVar.U(16), gVar.U(9));
            i15.measure(0, 0);
            int measuredWidth = i15.getMeasuredWidth() + U3;
            if (linearLayout4 != null && i14 + measuredWidth <= U2) {
                i11 = 0;
                i10 = -2;
            } else {
                linearLayout4 = new LinearLayout(gVar.f4484m0);
                i14 = 0;
                linearLayout4.setOrientation(0);
                i10 = -2;
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                if (z9) {
                    U = 0;
                } else {
                    U = gVar.U(10);
                }
                layoutParams3.setMargins(0, U, 0, 0);
                linearLayout3.addView(linearLayout4, layoutParams3);
                z9 = false;
                i11 = 0;
            }
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i10, i10);
            layoutParams4.setMargins(i11, i11, U3, i11);
            i15.setOnClickListener(new h8.r(16, eVar, str2));
            linearLayout4.addView(i15, layoutParams4);
            i14 += measuredWidth;
            i12++;
            i13 = 0;
            gVar = this;
            strArr3 = strArr;
        }
        a3.g.w(-1, -2, linearLayout2, linearLayout3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [l8.e] */
    /* JADX WARN: Type inference failed for: r6v2, types: [l8.e] */
    /* JADX WARN: Type inference failed for: r6v3, types: [l8.e] */
    /* JADX WARN: Type inference failed for: r6v4, types: [l8.e] */
    /* JADX WARN: Type inference failed for: r6v5, types: [l8.e] */
    public final void Y() {
        boolean z9;
        MainActivity mainActivity;
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f6930u0;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = new LinearLayout(this.f4484m0);
        linearLayout2.setGravity(16);
        final int i10 = 0;
        linearLayout2.setPadding(U(16), U(56), U(16), 0);
        final int i11 = 1;
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
            this.f6930u0.addView(linearLayout2, new LinearLayout.LayoutParams(-1, U(120)));
        }
        ImageView imageView = new ImageView(this.f4484m0);
        imageView.setImageResource(R.drawable.ic_back);
        imageView.setColorFilter(-1);
        imageView.setPadding(U(8), U(8), U(8), U(8));
        final int i12 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: l8.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f6920b;

            {
                this.f6920b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z zVar;
                int i13 = i12;
                g gVar = this.f6920b;
                switch (i13) {
                    case 0:
                        gVar.f6931v0 = "";
                        gVar.f6932w0 = "";
                        gVar.f6933x0 = "";
                        gVar.f6934y0 = "";
                        gVar.f6935z0 = "";
                        FilterViewModel filterViewModel = gVar.f6928s0;
                        filterViewModel.f7800a.j("");
                        filterViewModel.f7801b.j("");
                        filterViewModel.f7802c.j("");
                        filterViewModel.f7803d.j("");
                        filterViewModel.f7804e.j("");
                        gVar.Y();
                        return;
                    case 1:
                        gVar.f6928s0.f7800a.j(gVar.f6931v0);
                        gVar.f6928s0.f7801b.j(gVar.f6932w0);
                        gVar.f6928s0.f7802c.j(gVar.f6933x0);
                        gVar.f6928s0.f7803d.j(gVar.f6934y0);
                        gVar.f6928s0.f7804e.j(gVar.f6935z0);
                        FilterViewModel filterViewModel2 = gVar.f6928s0;
                        androidx.lifecycle.c0 c0Var = filterViewModel2.f7805f;
                        c0Var.j(new x8.c());
                        if (((x8.c) gVar.f6928s0.f7805f.d()) != null && (zVar = gVar.f6929t0) != null) {
                            int i14 = MainActivity.f7741b0;
                            MainActivity mainActivity2 = zVar.f7036b;
                            androidx.fragment.app.y C = mainActivity2.getSupportFragmentManager().C("filter_fragment");
                            if (C != null) {
                                androidx.fragment.app.s0 supportFragmentManager = mainActivity2.getSupportFragmentManager();
                                supportFragmentManager.getClass();
                                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                                aVar.i(C);
                                aVar.f();
                            }
                            mainActivity2.P("Filter", new x(mainActivity2, 19), false);
                            return;
                        }
                        return;
                    default:
                        z zVar2 = gVar.f6929t0;
                        if (zVar2 != null) {
                            zVar2.a();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(U(44), U(44)));
        TextView l10 = w8.i.l(this.f4484m0, "Filter", 22, -1, 1);
        l10.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(U(8), 0, 0, 0);
        linearLayout2.addView(l10, layoutParams);
        LinearLayout linearLayout3 = new LinearLayout(this.f4484m0);
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(U(20), U(20), U(20), U(30));
        a3.g.w(-1, -2, this.f6930u0, linearLayout3);
        X(linearLayout3, "Type", FilterViewModel.f7793h, FilterViewModel.f7794i, Collections.singleton(this.f6931v0), new Consumer(this) { // from class: l8.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f6918b;

            {
                this.f6918b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        g gVar = this.f6918b;
                        gVar.f6931v0 = (String) obj;
                        gVar.Y();
                        return;
                    case 1:
                        g gVar2 = this.f6918b;
                        gVar2.f6932w0 = (String) obj;
                        gVar2.Y();
                        return;
                    case 2:
                        g gVar3 = this.f6918b;
                        gVar3.f6933x0 = (String) obj;
                        gVar3.Y();
                        return;
                    case 3:
                        g gVar4 = this.f6918b;
                        gVar4.f6934y0 = (String) obj;
                        gVar4.Y();
                        return;
                    default:
                        g gVar5 = this.f6918b;
                        gVar5.f6935z0 = (String) obj;
                        gVar5.Y();
                        return;
                }
            }
        });
        X(linearLayout3, "Country", FilterViewModel.f7795j, FilterViewModel.f7796k, Collections.singleton(this.f6932w0), new Consumer(this) { // from class: l8.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f6918b;

            {
                this.f6918b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        g gVar = this.f6918b;
                        gVar.f6931v0 = (String) obj;
                        gVar.Y();
                        return;
                    case 1:
                        g gVar2 = this.f6918b;
                        gVar2.f6932w0 = (String) obj;
                        gVar2.Y();
                        return;
                    case 2:
                        g gVar3 = this.f6918b;
                        gVar3.f6933x0 = (String) obj;
                        gVar3.Y();
                        return;
                    case 3:
                        g gVar4 = this.f6918b;
                        gVar4.f6934y0 = (String) obj;
                        gVar4.Y();
                        return;
                    default:
                        g gVar5 = this.f6918b;
                        gVar5.f6935z0 = (String) obj;
                        gVar5.Y();
                        return;
                }
            }
        });
        X(linearLayout3, "Audio", FilterViewModel.f7797l, FilterViewModel.f7798m, Collections.singleton(this.f6933x0), new Consumer(this) { // from class: l8.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f6918b;

            {
                this.f6918b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        g gVar = this.f6918b;
                        gVar.f6931v0 = (String) obj;
                        gVar.Y();
                        return;
                    case 1:
                        g gVar2 = this.f6918b;
                        gVar2.f6932w0 = (String) obj;
                        gVar2.Y();
                        return;
                    case 2:
                        g gVar3 = this.f6918b;
                        gVar3.f6933x0 = (String) obj;
                        gVar3.Y();
                        return;
                    case 3:
                        g gVar4 = this.f6918b;
                        gVar4.f6934y0 = (String) obj;
                        gVar4.Y();
                        return;
                    default:
                        g gVar5 = this.f6918b;
                        gVar5.f6935z0 = (String) obj;
                        gVar5.Y();
                        return;
                }
            }
        });
        final int i13 = 3;
        X(linearLayout3, "Year", FilterViewModel.f7799n, FilterViewModel.o, Collections.singleton(this.f6934y0), new Consumer(this) { // from class: l8.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f6918b;

            {
                this.f6918b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        g gVar = this.f6918b;
                        gVar.f6931v0 = (String) obj;
                        gVar.Y();
                        return;
                    case 1:
                        g gVar2 = this.f6918b;
                        gVar2.f6932w0 = (String) obj;
                        gVar2.Y();
                        return;
                    case 2:
                        g gVar3 = this.f6918b;
                        gVar3.f6933x0 = (String) obj;
                        gVar3.Y();
                        return;
                    case 3:
                        g gVar4 = this.f6918b;
                        gVar4.f6934y0 = (String) obj;
                        gVar4.Y();
                        return;
                    default:
                        g gVar5 = this.f6918b;
                        gVar5.f6935z0 = (String) obj;
                        gVar5.Y();
                        return;
                }
            }
        });
        String[] strArr = new String[13];
        strArr[0] = "All";
        String[] strArr2 = FilterViewModel.f7792g;
        System.arraycopy(strArr2, 0, strArr, 1, 12);
        String[] strArr3 = new String[13];
        strArr3[0] = "";
        System.arraycopy(strArr2, 0, strArr3, 1, 12);
        final int i14 = 4;
        X(linearLayout3, "Genre", strArr, strArr3, Collections.singleton(this.f6935z0), new Consumer(this) { // from class: l8.e

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f6918b;

            {
                this.f6918b = this;
            }

            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i14) {
                    case 0:
                        g gVar = this.f6918b;
                        gVar.f6931v0 = (String) obj;
                        gVar.Y();
                        return;
                    case 1:
                        g gVar2 = this.f6918b;
                        gVar2.f6932w0 = (String) obj;
                        gVar2.Y();
                        return;
                    case 2:
                        g gVar3 = this.f6918b;
                        gVar3.f6933x0 = (String) obj;
                        gVar3.Y();
                        return;
                    case 3:
                        g gVar4 = this.f6918b;
                        gVar4.f6934y0 = (String) obj;
                        gVar4.Y();
                        return;
                    default:
                        g gVar5 = this.f6918b;
                        gVar5.f6935z0 = (String) obj;
                        gVar5.Y();
                        return;
                }
            }
        });
        LinearLayout linearLayout4 = new LinearLayout(this.f4484m0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, U(58));
        layoutParams2.setMargins(0, U(16), 0, 0);
        linearLayout3.addView(linearLayout4, layoutParams2);
        TextView i15 = w8.i.i(this.f4484m0, "Reset", false);
        TextView i16 = w8.i.i(this.f4484m0, "Apply", true);
        i15.setOnClickListener(new View.OnClickListener(this) { // from class: l8.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f6920b;

            {
                this.f6920b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z zVar;
                int i132 = i10;
                g gVar = this.f6920b;
                switch (i132) {
                    case 0:
                        gVar.f6931v0 = "";
                        gVar.f6932w0 = "";
                        gVar.f6933x0 = "";
                        gVar.f6934y0 = "";
                        gVar.f6935z0 = "";
                        FilterViewModel filterViewModel = gVar.f6928s0;
                        filterViewModel.f7800a.j("");
                        filterViewModel.f7801b.j("");
                        filterViewModel.f7802c.j("");
                        filterViewModel.f7803d.j("");
                        filterViewModel.f7804e.j("");
                        gVar.Y();
                        return;
                    case 1:
                        gVar.f6928s0.f7800a.j(gVar.f6931v0);
                        gVar.f6928s0.f7801b.j(gVar.f6932w0);
                        gVar.f6928s0.f7802c.j(gVar.f6933x0);
                        gVar.f6928s0.f7803d.j(gVar.f6934y0);
                        gVar.f6928s0.f7804e.j(gVar.f6935z0);
                        FilterViewModel filterViewModel2 = gVar.f6928s0;
                        androidx.lifecycle.c0 c0Var = filterViewModel2.f7805f;
                        c0Var.j(new x8.c());
                        if (((x8.c) gVar.f6928s0.f7805f.d()) != null && (zVar = gVar.f6929t0) != null) {
                            int i142 = MainActivity.f7741b0;
                            MainActivity mainActivity2 = zVar.f7036b;
                            androidx.fragment.app.y C = mainActivity2.getSupportFragmentManager().C("filter_fragment");
                            if (C != null) {
                                androidx.fragment.app.s0 supportFragmentManager = mainActivity2.getSupportFragmentManager();
                                supportFragmentManager.getClass();
                                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                                aVar.i(C);
                                aVar.f();
                            }
                            mainActivity2.P("Filter", new x(mainActivity2, 19), false);
                            return;
                        }
                        return;
                    default:
                        z zVar2 = gVar.f6929t0;
                        if (zVar2 != null) {
                            zVar2.a();
                            return;
                        }
                        return;
                }
            }
        });
        i16.setOnClickListener(new View.OnClickListener(this) { // from class: l8.f

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f6920b;

            {
                this.f6920b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                z zVar;
                int i132 = i11;
                g gVar = this.f6920b;
                switch (i132) {
                    case 0:
                        gVar.f6931v0 = "";
                        gVar.f6932w0 = "";
                        gVar.f6933x0 = "";
                        gVar.f6934y0 = "";
                        gVar.f6935z0 = "";
                        FilterViewModel filterViewModel = gVar.f6928s0;
                        filterViewModel.f7800a.j("");
                        filterViewModel.f7801b.j("");
                        filterViewModel.f7802c.j("");
                        filterViewModel.f7803d.j("");
                        filterViewModel.f7804e.j("");
                        gVar.Y();
                        return;
                    case 1:
                        gVar.f6928s0.f7800a.j(gVar.f6931v0);
                        gVar.f6928s0.f7801b.j(gVar.f6932w0);
                        gVar.f6928s0.f7802c.j(gVar.f6933x0);
                        gVar.f6928s0.f7803d.j(gVar.f6934y0);
                        gVar.f6928s0.f7804e.j(gVar.f6935z0);
                        FilterViewModel filterViewModel2 = gVar.f6928s0;
                        androidx.lifecycle.c0 c0Var = filterViewModel2.f7805f;
                        c0Var.j(new x8.c());
                        if (((x8.c) gVar.f6928s0.f7805f.d()) != null && (zVar = gVar.f6929t0) != null) {
                            int i142 = MainActivity.f7741b0;
                            MainActivity mainActivity2 = zVar.f7036b;
                            androidx.fragment.app.y C = mainActivity2.getSupportFragmentManager().C("filter_fragment");
                            if (C != null) {
                                androidx.fragment.app.s0 supportFragmentManager = mainActivity2.getSupportFragmentManager();
                                supportFragmentManager.getClass();
                                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                                aVar.i(C);
                                aVar.f();
                            }
                            mainActivity2.P("Filter", new x(mainActivity2, 19), false);
                            return;
                        }
                        return;
                    default:
                        z zVar2 = gVar.f6929t0;
                        if (zVar2 != null) {
                            zVar2.a();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout4.addView(i15, new LinearLayout.LayoutParams(0, -1, 1.0f));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -1, 1.0f);
        layoutParams3.setMargins(U(12), 0, 0, 0);
        linearLayout4.addView(i16, layoutParams3);
    }

    public final void Z() {
        if (this.f6923n0 == null) {
            this.f6923n0 = FragmentComponentManager.createContextWrapper(super.k(), this);
            this.f6924o0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.k());
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final GeneratedComponentManager componentManager() {
        if (this.f6925p0 == null) {
            synchronized (this.f6926q0) {
                if (this.f6925p0 == null) {
                    this.f6925p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f6925p0;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        if (this.f6925p0 == null) {
            synchronized (this.f6926q0) {
                if (this.f6925p0 == null) {
                    this.f6925p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f6925p0.generatedComponent();
    }

    @Override // androidx.fragment.app.y, androidx.lifecycle.j
    public final y0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.y
    public final Context k() {
        if (super.k() == null && !this.f6924o0) {
            return null;
        }
        Z();
        return this.f6923n0;
    }

    @Override // androidx.fragment.app.y
    public final void v(Activity activity) {
        boolean z9;
        this.T = true;
        ContextWrapper contextWrapper = this.f6923n0;
        if (contextWrapper != null && FragmentComponentManager.findActivity(contextWrapper) != activity) {
            z9 = false;
        } else {
            z9 = true;
        }
        Preconditions.checkState(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z();
        if (!this.f6927r0) {
            this.f6927r0 = true;
            h hVar = (h) generatedComponent();
            hVar.getClass();
        }
    }

    @Override // g8.b, androidx.fragment.app.y
    public final void w(Context context) {
        super.w(context);
        Z();
        if (!this.f6927r0) {
            this.f6927r0 = true;
            h hVar = (h) generatedComponent();
            hVar.getClass();
        }
    }

    @Override // androidx.fragment.app.y
    public final void x(Bundle bundle) {
        super.x(bundle);
        FilterViewModel filterViewModel = (FilterViewModel) new a1(N()).a(FilterViewModel.class);
        this.f6928s0 = filterViewModel;
        String str = (String) filterViewModel.f7800a.d();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        this.f6931v0 = str;
        String str3 = (String) this.f6928s0.f7801b.d();
        if (str3 == null) {
            str3 = "";
        }
        this.f6932w0 = str3;
        String str4 = (String) this.f6928s0.f7802c.d();
        if (str4 == null) {
            str4 = "";
        }
        this.f6933x0 = str4;
        String str5 = (String) this.f6928s0.f7803d.d();
        if (str5 == null) {
            str5 = "";
        }
        this.f6934y0 = str5;
        String str6 = (String) this.f6928s0.f7804e.d();
        if (str6 != null) {
            str2 = str6;
        }
        this.f6935z0 = str2;
    }
}
