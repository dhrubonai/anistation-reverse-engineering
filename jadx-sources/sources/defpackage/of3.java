package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class of3 {
    public static final /* synthetic */ int a = 0;

    static {
        zw2.q("android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.DURATION", "android.media.metadata.ALBUM", "android.media.metadata.AUTHOR", "android.media.metadata.WRITER", "android.media.metadata.COMPOSER", "android.media.metadata.COMPILATION", "android.media.metadata.DATE", "android.media.metadata.YEAR", "android.media.metadata.GENRE", "android.media.metadata.TRACK_NUMBER", "android.media.metadata.NUM_TRACKS", "android.media.metadata.DISC_NUMBER", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.ART", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART", "android.media.metadata.ALBUM_ART_URI", "android.media.metadata.USER_RATING", "android.media.metadata.RATING", "android.media.metadata.DISPLAY_TITLE", "android.media.metadata.DISPLAY_SUBTITLE", "android.media.metadata.DISPLAY_DESCRIPTION", "android.media.metadata.DISPLAY_ICON", "android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.MEDIA_ID", "android.media.metadata.MEDIA_URI", "android.media.metadata.BT_FOLDER_TYPE", "android.media.metadata.ADVERTISEMENT", "android.media.metadata.DOWNLOAD_STATUS", "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
    }

    public static long a(int i) {
        switch (i) {
            case 0:
                return 0L;
            case 1:
                return 1L;
            case 2:
                return 2L;
            case 3:
                return 3L;
            case 4:
                return 4L;
            case 5:
                return 5L;
            case 6:
                return 6L;
            default:
                ze0.k(qx1.h(i, "Unrecognized FolderType: "));
                return 0L;
        }
    }

    public static kr3 b(jr3 jr3Var, String str, Uri uri, long j, Bitmap bitmap) {
        Long l;
        sn3 sn3Var = new sn3((byte) 3);
        sn3Var.O("android.media.metadata.MEDIA_ID", str);
        CharSequence charSequence = jr3Var.a;
        Bundle bundle = jr3Var.K;
        Integer num = jr3Var.q;
        Uri uri2 = jr3Var.n;
        if (charSequence != null) {
            sn3Var.P(charSequence, "android.media.metadata.TITLE");
        }
        CharSequence charSequence2 = jr3Var.e;
        if (charSequence2 != null) {
            sn3Var.P(charSequence2, "android.media.metadata.DISPLAY_TITLE");
        }
        CharSequence charSequence3 = jr3Var.f;
        if (charSequence3 != null) {
            sn3Var.P(charSequence3, "android.media.metadata.DISPLAY_SUBTITLE");
        }
        CharSequence charSequence4 = jr3Var.g;
        if (charSequence4 != null) {
            sn3Var.P(charSequence4, "android.media.metadata.DISPLAY_DESCRIPTION");
        }
        CharSequence charSequence5 = jr3Var.b;
        if (charSequence5 != null) {
            sn3Var.P(charSequence5, "android.media.metadata.ARTIST");
        }
        CharSequence charSequence6 = jr3Var.c;
        if (charSequence6 != null) {
            sn3Var.P(charSequence6, "android.media.metadata.ALBUM");
        }
        CharSequence charSequence7 = jr3Var.d;
        if (charSequence7 != null) {
            sn3Var.P(charSequence7, "android.media.metadata.ALBUM_ARTIST");
        }
        if (jr3Var.u != null) {
            sn3Var.M(r7.intValue(), "android.media.metadata.YEAR");
        }
        CharSequence charSequence8 = jr3Var.A;
        if (charSequence8 != null) {
            sn3Var.P(charSequence8, "android.media.metadata.WRITER");
        }
        CharSequence charSequence9 = jr3Var.B;
        if (charSequence9 != null) {
            sn3Var.P(charSequence9, "android.media.metadata.COMPOSER");
        }
        if (uri != null) {
            sn3Var.O("android.media.metadata.MEDIA_URI", uri.toString());
        }
        if (uri2 != null) {
            sn3Var.O("android.media.metadata.DISPLAY_ICON_URI", uri2.toString());
            sn3Var.O("android.media.metadata.ALBUM_ART_URI", uri2.toString());
            sn3Var.O("android.media.metadata.ART_URI", uri2.toString());
        }
        if (bitmap != null) {
            sn3Var.L("android.media.metadata.DISPLAY_ICON", bitmap);
            sn3Var.L("android.media.metadata.ALBUM_ART", bitmap);
        }
        if (num != null && num.intValue() != -1) {
            sn3Var.M(a(num.intValue()), "android.media.metadata.BT_FOLDER_TYPE");
        }
        if (j == -9223372036854775807L && (l = jr3Var.h) != null) {
            j = l.longValue();
        }
        if (j == -9223372036854775807L) {
            j = -1;
        }
        sn3Var.M(j, "android.media.metadata.DURATION");
        ay4 d = d(jr3Var.i);
        if (d != null) {
            sn3Var.N("android.media.metadata.USER_RATING", d);
        }
        ay4 d2 = d(jr3Var.j);
        if (d2 != null) {
            sn3Var.N("android.media.metadata.RATING", d2);
        }
        if (jr3Var.J != null) {
            sn3Var.M(r6.intValue(), "androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT");
        }
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null && !(obj instanceof CharSequence)) {
                    if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                        sn3Var.M(((Number) obj).longValue(), str2);
                    }
                } else {
                    sn3Var.P((CharSequence) obj, str2);
                }
            }
        }
        return new kr3((Bundle) sn3Var.y);
    }

    public static yx4 c(ay4 ay4Var) {
        if (ay4Var != null) {
            float f = ay4Var.y;
            int i = ay4Var.x;
            boolean z = true;
            switch (i) {
                case 1:
                    if (ay4Var.b()) {
                        if (i != 1 || f != 1.0f) {
                            z = false;
                        }
                        return new tk2(z);
                    }
                    return new tk2();
                case 2:
                    if (ay4Var.b()) {
                        if (i != 2 || f != 1.0f) {
                            z = false;
                        }
                        return new we6(z);
                    }
                    return new we6();
                case 3:
                    if (ay4Var.b()) {
                        return new ex5(3, ay4Var.a());
                    }
                    return new ex5(3);
                case 4:
                    if (ay4Var.b()) {
                        return new ex5(4, ay4Var.a());
                    }
                    return new ex5(4);
                case 5:
                    if (ay4Var.b()) {
                        return new ex5(5, ay4Var.a());
                    }
                    return new ex5(5);
                case 6:
                    if (ay4Var.b()) {
                        if (i != 6 || !ay4Var.b()) {
                            f = -1.0f;
                        }
                        return new xk4(f);
                    }
                    return new xk4();
                default:
                    return null;
            }
        }
        return null;
    }

    public static ay4 d(yx4 yx4Var) {
        if (yx4Var != null) {
            int e = e(yx4Var);
            if (!yx4Var.b()) {
                switch (e) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return new ay4(e, -1.0f);
                    default:
                        return null;
                }
            }
            float f = 0.0f;
            switch (e) {
                case 1:
                    if (((tk2) yx4Var).c) {
                        f = 1.0f;
                    }
                    return new ay4(1, f);
                case 2:
                    if (((we6) yx4Var).c) {
                        f = 1.0f;
                    }
                    return new ay4(2, f);
                case 3:
                case 4:
                case 5:
                    return ay4.d(e, ((ex5) yx4Var).c);
                case 6:
                    return ay4.c(((xk4) yx4Var).b);
            }
        }
        return null;
    }

    public static int e(yx4 yx4Var) {
        if (yx4Var instanceof tk2) {
            return 1;
        }
        if (yx4Var instanceof we6) {
            return 2;
        }
        if (yx4Var instanceof ex5) {
            int i = ((ex5) yx4Var).b;
            int i2 = 3;
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    i2 = 5;
                    if (i != 5) {
                        return 0;
                    }
                }
            }
            return i2;
        }
        if (yx4Var instanceof xk4) {
            return 6;
        }
        return 0;
    }
}
