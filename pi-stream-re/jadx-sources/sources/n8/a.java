package n8;

import android.content.Context;
import android.util.Log;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import j1.d0;
import j3.i0;
import java.util.ArrayList;
import java.util.List;
import msr.pistream.app.ui.player.PlayerActivity;
import msr.pistream.app.viewmodel.PlayerViewModel;
import r6.h0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8023a;

    /* renamed from: b, reason: collision with root package name */
    public final PlayerActivity f8024b;

    public /* synthetic */ a(PlayerActivity playerActivity, int i10) {
        this.f8023a = i10;
        this.f8024b = playerActivity;
    }

    public final void A(PopupWindow popupWindow, LinearLayout linearLayout) {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 9:
                playerActivity.K.q(popupWindow, linearLayout);
                return;
            case 10:
                playerActivity.K.q(popupWindow, linearLayout);
                return;
            default:
                playerActivity.K.q(popupWindow, linearLayout);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0086, code lost:
    
        if (r13 == Integer.MAX_VALUE) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(android.view.View r20) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n8.a.B(android.view.View):void");
    }

    public final void C(String str) {
        this.f8024b.A(str, true);
    }

    public final void D() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 0:
                ImageView imageView = playerActivity.f7768s0;
                if (imageView != null && n()) {
                    d dVar = playerActivity.Q0;
                    t(dVar);
                    imageView.animate().cancel();
                    imageView.setScaleX(1.0f);
                    imageView.setScaleY(1.0f);
                    imageView.setAlpha(1.0f);
                    imageView.setVisibility(0);
                    r(dVar, 2000L);
                    return;
                }
                return;
            default:
                ((a) playerActivity.A.f12044b).D();
                return;
        }
    }

    public final LinearLayout E(PopupWindow popupWindow, int i10) {
        int i11 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i11) {
            case 9:
                return playerActivity.K.r(popupWindow, i10);
            case 10:
                return playerActivity.K.r(popupWindow, i10);
            default:
                return playerActivity.K.r(popupWindow, i10);
        }
    }

    public final ArrayList F() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 0:
                return playerActivity.f7775y.h();
            case 5:
                playerActivity.getClass();
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < playerActivity.R.size(); i11++) {
                    arrayList.add(Integer.valueOf(i11));
                }
                return arrayList;
            default:
                return playerActivity.f7775y.h();
        }
    }

    public final void G(String str) {
        long y9;
        int parseInt;
        PlayerActivity playerActivity = this.f8024b;
        try {
            List k10 = k();
            int j4 = j();
            if (j4 >= 0) {
                ArrayList arrayList = (ArrayList) k10;
                if (j4 < arrayList.size() && str != null && str.equals(((a8.h) arrayList.get(j4)).f199b)) {
                    String i10 = i();
                    if (i10 != null) {
                        String replaceAll = i10.replaceAll("[^0-9]", "");
                        if (!replaceAll.isEmpty()) {
                            try {
                                parseInt = Integer.parseInt(replaceAll);
                            } catch (Exception unused) {
                            }
                            playerActivity.f7775y.b(parseInt);
                            playerActivity.B();
                            return;
                        }
                    }
                    parseInt = -1;
                    playerActivity.f7775y.b(parseInt);
                    playerActivity.B();
                    return;
                }
            }
        } catch (Exception e10) {
            Log.e("QualitySelector", "override", e10);
        }
        d0 d0Var = playerActivity.T;
        if (d0Var == null) {
            y9 = 0;
        } else {
            y9 = d0Var.y();
        }
        playerActivity.f7775y.d(str, true);
        d0 d0Var2 = playerActivity.T;
        if (d0Var2 != null && y9 > 0) {
            d0Var2.j(5, y9);
        }
        playerActivity.B();
    }

    public final void H(int i10) {
        int i11 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i11) {
            case 0:
                playerActivity.f7775y.i(i10, true, true);
                playerActivity.B();
                return;
            default:
                playerActivity.f7775y.i(i10, true, true);
                playerActivity.B();
                return;
        }
    }

    public final void I() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case zzaja.zze.zzg /* 7 */:
                z3.e eVar = playerActivity.I;
                TextView textView = (TextView) eVar.f12045c;
                if (textView != null) {
                    textView.setText(com.bumptech.glide.d.S(((a) eVar.f12044b).i()));
                    return;
                }
                return;
            default:
                z3.e eVar2 = playerActivity.I;
                TextView textView2 = (TextView) eVar2.f12045c;
                if (textView2 != null) {
                    textView2.setText(com.bumptech.glide.d.S(((a) eVar2.f12044b).i()));
                    return;
                }
                return;
        }
    }

    public final void a() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 2:
                Window y9 = playerActivity.A.y();
                if (y9 != null) {
                    y9.getDecorView().setSystemUiVisibility(5894);
                    return;
                }
                return;
            default:
                Window y10 = playerActivity.A.y();
                if (y10 != null) {
                    y10.getDecorView().setSystemUiVisibility(5894);
                    return;
                }
                return;
        }
    }

    public final void b() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 6:
                playerActivity.u();
                return;
            default:
                playerActivity.u();
                return;
        }
    }

    public final PlayerActivity c() {
        return this.f8024b;
    }

    public final a8.e d() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 0:
                return playerActivity.f7775y.o;
            case 1:
                return playerActivity.S;
            case 2:
                return playerActivity.f7775y.o;
            case 3:
                return playerActivity.S;
            default:
                return playerActivity.S;
        }
    }

    public final List e() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 0:
                return playerActivity.Q;
            case 1:
                return playerActivity.Q;
            case 2:
                return playerActivity.Q;
            default:
                return playerActivity.Q;
        }
    }

    public final j1.p f() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 0:
                return playerActivity.T;
            case 3:
                return playerActivity.T;
            case 4:
                return playerActivity.T;
            case 5:
                return playerActivity.T;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return playerActivity.T;
            default:
                return playerActivity.T;
        }
    }

    public final i0 g() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 3:
                return playerActivity.U;
            default:
                return playerActivity.U;
        }
    }

    public final int h() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 0:
                return playerActivity.f7772w0;
            default:
                return playerActivity.f7772w0;
        }
    }

    public final String i() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 8:
                return playerActivity.B0;
            default:
                return playerActivity.B0;
        }
    }

    public final int j() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 0:
                return playerActivity.f7775y.f9940h;
            case 5:
                return playerActivity.f7774x0;
            case 9:
                return playerActivity.f7774x0;
            case 10:
                return playerActivity.f7774x0;
            default:
                return playerActivity.f7774x0;
        }
    }

    public final List k() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 0:
                return playerActivity.R;
            case 5:
                return playerActivity.R;
            case 9:
                return playerActivity.R;
            case 10:
                return playerActivity.R;
            default:
                return playerActivity.R;
        }
    }

    public final Window l() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 2:
                return playerActivity.getWindow();
            case 3:
                return playerActivity.getWindow();
            default:
                return playerActivity.getWindow();
        }
    }

    public final void m() {
        PlayerActivity playerActivity = this.f8024b;
        q8.c cVar = playerActivity.f7763n0;
        if (cVar != null) {
            cVar.animate().cancel();
            playerActivity.f7763n0.animate().alpha(0.0f).setStartDelay(420L).setDuration(160L).withEndAction(new d(playerActivity, 5)).start();
        }
    }

    public final boolean n() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 0:
                return playerActivity.G0;
            case 4:
                return playerActivity.G0;
            default:
                return playerActivity.G0;
        }
    }

    public final boolean o() {
        int i10 = this.f8023a;
        Boolean bool = null;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 0:
                PlayerViewModel playerViewModel = playerActivity.f7773x;
                if (playerViewModel != null) {
                    bool = (Boolean) playerViewModel.f7831g.d();
                }
                return Boolean.TRUE.equals(bool);
            default:
                PlayerViewModel playerViewModel2 = playerActivity.f7773x;
                if (playerViewModel2 != null) {
                    bool = (Boolean) playerViewModel2.f7831g.d();
                }
                return Boolean.TRUE.equals(bool);
        }
    }

    public final void p() {
        PlayerActivity playerActivity = this.f8024b;
        d2.t tVar = playerActivity.L;
        a8.e eVar = playerActivity.S;
        tVar.getClass();
        if (eVar != null) {
            a8.b bVar = new a8.b();
            bVar.D = eVar.f188f;
            h0.x0(playerActivity, bVar);
        }
        s8.b bVar2 = playerActivity.f7775y;
        int i10 = bVar2.f9939g + 1;
        ArrayList arrayList = bVar2.f9936d;
        if (i10 < arrayList.size()) {
            bVar2.g((a8.e) arrayList.get(bVar2.f9939g + 1));
        } else {
            bVar2.f9934b.f8024b.A.K();
        }
        s8.b bVar3 = playerActivity.f7775y;
        playerActivity.f7771v0 = bVar3.f9939g;
        a8.e eVar2 = bVar3.o;
        playerActivity.S = eVar2;
        playerActivity.T = bVar3.f9937e;
        playerActivity.J0 = bVar3.f9944l;
        playerActivity.f7772w0 = com.bumptech.glide.d.T(eVar2);
        playerActivity.A.C();
    }

    public final TextView q(String str) {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 9:
                TextView l10 = w8.i.l((Context) playerActivity.K.f597a, str, 22, -1, 1);
                l10.setGravity(16);
                return l10;
            case 10:
                TextView l11 = w8.i.l((Context) playerActivity.K.f597a, str, 22, -1, 1);
                l11.setGravity(16);
                return l11;
            default:
                TextView l12 = w8.i.l((Context) playerActivity.K.f597a, str, 22, -1, 1);
                l12.setGravity(16);
                return l12;
        }
    }

    public final void r(Runnable runnable, long j4) {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 0:
                playerActivity.P.postDelayed(runnable, j4);
                return;
            case 1:
            default:
                playerActivity.P.postDelayed(runnable, j4);
                return;
            case 2:
                playerActivity.P.postDelayed(runnable, j4);
                return;
        }
    }

    public final TextView s(String str, boolean z9, Runnable runnable) {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 9:
                return playerActivity.x(str, z9, runnable);
            case 10:
                return playerActivity.x(str, z9, runnable);
            default:
                return playerActivity.x(str, z9, runnable);
        }
    }

    public final void t(Runnable runnable) {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 0:
                playerActivity.P.removeCallbacks(runnable);
                return;
            default:
                playerActivity.P.removeCallbacks(runnable);
                return;
        }
    }

    public final void u() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 2:
                playerActivity.A.C();
                return;
            case 6:
                playerActivity.A.C();
                return;
            default:
                playerActivity.A.C();
                return;
        }
    }

    public final void v() {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 0:
                playerActivity.A.D();
                return;
            case 6:
                playerActivity.A.D();
                return;
            default:
                playerActivity.A.D();
                return;
        }
    }

    public final void w(a8.e eVar) {
        int i10 = this.f8023a;
        PlayerActivity playerActivity = this.f8024b;
        switch (i10) {
            case 0:
                playerActivity.f7775y.g(eVar);
                s8.b bVar = playerActivity.f7775y;
                playerActivity.f7771v0 = bVar.f9939g;
                a8.e eVar2 = bVar.o;
                playerActivity.S = eVar2;
                playerActivity.P0 = bVar.f9946n;
                playerActivity.T = bVar.f9937e;
                playerActivity.J0 = bVar.f9944l;
                playerActivity.f7772w0 = com.bumptech.glide.d.T(eVar2);
                playerActivity.A.C();
                return;
            default:
                playerActivity.f7775y.g(eVar);
                s8.b bVar2 = playerActivity.f7775y;
                playerActivity.f7771v0 = bVar2.f9939g;
                a8.e eVar3 = bVar2.o;
                playerActivity.S = eVar3;
                playerActivity.P0 = bVar2.f9946n;
                playerActivity.T = bVar2.f9937e;
                playerActivity.J0 = bVar2.f9944l;
                playerActivity.f7772w0 = com.bumptech.glide.d.T(eVar3);
                playerActivity.A.C();
                return;
        }
    }

    public final void x(boolean z9) {
        int i10;
        int i11;
        PlayerActivity playerActivity = this.f8024b;
        s8.b bVar = playerActivity.f7775y;
        bVar.f9943k = z9;
        if (z9) {
            i10 = w8.i.f11068h;
        } else {
            i10 = w8.i.f11065e;
        }
        a aVar = bVar.f9934b;
        TextView textView = aVar.f8024b.f7755f0;
        if (textView != null) {
            textView.setTextColor(i10);
        }
        if (bVar.f9943k) {
            i11 = w8.i.f11065e;
        } else {
            i11 = w8.i.f11068h;
        }
        TextView textView2 = aVar.f8024b.f7756g0;
        if (textView2 != null) {
            textView2.setTextColor(i11);
        }
        int f10 = bVar.f();
        if (f10 >= 0) {
            bVar.i(f10, true, true);
        }
        aVar.b();
        aVar.v();
        playerActivity.B();
        playerActivity.C0 = playerActivity.f7775y.f9943k;
    }

    public final void y(String str, boolean z9) {
        this.f8024b.A(str, z9);
    }

    public final void z(String str, float f10, boolean z9) {
        int i10;
        PlayerActivity playerActivity = this.f8024b;
        q8.c cVar = playerActivity.f7763n0;
        if (cVar != null) {
            cVar.f9246c = str;
            cVar.f9247d = Math.max(0.0f, Math.min(1.0f, f10));
            cVar.f9248e = false;
            cVar.invalidate();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) playerActivity.f7763n0.getLayoutParams();
            if (z9) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            layoutParams.gravity = i10 | 16;
            layoutParams.setMargins(w8.i.e(playerActivity, 32), 0, w8.i.e(playerActivity, 32), 0);
            playerActivity.f7763n0.setLayoutParams(layoutParams);
            playerActivity.f7763n0.setAlpha(1.0f);
            playerActivity.f7763n0.setVisibility(0);
        }
    }
}
