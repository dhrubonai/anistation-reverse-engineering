package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hc7;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new hc7((byte) 28);
    public final int x;
    public final float y;

    public RatingCompat(int i, float f) {
        this.x = i;
        this.y = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.x;
    }

    public final String toString() {
        String valueOf;
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.x);
        sb.append(" rating=");
        float f = this.y;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.x);
        parcel.writeFloat(this.y);
    }
}
