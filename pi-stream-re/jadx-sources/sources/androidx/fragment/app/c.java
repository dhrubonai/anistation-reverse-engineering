package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new android.support.v4.media.a(10);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f849a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f850b;

    public c(Parcel parcel) {
        this.f849a = parcel.createStringArrayList();
        this.f850b = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f849a);
        parcel.writeTypedList(this.f850b);
    }
}
