package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f238a;

    /* renamed from: b, reason: collision with root package name */
    public final int f239b;

    /* renamed from: c, reason: collision with root package name */
    public final int f240c;

    /* renamed from: d, reason: collision with root package name */
    public final int f241d;

    /* renamed from: e, reason: collision with root package name */
    public final int f242e;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f238a = parcel.readInt();
        this.f240c = parcel.readInt();
        this.f241d = parcel.readInt();
        this.f242e = parcel.readInt();
        this.f239b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f238a);
        parcel.writeInt(this.f240c);
        parcel.writeInt(this.f241d);
        parcel.writeInt(this.f242e);
        parcel.writeInt(this.f239b);
    }
}
