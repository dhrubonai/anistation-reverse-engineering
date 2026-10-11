package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import q.e;
import q.h;
import s.q;
import s.r;

/* loaded from: classes.dex */
public class Flow extends r {

    /* renamed from: z, reason: collision with root package name */
    public h f760z;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // s.r, s.b
    public final void e(AttributeSet attributeSet) {
        super.e(attributeSet);
        this.f760z = new h();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f9715b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f760z.I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    h hVar = this.f760z;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar.f8879f0 = dimensionPixelSize;
                    hVar.f8880g0 = dimensionPixelSize;
                    hVar.f8881h0 = dimensionPixelSize;
                    hVar.f8882i0 = dimensionPixelSize;
                } else if (index == 11) {
                    h hVar2 = this.f760z;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar2.f8881h0 = dimensionPixelSize2;
                    hVar2.f8883j0 = dimensionPixelSize2;
                    hVar2.f8884k0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f760z.f8882i0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f760z.f8883j0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f760z.f8879f0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f760z.f8884k0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f760z.f8880g0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f760z.G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f760z.f8890q0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f760z.f8891r0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f760z.f8892s0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f760z.f8894u0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f760z.f8893t0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f760z.f8895v0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f760z.f8896w0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f760z.f8898y0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f760z.A0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f760z.f8899z0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f760z.B0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f760z.f8897x0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f760z.E0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f760z.F0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f760z.C0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f760z.D0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f760z.H0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f9592d = this.f760z;
        g();
    }

    @Override // s.b
    public final void f(e eVar, boolean z9) {
        h hVar = this.f760z;
        int i10 = hVar.f8881h0;
        if (i10 > 0 || hVar.f8882i0 > 0) {
            if (z9) {
                hVar.f8883j0 = hVar.f8882i0;
                hVar.f8884k0 = i10;
            } else {
                hVar.f8883j0 = i10;
                hVar.f8884k0 = hVar.f8882i0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x061f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0621  */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x02ac -> B:118:0x02be). Please report as a decompilation issue!!! */
    @Override // s.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(q.h r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.h(q.h, int, int):void");
    }

    @Override // s.b, android.view.View
    public final void onMeasure(int i10, int i11) {
        h(this.f760z, i10, i11);
    }

    public void setFirstHorizontalBias(float f10) {
        this.f760z.f8898y0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f760z.f8892s0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f760z.f8899z0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f760z.f8893t0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f760z.E0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f760z.f8896w0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f760z.C0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f760z.f8890q0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f760z.H0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f760z.I0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        h hVar = this.f760z;
        hVar.f8879f0 = i10;
        hVar.f8880g0 = i10;
        hVar.f8881h0 = i10;
        hVar.f8882i0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f760z.f8880g0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f760z.f8883j0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f760z.f8884k0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f760z.f8879f0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f760z.F0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f760z.f8897x0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f760z.D0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f760z.f8891r0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f760z.G0 = i10;
        requestLayout();
    }
}
