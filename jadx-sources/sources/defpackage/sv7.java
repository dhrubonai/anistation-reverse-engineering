package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sv7 extends y2 {
    public static final Parcelable.Creator<sv7> CREATOR = new an7(27);
    public final qv7[] A;
    public final TreeMap B = new TreeMap();
    public final boolean C;
    public final long D;
    public final String x;
    public final byte[] y;
    public final String z;

    public sv7(String str, String str2, qv7[] qv7VarArr, boolean z, byte[] bArr, long j) {
        this.x = str;
        this.z = str2;
        this.A = qv7VarArr;
        this.C = z;
        this.y = bArr;
        this.D = j;
        for (qv7 qv7Var : qv7VarArr) {
            this.B.put(Integer.valueOf(qv7Var.x), qv7Var);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sv7) {
            sv7 sv7Var = (sv7) obj;
            if (ss5.l(this.x, sv7Var.x) && ss5.l(this.z, sv7Var.z) && this.B.equals(sv7Var.B) && this.C == sv7Var.C && Arrays.equals(this.y, sv7Var.y) && this.D == sv7Var.D) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, this.z, this.B, Boolean.valueOf(this.C), this.y, Long.valueOf(this.D)});
    }

    public final String toString() {
        String encodeToString;
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.x);
        sb.append("', '");
        sb.append(this.z);
        sb.append("', (");
        Iterator it = this.B.values().iterator();
        while (it.hasNext()) {
            sb.append((qv7) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.C);
        sb.append(", ");
        byte[] bArr = this.y;
        if (bArr == null) {
            encodeToString = "null";
        } else {
            encodeToString = Base64.encodeToString(bArr, 3);
        }
        sb.append(encodeToString);
        sb.append(", ");
        sb.append(this.D);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, this.x);
        z51.m0(parcel, 3, this.z);
        z51.o0(parcel, 4, this.A, i);
        z51.r0(parcel, 5, 4);
        parcel.writeInt(this.C ? 1 : 0);
        z51.a0(parcel, 6, this.y);
        z51.r0(parcel, 7, 8);
        parcel.writeLong(this.D);
        z51.t0(parcel, s0);
    }
}
