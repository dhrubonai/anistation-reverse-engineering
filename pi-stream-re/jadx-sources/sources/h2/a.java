package h2;

import androidx.appcompat.widget.a0;
import c.j;
import d2.i;
import f1.y;
import w1.o;

/* loaded from: classes.dex */
public final class a extends i {
    public a(y yVar, long j4, long j10) {
        super(new o(4), new a0(yVar, 0), j4, j4 + 1, 0L, j10, 188L, 1000);
    }

    public static int d(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public a(y yVar, long j4, long j10, int i10, int i11) {
        super(new o(4), new j(i10, yVar, i11), j4, j4 + 1, 0L, j10, 188L, 940);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(d2.v r15, int r16, long r17, long r19) {
        /*
            r14 = this;
            r0 = r15
            java.util.Objects.requireNonNull(r15)
            w.f r1 = new w.f
            r2 = 16
            r1.<init>(r15, r2)
            y.c r2 = new y.c
            r3 = r16
            r2.<init>(r15, r3)
            long r3 = r15.b()
            long r5 = r0.f3204j
            int r7 = r0.f3197c
            int r8 = r0.f3198d
            if (r8 <= 0) goto L27
            long r8 = (long) r8
            long r10 = (long) r7
            long r8 = r8 + r10
            r10 = 2
            long r8 = r8 / r10
            r10 = 1
            goto L40
        L27:
            int r8 = r0.f3196b
            int r9 = r0.f3195a
            if (r9 != r8) goto L31
            if (r9 <= 0) goto L31
            long r8 = (long) r9
            goto L33
        L31:
            r8 = 4096(0x1000, double:2.0237E-320)
        L33:
            int r10 = r0.f3201g
            long r10 = (long) r10
            long r8 = r8 * r10
            int r0 = r0.f3202h
            long r10 = (long) r0
            long r8 = r8 * r10
            r10 = 8
            long r8 = r8 / r10
            r10 = 64
        L40:
            long r11 = r8 + r10
            r0 = 6
            int r13 = java.lang.Math.max(r0, r7)
            r0 = r14
            r7 = r17
            r9 = r19
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.a.<init>(d2.v, int, long, long):void");
    }
}
