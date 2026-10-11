package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bh7 extends RuntimeException {
    public bh7() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ag7, java.io.IOException] */
    public final ag7 a() {
        return new IOException(getMessage());
    }
}
