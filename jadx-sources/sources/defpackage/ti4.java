package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ti4 extends yx5 implements Parcelable, rt5 {
    public static final Parcelable.Creator<ti4> CREATOR = new Object();
    public final tt5 y;
    public st5 z;

    public ti4(Object obj, tt5 tt5Var) {
        this.y = tt5Var;
        ft5 h = mt5.h();
        st5 st5Var = new st5(h.g(), obj);
        if (!(h instanceof jh2)) {
            st5Var.b = new st5(1L, obj);
        }
        this.z = st5Var;
    }

    @Override // defpackage.xx5
    public final zx5 b() {
        return this.z;
    }

    @Override // defpackage.xx5
    public final zx5 c(zx5 zx5Var, zx5 zx5Var2, zx5 zx5Var3) {
        if (this.y.g(((st5) zx5Var2).c, ((st5) zx5Var3).c)) {
            return zx5Var2;
        }
        return null;
    }

    @Override // defpackage.rt5
    public final tt5 d() {
        return this.y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.xx5
    public final void f(zx5 zx5Var) {
        this.z = (st5) zx5Var;
    }

    @Override // defpackage.px5
    public final Object getValue() {
        return ((st5) mt5.s(this.z, this)).c;
    }

    @Override // defpackage.w44
    public final void setValue(Object obj) {
        ft5 h;
        st5 st5Var = (st5) mt5.f(this.z);
        if (!this.y.g(st5Var.c, obj)) {
            st5 st5Var2 = this.z;
            synchronized (mt5.c) {
                h = mt5.h();
                ((st5) mt5.n(st5Var2, this, h, st5Var)).c = obj;
            }
            mt5.l(h, this);
        }
    }

    public final String toString() {
        return "MutableState(value=" + ((st5) mt5.f(this.z)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        h95 h95Var = h95.H;
        tt5 tt5Var = this.y;
        if (tt5Var.equals(h95Var)) {
            i2 = 0;
        } else if (tt5Var.equals(p7.S)) {
            i2 = 1;
        } else if (tt5Var.equals(pk2.c0)) {
            i2 = 2;
        } else {
            ze0.m("Only known types of MutableState's SnapshotMutationPolicy are supported");
            return;
        }
        parcel.writeInt(i2);
    }
}
