package m3;

import android.view.View;

/* loaded from: classes.dex */
public final class x extends e1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7420d;

    /* renamed from: e, reason: collision with root package name */
    public y f7421e;

    /* renamed from: f, reason: collision with root package name */
    public y f7422f;

    public /* synthetic */ x(int i10) {
        this.f7420d = i10;
    }

    @Override // m3.e1
    public final int[] b(k0 k0Var, View view) {
        switch (this.f7420d) {
            case 0:
                int[] iArr = new int[2];
                if (k0Var.d()) {
                    iArr[0] = e(view, h(k0Var));
                } else {
                    iArr[0] = 0;
                }
                if (k0Var.e()) {
                    iArr[1] = e(view, i(k0Var));
                } else {
                    iArr[1] = 0;
                }
                return iArr;
            default:
                int[] iArr2 = new int[2];
                if (k0Var.d()) {
                    iArr2[0] = e(view, h(k0Var));
                } else {
                    iArr2[0] = 0;
                }
                if (k0Var.e()) {
                    iArr2[1] = e(view, i(k0Var));
                } else {
                    iArr2[1] = 0;
                }
                return iArr2;
        }
    }

    @Override // m3.e1
    public final View c(k0 k0Var) {
        switch (this.f7420d) {
            case 0:
                if (k0Var.e()) {
                    return g(k0Var, i(k0Var));
                }
                if (!k0Var.d()) {
                    return null;
                }
                return g(k0Var, h(k0Var));
            default:
                if (k0Var.e()) {
                    return g(k0Var, i(k0Var));
                }
                if (!k0Var.d()) {
                    return null;
                }
                return g(k0Var, h(k0Var));
        }
    }

    public final int e(View view, y yVar) {
        int c6;
        int h10;
        int i10;
        switch (this.f7420d) {
            case 0:
                c6 = (yVar.c(view) / 2) + yVar.d(view);
                h10 = yVar.h();
                i10 = yVar.i() / 2;
                break;
            default:
                c6 = (yVar.c(view) / 2) + yVar.d(view);
                h10 = yVar.h();
                i10 = yVar.i() / 2;
                break;
        }
        return c6 - (i10 + h10);
    }

    public final int f(k0 k0Var, y yVar, int i10, int i11) {
        int i12;
        this.f7203b.fling(0, 0, i10, i11, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, Integer.MIN_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
        int[] iArr = {this.f7203b.getFinalX(), this.f7203b.getFinalY()};
        int v9 = k0Var.v();
        float f10 = 1.0f;
        if (v9 != 0) {
            View view = null;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i15 = 0; i15 < v9; i15++) {
                View u9 = k0Var.u(i15);
                int F = k0.F(u9);
                if (F != -1) {
                    if (F < i14) {
                        view = u9;
                        i14 = F;
                    }
                    if (F > i13) {
                        view2 = u9;
                        i13 = F;
                    }
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(yVar.b(view), yVar.b(view2)) - Math.min(yVar.d(view), yVar.d(view2));
                if (max != 0) {
                    f10 = (max * 1.0f) / ((i13 - i14) + 1);
                }
            }
        }
        if (f10 <= 0.0f) {
            return 0;
        }
        if (Math.abs(iArr[0]) > Math.abs(iArr[1])) {
            i12 = iArr[0];
        } else {
            i12 = iArr[1];
        }
        return Math.round(i12 / f10);
    }

    public final View g(k0 k0Var, y yVar) {
        int i10 = this.f7420d;
        int i11 = 0;
        int i12 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        View view = null;
        switch (i10) {
            case 0:
                int v9 = k0Var.v();
                if (v9 != 0) {
                    int i13 = (yVar.i() / 2) + yVar.h();
                    while (i11 < v9) {
                        View u9 = k0Var.u(i11);
                        int abs = Math.abs(((yVar.c(u9) / 2) + yVar.d(u9)) - i13);
                        if (abs < i12) {
                            view = u9;
                            i12 = abs;
                        }
                        i11++;
                    }
                }
                return view;
            default:
                int v10 = k0Var.v();
                if (v10 != 0) {
                    int i14 = (yVar.i() / 2) + yVar.h();
                    while (i11 < v10) {
                        View u10 = k0Var.u(i11);
                        int abs2 = Math.abs(((yVar.c(u10) / 2) + yVar.d(u10)) - i14);
                        if (abs2 < i12) {
                            view = u10;
                            i12 = abs2;
                        }
                        i11++;
                    }
                }
                return view;
        }
    }

    public final y h(k0 k0Var) {
        switch (this.f7420d) {
            case 0:
                y yVar = this.f7422f;
                if (yVar == null || yVar.f7424a != k0Var) {
                    this.f7422f = new y(k0Var, 0);
                }
                return this.f7422f;
            default:
                y yVar2 = this.f7422f;
                if (yVar2 == null || yVar2.f7424a != k0Var) {
                    this.f7422f = new y(k0Var, 0);
                }
                return this.f7422f;
        }
    }

    public final y i(k0 k0Var) {
        switch (this.f7420d) {
            case 0:
                y yVar = this.f7421e;
                if (yVar == null || yVar.f7424a != k0Var) {
                    this.f7421e = new y(k0Var, 1);
                }
                return this.f7421e;
            default:
                y yVar2 = this.f7421e;
                if (yVar2 == null || yVar2.f7424a != k0Var) {
                    this.f7421e = new y(k0Var, 1);
                }
                return this.f7421e;
        }
    }
}
