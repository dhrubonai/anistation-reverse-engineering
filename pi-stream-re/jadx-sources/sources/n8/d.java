package n8;

import android.media.AudioManager;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.o3;
import androidx.lifecycle.q0;
import msr.pistream.app.ui.player.PlayerActivity;
import msr.pistream.app.viewmodel.PlayerViewModel;
import o1.d0;
import v1.z;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8028a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f8029b;

    public /* synthetic */ d(PlayerActivity playerActivity, int i10) {
        this.f8028a = i10;
        this.f8029b = playerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String trim;
        int i10 = this.f8028a;
        int i11 = 3;
        int i12 = 8;
        PlayerActivity playerActivity = this.f8029b;
        switch (i10) {
            case 0:
                int i13 = PlayerActivity.T0;
                if (!playerActivity.isFinishing()) {
                    playerActivity.f7766q0 = (AudioManager) playerActivity.getSystemService("audio");
                    playerActivity.A = new z3.e(new a(playerActivity, 0));
                    playerActivity.B = new o8.c(new a(playerActivity, i11));
                    playerActivity.C = new v8.b(new a(playerActivity, 12));
                    playerActivity.D = new f8.h(new a(playerActivity, 10));
                    playerActivity.E = new f8.h(new a(playerActivity, 9));
                    int i14 = 2;
                    playerActivity.F = new f8.h(new a(playerActivity, i14));
                    playerActivity.G = new d0(new a(playerActivity, 11));
                    playerActivity.I = new z3.e(new a(playerActivity, i12), 25);
                    Window y9 = playerActivity.A.y();
                    if (y9 != null) {
                        y9.setStatusBarColor(0);
                        y9.setNavigationBarColor(-16777216);
                    }
                    playerActivity.f7775y = new s8.b(playerActivity, new a(playerActivity, 7));
                    int i15 = 4;
                    q8.b bVar = new q8.b(playerActivity, new a(playerActivity, i15));
                    playerActivity.f7777z = bVar;
                    playerActivity.J = new t(playerActivity, bVar, playerActivity.f7775y, playerActivity.A, new a(playerActivity, 5));
                    playerActivity.K = new o3(playerActivity, playerActivity.P, new a(playerActivity, 6));
                    playerActivity.M = new q0();
                    playerActivity.u();
                    playerActivity.L = new d2.t();
                    s8.b bVar2 = playerActivity.f7775y;
                    bVar2.o = playerActivity.S;
                    bVar2.f9939g = playerActivity.f7771v0;
                    bVar2.f9946n = playerActivity.P0;
                    bVar2.f9943k = playerActivity.C0;
                    bVar2.f9945m = playerActivity.L0;
                    bVar2.f9936d.addAll(playerActivity.Q);
                    playerActivity.f7773x.f7834j.e(playerActivity, new c(playerActivity, 1));
                    playerActivity.f7773x.f7830f.e(playerActivity, new c(playerActivity, i14));
                    playerActivity.f7773x.f7833i.e(playerActivity, new c(playerActivity, i11));
                    playerActivity.f7773x.f7838n.e(playerActivity, new c(playerActivity, i15));
                    a aVar = (a) playerActivity.H.f3961a;
                    a8.e d10 = aVar.d();
                    if (d10 != null) {
                        String str = d10.f188f;
                        if (str == null) {
                            trim = "";
                        } else {
                            trim = str.trim();
                        }
                        String str2 = trim;
                        if (!str2.isEmpty()) {
                            PlayerActivity playerActivity2 = aVar.f8024b;
                            playerActivity2.getClass();
                            a8.b bVar3 = new a8.b();
                            bVar3.f168a = com.bumptech.glide.d.u(d10);
                            bVar3.f169b = str2;
                            String str3 = d10.f185c;
                            bVar3.f170c = str3;
                            bVar3.A = str3;
                            bVar3.D = str2;
                            PlayerViewModel playerViewModel = playerActivity2.f7773x;
                            String str4 = d10.f189x;
                            playerViewModel.f7834j.h(b8.a.c());
                            playerViewModel.f7829e.execute(new z(playerViewModel, bVar3, str2, str4, 7));
                        }
                    }
                    playerActivity.w();
                    return;
                }
                return;
            case 1:
                ImageView imageView = playerActivity.f7768s0;
                if (imageView != null) {
                    imageView.animate().cancel();
                    playerActivity.f7768s0.setVisibility(8);
                    playerActivity.f7768s0.setAlpha(1.0f);
                    playerActivity.f7768s0.setScaleX(1.0f);
                    playerActivity.f7768s0.setScaleY(1.0f);
                    return;
                }
                return;
            case 2:
                TextView textView = playerActivity.X;
                if (textView != null) {
                    textView.animate().cancel();
                    playerActivity.X.animate().alpha(0.0f).setDuration(160L).withEndAction(new d(playerActivity, i11)).start();
                    return;
                }
                return;
            case 3:
                playerActivity.X.setVisibility(8);
                return;
            case 4:
                playerActivity.f7775y.j();
                return;
            default:
                playerActivity.f7763n0.setVisibility(8);
                return;
        }
    }
}
