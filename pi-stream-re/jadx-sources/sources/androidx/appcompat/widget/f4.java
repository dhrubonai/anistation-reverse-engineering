package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f4 extends n0.b {
    public static final Parcelable.Creator<f4> CREATOR = new p3(1);

    /* renamed from: c, reason: collision with root package name */
    public int f484c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f485d;

    public f4(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z9;
        this.f484c = parcel.readInt();
        if (parcel.readInt() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f485d = z9;
    }

    @Override // n0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7897a, i10);
        parcel.writeInt(this.f484c);
        parcel.writeInt(this.f485d ? 1 : 0);
    }
}
