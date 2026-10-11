package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pm5 {
    public final /* synthetic */ byte a;
    public wc7 b;
    public wc7 c;
    public wc7 d;
    public wc7 e;
    public f11 f;
    public f11 g;
    public f11 h;
    public f11 i;
    public nr1 j;
    public nr1 k;
    public nr1 l;
    public nr1 m;

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, wc7] */
    public pm5(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                return;
            default:
                this.b = new Object();
                this.c = new Object();
                this.d = new Object();
                this.e = new Object();
                this.f = new w(0.0f);
                this.g = new w(0.0f);
                this.h = new w(0.0f);
                this.i = new w(0.0f);
                byte b2 = 0;
                this.j = new nr1(b2);
                this.k = new nr1(b2);
                this.l = new nr1(b2);
                this.m = new nr1(b2);
                return;
        }
    }

    public static pm5 b(Context context, AttributeSet attributeSet, int i, int i2) {
        w wVar = new w(0.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tx4.f, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return c(contextThemeWrapper.obtainStyledAttributes(tx4.h), wVar);
    }

    public static pm5 c(TypedArray typedArray, w wVar) {
        try {
            int i = typedArray.getInt(0, 0);
            int i2 = typedArray.getInt(3, i);
            int i3 = typedArray.getInt(4, i);
            int i4 = typedArray.getInt(2, i);
            int i5 = typedArray.getInt(1, i);
            f11 d = d(typedArray, 5, wVar);
            f11 d2 = d(typedArray, 8, d);
            f11 d3 = d(typedArray, 9, d);
            f11 d4 = d(typedArray, 7, d);
            f11 d5 = d(typedArray, 6, d);
            pm5 pm5Var = new pm5((byte) 0);
            pm5Var.b = z51.l(i2);
            pm5Var.f = d2;
            pm5Var.c = z51.l(i3);
            pm5Var.g = d3;
            pm5Var.d = z51.l(i4);
            pm5Var.h = d4;
            pm5Var.e = z51.l(i5);
            pm5Var.i = d5;
            return pm5Var;
        } finally {
            typedArray.recycle();
        }
    }

    public static f11 d(TypedArray typedArray, int i, f11 f11Var) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new w(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new x15(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return f11Var;
    }

    public pm5 a() {
        pm5 pm5Var = new pm5((byte) 1);
        pm5Var.b = this.b;
        pm5Var.c = this.c;
        pm5Var.d = this.d;
        pm5Var.e = this.e;
        pm5Var.f = this.f;
        pm5Var.g = this.g;
        pm5Var.h = this.h;
        pm5Var.i = this.i;
        pm5Var.j = this.j;
        pm5Var.k = this.k;
        pm5Var.l = this.l;
        pm5Var.m = this.m;
        return pm5Var;
    }

    public boolean e(RectF rectF) {
        boolean z;
        boolean z2;
        if (this.m.getClass().equals(nr1.class) && this.k.getClass().equals(nr1.class) && this.j.getClass().equals(nr1.class) && this.l.getClass().equals(nr1.class)) {
            z = true;
        } else {
            z = false;
        }
        float a = this.f.a(rectF);
        if (this.g.a(rectF) == a && this.i.a(rectF) == a && this.h.a(rectF) == a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2 || !(this.c instanceof q75) || !(this.b instanceof q75) || !(this.d instanceof q75) || !(this.e instanceof q75)) {
            return false;
        }
        return true;
    }

    public pm5 f() {
        pm5 pm5Var = new pm5(false);
        pm5Var.b = this.b;
        pm5Var.c = this.c;
        pm5Var.d = this.d;
        pm5Var.e = this.e;
        pm5Var.f = this.f;
        pm5Var.g = this.g;
        pm5Var.h = this.h;
        pm5Var.i = this.i;
        pm5Var.j = this.j;
        pm5Var.k = this.k;
        pm5Var.l = this.l;
        pm5Var.m = this.m;
        return pm5Var;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "[" + this.f + ", " + this.g + ", " + this.h + ", " + this.i + "]";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ pm5(boolean z) {
        this.a = (byte) 0;
    }
}
