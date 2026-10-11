package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fx7 implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ nw7 c;

    public /* synthetic */ fx7(boolean z, String str, nw7 nw7Var) {
        this.a = z;
        this.b = str;
        this.c = nw7Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        MessageDigest messageDigest;
        boolean z = this.a;
        String str2 = this.b;
        nw7 nw7Var = this.c;
        if (!z && n08.b(str2, nw7Var, true, false).y) {
            str = "debug cert rejected";
        } else {
            str = "not allowed";
        }
        int i = 0;
        while (true) {
            if (i < 2) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA-256");
                } catch (NoSuchAlgorithmException unused) {
                }
                if (messageDigest != null) {
                    break;
                }
                i++;
            } else {
                messageDigest = null;
                break;
            }
        }
        a34.x(messageDigest);
        byte[] digest = messageDigest.digest(nw7Var.g);
        int length = digest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : digest) {
            char[] cArr2 = v94.o;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        StringBuilder o = h11.o(str, ": pkg=", str2, ", sha256=", new String(cArr));
        o.append(", atk=");
        o.append(z);
        o.append(", ver=12451000.false");
        return o.toString();
    }
}
