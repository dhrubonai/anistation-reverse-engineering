package x8;

import android.util.Log;
import androidx.lifecycle.c0;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import msr.pistream.app.viewmodel.HomeViewModel;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f11399b;

    public /* synthetic */ d(HomeViewModel homeViewModel, int i10) {
        this.f11398a = i10;
        this.f11399b = homeViewModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map emptyMap;
        List emptyList;
        int i10 = this.f11398a;
        HomeViewModel homeViewModel = this.f11399b;
        switch (i10) {
            case 0:
                c0 c0Var = homeViewModel.f7822r;
                try {
                    e8.a aVar = homeViewModel.f7810e;
                    aVar.getClass();
                    try {
                        emptyList = aVar.f3594a.h();
                    } catch (Exception e10) {
                        Log.e("AnimeRepository", "homeRails failed", e10);
                        emptyList = Collections.emptyList();
                    }
                    if (emptyList != null && !emptyList.isEmpty()) {
                        homeViewModel.f7823s = emptyList;
                        c0Var.h(b8.a.d(emptyList));
                        return;
                    }
                    if (homeViewModel.f7823s.isEmpty()) {
                        c0Var.h(b8.a.a("Failed to load home"));
                        return;
                    }
                    return;
                } catch (Exception e11) {
                    Log.e("HomeVM", "homeRails", e11);
                    if (homeViewModel.f7823s.isEmpty()) {
                        c0Var.h(b8.a.a("Failed to load home"));
                        return;
                    }
                    return;
                }
            default:
                homeViewModel.getClass();
                try {
                    e8.a aVar2 = homeViewModel.f7810e;
                    aVar2.getClass();
                    try {
                        emptyMap = aVar2.f3594a.d();
                    } catch (Exception e12) {
                        Log.e("AnimeRepository", "homeBatch failed", e12);
                        emptyMap = Collections.emptyMap();
                    }
                    String[] strArr = {"trending", "popular", "season", "upcoming", "fanFavorites", "movies", "topTv", "ona", "ova", "special", "music", "latest"};
                    for (int i11 = 0; i11 < 12; i11++) {
                        String str = strArr[i11];
                        List list = (List) emptyMap.get(str);
                        if (list != null && !list.isEmpty()) {
                            if ("trending".equals(str)) {
                                homeViewModel.f7824t = list;
                            }
                            c0 b10 = homeViewModel.b(str);
                            if (b10 instanceof c0) {
                                b10.h(b8.a.d(list));
                            }
                        } else {
                            c0 b11 = homeViewModel.b(str);
                            if (b11 instanceof c0) {
                                b11.h(b8.a.a("No data for " + str));
                            }
                        }
                    }
                    return;
                } catch (Exception e13) {
                    Log.e("HomeVM", "homeBatch", e13);
                    homeViewModel.f7811f.h(b8.a.a("Failed to load home"));
                    homeViewModel.f7812g.h(b8.a.a("Failed to load home"));
                    homeViewModel.f7813h.h(b8.a.a("Failed to load home"));
                    homeViewModel.f7814i.h(b8.a.a("Failed to load home"));
                    homeViewModel.f7815j.h(b8.a.a("Failed to load home"));
                    homeViewModel.f7816k.h(b8.a.a("Failed to load home"));
                    homeViewModel.f7817l.h(b8.a.a("Failed to load home"));
                    homeViewModel.f7818m.h(b8.a.a("Failed to load home"));
                    homeViewModel.f7819n.h(b8.a.a("Failed to load home"));
                    homeViewModel.o.h(b8.a.a("Failed to load home"));
                    homeViewModel.f7820p.h(b8.a.a("Failed to load home"));
                    homeViewModel.f7821q.h(b8.a.a("Failed to load home"));
                    return;
                }
        }
    }
}
