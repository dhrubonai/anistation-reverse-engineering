package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class eg1 {
    public final boolean a;
    public final boolean b;
    public final ef5 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final byte g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public eg1(int r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            r0 = r9 & 1
            r1 = 1
            if (r0 == 0) goto L7
            r3 = r1
            goto L8
        L7:
            r3 = r10
        L8:
            r9 = r9 & 2
            if (r9 == 0) goto Le
            r4 = r1
            goto Lf
        Le:
            r4 = r11
        Lf:
            r6 = 1
            r7 = 224(0xe0, float:3.14E-43)
            r5 = 1
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg1.<init>(int, boolean, boolean):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof eg1) {
                eg1 eg1Var = (eg1) obj;
                if (this.a != eg1Var.a || this.b != eg1Var.b || this.c != eg1Var.c || this.d != eg1Var.d || this.e != eg1Var.e || this.g != eg1Var.g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (zo5.g(zo5.g((this.c.hashCode() + zo5.g(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e) + this.g) * 31;
    }

    public eg1(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        this.a = z;
        this.b = z2;
        this.c = ef5.x;
        this.d = z3;
        this.e = z4;
        this.f = "";
        this.g = (byte) 2;
    }
}
