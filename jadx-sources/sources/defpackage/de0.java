package defpackage;

import java.security.MessageDigest;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class de0 implements v46 {
    public final cm0 a;
    public final byte[] b;
    public final Cipher c;
    public final SecretKeySpec d;
    public final Mac e;
    public final Cipher f;
    public final SecretKeySpec g;
    public final Mac h;
    public long i;
    public long j;

    public de0(cm0 cm0Var, byte[] bArr) {
        this.a = cm0Var;
        this.b = bArr;
        String str = cm0Var.e;
        Cipher cipher = Cipher.getInstance(str);
        cipher.getClass();
        this.c = cipher;
        byte[] bArr2 = u83.a;
        this.d = new SecretKeySpec(bArr, cm0Var.p * 2, cm0Var.o, uz5.q0(str, "/"));
        String str2 = cm0Var.j;
        Mac mac = Mac.getInstance(str2);
        mac.getClass();
        this.e = mac;
        Cipher cipher2 = Cipher.getInstance(str);
        cipher2.getClass();
        this.f = cipher2;
        this.g = u83.a(cm0Var, bArr);
        Mac mac2 = Mac.getInstance(str2);
        mac2.getClass();
        this.h = mac2;
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [cv5, qq5, java.lang.Object] */
    @Override // defpackage.v46
    public final p56 a(p56 p56Var) {
        byte[] C0;
        p56Var.getClass();
        r56 r56Var = p56Var.a;
        cv5 cv5Var = p56Var.c;
        cm0 cm0Var = this.a;
        IvParameterSpec ivParameterSpec = new IvParameterSpec(nv5.o(cv5Var, cm0Var.g));
        Cipher cipher = this.f;
        cipher.init(2, this.g, ivParameterSpec);
        byte[] p = nv5.p(em0.a(cv5Var, cipher, new hi0((byte) 8)), -1);
        int length = (p.length - (p[p.length - 1] & 255)) - 1;
        int i = cm0Var.p;
        int i2 = length - i;
        int i3 = p[p.length - 1] & 255;
        int length2 = p.length;
        while (length < length2) {
            int i4 = p[length] & 255;
            if (i3 == i4) {
                length++;
            } else {
                throw new SSLException(zo5.m("Padding invalid: expected ", ", actual ", i3, i4), null);
            }
        }
        Mac mac = this.h;
        mac.reset();
        byte[] bArr = u83.a;
        mac.init(new SecretKeySpec(this.b, i, i, cm0Var.l.z));
        byte[] bArr2 = new byte[13];
        am0.a(bArr2, 0, this.i);
        bArr2[8] = r56Var.x;
        bArr2[9] = 3;
        bArr2[10] = 3;
        am0.b(bArr2, (short) i2);
        this.i++;
        mac.update(bArr2);
        mac.update(p, 0, i2);
        byte[] doFinal = mac.doFinal();
        doFinal.getClass();
        f13 r0 = db.r0(i2, i + i2);
        r0.getClass();
        if (r0.isEmpty()) {
            C0 = new byte[0];
        } else {
            C0 = ms.C0(p, r0.x, r0.y + 1);
        }
        if (MessageDigest.isEqual(doFinal, C0)) {
            ?? obj = new Object();
            db.u0(obj, p, 0, i2);
            return new p56(r56Var, p56Var.b, obj);
        }
        throw new SSLException("Failed to verify MAC content", null);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [cv5, qq5, java.lang.Object, oa0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [cv5, java.lang.Object, oa0] */
    @Override // defpackage.v46
    public final p56 b(p56 p56Var) {
        int i;
        StringBuilder sb;
        String sb2;
        p56Var.getClass();
        r56 r56Var = p56Var.a;
        cm0 cm0Var = this.a;
        byte b = cm0Var.g;
        int i2 = y21.a;
        ?? obj = new Object();
        while (true) {
            if (((int) obj.z) >= b) {
                break;
            }
            Object a = dk0.a(sa4.g.e());
            if (a instanceof String) {
                sb2 = (String) a;
            } else {
                sa4.h.start();
                if (a == null) {
                    sb = new StringBuilder(32);
                } else {
                    sb = (StringBuilder) a;
                }
                byte[] bArr = new byte[16];
                SecureRandom secureRandom = (SecureRandom) sa4.i.getValue();
                while (sb.length() < 32) {
                    secureRandom.nextBytes(bArr);
                    String d = al2.d(bArr);
                    int length = 32 - sb.length();
                    int length2 = d.length();
                    if (length > length2) {
                        length = length2;
                    }
                    sb.append((CharSequence) d, 0, length);
                }
                sb2 = sb.toString();
            }
            et5.m(obj, sb2, 0, 14);
        }
        IvParameterSpec ivParameterSpec = new IvParameterSpec(nv5.o(obj, b));
        Cipher cipher = this.c;
        cipher.init(1, this.d, ivParameterSpec);
        cv5 cv5Var = p56Var.c;
        cv5Var.getClass();
        byte[] p = nv5.p(cv5Var, -1);
        Mac mac = this.e;
        mac.reset();
        byte[] bArr2 = u83.a;
        mac.init(new SecretKeySpec(this.b, 0, cm0Var.p, cm0Var.l.z));
        byte[] bArr3 = new byte[13];
        am0.a(bArr3, 0, this.j);
        bArr3[8] = r56Var.x;
        bArr3[9] = 3;
        bArr3[10] = 3;
        am0.b(bArr3, (short) p.length);
        this.j++;
        mac.update(bArr3);
        byte[] doFinal = mac.doFinal(p);
        doFinal.getClass();
        ?? obj2 = new Object();
        db.u0(obj2, p, 0, p.length);
        db.u0(obj2, doFinal, 0, doFinal.length);
        byte blockSize = (byte) (cipher.getBlockSize() - ((((int) obj2.z) + 1) % cipher.getBlockSize()));
        int i3 = blockSize + 1;
        for (i = 0; i < i3; i++) {
            obj2.l0(blockSize);
        }
        return new p56(r56Var, em0.a(obj2, cipher, new l0(this, (byte) 22)));
    }
}
