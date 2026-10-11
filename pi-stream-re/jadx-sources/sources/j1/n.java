package j1;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import msr.pistream.app.ui.home.screens.MainActivity;
import msr.pistream.app.viewmodel.SearchViewModel;
import r6.n1;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements q6.m, f1.l, h0.u, k8.f, i8.c, androidx.lifecycle.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5834b;

    public /* synthetic */ n(Object obj, int i10) {
        this.f5833a = i10;
        this.f5834b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    @Override // h0.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(android.view.View r6) {
        /*
            r5 = this;
            java.lang.Object r6 = r5.f5834b
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            r6.getClass()
            r0 = 1
            int r1 = r5.f5833a
            if (r1 == r0) goto L4d
            r2 = 2
            if (r1 != r2) goto L10
            goto L4d
        L10:
            java.lang.ref.WeakReference r3 = r6.o
            if (r3 == 0) goto L49
            java.lang.Object r3 = r3.get()
            if (r3 != 0) goto L1b
            goto L49
        L1b:
            java.lang.ref.WeakReference r3 = r6.o
            java.lang.Object r3 = r3.get()
            android.view.View r3 = (android.view.View) r3
            y.m r4 = new y.m
            r4.<init>(r6, r1, r2)
            android.view.ViewParent r6 = r3.getParent()
            if (r6 == 0) goto L3e
            boolean r6 = r6.isLayoutRequested()
            if (r6 == 0) goto L3e
            java.util.WeakHashMap r6 = g0.y0.f4277a
            boolean r6 = g0.k0.b(r3)
            if (r6 == 0) goto L3e
            r6 = r0
            goto L3f
        L3e:
            r6 = 0
        L3f:
            if (r6 == 0) goto L45
            r3.post(r4)
            goto L4c
        L45:
            r4.run()
            goto L4c
        L49:
            r6.r(r1)
        L4c:
            return r0
        L4d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r1 != r0) goto L5b
            java.lang.String r0 = "DRAGGING"
            goto L5d
        L5b:
            java.lang.String r0 = "SETTLING"
        L5d:
            java.lang.String r1 = " should not be set externally."
            java.lang.String r0 = a3.g.t(r2, r0, r1)
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.n.a(android.view.View):boolean");
    }

    @Override // k8.f
    public List b(int i10) {
        ArrayList d10 = r6.h0.d(((l8.z) this.f5834b).f7036b);
        int i11 = MainActivity.f7741b0;
        if (d10.isEmpty()) {
            return new ArrayList();
        }
        int max = Math.max(0, (Math.max(1, i10) - 1) * 16);
        if (max >= d10.size()) {
            return new ArrayList();
        }
        return new ArrayList(d10.subList(max, Math.min(d10.size(), max + 16)));
    }

    @Override // i8.c
    public void e(a8.b bVar) {
        l8.z zVar = ((l8.d0) this.f5834b).f6914s0;
        if (zVar != null) {
            zVar.d(bVar);
        }
    }

    @Override // androidx.lifecycle.d0
    public void f(Object obj) {
        Object obj2;
        int i10 = this.f5833a;
        Object obj3 = this.f5834b;
        switch (i10) {
            case 2:
                l8.h0 h0Var = (l8.h0) obj3;
                String str = (String) obj;
                int i11 = l8.h0.C0;
                if (h0Var.V() && h0Var.f6947x0 != null && str != null && !str.trim().isEmpty()) {
                    h0Var.d0(str);
                    return;
                }
                return;
            default:
                l8.n0 n0Var = (l8.n0) obj3;
                b8.a aVar = (b8.a) obj;
                int i12 = l8.n0.L0;
                n0Var.getClass();
                if (aVar.b() && (obj2 = aVar.f1546b) != null) {
                    String trim = n0Var.f6992z0.getText().toString().trim();
                    if (!trim.isEmpty()) {
                        List list = (List) obj2;
                        String str2 = "Try another keyword or use filters.";
                        int i13 = 1;
                        if (list.isEmpty()) {
                            if (n0Var.B0 <= 1) {
                                n0Var.f6991y0.removeAllViews();
                                String str3 = r6.h0.f9469a;
                                if (str3 != null && !str3.isEmpty()) {
                                    str2 = "Try another keyword or use filters.\n\ndbg: ".concat(str3);
                                }
                                n0Var.a0(str2);
                            }
                            n0Var.E0 = false;
                            View view = n0Var.A0;
                            if (view != null) {
                                view.setVisibility(4);
                            }
                            n0Var.F0 = false;
                            return;
                        }
                        if (n0Var.B0 <= 1) {
                            n0Var.D0 = new ArrayList(list);
                        } else {
                            n0Var.D0.addAll(list);
                        }
                        if (list.size() < 20) {
                            n0Var.E0 = false;
                        }
                        View view2 = n0Var.A0;
                        if (view2 != null) {
                            view2.setVisibility(4);
                        }
                        n0Var.F0 = false;
                        if (n0Var.B0 <= 1) {
                            n0Var.f6991y0.removeAllViews();
                            n0Var.f6991y0.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 1.0f));
                        }
                        if (n0Var.D0.isEmpty()) {
                            String str4 = r6.h0.f9469a;
                            if (str4 != null && !str4.isEmpty()) {
                                str2 = "Try another keyword or use filters.\n\ndbg: ".concat(str4);
                            }
                            n0Var.a0(str2);
                            return;
                        }
                        int U = ((n0Var.f4484m0.getResources().getDisplayMetrics().widthPixels - n0Var.U(40)) - n0Var.U(10)) / 2;
                        if (n0Var.B0 <= 1) {
                            RecyclerView recyclerView = new RecyclerView(n0Var.f4484m0, null);
                            n0Var.G0 = recyclerView;
                            recyclerView.setNestedScrollingEnabled(true);
                            n0Var.G0.setLayoutManager(new GridLayoutManager());
                            i8.d dVar = new i8.d(n0Var.f4484m0, new l8.m(n0Var, i13), false, false);
                            n0Var.H0 = dVar;
                            n0Var.G0.setAdapter(dVar);
                            n0Var.G0.setClipChildren(false);
                            n0Var.G0.setClipToPadding(false);
                            FrameLayout frameLayout = new FrameLayout(n0Var.f4484m0);
                            frameLayout.addView(n0Var.G0, new FrameLayout.LayoutParams(-1, -1));
                            View g10 = w8.i.g(n0Var.f4484m0);
                            n0Var.A0 = g10;
                            g10.setVisibility(4);
                            frameLayout.addView(n0Var.A0, new FrameLayout.LayoutParams(-1, n0Var.U(3), 80));
                            n0Var.f6991y0.addView(frameLayout, new LinearLayout.LayoutParams(-1, -1, 1.0f));
                            n0Var.G0.j(new m3.l(n0Var, i13));
                            SearchViewModel searchViewModel = n0Var.f6985s0;
                            a8.b bVar = (a8.b) n0Var.D0.get(0);
                            Context context = searchViewModel.f7851b.f3596a;
                            if (com.bumptech.glide.c.b0(context).getBoolean("search_history_enabled", true) && !trim.trim().isEmpty() && bVar != null) {
                                String trim2 = trim.trim();
                                ArrayList e10 = r6.h0.e(context);
                                int size = e10.size();
                                while (true) {
                                    size--;
                                    if (size >= 0) {
                                        if (((w7.d) e10.get(size)).f11043a.equalsIgnoreCase(trim2)) {
                                            e10.remove(size);
                                        }
                                    } else {
                                        w7.d dVar2 = new w7.d();
                                        dVar2.f11043a = trim2;
                                        dVar2.f11044b = bVar;
                                        e10.add(0, dVar2);
                                        int i14 = com.bumptech.glide.c.b0(context).getInt("search_history_limit", 10);
                                        while (e10.size() > i14) {
                                            e10.remove(e10.size() - 1);
                                        }
                                        r6.h0.C0(context, e10);
                                    }
                                }
                            }
                        }
                        n0Var.H0.e(new ArrayList(n0Var.D0));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // q6.m
    public Object get() {
        z1.g gVar;
        switch (this.f5833a) {
            case 0:
                return new DefaultRenderersFactory((Context) this.f5834b);
            case 1:
                return new v1.j((Context) this.f5834b, new d2.n());
            case 2:
                return new y1.p((Context) this.f5834b);
            case 3:
                Context context = (Context) this.f5834b;
                n1 n1Var = z1.g.f11905n;
                synchronized (z1.g.class) {
                    if (z1.g.f11910t == null) {
                        z1.f fVar = new z1.f(context);
                        z1.g.f11910t = new z1.g(fVar.f11900a, fVar.f11901b, fVar.f11902c, fVar.f11903d, fVar.f11904e);
                    }
                    gVar = z1.g.f11910t;
                }
                return gVar;
            default:
                return Boolean.valueOf(((j0) this.f5834b).P);
        }
    }

    @Override // f1.l
    public void invoke(Object obj) {
        ((c1.x0) obj).K((c1.k0) this.f5834b, this.f5833a);
    }
}
