package defpackage;

import android.os.Parcel;
import java.util.Collection;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ht7 implements g25 {
    public Object x;
    public Object y;

    public /* synthetic */ ht7(Object obj, Object obj2) {
        this.x = obj2;
        this.y = obj;
    }

    public String a() {
        boolean z;
        StringBuilder sb = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) this.x;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (upperCase.matches("[A-F0-9]+")) {
                sb.append("/");
                sb.append(upperCase);
            } else {
                ze0.k("Invalid application ID: ".concat(str));
                return null;
            }
        }
        Collection<String> collection = (Collection) this.y;
        boolean z2 = false;
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (str == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (str == null) {
                    sb.append("/");
                }
                sb.append("/");
                boolean z3 = true;
                for (String str2 : collection) {
                    qi0.b(str2);
                    if (!z3) {
                        sb.append(",");
                    }
                    if (!qi0.a.matcher(str2).matches()) {
                        StringBuilder sb2 = new StringBuilder(str2.length());
                        for (int i = 0; i < str2.length(); i++) {
                            char charAt = str2.charAt(i);
                            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-' && charAt != '.' && charAt != ':'))) {
                                sb2.append(String.format("%%%04x", Integer.valueOf(charAt)));
                            } else {
                                sb2.append(charAt);
                            }
                        }
                        str2 = sb2.toString();
                    }
                    sb.append(str2);
                    z3 = false;
                }
                z2 = z;
            } else {
                ze0.k("Must specify at least one namespace");
                return null;
            }
        } else if (str != null) {
            z2 = true;
        }
        if (true != z2 && collection == null) {
            sb.append("/");
        }
        if (collection == null) {
            sb.append("/");
        }
        sb.append("//ALLOW_IPV6");
        return sb.toString();
    }

    @Override // defpackage.g25
    public void accept(Object obj, Object obj2) {
        int i = ww7.k;
        kw7 kw7Var = new kw7((p76) obj2);
        xw7 xw7Var = (xw7) ((yw7) obj).m();
        String[] strArr = (String[]) this.y;
        String str = (String) this.x;
        Parcel K = xw7Var.K();
        tm7.c(K, kw7Var);
        K.writeString(str);
        K.writeInt(0);
        K.writeStringArray(strArr);
        K.writeByteArray(null);
        xw7Var.M(K, 1);
    }

    public /* synthetic */ ht7(Object obj, String str) {
        this.x = str;
        this.y = obj;
    }
}
