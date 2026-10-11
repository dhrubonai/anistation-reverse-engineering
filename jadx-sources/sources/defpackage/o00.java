package defpackage;

import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class o00 {
    public static final DateTimeFormatter a = DateTimeFormatter.ofPattern("yyyyMMdd");
    public static final DateTimeFormatter b = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
    public static final c15 c;

    static {
        String quote = Pattern.quote("AniStation-backup-");
        quote.getClass();
        String quote2 = Pattern.quote(".anistationbackup");
        quote2.getClass();
        c = new c15(qx1.n("^", quote, "(\\d{8})(?:-\\d{6})?(?: \\(\\d+\\))?", quote2, "$"));
    }

    public static String a(String str) {
        do3 do3Var;
        c15 c15Var = c;
        c15Var.getClass();
        Matcher matcher = c15Var.x.matcher(str);
        matcher.getClass();
        if (!matcher.matches()) {
            do3Var = null;
        } else {
            do3Var = new do3(matcher, str);
        }
        if (do3Var == null) {
            return null;
        }
        return (String) ((bo3) do3Var.a()).get(1);
    }
}
