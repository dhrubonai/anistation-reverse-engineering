package defpackage;

import com.unity3d.services.core.device.MimeTypes;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class c95 {
    public final t54 a;
    public final int b;
    public final fy3 c;
    public boolean d;

    public c95(ea2 ea2Var, t54 t54Var) {
        this.a = t54Var;
        this.c = ea2Var.m;
        this.b = yu5.g(ea2Var.p);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ew2, yw2] */
    public static String i(ea2 ea2Var, List list) {
        String str = ea2Var.p;
        hp0 hp0Var = ea2Var.H;
        str.getClass();
        boolean m = qy3.m(str);
        ?? ew2Var = new ew2(4);
        ew2Var.a(str);
        if (m) {
            ew2Var.c(MimeTypes.VIDEO_H265);
            ew2Var.c(MimeTypes.VIDEO_H264);
        }
        ew2Var.g(list);
        nw2 b = ew2Var.h().b();
        for (int i = 0; i < b.size(); i++) {
            String str2 = (String) b.get(i);
            if (list.contains(str2)) {
                if (m && hp0.h(hp0Var)) {
                    if (!zt1.e(str2, hp0Var).isEmpty()) {
                        return str2;
                    }
                } else if (!zt1.d(str2).isEmpty()) {
                    return str2;
                }
            }
        }
        return null;
    }

    public abstract bi2 j(qr1 qr1Var, ea2 ea2Var, int i);

    public abstract q61 k();

    public abstract ea2 l();

    public abstract boolean m();

    public boolean n() {
        return false;
    }

    public abstract void p();

    public void o() {
    }
}
