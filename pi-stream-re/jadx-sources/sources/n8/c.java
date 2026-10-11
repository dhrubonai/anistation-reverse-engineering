package n8;

import android.widget.TextView;
import androidx.lifecycle.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Future;
import msr.pistream.app.ui.player.PlayerActivity;
import msr.pistream.app.viewmodel.PlayerViewModel;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8026a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f8027b;

    public /* synthetic */ c(PlayerActivity playerActivity, int i10) {
        this.f8026a = i10;
        this.f8027b = playerActivity;
    }

    @Override // androidx.lifecycle.d0
    public final void f(Object obj) {
        Object obj2;
        Object obj3;
        boolean z9;
        boolean z10;
        Object obj4;
        String str;
        int i10;
        j1.d0 d0Var;
        Object obj5;
        int i11 = -1;
        int i12 = 0;
        switch (this.f8026a) {
            case 0:
                z3.e eVar = this.f8027b.A;
                if (eVar != null) {
                    eVar.D();
                    return;
                }
                return;
            case 1:
                b8.a aVar = (b8.a) obj;
                int i13 = PlayerActivity.T0;
                PlayerActivity playerActivity = this.f8027b;
                playerActivity.getClass();
                if (aVar.b() && (obj3 = aVar.f1546b) != null && !playerActivity.isFinishing()) {
                    List list = (List) obj3;
                    playerActivity.K0 = false;
                    int size = list.size();
                    ArrayList arrayList = playerActivity.Q;
                    if (size <= arrayList.size()) {
                        playerActivity.C();
                        return;
                    }
                    a8.e eVar2 = playerActivity.S;
                    arrayList.clear();
                    arrayList.addAll(list);
                    playerActivity.f7750a0 = -1;
                    playerActivity.f7775y.f9936d.clear();
                    playerActivity.f7775y.f9936d.addAll(list);
                    int c6 = playerActivity.H.c(eVar2);
                    playerActivity.f7771v0 = c6;
                    if (c6 < 0 || c6 >= arrayList.size()) {
                        playerActivity.f7771v0 = 0;
                    }
                    a8.e eVar3 = (a8.e) arrayList.get(playerActivity.f7771v0);
                    playerActivity.S = eVar3;
                    s8.b bVar = playerActivity.f7775y;
                    bVar.f9939g = playerActivity.f7771v0;
                    bVar.o = eVar3;
                    playerActivity.f7772w0 = com.bumptech.glide.d.T(eVar3);
                    playerActivity.C();
                    playerActivity.A.J(playerActivity.f7771v0, arrayList.size());
                    return;
                }
                return;
            case 2:
                PlayerActivity playerActivity2 = this.f8027b;
                b8.a aVar2 = (b8.a) obj;
                int i14 = PlayerActivity.T0;
                if (!playerActivity2.isFinishing()) {
                    if (aVar2.f1545a == 1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        g8.c cVar = playerActivity2.V;
                        if (cVar != null) {
                            cVar.setVisibility(8);
                        }
                        if (aVar2.b() && (obj4 = aVar2.f1546b) != null) {
                            s8.b bVar2 = playerActivity2.f7775y;
                            List list2 = (List) obj4;
                            ArrayList arrayList2 = bVar2.f9935c;
                            boolean isEmpty = arrayList2.isEmpty();
                            int i15 = bVar2.f9940h;
                            if (i15 >= 0 && i15 < arrayList2.size()) {
                                str = ((a8.h) arrayList2.get(bVar2.f9940h)).f199b;
                            } else {
                                str = null;
                            }
                            arrayList2.clear();
                            arrayList2.addAll(list2);
                            bVar2.f9947p.clear();
                            bVar2.f9948q = false;
                            bVar2.f9941i = arrayList2.isEmpty();
                            bVar2.f9944l = false;
                            a aVar3 = bVar2.f9934b;
                            g8.c cVar2 = aVar3.f8024b.V;
                            if (cVar2 != null) {
                                cVar2.setVisibility(8);
                            }
                            if (bVar2.f9949r) {
                                if (str != null) {
                                    for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                                        if (str.equals(((a8.h) arrayList2.get(i16)).f199b)) {
                                            bVar2.f9940h = i16;
                                            aVar3.v();
                                            TextView textView = aVar3.f8024b.f7752c0;
                                            if (textView != null) {
                                                StringBuilder sb = new StringBuilder();
                                                PlayerActivity playerActivity3 = aVar3.f8024b;
                                                ArrayList arrayList3 = playerActivity3.R;
                                                int i17 = playerActivity3.f7774x0;
                                                ArrayList arrayList4 = new ArrayList();
                                                for (int i18 = 0; i18 < playerActivity3.R.size(); i18++) {
                                                    arrayList4.add(Integer.valueOf(i18));
                                                }
                                                sb.append(com.bumptech.glide.d.q(arrayList3, i17));
                                                sb.append(" • more servers loaded");
                                                textView.setText(sb.toString());
                                            }
                                        }
                                    }
                                }
                                aVar3.v();
                            } else {
                                if (!isEmpty && str != null) {
                                    for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                                        if (str.equals(((a8.h) arrayList2.get(i19)).f199b)) {
                                            bVar2.f9940h = i19;
                                            aVar3.v();
                                            TextView textView2 = aVar3.f8024b.f7752c0;
                                            if (textView2 != null) {
                                                StringBuilder sb2 = new StringBuilder();
                                                PlayerActivity playerActivity4 = aVar3.f8024b;
                                                ArrayList arrayList5 = playerActivity4.R;
                                                int i20 = playerActivity4.f7774x0;
                                                ArrayList arrayList6 = new ArrayList();
                                                for (int i21 = 0; i21 < playerActivity4.R.size(); i21++) {
                                                    arrayList6.add(Integer.valueOf(i21));
                                                }
                                                sb2.append(com.bumptech.glide.d.q(arrayList5, i20));
                                                sb2.append(" • more servers loaded");
                                                textView2.setText(sb2.toString());
                                            }
                                        }
                                    }
                                }
                                int f10 = bVar2.f();
                                if (f10 < 0) {
                                    f10 = 0;
                                }
                                bVar2.f9949r = true;
                                if (f10 < 0) {
                                    f10 = 0;
                                }
                                bVar2.i(f10, bVar2.f9945m, false);
                            }
                            playerActivity2.B();
                            long j4 = playerActivity2.E0;
                            if (j4 >= 0 && (d0Var = playerActivity2.T) != null) {
                                d0Var.j(5, j4);
                                playerActivity2.E0 = -1L;
                            }
                            playerActivity2.R.clear();
                            playerActivity2.R.addAll(playerActivity2.f7775y.f9935c);
                            playerActivity2.f7776y0 = playerActivity2.f7775y.f9941i;
                            w8.d.f11050f = playerActivity2.R.size();
                            TextView textView3 = playerActivity2.f7778z0;
                            if (textView3 != null) {
                                textView3.setVisibility(8);
                            }
                            playerActivity2.A.D();
                            playerActivity2.y();
                            ArrayList arrayList7 = playerActivity2.Q;
                            if (arrayList7 != null && !arrayList7.isEmpty() && playerActivity2.f7771v0 >= 0) {
                                PlayerViewModel playerViewModel = playerActivity2.f7773x;
                                ArrayList arrayList8 = playerActivity2.Q;
                                if (arrayList8 != null) {
                                    a8.e eVar4 = playerViewModel.f7835k;
                                    if (eVar4 != null) {
                                        String str2 = eVar4.f184b;
                                        if (str2 != null && !str2.isEmpty()) {
                                            for (int i22 = 0; i22 < arrayList8.size(); i22++) {
                                                if (str2.equals(((a8.e) arrayList8.get(i22)).f184b)) {
                                                    i11 = i22;
                                                    if (i11 < 0 && (i10 = i11 + 1) < arrayList8.size()) {
                                                        a8.e eVar5 = (a8.e) arrayList8.get(i10);
                                                        String str3 = eVar5.f184b;
                                                        if (str3 == null) {
                                                            str3 = String.valueOf(eVar5.f186d);
                                                        }
                                                        if (!playerViewModel.f7840q.containsKey(str3)) {
                                                            Future<?> submit = playerViewModel.f7829e.submit(new q0.o(playerViewModel, eVar5, str3, 17));
                                                            synchronized (playerViewModel.f7841r) {
                                                                playerViewModel.f7843t = submit;
                                                            }
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                    return;
                                                }
                                            }
                                        }
                                        while (true) {
                                            if (i12 < arrayList8.size()) {
                                                if (((a8.e) arrayList8.get(i12)).f186d == eVar4.f186d) {
                                                    i11 = i12;
                                                } else {
                                                    i12++;
                                                }
                                            }
                                        }
                                        if (i11 < 0) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                    return;
                                }
                                playerViewModel.getClass();
                                return;
                            }
                            return;
                        }
                        if (aVar2.f1545a == 3) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            playerActivity2.J0 = false;
                            playerActivity2.R.clear();
                            playerActivity2.f7775y.f9935c.clear();
                            playerActivity2.f7774x0 = -1;
                            s8.b bVar3 = playerActivity2.f7775y;
                            bVar3.f9940h = -1;
                            playerActivity2.f7776y0 = true;
                            bVar3.f9941i = true;
                            playerActivity2.A.D();
                            playerActivity2.y();
                            TextView textView4 = playerActivity2.f7778z0;
                            if (textView4 != null) {
                                String str4 = aVar2.f1547c;
                                if (str4 == null) {
                                    str4 = "No sources available. Try another server or check your connection.";
                                }
                                textView4.setText(str4);
                                playerActivity2.f7778z0.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                b8.a aVar4 = (b8.a) obj;
                int i23 = PlayerActivity.T0;
                PlayerActivity playerActivity5 = this.f8027b;
                playerActivity5.getClass();
                if (aVar4.b() && (obj5 = aVar4.f1546b) != null && !playerActivity5.isFinishing()) {
                    o1.d0 d0Var2 = playerActivity5.G;
                    ((List) d0Var2.f8140d).clear();
                    ((List) d0Var2.f8140d).addAll((List) obj5);
                    d0Var2.l();
                    j1.p f11 = ((a) d0Var2.f8138b).f();
                    if (f11 != null) {
                        ((j1.d0) f11).y();
                        d0Var2.k();
                        return;
                    }
                    return;
                }
                return;
            default:
                b8.a aVar5 = (b8.a) obj;
                int i24 = PlayerActivity.T0;
                PlayerActivity playerActivity6 = this.f8027b;
                if (!playerActivity6.isFinishing()) {
                    ArrayList arrayList9 = playerActivity6.D0;
                    arrayList9.clear();
                    if (aVar5.b() && (obj2 = aVar5.f1546b) != null) {
                        arrayList9.addAll((Collection) obj2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
