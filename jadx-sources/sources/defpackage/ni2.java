package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ni2 extends sq6 {
    public float[] b;
    public final ArrayList c = new ArrayList();
    public boolean d = true;
    public long e = ep0.i;
    public List f;
    public boolean g;
    public id h;
    public ub2 i;
    public final lz0 j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;

    public ni2() {
        int i = gr6.a;
        this.f = nt1.x;
        this.g = true;
        this.j = new lz0(this, (byte) 11);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }

    @Override // defpackage.sq6
    public final void a(bp1 bp1Var) {
        if (this.s) {
            float[] fArr = this.b;
            if (fArr == null) {
                fArr = jo3.a();
                this.b = fArr;
            } else {
                jo3.d(fArr);
            }
            jo3.f(fArr, this.q + this.m, this.r + this.n);
            float f = this.l;
            if (fArr.length >= 16) {
                double d = f * 0.017453292519943295d;
                float sin = (float) Math.sin(d);
                float cos = (float) Math.cos(d);
                float f2 = fArr[0];
                float f3 = fArr[4];
                float f4 = (sin * f3) + (cos * f2);
                float f5 = -sin;
                float f6 = (f3 * cos) + (f2 * f5);
                float f7 = fArr[1];
                float f8 = fArr[5];
                float f9 = (sin * f8) + (cos * f7);
                float f10 = (f8 * cos) + (f7 * f5);
                float f11 = fArr[2];
                float f12 = fArr[6];
                float f13 = (sin * f12) + (cos * f11);
                float f14 = (f12 * cos) + (f11 * f5);
                float f15 = fArr[3];
                float f16 = fArr[7];
                fArr[0] = f4;
                fArr[1] = f9;
                fArr[2] = f13;
                fArr[3] = (sin * f16) + (cos * f15);
                fArr[4] = f6;
                fArr[5] = f10;
                fArr[6] = f14;
                fArr[7] = (cos * f16) + (f5 * f15);
            }
            float f17 = this.o;
            float f18 = this.p;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f17;
                fArr[1] = fArr[1] * f17;
                fArr[2] = fArr[2] * f17;
                fArr[3] = fArr[3] * f17;
                fArr[4] = fArr[4] * f18;
                fArr[5] = fArr[5] * f18;
                fArr[6] = fArr[6] * f18;
                fArr[7] = fArr[7] * f18;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            jo3.f(fArr, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!this.f.isEmpty()) {
                id idVar = this.h;
                if (idVar == null) {
                    idVar = kd.a();
                    this.h = idVar;
                }
                x97.U(this.f, idVar);
            }
            this.g = false;
        }
        dn0 n0 = bp1Var.n0();
        long B = n0.B();
        n0.y().h();
        try {
            dn0 dn0Var = (dn0) ((af2) n0.y).y;
            float[] fArr2 = this.b;
            if (fArr2 != null) {
                dn0Var.y().l(fArr2);
            }
            id idVar2 = this.h;
            if (!this.f.isEmpty() && idVar2 != null) {
                dn0Var.y().m(idVar2);
            }
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((sq6) arrayList.get(i)).a(bp1Var);
            }
        } finally {
            h11.u(n0, B);
        }
    }

    @Override // defpackage.sq6
    public final ub2 b() {
        return this.i;
    }

    @Override // defpackage.sq6
    public final void d(lz0 lz0Var) {
        this.i = lz0Var;
    }

    public final void e(int i, sq6 sq6Var) {
        ArrayList arrayList = this.c;
        if (i < arrayList.size()) {
            arrayList.set(i, sq6Var);
        } else {
            arrayList.add(sq6Var);
        }
        g(sq6Var);
        sq6Var.d(this.j);
        c();
    }

    public final void f(long j) {
        if (this.d && j != 16) {
            long j2 = this.e;
            if (j2 == 16) {
                this.e = j;
                return;
            }
            int i = gr6.a;
            if (ep0.g(j2) != ep0.g(j) || ep0.f(j2) != ep0.f(j) || ep0.d(j2) != ep0.d(j)) {
                this.d = false;
                this.e = ep0.i;
            }
        }
    }

    public final void g(sq6 sq6Var) {
        if (sq6Var instanceof rj4) {
            rj4 rj4Var = (rj4) sq6Var;
            ka0 ka0Var = rj4Var.b;
            if (this.d && ka0Var != null) {
                if (ka0Var instanceof su5) {
                    f(((su5) ka0Var).a);
                } else {
                    this.d = false;
                    this.e = ep0.i;
                }
            }
            ka0 ka0Var2 = rj4Var.g;
            if (this.d && ka0Var2 != null) {
                if (ka0Var2 instanceof su5) {
                    f(((su5) ka0Var2).a);
                    return;
                } else {
                    this.d = false;
                    this.e = ep0.i;
                    return;
                }
            }
            return;
        }
        if (sq6Var instanceof ni2) {
            ni2 ni2Var = (ni2) sq6Var;
            if (ni2Var.d && this.d) {
                f(ni2Var.e);
            } else {
                this.d = false;
                this.e = ep0.i;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sq6 sq6Var = (sq6) arrayList.get(i);
            sb.append("\t");
            sb.append(sq6Var.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
