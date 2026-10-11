package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g81 {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final yq6 c = new yq6();
    public sn3 d;
    public byte e;
    public int f;
    public long g;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x06bd, code lost:
    
        if (r4 == 0) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:452:0x06cc, code lost:
    
        r23 = r0;
        r17 = r3;
        r5 = r4;
        r18 = r6;
        r21 = r11;
        r40 = r12;
        r3 = -1;
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0709, code lost:
    
        if (r4 == 0) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0ad6, code lost:
    
        if (r3.u() == r6.getLeastSignificantBits()) goto L618;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:314:0x0647. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0b2d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0b63  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0d56  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0d6a  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0d6d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0b52  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0b43  */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r5v127, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v130 */
    /* JADX WARN: Type inference failed for: r5v131, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r5v132 */
    /* JADX WARN: Type inference failed for: r5v145 */
    /* JADX WARN: Type inference failed for: r5v146, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r6v121 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.c12 r41) {
        /*
            Method dump skipped, instructions count: 5136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g81.a(c12):boolean");
    }

    public final long b(c12 c12Var, int i) {
        c12Var.readFully(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r5[i2] & 255);
        }
        return j;
    }
}
