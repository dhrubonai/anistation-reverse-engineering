package h8;

import android.app.AlertDialog;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5036a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertDialog f5037b;

    public /* synthetic */ g(AlertDialog alertDialog, int i10) {
        this.f5036a = i10;
        this.f5037b = alertDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f5036a;
        AlertDialog alertDialog = this.f5037b;
        switch (i10) {
            case 0:
                alertDialog.dismiss();
                return;
            case 1:
                alertDialog.dismiss();
                return;
            default:
                alertDialog.dismiss();
                return;
        }
    }
}
