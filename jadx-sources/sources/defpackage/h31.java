package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h31 {
    public final gi6 a;
    public final dd6 b;
    public final rt3 c;
    public final v11 d;
    public bx5 e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final CursorAnchorInfo.Builder j = new CursorAnchorInfo.Builder();
    public final float[] k = jo3.a();
    public final Matrix l = new Matrix();

    public h31(gi6 gi6Var, dd6 dd6Var, rt3 rt3Var, v11 v11Var) {
        this.a = gi6Var;
        this.b = dd6Var;
        this.c = rt3Var;
        this.d = v11Var;
    }

    public final CursorAnchorInfo a() {
        ha3 ha3Var;
        ha3 b;
        bd6 c;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        dd6 dd6Var = this.b;
        ha3 e = dd6Var.e();
        if (e != null) {
            if (!e.m()) {
                e = null;
            }
            if (e != null && (ha3Var = (ha3) dd6Var.d.getValue()) != null) {
                if (!ha3Var.m()) {
                    ha3Var = null;
                }
                if (ha3Var != null && (b = dd6Var.b()) != null) {
                    if (!b.m()) {
                        b = null;
                    }
                    if (b != null && (c = dd6Var.c()) != null) {
                        p96 d = this.a.d();
                        float[] fArr = this.k;
                        jo3.d(fArr);
                        e.h(fArr);
                        Matrix matrix = this.l;
                        wk6.E(matrix, fArr);
                        n05 k = sw0.O(ha3Var).k(e.B(ha3Var, 0L));
                        n05 k2 = sw0.O(b).k(e.B(b, 0L));
                        long j = d.B;
                        nd6 nd6Var = d.C;
                        boolean z2 = this.f;
                        boolean z3 = this.g;
                        boolean z4 = this.h;
                        boolean z5 = this.i;
                        CursorAnchorInfo.Builder builder = this.j;
                        builder.reset();
                        builder.setMatrix(matrix);
                        int g = nd6.g(j);
                        builder.setSelectionRange(g, nd6.f(j));
                        c45 c45Var = c45.y;
                        if (z2 && g >= 0) {
                            n05 c2 = c.c(g);
                            float B = db.B(c2.a, 0.0f, (int) (c.c >> 32));
                            boolean s = q23.s(k, B, c2.b);
                            boolean s2 = q23.s(k, B, c2.d);
                            if (c.a(g) == c45Var) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!s && !s2) {
                                i6 = 0;
                            } else {
                                i6 = 1;
                            }
                            if (!s || !s2) {
                                i6 |= 2;
                            }
                            if (z) {
                                i6 |= 4;
                            }
                            int i7 = i6;
                            float f = c2.b;
                            float f2 = c2.d;
                            builder.setInsertionMarkerLocation(B, f, f2, f2, i7);
                        }
                        if (z3) {
                            int i8 = -1;
                            if (nd6Var != null) {
                                i = nd6.g(nd6Var.a);
                            } else {
                                i = -1;
                            }
                            if (nd6Var != null) {
                                i8 = nd6.f(nd6Var.a);
                            }
                            if (i >= 0 && i < i8) {
                                builder.setComposingText(i, d.A.subSequence(i, i8));
                                float[] fArr2 = new float[(i8 - i) * 4];
                                c.b.a(fy5.a(i, i8), fArr2);
                                int i9 = i;
                                while (i9 < i8) {
                                    int i10 = (i9 - i) * 4;
                                    float f3 = fArr2[i10];
                                    float f4 = fArr2[i10 + 1];
                                    float f5 = fArr2[i10 + 2];
                                    float f6 = fArr2[i10 + 3];
                                    if (k.a < f5) {
                                        i2 = 1;
                                    } else {
                                        i2 = 0;
                                    }
                                    int i11 = i8;
                                    if (f3 < k.c) {
                                        i3 = 1;
                                    } else {
                                        i3 = 0;
                                    }
                                    int i12 = i3 & i2;
                                    if (k.b < f6) {
                                        i4 = 1;
                                    } else {
                                        i4 = 0;
                                    }
                                    int i13 = i12 & i4;
                                    if (f4 < k.d) {
                                        i5 = 1;
                                    } else {
                                        i5 = 0;
                                    }
                                    int i14 = i13 & i5;
                                    if (!q23.s(k, f3, f4) || !q23.s(k, f5, f6)) {
                                        i14 |= 2;
                                    }
                                    if (c.a(i9) == c45Var) {
                                        i14 |= 4;
                                    }
                                    builder.addCharacterBounds(i9, f3, f4, f5, f6, i14);
                                    i9++;
                                    i8 = i11;
                                }
                            }
                        }
                        int i15 = Build.VERSION.SDK_INT;
                        if (i15 >= 33 && z4) {
                            d4.i(builder, k2);
                        }
                        if (i15 >= 34 && z5) {
                            kb0.h(builder, c, k);
                        }
                        return builder.build();
                    }
                }
            }
        }
        return null;
    }
}
