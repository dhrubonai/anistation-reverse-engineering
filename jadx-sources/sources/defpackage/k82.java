package defpackage;

import com.anistation.model.Episode;
import com.anistation.model.download.EpisodeDownload;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k82 implements Comparator {
    public final /* synthetic */ byte x;
    public static final k82 y = new k82(0);
    public static final k82 z = new k82(1);
    public static final k82 A = new k82(2);
    public static final k82 B = new k82(3);
    public static final k82 C = new k82(4);

    public /* synthetic */ k82(byte b) {
        this.x = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object[], java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer num;
        switch (this.x) {
            case 0:
                h82 h82Var = (h82) obj;
                h82 h82Var2 = (h82) obj2;
                if (bb4.J(h82Var) && bb4.J(h82Var2)) {
                    za3 O = wc7.O(h82Var);
                    za3 O2 = wc7.O(h82Var2);
                    if (!a34.i(O, O2)) {
                        za3[] za3VarArr = new za3[16];
                        int i = 0;
                        while (O != null) {
                            int i2 = i + 1;
                            if (za3VarArr.length < i2) {
                                int length = za3VarArr.length;
                                ?? r4 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(za3VarArr, 0, r4, 0, length);
                                za3VarArr = r4;
                            }
                            if (i != 0) {
                                System.arraycopy(za3VarArr, 0, za3VarArr, 0 + 1, i + 0);
                            }
                            za3VarArr[0] = O;
                            i++;
                            O = O.v();
                        }
                        za3[] za3VarArr2 = new za3[16];
                        int i3 = 0;
                        while (O2 != null) {
                            int i4 = i3 + 1;
                            if (za3VarArr2.length < i4) {
                                int length2 = za3VarArr2.length;
                                ?? r42 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(za3VarArr2, 0, r42, 0, length2);
                                za3VarArr2 = r42;
                            }
                            if (i3 != 0) {
                                System.arraycopy(za3VarArr2, 0, za3VarArr2, 0 + 1, i3 + 0);
                            }
                            za3VarArr2[0] = O2;
                            i3++;
                            O2 = O2.v();
                        }
                        int min = Math.min(i - 1, i3 - 1);
                        if (min >= 0) {
                            int i5 = 0;
                            while (a34.i(za3VarArr[i5], za3VarArr2[i5])) {
                                if (i5 != min) {
                                    i5++;
                                }
                            }
                            return a34.D(za3VarArr[i5].w(), za3VarArr2[i5].w());
                        }
                        ze0.m("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (bb4.J(h82Var)) {
                        return -1;
                    }
                    if (bb4.J(h82Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                n05 h = ((uh5) obj).h();
                n05 h2 = ((uh5) obj2).h();
                int compare = Float.compare(h.a, h2.a);
                if (compare == 0) {
                    int compare2 = Float.compare(h.b, h2.b);
                    if (compare2 == 0) {
                        int compare3 = Float.compare(h.d, h2.d);
                        if (compare3 == 0) {
                            return Float.compare(h.c, h2.c);
                        }
                        return compare3;
                    }
                    return compare2;
                }
                return compare;
            case 2:
                za3 za3Var = (za3) obj;
                za3 za3Var2 = (za3) obj2;
                int D = a34.D(za3Var2.M, za3Var.M);
                if (D == 0) {
                    return a34.D(za3Var.hashCode(), za3Var2.hashCode());
                }
                return D;
            case 3:
                n05 h3 = ((uh5) obj).h();
                n05 h4 = ((uh5) obj2).h();
                int compare4 = Float.compare(h4.c, h3.c);
                if (compare4 == 0) {
                    int compare5 = Float.compare(h3.b, h4.b);
                    if (compare5 == 0) {
                        int compare6 = Float.compare(h3.d, h4.d);
                        if (compare6 == 0) {
                            return Float.compare(h4.a, h3.a);
                        }
                        return compare6;
                    }
                    return compare5;
                }
                return compare4;
            case 4:
                ai4 ai4Var = (ai4) obj;
                ai4 ai4Var2 = (ai4) obj2;
                int compare7 = Float.compare(((n05) ai4Var.x).b, ((n05) ai4Var2.x).b);
                if (compare7 == 0) {
                    return Float.compare(((n05) ai4Var.x).d, ((n05) ai4Var2.x).d);
                }
                return compare7;
            case 5:
                return Integer.valueOf(((jo) obj).b).compareTo(Integer.valueOf(((jo) obj2).b));
            case 6:
                return Integer.valueOf(((jo) obj).b).compareTo(Integer.valueOf(((jo) obj2).b));
            case 7:
                return jf7.s((Comparable) ((ai4) obj2).y, (Comparable) ((ai4) obj).y);
            case 8:
                return Long.valueOf(((ii0) obj).a).compareTo(Long.valueOf(((ii0) obj2).a));
            case 9:
                return Integer.valueOf(((ki0) obj2).a.c.length()).compareTo(Integer.valueOf(((ki0) obj).a.c.length()));
            case 10:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int min2 = Math.min(str.length(), str2.length());
                int i6 = 4;
                while (true) {
                    if (i6 < min2) {
                        char charAt = str.charAt(i6);
                        char charAt2 = str2.charAt(i6);
                        if (charAt != charAt2) {
                            if (a34.D(charAt, charAt2) < 0) {
                                return -1;
                            }
                        } else {
                            i6++;
                        }
                    } else {
                        int length3 = str.length();
                        int length4 = str2.length();
                        if (length3 == length4) {
                            return 0;
                        }
                        if (length3 < length4) {
                            return -1;
                        }
                    }
                }
                return 1;
            case 11:
                za3 za3Var3 = (za3) obj;
                za3 za3Var4 = (za3) obj2;
                int D2 = a34.D(za3Var3.M, za3Var4.M);
                if (D2 == 0) {
                    return a34.D(za3Var3.hashCode(), za3Var4.hashCode());
                }
                return D2;
            case 12:
                return Integer.valueOf(((EpisodeDownload) obj).getMetadata().getEpisodeNumber()).compareTo(Integer.valueOf(((EpisodeDownload) obj2).getMetadata().getEpisodeNumber()));
            case 13:
                return Integer.valueOf(((EpisodeDownload) obj).getMetadata().getEpisodeNumber()).compareTo(Integer.valueOf(((EpisodeDownload) obj2).getMetadata().getEpisodeNumber()));
            case 14:
                return Integer.valueOf(((EpisodeDownload) obj2).getMetadata().getEpisodeNumber()).compareTo(Integer.valueOf(((EpisodeDownload) obj).getMetadata().getEpisodeNumber()));
            case 15:
                Integer num2 = 2;
                String str3 = ((dj1) obj).a;
                if (a34.i(str3, "ja")) {
                    num = 0;
                } else if (a34.i(str3, "en")) {
                    num = 1;
                } else {
                    num = num2;
                }
                String str4 = ((dj1) obj2).a;
                if (a34.i(str4, "ja")) {
                    num2 = 0;
                } else if (a34.i(str4, "en")) {
                    num2 = 1;
                }
                return num.compareTo(num2);
            case 16:
                return Long.valueOf(((EpisodeDownload) obj2).getMetadata().getCreatedAt()).compareTo(Long.valueOf(((EpisodeDownload) obj).getMetadata().getCreatedAt()));
            case 17:
                return Integer.valueOf(((EpisodeDownload) obj).getMetadata().getEpisodeNumber()).compareTo(Integer.valueOf(((EpisodeDownload) obj2).getMetadata().getEpisodeNumber()));
            case 18:
                return Integer.valueOf(((Episode) obj).getNumber()).compareTo(Integer.valueOf(((Episode) obj2).getNumber()));
            case 19:
                return Integer.valueOf(((Episode) obj).getNumber()).compareTo(Integer.valueOf(((Episode) obj2).getNumber()));
            case 20:
                return Integer.valueOf(((Episode) obj2).getNumber()).compareTo(Integer.valueOf(((Episode) obj).getNumber()));
            case 21:
                ((gq2) obj2).getClass();
                Double valueOf = Double.valueOf(0.0d);
                ((gq2) obj).getClass();
                return valueOf.compareTo(valueOf);
            case 22:
                Charset charset = (Charset) obj;
                charset.getClass();
                String name = charset.name();
                name.getClass();
                Charset charset2 = (Charset) obj2;
                charset2.getClass();
                String name2 = charset2.name();
                name2.getClass();
                return name.compareTo(name2);
            case 23:
                return jf7.s((Float) ((ai4) obj2).y, (Float) ((ai4) obj).y);
            case 24:
                return Float.valueOf(o80.O((b31) ((xx2) obj).b)).compareTo(Float.valueOf(o80.O((b31) ((xx2) obj2).b)));
            case 25:
                ((ld4) obj2).getClass();
                Integer num3 = 2;
                ((ld4) obj).getClass();
                return num3.compareTo(num3);
            case 26:
                ((je2) obj2).getClass();
                Integer num4 = 0;
                ((je2) obj).getClass();
                return num4.compareTo(num4);
            case 27:
                return jf7.s((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 28:
                return jf7.s((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            default:
                return jf7.s(((s66) obj).a, ((s66) obj2).a);
        }
    }
}
