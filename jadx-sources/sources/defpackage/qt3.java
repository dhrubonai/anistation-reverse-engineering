package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qt3 implements Parcelable {
    public static final Parcelable.Creator<qt3> CREATOR = new hc7(16);
    public final MediaSession.Token y;
    public kt2 z;
    public final Object x = new Object();
    public ds6 A = null;

    public qt3(MediaSession.Token token, lt3 lt3Var) {
        this.y = token;
        this.z = lt3Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qt3)) {
            return false;
        }
        return this.y.equals(((qt3) obj).y);
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.y, i);
    }
}
