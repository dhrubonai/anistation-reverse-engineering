package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rn0 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rn0(long r4, int r6, long r7) {
        /*
            r3 = this;
            if (r6 == 0) goto L37
            r0 = 1
            if (r6 == r0) goto L34
            r1 = 2
            if (r6 == r1) goto Lb
            java.lang.String r4 = "unknown"
            goto L39
        Lb:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 == 0) goto L19
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 == 0) goto L19
            goto L1a
        L19:
            r0 = 0
        L1a:
            defpackage.io3.B(r0)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "start exceeds end. Start time: "
            r6.<init>(r0)
            r6.append(r4)
            java.lang.String r4 = ", End time: "
            r6.append(r4)
            r6.append(r7)
            java.lang.String r4 = r6.toString()
            goto L39
        L34:
            java.lang.String r4 = "not seekable to start"
            goto L39
        L37:
            java.lang.String r4 = "invalid period count"
        L39:
            java.lang.String r5 = "Illegal clipping: "
            java.lang.String r4 = r5.concat(r4)
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn0.<init>(long, int, long):void");
    }

    public rn0(int i) {
        this(-9223372036854775807L, i, -9223372036854775807L);
    }
}
