package i6;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f5386i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f5387j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f5388k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f5389l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f5390a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f5391b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f5392c;

    /* renamed from: d, reason: collision with root package name */
    public int f5393d;

    /* renamed from: e, reason: collision with root package name */
    public int f5394e;

    /* renamed from: f, reason: collision with root package name */
    public int f5395f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f5396g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f5397h;

    public a() {
        Paint paint = new Paint();
        this.f5397h = paint;
        this.f5390a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f5391b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f5392c = new Paint(paint2);
    }

    public final void a(int i10) {
        this.f5393d = z.a.c(i10, 68);
        this.f5394e = z.a.c(i10, 20);
        this.f5395f = z.a.c(i10, 0);
        this.f5390a.setColor(this.f5393d);
    }
}
