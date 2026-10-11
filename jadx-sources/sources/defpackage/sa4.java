package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class sa4 {
    public static final yk3 a = bl3.b("io.ktor.util.random");
    public static final List b = te4.I("NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG");
    public static final int c = a(30000, "reseed-period");
    public static final int d = a(64, "nonce.buffer-size");
    public static final int e = a(256, "reseed-bytes");
    public static final int f = a(4, "insecure-factor");
    public static final za0 g = iv.d(a(128, "nonce.channel-size"), 6, null);
    public static final bx5 h;
    public static final d46 i;

    /* JADX WARN: Type inference failed for: r1v12, types: [t36, ic2] */
    static {
        r11 r11Var = new r11("nonce-generator");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new s64((byte) 1));
        newSingleThreadExecutor.getClass();
        h = tl7.y(jf2.x, new dx1(newSingleThreadExecutor).plus(la4.x).plus(r11Var), y11.y, new t36(2, null));
        i = new d46(new qa4((byte) 0));
    }

    public static final int a(int i2, String str) {
        String property = System.getProperty("io.ktor.random.secure.".concat(str), null);
        if (property != null) {
            try {
                return Integer.parseInt(property);
            } catch (NumberFormatException unused) {
                a.g(qx1.n("Invalid integer '", property, "' for property io.ktor.random.secure.", str, ", falling back to default"));
            }
        }
        return i2;
    }

    public static final SecureRandom b() {
        SecureRandom secureRandom;
        SecureRandom secureRandom2;
        SecureRandom secureRandom3;
        String property = System.getProperty("io.ktor.random.secure.random.provider");
        if (property != null) {
            try {
                secureRandom = SecureRandom.getInstance(property);
            } catch (NoSuchAlgorithmException unused) {
                secureRandom = null;
            }
            if (secureRandom != null) {
                return secureRandom;
            }
        }
        for (String str : b) {
            if (str != null) {
                try {
                    secureRandom3 = SecureRandom.getInstance(str);
                } catch (NoSuchAlgorithmException unused2) {
                    secureRandom3 = null;
                }
            } else {
                secureRandom3 = new SecureRandom();
            }
            if (secureRandom3 != null) {
                return secureRandom3;
            }
        }
        String str2 = "None of the " + yo0.q0(b, null, null, null, null, 63) + " found, falling back to the JDK strong default";
        yk3 yk3Var = a;
        yk3Var.g(str2);
        try {
            SecureRandom instanceStrong = SecureRandom.getInstanceStrong();
            instanceStrong.getClass();
            return instanceStrong;
        } catch (NoSuchMethodError | NoSuchAlgorithmException unused3) {
            yk3Var.g("None of the JDK determined strong SecureRandom providers were available, falling back to the default");
            try {
                secureRandom2 = new SecureRandom();
            } catch (NoSuchAlgorithmException unused4) {
                secureRandom2 = null;
            }
            if (secureRandom2 != null) {
                return secureRandom2;
            }
            ze0.m("No SecureRandom implementation found");
            return null;
        }
    }
}
