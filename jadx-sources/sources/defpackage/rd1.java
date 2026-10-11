package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class rd1 implements Iterator, j73 {
    public f13 A;
    public int B;
    public final /* synthetic */ sd1 C;
    public int x = -1;
    public int y;
    public int z;

    public rd1(sd1 sd1Var) {
        this.C = sd1Var;
        int C = db.C(0, 0, sd1Var.a.length());
        this.y = C;
        this.z = C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        if (r7 < r4) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [d13, f13] */
    /* JADX WARN: Type inference failed for: r0v8, types: [d13, f13] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r8 = this;
            sd1 r0 = r8.C
            java.lang.CharSequence r1 = r0.a
            int r2 = r8.z
            r3 = 0
            if (r2 >= 0) goto Lf
            r8.x = r3
            r0 = 0
            r8.A = r0
            return
        Lf:
            int r4 = r0.b
            r5 = -1
            r6 = 1
            if (r4 <= 0) goto L1c
            int r7 = r8.B
            int r7 = r7 + r6
            r8.B = r7
            if (r7 >= r4) goto L22
        L1c:
            int r4 = r1.length()
            if (r2 <= r4) goto L32
        L22:
            f13 r0 = new f13
            int r2 = r8.y
            int r1 = defpackage.uz5.Q(r1)
            r0.<init>(r2, r1, r6)
            r8.A = r0
            r8.z = r5
            goto L73
        L32:
            ic2 r0 = r0.c
            int r2 = r8.z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.invoke(r1, r2)
            ai4 r0 = (defpackage.ai4) r0
            if (r0 != 0) goto L52
            f13 r0 = new f13
            int r2 = r8.y
            int r1 = defpackage.uz5.Q(r1)
            r0.<init>(r2, r1, r6)
            r8.A = r0
            r8.z = r5
            goto L73
        L52:
            java.lang.Object r1 = r0.x
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.y
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r2 = r8.y
            f13 r2 = defpackage.db.r0(r2, r1)
            r8.A = r2
            int r1 = r1 + r0
            r8.y = r1
            if (r0 != 0) goto L70
            r3 = r6
        L70:
            int r1 = r1 + r3
            r8.z = r1
        L73:
            r8.x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd1.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.x == -1) {
            a();
        }
        if (this.x == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.x == -1) {
            a();
        }
        if (this.x != 0) {
            f13 f13Var = this.A;
            f13Var.getClass();
            this.A = null;
            this.x = -1;
            return f13Var;
        }
        qi2.e();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
