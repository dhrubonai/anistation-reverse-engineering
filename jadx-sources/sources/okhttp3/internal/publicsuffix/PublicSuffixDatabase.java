package okhttp3.internal.publicsuffix;

import defpackage.a34;
import defpackage.aq1;
import defpackage.bx7;
import defpackage.iv;
import defpackage.lm4;
import defpackage.ni5;
import defpackage.nt1;
import defpackage.os;
import defpackage.qx1;
import defpackage.ri2;
import defpackage.te4;
import defpackage.uz5;
import defpackage.wi5;
import defpackage.xy4;
import defpackage.yo0;
import defpackage.ze0;
import defpackage.zp1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    public static final byte[] e = {42};
    public static final List f = te4.H("*");
    public static final PublicSuffixDatabase g = new PublicSuffixDatabase();
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final CountDownLatch b = new CountDownLatch(1);
    public byte[] c;
    public byte[] d;

    public static List c(String str) {
        List h0 = uz5.h0(str, new char[]{'.'}, 6);
        if (a34.i(yo0.r0(h0), "")) {
            return yo0.h0(h0);
        }
        return h0;
    }

    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        List list;
        List list2;
        int size;
        int size2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List c = c(unicode);
        List list3 = nt1.x;
        if (!this.a.get() && this.a.compareAndSet(false, true)) {
            boolean z = false;
            while (true) {
                try {
                    try {
                        b();
                        break;
                    } catch (InterruptedIOException unused) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e2) {
                        lm4 lm4Var = lm4.a;
                        lm4.a.getClass();
                        lm4.i("Failed to read public suffix list", 5, e2);
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        } else {
            try {
                this.b.await();
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.c != null) {
            int size3 = c.size();
            byte[][] bArr = new byte[size3];
            for (int i = 0; i < size3; i++) {
                String str5 = (String) c.get(i);
                Charset charset = StandardCharsets.UTF_8;
                charset.getClass();
                byte[] bytes = str5.getBytes(charset);
                bytes.getClass();
                bArr[i] = bytes;
            }
            int i2 = 0;
            while (true) {
                if (i2 < size3) {
                    byte[] bArr2 = this.c;
                    if (bArr2 != null) {
                        str2 = bx7.j(bArr2, bArr, i2);
                        if (str2 != null) {
                            break;
                        }
                        i2++;
                    } else {
                        a34.s0("publicSuffixListBytes");
                        throw null;
                    }
                } else {
                    str2 = null;
                    break;
                }
            }
            if (size3 > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                for (int i3 = 0; i3 < length; i3++) {
                    bArr3[i3] = e;
                    byte[] bArr4 = this.c;
                    if (bArr4 != null) {
                        str3 = bx7.j(bArr4, bArr3, i3);
                        if (str3 != null) {
                            break;
                        }
                    } else {
                        a34.s0("publicSuffixListBytes");
                        throw null;
                    }
                }
            }
            str3 = null;
            if (str3 != null) {
                int i4 = size3 - 1;
                for (int i5 = 0; i5 < i4; i5++) {
                    byte[] bArr5 = this.d;
                    if (bArr5 != null) {
                        str4 = bx7.j(bArr5, bArr, i5);
                        if (str4 != null) {
                            break;
                        }
                    } else {
                        a34.s0("publicSuffixExceptionListBytes");
                        throw null;
                    }
                }
            }
            str4 = null;
            if (str4 != null) {
                list2 = uz5.h0("!".concat(str4), new char[]{'.'}, 6);
            } else if (str2 == null && str3 == null) {
                list2 = f;
            } else {
                if (str2 != null) {
                    list = uz5.h0(str2, new char[]{'.'}, 6);
                } else {
                    list = list3;
                }
                if (str3 != null) {
                    list3 = uz5.h0(str3, new char[]{'.'}, 6);
                }
                if (list.size() > list3.size()) {
                    list2 = list;
                } else {
                    list2 = list3;
                }
            }
            if (c.size() == list2.size() && ((String) list2.get(0)).charAt(0) != '!') {
                return null;
            }
            if (((String) list2.get(0)).charAt(0) == '!') {
                size = c.size();
                size2 = list2.size();
            } else {
                size = c.size();
                size2 = list2.size() + 1;
            }
            int i6 = size - size2;
            ni5 osVar = new os(c(str), (byte) 1);
            if (i6 >= 0) {
                if (i6 != 0) {
                    if (osVar instanceof aq1) {
                        osVar = ((aq1) osVar).b(i6);
                    } else {
                        osVar = new zp1(osVar, i6, (byte) 0);
                    }
                }
                return wi5.r0(osVar, ".", null, 62);
            }
            ze0.e(qx1.i(i6, "Requested element count ", " is less than zero."));
            return null;
        }
        ze0.m("Unable to load publicsuffixes.gz resource from the classpath.");
        return null;
    }

    public final void b() {
        try {
            InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
            if (resourceAsStream != null) {
                xy4 xy4Var = new xy4(new ri2(iv.O(resourceAsStream)));
                try {
                    long readInt = xy4Var.readInt();
                    xy4Var.m(readInt);
                    byte[] G = xy4Var.y.G(readInt);
                    long readInt2 = xy4Var.readInt();
                    xy4Var.m(readInt2);
                    byte[] G2 = xy4Var.y.G(readInt2);
                    xy4Var.close();
                    synchronized (this) {
                        this.c = G;
                        this.d = G2;
                    }
                } finally {
                }
            }
        } finally {
            this.b.countDown();
        }
    }
}
