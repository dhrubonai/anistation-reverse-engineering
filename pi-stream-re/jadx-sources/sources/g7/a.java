package g7;

import java.io.ByteArrayOutputStream;
import r6.h0;

/* loaded from: classes.dex */
public final class a extends ByteArrayOutputStream {
    public a() {
        super(8193);
    }

    public final byte[] a() {
        byte[] bArr = ((ByteArrayOutputStream) this).buf;
        h0.s(bArr, "buf");
        return bArr;
    }
}
