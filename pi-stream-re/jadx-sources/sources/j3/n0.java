package j3;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class n0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* renamed from: a, reason: collision with root package name */
    public final float f6044a;

    /* renamed from: b, reason: collision with root package name */
    public final float f6045b;

    /* renamed from: c, reason: collision with root package name */
    public final float f6046c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6047d;

    /* renamed from: e, reason: collision with root package name */
    public final float f6048e;

    /* renamed from: f, reason: collision with root package name */
    public final TextPaint f6049f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f6050g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f6051h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f6052i;

    /* renamed from: j, reason: collision with root package name */
    public Layout.Alignment f6053j;

    /* renamed from: k, reason: collision with root package name */
    public Bitmap f6054k;

    /* renamed from: l, reason: collision with root package name */
    public float f6055l;

    /* renamed from: m, reason: collision with root package name */
    public int f6056m;

    /* renamed from: n, reason: collision with root package name */
    public int f6057n;
    public float o;

    /* renamed from: p, reason: collision with root package name */
    public int f6058p;

    /* renamed from: q, reason: collision with root package name */
    public float f6059q;

    /* renamed from: r, reason: collision with root package name */
    public float f6060r;

    /* renamed from: s, reason: collision with root package name */
    public int f6061s;

    /* renamed from: t, reason: collision with root package name */
    public int f6062t;

    /* renamed from: u, reason: collision with root package name */
    public int f6063u;

    /* renamed from: v, reason: collision with root package name */
    public int f6064v;

    /* renamed from: w, reason: collision with root package name */
    public int f6065w;

    /* renamed from: x, reason: collision with root package name */
    public float f6066x;

    /* renamed from: y, reason: collision with root package name */
    public float f6067y;

    /* renamed from: z, reason: collision with root package name */
    public float f6068z;

    public n0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f6048e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f6047d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f6044a = round;
        this.f6045b = round;
        this.f6046c = round;
        TextPaint textPaint = new TextPaint();
        this.f6049f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f6050g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f6051h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z9) {
        int i10;
        if (z9) {
            StaticLayout staticLayout = this.E;
            StaticLayout staticLayout2 = this.F;
            if (staticLayout != null && staticLayout2 != null) {
                int save = canvas.save();
                canvas.translate(this.G, this.H);
                if (Color.alpha(this.f6063u) > 0) {
                    Paint paint = this.f6050g;
                    paint.setColor(this.f6063u);
                    canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
                }
                int i11 = this.f6065w;
                TextPaint textPaint = this.f6049f;
                boolean z10 = true;
                if (i11 == 1) {
                    textPaint.setStrokeJoin(Paint.Join.ROUND);
                    textPaint.setStrokeWidth(this.f6044a);
                    textPaint.setColor(this.f6064v);
                    textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout2.draw(canvas);
                } else {
                    float f10 = this.f6045b;
                    if (i11 == 2) {
                        float f11 = this.f6046c;
                        textPaint.setShadowLayer(f10, f11, f11, this.f6064v);
                    } else if (i11 == 3 || i11 == 4) {
                        if (i11 != 3) {
                            z10 = false;
                        }
                        int i12 = -1;
                        if (z10) {
                            i10 = -1;
                        } else {
                            i10 = this.f6064v;
                        }
                        if (z10) {
                            i12 = this.f6064v;
                        }
                        float f12 = f10 / 2.0f;
                        textPaint.setColor(this.f6061s);
                        textPaint.setStyle(Paint.Style.FILL);
                        float f13 = -f12;
                        textPaint.setShadowLayer(f10, f13, f13, i10);
                        staticLayout2.draw(canvas);
                        textPaint.setShadowLayer(f10, f12, f12, i12);
                    }
                }
                textPaint.setColor(this.f6061s);
                textPaint.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        this.J.getClass();
        this.f6054k.getClass();
        canvas.drawBitmap(this.f6054k, (Rect) null, this.J, this.f6051h);
    }
}
