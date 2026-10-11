package j6;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class f extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public k f6174a;

    /* renamed from: b, reason: collision with root package name */
    public d6.a f6175b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f6176c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f6177d;

    /* renamed from: e, reason: collision with root package name */
    public final ColorStateList f6178e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f6179f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f6180g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f6181h;

    /* renamed from: i, reason: collision with root package name */
    public final float f6182i;

    /* renamed from: j, reason: collision with root package name */
    public float f6183j;

    /* renamed from: k, reason: collision with root package name */
    public float f6184k;

    /* renamed from: l, reason: collision with root package name */
    public int f6185l;

    /* renamed from: m, reason: collision with root package name */
    public float f6186m;

    /* renamed from: n, reason: collision with root package name */
    public float f6187n;
    public final float o;

    /* renamed from: p, reason: collision with root package name */
    public final int f6188p;

    /* renamed from: q, reason: collision with root package name */
    public int f6189q;

    /* renamed from: r, reason: collision with root package name */
    public int f6190r;

    /* renamed from: s, reason: collision with root package name */
    public final int f6191s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f6192t;

    /* renamed from: u, reason: collision with root package name */
    public final Paint.Style f6193u;

    public f(k kVar) {
        this.f6176c = null;
        this.f6177d = null;
        this.f6178e = null;
        this.f6179f = null;
        this.f6180g = PorterDuff.Mode.SRC_IN;
        this.f6181h = null;
        this.f6182i = 1.0f;
        this.f6183j = 1.0f;
        this.f6185l = 255;
        this.f6186m = 0.0f;
        this.f6187n = 0.0f;
        this.o = 0.0f;
        this.f6188p = 0;
        this.f6189q = 0;
        this.f6190r = 0;
        this.f6191s = 0;
        this.f6192t = false;
        this.f6193u = Paint.Style.FILL_AND_STROKE;
        this.f6174a = kVar;
        this.f6175b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        g gVar = new g(this);
        gVar.f6198e = true;
        return gVar;
    }

    public f(f fVar) {
        this.f6176c = null;
        this.f6177d = null;
        this.f6178e = null;
        this.f6179f = null;
        this.f6180g = PorterDuff.Mode.SRC_IN;
        this.f6181h = null;
        this.f6182i = 1.0f;
        this.f6183j = 1.0f;
        this.f6185l = 255;
        this.f6186m = 0.0f;
        this.f6187n = 0.0f;
        this.o = 0.0f;
        this.f6188p = 0;
        this.f6189q = 0;
        this.f6190r = 0;
        this.f6191s = 0;
        this.f6192t = false;
        this.f6193u = Paint.Style.FILL_AND_STROKE;
        this.f6174a = fVar.f6174a;
        this.f6175b = fVar.f6175b;
        this.f6184k = fVar.f6184k;
        this.f6176c = fVar.f6176c;
        this.f6177d = fVar.f6177d;
        this.f6180g = fVar.f6180g;
        this.f6179f = fVar.f6179f;
        this.f6185l = fVar.f6185l;
        this.f6182i = fVar.f6182i;
        this.f6190r = fVar.f6190r;
        this.f6188p = fVar.f6188p;
        this.f6192t = fVar.f6192t;
        this.f6183j = fVar.f6183j;
        this.f6186m = fVar.f6186m;
        this.f6187n = fVar.f6187n;
        this.o = fVar.o;
        this.f6189q = fVar.f6189q;
        this.f6191s = fVar.f6191s;
        this.f6178e = fVar.f6178e;
        this.f6193u = fVar.f6193u;
        if (fVar.f6181h != null) {
            this.f6181h = new Rect(fVar.f6181h);
        }
    }
}
