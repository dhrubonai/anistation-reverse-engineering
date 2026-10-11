package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l30 extends m30 {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l30(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            j30 r0 = new j30
            char[] r3 = r3.toCharArray()
            r0.<init>(r2, r3)
            r2 = 61
            java.lang.Character r2 = java.lang.Character.valueOf(r2)
            r1.<init>(r0, r2)
            int r1 = r3.length
            r2 = 64
            if (r1 != r2) goto L19
            r1 = 1
            goto L1a
        L19:
            r1 = 0
        L1a:
            defpackage.io3.n(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l30.<init>(java.lang.String, java.lang.String):void");
    }

    @Override // defpackage.m30
    public final void c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        io3.y(0, i, bArr.length);
        for (int i3 = i; i3 >= 3; i3 -= 3) {
            int i4 = i2 + 2;
            int i5 = ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2] & 255) << 16);
            i2 += 3;
            int i6 = i5 | (bArr[i4] & 255);
            j30 j30Var = this.a;
            char[] cArr = j30Var.b;
            char[] cArr2 = j30Var.b;
            sb.append(cArr[i6 >>> 18]);
            sb.append(cArr2[(i6 >>> 12) & 63]);
            sb.append(cArr2[(i6 >>> 6) & 63]);
            sb.append(cArr2[i6 & 63]);
        }
        if (i2 < i) {
            b(sb, bArr, i2, i - i2);
        }
    }
}
