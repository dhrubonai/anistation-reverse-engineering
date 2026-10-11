package defpackage;

import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class t56 {
    public final byte[] a;
    public final List b;
    public final cm0 c;
    public final ArrayList d;

    public t56(z56 z56Var, byte[] bArr, byte[] bArr2, short s, List list) {
        Object obj;
        long j;
        z56Var.getClass();
        list.getClass();
        this.a = bArr;
        this.b = list;
        ArrayList arrayList = ge0.a;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = arrayList.get(i);
                i++;
                if (((cm0) obj).a == s) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        cm0 cm0Var = (cm0) obj;
        if (cm0Var != null) {
            this.c = cm0Var;
            ArrayList arrayList2 = new ArrayList();
            for (l56 l56Var : this.b) {
                if (s56.a[l56Var.a.ordinal()] == 1) {
                    oa0 oa0Var = l56Var.b;
                    List list2 = po5.a;
                    int readShort = oa0Var.readShort() & 65535;
                    ArrayList arrayList3 = new ArrayList();
                    while (true) {
                        j = oa0Var.z;
                        if (j <= 0) {
                            break;
                        }
                        wj2 a = po5.a(oa0Var.readByte(), oa0Var.readByte());
                        if (a != null) {
                            arrayList3.add(a);
                        }
                    }
                    if (((int) j) == readShort) {
                        dp0.Y(arrayList3, arrayList2);
                    } else {
                        StringBuilder s2 = qx1.s(readShort, "Invalid hash and sign packet size: expected ", ", actual ");
                        s2.append(arrayList3.size());
                        throw new SSLException(s2.toString(), null);
                    }
                }
            }
            this.d = arrayList2;
            return;
        }
        p65.m(s, "Server cipher suite is not supported: ");
        throw null;
    }
}
