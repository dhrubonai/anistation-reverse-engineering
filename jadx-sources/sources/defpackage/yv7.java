package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yv7 extends y2 {
    public static final Parcelable.Creator<yv7> CREATOR = new an7(29);
    public final byte[][] A;
    public final byte[][] B;
    public final byte[][] C;
    public final int[] D;
    public final byte[][] E;
    public final int[] F;
    public final byte[][] G;
    public final String x;
    public final byte[] y;
    public final byte[][] z;

    public yv7(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6, int[] iArr2, byte[][] bArr7) {
        this.x = str;
        this.y = bArr;
        this.z = bArr2;
        this.A = bArr3;
        this.B = bArr4;
        this.C = bArr5;
        this.D = iArr;
        this.E = bArr6;
        this.F = iArr2;
        this.G = bArr7;
    }

    public static void c(StringBuilder sb, String str, byte[][] bArr) {
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            sb.append("null");
            return;
        }
        sb.append("(");
        boolean z = true;
        int i = 0;
        while (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (!z) {
                sb.append(", ");
            }
            sb.append("'");
            a34.x(bArr2);
            sb.append(Base64.encodeToString(bArr2, 3));
            sb.append("'");
            i++;
            z = false;
        }
        sb.append(")");
    }

    public static Set f(byte[][] bArr) {
        int length;
        if (bArr != null && (length = bArr.length) != 0) {
            HashSet hashSet = new HashSet(t80.s(length));
            for (byte[] bArr2 : bArr) {
                a34.x(bArr2);
                hashSet.add(Base64.encodeToString(bArr2, 3));
            }
            return hashSet;
        }
        return Collections.EMPTY_SET;
    }

    public static List g(int[] iArr) {
        if (iArr == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length >> 1);
        for (int i = 0; i < iArr.length; i += 2) {
            arrayList.add(new hw7(iArr[i], iArr[i + 1]));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final Set d() {
        ArrayList arrayList = new ArrayList();
        byte[][] bArr = this.E;
        if (bArr != null) {
            Collections.addAll(arrayList, bArr);
        }
        byte[] bArr2 = this.y;
        if (bArr2 != null) {
            arrayList.add(bArr2);
        }
        return f((byte[][]) arrayList.toArray(new byte[0]));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashSet] */
    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        int length;
        int length2;
        if (obj instanceof yv7) {
            yv7 yv7Var = (yv7) obj;
            if (ss5.l(this.x, yv7Var.x) && ss5.l(d(), yv7Var.d()) && ss5.l(f(this.z), f(yv7Var.z)) && ss5.l(f(this.A), f(yv7Var.A)) && ss5.l(f(this.B), f(yv7Var.B)) && ss5.l(f(this.C), f(yv7Var.C))) {
                int[] iArr = this.D;
                if (iArr != null && (length2 = iArr.length) != 0) {
                    obj2 = new HashSet(t80.s(length2));
                    for (int i : iArr) {
                        obj2.add(Integer.valueOf(i));
                    }
                } else {
                    obj2 = Collections.EMPTY_SET;
                }
                int[] iArr2 = yv7Var.D;
                if (iArr2 != null && (length = iArr2.length) != 0) {
                    obj3 = new HashSet(t80.s(length));
                    for (int i2 : iArr2) {
                        obj3.add(Integer.valueOf(i2));
                    }
                } else {
                    obj3 = Collections.EMPTY_SET;
                }
                if (ss5.l(obj2, obj3) && ss5.l(g(this.F), g(yv7Var.F)) && ss5.l(f(this.G), f(yv7Var.G))) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        String q;
        StringBuilder sb = new StringBuilder("ExperimentTokens");
        sb.append("(");
        String str = this.x;
        if (str == null) {
            q = "null";
        } else {
            q = qx1.q(new StringBuilder(str.length() + 2), "'", str, "'");
        }
        sb.append(q);
        sb.append(", direct==");
        byte[] bArr = this.y;
        if (bArr == null) {
            sb.append("null");
        } else {
            sb.append("'");
            sb.append(Base64.encodeToString(bArr, 3));
            sb.append("'");
        }
        sb.append(", ");
        c(sb, "GAIA=", this.z);
        sb.append(", ");
        c(sb, "PSEUDO=", this.A);
        sb.append(", ");
        c(sb, "ALWAYS=", this.B);
        sb.append(", ");
        c(sb, "OTHER=", this.C);
        sb.append(", weak=");
        sb.append(Arrays.toString(this.D));
        sb.append(", ");
        c(sb, "directs=", this.E);
        sb.append(", genDims=");
        sb.append(Arrays.toString(g(this.F).toArray()));
        sb.append(", ");
        c(sb, "external=", this.G);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, this.x);
        z51.a0(parcel, 3, this.y);
        z51.b0(parcel, 4, this.z);
        z51.b0(parcel, 5, this.A);
        z51.b0(parcel, 6, this.B);
        z51.b0(parcel, 7, this.C);
        z51.d0(parcel, 8, this.D);
        z51.b0(parcel, 9, this.E);
        z51.d0(parcel, 10, this.F);
        z51.b0(parcel, 11, this.G);
        z51.t0(parcel, s0);
    }
}
