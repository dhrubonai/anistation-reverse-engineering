package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.hc7;
import defpackage.qx1;
import defpackage.st3;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new hc7(25);
    public final float A;
    public final long B;
    public final int C;
    public final CharSequence D;
    public final long E;
    public final ArrayList F;
    public final long G;
    public final Bundle H;
    public PlaybackState I;
    public final int x;
    public final long y;
    public final long z;

    public PlaybackStateCompat(Parcel parcel) {
        this.x = parcel.readInt();
        this.y = parcel.readLong();
        this.A = parcel.readFloat();
        this.E = parcel.readLong();
        this.z = parcel.readLong();
        this.B = parcel.readLong();
        this.D = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.F = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.G = parcel.readLong();
        this.H = parcel.readBundle(st3.class.getClassLoader());
        this.C = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.x);
        sb.append(", position=");
        sb.append(this.y);
        sb.append(", buffered position=");
        sb.append(this.z);
        sb.append(", speed=");
        sb.append(this.A);
        sb.append(", updated=");
        sb.append(this.E);
        sb.append(", actions=");
        sb.append(this.B);
        sb.append(", error code=");
        sb.append(this.C);
        sb.append(", error message=");
        sb.append(this.D);
        sb.append(", custom actions=");
        sb.append(this.F);
        sb.append(", active item id=");
        return qx1.k(this.G, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.x);
        parcel.writeLong(this.y);
        parcel.writeFloat(this.A);
        parcel.writeLong(this.E);
        parcel.writeLong(this.z);
        parcel.writeLong(this.B);
        TextUtils.writeToParcel(this.D, parcel, i);
        parcel.writeTypedList(this.F);
        parcel.writeLong(this.G);
        parcel.writeBundle(this.H);
        parcel.writeInt(this.C);
    }

    /* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();
        public final Bundle A;
        public final String x;
        public final CharSequence y;
        public final int z;

        public CustomAction(Parcel parcel) {
            this.x = parcel.readString();
            this.y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.z = parcel.readInt();
            this.A = parcel.readBundle(st3.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.y) + ", mIcon=" + this.z + ", mExtras=" + this.A;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.x);
            TextUtils.writeToParcel(this.y, parcel, i);
            parcel.writeInt(this.z);
            parcel.writeBundle(this.A);
        }

        public CustomAction(String str, CharSequence charSequence, int i) {
            this.x = str;
            this.y = charSequence;
            this.z = i;
            this.A = null;
        }
    }

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.x = i;
        this.y = j;
        this.z = j2;
        this.A = f;
        this.B = j3;
        this.C = i2;
        this.D = charSequence;
        this.E = j4;
        this.F = new ArrayList(arrayList);
        this.G = j5;
        this.H = bundle;
    }
}
