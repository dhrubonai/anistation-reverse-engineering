package b5;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class b extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    public Dialog f1510a;

    /* renamed from: b, reason: collision with root package name */
    public DialogInterface.OnCancelListener f1511b;

    /* renamed from: c, reason: collision with root package name */
    public AlertDialog f1512c;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f1511b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f1510a;
        if (dialog == null) {
            setShowsDialog(false);
            if (this.f1512c == null) {
                Activity activity = getActivity();
                w7.b.s(activity);
                this.f1512c = new AlertDialog.Builder(activity).create();
            }
            return this.f1512c;
        }
        return dialog;
    }

    @Override // android.app.DialogFragment
    public final void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
