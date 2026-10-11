package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class bj4 extends IOException {
    public final boolean x;
    public final byte y;

    /* JADX WARN: Multi-variable type inference failed */
    public bj4(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.x = z;
        this.y = i;
    }

    public static bj4 a(String str, Exception exc) {
        return new bj4(str, exc, true, 1);
    }

    public static bj4 b(String str) {
        return new bj4(str, null, true, 4);
    }

    public static bj4 c(String str) {
        return new bj4(str, null, true, 8);
    }

    public static bj4 d(String str) {
        return new bj4(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        if (message != null) {
            str = message.concat(" ");
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append("{contentIsMalformed=");
        sb.append(this.x);
        sb.append(", dataType=");
        return zo5.k(this.y, "}", sb);
    }
}
