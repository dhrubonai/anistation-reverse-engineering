package d8;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final SecureRandom f3251a = new SecureRandom();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f3252b = Pattern.compile("\"exp\"\\s*:\\s*(\\d+)");

    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r11, java.lang.String r12, java.lang.String r13, long r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d8.c.a(java.lang.String, java.lang.String, java.lang.String, long):java.lang.String");
    }

    public static boolean b(String str) {
        if (str == null) {
            return false;
        }
        if (!str.trim().isEmpty()) {
            try {
                String[] split = str.split("\\.");
                if (split.length < 2) {
                    return false;
                }
                String replace = split[1].replace('-', '+').replace('_', '/');
                int length = (4 - (replace.length() % 4)) % 4;
                for (int i10 = 0; i10 < length; i10++) {
                    replace = replace + "=";
                }
                Matcher matcher = f3252b.matcher(new String(Base64.decode(replace, 0), StandardCharsets.UTF_8));
                if (!matcher.find()) {
                    return false;
                }
                if (Long.parseLong(matcher.group(1)) <= (System.currentTimeMillis() / 1000) + 3600) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    public static String c(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b10 : digest) {
                sb.append(String.format(Locale.US, "%02x", Integer.valueOf(b10 & 255)));
            }
            return sb.toString();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
