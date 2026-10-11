package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class co0 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public co0(long r5, long r7, int r9, java.lang.IndexOutOfBoundsException r10, byte r11) {
        /*
            r4 = this;
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            java.lang.String r1 = ", len: "
            java.lang.String r2 = ", limit: "
            java.lang.String r3 = "Pos: "
            switch(r11) {
                case 14: goto L26;
                default: goto Lb;
            }
        Lb:
            java.util.Locale r11 = java.util.Locale.US
            java.lang.StringBuilder r5 = defpackage.zo5.n(r5, r3, r2)
            r5.append(r7)
            r5.append(r1)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r0.concat(r5)
            r4.<init>(r5, r10)
            return
        L26:
            java.util.Locale r11 = java.util.Locale.US
            java.lang.StringBuilder r5 = defpackage.zo5.n(r5, r3, r2)
            r5.append(r7)
            r5.append(r1)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r0.concat(r5)
            r4.<init>(r5, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co0.<init>(long, long, int, java.lang.IndexOutOfBoundsException, byte):void");
    }

    public /* synthetic */ co0(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }

    public co0(Throwable th) {
        super(th != null ? th.getMessage() : null, th);
    }
}
