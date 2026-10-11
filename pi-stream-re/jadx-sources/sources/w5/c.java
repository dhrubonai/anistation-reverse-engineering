package w5;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.appcompat.widget.p3;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class c extends n0.b {
    public static final Parcelable.Creator<c> CREATOR = new p3(6);

    /* renamed from: c, reason: collision with root package name */
    public final int f11000c;

    /* renamed from: d, reason: collision with root package name */
    public final int f11001d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f11002e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11003f;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f11004x;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f11000c = parcel.readInt();
        this.f11001d = parcel.readInt();
        this.f11002e = parcel.readInt() == 1;
        this.f11003f = parcel.readInt() == 1;
        this.f11004x = parcel.readInt() == 1;
    }

    @Override // n0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7897a, i10);
        parcel.writeInt(this.f11000c);
        parcel.writeInt(this.f11001d);
        parcel.writeInt(this.f11002e ? 1 : 0);
        parcel.writeInt(this.f11003f ? 1 : 0);
        parcel.writeInt(this.f11004x ? 1 : 0);
    }

    public c(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f11000c = bottomSheetBehavior.L;
        this.f11001d = bottomSheetBehavior.f2659e;
        this.f11002e = bottomSheetBehavior.f2653b;
        this.f11003f = bottomSheetBehavior.I;
        this.f11004x = bottomSheetBehavior.J;
    }
}
