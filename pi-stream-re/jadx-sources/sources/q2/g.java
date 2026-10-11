package q2;

import android.os.Parcel;
import android.os.Parcelable;
import f1.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends k {
    public static final Parcelable.Creator<g> CREATOR = new b(4);

    /* renamed from: b, reason: collision with root package name */
    public final String f9097b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9098c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9099d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f9100e;

    public g(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f9097b = str;
        this.f9098c = str2;
        this.f9099d = str3;
        this.f9100e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (b0.a(this.f9097b, gVar.f9097b) && b0.a(this.f9098c, gVar.f9098c) && b0.a(this.f9099d, gVar.f9099d) && Arrays.equals(this.f9100e, gVar.f9100e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        String str = this.f9097b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (527 + i10) * 31;
        String str2 = this.f9098c;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (i13 + i11) * 31;
        String str3 = this.f9099d;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return Arrays.hashCode(this.f9100e) + ((i14 + i12) * 31);
    }

    @Override // q2.k
    public final String toString() {
        return this.f9106a + ": mimeType=" + this.f9097b + ", filename=" + this.f9098c + ", description=" + this.f9099d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f9097b);
        parcel.writeString(this.f9098c);
        parcel.writeString(this.f9099d);
        parcel.writeByteArray(this.f9100e);
    }

    public g(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i10 = b0.f3799a;
        this.f9097b = readString;
        this.f9098c = parcel.readString();
        this.f9099d = parcel.readString();
        this.f9100e = parcel.createByteArray();
    }
}
