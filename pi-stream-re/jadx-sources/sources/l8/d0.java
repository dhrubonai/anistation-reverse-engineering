package l8;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.y0;
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
import java.util.Iterator;
import msr.pistream.app.R;
import msr.pistream.app.ui.home.screens.MainActivity;

@AndroidEntryPoint
/* loaded from: classes.dex */
public class d0 extends g8.b implements GeneratedComponentManagerHolder {

    /* renamed from: v0, reason: collision with root package name */
    public static final /* synthetic */ int f6908v0 = 0;

    /* renamed from: n0, reason: collision with root package name */
    public ContextWrapper f6909n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f6910o0;

    /* renamed from: p0, reason: collision with root package name */
    public volatile FragmentComponentManager f6911p0;

    /* renamed from: s0, reason: collision with root package name */
    public z f6914s0;

    /* renamed from: t0, reason: collision with root package name */
    public LinearLayout f6915t0;

    /* renamed from: q0, reason: collision with root package name */
    public final Object f6912q0 = new Object();

    /* renamed from: r0, reason: collision with root package name */
    public boolean f6913r0 = false;

    /* renamed from: u0, reason: collision with root package name */
    public String f6916u0 = "";

    @Override // androidx.fragment.app.y
    public final LayoutInflater C(Bundle bundle) {
        LayoutInflater C = super.C(bundle);
        return C.cloneInContext(FragmentComponentManager.createContextWrapper(C, this));
    }

