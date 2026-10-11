package s1;

/* loaded from: classes.dex */
public abstract class o {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        r6 = ((s1.n) r4.get(r5)).f9804d.getVideoCapabilities().getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
    
        l1.f0.i();
        r4 = l1.f0.d();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
        if (r5 >= r6.size()) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        r2 = l1.f0.f(r6.get(r5)).covers(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        if (r2 == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ad, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        if (r7 != 1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.media.MediaCodecInfo.VideoCapabilities r3, int r4, int r5, double r6) {
        /*
            java.util.List r3 = l1.f0.h(r3)
            r0 = 0
            if (r3 == 0) goto Lc7
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lf
            goto Lc7
        Lf:
            l1.f0.i()
            int r6 = (int) r6
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = l1.f0.e(r4, r5, r6)
            r5 = r0
        L18:
            int r6 = r3.size()
            r7 = 2
            r1 = 1
            if (r5 >= r6) goto L33
            java.lang.Object r6 = r3.get(r5)
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r6 = l1.f0.f(r6)
            boolean r6 = l1.f0.y(r6, r4)
            if (r6 == 0) goto L30
            r3 = r7
            goto L34
        L30:
            int r5 = r5 + 1
            goto L18
        L33:
            r3 = r1
        L34:
            if (r3 != r1) goto Lc6
            java.lang.Boolean r4 = p7.a0.f8644i
            if (r4 != 0) goto Lc6
            int r4 = f1.b0.f3799a
            r5 = 35
            if (r4 < r5) goto L42
            goto Lb4
        L42:
            c1.u r4 = new c1.u     // Catch: s1.w -> Lb9
            r4.<init>()     // Catch: s1.w -> Lb9
            java.lang.String r5 = "video/avc"
            r4.e(r5)     // Catch: s1.w -> Lb9
            c1.v r5 = new c1.v     // Catch: s1.w -> Lb9
            r5.<init>(r4)     // Catch: s1.w -> Lb9
            java.lang.String r4 = r5.f1935m     // Catch: s1.w -> Lb9
            if (r4 == 0) goto Lb9
            k1.i r4 = s1.t.o     // Catch: s1.w -> Lb9
            r6.n1 r4 = s1.z.g(r4, r5, r0, r0)     // Catch: s1.w -> Lb9
            r5 = r0
        L5c:
            int r6 = r4.f9499d     // Catch: s1.w -> Lb9
            if (r5 >= r6) goto Lb9
            java.lang.Object r6 = r4.get(r5)     // Catch: s1.w -> Lb9
            s1.n r6 = (s1.n) r6     // Catch: s1.w -> Lb9
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f9804d     // Catch: s1.w -> Lb9
            if (r6 == 0) goto Lb6
            java.lang.Object r6 = r4.get(r5)     // Catch: s1.w -> Lb9
            s1.n r6 = (s1.n) r6     // Catch: s1.w -> Lb9
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f9804d     // Catch: s1.w -> Lb9
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: s1.w -> Lb9
            if (r6 == 0) goto Lb6
            java.lang.Object r6 = r4.get(r5)     // Catch: s1.w -> Lb9
            s1.n r6 = (s1.n) r6     // Catch: s1.w -> Lb9
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.f9804d     // Catch: s1.w -> Lb9
            android.media.MediaCodecInfo$VideoCapabilities r6 = r6.getVideoCapabilities()     // Catch: s1.w -> Lb9
            java.util.List r6 = l1.f0.h(r6)     // Catch: s1.w -> Lb9
            if (r6 == 0) goto Lb6
            boolean r2 = r6.isEmpty()     // Catch: s1.w -> Lb9
            if (r2 != 0) goto Lb6
            l1.f0.i()     // Catch: s1.w -> Lb9
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r4 = l1.f0.d()     // Catch: s1.w -> Lb9
            r5 = r0
        L98:
            int r2 = r6.size()     // Catch: s1.w -> Lb9
            if (r5 >= r2) goto Lb0
            java.lang.Object r2 = r6.get(r5)     // Catch: s1.w -> Lb9
            android.media.MediaCodecInfo$VideoCapabilities$PerformancePoint r2 = l1.f0.f(r2)     // Catch: s1.w -> Lb9
            boolean r2 = l1.f0.y(r2, r4)     // Catch: s1.w -> Lb9
            if (r2 == 0) goto Lad
            goto Lb1
        Lad:
            int r5 = r5 + 1
            goto L98
        Lb0:
            r7 = r1
        Lb1:
            if (r7 != r1) goto Lb4
            goto Lb9
        Lb4:
            r1 = r0
            goto Lb9
        Lb6:
            int r5 = r5 + 1
            goto L5c
        Lb9:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            p7.a0.f8644i = r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Lc6
            return r0
        Lc6:
            return r3
        Lc7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s1.o.a(android.media.MediaCodecInfo$VideoCapabilities, int, int, double):int");
    }
}
