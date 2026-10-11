package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class il1 implements Parcelable {
    public static final Parcelable.Creator<il1> CREATOR = new hc7(3);
    public final List A;
    public final byte[] B;
    public final String C;
    public final byte[] D;
    public final gl1 E;
    public final hl1 F;
    public final String x;
    public final Uri y;
    public final String z;

    public il1(Parcel parcel) {
        String readString = parcel.readString();
        String str = eq6.a;
        this.x = readString;
        this.y = Uri.parse(parcel.readString());
        this.z = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((vy5) parcel.readParcelable(vy5.class.getClassLoader()));
        }
        this.A = Collections.unmodifiableList(arrayList);
        this.B = parcel.createByteArray();
        this.C = parcel.readString();
        this.D = parcel.createByteArray();
        this.E = (gl1) parcel.readParcelable(gl1.class.getClassLoader());
        this.F = (hl1) parcel.readParcelable(hl1.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof il1)) {
            return false;
        }
        il1 il1Var = (il1) obj;
        if (!this.x.equals(il1Var.x) || !this.y.equals(il1Var.y) || !Objects.equals(this.z, il1Var.z) || !this.A.equals(il1Var.A) || !Arrays.equals(this.B, il1Var.B) || !Objects.equals(this.C, il1Var.C) || !Arrays.equals(this.D, il1Var.D) || !Objects.equals(this.E, il1Var.E) || !Objects.equals(this.F, il1Var.F)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (this.y.hashCode() + (this.x.hashCode() * 961)) * 31;
        int i4 = 0;
        String str = this.z;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (Arrays.hashCode(this.B) + ((this.A.hashCode() + ((hashCode + i) * 31)) * 31)) * 31;
        String str2 = this.C;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode3 = (Arrays.hashCode(this.D) + ((hashCode2 + i2) * 31)) * 31;
        gl1 gl1Var = this.E;
        if (gl1Var != null) {
            i3 = gl1Var.hashCode();
        } else {
            i3 = 0;
        }
        int i5 = (hashCode3 + i3) * 31;
        hl1 hl1Var = this.F;
        if (hl1Var != null) {
            i4 = hl1Var.hashCode();
        }
        return i5 + i4;
    }

    public final String toString() {
        return this.z + ":" + this.x;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.x);
        parcel.writeString(this.y.toString());
        parcel.writeString(this.z);
        List list = this.A;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.B);
        parcel.writeString(this.C);
        parcel.writeByteArray(this.D);
        parcel.writeParcelable(this.E, 0);
        parcel.writeParcelable(this.F, 0);
    }

    public il1(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, gl1 gl1Var, hl1 hl1Var) {
        int L = eq6.L(uri, str2);
        if (L != 0 && L != 2 && L != 1) {
            this.E = gl1Var;
            this.F = null;
        } else {
            io3.k(L, "customCacheKey must be null for type: %s", str3 == null);
            this.E = null;
            this.F = hl1Var;
        }
        this.x = str;
        this.y = uri;
        this.z = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.A = Collections.unmodifiableList(arrayList);
        this.B = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.C = str3;
        this.D = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : eq6.b;
    }
}
