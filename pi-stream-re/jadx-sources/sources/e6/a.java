package e6;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.p3;

/* loaded from: classes.dex */
public final class a extends n0.b {
    public static final Parcelable.Creator<a> CREATOR = new p3(8);

    /* renamed from: c, reason: collision with root package name */
    public boolean f3541c;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3541c = parcel.readInt() == 1;
    }

    @Override // n0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7897a, i10);
        parcel.writeInt(this.f3541c ? 1 : 0);
    }
}
