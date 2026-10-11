package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.ds6;
import defpackage.hc7;
import defpackage.lt2;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new hc7(17);
    public final Object y;
    public lt2 z;
    public final Object x = new Object();
    public ds6 A = null;

    public MediaSessionCompat$Token(Parcelable parcelable, b bVar) {
        this.y = parcelable;
        this.z = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = ((MediaSessionCompat$Token) obj).y;
        Object obj3 = this.y;
        if (obj3 == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        if (obj2 == null) {
            return false;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.y;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.y, i);
    }
}
