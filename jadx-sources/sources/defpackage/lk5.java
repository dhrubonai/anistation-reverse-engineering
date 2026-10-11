package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lk5 {
    public static final o15 d;
    public static final o15 e;
    public static final o15 f;
    public static final o15 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        z62 z62Var = nw2.y;
        o15 o15Var = o15.B;
        d = o15Var;
        e = nw2.s(40010);
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        jf7.p(objArr, 7);
        f = nw2.j(objArr, 7);
        g = o15Var;
        String str = eq6.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
    }

    public lk5(int i2) {
        boolean z;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        io3.m("commandCode shouldn't be COMMAND_CODE_CUSTOM", z);
        this.a = i2;
        this.b = "";
        this.c = Bundle.EMPTY;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(h, this.a);
        bundle.putString(i, this.b);
        bundle.putBundle(j, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lk5) {
            lk5 lk5Var = (lk5) obj;
            if (this.a == lk5Var.a && TextUtils.equals(this.b, lk5Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a));
    }

    public lk5(Bundle bundle, String str) {
        this.a = 0;
        this.b = str;
        bundle.getClass();
        this.c = new Bundle(bundle);
    }
}
