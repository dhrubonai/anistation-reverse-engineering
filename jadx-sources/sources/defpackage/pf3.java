package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pf3 {
    public final zj1 a;
    public final pz2 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public mc6 j;
    public bd6 k;
    public h12 l;
    public n05 m;
    public n05 n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = jo3.a();
    public final Matrix q = new Matrix();

    public pf3(zj1 zj1Var, pz2 pz2Var) {
        this.a = zj1Var;
        this.b = pz2Var;
    }

    public final void a() {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z3;
        int i6;
        pz2 pz2Var = this.b;
        InputMethodManager u = pz2Var.u();
        View view = (View) pz2Var.y;
        if (u.isActive(view) && this.j != null && this.l != null && this.k != null && this.m != null && this.n != null) {
            float[] fArr = this.p;
            jo3.d(fArr);
            ha3 ha3Var = (ha3) ((nf3) this.a.y).O.getValue();
            if (ha3Var != null) {
                if (!ha3Var.m()) {
                    ha3Var = null;
                }
                if (ha3Var != null) {
                    ha3Var.h(fArr);
                }
            }
            n05 n05Var = this.n;
            n05Var.getClass();
            float f = -n05Var.a;
            n05 n05Var2 = this.n;
            n05Var2.getClass();
            jo3.f(fArr, f, -n05Var2.b);
            Matrix matrix = this.q;
            wk6.E(matrix, fArr);
            mc6 mc6Var = this.j;
            mc6Var.getClass();
            long j = mc6Var.b;
            h12 h12Var = this.l;
            h12Var.getClass();
            bd6 bd6Var = this.k;
            bd6Var.getClass();
            n05 n05Var3 = this.m;
            n05Var3.getClass();
            n05 n05Var4 = this.n;
            n05Var4.getClass();
            boolean z4 = this.f;
            boolean z5 = this.g;
            boolean z6 = this.h;
            boolean z7 = this.i;
            CursorAnchorInfo.Builder builder = this.o;
            builder.reset();
            builder.setMatrix(matrix);
            nd6 nd6Var = mc6Var.c;
            int g = nd6.g(j);
            builder.setSelectionRange(g, nd6.f(j));
            c45 c45Var = c45.y;
            if (z4 && g >= 0) {
                h12Var.b(g);
                n05 c = bd6Var.c(g);
                z = z5;
                z2 = z6;
                float B = db.B(c.a, 0.0f, (int) (bd6Var.c >> 32));
                boolean s = q23.s(n05Var3, B, c.b);
                boolean s2 = q23.s(n05Var3, B, c.d);
                if (bd6Var.a(g) == c45Var) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!s && !s2) {
                    i6 = 0;
                } else {
                    i6 = 1;
                }
                if (!s || !s2) {
                    i6 |= 2;
                }
                if (z3) {
                    i6 |= 4;
                }
                float f2 = c.b;
                float f3 = c.d;
                builder.setInsertionMarkerLocation(B, f2, f3, f3, i6);
            } else {
                z = z5;
                z2 = z6;
            }
            if (z) {
                int i7 = -1;
                if (nd6Var != null) {
                    i = nd6.g(nd6Var.a);
                } else {
                    i = -1;
                }
                if (nd6Var != null) {
                    i7 = nd6.f(nd6Var.a);
                }
                if (i >= 0 && i < i7) {
                    builder.setComposingText(i, mc6Var.a.y.subSequence(i, i7));
                    h12Var.b(i);
                    h12Var.b(i7);
                    float[] fArr2 = new float[(i7 - i) * 4];
                    bd6Var.b.a(fy5.a(i, i7), fArr2);
                    int i8 = i;
                    while (i8 < i7) {
                        h12Var.b(i8);
                        int i9 = (i8 - i) * 4;
                        float f4 = fArr2[i9];
                        float f5 = fArr2[i9 + 1];
                        int i10 = i7;
                        float f6 = fArr2[i9 + 2];
                        float f7 = fArr2[i9 + 3];
                        float[] fArr3 = fArr2;
                        if (n05Var3.a < f6) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        if (f4 < n05Var3.c) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        int i11 = i2 & i3;
                        if (n05Var3.b < f7) {
                            i4 = 1;
                        } else {
                            i4 = 0;
                        }
                        int i12 = i11 & i4;
                        if (f5 < n05Var3.d) {
                            i5 = 1;
                        } else {
                            i5 = 0;
                        }
                        int i13 = i12 & i5;
                        if (!q23.s(n05Var3, f4, f5) || !q23.s(n05Var3, f6, f7)) {
                            i13 |= 2;
                        }
                        if (bd6Var.a(i8) == c45Var) {
                            i13 |= 4;
                        }
                        int i14 = i8;
                        builder.addCharacterBounds(i14, f4, f5, f6, f7, i13);
                        i8 = i14 + 1;
                        i7 = i10;
                        fArr2 = fArr3;
                    }
                }
            }
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 33 && z2) {
                d4.i(builder, n05Var4);
            }
            if (i15 >= 34 && z7) {
                kb0.h(builder, bd6Var, n05Var3);
            }
            pz2Var.u().updateCursorAnchorInfo(view, builder.build());
            this.e = false;
        }
    }
}
