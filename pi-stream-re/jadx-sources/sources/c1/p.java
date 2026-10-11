package c1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class p implements Comparator, Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new android.support.v4.media.a(14);

    /* renamed from: a, reason: collision with root package name */
    public final o[] f1872a;

    /* renamed from: b, reason: collision with root package name */
    public int f1873b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1874c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1875d;

    public p(String str, ArrayList arrayList) {
        this(str, false, (o[]) arrayList.toArray(new o[0]));
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        o oVar = (o) obj;
        o oVar2 = (o) obj2;
        UUID uuid = j.f1723a;
        if (uuid.equals(oVar.f1868b)) {
            if (uuid.equals(oVar2.f1868b)) {
                return 0;
            }
            return 1;
        }
        return oVar.f1868b.compareTo(oVar2.f1868b);
    }

    public final p d(String str) {
        if (f1.b0.a(this.f1874c, str)) {
            return this;
        }
        return new p(str, false, this.f1872a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (f1.b0.a(this.f1874c, pVar.f1874c) && Arrays.equals(this.f1872a, pVar.f1872a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f1873b == 0) {
            String str = this.f1874c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f1873b = (hashCode * 31) + Arrays.hashCode(this.f1872a);
        }
        return this.f1873b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f1874c);
        parcel.writeTypedArray(this.f1872a, 0);
    }

    public p(String str, boolean z9, o... oVarArr) {
        this.f1874c = str;
        oVarArr = z9 ? (o[]) oVarArr.clone() : oVarArr;
        this.f1872a = oVarArr;
        this.f1875d = oVarArr.length;
        Arrays.sort(oVarArr, this);
    }

    public p(Parcel parcel) {
        this.f1874c = parcel.readString();
        o[] oVarArr = (o[]) parcel.createTypedArray(o.CREATOR);
        int i10 = f1.b0.f3799a;
        this.f1872a = oVarArr;
        this.f1875d = oVarArr.length;
    }
}
