package i8;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class a extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f5414a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(d dVar, Context context) {
        super(context);
        this.f5414a = dVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.f5414a.f5422f) {
            super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) ((getMeasuredWidth() * 230.0f) / 168.0f), 1073741824));
        }
    }
}
