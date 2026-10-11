package defpackage;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ay4 implements Parcelable {
    public static final Parcelable.Creator<ay4> CREATOR = new hc7(27);
    public final int x;
    public final float y;
    public Rating z;

    public ay4(int i, float f) {
        this.x = i;
        this.y = f;
    }

    public static ay4 c(float f) {
        if (f >= 0.0f && f <= 100.0f) {
            return new ay4(6, f);
        }
        kb0.s("Rating", "Invalid percentage-based rating value");
        return null;
    }

    public static ay4 d(int i, float f) {
        float f2;
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    kb0.s("Rating", "Invalid rating style (" + i + ") for a star rating");
                    return null;
                }
                f2 = 5.0f;
            } else {
                f2 = 4.0f;
            }
        } else {
            f2 = 3.0f;
        }
        if (f >= 0.0f && f <= f2) {
            return new ay4(i, f);
        }
        kb0.s("Rating", "Trying to set out of range star-based rating");
        return null;
    }

    public final float a() {
        int i = this.x;
        if ((i == 3 || i == 4 || i == 5) && b()) {
            return this.y;
        }
        return -1.0f;
    }

    public final boolean b() {
        if (this.y >= 0.0f) {
            return true;
        }
        return false;
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
