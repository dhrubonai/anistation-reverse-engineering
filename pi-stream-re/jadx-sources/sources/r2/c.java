package r2;

import android.os.Parcel;
import android.os.Parcelable;
import c1.m0;
import c1.o0;
import c1.v;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements o0 {
    public static final Parcelable.Creator<c> CREATOR = new q2.b(11);

    /* renamed from: a, reason: collision with root package name */
    public final List f9322a;

    public c(ArrayList arrayList) {
        this.f9322a = arrayList;
        boolean z9 = false;
        if (!arrayList.isEmpty()) {
            long j4 = ((b) arrayList.get(0)).f9320b;
            int i10 = 1;
            while (true) {
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (((b) arrayList.get(i10)).f9319a < j4) {
                    z9 = true;
                    break;
                } else {
                    j4 = ((b) arrayList.get(i10)).f9320b;
                    i10++;
                }
            }
        }
        w7.b.g(!z9);
    }

    @Override // c1.o0
    public final /* synthetic */ void a(m0 m0Var) {
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
        if (obj != null && c.class == obj.getClass()) {
            return this.f9322a.equals(((c) obj).f9322a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9322a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f9322a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f9322a);
    }
}
