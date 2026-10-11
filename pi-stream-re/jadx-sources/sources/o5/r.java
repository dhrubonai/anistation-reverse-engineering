package o5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new t0(24);

    /* renamed from: a, reason: collision with root package name */
    public final a f8270a;

    public r(a aVar) {
        this.f8270a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static r d(int i10) {
        g0 g0Var;
        if (i10 == -262) {
            g0Var = g0.RS1;
        } else {
            g0[] values = g0.values();
            int length = values.length;
            int i11 = 0;
            while (true) {
                if (i11 < length) {
                    g0 g0Var2 = values[i11];
                    if (g0Var2.f8233a == i10) {
                        g0Var = g0Var2;
                        break;
                    }
                    i11++;
                } else {
                    for (s sVar : s.values()) {
                        if (sVar.f8273a == i10) {
                            g0Var = sVar;
                        }
                    }
                    throw new q(i10);
                }
            }
        }
        return new r(g0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r) || this.f8270a.a() != ((r) obj).f8270a.a()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8270a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8270a.a());
    }
}
