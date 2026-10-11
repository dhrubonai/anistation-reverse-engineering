package androidx.fragment.app;

import android.app.Dialog;
import android.content.DialogInterface;

/* loaded from: classes.dex */
public final class m implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f929a;

    public m(q qVar) {
        this.f929a = qVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        q qVar = this.f929a;
        Dialog dialog = qVar.f961x0;
        if (dialog != null) {
            qVar.onCancel(dialog);
        }
    }
}
