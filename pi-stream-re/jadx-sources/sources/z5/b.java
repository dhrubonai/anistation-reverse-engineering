package z5;

import a3.g;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p5.i;

/* loaded from: classes.dex */
public final class b extends View.BaseSavedState {
    public static final Parcelable.Creator<b> CREATOR = new i(12);

    /* renamed from: a, reason: collision with root package name */
    public int f12060a;

    public b(Parcel parcel) {
        super(parcel);
        this.f12060a = ((Integer) parcel.readValue(b.class.getClassLoader())).intValue();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i10 = this.f12060a;
        if (i10 != 1) {
            if (i10 != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
        } else {
            str = "checked";
        }
        return g.t(sb, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeValue(Integer.valueOf(this.f12060a));
    }
}
