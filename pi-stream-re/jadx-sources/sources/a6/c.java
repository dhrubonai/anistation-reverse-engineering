package a6;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import e6.h;
import e6.i;

/* loaded from: classes.dex */
public final class c extends w7.b {

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f113u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f114v;

    public /* synthetic */ c(Object obj, int i10) {
        this.f113u = i10;
        this.f114v = obj;
    }

    @Override // w7.b
    public final void O(int i10) {
        switch (this.f113u) {
            case 0:
                return;
            default:
                i iVar = (i) this.f114v;
                iVar.f3590d = true;
                h hVar = (h) iVar.f3591e.get();
                if (hVar != null) {
                    g gVar = (g) hVar;
                    gVar.u();
                    gVar.invalidateSelf();
                    return;
                }
                return;
        }
    }

    @Override // w7.b
    public final void P(Typeface typeface, boolean z9) {
        CharSequence text;
        int i10 = this.f113u;
        Object obj = this.f114v;
        switch (i10) {
            case 0:
                Chip chip = (Chip) obj;
                g gVar = chip.f2696e;
                if (gVar.U0) {
                    text = gVar.V;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z9) {
                    i iVar = (i) obj;
                    iVar.f3590d = true;
                    h hVar = (h) iVar.f3591e.get();
                    if (hVar != null) {
                        g gVar2 = (g) hVar;
                        gVar2.u();
                        gVar2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
