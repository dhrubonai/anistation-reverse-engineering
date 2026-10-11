package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ko7 implements rx7 {
    public final /* synthetic */ sp7 a;

    public ko7(sp7 sp7Var) {
        this.a = sp7Var;
    }

    @Override // defpackage.rx7
    public final String a() {
        sn7 sn7Var = new sn7();
        sp7 sp7Var = this.a;
        sp7Var.a(new ap7(sp7Var, sn7Var, (byte) 3, false));
        return (String) sn7.K(sn7Var.b(500L), String.class);
    }

    @Override // defpackage.rx7
    public final String b() {
        sn7 sn7Var = new sn7();
        sp7 sp7Var = this.a;
        sp7Var.a(new ap7(sp7Var, sn7Var, (byte) 4, false));
        return (String) sn7.K(sn7Var.b(500L), String.class);
    }

    @Override // defpackage.rx7
    public final void c(Bundle bundle) {
        sp7 sp7Var = this.a;
        sp7Var.a(new uo7(sp7Var, bundle, (byte) 0));
    }

    @Override // defpackage.rx7
    public final void d(String str) {
        sp7 sp7Var = this.a;
        sp7Var.a(new yo7(sp7Var, str, (byte) 1));
    }

    @Override // defpackage.rx7
    public final void e(String str, String str2, Bundle bundle) {
        sp7 sp7Var = this.a;
        sp7Var.a(new vo7(sp7Var, str, str2, bundle, (byte) 1));
    }

    @Override // defpackage.rx7
    public final void f(String str) {
        sp7 sp7Var = this.a;
        sp7Var.a(new yo7(sp7Var, str, (byte) 0));
    }

    @Override // defpackage.rx7
    public final long g() {
        return this.a.d();
    }

    @Override // defpackage.rx7
    public final void h(String str, String str2, Bundle bundle) {
        sp7 sp7Var = this.a;
        sp7Var.a(new vo7(sp7Var, str, str2, bundle, (byte) 0));
    }

    @Override // defpackage.rx7
    public final List i(String str, String str2) {
        sn7 sn7Var = new sn7();
        sp7 sp7Var = this.a;
        sp7Var.a(new wo7(sp7Var, str, str2, sn7Var));
        List list = (List) sn7.K(sn7Var.b(5000L), List.class);
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }

    @Override // defpackage.rx7
    public final int j(String str) {
        sn7 sn7Var = new sn7();
        sp7 sp7Var = this.a;
        sp7Var.a(new xo7(sp7Var, str, sn7Var, (byte) 1));
        Integer num = (Integer) sn7.K(sn7Var.b(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // defpackage.rx7
    public final String k() {
        sn7 sn7Var = new sn7();
        sp7 sp7Var = this.a;
        sp7Var.a(new ap7(sp7Var, sn7Var, (byte) 1));
        return (String) sn7.K(sn7Var.b(50L), String.class);
    }

    @Override // defpackage.rx7
    public final String l() {
        sn7 sn7Var = new sn7();
        sp7 sp7Var = this.a;
        sp7Var.a(new ap7(sp7Var, sn7Var, (byte) 0));
        return (String) sn7.K(sn7Var.b(500L), String.class);
    }

    @Override // defpackage.rx7
    public final Map m(String str, String str2, boolean z) {
        sn7 sn7Var = new sn7();
        sp7 sp7Var = this.a;
        sp7Var.a(new bp7(sp7Var, str, str2, z, sn7Var));
        Bundle b = sn7Var.b(5000L);
        if (b != null && b.size() != 0) {
            HashMap hashMap = new HashMap(b.size());
            for (String str3 : b.keySet()) {
                Object obj = b.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.EMPTY_MAP;
    }
}
