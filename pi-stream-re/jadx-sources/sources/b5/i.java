package b5;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.q;

/* loaded from: classes.dex */
public class i extends q {
    public Dialog C0;
    public DialogInterface.OnCancelListener D0;
    public AlertDialog E0;

    @Override // androidx.fragment.app.q
    public final Dialog V() {
        Dialog dialog = this.C0;
        if (dialog == null) {
            this.f957t0 = false;
            if (this.E0 == null) {
                Context k10 = k();
                w7.b.s(k10);
                this.E0 = new AlertDialog.Builder(k10).create();
            }
            return this.E0;
        }
        return dialog;
    }

    @Override // androidx.fragment.app.q, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.D0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
