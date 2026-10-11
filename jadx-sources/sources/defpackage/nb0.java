package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nb0 {
    public static final int b = ce0.a;
    public final lb0 a;

    public nb0(byte[] bArr) {
        jw2 k = nw2.k();
        int length = bArr.length;
        int i = b;
        int g = eq6.g(length, i);
        for (int i2 = 0; i2 < g; i2++) {
            Bundle bundle = new Bundle();
            int i3 = i2 * i;
            bundle.putByteArray("bytes", Arrays.copyOfRange(bArr, i3, Math.min(i3 + i, bArr.length)));
            k.c(bundle);
        }
        this.a = new lb0(k.g());
    }

    public static byte[] a(Bundle bundle) {
        IBinder binder = bundle.getBinder(ob0.g);
        if (binder != null) {
            try {
                nw2 a = lb0.a(binder);
                if (a.isEmpty()) {
                    return eq6.b;
                }
                byte[] byteArray = ((Bundle) bx7.z(a)).getByteArray("bytes");
                if (byteArray != null) {
                    int size = a.size() - 1;
                    int i = b;
                    int i2 = size * i;
                    byte[] bArr = new byte[byteArray.length + i2];
                    System.arraycopy(byteArray, 0, bArr, i2, byteArray.length);
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] byteArray2 = ((Bundle) a.get(i3)).getByteArray("bytes");
                        if (byteArray2 != null && byteArray2.length == i) {
                            System.arraycopy(byteArray2, 0, bArr, i3 * i, i);
                        }
                    }
                    return bArr;
                }
            } catch (RuntimeException e) {
                kb0.P("BundleableByteArray", "Failed to read byte array from bundle list retriever", e);
                return null;
            }
        }
        return null;
    }
}
