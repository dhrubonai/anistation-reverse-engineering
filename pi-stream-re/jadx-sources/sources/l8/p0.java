package l8;

import android.os.Handler;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f6995b;

    public /* synthetic */ p0(r0 r0Var, int i10) {
        this.f6994a = i10;
        this.f6995b = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f6994a;
        r0 r0Var = this.f6995b;
        switch (i10) {
            case 0:
                Handler handler = r0Var.f7010v0;
                try {
                    List e10 = r0Var.f7007s0.e();
                    if (e10 != null) {
                        r0Var.f7011w0.b("upcomingSeason", e10);
                    }
                    handler.post(new f.m0(25, r0Var, e10));
                    return;
                } catch (Exception unused) {
                    handler.post(new p0(r0Var, 2));
                    return;
                }
            case 1:
                r0Var.A0.f(r0Var.f7014z0);
                r0Var.B0.setVisibility(0);
                r0Var.a0();
                r0.X(r0Var.f7014z0, r0Var.U(300));
                return;
            default:
                int i11 = r0.D0;
                if (r0Var.q() && r0Var.V != null) {
                    LinearLayout linearLayout = r0Var.C0;
                    if (linearLayout != null) {
                        ViewParent parent = linearLayout.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(r0Var.C0);
                        }
                        r0Var.C0 = null;
                    }
                    r0Var.f7013y0.removeAllViews();
                    TextView l10 = w8.i.l(r0Var.f4484m0, "Could not load upcoming season", 16, w8.i.f11068h, 0);
                    l10.setGravity(17);
                    r.f.i(-1, -2, r0Var.f7013y0, l10);
                    return;
                }
                return;
        }
    }
}
