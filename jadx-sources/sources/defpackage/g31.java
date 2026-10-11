package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g31 {
    public final oa a;
    public final dn0 b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public mc6 j;
    public bd6 k;
    public h12 l;
    public n05 n;
    public n05 o;
    public final Object c = new Object();
    public ub2 m = xd.B;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = jo3.a();
    public final Matrix r = new Matrix();

    public g31(oa oaVar, dn0 dn0Var) {
        this.a = oaVar;
        this.b = dn0Var;
    }

    public final void a() {
        View view;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        dn0 dn0Var = this.b;
        rb3 rb3Var = (rb3) dn0Var.z;
        InputMethodManager inputMethodManager = (InputMethodManager) rb3Var.getValue();
        View view2 = (View) dn0Var.y;
        if (!inputMethodManager.isActive(view2)) {
            return;
        }
        ub2 ub2Var = this.m;
        float[] fArr = this.q;
        ub2Var.invoke(new jo3(fArr));
        this.a.o(fArr);
        Matrix matrix = this.r;
        wk6.E(matrix, fArr);
        mc6 mc6Var = this.j;
        mc6Var.getClass();
        long j = mc6Var.b;
        h12 h12Var = this.l;
        h12Var.getClass();
        bd6 bd6Var = this.k;
        bd6Var.getClass();
        o24 o24Var = bd6Var.b;
        n05 n05Var = this.n;
        n05Var.getClass();
        float f = n05Var.d;
        float f2 = n05Var.b;
        n05 n05Var2 = this.o;
        n05Var2.getClass();
        boolean z2 = this.f;
        boolean z3 = this.g;
        boolean z4 = this.h;
        boolean z5 = this.i;
        CursorAnchorInfo.Builder builder = this.p;
        builder.reset();
        builder.setMatrix(matrix);
        nd6 nd6Var = mc6Var.c;
        int g = nd6.g(j);
        builder.setSelectionRange(g, nd6.f(j));
        c45 c45Var = c45.y;
        if (z2 && g >= 0) {
            h12Var.b(g);
            n05 c = bd6Var.c(g);
            view = view2;
            float B = db.B(c.a, 0.0f, (int) (bd6Var.c >> 32));
            boolean j2 = sw0.j(n05Var, B, c.b);
            boolean j3 = sw0.j(n05Var, B, c.d);
            if (bd6Var.a(g) == c45Var) {
                z = true;
            } else {
                z = false;
            }
            if (!j2 && !j3) {
                i6 = 0;
            } else {
                i6 = 1;
            }
            if (!j2 || !j3) {
                i6 |= 2;
            }
            if (z) {
                i6 |= 4;
            }
            float f3 = c.b;
            float f4 = c.d;
            builder.setInsertionMarkerLocation(B, f3, f4, f4, i6);
        } else {
            view = view2;
        }
        CursorAnchorInfo.Builder builder2 = builder;
        if (z3) {
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
                builder2.setComposingText(i, mc6Var.a.y.subSequence(i, i7));
                h12Var.b(i);
                h12Var.b(i7);
                float[] fArr2 = new float[(i7 - i) * 4];
                o24Var.a(fy5.a(i, i7), fArr2);
                int i8 = i;
                while (i8 < i7) {
                    h12Var.b(i8);
                    int i9 = (i8 - i) * 4;
                    float f5 = fArr2[i9];
                    float f6 = fArr2[i9 + 1];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f7 = fArr2[i9 + 2];
                    float f8 = fArr2[i9 + 3];
                    int i10 = i7;
                    if (n05Var.a < f7) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if (f5 < n05Var.c) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    int i11 = i2 & i3;
                    if (f2 < f8) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    int i12 = i11 & i4;
                    if (f6 < f) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    int i13 = i12 & i5;
                    if (!sw0.j(n05Var, f5, f6) || !sw0.j(n05Var, f7, f8)) {
                        i13 |= 2;
                    }
                    if (bd6Var.a(i8) == c45Var) {
                        i13 |= 4;
                    }
                    int i14 = i8;
                    builder3.addCharacterBounds(i14, f5, f6, f7, f8, i13);
                    builder2 = builder3;
                    i8 = i14 + 1;
                    i7 = i10;
                }
            }
        }
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 33 && z4) {
            d4.h(builder2, n05Var2);
        }
        if (i15 >= 34 && z5 && !n05Var.h()) {
            int i16 = o24Var.f - 1;
            if (i16 < 0) {
                i16 = 0;
            }
            int C = db.C(o24Var.e(f2), 0, i16);
            int C2 = db.C(o24Var.e(f), 0, i16);
            if (C <= C2) {
                while (true) {
                    builder2.addVisibleLineBounds(bd6Var.f(C), o24Var.f(C), bd6Var.g(C), o24Var.b(C));
                    if (C == C2) {
                        break;
                    } else {
                        C++;
                    }
                }
            }
        }
        ((InputMethodManager) rb3Var.getValue()).updateCursorAnchorInfo(view, builder2.build());
        this.e = false;
    }
}
