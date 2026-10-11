package defpackage;

import com.anistation.model.animelist.AnimeListImportProvider;
import com.anistation.model.animelist.WatchStatus;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class hi0 implements ub2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ hi0(byte b) {
        this.x = b;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        int i;
        boolean z;
        Integer J;
        int intValue;
        byte b = this.x;
        za3 za3Var = null;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ki0 ki0Var = (ki0) obj;
                ki0Var.getClass();
                return ki0Var.a.c;
            case 1:
                ki0 ki0Var2 = (ki0) obj;
                ki0Var2.getClass();
                return Long.valueOf(ki0Var2.a.a);
            case 2:
                ki0 ki0Var3 = (ki0) obj;
                ki0Var3.getClass();
                return Long.valueOf(ki0Var3.a.a);
            case 3:
                ki0 ki0Var4 = (ki0) obj;
                ki0Var4.getClass();
                return Integer.valueOf(ki0Var4.b);
            case 4:
                String str = (String) obj;
                str.getClass();
                int length = str.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    if (!z2) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    char charAt = str.charAt(i);
                    if (charAt != ' ' && charAt != '\t') {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z2) {
                        if (!z) {
                            z2 = true;
                        } else {
                            i2++;
                        }
                    } else if (z) {
                        length--;
                    } else {
                        return str.subSequence(i2, length + 1).toString();
                    }
                }
                return str.subSequence(i2, length + 1).toString();
            case 5:
                String str2 = (String) obj;
                str2.getClass();
                return b06.G(b06.G(b06.G(str2, "&", "&amp;"), "<", "&lt;"), ">", "&gt;");
            case 6:
                do3 do3Var = (do3) obj;
                do3Var.getClass();
                String str3 = (String) ((bo3) do3Var.a()).get(1);
                String str4 = (String) mi0.e.get(str3);
                if (str4 == null) {
                    if (b06.I(str3, "#x", true)) {
                        J = b06.J(16, str3.substring(2));
                    } else {
                        J = b06.J(10, str3.substring(1));
                    }
                    if (J != null && Character.isValidCodePoint(J.intValue()) && (55296 > (intValue = J.intValue()) || intValue >= 57344)) {
                        char[] chars = Character.toChars(J.intValue());
                        chars.getClass();
                        return new String(chars);
                    }
                    return "�";
                }
                return str4;
            case 7:
                xq2 xq2Var = (xq2) obj;
                xq2Var.getClass();
                return Integer.valueOf(xq2Var.a.length());
            case 8:
                ((qq5) obj).getClass();
                return pn6Var;
            case 9:
                ((Integer) obj).getClass();
                return pn6Var;
            case 10:
                ((String) obj).getClass();
                return pn6Var;
            case 11:
                ((AnimeListImportProvider) obj).getClass();
                return pn6Var;
            case 12:
                ((WatchStatus) obj).getClass();
                return pn6Var;
            case 13:
                return pn6Var;
            case 14:
                ((kk1) obj).getClass();
                return pn6Var;
            case 15:
                ((String) obj).getClass();
                return pn6Var;
            case 16:
                ((String) obj).getClass();
                return pn6Var;
            case 17:
                ((kk1) obj).getClass();
                return pn6Var;
            case 18:
                ((String) obj).getClass();
                return pn6Var;
            case 19:
                ((String) obj).getClass();
                return pn6Var;
            case 20:
                ((Float) obj).getClass();
                return pn6Var;
            case 21:
                ((String) obj).getClass();
                return pn6Var;
            case 22:
                ((String) obj).getClass();
                return pn6Var;
            case 23:
                ((Long) obj).getClass();
                return pn6Var;
            case 24:
                tt0 tt0Var = (tt0) obj;
                if (tt0Var instanceof za3) {
                    za3Var = (za3) tt0Var;
                }
                if (za3Var != null && za3Var.n0) {
                    ez2.b("Apply is called on deactivated node " + tt0Var);
                }
                return pn6Var;
            case 25:
                return Boolean.valueOf(!(((wz3) obj) instanceof zt0));
            case 26:
                ai4 ai4Var = (ai4) obj;
                ai4Var.getClass();
                return Integer.valueOf(((String) ai4Var.x).length());
            case 27:
                cn0 cn0Var = (cn0) obj;
                cn0Var.getClass();
                ty0 ty0Var = (ty0) cn0Var.b;
                ArrayList arrayList = ty0Var.b;
                Set set = ty0Var.a;
                cn0Var.a(l68.R, new vy0(cn0Var, null, arrayList, set));
                cn0Var.a(p7.U, new wy0(cn0Var, null, arrayList, set));
                return pn6Var;
            case 28:
                sy0 sy0Var = (sy0) obj;
                sy0Var.getClass();
                return sy0Var.a.toString();
            default:
                String str5 = (String) obj;
                str5.getClass();
                return m37.F(str5);
        }
    }
}
