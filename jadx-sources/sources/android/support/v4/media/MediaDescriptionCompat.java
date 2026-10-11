package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hc7;
import defpackage.hq3;
import defpackage.iq3;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new hc7((byte) 11);
    public final CharSequence A;
    public final Bitmap B;
    public final Uri C;
    public final Bundle D;
    public final Uri E;
    public MediaDescription F;
    public final String x;
    public final CharSequence y;
    public final CharSequence z;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.x = str;
        this.y = charSequence;
        this.z = charSequence2;
        this.A = charSequence3;
        this.B = bitmap;
        this.C = uri;
        this.D = bundle;
        this.E = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.y) + ", " + ((Object) this.z) + ", " + ((Object) this.A);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MediaDescription mediaDescription = this.F;
        if (mediaDescription == null) {
            MediaDescription.Builder b = hq3.b();
            hq3.n(b, this.x);
            hq3.p(b, this.y);
            hq3.o(b, this.z);
            hq3.j(b, this.A);
            hq3.l(b, this.B);
            hq3.m(b, this.C);
            hq3.k(b, this.D);
            iq3.b(b, this.E);
            mediaDescription = hq3.a(b);
            this.F = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i);
    }
}
