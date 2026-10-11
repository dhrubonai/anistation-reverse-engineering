package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zv7 extends y2 implements Comparable {
    public static final Parcelable.Creator<zv7> CREATOR = new aw7((byte) 0);
    public final double A;
    public final String B;
    public final byte[] C;
    public final int D;
    public final int E;
    public final int F;
    public final String x;
    public final long y;
    public final boolean z;

    public zv7(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2, int i3) {
        this.x = str;
        this.y = j;
        this.z = z;
        this.A = d;
        this.B = str2;
        this.C = bArr;
        this.D = i;
        this.E = i2;
        this.F = i3;
    }

    public final void c(StringBuilder sb) {
        sb.append("Flag(");
        String str = this.x;
        sb.append(str);
        sb.append(", ");
        int i = this.D;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            sb.append("'");
                            byte[] bArr = this.C;
                            a34.x(bArr);
                            sb.append(Base64.encodeToString(bArr, 3));
                            sb.append("'");
                        } else {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(i).length());
                            sb2.append("Invalid type: ");
                            sb2.append(str);
                            sb2.append(", ");
                            sb2.append(i);
                            throw new AssertionError(sb2.toString());
                        }
                    } else {
                        sb.append("'");
                        String str2 = this.B;
                        a34.x(str2);
                        sb.append(str2);
                        sb.append("'");
                    }
                } else {
                    sb.append(this.A);
                }
            } else {
                sb.append(this.z);
            }
        } else {
            sb.append(this.y);
        }
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(this.E);
        sb.append(", ");
        sb.append(this.F);
        sb.append(")");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            zv7 r8 = (defpackage.zv7) r8
            java.lang.String r0 = r8.x
            java.lang.String r1 = r7.x
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto Ld
            return r0
        Ld:
            int r0 = r8.D
            r1 = -1
            r2 = 0
            r3 = 1
            int r4 = r7.D
            if (r4 >= r0) goto L18
            r0 = r1
            goto L1d
        L18:
            if (r4 == r0) goto L1c
            r0 = r3
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 == 0) goto L20
            return r0
        L20:
            if (r4 == r3) goto L99
            r0 = 2
            if (r4 == r0) goto L8f
            r0 = 3
            if (r4 == r0) goto L86
            r0 = 4
            if (r4 == r0) goto L74
            r0 = 5
            if (r4 != r0) goto L59
            byte[] r8 = r8.C
            byte[] r7 = r7.C
            if (r7 != r8) goto L36
            goto La4
        L36:
            if (r7 != 0) goto L3a
            goto La1
        L3a:
            if (r8 != 0) goto L3e
            goto La5
        L3e:
            r0 = r2
        L3f:
            int r4 = r8.length
            int r5 = r7.length
            int r6 = java.lang.Math.min(r5, r4)
            if (r0 >= r6) goto L52
            r4 = r7[r0]
            r5 = r8[r0]
            int r4 = r4 - r5
            if (r4 == 0) goto L4f
            return r4
        L4f:
            int r0 = r0 + 1
            goto L3f
        L52:
            if (r5 >= r4) goto L55
            return r1
        L55:
            if (r5 == r4) goto L58
            return r3
        L58:
            return r2
        L59:
            java.lang.AssertionError r7 = new java.lang.AssertionError
            java.lang.String r8 = java.lang.String.valueOf(r4)
            int r8 = r8.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r8 = r8 + 20
            r0.<init>(r8)
            java.lang.String r8 = "Invalid enum value: "
            java.lang.String r8 = defpackage.h11.g(r4, r8, r0)
            r7.<init>(r8)
            throw r7
        L74:
            java.lang.String r8 = r8.B
            java.lang.String r7 = r7.B
            if (r7 != r8) goto L7b
            goto La4
        L7b:
            if (r7 != 0) goto L7e
            goto La1
        L7e:
            if (r8 != 0) goto L81
            goto La5
        L81:
            int r7 = r7.compareTo(r8)
            return r7
        L86:
            double r0 = r7.A
            double r7 = r8.A
            int r7 = java.lang.Double.compare(r0, r7)
            return r7
        L8f:
            boolean r8 = r8.z
            boolean r7 = r7.z
            if (r7 != r8) goto L96
            goto La4
        L96:
            if (r7 == 0) goto La1
            goto La5
        L99:
            long r4 = r7.y
            long r7 = r8.y
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 >= 0) goto La2
        La1:
            return r1
        La2:
            if (r7 != 0) goto La5
        La4:
            return r2
        La5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zv7.compareTo(java.lang.Object):int");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zv7) {
            zv7 zv7Var = (zv7) obj;
            if (ss5.l(this.x, zv7Var.x)) {
                int i = zv7Var.D;
                int i2 = this.D;
                if (i2 == i && this.E == zv7Var.E && this.F == zv7Var.F) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 != 4) {
                                    if (i2 == 5) {
                                        return Arrays.equals(this.C, zv7Var.C);
                                    }
                                    throw new AssertionError(h11.g(i2, "Invalid enum value: ", new StringBuilder(String.valueOf(i2).length() + 20)));
                                }
                                return ss5.l(this.B, zv7Var.B);
                            }
                            if (this.A != zv7Var.A) {
                                return false;
                            }
                            return true;
                        }
                        if (this.z != zv7Var.z) {
                            return false;
                        }
                        return true;
                    }
                    if (this.y != zv7Var.y) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        c(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z;
        String str = this.x;
        if (str == null) {
            z = true;
        } else {
            z = false;
        }
        int s0 = z51.s0(parcel, 20293);
        if (!z) {
            z51.m0(parcel, 2, str);
        }
        long j = this.y;
        if (j != 0) {
            z51.r0(parcel, 3, 8);
            parcel.writeLong(j);
        }
        if (this.z) {
            z51.r0(parcel, 4, 4);
            parcel.writeInt(1);
        }
        double d = this.A;
        if (d != 0.0d) {
            z51.r0(parcel, 5, 8);
            parcel.writeDouble(d);
        }
        String str2 = this.B;
        if (str2 != null) {
            z51.m0(parcel, 6, str2);
        }
        byte[] bArr = this.C;
        if (bArr != null) {
            z51.a0(parcel, 7, bArr);
        }
        int i2 = this.D;
        if (i2 != 0) {
            z51.r0(parcel, 8, 4);
            parcel.writeInt(i2);
        }
        int i3 = this.E;
        if (i3 != 0) {
            z51.r0(parcel, 9, 4);
            parcel.writeInt(i3);
        }
        int i4 = this.F;
        if (i4 != 0) {
            z51.r0(parcel, 10, 4);
            parcel.writeInt(i4);
        }
        z51.t0(parcel, s0);
    }
}
