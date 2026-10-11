package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bd6 {
    public final ad6 a;
    public final o24 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public bd6(ad6 ad6Var, o24 o24Var, long j) {
        float lineBaseline;
        float f;
        float lineBaseline2;
        this.a = ad6Var;
        this.b = o24Var;
        this.c = j;
        ArrayList arrayList = o24Var.h;
        float f2 = 0.0f;
        if (arrayList.isEmpty()) {
            f = 0.0f;
        } else {
            zc6 zc6Var = ((di4) arrayList.get(0)).a.d;
            Paint.FontMetricsInt fontMetricsInt = zc6Var.l;
            float f3 = zc6Var.h;
            if (zc6Var.g - 1 == 0 && fontMetricsInt != null) {
                lineBaseline = zc6Var.h(0) - fontMetricsInt.ascent;
            } else {
                lineBaseline = zc6Var.f.getLineBaseline(0);
            }
            f = f3 + lineBaseline + 0.0f;
        }
        this.d = f;
        if (!arrayList.isEmpty()) {
            di4 di4Var = (di4) yo0.r0(arrayList);
            zc6 zc6Var2 = di4Var.a.d;
            int i = zc6Var2.g - 1;
            Paint.FontMetricsInt fontMetricsInt2 = zc6Var2.l;
            float f4 = zc6Var2.h;
            if (fontMetricsInt2 != null) {
                lineBaseline2 = zc6Var2.h(i) - fontMetricsInt2.ascent;
            } else {
                lineBaseline2 = zc6Var2.f.getLineBaseline(i);
            }
            f2 = f4 + lineBaseline2 + 0.0f + di4Var.f;
        }
        this.e = f2;
        this.f = o24Var.g;
    }

    public final c45 a(int i) {
        int x;
        o24 o24Var = this.b;
        o24Var.l(i);
        int length = ((ko) o24Var.a.x).y.length();
        ArrayList arrayList = o24Var.h;
        if (i == length) {
            x = arrayList.size() - 1;
        } else {
            x = q23.x(i, arrayList);
        }
        di4 di4Var = (di4) arrayList.get(x);
        if (di4Var.a.d.f.isRtlCharAt(di4Var.d(i))) {
            return c45.y;
        }
        return c45.x;
    }

    public final n05 b(int i) {
        boolean z;
        float j;
        float j2;
        float i2;
        float i3;
        o24 o24Var = this.b;
        o24Var.k(i);
        ArrayList arrayList = o24Var.h;
        di4 di4Var = (di4) arrayList.get(q23.x(i, arrayList));
        cd cdVar = di4Var.a;
        int d = di4Var.d(i);
        CharSequence charSequence = cdVar.e;
        if (d < 0 || d >= charSequence.length()) {
            fz2.a("offset(" + d + ") is out of bounds [0," + charSequence.length() + ")");
        }
        zc6 zc6Var = cdVar.d;
        int f = zc6Var.f(d);
        float h = zc6Var.h(f);
        float d2 = zc6Var.d(f);
        Layout layout = zc6Var.f;
        if (layout.getParagraphDirection(f) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean isRtlCharAt = layout.isRtlCharAt(d);
        if (z && !isRtlCharAt) {
            j = zc6Var.i(d, false);
            j2 = zc6Var.i(d + 1, true);
        } else {
            if (z && isRtlCharAt) {
                i2 = zc6Var.j(d, false);
                i3 = zc6Var.j(d + 1, true);
            } else if (isRtlCharAt) {
                i2 = zc6Var.i(d, false);
                i3 = zc6Var.i(d + 1, true);
            } else {
                j = zc6Var.j(d, false);
                j2 = zc6Var.j(d + 1, true);
            }
            float f2 = i2;
            j = i3;
            j2 = f2;
        }
        RectF rectF = new RectF(j, h, j2, d2);
        return di4Var.a(new n05(rectF.left, rectF.top + 0.0f, rectF.right, rectF.bottom + 0.0f));
    }

    public final n05 c(int i) {
        int x;
        o24 o24Var = this.b;
        o24Var.l(i);
        int length = ((ko) o24Var.a.x).y.length();
        ArrayList arrayList = o24Var.h;
        if (i == length) {
            x = arrayList.size() - 1;
        } else {
            x = q23.x(i, arrayList);
        }
        di4 di4Var = (di4) arrayList.get(x);
        cd cdVar = di4Var.a;
        int d = di4Var.d(i);
        CharSequence charSequence = cdVar.e;
        zc6 zc6Var = cdVar.d;
        if (d < 0 || d > charSequence.length()) {
            fz2.a("offset(" + d + ") is out of bounds [0," + charSequence.length() + "]");
        }
        float i2 = zc6Var.i(d, false);
        int f = zc6Var.f(d);
        return di4Var.a(new n05(i2, zc6Var.h(f) + 0.0f, i2, zc6Var.d(f) + 0.0f));
    }

    public final boolean d() {
        float f = (int) (this.c >> 32);
        o24 o24Var = this.b;
        if (f >= o24Var.d && !o24Var.c && ((int) (r1 & 4294967295L)) >= o24Var.e) {
            return false;
        }
        return true;
    }

    public final float e(int i, boolean z) {
        int x;
        o24 o24Var = this.b;
        o24Var.l(i);
        int length = ((ko) o24Var.a.x).y.length();
        ArrayList arrayList = o24Var.h;
        if (i == length) {
            x = arrayList.size() - 1;
        } else {
            x = q23.x(i, arrayList);
        }
        di4 di4Var = (di4) arrayList.get(x);
        cd cdVar = di4Var.a;
        int d = di4Var.d(i);
        zc6 zc6Var = cdVar.d;
        if (z) {
            return zc6Var.i(d, false);
        }
        return zc6Var.j(d, false);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bd6) {
                bd6 bd6Var = (bd6) obj;
                if (this.a.equals(bd6Var.a) && this.b == bd6Var.b && k13.a(this.c, bd6Var.c) && this.d == bd6Var.d && this.e == bd6Var.e && this.f.equals(bd6Var.f)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final float f(int i) {
        float f;
        o24 o24Var = this.b;
        o24Var.m(i);
        ArrayList arrayList = o24Var.h;
        di4 di4Var = (di4) arrayList.get(q23.y(i, arrayList));
        cd cdVar = di4Var.a;
        int i2 = i - di4Var.d;
        zc6 zc6Var = cdVar.d;
        float lineLeft = zc6Var.f.getLineLeft(i2);
        if (i2 == zc6Var.g - 1) {
            f = zc6Var.j;
        } else {
            f = 0.0f;
        }
        return lineLeft + f;
    }

    public final float g(int i) {
        float f;
        o24 o24Var = this.b;
        o24Var.m(i);
        ArrayList arrayList = o24Var.h;
        di4 di4Var = (di4) arrayList.get(q23.y(i, arrayList));
        cd cdVar = di4Var.a;
        int i2 = i - di4Var.d;
        zc6 zc6Var = cdVar.d;
        float lineRight = zc6Var.f.getLineRight(i2);
        if (i2 == zc6Var.g - 1) {
            f = zc6Var.k;
        } else {
            f = 0.0f;
        }
        return lineRight + f;
    }

    public final int h(int i) {
        o24 o24Var = this.b;
        o24Var.m(i);
        ArrayList arrayList = o24Var.h;
        di4 di4Var = (di4) arrayList.get(q23.y(i, arrayList));
        cd cdVar = di4Var.a;
        return cdVar.d.f.getLineStart(i - di4Var.d) + di4Var.b;
    }

    public final int hashCode() {
        return this.f.hashCode() + qx1.b(this.e, qx1.b(this.d, qx1.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31), 31);
    }

    public final c45 i(int i) {
        int x;
        o24 o24Var = this.b;
        o24Var.l(i);
        int length = ((ko) o24Var.a.x).y.length();
        ArrayList arrayList = o24Var.h;
        if (i == length) {
            x = arrayList.size() - 1;
        } else {
            x = q23.x(i, arrayList);
        }
        di4 di4Var = (di4) arrayList.get(x);
        cd cdVar = di4Var.a;
        int d = di4Var.d(i);
        zc6 zc6Var = cdVar.d;
        if (zc6Var.f.getParagraphDirection(zc6Var.f(d)) == 1) {
            return c45.x;
        }
        return c45.y;
    }

    public final id j(int i, int i2) {
        o24 o24Var = this.b;
        ko koVar = (ko) o24Var.a.x;
        if (i < 0 || i > i2 || i2 > koVar.y.length()) {
            int length = koVar.y.length();
            StringBuilder u = qx1.u("Start(", i, ") or End(", i2, ") is out of range [0..");
            u.append(length);
            u.append("), or start > end!");
            fz2.a(u.toString());
        }
        if (i == i2) {
            return kd.a();
        }
        id a = kd.a();
        q23.A(o24Var.h, fy5.a(i, i2), new by6(a, i, i2, (byte) 2));
        return a;
    }

    public final long k(int i) {
        int x;
        int i2;
        int i3;
        int n;
        o24 o24Var = this.b;
        o24Var.l(i);
        int length = ((ko) o24Var.a.x).y.length();
        ArrayList arrayList = o24Var.h;
        if (i == length) {
            x = arrayList.size() - 1;
        } else {
            x = q23.x(i, arrayList);
        }
        di4 di4Var = (di4) arrayList.get(x);
        cd cdVar = di4Var.a;
        int d = di4Var.d(i);
        wp k = cdVar.d.k();
        if (k.m(k.u(d))) {
            k.d(d);
            i2 = d;
            while (i2 != -1 && (!k.m(i2) || k.i(i2))) {
                i2 = k.u(i2);
            }
        } else {
            k.d(d);
            if (k.l(d)) {
                if (k.j(d) && !k.h(d)) {
                    i2 = d;
                } else {
                    i2 = k.u(d);
                }
            } else if (k.h(d)) {
                i2 = k.u(d);
            } else {
                i2 = -1;
            }
        }
        if (i2 == -1) {
            i2 = d;
        }
        if (k.i(k.n(d))) {
            k.d(d);
            i3 = d;
            while (i3 != -1 && (k.m(i3) || !k.i(i3))) {
                i3 = k.n(i3);
            }
        } else {
            k.d(d);
            if (k.h(d)) {
                if (k.j(d) && !k.l(d)) {
                    i3 = d;
                } else {
                    n = k.n(d);
                    i3 = n;
                }
            } else if (k.l(d)) {
                n = k.n(d);
                i3 = n;
            } else {
                i3 = -1;
            }
        }
        if (i3 != -1) {
            d = i3;
        }
        return di4Var.b(fy5.a(i2, d), false);
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.a + ", multiParagraph=" + this.b + ", size=" + k13.b(this.c) + ", firstBaseline=" + this.d + ", lastBaseline=" + this.e + ", placeholderRects=" + this.f + ")";
    }
}
