package defpackage;

import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class mz0 {
    public static final /* synthetic */ int a = 0;

    static {
        ms.U0(new String[]{"json", "ld+json", "xml", "xhtml+xml", "rss+xml", "atom+xml", "x-www-form-urlencoded", "svg+xml"});
    }

    public static final Charset a(jz0 jz0Var) {
        jz0Var.getClass();
        String b = jz0Var.b("charset");
        if (b != null) {
            try {
                Charset charset = kl0.a;
                Charset forName = Charset.forName(b);
                forName.getClass();
                return forName;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return null;
    }

    public static final jz0 b(jz0 jz0Var, Charset charset) {
        jz0Var.getClass();
        charset.getClass();
        String lowerCase = jz0Var.c.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (!lowerCase.equals("text")) {
            return jz0Var;
        }
        String name = charset.name();
        name.getClass();
        return jz0Var.c(name);
    }
}
