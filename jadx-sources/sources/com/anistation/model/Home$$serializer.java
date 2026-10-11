package com.anistation.model;

import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.kq4;
import defpackage.l61;
import defpackage.ne1;
import defpackage.qi2;
import defpackage.rb3;
import defpackage.t80;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class Home$$serializer implements wd2 {
    public static final Home$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        Home$$serializer home$$serializer = new Home$$serializer();
        INSTANCE = home$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.Home", home$$serializer, 4);
        kq4Var.j("recent", false);
        kq4Var.j("trending", false);
        kq4Var.j("popular", false);
        kq4Var.j("top10", false);
        descriptor = kq4Var;
    }

    private Home$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr;
        rb3VarArr = Home.$childSerializers;
        return new x73[]{rb3VarArr[0].getValue(), rb3VarArr[1].getValue(), rb3VarArr[2].getValue(), rb3VarArr[3].getValue()};
    }

    @Override // defpackage.ne1
    public final Home deserialize(l61 l61Var) {
        rb3[] rb3VarArr;
        List list;
        List list2;
        int i;
        List list3;
        List list4;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3VarArr = Home.$childSerializers;
        if (c.decodeSequentially()) {
            List list5 = (List) c.p(aj5Var, 0, (ne1) rb3VarArr[0].getValue(), null);
            List list6 = (List) c.p(aj5Var, 1, (ne1) rb3VarArr[1].getValue(), null);
            List list7 = (List) c.p(aj5Var, 2, (ne1) rb3VarArr[2].getValue(), null);
            list = (List) c.p(aj5Var, 3, (ne1) rb3VarArr[3].getValue(), null);
            list2 = list5;
            i = 15;
            list3 = list7;
            list4 = list6;
        } else {
            boolean z = true;
            int i2 = 0;
            List list8 = null;
            List list9 = null;
            List list10 = null;
            List list11 = null;
            while (z) {
                int i3 = c.i(aj5Var);
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 == 3) {
                                    list8 = (List) c.p(aj5Var, 3, (ne1) rb3VarArr[3].getValue(), list8);
                                    i2 |= 8;
                                } else {
                                    qi2.f(i3);
                                    return null;
                                }
                            } else {
                                list10 = (List) c.p(aj5Var, 2, (ne1) rb3VarArr[2].getValue(), list10);
                                i2 |= 4;
                            }
                        } else {
                            list11 = (List) c.p(aj5Var, 1, (ne1) rb3VarArr[1].getValue(), list11);
                            i2 |= 2;
                        }
                    } else {
                        list9 = (List) c.p(aj5Var, 0, (ne1) rb3VarArr[0].getValue(), list9);
                        i2 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            list = list8;
            list2 = list9;
            i = i2;
            list3 = list10;
            list4 = list11;
        }
        c.a(aj5Var);
        return new Home(i, list2, list4, list3, list, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Home home) {
        wt1Var.getClass();
        home.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        Home.write$Self$AniStation_core_model(home, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
