package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f256a;

    public /* synthetic */ a(int i10) {
        this.f256a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.f256a) {
            case 0:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper
                    public static final Parcelable.Creator<MediaSessionCompat$ResultReceiverWrapper> CREATOR = new a(0);

                    /* renamed from: a, reason: collision with root package name */
                    public final ResultReceiver f235a;

                    {
                        this.f235a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        this.f235a.writeToParcel(parcel2, i10);
                    }
                };
            case 1:
                return new Parcelable(parcel) { // from class: android.support.v4.media.session.MediaSessionCompat$QueueItem
                    public static final Parcelable.Creator<MediaSessionCompat$QueueItem> CREATOR = new a(1);

                    /* renamed from: a, reason: collision with root package name */
                    public final MediaDescriptionCompat f233a;

                    /* renamed from: b, reason: collision with root package name */
                    public final long f234b;

                    {
                        this.f233a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                        this.f234b = parcel.readLong();
                    }

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final String toString() {
                        return "MediaSession.QueueItem {Description=" + this.f233a + ", Id=" + this.f234b + " }";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        this.f233a.writeToParcel(parcel2, i10);
                        parcel2.writeLong(this.f234b);
                    }
                };
            case 2:
                final Parcelable readParcelable = parcel.readParcelable(null);
                return new Parcelable(readParcelable) { // from class: android.support.v4.media.session.MediaSessionCompat$Token
                    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new a(2);

                    /* renamed from: a, reason: collision with root package name */
                    public final Object f236a = new Object();

                    /* renamed from: b, reason: collision with root package name */
                    public final Object f237b;

                    {
                        this.f237b = readParcelable;
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
                        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) obj;
                        Object obj2 = this.f237b;
                        if (obj2 == null) {
                            if (mediaSessionCompat$Token.f237b == null) {
                                return true;
                            }
                            return false;
                        }
                        Object obj3 = mediaSessionCompat$Token.f237b;
                        if (obj3 == null) {
                            return false;
                        }
                        return obj2.equals(obj3);
                    }

                    public final int hashCode() {
                        Object obj = this.f237b;
                        if (obj == null) {
                            return 0;
                        }
                        return obj.hashCode();
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i10) {
                        parcel2.writeParcelable((Parcelable) this.f237b, i10);
                    }
                };
            case 3:
                return new ParcelableVolumeInfo(parcel);
            default:
                return new PlaybackStateCompat(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f256a) {
            case 0:
                return new MediaSessionCompat$ResultReceiverWrapper[i10];
            case 1:
                return new MediaSessionCompat$QueueItem[i10];
            case 2:
                return new MediaSessionCompat$Token[i10];
            case 3:
                return new ParcelableVolumeInfo[i10];
            default:
                return new PlaybackStateCompat[i10];
        }
    }
}
