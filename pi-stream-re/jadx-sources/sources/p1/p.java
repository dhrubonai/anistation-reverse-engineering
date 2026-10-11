package p1;

import v1.v0;

/* loaded from: classes.dex */
public final class p implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f8486a;

    /* renamed from: b, reason: collision with root package name */
    public final t f8487b;

    /* renamed from: c, reason: collision with root package name */
    public int f8488c = -1;

    public p(t tVar, int i10) {
        this.f8487b = tVar;
        this.f8486a = i10;
    }

    @Override // v1.v0
    public final boolean a() {
        boolean z9;
        boolean z10;
        int i10 = this.f8488c;
        if (i10 == -3) {
            return true;
        }
        if (i10 != -1 && i10 != -3 && i10 != -2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            t tVar = this.f8487b;
            if (!tVar.C() && tVar.M[i10].u(tVar.f8516k0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    @Override // v1.v0
    public final void b() {
        int i10 = this.f8488c;
        t tVar = this.f8487b;
        if (i10 != -2) {
            if (i10 == -1) {
                tVar.E();
                return;
            } else {
                if (i10 != -3) {
                    tVar.E();
                    tVar.M[i10].w();
                    return;
                }
                return;
            }
        }
        tVar.g();
        throw new m1.b(tVar.Z.a(this.f8486a).f1693d[0].f1935m, 2);
    }

    public final void c() {
        boolean z9;
        if (this.f8488c == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        t tVar = this.f8487b;
        tVar.g();
        tVar.f8503b0.getClass();
        int[] iArr = tVar.f8503b0;
        int i10 = this.f8486a;
        int i11 = iArr[i10];
        if (i11 == -1) {
            if (tVar.f8501a0.contains(tVar.Z.a(i10))) {
                i11 = -3;
            }
            i11 = -2;
        } else {
            boolean[] zArr = tVar.f8509e0;
            if (!zArr[i11]) {
                zArr[i11] = true;
            }
            i11 = -2;
        }
        this.f8488c = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
    
        if (((p1.l) r8.get(0)).f8463c0 == false) goto L76;
     */
    @Override // v1.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(androidx.appcompat.widget.a0 r24, i1.h r25, int r26) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.p.g(androidx.appcompat.widget.a0, i1.h, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r7.hasNext() != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0045, code lost:
    
        r2 = r7.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r7.hasNext() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        r7 = r2;
     */
    @Override // v1.v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(long r6) {
        /*
            r5 = this;
            int r0 = r5.f8488c
            r1 = 0
            r2 = -1
            if (r0 == r2) goto Le
            r3 = -3
            if (r0 == r3) goto Le
            r3 = -2
            if (r0 == r3) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = r1
        Lf:
            if (r3 == 0) goto L6c
            p1.t r3 = r5.f8487b
            boolean r4 = r3.C()
            if (r4 == 0) goto L1a
            goto L6c
        L1a:
            p1.s[] r1 = r3.M
            r1 = r1[r0]
            boolean r4 = r3.f8516k0
            int r6 = r1.s(r6, r4)
            java.util.ArrayList r7 = r3.E
            boolean r3 = r7 instanceof java.util.Collection
            if (r3 == 0) goto L3b
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L31
            goto L51
        L31:
            int r3 = r7.size()
            int r3 = r3 + r2
            java.lang.Object r7 = r7.get(r3)
            goto L52
        L3b:
            java.util.Iterator r7 = r7.iterator()
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L51
        L45:
            java.lang.Object r2 = r7.next()
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L45
            r7 = r2
            goto L52
        L51:
            r7 = 0
        L52:
            p1.l r7 = (p1.l) r7
            if (r7 == 0) goto L68
            boolean r2 = r7.f8463c0
            if (r2 != 0) goto L68
            int r2 = r1.f10549q
            int r3 = r1.f10551s
            int r2 = r2 + r3
            int r7 = r7.f(r0)
            int r7 = r7 - r2
            int r6 = java.lang.Math.min(r6, r7)
        L68:
            r1.E(r6)
            r1 = r6
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.p.i(long):int");
    }
}
