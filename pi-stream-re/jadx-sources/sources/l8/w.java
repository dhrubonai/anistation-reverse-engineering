package l8;

import android.app.Dialog;
import android.view.View;
import android.widget.TextView;
import msr.pistream.app.ui.home.screens.MainActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f7030b;

    public /* synthetic */ w(MainActivity mainActivity, int i10) {
        this.f7029a = i10;
        this.f7030b = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f7029a;
        MainActivity mainActivity = this.f7030b;
        switch (i10) {
            case 0:
                int i11 = MainActivity.f7741b0;
                mainActivity.T();
                return;
            case 1:
                int i12 = MainActivity.f7741b0;
                mainActivity.getClass();
                mainActivity.T.push(new y(mainActivity, 3));
                mainActivity.F();
                mainActivity.J();
                mainActivity.P = "notifications";
                mainActivity.C();
                mainActivity.H.removeAllViews();
                mainActivity.z("Notifications");
                TextView l10 = w8.i.l(mainActivity, "No new notifications", 16, w8.i.f11068h, 1);
                l10.setGravity(17);
                a3.g.v(-1, 0, 1.0f, mainActivity.H, l10);
                mainActivity.V();
                mainActivity.H();
                return;
            default:
                int i13 = MainActivity.f7741b0;
                mainActivity.getClass();
                try {
                    Dialog dialog = mainActivity.Y;
                    if (dialog != null && dialog.isShowing()) {
                        mainActivity.Y.dismiss();
                    }
                } catch (Exception unused) {
                }
                mainActivity.Y = null;
                mainActivity.B(true);
                return;
        }
    }
}
