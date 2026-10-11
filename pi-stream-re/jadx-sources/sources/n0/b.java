package n0;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.p3;

/* loaded from: classes.dex */
public abstract class b implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f7897a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f7896b = new a();
    public static final Parcelable.Creator<b> CREATOR = new p3(3);

    public b() {
        this.f7897a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7897a, i10);
    }

    public b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f7897a = parcelable == f7896b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f7897a = readParcelable == null ? f7896b : readParcelable;
    }
}
