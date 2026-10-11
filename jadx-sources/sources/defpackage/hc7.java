package defpackage;

import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hc7 implements Parcelable.Creator {
    public static final hc7 b = new hc7(0);
    public final /* synthetic */ byte a;

    public /* synthetic */ hc7(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0119  */
    /* JADX WARN: Type inference failed for: r13v29, types: [android.view.View$BaseSavedState, java.lang.Object, n84] */
    /* JADX WARN: Type inference failed for: r13v34, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createFromParcel(final android.os.Parcel r14) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hc7.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new lp[i];
            case 1:
                return new u4[i];
            case 2:
                return new l91[i];
            case 3:
                return new il1[i];
            case 4:
                return new gl1[i];
            case 5:
                return new hl1[i];
            case 6:
                return new op1[i];
            case 7:
                return new np1[i];
            case 8:
                return new m13[i];
            case 9:
                return new MediaBrowserCompat$MediaItem[i];
            case 10:
                return new jq3[i];
            case 11:
                return new MediaDescriptionCompat[i];
            case 12:
                return new kr3[i];
            case 13:
                return new MediaMetadataCompat[i];
            case 14:
                return new pt3[i];
            case 15:
                return new MediaSessionCompat$QueueItem[i];
            case 16:
                return new qt3[i];
            case 17:
                return new MediaSessionCompat$Token[i];
            case 18:
                return new n84[i];
            case 19:
                return new ParcelImpl[i];
            case 20:
                return new pi4[i];
            case 21:
                return new qi4[i];
            case 22:
                return new ri4[i];
            case 23:
                return new ParcelableVolumeInfo[i];
            case 24:
                return new wn4[i];
            case 25:
                return new PlaybackStateCompat[i];
            case 26:
                return new vn4[i];
            case 27:
                return new ay4[i];
            case 28:
                return new RatingCompat[i];
            default:
                return new u35[i];
        }
    }
}
