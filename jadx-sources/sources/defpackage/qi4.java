package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qi4 extends yx5 implements Parcelable, rt5, px5, w44 {
    public static final Parcelable.Creator<qi4> CREATOR = new hc7((byte) 21);
    public pt5 y;

    public qi4(int i) {
        ft5 h = mt5.h();
        pt5 pt5Var = new pt5(h.g(), i);
        if (!(h instanceof jh2)) {
            pt5Var.b = new pt5(1L, i);
        }
        this.y = pt5Var;
    }

    @Override // defpackage.xx5
    public final zx5 b() {
        return this.y;
    }

    @Override // defpackage.xx5
    public final zx5 c(zx5 zx5Var, zx5 zx5Var2, zx5 zx5Var3) {
        if (((pt5) zx5Var2).c == ((pt5) zx5Var3).c) {
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
        this.y = (pt5) zx5Var;
    }

    @Override // defpackage.px5
    public final Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((pt5) mt5.s(this.y, this)).c;
    }

    public final void i(int i) {
        ft5 h;
        pt5 pt5Var = (pt5) mt5.f(this.y);
        if (pt5Var.c != i) {
            pt5 pt5Var2 = this.y;
            synchronized (mt5.c) {
                h = mt5.h();
                ((pt5) mt5.n(pt5Var2, this, h, pt5Var)).c = i;
            }
            mt5.l(h, this);
        }
    }

    @Override // defpackage.w44
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return zo5.m("MutableIntState(value=", ")@", ((pt5) mt5.f(this.y)).c, hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
    }
}
