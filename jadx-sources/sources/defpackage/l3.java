package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l3 implements b12 {
    public final k3 a = new k3(null, 0, "audio/ac4", (byte) 1);
    public final zi4 b = new zi4(16384);
    public boolean c;

    @Override // defpackage.b12
    public final int a(c12 c12Var, d42 d42Var) {
        zi4 zi4Var = this.b;
        int read = c12Var.read(zi4Var.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        zi4Var.N(0);
        zi4Var.M(read);
        boolean z = this.c;
        k3 k3Var = this.a;
        if (!z) {
            k3Var.o = 0L;
            this.c = true;
        }
        k3Var.a(zi4Var);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // defpackage.b12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.c12 r14) {
        /*
            r13 = this;
            zi4 r13 = new zi4
            r0 = 10
            r13.<init>(r0)
            r1 = 0
            r2 = r1
        L9:
            byte[] r3 = r13.a
            r4 = r14
            p81 r4 = (defpackage.p81) r4
            r4.j(r3, r1, r0, r1)
            r13.N(r1)
            int r3 = r13.D()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r3 == r5) goto L90
            r4.C = r1
            r4.x(r2, r1)
            r14 = r1
            r0 = r2
        L25:
            byte[] r3 = r13.a
            r5 = 7
            r4.j(r3, r1, r5, r1)
            r13.N(r1)
            int r3 = r13.H()
            r7 = 44096(0xac40, float:6.1792E-41)
            r8 = 44097(0xac41, float:6.1793E-41)
            if (r3 == r7) goto L4c
            if (r3 == r8) goto L4c
            r4.C = r1
            int r0 = r0 + 1
            int r14 = r0 - r2
            r3 = 8192(0x2000, float:1.148E-41)
            if (r14 < r3) goto L47
            goto L89
        L47:
            r4.x(r0, r1)
            r14 = r1
            goto L25
        L4c:
            r7 = 1
            int r14 = r14 + r7
            r9 = 4
            if (r14 < r9) goto L52
            return r7
        L52:
            byte[] r7 = r13.a
            int r10 = r7.length
            r11 = -1
            if (r10 >= r5) goto L5a
            r10 = r11
            goto L87
        L5a:
            r10 = 2
            r10 = r7[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            r12 = r7[r6]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r10 = r10 | r12
            r12 = 65535(0xffff, float:9.1834E-41)
            if (r10 != r12) goto L81
            r9 = r7[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 16
            r10 = 5
            r10 = r7[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            r9 = r9 | r10
            r10 = 6
            r7 = r7[r10]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r10 = r9 | r7
            goto L82
        L81:
            r5 = r9
        L82:
            if (r3 != r8) goto L86
            int r5 = r5 + 2
        L86:
            int r10 = r10 + r5
        L87:
            if (r10 != r11) goto L8a
        L89:
            return r1
        L8a:
            int r10 = r10 + (-7)
            r4.x(r10, r1)
            goto L25
        L90:
            r13.O(r6)
            int r3 = r13.z()
            int r5 = r3 + 10
            int r2 = r2 + r5
            r4.x(r3, r1)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l3.b(c12):boolean");
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        this.c = false;
        this.a.c();
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        this.a.g(d12Var, new lk6(0, 1));
        d12Var.t();
        d12Var.I(new zy(-9223372036854775807L));
    }

    @Override // defpackage.b12
    public final void release() {
    }
}
