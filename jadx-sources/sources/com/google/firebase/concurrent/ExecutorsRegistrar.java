package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.bh3;
import defpackage.bn6;
import defpackage.js0;
import defpackage.kr0;
import defpackage.px4;
import defpackage.qb3;
import defpackage.v71;
import defpackage.v94;
import defpackage.vz;
import defpackage.z60;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final qb3 a = new qb3(new js0((byte) 1));
    public static final qb3 b = new qb3(new js0((byte) 2));
    public static final qb3 c = new qb3(new js0((byte) 3));
    public static final qb3 d = new qb3(new js0((byte) 4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        px4 px4Var = new px4(vz.class, ScheduledExecutorService.class);
        px4[] px4VarArr = {new px4(vz.class, ExecutorService.class), new px4(vz.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(px4Var);
        for (int i = 0; i < 2; i++) {
            v94.l(px4VarArr[i], "Null interface");
        }
        Collections.addAll(hashSet, px4VarArr);
        kr0 kr0Var = new kr0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new v71((byte) 16), hashSet3);
        px4 px4Var2 = new px4(z60.class, ScheduledExecutorService.class);
        px4[] px4VarArr2 = {new px4(z60.class, ExecutorService.class), new px4(z60.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(px4Var2);
        for (int i2 = 0; i2 < 2; i2++) {
            v94.l(px4VarArr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, px4VarArr2);
        kr0 kr0Var2 = new kr0(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new v71((byte) 17), hashSet6);
        px4 px4Var3 = new px4(bh3.class, ScheduledExecutorService.class);
        px4[] px4VarArr3 = {new px4(bh3.class, ExecutorService.class), new px4(bh3.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(px4Var3);
        for (int i3 = 0; i3 < 2; i3++) {
            v94.l(px4VarArr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, px4VarArr3);
        kr0 kr0Var3 = new kr0(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new v71((byte) 18), hashSet9);
        px4 px4Var4 = new px4(bn6.class, Executor.class);
        px4[] px4VarArr4 = new px4[0];
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(px4Var4);
        for (px4 px4Var5 : px4VarArr4) {
            v94.l(px4Var5, "Null interface");
        }
        Collections.addAll(hashSet10, px4VarArr4);
        return Arrays.asList(kr0Var, kr0Var2, kr0Var3, new kr0(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, new v71((byte) 19), hashSet12));
    }
}
