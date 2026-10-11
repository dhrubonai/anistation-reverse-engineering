package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.bh3;
import defpackage.bn6;
import defpackage.kr0;
import defpackage.l68;
import defpackage.n11;
import defpackage.nr1;
import defpackage.p7;
import defpackage.pk2;
import defpackage.px4;
import defpackage.te4;
import defpackage.v94;
import defpackage.vz;
import defpackage.z60;
import defpackage.zd1;
import defpackage.ze0;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<kr0> getComponents() {
        px4 px4Var = new px4(vz.class, n11.class);
        px4[] px4VarArr = new px4[0];
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(px4Var);
        for (px4 px4Var2 : px4VarArr) {
            v94.l(px4Var2, "Null interface");
        }
        Collections.addAll(hashSet, px4VarArr);
        zd1 zd1Var = new zd1(new px4(vz.class, Executor.class), 1, 0);
        if (!hashSet.contains(zd1Var.a)) {
            hashSet2.add(zd1Var);
            kr0 kr0Var = new kr0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, l68.D, hashSet3);
            px4 px4Var3 = new px4(bh3.class, n11.class);
            px4[] px4VarArr2 = new px4[0];
            HashSet hashSet4 = new HashSet();
            HashSet hashSet5 = new HashSet();
            HashSet hashSet6 = new HashSet();
            hashSet4.add(px4Var3);
            for (px4 px4Var4 : px4VarArr2) {
                v94.l(px4Var4, "Null interface");
            }
            Collections.addAll(hashSet4, px4VarArr2);
            zd1 zd1Var2 = new zd1(new px4(bh3.class, Executor.class), 1, 0);
            if (!hashSet4.contains(zd1Var2.a)) {
                hashSet5.add(zd1Var2);
                kr0 kr0Var2 = new kr0(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, p7.J, hashSet6);
                px4 px4Var5 = new px4(z60.class, n11.class);
                px4[] px4VarArr3 = new px4[0];
                HashSet hashSet7 = new HashSet();
                HashSet hashSet8 = new HashSet();
                HashSet hashSet9 = new HashSet();
                hashSet7.add(px4Var5);
                for (px4 px4Var6 : px4VarArr3) {
                    v94.l(px4Var6, "Null interface");
                }
                Collections.addAll(hashSet7, px4VarArr3);
                zd1 zd1Var3 = new zd1(new px4(z60.class, Executor.class), 1, 0);
                if (!hashSet7.contains(zd1Var3.a)) {
                    hashSet8.add(zd1Var3);
                    kr0 kr0Var3 = new kr0(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, nr1.H, hashSet9);
                    px4 px4Var7 = new px4(bn6.class, n11.class);
                    px4[] px4VarArr4 = new px4[0];
                    HashSet hashSet10 = new HashSet();
                    HashSet hashSet11 = new HashSet();
                    HashSet hashSet12 = new HashSet();
                    hashSet10.add(px4Var7);
                    for (px4 px4Var8 : px4VarArr4) {
                        v94.l(px4Var8, "Null interface");
                    }
                    Collections.addAll(hashSet10, px4VarArr4);
                    zd1 zd1Var4 = new zd1(new px4(bn6.class, Executor.class), 1, 0);
                    if (!hashSet10.contains(zd1Var4.a)) {
                        hashSet11.add(zd1Var4);
                        return te4.I(kr0Var, kr0Var2, kr0Var3, new kr0(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, pk2.X, hashSet12));
                    }
                    ze0.k("Components are not allowed to depend on interfaces they themselves provide.");
                    return null;
                }
                ze0.k("Components are not allowed to depend on interfaces they themselves provide.");
                return null;
            }
            ze0.k("Components are not allowed to depend on interfaces they themselves provide.");
            return null;
        }
        ze0.k("Components are not allowed to depend on interfaces they themselves provide.");
        return null;
    }
}
