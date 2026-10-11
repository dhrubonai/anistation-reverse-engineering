package o2;

import android.os.Parcel;
import android.os.Parcelable;
import c1.m0;
import c1.o0;
import c1.v;
import f1.b0;

/* loaded from: classes.dex */
public class b implements o0 {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(26);

    /* renamed from: a, reason: collision with root package name */
    public final String f8184a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8185b;

    public b(String str, String str2) {
        this.f8184a = j5.a.h0(str);
        this.f8185b = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // c1.o0
    public final void a(m0 m0Var) {
        char c6;
        String str = this.f8184a;
        str.getClass();
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c6 = 0;
                    break;
                }
                c6 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c6 = 1;
                    break;
                }
                c6 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c6 = 2;
                    break;
                }
                c6 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c6 = 3;
                    break;
                }
                c6 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c6 = 4;
                    break;
                }
                c6 = 65535;
                break;
            default:
                c6 = 65535;
                break;
        }
        String str2 = this.f8185b;
        if (c6 != 0) {
            if (c6 != 1) {
                if (c6 != 2) {
                    if (c6 != 3) {
                        if (c6 == 4) {
                            m0Var.f1811b = str2;
                            return;
                        }
                        return;
                    }
                    m0Var.f1813d = str2;
                    return;
                }
                m0Var.f1816g = str2;
                return;
            }
            m0Var.f1810a = str2;
            return;
        }
        m0Var.f1812c = str2;
    }

    @Override // c1.o0
    public final /* synthetic */ v b() {
        return null;
    }

    @Override // c1.o0
    public final /* synthetic */ byte[] c() {
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f8184a.equals(bVar.f8184a) && this.f8185b.equals(bVar.f8185b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8185b.hashCode() + ((this.f8184a.hashCode() + 527) * 31);
    }

    public final String toString() {
        return "VC: " + this.f8184a + "=" + this.f8185b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8184a);
        parcel.writeString(this.f8185b);
    }

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i10 = b0.f3799a;
        this.f8184a = readString;
        this.f8185b = parcel.readString();
    }
}
