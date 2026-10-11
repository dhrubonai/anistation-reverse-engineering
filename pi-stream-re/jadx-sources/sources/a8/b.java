package a8;

import android.os.Parcel;
import android.os.Parcelable;
import p5.i;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new i(17);
    public String A;
    public String B;
    public String C;
    public String D;
    public String[] E;
    public String F;
    public String G;
    public long H;
    public long I;
    public int J;
    public long K;
    public final boolean L;
    public final String M;
    public String N;
    public int O;
    public final String P;
    public final boolean Q;
    public final String R;

    /* renamed from: a, reason: collision with root package name */
    public String f168a;

    /* renamed from: b, reason: collision with root package name */
    public String f169b;

    /* renamed from: c, reason: collision with root package name */
    public String f170c;

    /* renamed from: d, reason: collision with root package name */
    public String f171d;

    /* renamed from: e, reason: collision with root package name */
    public String f172e;

    /* renamed from: f, reason: collision with root package name */
    public String f173f;

    /* renamed from: x, reason: collision with root package name */
    public String f174x;

    /* renamed from: y, reason: collision with root package name */
    public String f175y;

    /* renamed from: z, reason: collision with root package name */
    public String f176z;

    public b(Parcel parcel) {
        boolean z9;
        this.f168a = parcel.readString();
        this.f169b = parcel.readString();
        this.f170c = parcel.readString();
        this.f171d = parcel.readString();
        this.f172e = parcel.readString();
        this.f173f = parcel.readString();
        this.f174x = parcel.readString();
        this.f175y = parcel.readString();
        this.f176z = parcel.readString();
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readString();
        this.E = parcel.createStringArray();
        this.F = parcel.readString();
        this.G = parcel.readString();
        this.H = parcel.readLong();
        this.I = parcel.readLong();
        this.J = parcel.readInt();
        this.K = parcel.readLong();
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.L = z9;
        this.M = parcel.readString();
        this.N = parcel.readString();
        this.O = parcel.readInt();
        this.P = parcel.readString();
        this.Q = parcel.readByte() != 0;
        this.R = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f168a);
        parcel.writeString(this.f169b);
        parcel.writeString(this.f170c);
        parcel.writeString(this.f171d);
        parcel.writeString(this.f172e);
        parcel.writeString(this.f173f);
        parcel.writeString(this.f174x);
        parcel.writeString(this.f175y);
        parcel.writeString(this.f176z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeString(this.D);
        parcel.writeStringArray(this.E);
        parcel.writeString(this.F);
        parcel.writeString(this.G);
        parcel.writeLong(this.H);
        parcel.writeLong(this.I);
        parcel.writeInt(this.J);
        parcel.writeLong(this.K);
        parcel.writeByte(this.L ? (byte) 1 : (byte) 0);
        parcel.writeString(this.M);
        parcel.writeString(this.N);
        parcel.writeInt(this.O);
        parcel.writeString(this.P);
        parcel.writeByte(this.Q ? (byte) 1 : (byte) 0);
        parcel.writeString(this.R);
    }
}
