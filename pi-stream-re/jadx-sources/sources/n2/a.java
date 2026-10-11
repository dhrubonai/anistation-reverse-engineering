package n2;

import a3.g;
import android.os.Parcel;
import android.os.Parcelable;
import c1.m0;
import c1.o0;
import c1.v;
import f1.b0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7989a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7990b;

    /* renamed from: c, reason: collision with root package name */
    public final long f7991c;

    /* renamed from: d, reason: collision with root package name */
    public final long f7992d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f7993e;

    /* renamed from: f, reason: collision with root package name */
    public int f7994f;

    /* renamed from: x, reason: collision with root package name */
    public static final v f7987x = new v(g.k("application/id3"));

    /* renamed from: y, reason: collision with root package name */
    public static final v f7988y = new v(g.k("application/x-scte35"));
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(24);

    public a(String str, String str2, long j4, long j10, byte[] bArr) {
        this.f7989a = str;
        this.f7990b = str2;
        this.f7991c = j4;
        this.f7992d = j10;
        this.f7993e = bArr;
    }

    @Override // c1.o0
    public final /* synthetic */ void a(m0 m0Var) {
    }

    @Override // c1.o0
    public final v b() {
        String str = this.f7989a;
        str.getClass();
        char c6 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c6 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c6 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c6 = 2;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return f7988y;
            case 1:
            case 2:
                return f7987x;
            default:
                return null;
        }
    }

    @Override // c1.o0
    public final byte[] c() {
        if (b() != null) {
            return this.f7993e;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f7991c == aVar.f7991c && this.f7992d == aVar.f7992d && b0.a(this.f7989a, aVar.f7989a) && b0.a(this.f7990b, aVar.f7990b) && Arrays.equals(this.f7993e, aVar.f7993e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.f7994f == 0) {
            int i11 = 0;
            String str = this.f7989a;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.f7990b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            int i13 = (i12 + i11) * 31;
            long j4 = this.f7991c;
            int i14 = (i13 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j10 = this.f7992d;
            this.f7994f = Arrays.hashCode(this.f7993e) + ((i14 + ((int) (j10 ^ (j10 >>> 32)))) * 31);
        }
        return this.f7994f;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f7989a + ", id=" + this.f7992d + ", durationMs=" + this.f7991c + ", value=" + this.f7990b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7989a);
        parcel.writeString(this.f7990b);
        parcel.writeLong(this.f7991c);
        parcel.writeLong(this.f7992d);
        parcel.writeByteArray(this.f7993e);
    }

    public a(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = b0.f3799a;
        this.f7989a = readString;
        this.f7990b = parcel.readString();
        this.f7991c = parcel.readLong();
        this.f7992d = parcel.readLong();
        this.f7993e = parcel.createByteArray();
    }
}
