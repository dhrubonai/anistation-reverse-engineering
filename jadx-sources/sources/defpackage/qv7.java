package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qv7 extends y2 implements Comparable {
    public static final Parcelable.Creator<qv7> CREATOR = new an7(26);
    public final TreeMap A = new TreeMap();
    public final int x;
    public final zv7[] y;
    public final String[] z;

    public qv7(int i, zv7[] zv7VarArr, String[] strArr) {
        this.x = i;
        this.y = zv7VarArr;
        for (zv7 zv7Var : zv7VarArr) {
            this.A.put(zv7Var.x, zv7Var);
        }
        this.z = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.x - ((qv7) obj).x;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qv7) {
            qv7 qv7Var = (qv7) obj;
            if (this.x == qv7Var.x && ss5.l(this.A, qv7Var.A) && Arrays.equals(this.z, qv7Var.z)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.x);
        sb.append(", (");
        Iterator it = this.A.values().iterator();
        while (it.hasNext()) {
            sb.append((zv7) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.z;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s0 = z51.s0(parcel, 20293);
        z51.r0(parcel, 2, 4);
        parcel.writeInt(this.x);
        z51.o0(parcel, 3, this.y, i);
        String[] strArr = this.z;
        if (strArr != null) {
            int s02 = z51.s0(parcel, 4);
            parcel.writeStringArray(strArr);
            z51.t0(parcel, s02);
        }
        z51.t0(parcel, s0);
    }
}
