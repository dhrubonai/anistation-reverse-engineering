package x5;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.p3;

/* loaded from: classes.dex */
public final class b extends n0.b {
    public static final Parcelable.Creator<b> CREATOR = new p3(7);

    /* renamed from: c, reason: collision with root package name */
    public boolean f11280c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            b.class.getClassLoader();
        }
        this.f11280c = parcel.readInt() == 1;
    }

    @Override // n0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7897a, i10);
        parcel.writeInt(this.f11280c ? 1 : 0);
    }
}
