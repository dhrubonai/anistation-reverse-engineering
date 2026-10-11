package defpackage;

import android.util.Base64;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class cx6 {
    public static final iw2 a = new iw2(new int[]{0, 2, 1}, 3);
    public static final iw2 b = new iw2(new int[]{0, 2, 1, 3, 4}, 5);
    public static final iw2 c = new iw2(new int[]{0, 2, 1, 5, 3, 4}, 6);
    public static final iw2 d = iw2.c(2, 1, 6, 5, 3, 4);
    public static final iw2 e = iw2.c(2, 1, 7, 5, 6, 3, 4);

    public static fy3 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = eq6.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                kb0.O("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(sl4.d(new zi4(Base64.decode(split[1], 0))));
                } catch (RuntimeException e2) {
                    kb0.P("VorbisUtil", "Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new zw6(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new fy3(arrayList);
    }
}
