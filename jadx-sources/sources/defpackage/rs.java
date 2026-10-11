package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rs {
    public final jd4 a;
    public final File b;

    public rs(Context context, jd4 jd4Var, byte b) {
        jd4Var.getClass();
        switch (b) {
            case 1:
                this.a = jd4Var;
                File file = new File(context.getFilesDir(), "offline_subtitles");
                file.mkdirs();
                this.b = file;
                return;
            default:
                this.a = jd4Var;
                File file2 = new File(context.getFilesDir(), "offline_artworks");
                file2.mkdirs();
                this.b = file2;
                return;
        }
    }

    public static void b(rs rsVar, String str) {
        rsVar.getClass();
        str.getClass();
        ArrayList a = rsVar.a(x97.r(str), null);
        int size = a.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = a.get(i2);
            i2++;
            ((File) obj).delete();
        }
        ArrayList a2 = rsVar.a(x97.n(str), null);
        int size2 = a2.size();
        while (i < size2) {
            Object obj2 = a2.get(i);
            i++;
            ((File) obj2).delete();
        }
    }

    public ArrayList a(String str, String str2) {
        if (str2 == null || str2.equals(str)) {
            str2 = null;
        }
        ArrayList H0 = ms.H0(new String[]{str, str2});
        ArrayList arrayList = new ArrayList(zo0.V(H0, 10));
        int size = H0.size();
        int i = 0;
        while (i < size) {
            Object obj = H0.get(i);
            i++;
            arrayList.add(new File(this.b, (String) obj));
        }
        return arrayList;
    }
}
