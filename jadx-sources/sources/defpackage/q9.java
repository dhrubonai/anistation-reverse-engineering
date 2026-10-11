package defpackage;

import android.view.autofill.AutofillId;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q9 implements py {
    public final oa a;
    public final ty b;
    public final AutofillId c;

    public q9(oa oaVar, ty tyVar) {
        this.a = oaVar;
        this.b = tyVar;
        oaVar.setImportantForAutofill(1);
        AutofillId autofillId = oaVar.getAutofillId();
        if (autofillId != null) {
            this.c = autofillId;
            return;
        }
        throw h11.e("Required value was null.");
    }
}
