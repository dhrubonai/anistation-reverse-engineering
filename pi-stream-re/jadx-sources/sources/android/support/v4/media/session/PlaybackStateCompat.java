package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a(4);
    public final long A;
    public final Bundle B;

    /* renamed from: a, reason: collision with root package name */
    public final int f243a;

    /* renamed from: b, reason: collision with root package name */
    public final long f244b;

    /* renamed from: c, reason: collision with root package name */
    public final long f245c;

    /* renamed from: d, reason: collision with root package name */
    public final float f246d;

    /* renamed from: e, reason: collision with root package name */
    public final long f247e;

    /* renamed from: f, reason: collision with root package name */
    public final int f248f;

    /* renamed from: x, reason: collision with root package name */
    public final CharSequence f249x;

    /* renamed from: y, reason: collision with root package name */
    public final long f250y;

    /* renamed from: z, reason: collision with root package name */
    public final ArrayList f251z;

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public final String f252a;

        /* renamed from: b, reason: collision with root package name */
        public final CharSequence f253b;

        /* renamed from: c, reason: collision with root package name */
        public final int f254c;

        /* renamed from: d, reason: collision with root package name */
        public final Bundle f255d;

        public CustomAction(Parcel parcel) {
            this.f252a = parcel.readString();
            this.f253b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f254c = parcel.readInt();
            this.f255d = parcel.readBundle(w7.b.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f253b) + ", mIcon=" + this.f254c + ", mExtras=" + this.f255d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f252a);
            TextUtils.writeToParcel(this.f253b, parcel, i10);
            parcel.writeInt(this.f254c);
            parcel.writeBundle(this.f255d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f243a = parcel.readInt();
        this.f244b = parcel.readLong();
        this.f246d = parcel.readFloat();
        this.f250y = parcel.readLong();
        this.f245c = parcel.readLong();
        this.f247e = parcel.readLong();
        this.f249x = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f251z = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.A = parcel.readLong();
        this.B = parcel.readBundle(w7.b.class.getClassLoader());
        this.f248f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f243a + ", position=" + this.f244b + ", buffered position=" + this.f245c + ", speed=" + this.f246d + ", updated=" + this.f250y + ", actions=" + this.f247e + ", error code=" + this.f248f + ", error message=" + this.f249x + ", custom actions=" + this.f251z + ", active item id=" + this.A + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f243a);
        parcel.writeLong(this.f244b);
        parcel.writeFloat(this.f246d);
        parcel.writeLong(this.f250y);
        parcel.writeLong(this.f245c);
        parcel.writeLong(this.f247e);
        TextUtils.writeToParcel(this.f249x, parcel, i10);
        parcel.writeTypedList(this.f251z);
        parcel.writeLong(this.A);
        parcel.writeBundle(this.B);
        parcel.writeInt(this.f248f);
    }
}
