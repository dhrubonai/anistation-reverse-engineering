package m3;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new q2.b(20);

    /* renamed from: a, reason: collision with root package name */
    public int f7388a;

    /* renamed from: b, reason: collision with root package name */
    public int f7389b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7390c;

    public v(Parcel parcel) {
        this.f7388a = parcel.readInt();
        this.f7389b = parcel.readInt();
        this.f7390c = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7388a);
        parcel.writeInt(this.f7389b);
        parcel.writeInt(this.f7390c ? 1 : 0);
    }

    public v(v vVar) {
        this.f7388a = vVar.f7388a;
        this.f7389b = vVar.f7389b;
        this.f7390c = vVar.f7390c;
    }
}
