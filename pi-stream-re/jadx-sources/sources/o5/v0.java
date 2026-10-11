package o5;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public enum v0 implements Parcelable {
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_REQUIRED("required"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_PREFERRED("preferred"),
    /* JADX INFO: Fake field, exist only in values array */
    USER_VERIFICATION_DISCOURAGED("discouraged");

    public static final Parcelable.Creator<v0> CREATOR = new t0(9);

    /* renamed from: a, reason: collision with root package name */
    public final String f8280a;

    v0(String str) {
        this.f8280a = str;
    }

    public static v0 d(String str) {
        for (v0 v0Var : values()) {
            if (str.equals(v0Var.f8280a)) {
                return v0Var;
            }
        }
        throw new u0(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8280a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8280a);
    }
}
