package defpackage;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gk2 implements d31 {
    public ArrayList a;

    public gk2(byte b) {
        switch (b) {
            case 2:
                this.a = new ArrayList();
                return;
            default:
                this.a = new ArrayList(20);
                return;
        }
    }

    @Override // defpackage.d31
    public long a(long j) {
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            if (j < ((e31) arrayList.get(0)).b) {
                return ((e31) arrayList.get(0)).b;
            }
            for (int i = 1; i < arrayList.size(); i++) {
                long j2 = ((e31) arrayList.get(i)).b;
                if (j < j2) {
                    long j3 = ((e31) arrayList.get(i - 1)).d;
                    if (j3 != -9223372036854775807L && j3 > j && j3 < j2) {
                        return j3;
                    }
                    return j2;
                }
            }
            long j4 = ((e31) bx7.z(arrayList)).d;
            if (j4 != -9223372036854775807L && j < j4) {
                return j4;
            }
            return Long.MIN_VALUE;
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    @Override // defpackage.d31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(defpackage.e31 r10, long r11) {
        /*
            r9 = this;
            java.util.ArrayList r9 = r9.a
            long r0 = r10.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L11
            r4 = r6
            goto L12
        L11:
            r4 = r5
        L12:
            defpackage.io3.n(r4)
            int r4 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r4 > 0) goto L25
            long r7 = r10.d
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L23
            int r2 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r2 >= 0) goto L25
        L23:
            r2 = r6
            goto L26
        L25:
            r2 = r5
        L26:
            int r3 = r9.size()
            int r3 = r3 - r6
        L2b:
            if (r3 < 0) goto L4e
            java.lang.Object r4 = r9.get(r3)
            e31 r4 = (defpackage.e31) r4
            long r7 = r4.b
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 < 0) goto L3e
            int r3 = r3 + r6
            r9.add(r3, r10)
            return r2
        L3e:
            java.lang.Object r4 = r9.get(r3)
            e31 r4 = (defpackage.e31) r4
            long r7 = r4.b
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 > 0) goto L4b
            r2 = r5
        L4b:
            int r3 = r3 + (-1)
            goto L2b
        L4e:
            r9.add(r5, r10)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gk2.b(e31, long):boolean");
    }

    @Override // defpackage.d31
    public nw2 c(long j) {
        int k = k(j);
        if (k == 0) {
            z62 z62Var = nw2.y;
            return o15.B;
        }
        e31 e31Var = (e31) this.a.get(k - 1);
        long j2 = e31Var.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            z62 z62Var2 = nw2.y;
            return o15.B;
        }
        return e31Var.a;
    }

    @Override // defpackage.d31
    public void clear() {
        this.a.clear();
    }

    @Override // defpackage.d31
    public long d(long j) {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || j < ((e31) arrayList.get(0)).b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((e31) arrayList.get(i)).b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                e31 e31Var = (e31) arrayList.get(i - 1);
                long j3 = e31Var.d;
                if (j3 != -9223372036854775807L && j3 <= j) {
                    return j3;
                }
                return e31Var.b;
            }
        }
        e31 e31Var2 = (e31) bx7.z(arrayList);
        long j4 = e31Var2.d;
        if (j4 != -9223372036854775807L && j >= j4) {
            return j4;
        }
        return e31Var2.b;
    }

    @Override // defpackage.d31
    public void e(long j) {
        ArrayList arrayList = this.a;
        int k = k(j);
        if (k == 0) {
            return;
        }
        long j2 = ((e31) arrayList.get(k - 1)).d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            k--;
        }
        arrayList.subList(0, k).clear();
    }

    public void f(String str, String str2) {
        str.getClass();
        str2.getClass();
        z51.f(str);
        z51.g(str2, str);
        h(str, str2);
    }

    public void g(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                String str = (String) obj;
                if (str != null) {
                    ArrayList arrayList2 = this.a;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        this.a = arrayList2;
                    }
                    if (!arrayList2.contains(str)) {
                        this.a.add(str);
                    }
                } else {
                    ze0.k("category must not be null");
                    return;
                }
            }
        }
    }

    public void h(String str, String str2) {
        str.getClass();
        str2.getClass();
        ArrayList arrayList = this.a;
        arrayList.add(str);
        arrayList.add(uz5.w0(str2).toString());
    }

    public ik2 i() {
        return new ik2((String[]) this.a.toArray(new String[0]));
    }

    public ks3 j() {
        if (this.a == null) {
            return ks3.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new ks3(bundle, this.a);
    }

    public int k(long j) {
        ArrayList arrayList = this.a;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((e31) arrayList.get(i)).b) {
                return i;
            }
        }
        return arrayList.size();
    }

    public void l(String str) {
        ArrayList arrayList = this.a;
        str.getClass();
        int i = 0;
        while (i < arrayList.size()) {
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }
}
