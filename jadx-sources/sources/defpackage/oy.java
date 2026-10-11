package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oy {
    public final String a;
    public final byte[] b;
    public final cu4 c;

    public oy(String str, byte[] bArr, cu4 cu4Var) {
        this.a = str;
        this.b = bArr;
        this.c = cu4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [st3, java.lang.Object] */
    public static st3 a() {
        ?? obj = new Object();
        obj.z = cu4.x;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oy) {
            oy oyVar = (oy) obj;
            if (this.a.equals(oyVar.a) && Arrays.equals(this.b, oyVar.b) && this.c.equals(oyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        String encodeToString;
        byte[] bArr = this.b;
        if (bArr == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(bArr, 2);
        }
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return h11.k(sb, encodeToString, ")");
    }
}
