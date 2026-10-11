package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ox7 {
    public static final js a = new so5(0);

    public static synchronized Uri a() {
        synchronized (ox7.class) {
            js jsVar = a;
            Uri uri = (Uri) jsVar.get("com.google.android.gms.measurement");
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                jsVar.put("com.google.android.gms.measurement", parse);
                return parse;
            }
            return uri;
        }
    }

    public static String b(Context context, String str) {
        if (!str.contains("#")) {
            String packageName = context.getPackageName();
            return qx1.q(new StringBuilder(str.length() + 1 + String.valueOf(packageName).length()), str, "#", packageName);
        }
        ze0.k("The passed in package cannot already have a subpackage: ".concat(str));
        return null;
    }
}
