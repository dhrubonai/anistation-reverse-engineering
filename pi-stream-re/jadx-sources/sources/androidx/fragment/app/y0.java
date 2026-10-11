package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y0 implements Parcelable {
    public static final Parcelable.Creator<y0> CREATOR = new android.support.v4.media.a(13);
    public final Bundle A;
    public final boolean B;
    public final int C;
    public Bundle D;

    /* renamed from: a, reason: collision with root package name */
    public final String f1049a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1050b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1051c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1052d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1053e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1054f;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f1055x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f1056y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f1057z;

    public y0(y yVar) {
        this.f1049a = yVar.getClass().getName();
        this.f1050b = yVar.f1037e;
        this.f1051c = yVar.D;
        this.f1052d = yVar.M;
        this.f1053e = yVar.N;
        this.f1054f = yVar.O;
        this.f1055x = yVar.R;
        this.f1056y = yVar.C;
        this.f1057z = yVar.Q;
        this.A = yVar.f1039f;
        this.B = yVar.P;
        this.C = yVar.f1034c0.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1049a);
        sb.append(" (");
        sb.append(this.f1050b);
        sb.append(")}:");
        if (this.f1051c) {
            sb.append(" fromLayout");
        }
        int i10 = this.f1053e;
        if (i10 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i10));
        }
        String str = this.f1054f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1055x) {
            sb.append(" retainInstance");
        }
        if (this.f1056y) {
            sb.append(" removing");
        }
        if (this.f1057z) {
            sb.append(" detached");
        }
        if (this.B) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1049a);
        parcel.writeString(this.f1050b);
        parcel.writeInt(this.f1051c ? 1 : 0);
        parcel.writeInt(this.f1052d);
        parcel.writeInt(this.f1053e);
        parcel.writeString(this.f1054f);
        parcel.writeInt(this.f1055x ? 1 : 0);
        parcel.writeInt(this.f1056y ? 1 : 0);
        parcel.writeInt(this.f1057z ? 1 : 0);
        parcel.writeBundle(this.A);
        parcel.writeInt(this.B ? 1 : 0);
        parcel.writeBundle(this.D);
        parcel.writeInt(this.C);
    }

    public y0(Parcel parcel) {
        this.f1049a = parcel.readString();
        this.f1050b = parcel.readString();
        this.f1051c = parcel.readInt() != 0;
        this.f1052d = parcel.readInt();
        this.f1053e = parcel.readInt();
        this.f1054f = parcel.readString();
        this.f1055x = parcel.readInt() != 0;
        this.f1056y = parcel.readInt() != 0;
        this.f1057z = parcel.readInt() != 0;
        this.A = parcel.readBundle();
        this.B = parcel.readInt() != 0;
        this.D = parcel.readBundle();
        this.C = parcel.readInt();
    }
}
