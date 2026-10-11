package y5;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m3.i0;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class a extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f11631a;

    /* renamed from: b, reason: collision with root package name */
    public List f11632b;

    public a() {
        Paint paint = new Paint();
        this.f11631a = paint;
        this.f11632b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // m3.i0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.f11631a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (b bVar : this.f11632b) {
            bVar.getClass();
            ThreadLocal threadLocal = z.a.f11854a;
            float f10 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f10)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f10)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f10)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f10))));
            bVar.getClass();
            float E = ((CarouselLayoutManager) recyclerView.getLayoutManager()).E();
            bVar.getClass();
            CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
            canvas.drawLine(0.0f, E, 0.0f, carouselLayoutManager.o - carouselLayoutManager.B(), paint);
        }
    }
}
