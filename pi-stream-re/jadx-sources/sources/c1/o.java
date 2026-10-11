package c1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: classes.dex */
public final class o implements Parcelable {
    public static final Parcelable.Creator<o> CREATOR = new android.support.v4.media.a(15);

    /* renamed from: a, reason: collision with root package name */
    public int f1867a;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f1868b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1869c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1870d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f1871e;

    public o(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f1868b = uuid;
        this.f1869c = str;
        str2.getClass();
        this.f1870d = q0.o(str2);
        this.f1871e = bArr;
    }

    public final boolean d(UUID uuid) {
        UUID uuid2 = j.f1723a;
        UUID uuid3 = this.f1868b;
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
        if (!(obj instanceof o)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        o oVar = (o) obj;
        if (!f1.b0.a(this.f1869c, oVar.f1869c) || !f1.b0.a(this.f1870d, oVar.f1870d) || !f1.b0.a(this.f1868b, oVar.f1868b) || !Arrays.equals(this.f1871e, oVar.f1871e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f1867a == 0) {
            int hashCode2 = this.f1868b.hashCode() * 31;
            String str = this.f1869c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f1867a = Arrays.hashCode(this.f1871e) + ((this.f1870d.hashCode() + ((hashCode2 + hashCode) * 31)) * 31);
        }
        return this.f1867a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        UUID uuid = this.f1868b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f1869c);
        parcel.writeString(this.f1870d);
        parcel.writeByteArray(this.f1871e);
    }

    public o(Parcel parcel) {
        this.f1868b = new UUID(parcel.readLong(), parcel.readLong());
        this.f1869c = parcel.readString();
        String readString = parcel.readString();
        int i10 = f1.b0.f3799a;
        this.f1870d = readString;
        this.f1871e = parcel.createByteArray();
    }
}
