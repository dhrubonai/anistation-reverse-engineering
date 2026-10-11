package p1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new android.support.v4.media.a(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f8524a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8525b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8526c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8527d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8528e;

    /* renamed from: f, reason: collision with root package name */
    public final String f8529f;

    public u(int i10, int i11, String str, String str2, String str3, String str4) {
        this.f8524a = i10;
        this.f8525b = i11;
        this.f8526c = str;
        this.f8527d = str2;
        this.f8528e = str3;
        this.f8529f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f8524a == uVar.f8524a && this.f8525b == uVar.f8525b && TextUtils.equals(this.f8526c, uVar.f8526c) && TextUtils.equals(this.f8527d, uVar.f8527d) && TextUtils.equals(this.f8528e, uVar.f8528e) && TextUtils.equals(this.f8529f, uVar.f8529f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13 = ((this.f8524a * 31) + this.f8525b) * 31;
        int i14 = 0;
        String str = this.f8526c;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i15 = (i13 + i10) * 31;
        String str2 = this.f8527d;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i16 = (i15 + i11) * 31;
        String str3 = this.f8528e;
        if (str3 != null) {
            i12 = str3.hashCode();
        } else {
            i12 = 0;
        }
        int i17 = (i16 + i12) * 31;
        String str4 = this.f8529f;
        if (str4 != null) {
            i14 = str4.hashCode();
        }
        return i17 + i14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8524a);
        parcel.writeInt(this.f8525b);
        parcel.writeString(this.f8526c);
        parcel.writeString(this.f8527d);
        parcel.writeString(this.f8528e);
        parcel.writeString(this.f8529f);
    }

    public u(Parcel parcel) {
        this.f8524a = parcel.readInt();
        this.f8525b = parcel.readInt();
        this.f8526c = parcel.readString();
        this.f8527d = parcel.readString();
        this.f8528e = parcel.readString();
        this.f8529f = parcel.readString();
    }
}
