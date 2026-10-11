package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pt3 implements Parcelable {
    public static final Parcelable.Creator<pt3> CREATOR = new hc7((byte) 14);
    public final jq3 x;
    public final long y;
    public MediaSession.QueueItem z;

    public pt3(jq3 jq3Var, long j) {
        if (j != -1) {
            this.x = jq3Var;
            this.y = j;
            this.z = null;
            return;
        }
        ze0.k("Id cannot be QueueItem.UNKNOWN_ID");
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem { Description=");
        sb.append(this.x);
        sb.append(", Id=");
        return qx1.k(this.y, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.x.writeToParcel(parcel, i);
        parcel.writeLong(this.y);
    }

    public pt3(Parcel parcel) {
        this.x = jq3.CREATOR.createFromParcel(parcel);
        this.y = parcel.readLong();
    }
}
