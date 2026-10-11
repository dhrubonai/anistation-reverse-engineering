package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rx1 {
    public static final rx1 b = new rx1(new wi6((j12) null, (hr5) null, (ij0) null, (ya5) null, (LinkedHashMap) null, 127));
    public static final rx1 c = new rx1(new wi6((j12) null, (hr5) null, (ij0) null, (ya5) null, (LinkedHashMap) null, 95));
    public final wi6 a;

    public rx1(wi6 wi6Var) {
        this.a = wi6Var;
    }

    public final rx1 a(rx1 rx1Var) {
        boolean z;
        wi6 wi6Var = rx1Var.a;
        j12 j12Var = wi6Var.a;
        wi6 wi6Var2 = this.a;
        if (j12Var == null) {
            j12Var = wi6Var2.a;
        }
        hr5 hr5Var = wi6Var.b;
        if (hr5Var == null) {
            hr5Var = wi6Var2.b;
        }
        ij0 ij0Var = wi6Var.c;
        if (ij0Var == null) {
            ij0Var = wi6Var2.c;
        }
        ya5 ya5Var = wi6Var.d;
        if (ya5Var == null) {
            ya5Var = wi6Var2.d;
        }
        if (!wi6Var.e && !wi6Var2.e) {
            z = false;
        } else {
            z = true;
        }
        return new rx1(new wi6(j12Var, hr5Var, ij0Var, ya5Var, z, vn3.V(wi6Var2.f, wi6Var.f)));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof rx1) && ((rx1) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        wi6 wi6Var = this.a;
        j12 j12Var = wi6Var.a;
        String str4 = null;
        if (j12Var != null) {
            str = j12Var.toString();
        } else {
            str = null;
        }
        hr5 hr5Var = wi6Var.b;
        if (hr5Var != null) {
            str2 = hr5Var.toString();
        } else {
            str2 = null;
        }
        ij0 ij0Var = wi6Var.c;
        if (ij0Var != null) {
            str3 = ij0Var.toString();
        } else {
            str3 = null;
        }
        ya5 ya5Var = wi6Var.d;
        if (ya5Var != null) {
            str4 = ya5Var.toString();
        }
        boolean z = wi6Var.e;
        StringBuilder o = h11.o("ExitTransition:  Fade - ", str, ",  Slide - ", str2, ",  Shrink - ");
        qx1.x(o, str3, ",  Scale - ", str4, ",  Veil - null,  KeepUntilTransitionsFinished - ");
        o.append(z);
        return o.toString();
    }
}
