package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fr6 extends hr6 implements Iterable, j73 {
    public final float A;
    public final float B;
    public final float C;
    public final float D;
    public final float E;
    public final List F;
    public final ArrayList G;
    public final String x;
    public final float y;
    public final float z;

    public fr6(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, ArrayList arrayList) {
        this.x = str;
        this.y = f;
        this.z = f2;
        this.A = f3;
        this.B = f4;
        this.C = f5;
        this.D = f6;
        this.E = f7;
        this.F = list;
        this.G = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof fr6)) {
                fr6 fr6Var = (fr6) obj;
                if (a34.i(this.x, fr6Var.x) && this.y == fr6Var.y && this.z == fr6Var.z && this.A == fr6Var.A && this.B == fr6Var.B && this.C == fr6Var.C && this.D == fr6Var.D && this.E == fr6Var.E && a34.i(this.F, fr6Var.F) && this.G.equals(fr6Var.G)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.G.hashCode() + zo5.j(this.F, qx1.b(this.E, qx1.b(this.D, qx1.b(this.C, qx1.b(this.B, qx1.b(this.A, qx1.b(this.z, qx1.b(this.y, this.x.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new gl4(this);
    }
}
