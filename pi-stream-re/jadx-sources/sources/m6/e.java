package m6;

import com.google.android.material.internal.CheckableImageButton;
import p7.a0;

/* loaded from: classes.dex */
public final class e extends o {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7468e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(n nVar, int i10) {
        super(nVar);
        this.f7468e = i10;
    }

    @Override // m6.o
    public final void r() {
        switch (this.f7468e) {
            case 0:
                n nVar = this.f7497b;
                nVar.F = null;
                CheckableImageButton checkableImageButton = nVar.f7493x;
                checkableImageButton.setOnLongClickListener(null);
                a0.U(checkableImageButton, null);
                return;
            default:
                return;
        }
    }
}
