package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pi4 extends yx5 implements Parcelable, rt5, px5, w44 {
    public static final Parcelable.Creator<pi4> CREATOR = new hc7((byte) 20);
    public ot5 y;

    public pi4(float f) {
        ft5 h = mt5.h();
        ot5 ot5Var = new ot5(f, h.g());
        if (!(h instanceof jh2)) {
            ot5Var.b = new ot5(f, 1L);
        }
        this.y = ot5Var;
    }

    @Override // defpackage.xx5
    public final zx5 b() {
        return this.y;
    }

    @Override // defpackage.xx5
    public final zx5 c(zx5 zx5Var, zx5 zx5Var2, zx5 zx5Var3) {
        if (((ot5) zx5Var2).c == ((ot5) zx5Var3).c) {
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
        this.y = (ot5) zx5Var;
    }

    @Override // defpackage.px5
    public final Object getValue() {
        return Float.valueOf(h());
    }

    public final float h() {
        return ((ot5) mt5.s(this.y, this)).c;
    }

    public final void i(float f) {
        ft5 h;
        ot5 ot5Var = (ot5) mt5.f(this.y);
        if (ot5Var.c == f) {
            return;
        }
        ot5 ot5Var2 = this.y;
        synchronized (mt5.c) {
            h = mt5.h();
            ((ot5) mt5.n(ot5Var2, this, h, ot5Var)).c = f;
        }
        mt5.l(h, this);
    }

    @Override // defpackage.w44
    public final void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((ot5) mt5.f(this.y)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(h());
    }
}
