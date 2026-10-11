package s1;

/* loaded from: classes.dex */
public final class g extends i1.h {
    public long B;
    public int C;
    public int D;

    public g() {
        super(2);
        this.D = 32;
    }

    @Override // i1.h
    public final void h() {
        super.h();
        this.C = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0041, code lost:
    
        if ((r0.remaining() + r3.position()) > 3072000) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l(i1.h r5) {
        /*
            r4 = this;
            r0 = 1073741824(0x40000000, float:2.0)
            boolean r0 = r5.g(r0)
            r1 = 1
            r0 = r0 ^ r1
            w7.b.g(r0)
            r0 = 268435456(0x10000000, float:2.524355E-29)
            boolean r0 = r5.g(r0)
            r0 = r0 ^ r1
            w7.b.g(r0)
            r0 = 4
            boolean r0 = r5.g(r0)
            r0 = r0 ^ r1
            w7.b.g(r0)
            boolean r0 = r4.m()
            r2 = 0
            if (r0 != 0) goto L26
            goto L45
        L26:
            int r0 = r4.C
            int r3 = r4.D
            if (r0 < r3) goto L2d
            goto L43
        L2d:
            java.nio.ByteBuffer r0 = r5.f5262e
            if (r0 == 0) goto L45
            java.nio.ByteBuffer r3 = r4.f5262e
            if (r3 == 0) goto L45
            int r3 = r3.position()
            int r0 = r0.remaining()
            int r0 = r0 + r3
            r3 = 3072000(0x2ee000, float:4.304789E-39)
            if (r0 <= r3) goto L45
        L43:
            r0 = r2
            goto L46
        L45:
            r0 = r1
        L46:
            if (r0 != 0) goto L49
            return r2
        L49:
            int r0 = r4.C
            int r2 = r0 + 1
            r4.C = r2
            if (r0 != 0) goto L5d
            long r2 = r5.f5264x
            r4.f5264x = r2
            boolean r0 = r5.g(r1)
            if (r0 == 0) goto L5d
            r4.f5247b = r1
        L5d:
            java.nio.ByteBuffer r0 = r5.f5262e
            if (r0 == 0) goto L6d
            int r2 = r0.remaining()
            r4.j(r2)
            java.nio.ByteBuffer r2 = r4.f5262e
            r2.put(r0)
        L6d:
            long r2 = r5.f5264x
            r4.B = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.g.l(i1.h):boolean");
    }

    public final boolean m() {
        if (this.C > 0) {
            return true;
        }
        return false;
    }
}
