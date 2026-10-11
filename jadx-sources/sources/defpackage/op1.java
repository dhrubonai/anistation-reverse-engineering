package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class op1 implements Comparator, Parcelable {
    public static final Parcelable.Creator<op1> CREATOR = new hc7(6);
    public final int A;
    public final np1[] x;
    public int y;
    public final String z;

    public op1(Parcel parcel) {
        this.z = parcel.readString();
        np1[] np1VarArr = (np1[]) parcel.createTypedArray(np1.CREATOR);
        String str = eq6.a;
        this.x = np1VarArr;
        this.A = np1VarArr.length;
    }

    public final op1 a(String str) {
        if (Objects.equals(this.z, str)) {
            return this;
        }
        return new op1(str, false, this.x);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        np1 np1Var = (np1) obj;
        np1 np1Var2 = (np1) obj2;
        UUID uuid = ce0.b;
        if (uuid.equals(np1Var.y)) {
            if (uuid.equals(np1Var2.y)) {
                return 0;
            }
            return 1;
        }
        return np1Var.y.compareTo(np1Var2.y);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && op1.class == obj.getClass()) {
            op1 op1Var = (op1) obj;
            if (Objects.equals(this.z, op1Var.z) && Arrays.equals(this.x, op1Var.x)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.y;
        if (i == 0) {
            String str = this.z;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode2 = (hashCode * 31) + Arrays.hashCode(this.x);
            this.y = hashCode2;
            return hashCode2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.z);
        parcel.writeTypedArray(this.x, 0);
    }

    public op1(String str, boolean z, np1... np1VarArr) {
        this.z = str;
        np1VarArr = z ? (np1[]) np1VarArr.clone() : np1VarArr;
        this.x = np1VarArr;
        this.A = np1VarArr.length;
        Arrays.sort(np1VarArr, this);
    }
}
