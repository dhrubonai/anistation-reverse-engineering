package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.as0;
import defpackage.bb4;
import defpackage.ir0;
import defpackage.jr0;
import defpackage.kr0;
import defpackage.n32;
import defpackage.pk2;
import defpackage.px4;
import defpackage.q32;
import defpackage.qk2;
import defpackage.r32;
import defpackage.v71;
import defpackage.vz;
import defpackage.z60;
import defpackage.zd1;
import defpackage.zi5;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static r32 lambda$getComponents$0(as0 as0Var) {
        return new q32((n32) as0Var.b(n32.class), as0Var.f(qk2.class), (ExecutorService) as0Var.l(new px4(vz.class, ExecutorService.class)), new zi5((Executor) as0Var.l(new px4(z60.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kr0> getComponents() {
        jr0 jr0Var = new jr0(r32.class, new Class[0]);
        jr0Var.a = LIBRARY_NAME;
        jr0Var.a(zd1.a(n32.class));
        jr0Var.a(new zd1(0, 1, qk2.class));
        jr0Var.a(new zd1(new px4(vz.class, ExecutorService.class), 1, 0));
        jr0Var.a(new zd1(new px4(z60.class, Executor.class), 1, 0));
        jr0Var.f = new v71((byte) 27);
        kr0 b = jr0Var.b();
        pk2 pk2Var = new pk2((byte) 0);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(px4.a(pk2.class));
        return Arrays.asList(b, new kr0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new ir0(pk2Var, (byte) 0), hashSet3), bb4.t(LIBRARY_NAME, "19.1.2"));
    }
}
