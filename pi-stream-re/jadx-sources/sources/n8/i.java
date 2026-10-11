package n8;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Switch;
import android.widget.TextView;
import msr.pistream.app.ui.player.PlayerActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8037b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f8036a = i10;
        this.f8037b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f8036a;
        Object obj = this.f8037b;
        switch (i10) {
            case 0:
                ((PopupWindow) obj).dismiss();
                return;
            case 1:
                ((Switch) obj).setChecked(!r1.isChecked());
                return;
            default:
                f8.h hVar = ((t) obj).f8072x.f8024b.D;
                a aVar = (a) hVar.f3961a;
                PlayerActivity playerActivity = aVar.f8024b;
                PopupWindow popupWindow = new PopupWindow();
                LinearLayout E = aVar.E(popupWindow, 340);
                E.addView(aVar.q("Select Server"), new LinearLayout.LayoutParams(-1, w8.i.e(playerActivity, 58)));
                hVar.a(playerActivity, E, aVar.k(), aVar.F(), aVar.j(), new t8.b(hVar, popupWindow, 0));
                if (aVar.o()) {
                    LinearLayout linearLayout = new LinearLayout(playerActivity);
                    linearLayout.setOrientation(0);
                    linearLayout.setGravity(16);
                    linearLayout.setPadding(w8.i.e(playerActivity, 16), w8.i.e(playerActivity, 10), w8.i.e(playerActivity, 16), w8.i.e(playerActivity, 10));
                    linearLayout.addView(w8.i.h(playerActivity, 14), new LinearLayout.LayoutParams(w8.i.e(playerActivity, 14), w8.i.e(playerActivity, 14)));
                    TextView l10 = w8.i.l(playerActivity, "Loading more servers...", 12, w8.i.f11068h, 0);
                    l10.setPadding(w8.i.e(playerActivity, 8), 0, 0, 0);
                    l10.setAlpha(0.85f);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.45f, 1.0f);
                    ofFloat.setDuration(700L);
                    ofFloat.setRepeatMode(2);
                    ofFloat.setRepeatCount(-1);
                    ofFloat.addUpdateListener(new p8.b(l10, 2));
                    l10.addOnAttachStateChangeListener(new t8.c(ofFloat, 1));
                    if (l10.isAttachedToWindow()) {
                        ofFloat.start();
                    } else {
                        l10.post(new p8.c(ofFloat, 2));
                    }
                    linearLayout.addView(l10);
                    E.addView(linearLayout);
                }
                aVar.A(popupWindow, E);
                return;
        }
    }
}
