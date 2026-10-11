package m3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h1 implements Parcelable {
    public static final Parcelable.Creator<h1> CREATOR = new q2.b(21);

    /* renamed from: a, reason: collision with root package name */
    public int f7236a;

    /* renamed from: b, reason: collision with root package name */
    public int f7237b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f7238c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7239d;

    public h1(Parcel parcel) {
        this.f7236a = parcel.readInt();
        this.f7237b = parcel.readInt();
        this.f7239d = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f7238c = iArr;
            parcel.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f7236a + ", mGapDir=" + this.f7237b + ", mHasUnwantedGapAfter=" + this.f7239d + ", mGapPerSpan=" + Arrays.toString(this.f7238c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7236a);
        parcel.writeInt(this.f7237b);
        parcel.writeInt(this.f7239d ? 1 : 0);
        int[] iArr = this.f7238c;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f7238c);
        } else {
            parcel.writeInt(0);
        }
    }
}
