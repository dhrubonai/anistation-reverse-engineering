package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bb4;
import defpackage.cy;
import defpackage.e93;
import defpackage.h5;
import defpackage.jr0;
import defpackage.kr0;
import defpackage.n32;
import defpackage.pk2;
import defpackage.px4;
import defpackage.qk2;
import defpackage.rk2;
import defpackage.sb1;
import defpackage.v71;
import defpackage.v94;
import defpackage.vz;
import defpackage.w81;
import defpackage.zd1;
import defpackage.ze0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(px4.a(sb1.class));
        for (Class cls : new Class[0]) {
            v94.l(cls, "Null interface");
            hashSet.add(px4.a(cls));
        }
        zd1 zd1Var = new zd1(2, 0, cy.class);
        String str = null;
        if (!hashSet.contains(zd1Var.a)) {
            hashSet2.add(zd1Var);
            arrayList.add(new kr0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new v71((byte) 6), hashSet3));
            px4 px4Var = new px4(vz.class, Executor.class);
            jr0 jr0Var = new jr0(w81.class, qk2.class, rk2.class);
            jr0Var.a(zd1.a(Context.class));
            jr0Var.a(zd1.a(n32.class));
            jr0Var.a(new zd1(2, 0, pk2.class));
            jr0Var.a(new zd1(1, 1, sb1.class));
            jr0Var.a(new zd1(px4Var, 1, 0));
            jr0Var.f = new h5((Object) px4Var, (byte) 11);
            arrayList.add(jr0Var.b());
            arrayList.add(bb4.t("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
            arrayList.add(bb4.t("fire-core", "22.2.1"));
            arrayList.add(bb4.t("device-name", a(Build.PRODUCT)));
            arrayList.add(bb4.t("device-model", a(Build.DEVICE)));
            arrayList.add(bb4.t("device-brand", a(Build.BRAND)));
            arrayList.add(bb4.B("android-target-sdk", new v71((byte) 23)));
            arrayList.add(bb4.B("android-min-sdk", new v71((byte) 24)));
            arrayList.add(bb4.B("android-platform", new v71((byte) 25)));
            arrayList.add(bb4.B("android-installer", new v71((byte) 26)));
            try {
                e93.y.getClass();
                str = "2.4.20";
            } catch (NoClassDefFoundError unused) {
            }
            if (str != null) {
                arrayList.add(bb4.t("kotlin", str));
            }
            return arrayList;
        }
        ze0.k("Components are not allowed to depend on interfaces they themselves provide.");
        return null;
    }
}
