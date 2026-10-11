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
import android.widget.ScrollView;
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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import msr.pistream.app.R;
import msr.pistream.app.ui.home.screens.MainActivity;
import msr.pistream.app.viewmodel.ScheduleViewModel;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class h0 extends g8.b implements GeneratedComponentManagerHolder {
    public static final /* synthetic */ int C0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public ContextWrapper f6937n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f6938o0;

    /* renamed from: p0, reason: collision with root package name */
    public volatile FragmentComponentManager f6939p0;

    /* renamed from: s0, reason: collision with root package name */
    public ScheduleViewModel f6942s0;

    /* renamed from: t0, reason: collision with root package name */
    public z f6943t0;

    /* renamed from: w0, reason: collision with root package name */
    public LinearLayout f6946w0;

    /* renamed from: x0, reason: collision with root package name */
    public LinearLayout f6947x0;

    /* renamed from: y0, reason: collision with root package name */
    public RecyclerView f6948y0;

    /* renamed from: z0, reason: collision with root package name */
    public TextView f6949z0;

    /* renamed from: q0, reason: collision with root package name */
    public final Object f6940q0 = new Object();

    /* renamed from: r0, reason: collision with root package name */
    public boolean f6941r0 = false;

    /* renamed from: u0, reason: collision with root package name */
    public final ExecutorService f6944u0 = Executors.newFixedThreadPool(2);

    /* renamed from: v0, reason: collision with root package name */
    public final Handler f6945v0 = new Handler(Looper.getMainLooper());
    public final Handler A0 = new Handler();
    public final a B0 = new a(this, 2);

    @Override // androidx.fragment.app.y
    public final void A() {
        this.T = true;
        this.A0.removeCallbacks(this.B0);
    }

    @Override // androidx.fragment.app.y
    public final LayoutInflater C(Bundle bundle) {
        LayoutInflater C = super.C(bundle);
        return C.cloneInContext(FragmentComponentManager.createContextWrapper(C, this));
    }

    @Override // androidx.fragment.app.y
    public final void I() {
        this.f6942s0.f7849f.e(n(), new j1.n(this, 2));
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
            this.f6946w0 = linearLayout2;
            linearLayout2.setOrientation(1);
            linearLayout.addView(this.f6946w0, new ViewGroup.LayoutParams(-1, -2));
            Y();
            return linearLayout;
        }
        ScrollView scrollView = new ScrollView(this.f4484m0);
        scrollView.setVerticalScrollBarEnabled(false);
        scrollView.setFillViewport(true);
        LinearLayout linearLayout3 = new LinearLayout(this.f4484m0);
        this.f6946w0 = linearLayout3;
        linearLayout3.setOrientation(1);
        scrollView.addView(this.f6946w0, new ViewGroup.LayoutParams(-1, -2));
        Y();
        this.A0.post(this.B0);
        return scrollView;
    }

    public final void X(int i10, String str) {
        if (this.f6947x0 == null) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(this.f4484m0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(0, 0, 0, U(14));
        this.f6947x0.addView(linearLayout, new LinearLayout.LayoutParams(-1, U(36)));
        this.f6942s0.getClass();
        try {
            Locale locale = Locale.US;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", locale);
            simpleDateFormat.setTimeZone(ScheduleViewModel.j());
            Date parse = simpleDateFormat.parse(str);
            if (parse != null) {
                Calendar calendar = Calendar.getInstance(ScheduleViewModel.j(), locale);
                calendar.setTime(parse);
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM d", locale);
                simpleDateFormat2.setTimeZone(ScheduleViewModel.j());
                str = ScheduleViewModel.h(calendar) + "  " + simpleDateFormat2.format(parse);
            }
        } catch (Exception unused) {
        }
        a3.g.v(0, -2, 1.0f, linearLayout, w8.i.l(this.f4484m0, str, 18, -1, 1));
        if (i10 > 0) {
            r.f.i(-2, -2, linearLayout, w8.i.l(this.f4484m0, i10 + " episodes", 13, w8.i.f11068h, 0));
        }
    }

    public final void Y() {
        boolean z9;
        boolean z10;
        boolean z11;
        List list;
        MainActivity mainActivity;
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f6946w0;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        String str = (String) this.f6942s0.f7845b.d();
        if (str == null) {
            ScheduleViewModel scheduleViewModel = this.f6942s0;
            Calendar calendar = Calendar.getInstance();
            scheduleViewModel.getClass();
            str = ScheduleViewModel.f(calendar);
            this.f6942s0.f7845b.j(str);
        }
        LinearLayout linearLayout2 = new LinearLayout(this.f4484m0);
        linearLayout2.setGravity(16);
        final int i10 = 0;
        linearLayout2.setPadding(U(24), U(54), U(24), 0);
        final int i11 = 1;
        if ((d() instanceof MainActivity) && (frameLayout = (mainActivity = (MainActivity) d()).J) != null) {
            linearLayout2.setBackgroundColor(w8.i.f11061a);
            frameLayout.removeAllViews();
            frameLayout.addView(linearLayout2, new FrameLayout.LayoutParams(-1, U(112)));
            mainActivity.N();
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            this.f6946w0.addView(linearLayout2, new LinearLayout.LayoutParams(-1, U(112)));
        }
        ImageView imageView = new ImageView(this.f4484m0);
        imageView.setImageResource(R.drawable.ic_app_header_mark);
        imageView.setPadding(0, 0, 0, 0);
        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(U(52), U(52)));
        TextView l10 = w8.i.l(this.f4484m0, "Schedule", 26, -1, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(U(14), 0, 0, 0);
        linearLayout2.addView(l10, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, U(38));
        layoutParams2.setMargins(U(12), 0, 0, 0);
        Boolean bool = (Boolean) this.f6942s0.f7846c.d();
        if (bool != null && bool.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        LinearLayout linearLayout3 = new LinearLayout(this.f4484m0);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        linearLayout3.setPadding(U(3), U(3), U(3), U(3));
        int i12 = w8.i.f11064d;
        linearLayout3.setBackground(w8.i.j(i12, U(19)));
        TextView b02 = b0("12H", !z10);
        b02.setOnClickListener(new View.OnClickListener(this) { // from class: l8.f0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f6922b;

            {
                this.f6922b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i10;
                h0 h0Var = this.f6922b;
                switch (i13) {
                    case 0:
                        int i14 = h0.C0;
                        h0Var.c0(false);
                        return;
                    default:
                        int i15 = h0.C0;
                        h0Var.c0(true);
                        return;
                }
            }
        });
        linearLayout3.addView(b02, new LinearLayout.LayoutParams(-2, -1));
        TextView b03 = b0("24H", z10);
        b03.setOnClickListener(new View.OnClickListener(this) { // from class: l8.f0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h0 f6922b;

            {
                this.f6922b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13 = i11;
                h0 h0Var = this.f6922b;
                switch (i13) {
                    case 0:
                        int i14 = h0.C0;
                        h0Var.c0(false);
                        return;
                    default:
                        int i15 = h0.C0;
                        h0Var.c0(true);
                        return;
                }
            }
        });
        linearLayout3.addView(b03, new LinearLayout.LayoutParams(-2, -1));
        linearLayout2.addView(linearLayout3, layoutParams2);
        LinearLayout linearLayout4 = new LinearLayout(this.f4484m0);
        linearLayout4.setGravity(16);
        linearLayout4.setPadding(U(18), U(14), U(18), U(14));
        linearLayout4.setBackground(w8.i.j(i12, U(14)));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(U(22), U(16), U(22), 0);
        this.f6946w0.addView(linearLayout4, layoutParams3);
        ImageView imageView2 = new ImageView(this.f4484m0);
        imageView2.setImageResource(R.drawable.ic_calendar);
        imageView2.setColorFilter(w8.i.f11065e);
        linearLayout4.addView(imageView2, new LinearLayout.LayoutParams(U(22), U(22)));
        LinearLayout linearLayout5 = new LinearLayout(this.f4484m0);
        linearLayout5.setOrientation(1);
        linearLayout5.setGravity(16);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams4.setMargins(U(14), 0, 0, 0);
        linearLayout4.addView(linearLayout5, layoutParams4);
        Boolean bool2 = (Boolean) this.f6942s0.f7846c.d();
        if (bool2 != null && bool2.booleanValue()) {
            z11 = true;
        } else {
            z11 = false;
        }
        Context context = this.f4484m0;
        this.f6942s0.getClass();
        TextView l11 = w8.i.l(context, ScheduleViewModel.i(z11), 16, -1, 1);
        this.f6949z0 = l11;
        r.f.i(-1, -2, linearLayout5, l11);
        Context context2 = this.f4484m0;
        this.f6942s0.getClass();
        TextView l12 = w8.i.l(context2, ScheduleViewModel.k(), 13, w8.i.f11068h, 0);
        l12.setTag("zone");
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(0, U(2), 0, 0);
        linearLayout5.addView(l12, layoutParams5);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        List list2 = null;
        RecyclerView recyclerView = new RecyclerView(this.f4484m0, null);
        this.f6948y0 = recyclerView;
        recyclerView.setLayoutManager(linearLayoutManager);
        this.f6948y0.setPadding(U(16), U(8), U(16), U(8));
        this.f6948y0.setClipToPadding(false);
        this.f6948y0.setSaveEnabled(false);
        this.f6948y0.setNestedScrollingEnabled(false);
        ArrayList arrayList = new ArrayList();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(5, -2);
        for (int i13 = 0; i13 < 14; i13++) {
            arrayList.add((Calendar) calendar2.clone());
            calendar2.add(5, 1);
        }
        this.f6948y0.setAdapter(new h8.c(this, arrayList));
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, U(114));
        layoutParams6.setMargins(0, U(4), 0, 0);
        this.f6946w0.addView(this.f6948y0, layoutParams6);
        LinearLayout linearLayout6 = new LinearLayout(this.f4484m0);
        this.f6947x0 = linearLayout6;
        linearLayout6.setOrientation(1);
        this.f6947x0.setPadding(U(22), U(30), U(22), U(40));
        a3.g.w(-1, -2, this.f6946w0, this.f6947x0);
        LinearLayout linearLayout7 = this.f6947x0;
        if (linearLayout7 != null) {
            linearLayout7.removeAllViews();
            this.f6942s0.f7849f.j(null);
            ScheduleViewModel scheduleViewModel2 = this.f6942s0;
            scheduleViewModel2.getClass();
            String c6 = ScheduleViewModel.c(str);
            if (c6 != null && (list = (List) scheduleViewModel2.f7847d.get(c6)) != null) {
                list2 = ScheduleViewModel.b(str, list);
            }
            if (list2 != null) {
                a0(str, list2);
                return;
            }
            Context context3 = this.f4484m0;
            LinearLayout l02 = r6.h0.l0(context3, 5, w8.i.e(context3, 112), w8.i.e(context3, 12));
            this.f6947x0.addView(l02, new LinearLayout.LayoutParams(-1, -2));
            this.f6944u0.execute(new q0.o(this, str, l02, 10));
        }
    }

    public final void Z() {
        if (this.f6937n0 == null) {
            this.f6937n0 = FragmentComponentManager.createContextWrapper(super.k(), this);
            this.f6938o0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.k());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        switch(r8) {
            case 0: goto L49;
            case 1: goto L48;
            case 2: goto L47;
            default: goto L46;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bc, code lost:
    
        r8 = "Night";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
    
        r9 = new android.widget.LinearLayout(r13.f4484m0);
        r9.setGravity(16);
        r7 = w8.i.l(r13.f4484m0, r8, 13, w8.i.f11068h, 1);
        r7.setLetterSpacing(0.08f);
        r9.addView(r7, new android.widget.LinearLayout.LayoutParams(-2, -2));
        r7 = new android.view.View(r13.f4484m0);
        r7.setBackgroundColor(w8.i.f11064d);
        r11 = 0;
        r8 = new android.widget.LinearLayout.LayoutParams(0, U(1), 1.0f);
        r8.setMargins(U(12), 0, 0, 0);
        r9.addView(r7, r8);
        r3.addView(r9, r0);
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00bf, code lost:
    
        r8 = "Morning";
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00c2, code lost:
    
        r8 = "Afternoon";
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x00c5, code lost:
    
        r8 = "Evening";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(java.lang.String r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l8.h0.a0(java.lang.String, java.util.List):void");
    }

    public final TextView b0(String str, boolean z9) {
        int i10;
        Context context = this.f4484m0;
        if (z9) {
            i10 = -1;
        } else {
            i10 = w8.i.f11068h;
        }
        TextView l10 = w8.i.l(context, str, 12, i10, 1);
        l10.setGravity(17);
        l10.setPadding(U(14), 0, U(14), 0);
        if (z9) {
            l10.setBackground(w8.i.j(w8.i.f11065e, U(16)));
        }
        return l10;
    }

    public final void c0(boolean z9) {
        Boolean bool = (Boolean) this.f6942s0.f7846c.d();
        if (bool != null && bool.booleanValue() == z9) {
            return;
        }
        this.f6942s0.f7846c.j(Boolean.valueOf(z9));
        z zVar = this.f6943t0;
        if (zVar != null) {
            zVar.f7036b.getSharedPreferences("pistream_ui", 0).edit().putBoolean("schedule_24h", z9).apply();
        }
        Y();
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final GeneratedComponentManager componentManager() {
        if (this.f6939p0 == null) {
            synchronized (this.f6940q0) {
                if (this.f6939p0 == null) {
                    this.f6939p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f6939p0;
    }

    public final void d0(String str) {
        LinearLayout linearLayout = this.f6947x0;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        TextView l10 = w8.i.l(this.f4484m0, "Schedule", 24, -1, 1);
        LinearLayout.LayoutParams c6 = r.f.c(l10, 17, -1, -2);
        c6.setMargins(0, U(48), 0, U(8));
        this.f6947x0.addView(l10, c6);
        TextView l11 = w8.i.l(this.f4484m0, str, 16, w8.i.f11065e, 0);
        l11.setGravity(17);
        l11.setPadding(0, U(20), 0, U(20));
        r.f.i(-1, -2, this.f6947x0, l11);
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        if (this.f6939p0 == null) {
            synchronized (this.f6940q0) {
                if (this.f6939p0 == null) {
                    this.f6939p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f6939p0.generatedComponent();
    }

    @Override // androidx.fragment.app.y, androidx.lifecycle.j
    public final y0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.y
    public final Context k() {
        if (super.k() == null && !this.f6938o0) {
            return null;
        }
        Z();
        return this.f6937n0;
    }

    @Override // androidx.fragment.app.y
    public final void v(Activity activity) {
        boolean z9;
        this.T = true;
        ContextWrapper contextWrapper = this.f6937n0;
        if (contextWrapper != null && FragmentComponentManager.findActivity(contextWrapper) != activity) {
            z9 = false;
        } else {
            z9 = true;
        }
        Preconditions.checkState(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Z();
        if (!this.f6941r0) {
            this.f6941r0 = true;
            i0 i0Var = (i0) generatedComponent();
            i0Var.getClass();
        }
    }

    @Override // g8.b, androidx.fragment.app.y
    public final void w(Context context) {
        super.w(context);
        Z();
        if (!this.f6941r0) {
            this.f6941r0 = true;
            i0 i0Var = (i0) generatedComponent();
            i0Var.getClass();
        }
    }

    @Override // androidx.fragment.app.y
    public final void x(Bundle bundle) {
        super.x(bundle);
        ScheduleViewModel scheduleViewModel = (ScheduleViewModel) new a1(N()).a(ScheduleViewModel.class);
        this.f6942s0 = scheduleViewModel;
        Bundle bundle2 = this.f1039f;
        if (bundle2 != null) {
            scheduleViewModel.f7846c.j(Boolean.valueOf(bundle2.getBoolean("is24h", false)));
        }
    }

    @Override // androidx.fragment.app.y
    public final void z() {
        this.T = true;
        this.f6944u0.shutdownNow();
    }
}
