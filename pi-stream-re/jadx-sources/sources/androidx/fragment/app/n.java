package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class n implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f940a;

    public n(q qVar) {
        this.f940a = qVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        q qVar = this.f940a;
        Dialog dialog = qVar.f961x0;
        if (dialog != null) {
            qVar.onDismiss(dialog);
        }
    }
}
