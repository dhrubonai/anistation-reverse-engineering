package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ri4 extends yx5 implements Parcelable, rt5, px5, w44 {
    public static final Parcelable.Creator<ri4> CREATOR = new hc7((byte) 22);
    public qt5 y;

    public ri4(long j) {
        ft5 h = mt5.h();
        qt5 qt5Var = new qt5(h.g(), j);
        if (!(h instanceof jh2)) {
            qt5Var.b = new qt5(1L, j);
        }
        this.y = qt5Var;
    }

    @Override // defpackage.xx5
    public final zx5 b() {
        return this.y;
    }

    @Override // defpackage.xx5
    public final zx5 c(zx5 zx5Var, zx5 zx5Var2, zx5 zx5Var3) {
        if (((qt5) zx5Var2).c == ((qt5) zx5Var3).c) {
            return zx5Var2;
        }
        return null;
    }

    @Override // defpackage.rt5
    public final tt5 d() {
        return p7.S;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.xx5
    public final void f(zx5 zx5Var) {
        this.y = (qt5) zx5Var;
    }

    @Override // defpackage.px5
    public final Object getValue() {
        return Long.valueOf(h());
    }

    public final long h() {
        return ((qt5) mt5.s(this.y, this)).c;
    }

    public final void i(long j) {
        ft5 h;
        qt5 qt5Var = (qt5) mt5.f(this.y);
        if (qt5Var.c != j) {
            qt5 qt5Var2 = this.y;
            synchronized (mt5.c) {
                h = mt5.h();
                ((qt5) mt5.n(qt5Var2, this, h, qt5Var)).c = j;
            }
            mt5.l(h, this);
        }
    }

    @Override // defpackage.w44
    public final void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((qt5) mt5.f(this.y)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(h());
    }
}
