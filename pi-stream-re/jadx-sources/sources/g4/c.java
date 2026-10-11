package g4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c extends Drawable implements f, Animatable {
    public Rect A;

    /* renamed from: a, reason: collision with root package name */
    public final b f4400a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4401b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4402c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4403d;

    /* renamed from: f, reason: collision with root package name */
    public int f4405f;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4407y;

    /* renamed from: z, reason: collision with root package name */
    public Paint f4408z;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4404e = true;

    /* renamed from: x, reason: collision with root package name */
    public final int f4406x = -1;

    public c(b bVar) {
        w7.b.q(bVar);
        this.f4400a = bVar;
    }

    public final void a() {
        w7.b.h(!this.f4403d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        h hVar = this.f4400a.f4399a;
        if (((u3.e) hVar.f4416a).f10235l.f10211c == 1) {
            invalidateSelf();
            return;
        }
        if (!this.f4401b) {
            this.f4401b = true;
            if (!hVar.f4425j) {
                ArrayList arrayList = hVar.f4418c;
                if (!arrayList.contains(this)) {
                    boolean isEmpty = arrayList.isEmpty();
                    arrayList.add(this);
                    if (isEmpty && !hVar.f4421f) {
                        hVar.f4421f = true;
                        hVar.f4425j = false;
                        hVar.a();
                    }
                    invalidateSelf();
                    return;
                }
                throw new IllegalStateException("Cannot subscribe twice in a row");
            }
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.f4403d) {
            return;
        }
        if (this.f4407y) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.A == null) {
                this.A = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.A);
            this.f4407y = false;
        }
        h hVar = this.f4400a.f4399a;
        e eVar = hVar.f4424i;
        if (eVar != null) {
            bitmap = eVar.f4413x;
        } else {
            bitmap = hVar.f4427l;
        }
        if (this.A == null) {
            this.A = new Rect();
        }
        Rect rect = this.A;
        if (this.f4408z == null) {
            this.f4408z = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f4408z);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f4400a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f4400a.f4399a.f4430p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f4400a.f4399a.o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f4401b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f4407y = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f4408z == null) {
            this.f4408z = new Paint(2);
        }
        this.f4408z.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f4408z == null) {
            this.f4408z = new Paint(2);
        }
        this.f4408z.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        w7.b.h(!this.f4403d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f4404e = z9;
        if (!z9) {
            this.f4401b = false;
            h hVar = this.f4400a.f4399a;
            ArrayList arrayList = hVar.f4418c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                hVar.f4421f = false;
            }
        } else if (this.f4402c) {
            a();
        }
        return super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f4402c = true;
        this.f4405f = 0;
        if (this.f4404e) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f4402c = false;
        this.f4401b = false;
        h hVar = this.f4400a.f4399a;
        ArrayList arrayList = hVar.f4418c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            hVar.f4421f = false;
        }
    }
}
