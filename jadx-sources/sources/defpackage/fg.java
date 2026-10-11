package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fg extends po0 {
    public final /* synthetic */ ViewGroup A;
    public final /* synthetic */ byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fg(ViewGroup viewGroup, byte b) {
        super(1);
        this.z = b;
        this.A = viewGroup;
    }

    @Override // defpackage.po0
    public final v57 f(v57 v57Var, List list) {
        byte b = this.z;
        ViewGroup viewGroup = this.A;
        switch (b) {
            case 0:
                return ((sv6) viewGroup).k(v57Var);
            default:
                dg1 dg1Var = (dg1) viewGroup;
                if (!dg1Var.J) {
                    View childAt = dg1Var.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, dg1Var.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, dg1Var.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        return v57Var.a.r(max, max2, max3, max4);
                    }
                    return v57Var;
                }
                return v57Var;
        }
    }

    @Override // defpackage.po0
    public final l33 g(c57 c57Var, l33 l33Var) {
        byte b = this.z;
        ViewGroup viewGroup = this.A;
        int i = 0;
        switch (b) {
            case 0:
                kz2 kz2Var = (kz2) ((sv6) viewGroup).W.c0.A;
                if (kz2Var.z0.K) {
                    long R = w65.R(kz2Var.J(0L));
                    int i2 = (int) (R >> 32);
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    int i3 = (int) (R & 4294967295L);
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    long j = te4.B(kz2Var).j();
                    int i4 = (int) (j >> 32);
                    int i5 = (int) (j & 4294967295L);
                    long j2 = kz2Var.z;
                    long R2 = w65.R(kz2Var.J((Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L)));
                    int i6 = i4 - ((int) (R2 >> 32));
                    if (i6 < 0) {
                        i6 = 0;
                    }
                    int i7 = i5 - ((int) (R2 & 4294967295L));
                    if (i7 >= 0) {
                        i = i7;
                    }
                    if (i2 != 0 || i3 != 0 || i6 != 0 || i != 0) {
                        return new l33(jg.j((yz2) l33Var.y, i2, i3, i6, i), jg.j((yz2) l33Var.z, i2, i3, i6, i), (byte) 25);
                    }
                    return l33Var;
                }
                return l33Var;
            default:
                dg1 dg1Var = (dg1) viewGroup;
                if (!dg1Var.J) {
                    View childAt = dg1Var.getChildAt(0);
                    int max = Math.max(0, childAt.getLeft());
                    int max2 = Math.max(0, childAt.getTop());
                    int max3 = Math.max(0, dg1Var.getWidth() - childAt.getRight());
                    int max4 = Math.max(0, dg1Var.getHeight() - childAt.getBottom());
                    if (max != 0 || max2 != 0 || max3 != 0 || max4 != 0) {
                        yz2 b2 = yz2.b(max, max2, max3, max4);
                        int i8 = b2.a;
                        yz2 yz2Var = (yz2) l33Var.y;
                        int i9 = b2.b;
                        int i10 = b2.c;
                        int i11 = b2.d;
                        return new l33(v57.a(yz2Var, i8, i9, i10, i11), v57.a((yz2) l33Var.z, i8, i9, i10, i11), (byte) 25);
                    }
                    return l33Var;
                }
                return l33Var;
        }
    }
}
