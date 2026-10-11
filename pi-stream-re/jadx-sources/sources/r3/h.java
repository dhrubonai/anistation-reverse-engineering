package r3;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class h extends k {

    /* renamed from: e, reason: collision with root package name */
    public y.c f9339e;

    /* renamed from: f, reason: collision with root package name */
    public float f9340f;

    /* renamed from: g, reason: collision with root package name */
    public y.c f9341g;

    /* renamed from: h, reason: collision with root package name */
    public float f9342h;

    /* renamed from: i, reason: collision with root package name */
    public float f9343i;

    /* renamed from: j, reason: collision with root package name */
    public float f9344j;

    /* renamed from: k, reason: collision with root package name */
    public float f9345k;

    /* renamed from: l, reason: collision with root package name */
    public float f9346l;

    /* renamed from: m, reason: collision with root package name */
    public Paint.Cap f9347m;

    /* renamed from: n, reason: collision with root package name */
    public Paint.Join f9348n;
    public float o;

    public h() {
        this.f9340f = 0.0f;
        this.f9342h = 1.0f;
        this.f9343i = 1.0f;
        this.f9344j = 0.0f;
        this.f9345k = 1.0f;
        this.f9346l = 0.0f;
        this.f9347m = Paint.Cap.BUTT;
        this.f9348n = Paint.Join.MITER;
        this.o = 4.0f;
    }

    @Override // r3.j
    public final boolean a() {
        if (!this.f9341g.f() && !this.f9339e.f()) {
            return false;
        }
        return true;
    }

    @Override // r3.j
    public final boolean b(int[] iArr) {
        return this.f9339e.g(iArr) | this.f9341g.g(iArr);
    }

    public float getFillAlpha() {
        return this.f9343i;
    }

    public int getFillColor() {
        return this.f9341g.f11423a;
    }

    public float getStrokeAlpha() {
        return this.f9342h;
    }

    public int getStrokeColor() {
        return this.f9339e.f11423a;
    }

    public float getStrokeWidth() {
        return this.f9340f;
    }

    public float getTrimPathEnd() {
        return this.f9345k;
    }

    public float getTrimPathOffset() {
        return this.f9346l;
    }

    public float getTrimPathStart() {
        return this.f9344j;
    }

    public void setFillAlpha(float f10) {
        this.f9343i = f10;
    }

    public void setFillColor(int i10) {
        this.f9341g.f11423a = i10;
    }

    public void setStrokeAlpha(float f10) {
        this.f9342h = f10;
    }

    public void setStrokeColor(int i10) {
        this.f9339e.f11423a = i10;
    }

    public void setStrokeWidth(float f10) {
        this.f9340f = f10;
    }

    public void setTrimPathEnd(float f10) {
        this.f9345k = f10;
    }

    public void setTrimPathOffset(float f10) {
        this.f9346l = f10;
    }

    public void setTrimPathStart(float f10) {
        this.f9344j = f10;
    }

    public h(h hVar) {
        super(hVar);
        this.f9340f = 0.0f;
        this.f9342h = 1.0f;
        this.f9343i = 1.0f;
        this.f9344j = 0.0f;
        this.f9345k = 1.0f;
        this.f9346l = 0.0f;
        this.f9347m = Paint.Cap.BUTT;
        this.f9348n = Paint.Join.MITER;
        this.o = 4.0f;
        this.f9339e = hVar.f9339e;
        this.f9340f = hVar.f9340f;
        this.f9342h = hVar.f9342h;
        this.f9341g = hVar.f9341g;
        this.f9363c = hVar.f9363c;
        this.f9343i = hVar.f9343i;
        this.f9344j = hVar.f9344j;
        this.f9345k = hVar.f9345k;
        this.f9346l = hVar.f9346l;
        this.f9347m = hVar.f9347m;
        this.f9348n = hVar.f9348n;
        this.o = hVar.o;
    }
}
