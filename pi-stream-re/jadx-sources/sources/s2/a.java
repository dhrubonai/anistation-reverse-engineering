package s2;

import android.os.Parcel;
import android.os.Parcelable;
import f1.b0;

/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new q2.b(14);

    /* renamed from: a, reason: collision with root package name */
    public final long f9852a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9853b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f9854c;

    public a(long j4, byte[] bArr, long j10) {
        this.f9852a = j10;
        this.f9853b = j4;
        this.f9854c = bArr;
    }

    @Override // s2.b
    public final String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f9852a + ", identifier= " + this.f9853b + " }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9852a);
        parcel.writeLong(this.f9853b);
        parcel.writeByteArray(this.f9854c);
    }

    public a(Parcel parcel) {
        this.f9852a = parcel.readLong();
        this.f9853b = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        int i10 = b0.f3799a;
        this.f9854c = createByteArray;
    }
}
