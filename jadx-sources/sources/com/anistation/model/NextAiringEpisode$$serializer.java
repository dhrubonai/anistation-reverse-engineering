package com.anistation.model;

import defpackage.aj5;
import defpackage.de1;
import defpackage.gu0;
import defpackage.hu0;
import defpackage.i13;
import defpackage.jb0;
import defpackage.kq4;
import defpackage.l61;
import defpackage.qi2;
import defpackage.ql3;
import defpackage.t80;
import defpackage.wd2;
import defpackage.wt1;
import defpackage.x73;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@de1
/* loaded from: classes.dex */
public final /* synthetic */ class NextAiringEpisode$$serializer implements wd2 {
    public static final NextAiringEpisode$$serializer INSTANCE;
    private static final aj5 descriptor;

    static {
        NextAiringEpisode$$serializer nextAiringEpisode$$serializer = new NextAiringEpisode$$serializer();
        INSTANCE = nextAiringEpisode$$serializer;
        kq4 kq4Var = new kq4("com.anistation.model.NextAiringEpisode", nextAiringEpisode$$serializer, 3);
        kq4Var.j("episodeNumber", false);
        kq4Var.j("airingAt", false);
        kq4Var.j("timeUntilAiring", false);
        descriptor = kq4Var;
    }

    private NextAiringEpisode$$serializer() {
    }

    @Override // defpackage.wd2
    public final x73[] childSerializers() {
        x73 a = jb0.a(i13.a);
        ql3 ql3Var = ql3.a;
        return new x73[]{a, jb0.a(ql3Var), jb0.a(ql3Var)};
    }

    @Override // defpackage.ne1
    public final NextAiringEpisode deserialize(l61 l61Var) {
        Integer num;
        Long l;
        Long l2;
        int i;
        l61Var.getClass();
        aj5 aj5Var = descriptor;
        gu0 c = l61Var.c(aj5Var);
        if (c.decodeSequentially()) {
            num = (Integer) c.decodeNullableSerializableElement(aj5Var, 0, i13.a, null);
            ql3 ql3Var = ql3.a;
            Long l3 = (Long) c.decodeNullableSerializableElement(aj5Var, 1, ql3Var, null);
            l = (Long) c.decodeNullableSerializableElement(aj5Var, 2, ql3Var, null);
            l2 = l3;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            num = null;
            Long l4 = null;
            Long l5 = null;
            while (z) {
                int i3 = c.i(aj5Var);
                if (i3 != -1) {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                l4 = (Long) c.decodeNullableSerializableElement(aj5Var, 2, ql3.a, l4);
                                i2 |= 4;
                            } else {
                                qi2.f(i3);
                                return null;
                            }
                        } else {
                            l5 = (Long) c.decodeNullableSerializableElement(aj5Var, 1, ql3.a, l5);
                            i2 |= 2;
                        }
                    } else {
                        num = (Integer) c.decodeNullableSerializableElement(aj5Var, 0, i13.a, num);
                        i2 |= 1;
                    }
                } else {
                    z = false;
                }
            }
            l = l4;
            l2 = l5;
            i = i2;
        }
        Integer num2 = num;
        c.a(aj5Var);
        return new NextAiringEpisode(i, num2, l2, l, null);
    }

    @Override // defpackage.mj5, defpackage.ne1
    public final aj5 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.mj5
    public final void serialize(wt1 wt1Var, NextAiringEpisode nextAiringEpisode) {
        wt1Var.getClass();
        nextAiringEpisode.getClass();
        aj5 aj5Var = descriptor;
        hu0 c = wt1Var.c(aj5Var);
        NextAiringEpisode.write$Self$AniStation_core_model(nextAiringEpisode, c, aj5Var);
        c.a(aj5Var);
    }

    @Override // defpackage.wd2
    public /* bridge */ x73[] typeParametersSerializers() {
        return t80.e;
    }
}
