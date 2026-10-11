package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import q2.b;
import s3.c;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new b(23);

    /* renamed from: a, reason: collision with root package name */
    public final c f1274a;

    public ParcelImpl(Parcel parcel) {
        this.f1274a = new s3.b(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        new s3.b(parcel).l(this.f1274a);
    }
}
