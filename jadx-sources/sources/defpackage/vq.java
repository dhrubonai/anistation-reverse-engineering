package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vq extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq(Object obj, int i, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
        this.y = i;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        int i = this.y;
        switch (b) {
            case 0:
                vq vqVar = new vq(i, vz0Var);
                vqVar.z = obj;
                return vqVar;
            case 1:
                return new vq((wc3) this.z, i, vz0Var, (byte) 1);
            default:
                return new vq((ky4) this.z, i, vz0Var, (byte) 2);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ((vq) create((j44) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 1:
                ((vq) create((wc5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((vq) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i = this.y;
        switch (b) {
            case 0:
                j44 j44Var = (j44) this.z;
                m37.N(obj);
                yq.d.getClass();
                j44Var.e(yq.f, new Integer(i));
                return pn6Var;
            case 1:
                m37.N(obj);
                wc3 wc3Var = (wc3) this.z;
                pc3 pc3Var = wc3Var.d;
                if (pc3Var.b.h() != i || pc3Var.c.h() != 0) {
                    od3 od3Var = wc3Var.m;
                    od3Var.e();
                    od3Var.b = null;
                    od3Var.c = -1;
                }
                pc3Var.a(i, 0);
                pc3Var.e = null;
                za3 za3Var = wc3Var.j;
                if (za3Var != null) {
                    za3Var.k();
                }
                return pn6Var;
            default:
                ky4 ky4Var = (ky4) this.z;
                uz2 uz2Var = ky4Var.b;
                oa0 oa0Var = ky4Var.d;
                m37.N(obj);
                long j = 0;
                while (oa0Var.z < i && j >= 0) {
                    try {
                        j = uz2Var.C(oa0Var, Long.MAX_VALUE);
                    } catch (EOFException unused) {
                        j = -1;
                    } catch (IOException e) {
                        Throwable b2 = ky4Var.b();
                        if (b2 == null) {
                            throw e;
                        }
                        throw b2;
                    }
                }
                if (j == -1) {
                    uz2Var.close();
                    ky4Var.e.g0();
                    Throwable b3 = ky4Var.b();
                    if (b3 == null) {
                        ky4Var.c = io3.a;
                    } else {
                        throw b3;
                    }
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq(int i, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 0;
        this.y = i;
    }
}
