package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import defpackage.hc7;
import defpackage.qx1;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MediaSessionCompat$QueueItem implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new hc7((byte) 15);
    public final MediaDescriptionCompat x;
    public final long y;

    public MediaSessionCompat$QueueItem(Parcel parcel) {
        this.x = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        this.y = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.x);
        sb.append(", Id=");
        return qx1.k(this.y, " }", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.x.writeToParcel(parcel, i);
        parcel.writeLong(this.y);
    }
}
