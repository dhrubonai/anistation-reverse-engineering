package m6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.widget.p3;

/* loaded from: classes.dex */
public final class z extends n0.b {
    public static final Parcelable.Creator<z> CREATOR = new p3(10);

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f7554c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7555d;

    public z(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f7554c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f7555d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f7554c) + "}";
    }

    @Override // n0.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7897a, i10);
        TextUtils.writeToParcel(this.f7554c, parcel, i10);
        parcel.writeInt(this.f7555d ? 1 : 0);
    }
}
