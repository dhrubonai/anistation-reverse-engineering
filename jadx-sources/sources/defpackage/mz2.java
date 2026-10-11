package defpackage;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mz2 extends InputConnectionWrapper {
    public final /* synthetic */ byte a = 1;

    public /* synthetic */ mz2(InputConnection inputConnection, boolean z) {
        super(inputConnection, z);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        i75 i75Var;
        Bundle bundle2;
        switch (this.a) {
            case 0:
                if (inputContentInfo == null) {
                    i75Var = null;
                } else {
                    i75Var = new i75(new cn7(inputContentInfo), (byte) 25);
                }
                if ((i & 1) != 0) {
                    try {
                        ((InputContentInfo) ((cn7) i75Var.y).x).requestPermission();
                        InputContentInfo inputContentInfo2 = (InputContentInfo) ((cn7) i75Var.y).x;
                        if (bundle == null) {
                            bundle2 = new Bundle();
                        } else {
                            bundle2 = new Bundle(bundle);
                        }
                        bundle2.putParcelable("EXTRA_INPUT_CONTENT_INFO", inputContentInfo2);
                    } catch (Exception e) {
                        e.toString();
                    }
                } else {
                    bundle2 = bundle;
                }
                cn7 cn7Var = (cn7) i75Var.y;
                cn7 cn7Var2 = (cn7) i75Var.y;
                ClipDescription description = ((InputContentInfo) cn7Var.x).getDescription();
                InputContentInfo inputContentInfo3 = (InputContentInfo) cn7Var2.x;
                new ClipData(description, new ClipData.Item(inputContentInfo3.getContentUri()));
                ((InputContentInfo) cn7Var2.x).getDescription();
                inputContentInfo3.getLinkUri();
                if (bundle2 == null) {
                    Bundle bundle3 = Bundle.EMPTY;
                }
                return super.commitContent(inputContentInfo, i, bundle);
            default:
                return false;
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        switch (this.a) {
            case 1:
                return true;
            default:
                return super.performPrivateCommand(str, bundle);
        }
    }

    public mz2(mz2 mz2Var, xb5 xb5Var) {
        super(mz2Var, false);
    }
}
