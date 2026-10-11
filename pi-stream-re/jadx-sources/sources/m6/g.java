package m6;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* loaded from: classes.dex */
public final class g extends h {
    @Override // j6.g
    public final void f(Canvas canvas) {
        if (this.O.f7469v.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.O.f7469v);
        } else {
            canvas.clipRect(this.O.f7469v, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }
}
