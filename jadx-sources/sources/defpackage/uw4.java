package defpackage;

import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uw4 implements ke4 {
    public final short x;
    public final Object y;
    public final Object z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ uw4(kv7 kv7Var, l38 l38Var, int i) {
        this.y = kv7Var;
        this.z = l38Var;
        this.x = i;
    }

    @Override // defpackage.ke4
    public void onSuccess(Object obj) {
        wx wxVar;
        kv7 kv7Var = (kv7) this.y;
        l38 l38Var = (l38) this.z;
        if (((Boolean) obj).booleanValue()) {
            k38 n = l38.n(l38Var);
            String str = kv7Var.d;
            n.a();
            ((l38) n.y).q(str);
            n.a();
            ((l38) n.y).r(str);
            Long l = kv7Var.e;
            if (l != null) {
                int longValue = (int) l.longValue();
                n.a();
                ((l38) n.y).s(longValue);
            }
            l38 l38Var2 = (l38) n.b();
            int i = kv7Var.i;
            int i2 = i - 1;
            if (i != 0) {
                int i3 = this.x - 1;
                byte b = 1;
                cu4 cu4Var = cu4.y;
                if (i2 != 0) {
                    if (i2 != 1) {
                        wxVar = new wx(Integer.valueOf(i3), l38Var2, cu4Var);
                    } else {
                        wxVar = new wx(Integer.valueOf(i3), l38Var2, cu4.x);
                    }
                } else {
                    wxVar = new wx(Integer.valueOf(i3), l38Var2, cu4Var);
                }
                kv7.j.b("analytics event: %s", wxVar);
                st3 st3Var = kv7Var.g;
                if (st3Var != null) {
                    p65 p65Var = new p65((byte) 18);
                    hj6 hj6Var = (hj6) st3Var.z;
                    oy oyVar = (oy) st3Var.x;
                    au1 au1Var = (au1) st3Var.y;
                    ka1 ka1Var = hj6Var.c;
                    st3 a = oy.a();
                    a.G(oyVar.a);
                    a.z = wxVar.c;
                    a.y = oyVar.b;
                    oy f = a.f();
                    tp tpVar = new tp(b);
                    tpVar.D = new HashMap();
                    tpVar.B = Long.valueOf(hj6Var.a.f());
                    tpVar.C = Long.valueOf(hj6Var.b.f());
                    tpVar.y = "CAST_SENDER_SDK";
                    l38 l38Var3 = wxVar.b;
                    try {
                        int a2 = l38Var3.a();
                        byte[] bArr = new byte[a2];
                        j98 j98Var = new j98(a2, bArr);
                        pb8 a3 = mb8.c.a(l38Var3.getClass());
                        qb7 qb7Var = j98Var.a;
                        if (qb7Var == null) {
                            qb7Var = new qb7(j98Var);
                        }
                        a3.h(l38Var3, qb7Var);
                        if (a2 - j98Var.d == 0) {
                            tpVar.A = new ut1(au1Var, bArr);
                            tpVar.z = wxVar.a;
                            ka1Var.b.execute(new ze(ka1Var, f, p65Var, tpVar.d()));
                            return;
                        }
                        throw new IllegalStateException("Did not write as much data as expected.");
                    } catch (IOException e) {
                        String name = l38Var3.getClass().getName();
                        ov3.k(qx1.q(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
                        return;
                    }
                }
                return;
            }
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uw4(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.y = uuid;
        this.x = i;
        this.z = bArr;
    }
}
