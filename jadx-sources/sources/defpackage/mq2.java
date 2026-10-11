package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class mq2 extends s41 {
    public final byte y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mq2(int r2, int r3, java.io.IOException r4) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r2 != r0) goto L9
            r0 = 1
            if (r3 != r0) goto L9
            r2 = 2001(0x7d1, float:2.804E-42)
        L9:
            r1.<init>(r4, r2)
            r1.y = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mq2.<init>(int, int, java.io.IOException):void");
    }

    public static mq2 a(int i, IOException iOException) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else if (message != null && wc7.U(message).matches("cleartext.*not permitted.*")) {
            i2 = 2007;
        } else {
            i2 = 2001;
        }
        if (i2 == 2007) {
            return new mq2("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, 2007);
        }
        return new mq2(i2, i, iOException);
    }

    public mq2(String str, int i) {
        super(str, i == 2000 ? 2001 : i);
        this.y = (byte) 1;
    }

    public mq2(int i) {
        super(i == 2000 ? 2001 : i);
        this.y = (byte) 1;
    }

    public mq2(String str, IOException iOException, int i) {
        super(str, iOException, i == 2000 ? 2001 : i);
        this.y = (byte) 1;
    }
}
