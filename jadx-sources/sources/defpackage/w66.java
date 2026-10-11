package defpackage;

import com.anistation.model.Episode;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w66 implements Comparator {
    public static final /* synthetic */ w66 y = new w66(7);
    public final /* synthetic */ byte x;

    public /* synthetic */ w66(byte b) {
        this.x = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        switch (this.x) {
            case 0:
                return jf7.s(((u66) obj).a, ((u66) obj2).a);
            case 1:
                return Integer.valueOf(((Episode) obj).getNumber()).compareTo(Integer.valueOf(((Episode) obj2).getNumber()));
            case 2:
                return Integer.valueOf(((Episode) obj2).getNumber()).compareTo(Integer.valueOf(((Episode) obj).getNumber()));
            case 3:
                Integer J = b06.J(10, b06.G((String) obj2, "p", ""));
                int i2 = 0;
                if (J != null) {
                    i = J.intValue();
                } else {
                    i = 0;
                }
                Integer valueOf = Integer.valueOf(i);
                Integer J2 = b06.J(10, b06.G((String) obj, "p", ""));
                if (J2 != null) {
                    i2 = J2.intValue();
                }
                return valueOf.compareTo(Integer.valueOf(i2));
            case 4:
                return jf7.s(((t97) obj).a, ((t97) obj2).a);
            case 5:
                int a = zo5.a(obj);
                int a2 = zo5.a(obj2);
                if (a == a2) {
                    int B = h11.B(a);
                    if (B != 0) {
                        if (B != 1) {
                            if (B != 2) {
                                if (B == 3) {
                                    return ((Double) obj).compareTo((Double) obj2);
                                }
                                throw null;
                            }
                            return ((Long) obj).compareTo((Long) obj2);
                        }
                        return ((String) obj).compareTo((String) obj2);
                    }
                    return ((Boolean) obj).compareTo((Boolean) obj2);
                }
                if (a != 0) {
                    if (a2 != 0) {
                        return a - a2;
                    }
                    throw null;
                }
                throw null;
            case 6:
                return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}
