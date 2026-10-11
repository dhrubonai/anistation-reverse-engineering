package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class np3 extends Exception {
    public final String A;
    public final String x;
    public final boolean y;
    public final mp3 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public np3(defpackage.ea2 r10, defpackage.sp3 r11, boolean r12, int r13) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Decoder init failed: ["
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r1 = "], "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r3 = r0.toString()
            java.lang.String r5 = r10.p
            if (r13 >= 0) goto L1d
            java.lang.String r10 = "neg_"
            goto L1f
        L1d:
            java.lang.String r10 = ""
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_"
            r0.<init>(r1)
            r0.append(r10)
            int r10 = java.lang.Math.abs(r13)
            r0.append(r10)
            java.lang.String r8 = r0.toString()
            r7 = 0
            r2 = r9
            r4 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np3.<init>(ea2, sp3, boolean, int):void");
    }

    public np3(String str, Throwable th, String str2, boolean z, mp3 mp3Var, String str3) {
        super(str, th);
        this.x = str2;
        this.y = z;
        this.z = mp3Var;
        this.A = str3;
    }
}
