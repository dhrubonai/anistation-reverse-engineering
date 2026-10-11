package l8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.lifecycle.a1;
import androidx.lifecycle.y0;
import androidx.recyclerview.widget.RecyclerView;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.flags.FragmentGetContextFix;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.managers.FragmentComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import msr.pistream.app.R;
import msr.pistream.app.ui.home.screens.MainActivity;
import msr.pistream.app.viewmodel.HomeViewModel;
import msr.pistream.app.viewmodel.SearchViewModel;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class n0 extends g8.b implements GeneratedComponentManagerHolder {
    public static final /* synthetic */ int L0 = 0;
    public View A0;
    public int B0;
    public String C0;
    public ArrayList D0;
    public boolean E0;
    public boolean F0;
    public RecyclerView G0;
    public i8.d H0;
    public boolean I0;
    public boolean J0;
    public ArrayList K0;

    /* renamed from: n0, reason: collision with root package name */
    public ContextWrapper f6980n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f6981o0;

    /* renamed from: p0, reason: collision with root package name */
    public volatile FragmentComponentManager f6982p0;

    /* renamed from: s0, reason: collision with root package name */
    public SearchViewModel f6985s0;

    /* renamed from: t0, reason: collision with root package name */
    public HomeViewModel f6986t0;

    /* renamed from: u0, reason: collision with root package name */
    public z f6987u0;

    /* renamed from: x0, reason: collision with root package name */
    public LinearLayout f6990x0;

    /* renamed from: y0, reason: collision with root package name */
    public LinearLayout f6991y0;

    /* renamed from: z0, reason: collision with root package name */
    public EditText f6992z0;

    /* renamed from: q0, reason: collision with root package name */
    public final Object f6983q0 = new Object();

    /* renamed from: r0, reason: collision with root package name */
    public boolean f6984r0 = false;

    /* renamed from: v0, reason: collision with root package name */
    public final ExecutorService f6988v0 = Executors.newFixedThreadPool(2);

    /* renamed from: w0, reason: collision with root package name */
    public final Handler f6989w0 = new Handler(Looper.getMainLooper());

    @Override // androidx.fragment.app.y
    public final LayoutInflater C(Bundle bundle) {
        LayoutInflater C = super.C(bundle);
        return C.cloneInContext(FragmentComponentManager.createContextWrapper(C, this));
    }

    @Override // g8.b
    public final View W() {
        LinearLayout linearLayout = new LinearLayout(this.f4484m0);
        this.f6990x0 = linearLayout;
        linearLayout.setOrientation(1);
        this.f6990x0.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        X();
        EditText editText = this.f6992z0;
        if (editText != null) {
            editText.requestFocus();
        }
        return this.f6990x0;
    }

    public final void X() {
        boolean z9;
        boolean v9;
        k8.a aVar;
        List list;
        ArrayList arrayList;
        MainActivity mainActivity;
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f6990x0;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = new LinearLayout(this.f4484m0);
        linearLayout2.setGravity(16);
        final int i10 = 0;
        linearLayout2.setPadding(U(16), U(56), U(20), 0);
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
            this.f6990x0.addView(linearLayout2, new LinearLayout.LayoutParams(-1, U(120)));
        }
        ImageView imageView = new ImageView(this.f4484m0);
        imageView.setImageResource(R.drawable.ic_back);
        imageView.setColorFilter(-1);
        imageView.setPadding(U(8), U(8), U(8), U(8));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: l8.j0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f6955b;

            {
                this.f6955b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i12 = 0;
                int i13 = i11;
                n0 n0Var = this.f6955b;
                switch (i13) {
                    case 0:
                        e8.c cVar = n0Var.f6985s0.f7851b;
                        cVar.getClass();
                        r6.h0.C0(cVar.f3596a, new ArrayList());
                        if (n0Var.q() && n0Var.V != null) {
                            n0Var.J0 = false;
                            n0Var.K0 = null;
                            n0Var.X();
                            return;
                        }
                        return;
                    case 1:
                        z zVar = n0Var.f6987u0;
                        if (zVar != null) {
                            zVar.a();
                            return;
                        }
                        return;
                    default:
                        z zVar2 = n0Var.f6987u0;
                        if (zVar2 != null) {
                            zVar2.f7036b.T.push(new m0(zVar2, i12));
                            n0Var.f6987u0.i();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(U(44), U(44)));
        FrameLayout frameLayout2 = new FrameLayout(this.f4484m0);
        frameLayout2.setBackgroundResource(R.drawable.bg_search);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, U(48), 1.0f);
        layoutParams.setMargins(U(10), 0, U(10), 0);
        linearLayout2.addView(frameLayout2, layoutParams);
        ImageView imageView2 = new ImageView(this.f4484m0);
        imageView2.setImageResource(R.drawable.ic_search);
        int i12 = w8.i.f11068h;
        imageView2.setColorFilter(i12);
        imageView2.setPadding(U(14), U(14), U(14), U(14));
        frameLayout2.addView(imageView2, new FrameLayout.LayoutParams(U(48), U(48), 19));
        EditText editText = new EditText(this.f4484m0);
        this.f6992z0 = editText;
        editText.setSingleLine(true);
        this.f6992z0.setHint("Search");
        this.f6992z0.setHintTextColor(i12);
        this.f6992z0.setTextColor(-1);
        this.f6992z0.setTextSize(16.0f);
        this.f6992z0.setTypeface(Typeface.DEFAULT, 1);
        int i13 = 52;
        this.f6992z0.setPadding(U(52), 0, U(20), 0);
        this.f6992z0.setBackgroundColor(0);
        int i14 = 3;
        this.f6992z0.setImeOptions(3);
        this.f6992z0.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: l8.l0
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i15, KeyEvent keyEvent) {
                int i16 = n0.L0;
                n0 n0Var = n0.this;
                if (i15 == 3) {
                    n0Var.Z();
                    return true;
                }
                n0Var.getClass();
                return false;
            }
        });
        frameLayout2.addView(this.f6992z0, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView3 = new ImageView(this.f4484m0);
        imageView3.setImageResource(R.drawable.ic_filter);
        imageView3.clearColorFilter();
        final int i15 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: l8.j0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n0 f6955b;

            {
                this.f6955b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i122 = 0;
                int i132 = i15;
                n0 n0Var = this.f6955b;
                switch (i132) {
                    case 0:
                        e8.c cVar = n0Var.f6985s0.f7851b;
                        cVar.getClass();
                        r6.h0.C0(cVar.f3596a, new ArrayList());
                        if (n0Var.q() && n0Var.V != null) {
                            n0Var.J0 = false;
                            n0Var.K0 = null;
                            n0Var.X();
                            return;
                        }
                        return;
                    case 1:
                        z zVar = n0Var.f6987u0;
                        if (zVar != null) {
                            zVar.a();
                            return;
                        }
                        return;
                    default:
                        z zVar2 = n0Var.f6987u0;
                        if (zVar2 != null) {
                            zVar2.f7036b.T.push(new m0(zVar2, i122));
                            n0Var.f6987u0.i();
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout2.addView(imageView3, new LinearLayout.LayoutParams(U(56), U(56)));
        if (!this.I0) {
            this.I0 = true;
            this.f6985s0.f7853d.e(n(), new j1.n(this, i14));
        }
        LinearLayout linearLayout3 = new LinearLayout(this.f4484m0);
        this.f6991y0 = linearLayout3;
        linearLayout3.setOrientation(1);
        this.f6991y0.setPadding(U(20), U(24), U(20), U(40));
        ScrollView scrollView = new ScrollView(this.f4484m0);
        scrollView.setVerticalScrollBarEnabled(false);
        LinearLayout linearLayout4 = new LinearLayout(this.f4484m0);
        linearLayout4.setOrientation(1);
        scrollView.addView(linearLayout4, new ViewGroup.LayoutParams(-1, -2));
        this.f6991y0.addView(scrollView, new LinearLayout.LayoutParams(-1, -2));
        this.f6990x0.addView(this.f6991y0, new LinearLayout.LayoutParams(-1, -1, 1.0f));
        ArrayList e10 = r6.h0.e(this.f6985s0.f7851b.f3596a);
        if (!e10.isEmpty()) {
            LinearLayout linearLayout5 = new LinearLayout(this.f4484m0);
            linearLayout5.setGravity(16);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, U(34));
            layoutParams2.setMargins(0, 0, 0, U(14));
            linearLayout4.addView(linearLayout5, layoutParams2);
            a3.g.v(0, -2, 1.0f, linearLayout5, w8.i.l(this.f4484m0, "Recent Searches", 20, -1, 1));
            TextView l10 = w8.i.l(this.f4484m0, "Clear All", 14, w8.i.f11065e, 1);
            l10.setOnClickListener(new View.OnClickListener(this) { // from class: l8.j0

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ n0 f6955b;

                {
                    this.f6955b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i122 = 0;
                    int i132 = i10;
                    n0 n0Var = this.f6955b;
                    switch (i132) {
                        case 0:
                            e8.c cVar = n0Var.f6985s0.f7851b;
                            cVar.getClass();
                            r6.h0.C0(cVar.f3596a, new ArrayList());
                            if (n0Var.q() && n0Var.V != null) {
                                n0Var.J0 = false;
                                n0Var.K0 = null;
                                n0Var.X();
                                return;
                            }
                            return;
                        case 1:
                            z zVar = n0Var.f6987u0;
                            if (zVar != null) {
                                zVar.a();
                                return;
                            }
                            return;
                        default:
                            z zVar2 = n0Var.f6987u0;
                            if (zVar2 != null) {
                                zVar2.f7036b.T.push(new m0(zVar2, i122));
                                n0Var.f6987u0.i();
                                return;
                            }
                            return;
                    }
                }
            });
            linearLayout5.addView(l10, new LinearLayout.LayoutParams(-2, -2));
            Iterator it = e10.iterator();
            while (it.hasNext()) {
                final w7.d dVar = (w7.d) it.next();
                LinearLayout linearLayout6 = new LinearLayout(this.f4484m0);
                linearLayout6.setGravity(16);
                linearLayout6.setPadding(0, 0, 0, 0);
                linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(-1, U(i13)));
                linearLayout6.setOnClickListener(new View.OnClickListener(this) { // from class: l8.k0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n0 f6959b;

                    {
                        this.f6959b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i16 = i10;
                        w7.d dVar2 = dVar;
                        n0 n0Var = this.f6959b;
                        switch (i16) {
                            case 0:
                                EditText editText2 = n0Var.f6992z0;
                                if (editText2 != null) {
                                    editText2.setText(dVar2.f11043a);
                                    n0Var.f6992z0.setSelection(dVar2.f11043a.length());
                                    n0Var.Z();
                                    return;
                                }
                                return;
                            default:
                                SearchViewModel searchViewModel = n0Var.f6985s0;
                                String str = dVar2.f11043a;
                                e8.c cVar = searchViewModel.f7851b;
                                cVar.getClass();
                                if (str != null && !str.trim().isEmpty()) {
                                    Context context = cVar.f3596a;
                                    ArrayList e11 = r6.h0.e(context);
                                    int size = e11.size();
                                    while (true) {
                                        size--;
                                        if (size >= 0) {
                                            if (((w7.d) e11.get(size)).f11043a.equalsIgnoreCase(str.trim())) {
                                                e11.remove(size);
                                            }
                                        }
                                    }
                                    r6.h0.C0(context, e11);
                                }
                                if (n0Var.q() && n0Var.V != null) {
                                    n0Var.J0 = false;
                                    n0Var.K0 = null;
                                    n0Var.X();
                                    return;
                                }
                                return;
                        }
                    }
                });
                ImageView imageView4 = new ImageView(this.f4484m0);
                imageView4.setImageResource(R.drawable.ic_search);
                imageView4.setColorFilter(w8.i.f11068h);
                imageView4.setPadding(U(8), U(8), U(8), U(8));
                linearLayout6.addView(imageView4, new LinearLayout.LayoutParams(U(40), U(40)));
                TextView l11 = w8.i.l(this.f4484m0, dVar.f11043a, 15, -1, 0);
                l11.setMaxLines(1);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 1.0f);
                layoutParams3.setMargins(U(8), 0, 0, 0);
                linearLayout6.addView(l11, layoutParams3);
                TextView l12 = w8.i.l(this.f4484m0, "✕", 16, Color.argb(180, 255, 255, 255), 0);
                l12.setGravity(17);
                int U = U(10);
                l12.setPadding(U, U, U, U);
                l12.setLayoutParams(new LinearLayout.LayoutParams(U(44), U(44)));
                l12.setOnClickListener(new View.OnClickListener(this) { // from class: l8.k0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ n0 f6959b;

                    {
                        this.f6959b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i16 = i11;
                        w7.d dVar2 = dVar;
                        n0 n0Var = this.f6959b;
                        switch (i16) {
                            case 0:
                                EditText editText2 = n0Var.f6992z0;
                                if (editText2 != null) {
                                    editText2.setText(dVar2.f11043a);
                                    n0Var.f6992z0.setSelection(dVar2.f11043a.length());
                                    n0Var.Z();
                                    return;
                                }
                                return;
                            default:
                                SearchViewModel searchViewModel = n0Var.f6985s0;
                                String str = dVar2.f11043a;
                                e8.c cVar = searchViewModel.f7851b;
                                cVar.getClass();
                                if (str != null && !str.trim().isEmpty()) {
                                    Context context = cVar.f3596a;
                                    ArrayList e11 = r6.h0.e(context);
                                    int size = e11.size();
                                    while (true) {
                                        size--;
                                        if (size >= 0) {
                                            if (((w7.d) e11.get(size)).f11043a.equalsIgnoreCase(str.trim())) {
                                                e11.remove(size);
                                            }
                                        }
                                    }
                                    r6.h0.C0(context, e11);
                                }
                                if (n0Var.q() && n0Var.V != null) {
                                    n0Var.J0 = false;
                                    n0Var.K0 = null;
                                    n0Var.X();
                                    return;
                                }
                                return;
                        }
                    }
                });
                linearLayout6.addView(l12);
                linearLayout4.addView(linearLayout6);
                i13 = 52;
            }
            View view = new View(this.f4484m0);
            view.setBackgroundColor(Color.argb(20, 255, 255, 255));
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, U(1));
            layoutParams4.setMargins(0, U(4), 0, U(22));
            linearLayout4.addView(view, layoutParams4);
        }
        TextView l13 = w8.i.l(this.f4484m0, "Top Search", 20, -1, 1);
        l13.setGravity(16);
        linearLayout4.addView(l13, new LinearLayout.LayoutParams(-1, U(48)));
        LinearLayout linearLayout7 = new LinearLayout(this.f4484m0);
        linearLayout7.setOrientation(1);
        linearLayout4.addView(linearLayout7, new LinearLayout.LayoutParams(-1, -2));
        z zVar = this.f6987u0;
        if (zVar != null) {
            int i16 = zVar.f7035a;
            MainActivity mainActivity2 = zVar.f7036b;
            switch (i16) {
                case 2:
                    v9 = MainActivity.v(mainActivity2);
                    break;
                default:
                    v9 = MainActivity.v(mainActivity2);
                    break;
            }
            if (v9) {
                if (this.J0 && (arrayList = this.K0) != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linearLayout7.addView(b0((a8.b) it2.next()));
                    }
                    return;
                }
                z zVar2 = this.f6987u0;
                int i17 = zVar2.f7035a;
                MainActivity mainActivity3 = zVar2.f7036b;
                switch (i17) {
                    case 20:
                        aVar = mainActivity3.F;
                        break;
                    case 21:
                        aVar = mainActivity3.F;
                        break;
                    default:
                        aVar = mainActivity3.F;
                        break;
                }
                if (aVar != null) {
                    list = aVar.a("popular");
                } else {
                    list = null;
                }
                if (list != null && !list.isEmpty()) {
                    List subList = list.subList(0, Math.min(list.size(), 12));
                    Iterator it3 = subList.iterator();
                    while (it3.hasNext()) {
                        linearLayout7.addView(b0((a8.b) it3.next()));
                    }
                    this.K0 = new ArrayList(subList);
                    this.J0 = true;
                    return;
                }
                Context context = this.f4484m0;
                LinearLayout linearLayout8 = new LinearLayout(context);
                linearLayout8.setOrientation(1);
                int i18 = 0;
                while (i10 < 5) {
                    LinearLayout linearLayout9 = new LinearLayout(context);
                    linearLayout9.setGravity(16);
                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, w8.i.e(context, 113));
                    layoutParams5.bottomMargin = w8.i.e(context, 16);
                    linearLayout9.setLayoutParams(layoutParams5);
                    linearLayout9.addView(r6.h0.j(context, w8.i.e(context, 150), w8.i.e(context, 113), i18), new LinearLayout.LayoutParams(w8.i.e(context, 150), w8.i.e(context, 113)));
                    LinearLayout linearLayout10 = new LinearLayout(context);
                    linearLayout10.setOrientation(i11);
                    LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(i18, -2, 1.0f);
                    layoutParams6.leftMargin = w8.i.e(context, 20);
                    linearLayout9.addView(linearLayout10, layoutParams6);
                    linearLayout10.addView(r6.h0.j(context, w8.i.e(context, 180), w8.i.e(context, 14), w8.i.e(context, 4)), new LinearLayout.LayoutParams(w8.i.e(context, 180), w8.i.e(context, 14)));
                    LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(w8.i.e(context, 120), w8.i.e(context, 14));
                    layoutParams7.topMargin = w8.i.e(context, 10);
                    linearLayout10.addView(r6.h0.j(context, w8.i.e(context, 120), w8.i.e(context, 14), w8.i.e(context, 4)), layoutParams7);
                    linearLayout8.addView(linearLayout9);
                    i10++;
                    i11 = 1;
                    i18 = 0;
                }
                linearLayout7.addView(linearLayout8, new LinearLayout.LayoutParams(-1, -2));
                this.f6988v0.execute(new q0.o(this, linearLayout7, aVar, 11));
                return;
            }
        }
        z zVar3 = this.f6987u0;
        if (zVar3 != null) {
            linearLayout7.addView(zVar3.o("No Internet", "Internet connection is required."));
        }
    }

    public final void Y() {
        if (this.f6980n0 == null) {
            this.f6980n0 = FragmentComponentManager.createContextWrapper(super.k(), this);
            this.f6981o0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.k());
        }
    }

    public final void Z() {
        String trim = this.f6992z0.getText().toString().trim();
        if (trim.isEmpty()) {
            return;
        }
        this.C0 = trim;
        this.B0 = 1;
        this.E0 = true;
        this.D0 = new ArrayList();
        this.F0 = false;
        this.f6985s0.b(1, trim);
    }

    public final void a0(String str) {
        LinearLayout linearLayout = this.f6991y0;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        this.f6991y0.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        ScrollView scrollView = new ScrollView(this.f4484m0);
        scrollView.setVerticalScrollBarEnabled(false);
        LinearLayout linearLayout2 = new LinearLayout(this.f4484m0);
        linearLayout2.setOrientation(1);
        scrollView.addView(linearLayout2, new ViewGroup.LayoutParams(-1, -2));
        this.f6991y0.addView(scrollView, new LinearLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(this.f4484m0);
        imageView.setImageResource(R.drawable.ic_not_found);
        imageView.clearColorFilter();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, U(120), 0, 0);
        linearLayout2.addView(imageView, layoutParams);
        TextView l10 = w8.i.l(this.f4484m0, "Not Found", 24, w8.i.f11065e, 1);
        LinearLayout.LayoutParams c6 = r.f.c(l10, 17, -1, -2);
        c6.setMargins(0, U(32), 0, 0);
        linearLayout2.addView(l10, c6);
        TextView l11 = w8.i.l(this.f4484m0, str, 18, -1, 0);
        linearLayout2.addView(l11, r.f.c(l11, 17, -1, -2));
    }

    public final LinearLayout b0(a8.b bVar) {
        String str;
        LinearLayout linearLayout = new LinearLayout(this.f4484m0);
        linearLayout.setGravity(16);
        linearLayout.setOnClickListener(new h8.r(19, this, bVar));
        ImageView imageView = new ImageView(this.f4484m0);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        int U = U(52);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(U, U);
        layoutParams.setMargins(0, 0, U(14), 0);
        linearLayout.addView(imageView, layoutParams);
        String str2 = bVar.f170c;
        if (str2 != null && !str2.isEmpty()) {
            str = bVar.f170c;
        } else {
            str = bVar.A;
        }
        if (str != null && !str.isEmpty()) {
            ((com.bumptech.glide.l) com.bumptech.glide.b.d(this.f4484m0).n(str).j()).x(imageView);
        } else {
            imageView.setImageResource(R.drawable.bg_card);
        }
        LinearLayout linearLayout2 = new LinearLayout(this.f4484m0);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(16);
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        Context context = this.f4484m0;
        String str3 = bVar.f168a;
        if (str3 == null) {
            str3 = "";
        }
        TextView l10 = w8.i.l(context, str3, 15, -1, 1);
        l10.setMaxLines(1);
        linearLayout2.addView(l10, new LinearLayout.LayoutParams(-1, -2));
        String str4 = bVar.C;
        if (str4 != null && !str4.isEmpty()) {
            r.f.i(-1, -2, linearLayout2, w8.i.l(this.f4484m0, a3.g.t(new StringBuilder(), bVar.C, " / 10"), 12, w8.i.f11068h, 0));
        }
        return linearLayout;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final GeneratedComponentManager componentManager() {
        if (this.f6982p0 == null) {
            synchronized (this.f6983q0) {
                if (this.f6982p0 == null) {
                    this.f6982p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f6982p0;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        if (this.f6982p0 == null) {
            synchronized (this.f6983q0) {
                if (this.f6982p0 == null) {
                    this.f6982p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f6982p0.generatedComponent();
    }

    @Override // androidx.fragment.app.y, androidx.lifecycle.j
    public final y0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.y
    public final Context k() {
        if (super.k() == null && !this.f6981o0) {
            return null;
        }
        Y();
        return this.f6980n0;
    }

    @Override // androidx.fragment.app.y
    public final void v(Activity activity) {
        boolean z9;
        this.T = true;
        ContextWrapper contextWrapper = this.f6980n0;
        if (contextWrapper != null && FragmentComponentManager.findActivity(contextWrapper) != activity) {
            z9 = false;
        } else {
            z9 = true;
        }
        Preconditions.checkState(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Y();
        if (!this.f6984r0) {
            this.f6984r0 = true;
            o0 o0Var = (o0) generatedComponent();
            o0Var.getClass();
        }
    }

    @Override // g8.b, androidx.fragment.app.y
    public final void w(Context context) {
        super.w(context);
        Y();
        if (!this.f6984r0) {
            this.f6984r0 = true;
            o0 o0Var = (o0) generatedComponent();
            o0Var.getClass();
        }
    }

    @Override // androidx.fragment.app.y
    public final void x(Bundle bundle) {
        super.x(bundle);
        this.f6985s0 = (SearchViewModel) new a1(this).a(SearchViewModel.class);
        this.f6986t0 = (HomeViewModel) new a1(N()).a(HomeViewModel.class);
    }

    @Override // androidx.fragment.app.y
    public final void z() {
        this.T = true;
        this.f6988v0.shutdownNow();
    }
}
