package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class br0 {
    public final Object a;
    public final lg0 b;
    public final jc2 c;
    public final Object d;
    public final Throwable e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ br0(java.lang.Object r3, defpackage.lg0 r4, defpackage.jc2 r5, java.lang.Throwable r6, int r7) {
        /*
            r2 = this;
            r0 = r7 & 2
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r7 & 4
            if (r0 == 0) goto Lb
            r5 = r1
        Lb:
            r7 = r7 & 16
            if (r7 == 0) goto L11
            r7 = r1
            goto L12
        L11:
            r7 = r6
        L12:
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br0.<init>(java.lang.Object, lg0, jc2, java.lang.Throwable, int):void");
    }

    public static br0 a(br0 br0Var, lg0 lg0Var, Throwable th, int i) {
        Object obj = br0Var.a;
        if ((i & 2) != 0) {
            lg0Var = br0Var.b;
        }
        lg0 lg0Var2 = lg0Var;
        jc2 jc2Var = br0Var.c;
        Object obj2 = br0Var.d;
        if ((i & 16) != 0) {
            th = br0Var.e;
        }
        return new br0(obj, lg0Var2, jc2Var, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br0)) {
            return false;
        }
        br0 br0Var = (br0) obj;
        if (a34.i(this.a, br0Var.a) && a34.i(this.b, br0Var.b) && a34.i(this.c, br0Var.c) && a34.i(this.d, br0Var.d) && a34.i(this.e, br0Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        lg0 lg0Var = this.b;
        if (lg0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = lg0Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        jc2 jc2Var = this.c;
        if (jc2Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = jc2Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj2 = this.d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Throwable th = this.e;
        if (th != null) {
            i = th.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public br0(Object obj, lg0 lg0Var, jc2 jc2Var, Object obj2, Throwable th) {
        this.a = obj;
        this.b = lg0Var;
        this.c = jc2Var;
        this.d = obj2;
        this.e = th;
    }
}
