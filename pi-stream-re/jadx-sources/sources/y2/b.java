package y2;

import f1.b0;
import java.util.List;
import r6.l1;
import r6.o0;
import r6.u;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: c, reason: collision with root package name */
    public static final u f11544c;

    /* renamed from: a, reason: collision with root package name */
    public final o0 f11545a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f11546b;

    static {
        l1 l1Var = l1.f9489a;
        h3.e eVar = new h3.e(10);
        l1Var.getClass();
        f11544c = new u(eVar, l1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(r6.n1 r19) {
        /*
            r18 = this;
            r0 = r18
            r18.<init>()
            int r1 = r19.size()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 2
            r7 = 0
            r8 = 1
            if (r1 != r8) goto L4c
            java.lang.Object r1 = r6.h0.Y(r19)
            y2.a r1 = (y2.a) r1
            long r9 = r1.f11541b
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 != 0) goto L22
            r2 = 0
            goto L23
        L22:
            r2 = r9
        L23:
            long r9 = r1.f11542c
            int r4 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            r6.o0 r1 = r1.f11540a
            if (r4 != 0) goto L38
            r6.n1 r1 = r6.o0.o(r1)
            r0.f11545a = r1
            long[] r1 = new long[r8]
            r1[r7] = r2
            r0.f11546b = r1
            goto L4b
        L38:
            r6.n1 r4 = r6.o0.m()
            r6.n1 r1 = r6.o0.p(r1, r4)
            r0.f11545a = r1
            long[] r1 = new long[r6]
            r1[r7] = r2
            long r2 = r2 + r9
            r1[r8] = r2
            r0.f11546b = r1
        L4b:
            return
        L4c:
            int r1 = r19.size()
            int r1 = r1 * r6
            long[] r1 = new long[r1]
            r0.f11546b = r1
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r1, r8)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6.u r6 = y2.b.f11544c
            r8 = r19
            r6.n1 r6 = r6.o0.q(r6, r8)
            r8 = r7
        L6b:
            int r9 = r6.size()
            if (r7 >= r9) goto Ld8
            java.lang.Object r9 = r6.get(r7)
            y2.a r9 = (y2.a) r9
            long r10 = r9.f11541b
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 != 0) goto L7f
            r10 = 0
        L7f:
            long r12 = r9.f11542c
            long r14 = r10 + r12
            r6.o0 r9 = r9.f11540a
            if (r8 == 0) goto Lb3
            long[] r2 = r0.f11546b
            int r3 = r8 + (-1)
            r16 = r2[r3]
            int r2 = (r16 > r10 ? 1 : (r16 == r10 ? 0 : -1))
            if (r2 >= 0) goto L92
            goto Lb3
        L92:
            if (r2 != 0) goto La4
            java.lang.Object r2 = r1.get(r3)
            r6.o0 r2 = (r6.o0) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto La4
            r1.set(r3, r9)
            goto Lbd
        La4:
            java.lang.String r2 = "CuesWithTimingSubtitle"
            java.lang.String r4 = "Truncating unsupported overlapping cues."
            f1.o.f(r2, r4)
            long[] r2 = r0.f11546b
            r2[r3] = r10
            r1.set(r3, r9)
            goto Lbd
        Lb3:
            long[] r2 = r0.f11546b
            int r3 = r8 + 1
            r2[r8] = r10
            r1.add(r9)
            r8 = r3
        Lbd:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 == 0) goto Ld4
            long[] r4 = r0.f11546b
            int r5 = r8 + 1
            r4[r8] = r14
            r6.n1 r4 = r6.o0.m()
            r1.add(r4)
            r8 = r5
        Ld4:
            int r7 = r7 + 1
            r4 = r2
            goto L6b
        Ld8:
            r6.o0 r1 = r6.o0.j(r1)
            r0.f11545a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.b.<init>(r6.n1):void");
    }

    @Override // y2.d
    public final int a(long j4) {
        int b10 = b0.b(this.f11546b, j4, false);
        if (b10 >= this.f11545a.size()) {
            return -1;
        }
        return b10;
    }

    @Override // y2.d
    public final long b(int i10) {
        boolean z9;
        if (i10 < this.f11545a.size()) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        return this.f11546b[i10];
    }

    @Override // y2.d
    public final List c(long j4) {
        int f10 = b0.f(this.f11546b, j4, false);
        if (f10 == -1) {
            return o0.m();
        }
        return (o0) this.f11545a.get(f10);
    }

    @Override // y2.d
    public final int d() {
        return this.f11545a.size();
    }
}
