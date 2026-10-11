package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zw6 implements ey3 {
    public final String a;
    public final String b;

    public zw6(String str, String str2) {
        this.a = wc7.V(str);
        this.b = str2;
    }

    @Override // defpackage.ey3
    public final void b(hr3 hr3Var) {
        String str = this.a;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    c = 0;
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    c = 1;
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    c = 2;
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 3;
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    c = 4;
                    break;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 5;
                    break;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 6;
                    break;
                }
                break;
            case 905239725:
                if (str.equals("DISCSUBTITLE")) {
                    c = 7;
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    c = '\b';
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = '\t';
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = '\n';
                    break;
                }
                break;
        }
        String str2 = this.b;
        switch (c) {
            case 0:
                Integer N = jf7.N(str2);
                if (N != null) {
                    hr3Var.p = N;
                    return;
                }
                return;
            case 1:
                Integer N2 = jf7.N(str2);
                if (N2 != null) {
                    hr3Var.E = N2;
                    return;
                }
                return;
            case 2:
                Integer N3 = jf7.N(str2);
                if (N3 != null) {
                    hr3Var.o = N3;
                    return;
                }
                return;
            case 3:
                hr3Var.c = str2;
                return;
            case 4:
                hr3Var.F = str2;
                return;
            case 5:
                hr3Var.a = str2;
                return;
            case 6:
                hr3Var.g = str2;
                return;
            case 7:
                hr3Var.C = str2;
                return;
            case '\b':
                Integer N4 = jf7.N(str2);
                if (N4 != null) {
                    hr3Var.D = N4;
                    return;
                }
                return;
            case '\t':
                hr3Var.d = str2;
                return;
            case '\n':
                hr3Var.b = str2;
                return;
            default:
                return;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zw6.class == obj.getClass()) {
            zw6 zw6Var = (zw6) obj;
            if (this.a.equals(zw6Var.a) && this.b.equals(zw6Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + zo5.i(this.a, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
