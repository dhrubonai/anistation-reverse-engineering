package com.anistation.model.watch;

import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.jb0;
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
public final /* synthetic */ class Server$$serializer implements wd2 {
    public static final Server$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        Server$$serializer server$$serializer = new Server$$serializer();
        INSTANCE = server$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.watch.Server", server$$serializer, 2);
        kq4Var.j("sub", false);
        kq4Var.j("dub", false);
        descriptor = kq4Var;
    }

    private Server$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        rb3[] rb3VarArr;
        rb3VarArr = Server.$childSerializers;
        return new x73[]{jb0.a((x73) rb3VarArr[0].getValue()), jb0.a((x73) rb3VarArr[1].getValue())};
    }

    @Override // defpackage.ne1
    public final Server deserialize(l61 l61Var) {
        rb3[] rb3VarArr;
        List list;
        List list2;
        int i;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        rb3VarArr = Server.$childSerializers;
        if (c.decodeSequentially()) {
            list2 = (List) c.decodeNullableSerializableElement(aj5Var, 0, (ne1) rb3VarArr[0].getValue(), null);
            list = (List) c.decodeNullableSerializableElement(aj5Var, 1, (ne1) rb3VarArr[1].getValue(), null);
            i = 3;
        } else {
            boolean z = true;
            int i2 = 0;
            List list3 = null;
            List list4 = null;
            while (z) {
                int i3 = c.i(aj5Var);
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            list3 = (List) c.decodeNullableSerializableElement(aj5Var, 1, (ne1) rb3VarArr[1].getValue(), list3);
                            i2 |= 2;
                        } else {
                            qi2.f(i3);
                            return null;
                        }
                    } else {
                        list4 = (List) c.decodeNullableSerializableElement(aj5Var, 0, (ne1) rb3VarArr[0].getValue(), list4);
                        i2 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            list = list3;
            list2 = list4;
            i = i2;
        }
        c.a(aj5Var);
        return new Server(i, list2, list, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, Server server) {
        wt1Var.getClass();
        server.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        Server.write$Self$AniStation_core_model(server, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
