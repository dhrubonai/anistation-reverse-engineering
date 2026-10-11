package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zr2 extends IOException implements m01 {
    public final String x;
    public final Long y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zr2(java.lang.String r3, java.lang.Long r4, java.lang.Throwable r5) {
        /*
            r2 = this;
            r3.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Request timeout has expired [url="
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", request_timeout="
            r0.append(r1)
            if (r4 != 0) goto L17
            java.lang.String r1 = "unknown"
            goto L18
        L17:
            r1 = r4
        L18:
            r0.append(r1)
            java.lang.String r1 = " ms]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r5)
            r2.x = r3
            r2.y = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr2.<init>(java.lang.String, java.lang.Long, java.lang.Throwable):void");
    }

    @Override // defpackage.m01
    public final Throwable a() {
        return new zr2(this.x, this.y, getCause());
    }
}
