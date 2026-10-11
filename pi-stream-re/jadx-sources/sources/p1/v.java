package p1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c1.m0;
import c1.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class v implements o0 {
    public static final Parcelable.Creator<v> CREATOR = new android.support.v4.media.a(21);

    /* renamed from: a, reason: collision with root package name */
    public final String f8530a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8531b;

    /* renamed from: c, reason: collision with root package name */
    public final List f8532c;

    public v(String str, String str2, List list) {
        this.f8530a = str;
        this.f8531b = str2;
        this.f8532c = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // c1.o0
    public final /* synthetic */ void a(m0 m0Var) {
    }

    @Override // c1.o0
    public final /* synthetic */ c1.v b() {
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
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (TextUtils.equals(this.f8530a, vVar.f8530a) && TextUtils.equals(this.f8531b, vVar.f8531b) && this.f8532c.equals(vVar.f8532c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = 0;
        String str = this.f8530a;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = i10 * 31;
        String str2 = this.f8531b;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return this.f8532c.hashCode() + ((i12 + i11) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str2 = this.f8530a;
        if (str2 != null) {
            StringBuilder sb2 = new StringBuilder(" [");
            sb2.append(str2);
            sb2.append(", ");
            str = a3.g.t(sb2, this.f8531b, "]");
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8530a);
        parcel.writeString(this.f8531b);
        List list = this.f8532c;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeParcelable((Parcelable) list.get(i11), 0);
        }
    }

    public v(Parcel parcel) {
        this.f8530a = parcel.readString();
        this.f8531b = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add((u) parcel.readParcelable(u.class.getClassLoader()));
        }
        this.f8532c = Collections.unmodifiableList(arrayList);
    }
}
