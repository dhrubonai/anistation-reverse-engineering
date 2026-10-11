package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ee0 {
    public static final String c;
    public static final Set d;
    public static final ee0 e;
    public final String a;
    public final String b;

    static {
        String f = iz5.f("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        c = f;
        iz5.f("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        iz5.f("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet(new HashSet(Arrays.asList(new au1("proto"), new au1("json"))));
        e = new ee0(f, null);
    }

    public ee0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static ee0 a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        String str2 = null;
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str3 = split[0];
                if (!str3.isEmpty()) {
                    String str4 = split[1];
                    if (!str4.isEmpty()) {
                        str2 = str4;
                    }
                    return new ee0(str3, str2);
                }
                ze0.k("Missing endpoint in CCTDestination extras");
                return null;
            }
            ze0.k("Extra is not a valid encoded LegacyFlgDestination");
            return null;
        }
        ze0.k("Version marker missing from extras");
        return null;
    }
}
