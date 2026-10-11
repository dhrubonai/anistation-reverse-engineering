package m3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.p3;

/* loaded from: classes.dex */
public final class t0 extends n0.b {
    public static final Parcelable.Creator<t0> CREATOR = new p3(4);

    /* renamed from: c, reason: collision with root package name */
    public Parcelable f7368c;

    public t0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7368c = parcel.readParcelable(classLoader == null ? k0.class.getClassLoader() : classLoader);
    }

    @Override // n0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7897a, i10);
        parcel.writeParcelable(this.f7368c, 0);
    }
}
