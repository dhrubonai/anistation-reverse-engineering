package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m13 implements Parcelable {
    public static final Parcelable.Creator<m13> CREATOR = new hc7((byte) 8);
    public final int A;
    public final IntentSender x;
    public final Intent y;
    public final int z;

    public m13(IntentSender intentSender, Intent intent, int i, int i2) {
        this.x = intentSender;
        this.y = intent;
        this.z = i;
        this.A = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.x, i);
        parcel.writeParcelable(this.y, i);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
    }
}
