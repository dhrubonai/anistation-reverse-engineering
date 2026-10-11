package a8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p5.i;

/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new i(20);
    public String A;
    public boolean B;
    public int C;
    public ArrayList D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;

    /* renamed from: a, reason: collision with root package name */
    public final String f198a;

    /* renamed from: b, reason: collision with root package name */
    public final String f199b;

    /* renamed from: c, reason: collision with root package name */
    public String f200c;

    /* renamed from: d, reason: collision with root package name */
    public String f201d;

    /* renamed from: e, reason: collision with root package name */
    public final String f202e;

    /* renamed from: f, reason: collision with root package name */
    public String f203f;

    /* renamed from: x, reason: collision with root package name */
    public String f204x;

    /* renamed from: y, reason: collision with root package name */
    public String f205y;

    /* renamed from: z, reason: collision with root package name */
    public String f206z;

    public h(String str, String str2) {
        this.C = -1;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.f198a = str;
        this.f199b = str2;
        this.f200c = str;
        this.f201d = "Server S1";
        this.f202e = "primary";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f198a);
        parcel.writeString(this.f199b);
        parcel.writeString(this.f200c);
        parcel.writeString(this.f201d);
        parcel.writeString(this.f202e);
        parcel.writeString(this.f203f);
        parcel.writeString(this.f204x);
        parcel.writeString(this.f205y);
        parcel.writeString(this.A);
        parcel.writeString(this.f206z);
        parcel.writeByte(this.B ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.C);
        parcel.writeTypedList(this.D);
        parcel.writeLong(this.E);
        parcel.writeLong(this.F);
        parcel.writeLong(this.G);
        parcel.writeLong(this.H);
    }

    public h(Parcel parcel) {
        this.C = -1;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.f198a = parcel.readString();
        this.f199b = parcel.readString();
        this.f200c = parcel.readString();
        this.f201d = parcel.readString();
        this.f202e = parcel.readString();
        this.f203f = parcel.readString();
        this.f204x = parcel.readString();
        this.f205y = parcel.readString();
        this.A = parcel.readString();
        this.f206z = parcel.readString();
        this.B = parcel.readByte() != 0;
        this.C = parcel.readInt();
        this.D = parcel.createTypedArrayList(g.CREATOR);
        this.E = parcel.readLong();
        this.F = parcel.readLong();
        this.G = parcel.readLong();
        this.H = parcel.readLong();
    }
}
