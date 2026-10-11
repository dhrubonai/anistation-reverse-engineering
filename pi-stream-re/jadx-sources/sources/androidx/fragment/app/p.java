package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* loaded from: classes.dex */
public final class p extends com.bumptech.glide.c {
    public final /* synthetic */ com.bumptech.glide.c C;
    public final /* synthetic */ q D;

    public p(q qVar, s sVar) {
        this.D = qVar;
        this.C = sVar;
    }

    @Override // com.bumptech.glide.c
    public final View P(int i10) {
        com.bumptech.glide.c cVar = this.C;
        if (cVar.Q()) {
            return cVar.P(i10);
        }
        Dialog dialog = this.D.f961x0;
        if (dialog != null) {
            return dialog.findViewById(i10);
        }
        return null;
    }

    @Override // com.bumptech.glide.c
    public final boolean Q() {
        if (!this.C.Q() && !this.D.B0) {
            return false;
        }
        return true;
    }
}
