package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ns6 extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ns6(java.lang.Throwable r3, long r4) {
        /*
            r2 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            java.lang.String r4 = " @UNSET"
            goto L12
        Lc:
            java.lang.String r0 = " @"
            java.lang.String r4 = defpackage.h11.h(r4, r0)
        L12:
            r2.<init>(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns6.<init>(java.lang.Throwable, long):void");
    }

    public static ns6 a(Exception exc, long j) {
        if (exc instanceof ns6) {
            return (ns6) exc;
        }
        return new ns6(exc, j);
    }

    public ns6(String str) {
        super(str.concat(" @UNSET"));
    }

    public ns6(Throwable th) {
        this(th, -9223372036854775807L);
    }
}
