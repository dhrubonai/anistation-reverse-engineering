package h1;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public class w extends i {

    /* renamed from: c, reason: collision with root package name */
    public final int f4643c;

    public w() {
        super(2008);
        this.f4643c = 1;
    }

    public static w a(IOException iOException, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else if (message != null && j5.a.g0(message).matches("cleartext.*not permitted.*")) {
            i11 = 2007;
        } else {
            i11 = 2001;
        }
        if (i11 == 2007) {
            return new v(iOException);
        }
        return new w(iOException, i11, i10);
    }

    public w(String str, int i10) {
        super(str, i10 == 2000 ? 2001 : i10);
        this.f4643c = 1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(java.io.IOException r2, int r3, int r4) {
        /*
            r1 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r3 != r0) goto L9
            r0 = 1
            if (r4 != r0) goto L9
            r3 = 2001(0x7d1, float:2.804E-42)
        L9:
            r1.<init>(r3, r2)
            r1.f4643c = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.w.<init>(java.io.IOException, int, int):void");
    }

    public w(String str, IOException iOException, int i10) {
        super(i10 == 2000 ? 2001 : i10, str, iOException);
        this.f4643c = 1;
    }
}
