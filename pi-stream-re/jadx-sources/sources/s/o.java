package s;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes.dex */
public final class o extends View {
    public o(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i10) {
        d dVar = (d) getLayoutParams();
        dVar.f9596a = i10;
        setLayoutParams(dVar);
    }

    public void setGuidelineEnd(int i10) {
        d dVar = (d) getLayoutParams();
        dVar.f9598b = i10;
        setLayoutParams(dVar);
    }

    public void setGuidelinePercent(float f10) {
        d dVar = (d) getLayoutParams();
        dVar.f9600c = f10;
        setLayoutParams(dVar);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
    }
}
