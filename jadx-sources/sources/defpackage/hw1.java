package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class hw1 extends DialogFragment {
    public Dialog x;
    public DialogInterface.OnCancelListener y;
    public AlertDialog z;

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.y;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.x;
        if (dialog == null) {
            setShowsDialog(false);
            AlertDialog alertDialog = this.z;
            if (alertDialog == null) {
                Activity activity = getActivity();
                a34.x(activity);
                AlertDialog create = new AlertDialog.Builder(activity).create();
                this.z = create;
                return create;
            }
            return alertDialog;
        }
        return dialog;
    }
}
