package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.PlaybackStateCompat;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cq3 extends Binder implements ht2 {
    public final WeakReference e;

    public cq3() {
        attachInterface(this, "android.support.v4.media.session.IMediaControllerCallback");
        this.e = new WeakReference(null);
    }

    @Override // defpackage.ht2
    public final void J(PlaybackStateCompat playbackStateCompat) {
        if (this.e.get() == null) {
            return;
        }
        ov3.d();
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("android.support.v4.media.session.IMediaControllerCallback");
        }
        if (i == 1598968902) {
            parcel2.writeString("android.support.v4.media.session.IMediaControllerCallback");
            return true;
        }
        switch (i) {
            case 1:
                parcel.readString();
                if (this.e.get() != null) {
                    ov3.d();
                    return false;
                }
                return true;
            case 2:
                p65.o();
                return false;
            case 3:
                J((PlaybackStateCompat) bx7.I(parcel, PlaybackStateCompat.CREATOR));
                return true;
            case 4:
                p65.o();
                return false;
            case 5:
                parcel.createTypedArrayList(MediaSessionCompat$QueueItem.CREATOR);
                p65.o();
                return false;
            case 6:
                p65.o();
                return false;
            case 7:
                p65.o();
                return false;
            case 8:
                p65.o();
                return false;
            case 9:
                parcel.readInt();
                if (this.e.get() != null) {
                    ov3.d();
                    return false;
                }
                return true;
            case 10:
                parcel.readInt();
                return true;
            case 11:
                parcel.readInt();
                if (this.e.get() != null) {
                    ov3.d();
                    return false;
                }
                return true;
            case 12:
                parcel.readInt();
                if (this.e.get() != null) {
                    ov3.d();
                    return false;
                }
                return true;
            case 13:
                if (this.e.get() != null) {
                    ov3.d();
                    return false;
                }
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
