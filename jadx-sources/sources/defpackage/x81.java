package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x81 {
    public static final int[] d = {8, 13, 11, 2, 0, 1, 7};
    public w16 a;
    public boolean b;
    public byte c;

    public static void a(int i, ArrayList arrayList) {
        int i2 = 0;
        while (true) {
            if (i2 < 7) {
                if (d[i2] == i) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 != -1 && !arrayList.contains(Integer.valueOf(i))) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public final ea2 b(ea2 ea2Var) {
        String str;
        if (this.b && this.a.i(ea2Var)) {
            da2 a = ea2Var.a();
            String str2 = ea2Var.l;
            a.o = qy3.n("application/x-media3-cues");
            a.P = this.a.A(ea2Var);
            StringBuilder sb = new StringBuilder();
            sb.append(ea2Var.p);
            if (str2 != null) {
                str = " ".concat(str2);
            } else {
                str = "";
            }
            sb.append(str);
            a.k = sb.toString();
            a.t = Long.MAX_VALUE;
            return new ea2(a);
        }
        return ea2Var;
    }
}
