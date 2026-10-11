package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f212a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f213b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f214c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f215d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f216e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f217f;

    /* renamed from: x, reason: collision with root package name */
    public final Bundle f218x;

    /* renamed from: y, reason: collision with root package name */
    public final Uri f219y;

    /* renamed from: z, reason: collision with root package name */
    public MediaDescription f220z;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f212a = str;
        this.f213b = charSequence;
        this.f214c = charSequence2;
        this.f215d = charSequence3;
        this.f216e = bitmap;
        this.f217f = uri;
        this.f218x = bundle;
        this.f219y = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f213b) + ", " + ((Object) this.f214c) + ", " + ((Object) this.f215d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        MediaDescription mediaDescription = this.f220z;
        if (mediaDescription == null) {
            MediaDescription.Builder b10 = b.b();
            b.n(b10, this.f212a);
            b.p(b10, this.f213b);
            b.o(b10, this.f214c);
            b.j(b10, this.f215d);
            b.l(b10, this.f216e);
            b.m(b10, this.f217f);
            b.k(b10, this.f218x);
            c.b(b10, this.f219y);
            mediaDescription = b.a(b10);
            this.f220z = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i10);
    }
}
