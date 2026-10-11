package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class u0 extends View.BaseSavedState {
    public static final Parcelable.Creator<u0> CREATOR = new android.support.v4.media.a(7);

    /* renamed from: a, reason: collision with root package name */
    public boolean f660a;

    public u0(Parcel parcel) {
        super(parcel);
        boolean z9;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f660a = z9;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeByte(this.f660a ? (byte) 1 : (byte) 0);
    }
}
