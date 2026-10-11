package p2;

import android.os.Parcel;
import android.os.Parcelable;
import c1.m0;
import c1.o0;
import c1.v;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements o0 {
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.a(28);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f8552a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8553b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8554c;

    public c(String str, String str2, byte[] bArr) {
        this.f8552a = bArr;
        this.f8553b = str;
        this.f8554c = str2;
    }

    @Override // c1.o0
    public final void a(m0 m0Var) {
        String str = this.f8553b;
        if (str != null) {
            m0Var.f1810a = str;
        }
    }

    @Override // c1.o0
    public final /* synthetic */ v b() {
        return null;
    }

    @Override // c1.o0
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            return Arrays.equals(this.f8552a, ((c) obj).f8552a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8552a);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f8553b, this.f8554c, Integer.valueOf(this.f8552a.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(this.f8552a);
        parcel.writeString(this.f8553b);
        parcel.writeString(this.f8554c);
    }

    public c(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        createByteArray.getClass();
        this.f8552a = createByteArray;
        this.f8553b = parcel.readString();
        this.f8554c = parcel.readString();
    }
}
