package defpackage;

import android.os.Bundle;
import java.util.HashSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bt3 {
    public static final mk5 f;
    public static final mk5 g;
    public static final go4 h;
    public static final go4 i;
    public final mk5 a;
    public final go4 b;
    public final nw2 c;
    public final nw2 d;
    public final Bundle e;

    static {
        int i2;
        HashSet hashSet = new HashSet();
        o15 o15Var = lk5.d;
        int i3 = 0;
        while (true) {
            int size = o15Var.size();
            i2 = o15Var.A;
            if (i3 >= size) {
                break;
            }
            hashSet.add(new lk5(((Integer) o15Var.get(i3)).intValue()));
            i3++;
        }
        o15 o15Var2 = lk5.e;
        for (int i4 = 0; i4 < o15Var2.size(); i4++) {
            hashSet.add(new lk5(((Integer) o15Var2.get(i4)).intValue()));
        }
        f = new mk5(hashSet);
        HashSet hashSet2 = new HashSet();
        for (int i5 = 0; i5 < i2; i5++) {
            hashSet2.add(new lk5(((Integer) o15Var.get(i5)).intValue()));
        }
        g = new mk5(hashSet2);
        eo3 eo3Var = new eo3((byte) 15);
        o15 o15Var3 = lk5.f;
        eo3Var.k(o15Var3);
        eo3Var.k(lk5.g);
        eo3Var.k(lk5.d);
        eo3Var.k(lk5.e);
        new mk5((HashSet) eo3Var.y);
        HashSet hashSet3 = new HashSet();
        for (int i6 = 0; i6 < o15Var3.A; i6++) {
            hashSet3.add(new lk5(((Integer) o15Var3.get(i6)).intValue()));
        }
        for (int i7 = 0; i7 < i2; i7++) {
            hashSet3.add(new lk5(((Integer) o15Var.get(i7)).intValue()));
        }
        new mk5(hashSet3);
        fo4 fo4Var = new fo4();
        g42 g42Var = fo4.b;
        mn0 mn0Var = fo4Var.a;
        mn0Var.b(g42Var);
        mn0Var.b(fo4.c);
        h = fo4Var.b();
        fo4 fo4Var2 = new fo4();
        fo4Var2.a.b(g42Var);
        i = fo4Var2.b();
    }

    public bt3(mk5 mk5Var, go4 go4Var, nw2 nw2Var, nw2 nw2Var2, Bundle bundle) {
        this.a = mk5Var;
        this.b = go4Var;
        this.c = nw2Var;
        this.d = nw2Var2;
        this.e = bundle;
    }
}
