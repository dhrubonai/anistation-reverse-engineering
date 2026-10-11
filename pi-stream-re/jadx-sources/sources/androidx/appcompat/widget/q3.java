package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q3 extends n0.b {
    public static final Parcelable.Creator<q3> CREATOR = new p3(0);

    /* renamed from: c, reason: collision with root package name */
    public boolean f622c;

    public q3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f622c = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f622c + "}";
    }

    @Override // n0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7897a, i10);
        parcel.writeValue(Boolean.valueOf(this.f622c));
    }
}
