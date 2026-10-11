package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rc6 extends gu2 {
    public final String b;
    public final nw2 c;

    public rc6(o15 o15Var, String str, String str2) {
        super(str);
        io3.n(!o15Var.isEmpty());
        this.b = str2;
        nw2 o = nw2.o(o15Var);
        this.c = o;
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ey3
    public final void b(hr3 hr3Var) {
        char c;
        String str = this.a;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2581856:
                if (str.equals("TPOS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2584864:
                if (str.equals("TSST")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        Integer num = null;
        nw2 nw2Var = this.c;
        try {
            switch (c) {
                case 0:
                case '\n':
                    hr3Var.c = (CharSequence) nw2Var.get(0);
                    return;
                case 1:
                case 11:
                    hr3Var.A = (CharSequence) nw2Var.get(0);
                    return;
                case 2:
                case '\r':
                    String str2 = (String) nw2Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    hr3Var.u = Integer.valueOf(parseInt);
                    hr3Var.v = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 18:
                    hr3Var.b = (CharSequence) nw2Var.get(0);
                    return;
                case 4:
                case 19:
                    hr3Var.d = (CharSequence) nw2Var.get(0);
                    return;
                case 5:
                case 20:
                    hr3Var.B = (CharSequence) nw2Var.get(0);
                    return;
                case 6:
                case 22:
                    String str3 = (String) nw2Var.get(0);
                    String str4 = eq6.a;
                    String[] split = str3.split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    }
                    hr3Var.o = Integer.valueOf(parseInt3);
                    hr3Var.p = num;
                    return;
                case 7:
                case 17:
                    hr3Var.a = (CharSequence) nw2Var.get(0);
                    return;
                case '\b':
                case 16:
                    hr3Var.z = (CharSequence) nw2Var.get(0);
                    return;
                case '\t':
                case 24:
                    hr3Var.t = Integer.valueOf(Integer.parseInt((String) nw2Var.get(0)));
                    return;
                case '\f':
                    Integer N = jf7.N((String) nw2Var.get(0));
                    if (N == null) {
                        hr3Var.F = (CharSequence) nw2Var.get(0);
                        return;
                    }
                    String a = hu2.a(N.intValue());
                    if (a != null) {
                        hr3Var.F = a;
                        return;
                    }
                    return;
                case 14:
                    ArrayList d = d((String) nw2Var.get(0));
                    int size = d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                hr3Var.v = (Integer) d.get(2);
                            } else {
                                return;
                            }
                        }
                        hr3Var.u = (Integer) d.get(1);
                    }
                    hr3Var.t = (Integer) d.get(0);
                    return;
                case 15:
                    ArrayList d2 = d((String) nw2Var.get(0));
                    int size2 = d2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                hr3Var.y = (Integer) d2.get(2);
                            } else {
                                return;
                            }
                        }
                        hr3Var.x = (Integer) d2.get(1);
                    }
                    hr3Var.w = (Integer) d2.get(0);
                    return;
                case 21:
                    String str5 = (String) nw2Var.get(0);
                    String str6 = eq6.a;
                    String[] split2 = str5.split("/", -1);
                    int parseInt4 = Integer.parseInt(split2[0]);
                    if (split2.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split2[1]));
                    }
                    hr3Var.D = Integer.valueOf(parseInt4);
                    hr3Var.E = num;
                    return;
                case 23:
                    hr3Var.C = (CharSequence) nw2Var.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && rc6.class == obj.getClass()) {
                rc6 rc6Var = (rc6) obj;
                if (this.a.equals(rc6Var.a) && Objects.equals(this.b, rc6Var.b) && this.c.equals(rc6Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = zo5.i(this.a, 527, 31);
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + ((i2 + i) * 31);
    }

    @Override // defpackage.gu2
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
