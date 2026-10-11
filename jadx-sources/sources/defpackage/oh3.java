package defpackage;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oh3 extends im5 {
    public final List c;
    public final List d;
    public final long e;
    public final long f;

    public oh3(List list, ArrayList arrayList, long j, long j2) {
        this.c = list;
        this.d = arrayList;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.im5
    public final Shader b(long j) {
        long j2 = this.e;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i4);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        float[] fArr = null;
        List list = this.c;
        List list2 = this.d;
        if (list2 == null) {
            if (list.size() < 2) {
                ze0.k("colors must have length of at least 2 if colorStops is omitted.");
                return null;
            }
        } else if (list.size() != list2.size()) {
            ze0.k("colors and colorStops arguments must have equal length.");
            return null;
        }
        int size = list.size();
        long[] jArr = new long[size];
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            jArr[i6] = q23.V(((ep0) list.get(i6)).a);
        }
        if (list2 != null) {
            fArr = new float[list2.size()];
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                fArr[i5] = ((Number) it.next()).floatValue();
                i5++;
            }
        }
        return zh2.a.a(floatToRawIntBits, floatToRawIntBits2, jArr, fArr, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oh3) {
            oh3 oh3Var = (oh3) obj;
            if (this.c.equals(oh3Var.c) && a34.i(this.d, oh3Var.d) && xc4.b(this.e, oh3Var.e) && xc4.b(this.f, oh3Var.f)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.c.hashCode() * 31;
        List list = this.d;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        return Integer.hashCode(0) + qx1.d(qx1.d((hashCode + i) * 31, this.e, 31), this.f, 31);
    }

    public final String toString() {
        String str;
        long j = this.e;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0) {
            str = "";
        } else {
            str = qx1.m("start=", xc4.h(j), ", ");
        }
        long j2 = this.f;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = qx1.m("end=", xc4.h(j2), ", ");
        }
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.c);
        sb.append(", stops=");
        sb.append(this.d);
        sb.append(", ");
        return qx1.q(sb, str, str2, "tileMode=Clamp)");
    }
}
