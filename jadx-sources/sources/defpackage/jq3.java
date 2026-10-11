package defpackage;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jq3 implements Parcelable {
    public static final Parcelable.Creator<jq3> CREATOR = new hc7(10);
    public final CharSequence A;
    public final Bitmap B;
    public byte[] C;
    public final Uri D;
    public final Bundle E;
    public final Uri F;
    public MediaDescription G;
    public final String x;
    public final CharSequence y;
    public final CharSequence z;

    public jq3(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.x = str;
        this.y = charSequence;
        this.z = charSequence2;
        this.A = charSequence3;
        this.B = bitmap;
        this.D = uri;
        this.E = bundle;
        this.F = uri2;
    }

    public final MediaDescription a() {
        MediaDescription mediaDescription = this.G;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builder = new MediaDescription.Builder();
        builder.setMediaId(this.x);
        builder.setTitle(this.y);
        builder.setSubtitle(this.z);
        builder.setDescription(this.A);
        builder.setIconBitmap(this.B);
        builder.setIconUri(this.D);
        builder.setExtras(this.E);
        builder.setMediaUri(this.F);
        MediaDescription build = builder.build();
        this.G = build;
        return build;
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
        a().writeToParcel(parcel, i);
    }
}
