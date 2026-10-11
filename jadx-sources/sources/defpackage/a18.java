package defpackage;

import java.util.Arrays;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a18 implements Comparable {
    public static final /* synthetic */ long z = qs.a.objectFieldOffset(a18.class.getDeclaredField("y"));
    public final String x;
    public volatile Object y;

    public /* synthetic */ a18(String str, byte[] bArr) {
        this.x = str;
        this.y = bArr;
    }

    public final /* synthetic */ void a(byte[] bArr) {
        byte[][] bArr2;
        a18 a18Var;
        int i = 0;
        while (true) {
            Object obj = this.y;
            if (obj instanceof byte[]) {
                byte[] bArr3 = (byte[]) obj;
                if (!Arrays.equals(bArr, bArr3)) {
                    i = 1;
                    bArr2 = new byte[][]{bArr3, bArr};
                } else {
                    return;
                }
            } else {
                byte[][] bArr4 = (byte[][]) obj;
                while (true) {
                    int length = bArr4.length;
                    if (i < length) {
                        if (!Arrays.equals(bArr, bArr4[i])) {
                            i++;
                        } else {
                            return;
                        }
                    } else {
                        bArr2 = (byte[][]) Arrays.copyOf(bArr4, length + 1);
                        bArr2[length] = bArr;
                        break;
                    }
                }
            }
            byte[][] bArr5 = bArr2;
            while (true) {
                Unsafe unsafe = qs.a;
                long j = z;
                a18Var = this;
                if (unsafe.compareAndSwapObject(a18Var, j, obj, bArr5)) {
                    return;
                }
                if (unsafe.getObjectVolatile(a18Var, j) != obj) {
                    break;
                } else {
                    this = a18Var;
                }
            }
            this = a18Var;
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.x.compareTo((String) obj);
    }
}
