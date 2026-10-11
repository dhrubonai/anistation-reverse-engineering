package c1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class p0 implements Parcelable {
    public static final Parcelable.Creator<p0> CREATOR = new android.support.v4.media.a(16);

    /* renamed from: a, reason: collision with root package name */
    public final o0[] f1876a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1877b;

    public p0(o0... o0VarArr) {
        this(-9223372036854775807L, o0VarArr);
    }

    public final p0 d(o0... o0VarArr) {
        if (o0VarArr.length == 0) {
            return this;
        }
        int i10 = f1.b0.f3799a;
        o0[] o0VarArr2 = this.f1876a;
        Object[] copyOf = Arrays.copyOf(o0VarArr2, o0VarArr2.length + o0VarArr.length);
        System.arraycopy(o0VarArr, 0, copyOf, o0VarArr2.length, o0VarArr.length);
        return new p0(this.f1877b, (o0[]) copyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final p0 e(p0 p0Var) {
        if (p0Var == null) {
            return this;
        }
        return d(p0Var.f1876a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p0.class != obj.getClass()) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (Arrays.equals(this.f1876a, p0Var.f1876a) && this.f1877b == p0Var.f1877b) {
            return true;
        }
        return false;
    }

    public final o0 f(int i10) {
        return this.f1876a[i10];
    }

    public final int g() {
        return this.f1876a.length;
    }

    public final int hashCode() {
        return com.bumptech.glide.c.B(this.f1877b) + (Arrays.hashCode(this.f1876a) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.f1876a));
        long j4 = this.f1877b;
        if (j4 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j4;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        o0[] o0VarArr = this.f1876a;
        parcel.writeInt(o0VarArr.length);
        for (o0 o0Var : o0VarArr) {
            parcel.writeParcelable(o0Var, 0);
        }
        parcel.writeLong(this.f1877b);
    }

    public p0(long j4, o0... o0VarArr) {
        this.f1877b = j4;
        this.f1876a = o0VarArr;
    }

    public p0(List list) {
        this((o0[]) list.toArray(new o0[0]));
    }

    public p0(Parcel parcel) {
        this.f1876a = new o0[parcel.readInt()];
        int i10 = 0;
        while (true) {
            o0[] o0VarArr = this.f1876a;
            if (i10 < o0VarArr.length) {
                o0VarArr[i10] = (o0) parcel.readParcelable(o0.class.getClassLoader());
                i10++;
            } else {
                this.f1877b = parcel.readLong();
                return;
            }
        }
    }
}