    @Override // g8.b
    public final View W() {
        boolean z9;
        MainActivity mainActivity;
        FrameLayout frameLayout;
        LinearLayout linearLayout = new LinearLayout(this.f4484m0);
        int i10 = 1;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(this.f4484m0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(U(24), U(54), U(24), 0);
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
            linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, U(112)));
        }
        ImageView imageView = new ImageView(this.f4484m0);
        imageView.setImageResource(R.drawable.ic_app_header_mark);
        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(U(52), U(52)));
        TextView l10 = w8.i.l(this.f4484m0, "My List", 26, -1, 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(U(14), 0, 0, 0);
        linearLayout2.addView(l10, layoutParams);
        ImageView imageView2 = new ImageView(this.f4484m0);
        imageView2.setImageResource(R.drawable.ic_search);
        imageView2.setColorFilter(-1);
        imageView2.setPadding(U(8), U(8), U(8), U(8));
        imageView2.setOnClickListener(new r(this, i10));
        linearLayout2.addView(imageView2, new LinearLayout.LayoutParams(U(48), U(48)));
        LinearLayout linearLayout3 = new LinearLayout(this.f4484m0);
        linearLayout3.setOrientation(1);
        linearLayout3.setClipChildren(false);
        linearLayout3.setClipToPadding(false);
        a3.g.w(-1, -2, linearLayout, linearLayout3);
        this.f6915t0 = linearLayout3;
        linearLayout3.setClipChildren(false);
        this.f6915t0.setClipToPadding(false);
        X();
        return linearLayout;
    }

    public final void X() {
        int i10;
        ArrayList arrayList;
        a0 a0Var;
        int i11;
        int i12;
        LinearLayout linearLayout = this.f6915t0;
        if (linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this.f4484m0);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        horizontalScrollView.setClipToPadding(false);
        this.f6915t0.addView(horizontalScrollView, new LinearLayout.LayoutParams(-1, U(52)));
        LinearLayout linearLayout2 = new LinearLayout(this.f4484m0);
        int i13 = 16;
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(U(16), U(10), U(16), 0);
        horizontalScrollView.addView(linearLayout2, new LinearLayout.LayoutParams(-2, -1));
        String[] strArr = {"", "watching", "completed", "plan_to_watch", "on_hold", "dropped"};
        String[] strArr2 = {"All", "Watching", "Completed", "Plan", "Hold", "Dropped"};
        int i14 = 0;
        while (true) {
            i10 = 1;
            if (i14 >= 6) {
                break;
            }
            boolean equals = this.f6916u0.equals(strArr[i14]);
            LinearLayout linearLayout3 = new LinearLayout(this.f4484m0);
            linearLayout3.setOrientation(0);
            linearLayout3.setGravity(i13);
            linearLayout3.setPadding(U(14), U(8), U(14), U(8));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(U(100));
            if (equals) {
                i11 = w8.i.f11070j;
            } else {
                i11 = w8.i.f11064d;
            }
            gradientDrawable.setColor(i11);
            if (equals) {
                gradientDrawable.setStroke(U(1), w8.i.f11065e);
            }
            linearLayout3.setBackground(gradientDrawable);
            Context context = this.f4484m0;
            String str = strArr2[i14];
            if (equals) {
                i12 = -1;
            } else {
                i12 = w8.i.f11067g;
            }
            TextView l10 = w8.i.l(context, str, 13, i12, 1);
            linearLayout3.addView(l10, r.f.c(l10, 17, -2, -2));
            linearLayout3.setOnClickListener(new h8.v(this, strArr, i14));
            linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(-2, -2));
            if (i14 < 5) {
                View view = new View(this.f4484m0);
                view.setLayoutParams(new LinearLayout.LayoutParams(U(8), 0));
                linearLayout2.addView(view);
            }
            i14++;
            i13 = 16;
        }
        RecyclerView recyclerView = new RecyclerView(this.f4484m0, null);
        recyclerView.setNestedScrollingEnabled(true);
        recyclerView.setHasFixedSize(true);
        recyclerView.setPadding(U(16), U(20), U(16), U(40));
        recyclerView.setClipToPadding(false);
        recyclerView.setClipChildren(false);
        recyclerView.setLayoutManager(new GridLayoutManager());
        i8.d dVar = new i8.d(this.f4484m0, new j1.n(this, i10), false, false);
        recyclerView.setAdapter(dVar);
        this.f6915t0.addView(recyclerView, new LinearLayout.LayoutParams(-1, 0));
        View view2 = new View(this.f4484m0);
        view2.setTag("spacerBottom");
        this.f6915t0.addView(view2, new LinearLayout.LayoutParams(-1, U(28)));
        Context context2 = this.f4484m0;
        synchronized (w7.c.f11040a) {
            w7.c.d(context2);
            ArrayList arrayList2 = w7.c.f11041b;
            arrayList = new ArrayList(arrayList2.size());
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(w7.c.c((a8.b) it.next()));
            }
        }
        if (!this.f6916u0.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a8.b bVar = (a8.b) it2.next();
                if (this.f6916u0.equals(bVar.N)) {
                    arrayList3.add(bVar);
                }
            }
            arrayList = arrayList3;
        }
        dVar.e(arrayList);
        int size = arrayList.size();
        if (size == 0) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new LinearLayout.LayoutParams(-1, 0);
            } else {
                layoutParams.height = 0;
            }
            recyclerView.setLayoutParams(layoutParams);
            recyclerView.setVisibility(8);
            LinearLayout linearLayout4 = this.f6915t0;
            if (linearLayout4 != null) {
                linearLayout4.requestLayout();
            }
        } else {
            recyclerView.setVisibility(0);
            int min = Math.min(U((Math.max(1, (size + 1) / 2) * 268) + 60), Math.max(U(360), this.f4484m0.getResources().getDisplayMetrics().heightPixels - U(260)));
            ViewGroup.LayoutParams layoutParams2 = recyclerView.getLayoutParams();
            if (layoutParams2 == null) {
                layoutParams2 = new LinearLayout.LayoutParams(-1, min);
            } else {
                layoutParams2.height = min;
            }
            recyclerView.setLayoutParams(layoutParams2);
            LinearLayout linearLayout5 = this.f6915t0;
            if (linearLayout5 != null) {
                linearLayout5.requestLayout();
            }
            if ((d() instanceof MainActivity) && (a0Var = ((MainActivity) d()).I) != null) {
                a0Var.requestLayout();
            }
        }
        if (arrayList.isEmpty()) {
            Z();
            LinearLayout linearLayout6 = new LinearLayout(this.f4484m0);
            linearLayout6.setTag("empty");
            linearLayout6.setOrientation(1);
            linearLayout6.setGravity(1);
            linearLayout6.setPadding(U(24), U(72), U(24), U(72));
            linearLayout6.setBackground(w8.i.j(w8.i.f11063c, U(18)));
            ImageView imageView = new ImageView(this.f4484m0);
            imageView.setImageResource(R.drawable.ic_empty_my_list);
            imageView.clearColorFilter();
            linearLayout6.addView(imageView, new LinearLayout.LayoutParams(U(128), U(128)));
            TextView l11 = w8.i.l(this.f4484m0, "Your List is Empty", 22, -1, 1);
            LinearLayout.LayoutParams c6 = r.f.c(l11, 17, -1, -2);
            c6.setMargins(0, U(24), 0, 0);
            linearLayout6.addView(l11, c6);
            TextView l12 = w8.i.l(this.f4484m0, "It seems that you haven't added anything yet.", 15, w8.i.f11068h, 1);
            LinearLayout.LayoutParams c10 = r.f.c(l12, 17, -1, -2);
            c10.setMargins(0, U(12), 0, 0);
            linearLayout6.addView(l12, c10);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.setMargins(U(24), U(24), U(24), U(24));
            this.f6915t0.addView(linearLayout6, layoutParams3);
            LinearLayout linearLayout7 = this.f6915t0;
            if (linearLayout7 != null) {
                linearLayout7.requestLayout();
                return;
            }
            return;
        }
        Z();
    }

    public final void Y() {
        if (this.f6909n0 == null) {
            this.f6909n0 = FragmentComponentManager.createContextWrapper(super.k(), this);
            this.f6910o0 = FragmentGetContextFix.isFragmentGetContextFixDisabled(super.k());
        }
    }

    public final void Z() {
        LinearLayout linearLayout = this.f6915t0;
        if (linearLayout == null) {
            return;
        }
        for (int childCount = linearLayout.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f6915t0.getChildAt(childCount);
            if (childAt.getTag() != null && "empty".equals(childAt.getTag())) {
                this.f6915t0.removeViewAt(childCount);
            }
        }
    }

    @Override // dagger.hilt.internal.GeneratedComponentManagerHolder
    public final GeneratedComponentManager componentManager() {
        if (this.f6911p0 == null) {
            synchronized (this.f6912q0) {
                if (this.f6911p0 == null) {
                    this.f6911p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f6911p0;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object generatedComponent() {
        if (this.f6911p0 == null) {
            synchronized (this.f6912q0) {
                if (this.f6911p0 == null) {
                    this.f6911p0 = new FragmentComponentManager(this);
                }
            }
        }
        return this.f6911p0.generatedComponent();
    }

    @Override // androidx.fragment.app.y, androidx.lifecycle.j
    public final y0 getDefaultViewModelProviderFactory() {
        return DefaultViewModelFactories.getFragmentFactory(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.y
    public final Context k() {
        if (super.k() == null && !this.f6910o0) {
            return null;
        }
        Y();
        return this.f6909n0;
    }

    @Override // androidx.fragment.app.y
    public final void v(Activity activity) {
        boolean z9;
        this.T = true;
        ContextWrapper contextWrapper = this.f6909n0;
        if (contextWrapper != null && FragmentComponentManager.findActivity(contextWrapper) != activity) {
            z9 = false;
        } else {
            z9 = true;
        }
        Preconditions.checkState(z9, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        Y();
        if (!this.f6913r0) {
            this.f6913r0 = true;
            e0 e0Var = (e0) generatedComponent();
            e0Var.getClass();
        }
    }

    @Override // g8.b, androidx.fragment.app.y
    public final void w(Context context) {
        super.w(context);
        Y();
        if (!this.f6913r0) {
            this.f6913r0 = true;
            e0 e0Var = (e0) generatedComponent();
            e0Var.getClass();
        }
    }
}
