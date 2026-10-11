package k6;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.appcompat.widget.p3;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class b extends n0.b {
    public static final Parcelable.Creator<b> CREATOR = new p3(9);

    /* renamed from: c, reason: collision with root package name */
    public final int f6479c;

    public b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f6479c = parcel.readInt();
    }

    @Override // n0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7897a, i10);
        parcel.writeInt(this.f6479c);
    }

    public b(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f6479c = sideSheetBehavior.f2782h;
    }
}
