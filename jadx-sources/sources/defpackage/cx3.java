package defpackage;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cx3 {
    public static final ow2 f;
    public static final vk0 g;
    public static final HashMap h;
    public static final cx3 i;
    public static final i75 j;
    public final String a;
    public final String b;
    public final ow2 c;
    public String d;
    public int e;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        ow2 ow2Var;
        String U = wc7.U(StandardCharsets.UTF_8.name());
        int i2 = 0;
        af2 af2Var = new af2((byte) 24, (byte) (0 == true ? 1 : 0));
        io3.s("charset", U);
        sq0 sq0Var = (sq0) af2Var.y;
        if (sq0Var == null) {
            sq0Var = sq0.a();
            af2Var.y = sq0Var;
        }
        fw2 fw2Var = (fw2) sq0Var.get("charset");
        if (fw2Var == null) {
            fw2Var = nw2.m(4);
            sq0 sq0Var2 = (sq0) af2Var.y;
            if (sq0Var2 == null) {
                sq0Var2 = sq0.a();
                af2Var.y = sq0Var2;
            }
            sq0Var2.put("charset", fw2Var);
        }
        fw2Var.a(U);
        sq0 sq0Var3 = (sq0) af2Var.y;
        if (sq0Var3 == null) {
            ow2Var = lt1.D;
        } else {
            Set entrySet = sq0Var3.entrySet();
            if (((AbstractCollection) entrySet).isEmpty()) {
                ow2Var = lt1.D;
            } else {
                qq0 qq0Var = (qq0) entrySet;
                eb2 eb2Var = new eb2(qq0Var.y.size());
                Iterator it = qq0Var.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    o15 g2 = ((jw2) entry.getValue()).g();
                    eb2Var.y(key, g2);
                    i2 += g2.A;
                }
                ow2Var = new ow2(eb2Var.e(true), i2);
            }
        }
        f = ow2Var;
        wk0 wk0Var = wk0.A;
        wk0 wk0Var2 = wk0.B;
        wk0Var2.getClass();
        xk0 xk0Var = new xk0(wk0Var2);
        wk0Var.getClass();
        g = new vk0(new vk0(new vk0(wk0Var, xk0Var), new zk0(' ', (byte) 1)), cl0.a("()<>@,;:\\\"/[]?=").c());
        cl0.a("\"\\\r").c().getClass();
        cl0.a(" \t\r\n");
        h = new HashMap();
        a("*", "*");
        a("text", "*");
        a("image", "*");
        a("audio", "*");
        a("video", "*");
        a("application", "*");
        a("font", "*");
        b("text", "cache-manifest");
        b("text", "css");
        b("text", "csv");
        b("text", "html");
        b("text", "calendar");
        b("text", "markdown");
        b("text", "plain");
        b("text", "javascript");
        b("text", "tab-separated-values");
        b("text", "vcard");
        b("text", "vnd.wap.wml");
        b("text", "xml");
        b("text", "vtt");
        a("image", "bmp");
        a("image", "x-canon-crw");
        a("image", "gif");
        a("image", "vnd.microsoft.icon");
        a("image", "jpeg");
        a("image", "png");
        a("image", "vnd.adobe.photoshop");
        b("image", "svg+xml");
        a("image", "tiff");
        a("image", "webp");
        a("image", "heif");
        a("image", "jp2");
        a("audio", "mp4");
        a("audio", "mpeg");
        a("audio", "ogg");
        a("audio", "webm");
        a("audio", "l16");
        a("audio", "l24");
        a("audio", "basic");
        a("audio", "aac");
        a("audio", "vorbis");
        a("audio", "x-ms-wma");
        a("audio", "x-ms-wax");
        a("audio", "vnd.rn-realaudio");
        a("audio", "vnd.wave");
        a("video", "mp4");
        a("video", "mpeg");
        a("video", "ogg");
        a("video", "quicktime");
        a("video", "webm");
        a("video", "x-ms-wmv");
        a("video", "x-flv");
        a("video", "3gpp");
        a("video", "3gpp2");
        b("application", "xml");
        b("application", "atom+xml");
        a("application", "x-bzip2");
        b("application", "dart");
        a("application", "vnd.apple.pkpass");
        a("application", "vnd.ms-fontobject");
        a("application", "epub+zip");
        a("application", "x-www-form-urlencoded");
        a("application", "pkcs12");
        a("application", "binary");
        a("application", "geo+json");
        a("application", "x-gzip");
        a("application", "hal+json");
        b("application", "javascript");
        a("application", "jose");
        a("application", "jose+json");
        i = b("application", "json");
        a("application", "jwt");
        b("application", "manifest+json");
        a("application", "vnd.google-earth.kml+xml");
        a("application", "vnd.google-earth.kmz");
        a("application", "mbox");
        a("application", "x-apple-aspen-config");
        a("application", "vnd.ms-excel");
        a("application", "vnd.ms-outlook");
        a("application", "vnd.ms-powerpoint");
        a("application", "msword");
        a("application", "dash+xml");
        a("application", "wasm");
        a("application", "x-nacl");
        a("application", "x-pnacl");
        a("application", "octet-stream");
        a("application", "ogg");
        a("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        a("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        a("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        a("application", "vnd.oasis.opendocument.graphics");
        a("application", "vnd.oasis.opendocument.presentation");
        a("application", "vnd.oasis.opendocument.spreadsheet");
        a("application", "vnd.oasis.opendocument.text");
        b("application", "opensearchdescription+xml");
        a("application", "pdf");
        a("application", "postscript");
        a("application", "protobuf");
        b("application", "rdf+xml");
        b("application", "rtf");
        a("application", "font-sfnt");
        a("application", "x-shockwave-flash");
        a("application", "vnd.sketchup.skp");
        b("application", "soap+xml");
        a("application", "x-tar");
        a("application", "font-woff");
        a("application", "font-woff2");
        b("application", "xhtml+xml");
        b("application", "xrd+xml");
        a("application", "zip");
        a("font", "collection");
        a("font", "otf");
        a("font", "sfnt");
        a("font", "ttf");
        a("font", "woff");
        a("font", "woff2");
        j = new i75((Object) new tv("; ", (byte) 2), (byte) 26);
    }

    public cx3(String str, String str2, ow2 ow2Var) {
        this.a = str;
        this.b = str2;
        this.c = ow2Var;
    }

    public static void a(String str, String str2) {
        cx3 cx3Var = new cx3(str, str2, lt1.D);
        h.put(cx3Var, cx3Var);
    }

    public static cx3 b(String str, String str2) {
        cx3 cx3Var = new cx3(str, str2, f);
        h.put(cx3Var, cx3Var);
        StandardCharsets.UTF_8.getClass();
        return cx3Var;
    }

    public final un3 c() {
        return new un3(this.c.a(), new sn3((Object) new pb0((byte) 12), (byte) 0));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof cx3) {
                cx3 cx3Var = (cx3) obj;
                if (this.a.equals(cx3Var.a) && this.b.equals(cx3Var.b) && c().equals(cx3Var.c())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2 = this.e;
        if (i2 == 0) {
            int hashCode = Arrays.hashCode(new Object[]{this.a, this.b, c()});
            this.e = hashCode;
            return hashCode;
        }
        return i2;
    }

    public final String toString() {
        String str = this.d;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append('/');
            sb.append(this.b);
            ow2 ow2Var = this.c;
            if (ow2Var.l() != 0) {
                sb.append("; ");
                Collection g2 = new z24(ow2Var, new sn3((Object) new pb0((byte) 11), (byte) 0)).g();
                i75 i75Var = j;
                i75Var.getClass();
                try {
                    i75Var.d(sb, g2.iterator());
                } catch (IOException e) {
                    throw new AssertionError(e);
                }
            }
            String sb2 = sb.toString();
            this.d = sb2;
            return sb2;
        }
        return str;
    }
}
