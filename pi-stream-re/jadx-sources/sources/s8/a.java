package s8;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.TextView;
import c1.k0;
import c1.k1;
import c1.m1;
import c1.n;
import c1.n0;
import c1.p0;
import c1.p1;
import c1.t0;
import c1.v0;
import c1.w0;
import c1.x0;
import c1.y0;
import e1.c;
import f.m0;
import j1.m;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import msr.pistream.app.ui.player.PlayerActivity;

/* loaded from: classes.dex */
public final class a implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9931a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f9932b;

    public /* synthetic */ a(b bVar, int i10) {
        this.f9931a = i10;
        this.f9932b = bVar;
    }

    @Override // c1.x0
    public final /* synthetic */ void C(boolean z9) {
    }

    @Override // c1.x0
    public final /* synthetic */ void E(int i10, int i11) {
    }

    @Override // c1.x0
    public final /* synthetic */ void G(m mVar) {
    }

    @Override // c1.x0
    public final /* synthetic */ void H(k1 k1Var) {
    }

    @Override // c1.x0
    public final /* synthetic */ void I() {
    }

    @Override // c1.x0
    public final /* synthetic */ void J(p1 p1Var) {
    }

    @Override // c1.x0
    public final /* synthetic */ void K(k0 k0Var, int i10) {
    }

    @Override // c1.x0
    public final /* synthetic */ void M(n0 n0Var) {
    }

    @Override // c1.x0
    public final /* synthetic */ void N(m1 m1Var) {
    }

    @Override // c1.x0
    public final void Q(boolean z9) {
        int i10 = this.f9931a;
        b bVar = this.f9932b;
        switch (i10) {
            case 0:
                bVar.f9934b.f8024b.A.K();
                return;
            default:
                bVar.f9934b.f8024b.A.K();
                return;
        }
    }

    @Override // c1.x0
    public final /* synthetic */ void a(int i10) {
    }

    @Override // c1.x0
    public final /* synthetic */ void b(n nVar) {
    }

    @Override // c1.x0
    public final /* synthetic */ void c(int i10) {
    }

    @Override // c1.x0
    public final /* synthetic */ void d(w0 w0Var) {
    }

    @Override // c1.x0
    public final void e(m mVar) {
        Integer num;
        int i10 = this.f9931a;
        String str = "Playback failed";
        b bVar = this.f9932b;
        switch (i10) {
            case 0:
                n8.a aVar = bVar.f9934b;
                if (mVar.getMessage() != null) {
                    str = mVar.getMessage();
                }
                TextView textView = aVar.f8024b.f7752c0;
                if (textView != null) {
                    textView.setText(str);
                }
                Log.e("PlaybackManager", "offline playback failed", mVar);
                return;
            default:
                boolean z9 = bVar.f9948q;
                n8.a aVar2 = bVar.f9934b;
                if (z9) {
                    TextView textView2 = aVar2.f8024b.f7752c0;
                    if (textView2 != null) {
                        textView2.setText("Error - Try another server");
                    }
                    bVar.f9948q = false;
                    Log.e("PlaybackManager", "fallback failed", mVar);
                    return;
                }
                int i11 = bVar.f9940h;
                HashSet hashSet = bVar.f9947p;
                if (i11 >= 0) {
                    hashSet.add(Integer.valueOf(i11));
                }
                Iterator it = bVar.h().iterator();
                while (true) {
                    if (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        if (!hashSet.contains(Integer.valueOf(intValue)) && intValue != bVar.f9940h) {
                            num = Integer.valueOf(intValue);
                        }
                    } else {
                        int i12 = 0;
                        while (true) {
                            if (i12 < bVar.f9935c.size()) {
                                if (!hashSet.contains(Integer.valueOf(i12)) && i12 != bVar.f9940h) {
                                    num = Integer.valueOf(i12);
                                } else {
                                    i12++;
                                }
                            } else {
                                num = null;
                            }
                        }
                    }
                }
                if (num != null) {
                    bVar.f9948q = true;
                    TextView textView3 = aVar2.f8024b.f7752c0;
                    if (textView3 != null) {
                        textView3.setText("Retrying...");
                    }
                    Log.e("PlaybackManager", "source failed, fallback to " + num, mVar);
                    new Handler(Looper.getMainLooper()).post(new m0(28, this, num));
                    return;
                }
                bVar.f9948q = false;
                bVar.f9941i = true;
                aVar2.v();
                PlayerActivity playerActivity = aVar2.f8024b;
                TextView textView4 = playerActivity.f7752c0;
                if (textView4 != null) {
                    textView4.setText("No working source - Try another server");
                }
                if (mVar.getMessage() != null) {
                    str = mVar.getMessage();
                }
                TextView textView5 = playerActivity.f7752c0;
                if (textView5 != null) {
                    textView5.setText(str);
                }
                Log.e("PlaybackManager", "all sources failed", mVar);
                return;
        }
    }

    @Override // c1.x0
    public final /* synthetic */ void f(int i10, y0 y0Var, y0 y0Var2) {
    }

    @Override // c1.x0
    public final /* synthetic */ void h() {
    }

    @Override // c1.x0
    public final /* synthetic */ void j(v0 v0Var) {
    }

    @Override // c1.x0
    public final /* synthetic */ void k(int i10) {
    }

    @Override // c1.x0
    public final /* synthetic */ void m(boolean z9) {
    }

    @Override // c1.x0
    public final /* synthetic */ void n() {
    }

    @Override // c1.x0
    public final /* synthetic */ void o(c cVar) {
    }

    @Override // c1.x0
    public final /* synthetic */ void p(boolean z9) {
    }

    @Override // c1.x0
    public final /* synthetic */ void r(p0 p0Var) {
    }

    @Override // c1.x0
    public final /* synthetic */ void s(List list) {
    }

    @Override // c1.x0
    public final /* synthetic */ void t(int i10, boolean z9) {
    }

    @Override // c1.x0
    public final /* synthetic */ void u(int i10, boolean z9) {
    }

    @Override // c1.x0
    public final /* synthetic */ void v(float f10) {
    }

    @Override // c1.x0
    public final /* synthetic */ void x(t0 t0Var) {
    }

    @Override // c1.x0
    public final void z(int i10) {
        int i11 = this.f9931a;
        int i12 = 8;
        b bVar = this.f9932b;
        boolean z9 = true;
        switch (i11) {
            case 0:
                if (i10 != 2) {
                    z9 = false;
                }
                bVar.f9944l = z9;
                n8.a aVar = bVar.f9934b;
                g8.c cVar = aVar.f8024b.V;
                if (cVar != null) {
                    if (z9) {
                        i12 = 0;
                    }
                    cVar.setVisibility(i12);
                }
                if (i10 == 3) {
                    aVar.f8024b.C.b();
                }
                if (i10 == 4) {
                    aVar.p();
                    return;
                }
                return;
            default:
                if (i10 != 2) {
                    z9 = false;
                }
                bVar.f9944l = z9;
                n8.a aVar2 = bVar.f9934b;
                g8.c cVar2 = aVar2.f8024b.V;
                if (cVar2 != null) {
                    if (z9) {
                        i12 = 0;
                    }
                    cVar2.setVisibility(i12);
                }
                if (i10 == 3) {
                    aVar2.f8024b.C.b();
                }
                if (i10 == 4) {
                    aVar2.p();
                    return;
                }
                return;
        }
    }
}
