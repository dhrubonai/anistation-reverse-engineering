package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class xm3 extends zm3 implements Iterator, j73 {
    public final /* synthetic */ byte B;

    public xm3(an3 an3Var, byte b) {
        this.B = b;
        this.A = an3Var;
        this.y = -1;
        this.z = an3Var.E;
        c();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.B) {
            case 0:
                b();
                int i = this.x;
                an3 an3Var = (an3) this.A;
                if (i < an3Var.C) {
                    this.x = i + 1;
                    this.y = i;
                    ym3 ym3Var = new ym3(an3Var, i);
                    c();
                    return ym3Var;
                }
                qi2.e();
                return null;
            case 1:
                b();
                int i2 = this.x;
                an3 an3Var2 = (an3) this.A;
                if (i2 < an3Var2.C) {
                    this.x = i2 + 1;
                    this.y = i2;
                    Object obj = an3Var2.x[i2];
                    c();
                    return obj;
                }
                qi2.e();
                return null;
            default:
                b();
                int i3 = this.x;
                an3 an3Var3 = (an3) this.A;
                if (i3 < an3Var3.C) {
                    this.x = i3 + 1;
                    this.y = i3;
                    Object[] objArr = an3Var3.y;
                    objArr.getClass();
                    Object obj2 = objArr[this.y];
                    c();
                    return obj2;
                }
                qi2.e();
                return null;
        }
    }
}
