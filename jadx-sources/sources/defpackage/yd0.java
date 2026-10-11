package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class yd0 implements Comparable {
    public final byte[] x;
    public int y;
    public static final yd0 z = new yd0(new byte[0]);
    public static final char[] A = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yd0(byte[] bArr, int i, int i2) {
        this(ms.C0(bArr, i, i2));
        bArr.getClass();
    }

    public final byte a(int i) {
        byte[] bArr = this.x;
        if (i >= 0 && i < bArr.length) {
            return bArr[i];
        }
        ze0.g(qx1.o(qx1.s(i, "index (", ") is out of byte string bounds: [0.."), bArr.length, ')'));
        return (byte) 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        yd0 yd0Var = (yd0) obj;
        yd0Var.getClass();
        byte[] bArr = yd0Var.x;
        if (yd0Var == this) {
            return 0;
        }
        byte[] bArr2 = this.x;
        int min = Math.min(bArr2.length, bArr.length);
        for (int i = 0; i < min; i++) {
            int D = a34.D(bArr2[i] & 255, bArr[i] & 255);
            if (D != 0) {
                return D;
            }
        }
        return a34.D(bArr2.length, bArr.length);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || yd0.class != obj.getClass()) {
            return false;
        }
        yd0 yd0Var = (yd0) obj;
        byte[] bArr = yd0Var.x;
        int length = bArr.length;
        byte[] bArr2 = this.x;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = yd0Var.y;
        if (i2 != 0 && (i = this.y) != 0 && i2 != i) {
            return false;
        }
        return Arrays.equals(bArr2, bArr);
    }

    public final int hashCode() {
        int i = this.y;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.x);
            this.y = hashCode;
            return hashCode;
        }
        return i;
    }

    public final String toString() {
        byte[] bArr = this.x;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String valueOf = String.valueOf(bArr.length);
        StringBuilder sb = new StringBuilder((bArr.length * 2) + valueOf.length() + 22);
        sb.append("ByteString(size=");
        sb.append(valueOf);
        sb.append(" hex=");
        for (byte b : bArr) {
            char[] cArr = A;
            sb.append(cArr[(b >>> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        sb.append(')');
        return sb.toString();
    }

    public yd0(byte[] bArr) {
        this.x = bArr;
    }
}
