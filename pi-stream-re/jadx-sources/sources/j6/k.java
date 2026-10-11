package j6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p7.a0;
import r6.h0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f6216a;

    /* renamed from: b, reason: collision with root package name */
    public final h0 f6217b;

    /* renamed from: c, reason: collision with root package name */
    public final h0 f6218c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f6219d;

    /* renamed from: e, reason: collision with root package name */
    public final c f6220e;

    /* renamed from: f, reason: collision with root package name */
    public final c f6221f;

    /* renamed from: g, reason: collision with root package name */
    public final c f6222g;

    /* renamed from: h, reason: collision with root package name */
    public final c f6223h;

    /* renamed from: i, reason: collision with root package name */
    public final e f6224i;

    /* renamed from: j, reason: collision with root package name */
    public final e f6225j;

    /* renamed from: k, reason: collision with root package name */
    public final e f6226k;

    /* renamed from: l, reason: collision with root package name */
    public final e f6227l;

    public k(j jVar) {
        this.f6216a = jVar.f6204a;
        this.f6217b = jVar.f6205b;
        this.f6218c = jVar.f6206c;
        this.f6219d = jVar.f6207d;
        this.f6220e = jVar.f6208e;
        this.f6221f = jVar.f6209f;
        this.f6222g = jVar.f6210g;
        this.f6223h = jVar.f6211h;
        this.f6224i = jVar.f6212i;
        this.f6225j = jVar.f6213j;
        this.f6226k = jVar.f6214k;
        this.f6227l = jVar.f6215l;
    }

    public static j a(Context context, int i10, int i11, a aVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(s5.a.f9919u);
        try {
            int i12 = obtainStyledAttributes.getInt(0, 0);
            int i13 = obtainStyledAttributes.getInt(3, i12);
            int i14 = obtainStyledAttributes.getInt(4, i12);
            int i15 = obtainStyledAttributes.getInt(2, i12);
            int i16 = obtainStyledAttributes.getInt(1, i12);
            c c6 = c(obtainStyledAttributes, 5, aVar);
            c c10 = c(obtainStyledAttributes, 8, c6);
            c c11 = c(obtainStyledAttributes, 9, c6);
            c c12 = c(obtainStyledAttributes, 7, c6);
            c c13 = c(obtainStyledAttributes, 6, c6);
            j jVar = new j();
            h0 m5 = a0.m(i13);
            jVar.f6204a = m5;
            j.b(m5);
            jVar.f6208e = c10;
            h0 m9 = a0.m(i14);
            jVar.f6205b = m9;
            j.b(m9);
            jVar.f6209f = c11;
            h0 m10 = a0.m(i15);
            jVar.f6206c = m10;
            j.b(m10);
            jVar.f6210g = c12;
            h0 m11 = a0.m(i16);
            jVar.f6207d = m11;
            j.b(m11);
            jVar.f6211h = c13;
            return jVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static j b(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s5.a.o, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i10, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        if (i11 == 5) {
            return new a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i11 == 6) {
            return new h(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z9;
        boolean z10;
        boolean z11;
        if (this.f6227l.getClass().equals(e.class) && this.f6225j.getClass().equals(e.class) && this.f6224i.getClass().equals(e.class) && this.f6226k.getClass().equals(e.class)) {
            z9 = true;
        } else {
            z9 = false;
        }
        float a10 = this.f6220e.a(rectF);
        if (this.f6221f.a(rectF) == a10 && this.f6223h.a(rectF) == a10 && this.f6222g.a(rectF) == a10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((this.f6217b instanceof i) && (this.f6216a instanceof i) && (this.f6218c instanceof i) && (this.f6219d instanceof i)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 && z10 && z11) {
            return true;
        }
        return false;
    }

    public k() {
        this.f6216a = new i();
        this.f6217b = new i();
        this.f6218c = new i();
        this.f6219d = new i();
        this.f6220e = new a(0.0f);
        this.f6221f = new a(0.0f);
        this.f6222g = new a(0.0f);
        this.f6223h = new a(0.0f);
        this.f6224i = a0.n();
        this.f6225j = a0.n();
        this.f6226k = a0.n();
        this.f6227l = a0.n();
    }
}
