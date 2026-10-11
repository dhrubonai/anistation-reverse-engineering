package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vn4 implements Parcelable {
    public static final Parcelable.Creator<vn4> CREATOR = new hc7(26);
    public final Bundle A;
    public final String x;
    public final CharSequence y;
    public final int z;

    public vn4(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        this.x = readString;
        CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        charSequence.getClass();
        this.y = charSequence;
        this.z = parcel.readInt();
        this.A = parcel.readBundle(rt3.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Action:mName='" + ((Object) this.y) + ", mIcon=" + this.z + ", mExtras=" + this.A;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.x);
        TextUtils.writeToParcel(this.y, parcel, i);
        parcel.writeInt(this.z);
        parcel.writeBundle(this.A);
    }

    public vn4(int i, Bundle bundle, String str) {
        this.x = str;
        this.y = "";
        this.z = i;
        this.A = bundle;
    }
}
