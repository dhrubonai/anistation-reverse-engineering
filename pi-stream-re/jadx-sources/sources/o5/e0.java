package o5;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class e0 implements Parcelable {

    /* JADX INFO: Fake field, exist only in values array */
    e0 EF2;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ e0[] f8213a = {new e0()};
    public static final Parcelable.Creator<e0> CREATOR = new t0(3);

    public static e0 d(String str) {
        for (e0 e0Var : values()) {
            e0Var.getClass();
            if (str.equals("public-key")) {
                return e0Var;
            }
        }
        throw new d0(String.format("PublicKeyCredentialType %s not supported", str));
    }

    public static e0 valueOf(String str) {
        return (e0) Enum.valueOf(e0.class, str);
    }

    public static e0[] values() {
        return (e0[]) f8213a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "public-key";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString("public-key");
    }
}
