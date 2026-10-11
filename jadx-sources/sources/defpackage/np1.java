package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class np1 implements Parcelable {
    public static final Parcelable.Creator<np1> CREATOR = new hc7((byte) 7);
    public final String A;
    public final byte[] B;
    public int x;
    public final UUID y;
    public final String z;

    public np1(Parcel parcel) {
        this.y = new UUID(parcel.readLong(), parcel.readLong());
        this.z = parcel.readString();
        String readString = parcel.readString();
        String str = eq6.a;
        this.A = readString;
        this.B = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = ce0.b;
        UUID uuid3 = this.y;
        if (!uuid2.equals(uuid3) && !uuid.equals(uuid3)) {
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof np1)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        np1 np1Var = (np1) obj;
        if (!Objects.equals(this.z, np1Var.z) || !Objects.equals(this.A, np1Var.A) || !Objects.equals(this.y, np1Var.y) || !Arrays.equals(this.B, np1Var.B)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.x;
        if (i == 0) {
            int hashCode2 = this.y.hashCode() * 31;
            String str = this.z;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int hashCode3 = Arrays.hashCode(this.B) + zo5.i(this.A, (hashCode2 + hashCode) * 31, 31);
            this.x = hashCode3;
            return hashCode3;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.y;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.z);
        parcel.writeString(this.A);
        parcel.writeByteArray(this.B);
    }

    public np1(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.y = uuid;
        this.z = str;
        str2.getClass();
        this.A = qy3.n(str2);
        this.B = bArr;
    }
}
