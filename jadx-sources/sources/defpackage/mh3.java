package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mh3 implements LineHeightSpan {
    public final boolean A;
    public final float B;
    public final int C;
    public int D = Integer.MIN_VALUE;
    public int E = Integer.MIN_VALUE;
    public int F = Integer.MIN_VALUE;
    public int G = Integer.MIN_VALUE;
    public int H;
    public int I;
    public final float x;
    public final int y;
    public final boolean z;

    public mh3(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.x = f;
        this.y = i;
        this.z = z;
        this.A = z2;
        this.B = f2;
        this.C = i2;
        if ((0.0f <= f2 && f2 <= 1.0f) || f2 == -1.0f) {
            return;
        }
        fz2.b("topRatio should be in [0..1] range or -1");
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        boolean z2;
        int i5;
        int i6;
        double ceil;
        int min;
        int max;
        int i7 = fontMetricsInt.descent;
        int i8 = fontMetricsInt.ascent;
        if (i7 - i8 > 0) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (i2 == this.y) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i9 = this.C;
            boolean z3 = this.A;
            boolean z4 = this.z;
            if (z && z2 && z4 && z3 && i9 != 2) {
                return;
            }
            if (this.D == Integer.MIN_VALUE) {
                int i10 = i7 - i8;
                int ceil2 = (int) Math.ceil(this.x);
                int i11 = ceil2 - i10;
                if (i9 == 1 && i11 <= 0) {
                    int i12 = fontMetricsInt.ascent;
                    this.E = i12;
                    int i13 = fontMetricsInt.descent;
                    this.F = i13;
                    this.D = i12;
                    this.G = i13;
                    this.H = 0;
                    this.I = 0;
                } else {
                    float f = this.B;
                    if (f == -1.0f) {
                        f = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                    }
                    if (i11 <= 0) {
                        ceil = Math.ceil(i11 * f);
                    } else {
                        ceil = Math.ceil((1.0f - f) * i11);
                    }
                    int i14 = (int) ceil;
                    int i15 = fontMetricsInt.descent;
                    int i16 = i14 + i15;
                    this.F = i16;
                    int i17 = i16 - ceil2;
                    this.E = i17;
                    if (i9 == 0 || i11 >= 0) {
                        if (z4) {
                            i17 = fontMetricsInt.ascent;
                        }
                        this.D = i17;
                        if (z3) {
                            i16 = i15;
                        }
                        this.G = i16;
                        this.H = fontMetricsInt.ascent - i17;
                        this.I = i16 - i15;
                    } else if (i9 == 2) {
                        int i18 = fontMetricsInt.ascent;
                        if (z4) {
                            min = Math.max(i18, i17);
                        } else {
                            min = Math.min(i18, i17);
                        }
                        this.D = min;
                        int i19 = fontMetricsInt.descent;
                        int i20 = this.F;
                        if (z3) {
                            max = Math.min(i19, i20);
                        } else {
                            max = Math.max(i19, i20);
                        }
                        this.G = max;
                        this.H = 0;
                        this.I = 0;
                    }
                }
            }
            if (z) {
                i5 = this.D;
            } else {
                i5 = this.E;
            }
            fontMetricsInt.ascent = i5;
            if (z2) {
                i6 = this.G;
            } else {
                i6 = this.F;
            }
            fontMetricsInt.descent = i6;
        }
    }
}
