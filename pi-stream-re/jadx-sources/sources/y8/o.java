package y8;

import g0.f1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f11770a;

    public o(String[] strArr) {
        this.f11770a = strArr;
    }

    public final String b(String str) {
        r6.h0.u(str, "name");
        String[] strArr = this.f11770a;
        int length = strArr.length - 2;
        int C = com.bumptech.glide.d.C(length, 0, -2);
        if (C <= length) {
            while (!o7.j.l1(str, strArr[length])) {
                if (length != C) {
                    length -= 2;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    public final String c(int i10) {
        return this.f11770a[i10 * 2];
    }

    public final h4.c d() {
        h4.c cVar = new h4.c();
        ArrayList arrayList = cVar.f5004a;
        r6.h0.u(arrayList, "<this>");
        String[] strArr = this.f11770a;
        r6.h0.u(strArr, "elements");
        arrayList.addAll(x6.i.g1(strArr));
        return cVar;
    }

    public final String e(int i10) {
        return this.f11770a[(i10 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            if (Arrays.equals(this.f11770a, ((o) obj).f11770a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11770a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int length = this.f11770a.length / 2;
        w6.b[] bVarArr = new w6.b[length];
        for (int i10 = 0; i10 < length; i10++) {
            bVarArr[i10] = new w6.b(c(i10), e(i10));
        }
        return new f1(bVarArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int length = this.f11770a.length / 2;
        for (int i10 = 0; i10 < length; i10++) {
            String c6 = c(i10);
            String e10 = e(i10);
            sb.append(c6);
            sb.append(": ");
            if (z8.b.p(c6)) {
                e10 = "██";
            }
            sb.append(e10);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        r6.h0.s(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
