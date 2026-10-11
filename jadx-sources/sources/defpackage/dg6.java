package defpackage;

import java.nio.charset.MalformedInputException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dg6 extends MalformedInputException {
    public final String x;

    public dg6(String str) {
        super(0);
        this.x = str;
    }

    @Override // java.nio.charset.MalformedInputException, java.lang.Throwable
    public final String getMessage() {
        return this.x;
    }
}
