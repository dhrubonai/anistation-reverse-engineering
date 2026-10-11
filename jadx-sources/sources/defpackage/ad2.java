package defpackage;

import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ad2 implements v46 {
    public final cm0 a;
    public final byte[] b;
    public long c;
    public long d;

    public ad2(cm0 cm0Var, byte[] bArr) {
        this.a = cm0Var;
        this.b = bArr;
    }

    @Override // defpackage.v46
    public final p56 a(p56 p56Var) {
        p56Var.getClass();
        cv5 cv5Var = p56Var.c;
        long w = sw0.w(cv5Var);
        long readLong = cv5Var.readLong();
        r56 r56Var = p56Var.a;
        long j = this.c;
        this.c = 1 + j;
        cm0 cm0Var = this.a;
        Cipher cipher = Cipher.getInstance(cm0Var.e);
        cipher.getClass();
        byte[] bArr = this.b;
        SecretKeySpec a = u83.a(cm0Var, bArr);
        int i = (cm0Var.o * 2) + (cm0Var.p * 2);
        byte b = cm0Var.g;
        byte[] C0 = ms.C0(bArr, i + b, (b * 2) + i);
        byte b2 = cm0Var.h;
        byte[] copyOf = Arrays.copyOf(C0, (int) b2);
        am0.a(copyOf, b, readLong);
        byte b3 = cm0Var.i;
        cipher.init(2, a, new GCMParameterSpec(b3 * 8, copyOf));
        int i2 = (((int) w) - (b2 - b)) - b3;
        if (i2 < 65536) {
            byte[] bArr2 = new byte[13];
            am0.a(bArr2, 0, j);
            bArr2[8] = r56Var.x;
            bArr2[9] = 3;
            bArr2[10] = 3;
            am0.b(bArr2, (short) i2);
            cipher.updateAAD(bArr2);
            return new p56(r56Var, p56Var.b, em0.a(cv5Var, cipher, new hi0((byte) 8)));
        }
        p65.f(qx1.h(i2, "Content size should fit in 2 bytes, actual: "));
        return null;
    }

    @Override // defpackage.v46
    public final p56 b(p56 p56Var) {
        p56Var.getClass();
        r56 r56Var = p56Var.a;
        cv5 cv5Var = p56Var.c;
        int w = (int) sw0.w(cv5Var);
        long j = this.d;
        cm0 cm0Var = this.a;
        String str = cm0Var.e;
        Cipher cipher = Cipher.getInstance(str);
        cipher.getClass();
        byte[] bArr = u83.a;
        int i = cm0Var.p;
        int i2 = cm0Var.o;
        String q0 = uz5.q0(str, "/");
        byte[] bArr2 = this.b;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, i * 2, i2, q0);
        int i3 = (i2 * 2) + (i * 2);
        byte b = cm0Var.g;
        byte[] copyOf = Arrays.copyOf(ms.C0(bArr2, i3, i3 + b), (int) cm0Var.h);
        am0.a(copyOf, b, j);
        cipher.init(1, secretKeySpec, new GCMParameterSpec(cm0Var.i * 8, copyOf));
        byte[] bArr3 = new byte[13];
        am0.a(bArr3, 0, j);
        bArr3[8] = r56Var.x;
        bArr3[9] = 3;
        bArr3[10] = 3;
        am0.b(bArr3, (short) w);
        cipher.updateAAD(bArr3);
        oa0 a = em0.a(cv5Var, cipher, new pb(this.d, (byte) 5));
        this.d++;
        return new p56(r56Var, a);
    }
}
