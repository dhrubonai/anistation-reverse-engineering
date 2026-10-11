package u8;

import a3.g;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import w8.i;

/* loaded from: classes.dex */
public final class a extends View {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10335a;

    /* renamed from: b, reason: collision with root package name */
    public long f10336b;

    public a(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f10335a = new ArrayList();
        paint.setColor(-1);
        paint.setAlpha(160);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f10336b > 0) {
            ArrayList arrayList = this.f10335a;
            if (!arrayList.isEmpty()) {
                Math.max(1.0f, (getWidth() - i.e(getContext(), 18)) - i.e(getContext(), 18));
                i.e(getContext(), 4);
                getHeight();
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    return;
                }
                g.z(it.next());
                throw null;
            }
        }
    }
}
