package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class o53 extends lj5 {
    public final String x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o53(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            if (r3 == 0) goto L10
            boolean r0 = defpackage.uz5.V(r3)
            if (r0 == 0) goto L9
            goto L10
        L9:
            java.lang.String r0 = "\n"
            java.lang.String r3 = r0.concat(r3)
            goto L12
        L10:
            java.lang.String r3 = ""
        L12:
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o53.<init>(java.lang.String, java.lang.String):void");
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.x;
    }

    public o53(String str) {
        super(str);
        this.x = str;
    }

    public /* synthetic */ o53(String str, String str2, int i) {
        this(str, (i & 4) != 0 ? null : "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
    }
}
