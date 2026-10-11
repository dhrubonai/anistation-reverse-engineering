package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mr extends y2 {
    public static final Parcelable.Creator<mr> CREATOR = new an7(12);
    public final String A;
    public final Uri B;
    public final String C;
    public final String D;
    public final Boolean E;
    public final Boolean F;
    public final int G;
    public final String x;
    public final String y;
    public final List z;

    public mr(String str, String str2, ArrayList arrayList, String str3, Uri uri, String str4, String str5, Boolean bool, Boolean bool2, int i) {
        this.x = str;
        this.y = str2;
        this.z = arrayList;
        this.A = str3;
        this.B = uri;
        this.C = str4;
        this.D = str5;
        this.E = bool;
        this.F = bool2;
        this.G = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mr)) {
            return false;
        }
        mr mrVar = (mr) obj;
        if (qi0.c(this.x, mrVar.x) && qi0.c(this.y, mrVar.y) && qi0.c(this.z, mrVar.z) && qi0.c(this.A, mrVar.A) && qi0.c(this.B, mrVar.B) && qi0.c(this.C, mrVar.C) && qi0.c(this.D, mrVar.D) && this.G == mrVar.G) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, this.y, this.z, this.A, this.B, this.C, Integer.valueOf(this.G)});
    }

    public final String toString() {
        int size;
        List list = this.z;
        if (list == null) {
            size = 0;
        } else {
            size = list.size();
        }
        String valueOf = String.valueOf(this.B);
        String str = this.x;
        int length = String.valueOf(str).length();
        String str2 = this.y;
        int length2 = String.valueOf(str2).length() + length + 23;
        int length3 = String.valueOf(size).length();
        String str3 = this.A;
        int length4 = String.valueOf(str3).length() + length2 + 20 + length3 + 23 + 22;
        int length5 = valueOf.length();
        String str4 = this.C;
        int i = length4 + length5 + 11;
        int length6 = String.valueOf(str4).length();
        String str5 = this.D;
        StringBuilder sb = new StringBuilder(i + length6 + 8 + String.valueOf(str5).length());
        qx1.x(sb, "applicationId: ", str, ", name: ", str2);
        sb.append(", namespaces.count: ");
        sb.append(size);
        sb.append(", senderAppIdentifier: ");
        sb.append(str3);
        qx1.x(sb, ", senderAppLaunchUrl: ", valueOf, ", iconUrl: ", str4);
        return h11.k(sb, ", type: ", str5);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.m0(parcel, 2, this.x);
        z51.m0(parcel, 3, this.y);
        z51.n0(parcel, 5, Collections.unmodifiableList(this.z));
        z51.m0(parcel, 6, this.A);
        z51.l0(parcel, 7, this.B, i);
        z51.m0(parcel, 8, this.C);
        z51.m0(parcel, 9, this.D);
        z51.Y(parcel, 10, this.E);
        z51.Y(parcel, 11, this.F);
        z51.r0(parcel, 12, 4);
        parcel.writeInt(this.G);
        z51.t0(parcel, s0);
    }
}
