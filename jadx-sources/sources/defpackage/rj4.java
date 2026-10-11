package defpackage;

import android.graphics.Path;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rj4 extends sq6 {
    public ka0 b;
    public float c = 1.0f;
    public List d;
    public float e;
    public float f;
    public ka0 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public d06 q;
    public final id r;
    public id s;
    public id t;
    public final rb3 u;

    public rj4() {
        int i = gr6.a;
        this.d = nt1.x;
        this.e = 1.0f;
        this.h = 0;
        this.i = 0;
        this.j = 4.0f;
        this.l = 1.0f;
        this.n = true;
        this.o = true;
        id a = kd.a();
        this.r = a;
        this.s = a;
        this.u = bx7.B(jf3.z, new qa4((byte) 6));
    }

    @Override // defpackage.sq6
    public final void a(bp1 bp1Var) {
        bp1 bp1Var2;
        d06 d06Var;
        if (this.n) {
            x97.U(this.d, this.r);
            e();
        } else if (this.p) {
            e();
        }
        this.n = false;
        this.p = false;
        ka0 ka0Var = this.b;
        if (ka0Var != null) {
            bp1Var2 = bp1Var;
            bp1.e0(bp1Var2, this.s, ka0Var, this.c, null, 56);
        } else {
            bp1Var2 = bp1Var;
        }
        ka0 ka0Var2 = this.g;
        if (ka0Var2 != null) {
            d06 d06Var2 = this.q;
            if (!this.o && d06Var2 != null) {
                d06Var = d06Var2;
            } else {
                d06 d06Var3 = new d06(this.f, this.j, this.h, this.i, 16);
                this.q = d06Var3;
                this.o = false;
                d06Var = d06Var3;
            }
            bp1.e0(bp1Var2, this.s, ka0Var2, this.e, d06Var, 48);
        }
    }

    public final void e() {
        int i;
        float f = this.k;
        id idVar = this.r;
        if (f == 0.0f && this.l == 1.0f) {
            this.s = idVar;
            return;
        }
        id idVar2 = this.s;
        if (idVar2 != idVar) {
            if (idVar2.a.getFillType() == Path.FillType.EVEN_ODD) {
                i = 1;
            } else {
                i = 0;
            }
            this.s.a.rewind();
            this.s.f(i);
        } else {
            this.s = kd.a();
        }
        rb3 rb3Var = this.u;
        ((jd) rb3Var.getValue()).a.setPath(idVar.a, false);
        float length = ((jd) rb3Var.getValue()).a.getLength();
        float f2 = this.k;
        float f3 = this.m;
        float f4 = ((f2 + f3) % 1.0f) * length;
        float f5 = ((this.l + f3) % 1.0f) * length;
        if (f4 > f5) {
            id idVar3 = this.t;
            if (idVar3 == null) {
                idVar3 = kd.a();
                this.t = idVar3;
            }
            idVar3.e();
            ((jd) rb3Var.getValue()).a(f4, length, idVar3);
            id.a(this.s, idVar3);
            idVar3.e();
            ((jd) rb3Var.getValue()).a(0.0f, f5, idVar3);
            id.a(this.s, idVar3);
            return;
        }
        ((jd) rb3Var.getValue()).a(f4, f5, this.s);
    }

    public final String toString() {
        return this.r.toString();
    }
}
