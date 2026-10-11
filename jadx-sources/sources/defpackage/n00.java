package defpackage;

import com.anistation.model.download.EpisodeDownload;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n00 implements Comparator {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ n00(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        byte b = this.x;
        Object obj3 = this.y;
        switch (b) {
            case 0:
                int compare = ((k82) obj3).compare(obj, obj2);
                if (compare == 0) {
                    return Long.valueOf(((p00) ((ai4) obj2).x).c).compareTo(Long.valueOf(((p00) ((ai4) obj).x).c));
                }
                return compare;
            case 1:
                int compare2 = ((n00) obj3).compare(obj, obj2);
                if (compare2 == 0) {
                    return Long.valueOf(((p00) ((ai4) obj2).x).a).compareTo(Long.valueOf(((p00) ((ai4) obj).x).a));
                }
                return compare2;
            case 2:
                int compare3 = ((k82) obj3).compare(obj, obj2);
                if (compare3 == 0) {
                    ii0 ii0Var = ((ki0) obj2).a;
                    Long valueOf = Long.valueOf(ii0Var.b - ii0Var.a);
                    ii0 ii0Var2 = ((ki0) obj).a;
                    return valueOf.compareTo(Long.valueOf(ii0Var2.b - ii0Var2.a));
                }
                return compare3;
            case 3:
                int compare4 = ((k82) obj3).compare(obj, obj2);
                if (compare4 == 0) {
                    String str = ((dj1) obj).b;
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    String lowerCase = str.toLowerCase(locale);
                    lowerCase.getClass();
                    String lowerCase2 = ((dj1) obj2).b.toLowerCase(locale);
                    lowerCase2.getClass();
                    return lowerCase.compareTo(lowerCase2);
                }
                return compare4;
            case 4:
                int compare5 = ((k82) obj3).compare(obj, obj2);
                if (compare5 == 0) {
                    return Integer.valueOf(((EpisodeDownload) obj2).getMetadata().getEpisodeNumber()).compareTo(Integer.valueOf(((EpisodeDownload) obj).getMetadata().getEpisodeNumber()));
                }
                return compare5;
            case 5:
                pp5 pp5Var = (pp5) obj3;
                return ((Comparable) pp5Var.invoke(obj)).compareTo((Comparable) pp5Var.invoke(obj2));
            case 6:
                a44 a44Var = (a44) obj3;
                return Float.valueOf(a44Var.c(((Map.Entry) obj2).getKey())).compareTo(Float.valueOf(a44Var.c(((Map.Entry) obj).getKey())));
            case 7:
                int compare6 = ((k82) obj3).compare(obj, obj2);
                if (compare6 == 0) {
                    return Integer.valueOf(((xx2) obj).a).compareTo(Integer.valueOf(((xx2) obj2).a));
                }
                return compare6;
            case 8:
                int compare7 = ((Comparator) obj3).compare(obj, obj2);
                if (compare7 == 0) {
                    za3 za3Var = ((uh5) obj).c;
                    za3 za3Var2 = ((uh5) obj2).c;
                    if (za3Var.y() == za3Var2.y()) {
                        return a34.D(za3Var.w(), za3Var2.w());
                    }
                    return Float.compare(za3Var.y(), za3Var2.y());
                }
                return compare7;
            default:
                int compare8 = ((n00) obj3).compare(obj, obj2);
                if (compare8 == 0) {
                    return Integer.valueOf(((uh5) obj).f).compareTo(Integer.valueOf(((uh5) obj2).f));
                }
                return compare8;
        }
    }
}
