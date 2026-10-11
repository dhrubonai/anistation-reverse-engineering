package defpackage;

import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wn4 implements Parcelable {
    public static final Parcelable.Creator<wn4> CREATOR = new hc7(24);
    public final float A;
    public final long B;
    public final int C;
    public final CharSequence D;
    public final long E;
    public final List F;
    public final long G;
    public final Bundle H;
    public PlaybackState I;
    public final int x;
    public final long y;
    public final long z;

    public wn4(Parcel parcel) {
        this.x = parcel.readInt();
        this.y = parcel.readLong();
        this.A = parcel.readFloat();
        this.E = parcel.readLong();
        this.z = parcel.readLong();
        this.B = parcel.readLong();
        this.D = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        List createTypedArrayList = parcel.createTypedArrayList(vn4.CREATOR);
        if (createTypedArrayList == null) {
            z62 z62Var = nw2.y;
            createTypedArrayList = o15.B;
        }
        this.F = createTypedArrayList;
        this.G = parcel.readLong();
        this.H = parcel.readBundle(rt3.class.getClassLoader());
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

    public wn4(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
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
