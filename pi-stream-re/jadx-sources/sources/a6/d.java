package a6;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class d extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f116b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f115a = i10;
        this.f116b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.f115a) {
            case 0:
                g gVar = ((Chip) this.f116b).f2696e;
                if (gVar != null) {
                    gVar.getOutline(outline);
                    return;
                } else {
                    outline.setAlpha(0.0f);
                    return;
                }
            default:
                outline.setOval(0, 0, view.getWidth(), view.getHeight());
                return;
        }
    }
}
